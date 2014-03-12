import re
import sys

STATE_HEADER        = "-> State:" 
LOOP_IDENTIFIER     = "-- Loop starts here"
STATE_HEADER_REGEX  = r"re.compile('-> State\: (\d+\.\d+) <-')"

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

    def GetStatesText(self):
        statesText      = self.smvOutput.split( STATE_HEADER )
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
    
    def GenerateDOTText(self, stateDOTNodes ):
        dotText = "digraph G  { rankdir=LR \n"
        for stateNode in stateDOTNodes:
            dotText += stateNode.stateDOTText + "\n"
            
        for stateNode in stateDOTNodes:
            edgeText = "%s->%s;" % ( stateNode.stateLabel, stateNode.nextStateLabel )
            dotText += edgeText + "\n"
            
        dotText += '}'
        
        return dotText
    
    def ParseCounterExamples(self):
        statesText        = self.GetStatesText()
        loopStartStateIdx = self.FindLoopStart( statesText )
        stateDOTNodes     = self.GenerateDOTNodes( statesText, loopStartStateIdx )
        dotText           = self.GenerateDOTText( stateDOTNodes )
        
        with file( "graph.dot", 'w' ) as dotFile:
            dotFile.write( dotText )


def main():
    #filePath = r"C:\Users\Ofir\Documents\tau\winter-14\project\SMVParser\out.txt"
    filePath = sys.argv[1]
    with file( filePath ) as smvOutFile:
        smvOutput = smvOutFile.read()
    
    smvParser = SMVParser( smvOutput )
    smvParser.ParseCounterExamples()
    
if __name__ == '__main__':
    main()