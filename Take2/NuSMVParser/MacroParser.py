import sys
import re


HEADER_PATTERN      = [ r'.+\((.+)\)\s*\:\s*',          # one param
                        r'.+\((.+),(.+)\)\s*\:\s*',     # two params
                        r'.+\((.+),(.+),(.+)\)\s*\:\s*' # three params
]
MACRO_RULE_PATTERN  = r'"(.*)"\s*=>\s*"(.*)"'

class Macro(object):
    def __init__(self, singleMacroLine):
        for numParams in [ 3, 2, 1]:
            macroPattern = HEADER_PATTERN[ numParams - 1 ] + MACRO_RULE_PATTERN
            matches      = re.compile( macroPattern ).match( singleMacroLine )
            if matches is None:
                continue
            
            matches             = matches.groups()
            variables           = []
            for varIdx in range( numParams ):
                variables.append( matches[ varIdx ].strip() )

            macroRule           = matches[ numParams     ].strip()
            macroInterpretation = matches[ numParams + 1 ].strip()
            
            for varIdx in range( numParams ):
                macroRule           = macroRule.replace( variables[ varIdx ] , '(.*)' )
                variableFormatter   = '(%' + ( '(variable%d)' % varIdx  )+ 's)'
                macroInterpretation = macroInterpretation.replace( variables[ varIdx ], variableFormatter  )
            
            self.macroRule           = macroRule.strip()
            self.macroInterpretation = macroInterpretation.strip()                                      
            self.numVars             = numParams
            
            return
        
        raise Exception( "Invalid macro definition" )

    def Match(self, macroString):
        if re.compile( self.macroRule ).match( macroString ) is not None:
            return True
        
        return False
    
    def Parse(self, macroString):
        matches = re.compile( self.macroRule ).match( macroString ).groups()
        
        varaibles = {}
        for varIdx in range( self.numVars ):
            varaibles[ 'variable%d' % varIdx ] = matches[ varIdx ].strip()
        
        return self.macroInterpretation % varaibles
    

class MacroParser(object):
    
    def __init__(self, macroDefinitionsFilePath ):
        with file( macroDefinitionsFilePath ) as macroDefinitionsFile :
            macroDefinitions = macroDefinitionsFile.readlines()
            
        self.allMacros = []
        for singleMacroLine in macroDefinitions:
            self.allMacros.append( Macro( singleMacroLine ))

    
    def Parse(self, macroToParse):
        for macro in self.allMacros:
            if macro.Match( macroToParse ):
                return macro.Parse( macroToParse ).replace('[]','G ').replace('<>', 'F ')
            
        return "IVALID MACRO"
    
    


def main():
    #filePath = r"C:\Users\Ofir\Documents\tau\winter-14\project\Modelling2014\Take2\NuSMVParser\out.txt"
    
    macroDefinitionsFile = sys.argv[1]
    macroToParse = sys.argv[2]
    with open("c:/dev/temp/test.txt.  ", "a") as myfile:
        myfile.write( 'num args: %d.  ' % len(sys.argv) )
        myfile.write("macroDefinitionsFile: %s; macroToParse:  %s\n" %( macroDefinitionsFile, macroToParse ))
#     macroDefinitionsFile = r"C:\Users\Ofir\Documents\tau\winter-14\project\Modelling2014\Take2\NuSMVParser\macrodefinitions.txt"
#     macroToParse = "request before status=busy"
    
    macroParser = MacroParser( macroDefinitionsFile )
    print( macroParser.Parse( macroToParse ) )
    
if __name__ == '__main__':
    main()