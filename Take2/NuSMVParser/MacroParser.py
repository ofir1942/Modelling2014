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
            
            #else:
            matches             = matches.groups()
            variables           = []
            for varIdx in range( numParams ):
                variables.append( matches[ varIdx ].strip() )

            macroRule           = matches[ numParams     ].strip() #right hand of "=>"
            macroInterpretation = matches[ numParams + 1 ].strip() #left hand of "=>"
            
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

    
    def Parse(self, patternToParse):
        for macro in self.allMacros:
            if macro.Match( patternToParse ):
                return macro.Parse( patternToParse ).replace('[]','G ') \
                                                    .replace('<>', 'F ')

        #if no matching macro:            
        return "IVALID PATTERN"
    
def main():    
    macroDefinitionsFile = sys.argv[1]
    patternToParse       = sys.argv[2]
    macroParser          = MacroParser( macroDefinitionsFile )
    print( macroParser.Parse( patternToParse ) )
    
if __name__ == '__main__':
    main()