import re
import sys
import os

SPECIFICATION_HEADER  = "-- specification"
STATE_HEADER          = "-> State:" 
LOOP_IDENTIFIER       = "-- Loop starts here"
STATE_HEADER_REGEX    = r"re.compile('-> State\: (\d+\.\d+) <-')"
DOT_EXE_RELATIVE_PATH = "dotBin/dot.exe"

class DOTNode(object):
    
    def __init__(self, stateText):
        stateLines      = stateText.splitlines()
        pattern         = re.compile( r'-> State\: (\d+\.\d+) <-' )
        stateIdentifier = pattern.match( stateLines[ 0 ]).groups()[0]
        self.stateLabel = 'state_' + stateIdentifier.replace( '.', '_' )
        
        htmlLabel  = "<"
        htmlLabel += stateIdentifier + "<br/>\n"
        for line in stateLines[ 1: ]:
            if LOOP_IDENTIFIER in line:
                continue
            htmlLabel += line + "<br/>\n"
        htmlLabel += ">"
        
        self.stateDOTText   = "%s [label=%s];" % ( self.stateLabel, htmlLabel )    
        self.nextStateLabel = None 

class SMVParser(object):
    def __init__(self, smvOutput):
        self.smvOutput = smvOutput

    def GetStatesText(self, specification):
        statesText      = specification.split( STATE_HEADER )
        statesText      = statesText[ 1: ]
        tempStatesTexts = []
        for stateText in statesText:
            tempStatesTexts.append( STATE_HEADER + stateText )
             
        return tempStatesTexts
    
    def FindLoopStart(self, statesText):
        for stateIdx in range(len( statesText)):
            stateText = statesText[ stateIdx ]
            if LOOP_IDENTIFIER in stateText:
                return stateIdx
        
        return 0

    
    def GenerateDOTNodes(self, statesText, loopStartStateIdx):
        dotNodes = []
        for stateText in statesText:
            dotNodes.append( DOTNode( stateText ) )
            
        for dotNodeIdx in range( len( dotNodes ) - 1 ):
            dotNode                = dotNodes[ dotNodeIdx ]
            dotNode.nextStateLabel = dotNodes[ dotNodeIdx + 1 ].stateLabel
            
        lastNode = dotNodes[ -1 ]
        lastNode.nextStateLabel = dotNodes[ loopStartStateIdx ].stateLabel
        
        return dotNodes
    
    def GenerateDOTText(self, stateDOTNodes, LTLSpec, LTLResult ):
        if LTLResult is True:
            dotText = 'digraph G  { rankdir=LR label="SPECIFICATION %s ==> is TRUE"\n' % LTLSpec
        else:
            dotText = 'digraph G  { rankdir=LR label="SPECIFICATION %s ==> is FALSE"\n' % LTLSpec
        for stateNode in stateDOTNodes:
            dotText += stateNode.stateDOTText + "\n"
            
        for stateNode in stateDOTNodes:
            edgeText = "%s->%s;" % ( stateNode.stateLabel, stateNode.nextStateLabel )
            dotText += edgeText + "\n"
            
        dotText += '}'
        
        return dotText
    

    def ExtractLTLSpec(self, specification):
        specification = SPECIFICATION_HEADER + specification
        specMatch     = re.compile( r'-- specification (.+) is (.+)' ).match( specification )
        LTLSpec       = specMatch.groups()[0]
        result        = ( specMatch.groups()[1] == 'true' )
        return LTLSpec, result

    

    
    
    def ParseCounterExamples(self):
        specsText      = self.smvOutput.split( SPECIFICATION_HEADER )
        specsText      = specsText[ 1: ]
        
        idx = 0
        for specification in specsText:
            idx            += 1
            LTLSpec, LTLResult = self.ExtractLTLSpec( specification )
            
            stateDOTNodes = []
            if LTLResult is False:
                statesText        = self.GetStatesText( specification )
                loopStartStateIdx = self.FindLoopStart( statesText )
                stateDOTNodes     = self.GenerateDOTNodes( statesText, loopStartStateIdx )
                
            dotText           = self.GenerateDOTText( stateDOTNodes, LTLSpec, LTLResult )
            
            dotFilePath    = "graph%d.dot" % ++idx
            graphImagePath = "graph%d.jpg" % idx
            with file( dotFilePath, 'w' ) as dotFile:
                dotFile.write( dotText )
                
            dotExePath = os.path.join( os.path.dirname( sys.argv[ 0 ] ), DOT_EXE_RELATIVE_PATH )
            os.system( dotExePath + " %s -Tjpg -o %s" % ( dotFilePath, graphImagePath ))
            
        


def main():
    filePath = r"C:\Users\Ofir\Documents\tau\winter-14\project\Modelling2014\Take2\NuSMVParser\out.txt"
    
    #filePath = sys.argv[1]
    with file( filePath ) as smvOutFile:
        smvOutput = smvOutFile.read()
    
    smvParser = SMVParser( smvOutput )
    smvParser.ParseCounterExamples()
    
if __name__ == '__main__':
    main()