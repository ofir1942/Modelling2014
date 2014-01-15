package org.xtext.osy.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.osy.services.ExtendedSMVGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExtendedSMVParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'True'", "'False'", "'VAR'", "'ASSIGN'", "':'", "'integer'", "';'", "'boolean'", "'{'", "'}'", "','", "'init'", "'('", "')'", "':='"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalExtendedSMVParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExtendedSMVParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExtendedSMVParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g"; }


     
     	private ExtendedSMVGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExtendedSMVGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:61:1: ( ruleModel EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:69:1: ruleModel : ( ( rule__Model__SectionsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:73:2: ( ( ( rule__Model__SectionsAssignment )* ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:74:1: ( ( rule__Model__SectionsAssignment )* )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:74:1: ( ( rule__Model__SectionsAssignment )* )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:75:1: ( rule__Model__SectionsAssignment )*
            {
             before(grammarAccess.getModelAccess().getSectionsAssignment()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:76:1: ( rule__Model__SectionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:76:2: rule__Model__SectionsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__SectionsAssignment_in_ruleModel94);
            	    rule__Model__SectionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSectionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSection"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:88:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:89:1: ( ruleSection EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:90:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection122);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:97:1: ruleSection : ( ( rule__Section__Alternatives ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:101:2: ( ( ( rule__Section__Alternatives ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:102:1: ( ( rule__Section__Alternatives ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:102:1: ( ( rule__Section__Alternatives ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:103:1: ( rule__Section__Alternatives )
            {
             before(grammarAccess.getSectionAccess().getAlternatives()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:104:1: ( rule__Section__Alternatives )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:104:2: rule__Section__Alternatives
            {
            pushFollow(FOLLOW_rule__Section__Alternatives_in_ruleSection155);
            rule__Section__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleVariablesSection"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:116:1: entryRuleVariablesSection : ruleVariablesSection EOF ;
    public final void entryRuleVariablesSection() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:117:1: ( ruleVariablesSection EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:118:1: ruleVariablesSection EOF
            {
             before(grammarAccess.getVariablesSectionRule()); 
            pushFollow(FOLLOW_ruleVariablesSection_in_entryRuleVariablesSection182);
            ruleVariablesSection();

            state._fsp--;

             after(grammarAccess.getVariablesSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablesSection189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariablesSection"


    // $ANTLR start "ruleVariablesSection"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:125:1: ruleVariablesSection : ( ( rule__VariablesSection__Group__0 ) ) ;
    public final void ruleVariablesSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:129:2: ( ( ( rule__VariablesSection__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:130:1: ( ( rule__VariablesSection__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:130:1: ( ( rule__VariablesSection__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:131:1: ( rule__VariablesSection__Group__0 )
            {
             before(grammarAccess.getVariablesSectionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:132:1: ( rule__VariablesSection__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:132:2: rule__VariablesSection__Group__0
            {
            pushFollow(FOLLOW_rule__VariablesSection__Group__0_in_ruleVariablesSection215);
            rule__VariablesSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariablesSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariablesSection"


    // $ANTLR start "entryRuleAssignments"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:144:1: entryRuleAssignments : ruleAssignments EOF ;
    public final void entryRuleAssignments() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:145:1: ( ruleAssignments EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:146:1: ruleAssignments EOF
            {
             before(grammarAccess.getAssignmentsRule()); 
            pushFollow(FOLLOW_ruleAssignments_in_entryRuleAssignments242);
            ruleAssignments();

            state._fsp--;

             after(grammarAccess.getAssignmentsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignments249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignments"


    // $ANTLR start "ruleAssignments"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:153:1: ruleAssignments : ( ( rule__Assignments__Group__0 ) ) ;
    public final void ruleAssignments() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:157:2: ( ( ( rule__Assignments__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:158:1: ( ( rule__Assignments__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:158:1: ( ( rule__Assignments__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:159:1: ( rule__Assignments__Group__0 )
            {
             before(grammarAccess.getAssignmentsAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:160:1: ( rule__Assignments__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:160:2: rule__Assignments__Group__0
            {
            pushFollow(FOLLOW_rule__Assignments__Group__0_in_ruleAssignments275);
            rule__Assignments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignments"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:172:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:173:1: ( ruleVariableDeclaration EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:174:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration302);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:181:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Alternatives ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:185:2: ( ( ( rule__VariableDeclaration__Alternatives ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:186:1: ( ( rule__VariableDeclaration__Alternatives ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:186:1: ( ( rule__VariableDeclaration__Alternatives ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:187:1: ( rule__VariableDeclaration__Alternatives )
            {
             before(grammarAccess.getVariableDeclarationAccess().getAlternatives()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:188:1: ( rule__VariableDeclaration__Alternatives )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:188:2: rule__VariableDeclaration__Alternatives
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Alternatives_in_ruleVariableDeclaration335);
            rule__VariableDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleIntegerDeclarion"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:200:1: entryRuleIntegerDeclarion : ruleIntegerDeclarion EOF ;
    public final void entryRuleIntegerDeclarion() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:201:1: ( ruleIntegerDeclarion EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:202:1: ruleIntegerDeclarion EOF
            {
             before(grammarAccess.getIntegerDeclarionRule()); 
            pushFollow(FOLLOW_ruleIntegerDeclarion_in_entryRuleIntegerDeclarion362);
            ruleIntegerDeclarion();

            state._fsp--;

             after(grammarAccess.getIntegerDeclarionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerDeclarion369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerDeclarion"


    // $ANTLR start "ruleIntegerDeclarion"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:209:1: ruleIntegerDeclarion : ( ( rule__IntegerDeclarion__Group__0 ) ) ;
    public final void ruleIntegerDeclarion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:213:2: ( ( ( rule__IntegerDeclarion__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:214:1: ( ( rule__IntegerDeclarion__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:214:1: ( ( rule__IntegerDeclarion__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:215:1: ( rule__IntegerDeclarion__Group__0 )
            {
             before(grammarAccess.getIntegerDeclarionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:216:1: ( rule__IntegerDeclarion__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:216:2: rule__IntegerDeclarion__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__0_in_ruleIntegerDeclarion395);
            rule__IntegerDeclarion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerDeclarionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerDeclarion"


    // $ANTLR start "entryRuleBooleanDeclarion"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:228:1: entryRuleBooleanDeclarion : ruleBooleanDeclarion EOF ;
    public final void entryRuleBooleanDeclarion() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:229:1: ( ruleBooleanDeclarion EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:230:1: ruleBooleanDeclarion EOF
            {
             before(grammarAccess.getBooleanDeclarionRule()); 
            pushFollow(FOLLOW_ruleBooleanDeclarion_in_entryRuleBooleanDeclarion422);
            ruleBooleanDeclarion();

            state._fsp--;

             after(grammarAccess.getBooleanDeclarionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanDeclarion429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanDeclarion"


    // $ANTLR start "ruleBooleanDeclarion"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:237:1: ruleBooleanDeclarion : ( ( rule__BooleanDeclarion__Group__0 ) ) ;
    public final void ruleBooleanDeclarion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:241:2: ( ( ( rule__BooleanDeclarion__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:242:1: ( ( rule__BooleanDeclarion__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:242:1: ( ( rule__BooleanDeclarion__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:243:1: ( rule__BooleanDeclarion__Group__0 )
            {
             before(grammarAccess.getBooleanDeclarionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:244:1: ( rule__BooleanDeclarion__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:244:2: rule__BooleanDeclarion__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__0_in_ruleBooleanDeclarion455);
            rule__BooleanDeclarion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanDeclarionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanDeclarion"


    // $ANTLR start "entryRuleStateVariableDeclaration"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:256:1: entryRuleStateVariableDeclaration : ruleStateVariableDeclaration EOF ;
    public final void entryRuleStateVariableDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:257:1: ( ruleStateVariableDeclaration EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:258:1: ruleStateVariableDeclaration EOF
            {
             before(grammarAccess.getStateVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration482);
            ruleStateVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getStateVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateVariableDeclaration489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateVariableDeclaration"


    // $ANTLR start "ruleStateVariableDeclaration"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:265:1: ruleStateVariableDeclaration : ( ( rule__StateVariableDeclaration__Group__0 ) ) ;
    public final void ruleStateVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:269:2: ( ( ( rule__StateVariableDeclaration__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:270:1: ( ( rule__StateVariableDeclaration__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:270:1: ( ( rule__StateVariableDeclaration__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:271:1: ( rule__StateVariableDeclaration__Group__0 )
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:272:1: ( rule__StateVariableDeclaration__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:272:2: rule__StateVariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__0_in_ruleStateVariableDeclaration515);
            rule__StateVariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateVariableDeclaration"


    // $ANTLR start "entryRuleAssignmentExpression"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:284:1: entryRuleAssignmentExpression : ruleAssignmentExpression EOF ;
    public final void entryRuleAssignmentExpression() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:285:1: ( ruleAssignmentExpression EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:286:1: ruleAssignmentExpression EOF
            {
             before(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression542);
            ruleAssignmentExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:293:1: ruleAssignmentExpression : ( ( rule__AssignmentExpression__Alternatives ) ) ;
    public final void ruleAssignmentExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:297:2: ( ( ( rule__AssignmentExpression__Alternatives ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:298:1: ( ( rule__AssignmentExpression__Alternatives ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:298:1: ( ( rule__AssignmentExpression__Alternatives ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:299:1: ( rule__AssignmentExpression__Alternatives )
            {
             before(grammarAccess.getAssignmentExpressionAccess().getAlternatives()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:300:1: ( rule__AssignmentExpression__Alternatives )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:300:2: rule__AssignmentExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__Alternatives_in_ruleAssignmentExpression575);
            rule__AssignmentExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleBooleanAssignment"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:312:1: entryRuleBooleanAssignment : ruleBooleanAssignment EOF ;
    public final void entryRuleBooleanAssignment() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:313:1: ( ruleBooleanAssignment EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:314:1: ruleBooleanAssignment EOF
            {
             before(grammarAccess.getBooleanAssignmentRule()); 
            pushFollow(FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment602);
            ruleBooleanAssignment();

            state._fsp--;

             after(grammarAccess.getBooleanAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAssignment609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanAssignment"


    // $ANTLR start "ruleBooleanAssignment"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:321:1: ruleBooleanAssignment : ( ( rule__BooleanAssignment__Group__0 ) ) ;
    public final void ruleBooleanAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:325:2: ( ( ( rule__BooleanAssignment__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:326:1: ( ( rule__BooleanAssignment__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:326:1: ( ( rule__BooleanAssignment__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:327:1: ( rule__BooleanAssignment__Group__0 )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:328:1: ( rule__BooleanAssignment__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:328:2: rule__BooleanAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__0_in_ruleBooleanAssignment635);
            rule__BooleanAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanAssignment"


    // $ANTLR start "entryRuleBOOL"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:340:1: entryRuleBOOL : ruleBOOL EOF ;
    public final void entryRuleBOOL() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:341:1: ( ruleBOOL EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:342:1: ruleBOOL EOF
            {
             before(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL662);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getBOOLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:349:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:353:2: ( ( ( rule__BOOL__Alternatives ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:354:1: ( ( rule__BOOL__Alternatives ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:354:1: ( ( rule__BOOL__Alternatives ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:355:1: ( rule__BOOL__Alternatives )
            {
             before(grammarAccess.getBOOLAccess().getAlternatives()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:356:1: ( rule__BOOL__Alternatives )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:356:2: rule__BOOL__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL695);
            rule__BOOL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRuleIntegerAssignment"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:368:1: entryRuleIntegerAssignment : ruleIntegerAssignment EOF ;
    public final void entryRuleIntegerAssignment() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:369:1: ( ruleIntegerAssignment EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:370:1: ruleIntegerAssignment EOF
            {
             before(grammarAccess.getIntegerAssignmentRule()); 
            pushFollow(FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment722);
            ruleIntegerAssignment();

            state._fsp--;

             after(grammarAccess.getIntegerAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerAssignment729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerAssignment"


    // $ANTLR start "ruleIntegerAssignment"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:377:1: ruleIntegerAssignment : ( ( rule__IntegerAssignment__Group__0 ) ) ;
    public final void ruleIntegerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:381:2: ( ( ( rule__IntegerAssignment__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:382:1: ( ( rule__IntegerAssignment__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:382:1: ( ( rule__IntegerAssignment__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:383:1: ( rule__IntegerAssignment__Group__0 )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:384:1: ( rule__IntegerAssignment__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:384:2: rule__IntegerAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__0_in_ruleIntegerAssignment755);
            rule__IntegerAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerAssignment"


    // $ANTLR start "entryRuleStateAssignment"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:396:1: entryRuleStateAssignment : ruleStateAssignment EOF ;
    public final void entryRuleStateAssignment() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:397:1: ( ruleStateAssignment EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:398:1: ruleStateAssignment EOF
            {
             before(grammarAccess.getStateAssignmentRule()); 
            pushFollow(FOLLOW_ruleStateAssignment_in_entryRuleStateAssignment782);
            ruleStateAssignment();

            state._fsp--;

             after(grammarAccess.getStateAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateAssignment789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateAssignment"


    // $ANTLR start "ruleStateAssignment"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:405:1: ruleStateAssignment : ( ( rule__StateAssignment__Group__0 ) ) ;
    public final void ruleStateAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:409:2: ( ( ( rule__StateAssignment__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:410:1: ( ( rule__StateAssignment__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:410:1: ( ( rule__StateAssignment__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:411:1: ( rule__StateAssignment__Group__0 )
            {
             before(grammarAccess.getStateAssignmentAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:412:1: ( rule__StateAssignment__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:412:2: rule__StateAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__0_in_ruleStateAssignment815);
            rule__StateAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateAssignment"


    // $ANTLR start "rule__Section__Alternatives"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:424:1: rule__Section__Alternatives : ( ( ruleVariablesSection ) | ( ruleAssignments ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:428:1: ( ( ruleVariablesSection ) | ( ruleAssignments ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:429:1: ( ruleVariablesSection )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:429:1: ( ruleVariablesSection )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:430:1: ruleVariablesSection
                    {
                     before(grammarAccess.getSectionAccess().getVariablesSectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVariablesSection_in_rule__Section__Alternatives851);
                    ruleVariablesSection();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getVariablesSectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:435:6: ( ruleAssignments )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:435:6: ( ruleAssignments )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:436:1: ruleAssignments
                    {
                     before(grammarAccess.getSectionAccess().getAssignmentsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAssignments_in_rule__Section__Alternatives868);
                    ruleAssignments();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getAssignmentsParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Alternatives"


    // $ANTLR start "rule__VariableDeclaration__Alternatives"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:446:1: rule__VariableDeclaration__Alternatives : ( ( ruleIntegerDeclarion ) | ( ruleBooleanDeclarion ) | ( ruleStateVariableDeclaration ) );
    public final void rule__VariableDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:450:1: ( ( ruleIntegerDeclarion ) | ( ruleBooleanDeclarion ) | ( ruleStateVariableDeclaration ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==15) ) {
                    switch ( input.LA(3) ) {
                    case 18:
                        {
                        alt3=2;
                        }
                        break;
                    case 16:
                        {
                        alt3=1;
                        }
                        break;
                    case 19:
                        {
                        alt3=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:451:1: ( ruleIntegerDeclarion )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:451:1: ( ruleIntegerDeclarion )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:452:1: ruleIntegerDeclarion
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getIntegerDeclarionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerDeclarion_in_rule__VariableDeclaration__Alternatives900);
                    ruleIntegerDeclarion();

                    state._fsp--;

                     after(grammarAccess.getVariableDeclarationAccess().getIntegerDeclarionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:457:6: ( ruleBooleanDeclarion )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:457:6: ( ruleBooleanDeclarion )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:458:1: ruleBooleanDeclarion
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getBooleanDeclarionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanDeclarion_in_rule__VariableDeclaration__Alternatives917);
                    ruleBooleanDeclarion();

                    state._fsp--;

                     after(grammarAccess.getVariableDeclarationAccess().getBooleanDeclarionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:463:6: ( ruleStateVariableDeclaration )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:463:6: ( ruleStateVariableDeclaration )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:464:1: ruleStateVariableDeclaration
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getStateVariableDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStateVariableDeclaration_in_rule__VariableDeclaration__Alternatives934);
                    ruleStateVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVariableDeclarationAccess().getStateVariableDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Alternatives"


    // $ANTLR start "rule__AssignmentExpression__Alternatives"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:474:1: rule__AssignmentExpression__Alternatives : ( ( ruleIntegerAssignment ) | ( ruleBooleanAssignment ) | ( ruleStateAssignment ) );
    public final void rule__AssignmentExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:478:1: ( ( ruleIntegerAssignment ) | ( ruleBooleanAssignment ) | ( ruleStateAssignment ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==23) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==RULE_ID) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==24) ) {
                            int LA4_4 = input.LA(5);

                            if ( (LA4_4==25) ) {
                                switch ( input.LA(6) ) {
                                case 11:
                                case 12:
                                    {
                                    alt4=2;
                                    }
                                    break;
                                case RULE_INT:
                                    {
                                    alt4=1;
                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    alt4=3;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 5, input);

                                    throw nvae;
                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:479:1: ( ruleIntegerAssignment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:479:1: ( ruleIntegerAssignment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:480:1: ruleIntegerAssignment
                    {
                     before(grammarAccess.getAssignmentExpressionAccess().getIntegerAssignmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerAssignment_in_rule__AssignmentExpression__Alternatives966);
                    ruleIntegerAssignment();

                    state._fsp--;

                     after(grammarAccess.getAssignmentExpressionAccess().getIntegerAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:485:6: ( ruleBooleanAssignment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:485:6: ( ruleBooleanAssignment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:486:1: ruleBooleanAssignment
                    {
                     before(grammarAccess.getAssignmentExpressionAccess().getBooleanAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanAssignment_in_rule__AssignmentExpression__Alternatives983);
                    ruleBooleanAssignment();

                    state._fsp--;

                     after(grammarAccess.getAssignmentExpressionAccess().getBooleanAssignmentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:491:6: ( ruleStateAssignment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:491:6: ( ruleStateAssignment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:492:1: ruleStateAssignment
                    {
                     before(grammarAccess.getAssignmentExpressionAccess().getStateAssignmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStateAssignment_in_rule__AssignmentExpression__Alternatives1000);
                    ruleStateAssignment();

                    state._fsp--;

                     after(grammarAccess.getAssignmentExpressionAccess().getStateAssignmentParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentExpression__Alternatives"


    // $ANTLR start "rule__BOOL__Alternatives"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:502:1: rule__BOOL__Alternatives : ( ( 'True' ) | ( 'False' ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:506:1: ( ( 'True' ) | ( 'False' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:507:1: ( 'True' )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:507:1: ( 'True' )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:508:1: 'True'
                    {
                     before(grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__BOOL__Alternatives1033); 
                     after(grammarAccess.getBOOLAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:515:6: ( 'False' )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:515:6: ( 'False' )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:516:1: 'False'
                    {
                     before(grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__BOOL__Alternatives1053); 
                     after(grammarAccess.getBOOLAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL__Alternatives"


    // $ANTLR start "rule__VariablesSection__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:530:1: rule__VariablesSection__Group__0 : rule__VariablesSection__Group__0__Impl rule__VariablesSection__Group__1 ;
    public final void rule__VariablesSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:534:1: ( rule__VariablesSection__Group__0__Impl rule__VariablesSection__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:535:2: rule__VariablesSection__Group__0__Impl rule__VariablesSection__Group__1
            {
            pushFollow(FOLLOW_rule__VariablesSection__Group__0__Impl_in_rule__VariablesSection__Group__01085);
            rule__VariablesSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariablesSection__Group__1_in_rule__VariablesSection__Group__01088);
            rule__VariablesSection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariablesSection__Group__0"


    // $ANTLR start "rule__VariablesSection__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:542:1: rule__VariablesSection__Group__0__Impl : ( () ) ;
    public final void rule__VariablesSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:546:1: ( ( () ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:547:1: ( () )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:547:1: ( () )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:548:1: ()
            {
             before(grammarAccess.getVariablesSectionAccess().getVariablesSectionAction_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:549:1: ()
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:551:1: 
            {
            }

             after(grammarAccess.getVariablesSectionAccess().getVariablesSectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariablesSection__Group__0__Impl"


    // $ANTLR start "rule__VariablesSection__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:561:1: rule__VariablesSection__Group__1 : rule__VariablesSection__Group__1__Impl rule__VariablesSection__Group__2 ;
    public final void rule__VariablesSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:565:1: ( rule__VariablesSection__Group__1__Impl rule__VariablesSection__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:566:2: rule__VariablesSection__Group__1__Impl rule__VariablesSection__Group__2
            {
            pushFollow(FOLLOW_rule__VariablesSection__Group__1__Impl_in_rule__VariablesSection__Group__11146);
            rule__VariablesSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariablesSection__Group__2_in_rule__VariablesSection__Group__11149);
            rule__VariablesSection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariablesSection__Group__1"


    // $ANTLR start "rule__VariablesSection__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:573:1: rule__VariablesSection__Group__1__Impl : ( 'VAR' ) ;
    public final void rule__VariablesSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:577:1: ( ( 'VAR' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:578:1: ( 'VAR' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:578:1: ( 'VAR' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:579:1: 'VAR'
            {
             before(grammarAccess.getVariablesSectionAccess().getVARKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__VariablesSection__Group__1__Impl1177); 
             after(grammarAccess.getVariablesSectionAccess().getVARKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariablesSection__Group__1__Impl"


    // $ANTLR start "rule__VariablesSection__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:592:1: rule__VariablesSection__Group__2 : rule__VariablesSection__Group__2__Impl ;
    public final void rule__VariablesSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:596:1: ( rule__VariablesSection__Group__2__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:597:2: rule__VariablesSection__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariablesSection__Group__2__Impl_in_rule__VariablesSection__Group__21208);
            rule__VariablesSection__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariablesSection__Group__2"


    // $ANTLR start "rule__VariablesSection__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:603:1: rule__VariablesSection__Group__2__Impl : ( ( ( rule__VariablesSection__VariablesAssignment_2 ) ) ( ( rule__VariablesSection__VariablesAssignment_2 )* ) ) ;
    public final void rule__VariablesSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:607:1: ( ( ( ( rule__VariablesSection__VariablesAssignment_2 ) ) ( ( rule__VariablesSection__VariablesAssignment_2 )* ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:608:1: ( ( ( rule__VariablesSection__VariablesAssignment_2 ) ) ( ( rule__VariablesSection__VariablesAssignment_2 )* ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:608:1: ( ( ( rule__VariablesSection__VariablesAssignment_2 ) ) ( ( rule__VariablesSection__VariablesAssignment_2 )* ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:609:1: ( ( rule__VariablesSection__VariablesAssignment_2 ) ) ( ( rule__VariablesSection__VariablesAssignment_2 )* )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:609:1: ( ( rule__VariablesSection__VariablesAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:610:1: ( rule__VariablesSection__VariablesAssignment_2 )
            {
             before(grammarAccess.getVariablesSectionAccess().getVariablesAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:611:1: ( rule__VariablesSection__VariablesAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:611:2: rule__VariablesSection__VariablesAssignment_2
            {
            pushFollow(FOLLOW_rule__VariablesSection__VariablesAssignment_2_in_rule__VariablesSection__Group__2__Impl1237);
            rule__VariablesSection__VariablesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariablesSectionAccess().getVariablesAssignment_2()); 

            }

            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:614:1: ( ( rule__VariablesSection__VariablesAssignment_2 )* )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:615:1: ( rule__VariablesSection__VariablesAssignment_2 )*
            {
             before(grammarAccess.getVariablesSectionAccess().getVariablesAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:616:1: ( rule__VariablesSection__VariablesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:616:2: rule__VariablesSection__VariablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__VariablesSection__VariablesAssignment_2_in_rule__VariablesSection__Group__2__Impl1249);
            	    rule__VariablesSection__VariablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getVariablesSectionAccess().getVariablesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariablesSection__Group__2__Impl"


    // $ANTLR start "rule__Assignments__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:633:1: rule__Assignments__Group__0 : rule__Assignments__Group__0__Impl rule__Assignments__Group__1 ;
    public final void rule__Assignments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:637:1: ( rule__Assignments__Group__0__Impl rule__Assignments__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:638:2: rule__Assignments__Group__0__Impl rule__Assignments__Group__1
            {
            pushFollow(FOLLOW_rule__Assignments__Group__0__Impl_in_rule__Assignments__Group__01288);
            rule__Assignments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignments__Group__1_in_rule__Assignments__Group__01291);
            rule__Assignments__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__0"


    // $ANTLR start "rule__Assignments__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:645:1: rule__Assignments__Group__0__Impl : ( () ) ;
    public final void rule__Assignments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:649:1: ( ( () ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:650:1: ( () )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:650:1: ( () )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:651:1: ()
            {
             before(grammarAccess.getAssignmentsAccess().getAssignmentsAction_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:652:1: ()
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:654:1: 
            {
            }

             after(grammarAccess.getAssignmentsAccess().getAssignmentsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__0__Impl"


    // $ANTLR start "rule__Assignments__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:664:1: rule__Assignments__Group__1 : rule__Assignments__Group__1__Impl rule__Assignments__Group__2 ;
    public final void rule__Assignments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:668:1: ( rule__Assignments__Group__1__Impl rule__Assignments__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:669:2: rule__Assignments__Group__1__Impl rule__Assignments__Group__2
            {
            pushFollow(FOLLOW_rule__Assignments__Group__1__Impl_in_rule__Assignments__Group__11349);
            rule__Assignments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignments__Group__2_in_rule__Assignments__Group__11352);
            rule__Assignments__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__1"


    // $ANTLR start "rule__Assignments__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:676:1: rule__Assignments__Group__1__Impl : ( 'ASSIGN' ) ;
    public final void rule__Assignments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:680:1: ( ( 'ASSIGN' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:681:1: ( 'ASSIGN' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:681:1: ( 'ASSIGN' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:682:1: 'ASSIGN'
            {
             before(grammarAccess.getAssignmentsAccess().getASSIGNKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Assignments__Group__1__Impl1380); 
             after(grammarAccess.getAssignmentsAccess().getASSIGNKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__1__Impl"


    // $ANTLR start "rule__Assignments__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:695:1: rule__Assignments__Group__2 : rule__Assignments__Group__2__Impl ;
    public final void rule__Assignments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:699:1: ( rule__Assignments__Group__2__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:700:2: rule__Assignments__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignments__Group__2__Impl_in_rule__Assignments__Group__21411);
            rule__Assignments__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__2"


    // $ANTLR start "rule__Assignments__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:706:1: rule__Assignments__Group__2__Impl : ( ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* ) ) ;
    public final void rule__Assignments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:710:1: ( ( ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:711:1: ( ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:711:1: ( ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:712:1: ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:712:1: ( ( rule__Assignments__AssignmentsAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:713:1: ( rule__Assignments__AssignmentsAssignment_2 )
            {
             before(grammarAccess.getAssignmentsAccess().getAssignmentsAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:714:1: ( rule__Assignments__AssignmentsAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:714:2: rule__Assignments__AssignmentsAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignments__AssignmentsAssignment_2_in_rule__Assignments__Group__2__Impl1440);
            rule__Assignments__AssignmentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentsAccess().getAssignmentsAssignment_2()); 

            }

            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:717:1: ( ( rule__Assignments__AssignmentsAssignment_2 )* )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:718:1: ( rule__Assignments__AssignmentsAssignment_2 )*
            {
             before(grammarAccess.getAssignmentsAccess().getAssignmentsAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:719:1: ( rule__Assignments__AssignmentsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:719:2: rule__Assignments__AssignmentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Assignments__AssignmentsAssignment_2_in_rule__Assignments__Group__2__Impl1452);
            	    rule__Assignments__AssignmentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAssignmentsAccess().getAssignmentsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__2__Impl"


    // $ANTLR start "rule__IntegerDeclarion__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:736:1: rule__IntegerDeclarion__Group__0 : rule__IntegerDeclarion__Group__0__Impl rule__IntegerDeclarion__Group__1 ;
    public final void rule__IntegerDeclarion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:740:1: ( rule__IntegerDeclarion__Group__0__Impl rule__IntegerDeclarion__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:741:2: rule__IntegerDeclarion__Group__0__Impl rule__IntegerDeclarion__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__0__Impl_in_rule__IntegerDeclarion__Group__01491);
            rule__IntegerDeclarion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__1_in_rule__IntegerDeclarion__Group__01494);
            rule__IntegerDeclarion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerDeclarion__Group__0"


    // $ANTLR start "rule__IntegerDeclarion__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:748:1: rule__IntegerDeclarion__Group__0__Impl : ( ( rule__IntegerDeclarion__NameAssignment_0 ) ) ;
    public final void rule__IntegerDeclarion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:752:1: ( ( ( rule__IntegerDeclarion__NameAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:753:1: ( ( rule__IntegerDeclarion__NameAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:753:1: ( ( rule__IntegerDeclarion__NameAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:754:1: ( rule__IntegerDeclarion__NameAssignment_0 )
            {
             before(grammarAccess.getIntegerDeclarionAccess().getNameAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:755:1: ( rule__IntegerDeclarion__NameAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:755:2: rule__IntegerDeclarion__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__NameAssignment_0_in_rule__IntegerDeclarion__Group__0__Impl1521);
            rule__IntegerDeclarion__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerDeclarionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerDeclarion__Group__0__Impl"


    // $ANTLR start "rule__IntegerDeclarion__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:765:1: rule__IntegerDeclarion__Group__1 : rule__IntegerDeclarion__Group__1__Impl rule__IntegerDeclarion__Group__2 ;
    public final void rule__IntegerDeclarion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:769:1: ( rule__IntegerDeclarion__Group__1__Impl rule__IntegerDeclarion__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:770:2: rule__IntegerDeclarion__Group__1__Impl rule__IntegerDeclarion__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__1__Impl_in_rule__IntegerDeclarion__Group__11551);
            rule__IntegerDeclarion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__2_in_rule__IntegerDeclarion__Group__11554);
            rule__IntegerDeclarion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerDeclarion__Group__1"


    // $ANTLR start "rule__IntegerDeclarion__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:777:1: rule__IntegerDeclarion__Group__1__Impl : ( ':' ) ;
    public final void rule__IntegerDeclarion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:781:1: ( ( ':' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:782:1: ( ':' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:782:1: ( ':' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:783:1: ':'
            {
             before(grammarAccess.getIntegerDeclarionAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__IntegerDeclarion__Group__1__Impl1582); 
             after(grammarAccess.getIntegerDeclarionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerDeclarion__Group__1__Impl"


    // $ANTLR start "rule__IntegerDeclarion__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:796:1: rule__IntegerDeclarion__Group__2 : rule__IntegerDeclarion__Group__2__Impl rule__IntegerDeclarion__Group__3 ;
    public final void rule__IntegerDeclarion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:800:1: ( rule__IntegerDeclarion__Group__2__Impl rule__IntegerDeclarion__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:801:2: rule__IntegerDeclarion__Group__2__Impl rule__IntegerDeclarion__Group__3
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__2__Impl_in_rule__IntegerDeclarion__Group__21613);
            rule__IntegerDeclarion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__3_in_rule__IntegerDeclarion__Group__21616);
            rule__IntegerDeclarion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerDeclarion__Group__2"


    // $ANTLR start "rule__IntegerDeclarion__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:808:1: rule__IntegerDeclarion__Group__2__Impl : ( 'integer' ) ;
    public final void rule__IntegerDeclarion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:812:1: ( ( 'integer' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:813:1: ( 'integer' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:813:1: ( 'integer' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:814:1: 'integer'
            {
             before(grammarAccess.getIntegerDeclarionAccess().getIntegerKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__IntegerDeclarion__Group__2__Impl1644); 
             after(grammarAccess.getIntegerDeclarionAccess().getIntegerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerDeclarion__Group__2__Impl"


    // $ANTLR start "rule__IntegerDeclarion__Group__3"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:827:1: rule__IntegerDeclarion__Group__3 : rule__IntegerDeclarion__Group__3__Impl ;
    public final void rule__IntegerDeclarion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:831:1: ( rule__IntegerDeclarion__Group__3__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:832:2: rule__IntegerDeclarion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__3__Impl_in_rule__IntegerDeclarion__Group__31675);
            rule__IntegerDeclarion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerDeclarion__Group__3"


    // $ANTLR start "rule__IntegerDeclarion__Group__3__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:838:1: rule__IntegerDeclarion__Group__3__Impl : ( ';' ) ;
    public final void rule__IntegerDeclarion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:842:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:843:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:843:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:844:1: ';'
            {
             before(grammarAccess.getIntegerDeclarionAccess().getSemicolonKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__IntegerDeclarion__Group__3__Impl1703); 
             after(grammarAccess.getIntegerDeclarionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerDeclarion__Group__3__Impl"


    // $ANTLR start "rule__BooleanDeclarion__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:865:1: rule__BooleanDeclarion__Group__0 : rule__BooleanDeclarion__Group__0__Impl rule__BooleanDeclarion__Group__1 ;
    public final void rule__BooleanDeclarion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:869:1: ( rule__BooleanDeclarion__Group__0__Impl rule__BooleanDeclarion__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:870:2: rule__BooleanDeclarion__Group__0__Impl rule__BooleanDeclarion__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__0__Impl_in_rule__BooleanDeclarion__Group__01742);
            rule__BooleanDeclarion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__1_in_rule__BooleanDeclarion__Group__01745);
            rule__BooleanDeclarion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanDeclarion__Group__0"


    // $ANTLR start "rule__BooleanDeclarion__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:877:1: rule__BooleanDeclarion__Group__0__Impl : ( ( rule__BooleanDeclarion__NameAssignment_0 ) ) ;
    public final void rule__BooleanDeclarion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:881:1: ( ( ( rule__BooleanDeclarion__NameAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:882:1: ( ( rule__BooleanDeclarion__NameAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:882:1: ( ( rule__BooleanDeclarion__NameAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:883:1: ( rule__BooleanDeclarion__NameAssignment_0 )
            {
             before(grammarAccess.getBooleanDeclarionAccess().getNameAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:884:1: ( rule__BooleanDeclarion__NameAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:884:2: rule__BooleanDeclarion__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__NameAssignment_0_in_rule__BooleanDeclarion__Group__0__Impl1772);
            rule__BooleanDeclarion__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanDeclarionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanDeclarion__Group__0__Impl"


    // $ANTLR start "rule__BooleanDeclarion__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:894:1: rule__BooleanDeclarion__Group__1 : rule__BooleanDeclarion__Group__1__Impl rule__BooleanDeclarion__Group__2 ;
    public final void rule__BooleanDeclarion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:898:1: ( rule__BooleanDeclarion__Group__1__Impl rule__BooleanDeclarion__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:899:2: rule__BooleanDeclarion__Group__1__Impl rule__BooleanDeclarion__Group__2
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__1__Impl_in_rule__BooleanDeclarion__Group__11802);
            rule__BooleanDeclarion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__2_in_rule__BooleanDeclarion__Group__11805);
            rule__BooleanDeclarion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanDeclarion__Group__1"


    // $ANTLR start "rule__BooleanDeclarion__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:906:1: rule__BooleanDeclarion__Group__1__Impl : ( ':' ) ;
    public final void rule__BooleanDeclarion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:910:1: ( ( ':' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:911:1: ( ':' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:911:1: ( ':' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:912:1: ':'
            {
             before(grammarAccess.getBooleanDeclarionAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__BooleanDeclarion__Group__1__Impl1833); 
             after(grammarAccess.getBooleanDeclarionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanDeclarion__Group__1__Impl"


    // $ANTLR start "rule__BooleanDeclarion__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:925:1: rule__BooleanDeclarion__Group__2 : rule__BooleanDeclarion__Group__2__Impl rule__BooleanDeclarion__Group__3 ;
    public final void rule__BooleanDeclarion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:929:1: ( rule__BooleanDeclarion__Group__2__Impl rule__BooleanDeclarion__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:930:2: rule__BooleanDeclarion__Group__2__Impl rule__BooleanDeclarion__Group__3
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__2__Impl_in_rule__BooleanDeclarion__Group__21864);
            rule__BooleanDeclarion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__3_in_rule__BooleanDeclarion__Group__21867);
            rule__BooleanDeclarion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanDeclarion__Group__2"


    // $ANTLR start "rule__BooleanDeclarion__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:937:1: rule__BooleanDeclarion__Group__2__Impl : ( 'boolean' ) ;
    public final void rule__BooleanDeclarion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:941:1: ( ( 'boolean' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:942:1: ( 'boolean' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:942:1: ( 'boolean' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:943:1: 'boolean'
            {
             before(grammarAccess.getBooleanDeclarionAccess().getBooleanKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__BooleanDeclarion__Group__2__Impl1895); 
             after(grammarAccess.getBooleanDeclarionAccess().getBooleanKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanDeclarion__Group__2__Impl"


    // $ANTLR start "rule__BooleanDeclarion__Group__3"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:956:1: rule__BooleanDeclarion__Group__3 : rule__BooleanDeclarion__Group__3__Impl ;
    public final void rule__BooleanDeclarion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:960:1: ( rule__BooleanDeclarion__Group__3__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:961:2: rule__BooleanDeclarion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__3__Impl_in_rule__BooleanDeclarion__Group__31926);
            rule__BooleanDeclarion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanDeclarion__Group__3"


    // $ANTLR start "rule__BooleanDeclarion__Group__3__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:967:1: rule__BooleanDeclarion__Group__3__Impl : ( ';' ) ;
    public final void rule__BooleanDeclarion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:971:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:972:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:972:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:973:1: ';'
            {
             before(grammarAccess.getBooleanDeclarionAccess().getSemicolonKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__BooleanDeclarion__Group__3__Impl1954); 
             after(grammarAccess.getBooleanDeclarionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanDeclarion__Group__3__Impl"


    // $ANTLR start "rule__StateVariableDeclaration__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:994:1: rule__StateVariableDeclaration__Group__0 : rule__StateVariableDeclaration__Group__0__Impl rule__StateVariableDeclaration__Group__1 ;
    public final void rule__StateVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:998:1: ( rule__StateVariableDeclaration__Group__0__Impl rule__StateVariableDeclaration__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:999:2: rule__StateVariableDeclaration__Group__0__Impl rule__StateVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__0__Impl_in_rule__StateVariableDeclaration__Group__01993);
            rule__StateVariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__1_in_rule__StateVariableDeclaration__Group__01996);
            rule__StateVariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__0"


    // $ANTLR start "rule__StateVariableDeclaration__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1006:1: rule__StateVariableDeclaration__Group__0__Impl : ( ( rule__StateVariableDeclaration__NameAssignment_0 ) ) ;
    public final void rule__StateVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1010:1: ( ( ( rule__StateVariableDeclaration__NameAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1011:1: ( ( rule__StateVariableDeclaration__NameAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1011:1: ( ( rule__StateVariableDeclaration__NameAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1012:1: ( rule__StateVariableDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getNameAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1013:1: ( rule__StateVariableDeclaration__NameAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1013:2: rule__StateVariableDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__NameAssignment_0_in_rule__StateVariableDeclaration__Group__0__Impl2023);
            rule__StateVariableDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateVariableDeclarationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__StateVariableDeclaration__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1023:1: rule__StateVariableDeclaration__Group__1 : rule__StateVariableDeclaration__Group__1__Impl rule__StateVariableDeclaration__Group__2 ;
    public final void rule__StateVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1027:1: ( rule__StateVariableDeclaration__Group__1__Impl rule__StateVariableDeclaration__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1028:2: rule__StateVariableDeclaration__Group__1__Impl rule__StateVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__1__Impl_in_rule__StateVariableDeclaration__Group__12053);
            rule__StateVariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__2_in_rule__StateVariableDeclaration__Group__12056);
            rule__StateVariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__1"


    // $ANTLR start "rule__StateVariableDeclaration__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1035:1: rule__StateVariableDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__StateVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1039:1: ( ( ':' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1040:1: ( ':' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1040:1: ( ':' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1041:1: ':'
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__StateVariableDeclaration__Group__1__Impl2084); 
             after(grammarAccess.getStateVariableDeclarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__StateVariableDeclaration__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1054:1: rule__StateVariableDeclaration__Group__2 : rule__StateVariableDeclaration__Group__2__Impl rule__StateVariableDeclaration__Group__3 ;
    public final void rule__StateVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1058:1: ( rule__StateVariableDeclaration__Group__2__Impl rule__StateVariableDeclaration__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1059:2: rule__StateVariableDeclaration__Group__2__Impl rule__StateVariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__2__Impl_in_rule__StateVariableDeclaration__Group__22115);
            rule__StateVariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__3_in_rule__StateVariableDeclaration__Group__22118);
            rule__StateVariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__2"


    // $ANTLR start "rule__StateVariableDeclaration__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1066:1: rule__StateVariableDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__StateVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1070:1: ( ( '{' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1071:1: ( '{' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1071:1: ( '{' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1072:1: '{'
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__StateVariableDeclaration__Group__2__Impl2146); 
             after(grammarAccess.getStateVariableDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__StateVariableDeclaration__Group__3"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1085:1: rule__StateVariableDeclaration__Group__3 : rule__StateVariableDeclaration__Group__3__Impl rule__StateVariableDeclaration__Group__4 ;
    public final void rule__StateVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1089:1: ( rule__StateVariableDeclaration__Group__3__Impl rule__StateVariableDeclaration__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1090:2: rule__StateVariableDeclaration__Group__3__Impl rule__StateVariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__3__Impl_in_rule__StateVariableDeclaration__Group__32177);
            rule__StateVariableDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__4_in_rule__StateVariableDeclaration__Group__32180);
            rule__StateVariableDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__3"


    // $ANTLR start "rule__StateVariableDeclaration__Group__3__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1097:1: rule__StateVariableDeclaration__Group__3__Impl : ( ( rule__StateVariableDeclaration__StatesAssignment_3 ) ) ;
    public final void rule__StateVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1101:1: ( ( ( rule__StateVariableDeclaration__StatesAssignment_3 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1102:1: ( ( rule__StateVariableDeclaration__StatesAssignment_3 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1102:1: ( ( rule__StateVariableDeclaration__StatesAssignment_3 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1103:1: ( rule__StateVariableDeclaration__StatesAssignment_3 )
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getStatesAssignment_3()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1104:1: ( rule__StateVariableDeclaration__StatesAssignment_3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1104:2: rule__StateVariableDeclaration__StatesAssignment_3
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__StatesAssignment_3_in_rule__StateVariableDeclaration__Group__3__Impl2207);
            rule__StateVariableDeclaration__StatesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStateVariableDeclarationAccess().getStatesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__StateVariableDeclaration__Group__4"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1114:1: rule__StateVariableDeclaration__Group__4 : rule__StateVariableDeclaration__Group__4__Impl rule__StateVariableDeclaration__Group__5 ;
    public final void rule__StateVariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1118:1: ( rule__StateVariableDeclaration__Group__4__Impl rule__StateVariableDeclaration__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1119:2: rule__StateVariableDeclaration__Group__4__Impl rule__StateVariableDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__4__Impl_in_rule__StateVariableDeclaration__Group__42237);
            rule__StateVariableDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__5_in_rule__StateVariableDeclaration__Group__42240);
            rule__StateVariableDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__4"


    // $ANTLR start "rule__StateVariableDeclaration__Group__4__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1126:1: rule__StateVariableDeclaration__Group__4__Impl : ( ( rule__StateVariableDeclaration__Group_4__0 )* ) ;
    public final void rule__StateVariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1130:1: ( ( ( rule__StateVariableDeclaration__Group_4__0 )* ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1131:1: ( ( rule__StateVariableDeclaration__Group_4__0 )* )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1131:1: ( ( rule__StateVariableDeclaration__Group_4__0 )* )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1132:1: ( rule__StateVariableDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getGroup_4()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1133:1: ( rule__StateVariableDeclaration__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1133:2: rule__StateVariableDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__StateVariableDeclaration__Group_4__0_in_rule__StateVariableDeclaration__Group__4__Impl2267);
            	    rule__StateVariableDeclaration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStateVariableDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__4__Impl"


    // $ANTLR start "rule__StateVariableDeclaration__Group__5"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1143:1: rule__StateVariableDeclaration__Group__5 : rule__StateVariableDeclaration__Group__5__Impl rule__StateVariableDeclaration__Group__6 ;
    public final void rule__StateVariableDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1147:1: ( rule__StateVariableDeclaration__Group__5__Impl rule__StateVariableDeclaration__Group__6 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1148:2: rule__StateVariableDeclaration__Group__5__Impl rule__StateVariableDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__5__Impl_in_rule__StateVariableDeclaration__Group__52298);
            rule__StateVariableDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__6_in_rule__StateVariableDeclaration__Group__52301);
            rule__StateVariableDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__5"


    // $ANTLR start "rule__StateVariableDeclaration__Group__5__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1155:1: rule__StateVariableDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__StateVariableDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1159:1: ( ( '}' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1160:1: ( '}' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1160:1: ( '}' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1161:1: '}'
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__StateVariableDeclaration__Group__5__Impl2329); 
             after(grammarAccess.getStateVariableDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__5__Impl"


    // $ANTLR start "rule__StateVariableDeclaration__Group__6"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1174:1: rule__StateVariableDeclaration__Group__6 : rule__StateVariableDeclaration__Group__6__Impl ;
    public final void rule__StateVariableDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1178:1: ( rule__StateVariableDeclaration__Group__6__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1179:2: rule__StateVariableDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__6__Impl_in_rule__StateVariableDeclaration__Group__62360);
            rule__StateVariableDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__6"


    // $ANTLR start "rule__StateVariableDeclaration__Group__6__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1185:1: rule__StateVariableDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__StateVariableDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1189:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1190:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1190:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1191:1: ';'
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getSemicolonKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__StateVariableDeclaration__Group__6__Impl2388); 
             after(grammarAccess.getStateVariableDeclarationAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group__6__Impl"


    // $ANTLR start "rule__StateVariableDeclaration__Group_4__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1218:1: rule__StateVariableDeclaration__Group_4__0 : rule__StateVariableDeclaration__Group_4__0__Impl rule__StateVariableDeclaration__Group_4__1 ;
    public final void rule__StateVariableDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1222:1: ( rule__StateVariableDeclaration__Group_4__0__Impl rule__StateVariableDeclaration__Group_4__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1223:2: rule__StateVariableDeclaration__Group_4__0__Impl rule__StateVariableDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group_4__0__Impl_in_rule__StateVariableDeclaration__Group_4__02433);
            rule__StateVariableDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group_4__1_in_rule__StateVariableDeclaration__Group_4__02436);
            rule__StateVariableDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group_4__0"


    // $ANTLR start "rule__StateVariableDeclaration__Group_4__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1230:1: rule__StateVariableDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StateVariableDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1234:1: ( ( ',' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1235:1: ( ',' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1235:1: ( ',' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1236:1: ','
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__StateVariableDeclaration__Group_4__0__Impl2464); 
             after(grammarAccess.getStateVariableDeclarationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__StateVariableDeclaration__Group_4__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1249:1: rule__StateVariableDeclaration__Group_4__1 : rule__StateVariableDeclaration__Group_4__1__Impl ;
    public final void rule__StateVariableDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1253:1: ( rule__StateVariableDeclaration__Group_4__1__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1254:2: rule__StateVariableDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group_4__1__Impl_in_rule__StateVariableDeclaration__Group_4__12495);
            rule__StateVariableDeclaration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group_4__1"


    // $ANTLR start "rule__StateVariableDeclaration__Group_4__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1260:1: rule__StateVariableDeclaration__Group_4__1__Impl : ( ( rule__StateVariableDeclaration__StatesAssignment_4_1 ) ) ;
    public final void rule__StateVariableDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1264:1: ( ( ( rule__StateVariableDeclaration__StatesAssignment_4_1 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1265:1: ( ( rule__StateVariableDeclaration__StatesAssignment_4_1 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1265:1: ( ( rule__StateVariableDeclaration__StatesAssignment_4_1 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1266:1: ( rule__StateVariableDeclaration__StatesAssignment_4_1 )
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getStatesAssignment_4_1()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1267:1: ( rule__StateVariableDeclaration__StatesAssignment_4_1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1267:2: rule__StateVariableDeclaration__StatesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__StatesAssignment_4_1_in_rule__StateVariableDeclaration__Group_4__1__Impl2522);
            rule__StateVariableDeclaration__StatesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStateVariableDeclarationAccess().getStatesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__BooleanAssignment__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1281:1: rule__BooleanAssignment__Group__0 : rule__BooleanAssignment__Group__0__Impl rule__BooleanAssignment__Group__1 ;
    public final void rule__BooleanAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1285:1: ( rule__BooleanAssignment__Group__0__Impl rule__BooleanAssignment__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1286:2: rule__BooleanAssignment__Group__0__Impl rule__BooleanAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__0__Impl_in_rule__BooleanAssignment__Group__02556);
            rule__BooleanAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__1_in_rule__BooleanAssignment__Group__02559);
            rule__BooleanAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__0"


    // $ANTLR start "rule__BooleanAssignment__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1293:1: rule__BooleanAssignment__Group__0__Impl : ( 'init' ) ;
    public final void rule__BooleanAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1297:1: ( ( 'init' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1298:1: ( 'init' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1298:1: ( 'init' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1299:1: 'init'
            {
             before(grammarAccess.getBooleanAssignmentAccess().getInitKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__BooleanAssignment__Group__0__Impl2587); 
             after(grammarAccess.getBooleanAssignmentAccess().getInitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__0__Impl"


    // $ANTLR start "rule__BooleanAssignment__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1312:1: rule__BooleanAssignment__Group__1 : rule__BooleanAssignment__Group__1__Impl rule__BooleanAssignment__Group__2 ;
    public final void rule__BooleanAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1316:1: ( rule__BooleanAssignment__Group__1__Impl rule__BooleanAssignment__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1317:2: rule__BooleanAssignment__Group__1__Impl rule__BooleanAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__1__Impl_in_rule__BooleanAssignment__Group__12618);
            rule__BooleanAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__2_in_rule__BooleanAssignment__Group__12621);
            rule__BooleanAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__1"


    // $ANTLR start "rule__BooleanAssignment__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1324:1: rule__BooleanAssignment__Group__1__Impl : ( '(' ) ;
    public final void rule__BooleanAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1328:1: ( ( '(' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1329:1: ( '(' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1329:1: ( '(' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1330:1: '('
            {
             before(grammarAccess.getBooleanAssignmentAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__BooleanAssignment__Group__1__Impl2649); 
             after(grammarAccess.getBooleanAssignmentAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__1__Impl"


    // $ANTLR start "rule__BooleanAssignment__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1343:1: rule__BooleanAssignment__Group__2 : rule__BooleanAssignment__Group__2__Impl rule__BooleanAssignment__Group__3 ;
    public final void rule__BooleanAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1347:1: ( rule__BooleanAssignment__Group__2__Impl rule__BooleanAssignment__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1348:2: rule__BooleanAssignment__Group__2__Impl rule__BooleanAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__2__Impl_in_rule__BooleanAssignment__Group__22680);
            rule__BooleanAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__3_in_rule__BooleanAssignment__Group__22683);
            rule__BooleanAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__2"


    // $ANTLR start "rule__BooleanAssignment__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1355:1: rule__BooleanAssignment__Group__2__Impl : ( ( rule__BooleanAssignment__VarAssignment_2 ) ) ;
    public final void rule__BooleanAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1359:1: ( ( ( rule__BooleanAssignment__VarAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1360:1: ( ( rule__BooleanAssignment__VarAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1360:1: ( ( rule__BooleanAssignment__VarAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1361:1: ( rule__BooleanAssignment__VarAssignment_2 )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getVarAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1362:1: ( rule__BooleanAssignment__VarAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1362:2: rule__BooleanAssignment__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__VarAssignment_2_in_rule__BooleanAssignment__Group__2__Impl2710);
            rule__BooleanAssignment__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAssignmentAccess().getVarAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__2__Impl"


    // $ANTLR start "rule__BooleanAssignment__Group__3"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1372:1: rule__BooleanAssignment__Group__3 : rule__BooleanAssignment__Group__3__Impl rule__BooleanAssignment__Group__4 ;
    public final void rule__BooleanAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1376:1: ( rule__BooleanAssignment__Group__3__Impl rule__BooleanAssignment__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1377:2: rule__BooleanAssignment__Group__3__Impl rule__BooleanAssignment__Group__4
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__3__Impl_in_rule__BooleanAssignment__Group__32740);
            rule__BooleanAssignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__4_in_rule__BooleanAssignment__Group__32743);
            rule__BooleanAssignment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__3"


    // $ANTLR start "rule__BooleanAssignment__Group__3__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1384:1: rule__BooleanAssignment__Group__3__Impl : ( ')' ) ;
    public final void rule__BooleanAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1388:1: ( ( ')' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1389:1: ( ')' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1389:1: ( ')' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1390:1: ')'
            {
             before(grammarAccess.getBooleanAssignmentAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__BooleanAssignment__Group__3__Impl2771); 
             after(grammarAccess.getBooleanAssignmentAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__3__Impl"


    // $ANTLR start "rule__BooleanAssignment__Group__4"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1403:1: rule__BooleanAssignment__Group__4 : rule__BooleanAssignment__Group__4__Impl rule__BooleanAssignment__Group__5 ;
    public final void rule__BooleanAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1407:1: ( rule__BooleanAssignment__Group__4__Impl rule__BooleanAssignment__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1408:2: rule__BooleanAssignment__Group__4__Impl rule__BooleanAssignment__Group__5
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__4__Impl_in_rule__BooleanAssignment__Group__42802);
            rule__BooleanAssignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__5_in_rule__BooleanAssignment__Group__42805);
            rule__BooleanAssignment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__4"


    // $ANTLR start "rule__BooleanAssignment__Group__4__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1415:1: rule__BooleanAssignment__Group__4__Impl : ( ':=' ) ;
    public final void rule__BooleanAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1419:1: ( ( ':=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1420:1: ( ':=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1420:1: ( ':=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1421:1: ':='
            {
             before(grammarAccess.getBooleanAssignmentAccess().getColonEqualsSignKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__BooleanAssignment__Group__4__Impl2833); 
             after(grammarAccess.getBooleanAssignmentAccess().getColonEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__4__Impl"


    // $ANTLR start "rule__BooleanAssignment__Group__5"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1434:1: rule__BooleanAssignment__Group__5 : rule__BooleanAssignment__Group__5__Impl rule__BooleanAssignment__Group__6 ;
    public final void rule__BooleanAssignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1438:1: ( rule__BooleanAssignment__Group__5__Impl rule__BooleanAssignment__Group__6 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1439:2: rule__BooleanAssignment__Group__5__Impl rule__BooleanAssignment__Group__6
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__5__Impl_in_rule__BooleanAssignment__Group__52864);
            rule__BooleanAssignment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__6_in_rule__BooleanAssignment__Group__52867);
            rule__BooleanAssignment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__5"


    // $ANTLR start "rule__BooleanAssignment__Group__5__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1446:1: rule__BooleanAssignment__Group__5__Impl : ( ( rule__BooleanAssignment__ValueAssignment_5 ) ) ;
    public final void rule__BooleanAssignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1450:1: ( ( ( rule__BooleanAssignment__ValueAssignment_5 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1451:1: ( ( rule__BooleanAssignment__ValueAssignment_5 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1451:1: ( ( rule__BooleanAssignment__ValueAssignment_5 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1452:1: ( rule__BooleanAssignment__ValueAssignment_5 )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getValueAssignment_5()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1453:1: ( rule__BooleanAssignment__ValueAssignment_5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1453:2: rule__BooleanAssignment__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__ValueAssignment_5_in_rule__BooleanAssignment__Group__5__Impl2894);
            rule__BooleanAssignment__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAssignmentAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__5__Impl"


    // $ANTLR start "rule__BooleanAssignment__Group__6"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1463:1: rule__BooleanAssignment__Group__6 : rule__BooleanAssignment__Group__6__Impl ;
    public final void rule__BooleanAssignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1467:1: ( rule__BooleanAssignment__Group__6__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1468:2: rule__BooleanAssignment__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__6__Impl_in_rule__BooleanAssignment__Group__62924);
            rule__BooleanAssignment__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__6"


    // $ANTLR start "rule__BooleanAssignment__Group__6__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1474:1: rule__BooleanAssignment__Group__6__Impl : ( ';' ) ;
    public final void rule__BooleanAssignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1478:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1479:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1479:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1480:1: ';'
            {
             before(grammarAccess.getBooleanAssignmentAccess().getSemicolonKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__BooleanAssignment__Group__6__Impl2952); 
             after(grammarAccess.getBooleanAssignmentAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__6__Impl"


    // $ANTLR start "rule__IntegerAssignment__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1507:1: rule__IntegerAssignment__Group__0 : rule__IntegerAssignment__Group__0__Impl rule__IntegerAssignment__Group__1 ;
    public final void rule__IntegerAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1511:1: ( rule__IntegerAssignment__Group__0__Impl rule__IntegerAssignment__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1512:2: rule__IntegerAssignment__Group__0__Impl rule__IntegerAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__0__Impl_in_rule__IntegerAssignment__Group__02997);
            rule__IntegerAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__1_in_rule__IntegerAssignment__Group__03000);
            rule__IntegerAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__0"


    // $ANTLR start "rule__IntegerAssignment__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1519:1: rule__IntegerAssignment__Group__0__Impl : ( 'init' ) ;
    public final void rule__IntegerAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1523:1: ( ( 'init' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1524:1: ( 'init' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1524:1: ( 'init' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1525:1: 'init'
            {
             before(grammarAccess.getIntegerAssignmentAccess().getInitKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__IntegerAssignment__Group__0__Impl3028); 
             after(grammarAccess.getIntegerAssignmentAccess().getInitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__0__Impl"


    // $ANTLR start "rule__IntegerAssignment__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1538:1: rule__IntegerAssignment__Group__1 : rule__IntegerAssignment__Group__1__Impl rule__IntegerAssignment__Group__2 ;
    public final void rule__IntegerAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1542:1: ( rule__IntegerAssignment__Group__1__Impl rule__IntegerAssignment__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1543:2: rule__IntegerAssignment__Group__1__Impl rule__IntegerAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__1__Impl_in_rule__IntegerAssignment__Group__13059);
            rule__IntegerAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__2_in_rule__IntegerAssignment__Group__13062);
            rule__IntegerAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__1"


    // $ANTLR start "rule__IntegerAssignment__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1550:1: rule__IntegerAssignment__Group__1__Impl : ( '(' ) ;
    public final void rule__IntegerAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1554:1: ( ( '(' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1555:1: ( '(' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1555:1: ( '(' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1556:1: '('
            {
             before(grammarAccess.getIntegerAssignmentAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__IntegerAssignment__Group__1__Impl3090); 
             after(grammarAccess.getIntegerAssignmentAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__1__Impl"


    // $ANTLR start "rule__IntegerAssignment__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1569:1: rule__IntegerAssignment__Group__2 : rule__IntegerAssignment__Group__2__Impl rule__IntegerAssignment__Group__3 ;
    public final void rule__IntegerAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1573:1: ( rule__IntegerAssignment__Group__2__Impl rule__IntegerAssignment__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1574:2: rule__IntegerAssignment__Group__2__Impl rule__IntegerAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__2__Impl_in_rule__IntegerAssignment__Group__23121);
            rule__IntegerAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__3_in_rule__IntegerAssignment__Group__23124);
            rule__IntegerAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__2"


    // $ANTLR start "rule__IntegerAssignment__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1581:1: rule__IntegerAssignment__Group__2__Impl : ( ( rule__IntegerAssignment__VarAssignment_2 ) ) ;
    public final void rule__IntegerAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1585:1: ( ( ( rule__IntegerAssignment__VarAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1586:1: ( ( rule__IntegerAssignment__VarAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1586:1: ( ( rule__IntegerAssignment__VarAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1587:1: ( rule__IntegerAssignment__VarAssignment_2 )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getVarAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1588:1: ( rule__IntegerAssignment__VarAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1588:2: rule__IntegerAssignment__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__VarAssignment_2_in_rule__IntegerAssignment__Group__2__Impl3151);
            rule__IntegerAssignment__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAssignmentAccess().getVarAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__2__Impl"


    // $ANTLR start "rule__IntegerAssignment__Group__3"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1598:1: rule__IntegerAssignment__Group__3 : rule__IntegerAssignment__Group__3__Impl rule__IntegerAssignment__Group__4 ;
    public final void rule__IntegerAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1602:1: ( rule__IntegerAssignment__Group__3__Impl rule__IntegerAssignment__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1603:2: rule__IntegerAssignment__Group__3__Impl rule__IntegerAssignment__Group__4
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__3__Impl_in_rule__IntegerAssignment__Group__33181);
            rule__IntegerAssignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__4_in_rule__IntegerAssignment__Group__33184);
            rule__IntegerAssignment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__3"


    // $ANTLR start "rule__IntegerAssignment__Group__3__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1610:1: rule__IntegerAssignment__Group__3__Impl : ( ')' ) ;
    public final void rule__IntegerAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1614:1: ( ( ')' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1615:1: ( ')' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1615:1: ( ')' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1616:1: ')'
            {
             before(grammarAccess.getIntegerAssignmentAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__IntegerAssignment__Group__3__Impl3212); 
             after(grammarAccess.getIntegerAssignmentAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__3__Impl"


    // $ANTLR start "rule__IntegerAssignment__Group__4"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1629:1: rule__IntegerAssignment__Group__4 : rule__IntegerAssignment__Group__4__Impl rule__IntegerAssignment__Group__5 ;
    public final void rule__IntegerAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1633:1: ( rule__IntegerAssignment__Group__4__Impl rule__IntegerAssignment__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1634:2: rule__IntegerAssignment__Group__4__Impl rule__IntegerAssignment__Group__5
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__4__Impl_in_rule__IntegerAssignment__Group__43243);
            rule__IntegerAssignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__5_in_rule__IntegerAssignment__Group__43246);
            rule__IntegerAssignment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__4"


    // $ANTLR start "rule__IntegerAssignment__Group__4__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1641:1: rule__IntegerAssignment__Group__4__Impl : ( ':=' ) ;
    public final void rule__IntegerAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1645:1: ( ( ':=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1646:1: ( ':=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1646:1: ( ':=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1647:1: ':='
            {
             before(grammarAccess.getIntegerAssignmentAccess().getColonEqualsSignKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__IntegerAssignment__Group__4__Impl3274); 
             after(grammarAccess.getIntegerAssignmentAccess().getColonEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__4__Impl"


    // $ANTLR start "rule__IntegerAssignment__Group__5"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1660:1: rule__IntegerAssignment__Group__5 : rule__IntegerAssignment__Group__5__Impl rule__IntegerAssignment__Group__6 ;
    public final void rule__IntegerAssignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1664:1: ( rule__IntegerAssignment__Group__5__Impl rule__IntegerAssignment__Group__6 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1665:2: rule__IntegerAssignment__Group__5__Impl rule__IntegerAssignment__Group__6
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__5__Impl_in_rule__IntegerAssignment__Group__53305);
            rule__IntegerAssignment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__6_in_rule__IntegerAssignment__Group__53308);
            rule__IntegerAssignment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__5"


    // $ANTLR start "rule__IntegerAssignment__Group__5__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1672:1: rule__IntegerAssignment__Group__5__Impl : ( ( rule__IntegerAssignment__ValueAssignment_5 ) ) ;
    public final void rule__IntegerAssignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1676:1: ( ( ( rule__IntegerAssignment__ValueAssignment_5 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1677:1: ( ( rule__IntegerAssignment__ValueAssignment_5 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1677:1: ( ( rule__IntegerAssignment__ValueAssignment_5 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1678:1: ( rule__IntegerAssignment__ValueAssignment_5 )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getValueAssignment_5()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1679:1: ( rule__IntegerAssignment__ValueAssignment_5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1679:2: rule__IntegerAssignment__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__ValueAssignment_5_in_rule__IntegerAssignment__Group__5__Impl3335);
            rule__IntegerAssignment__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAssignmentAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__5__Impl"


    // $ANTLR start "rule__IntegerAssignment__Group__6"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1689:1: rule__IntegerAssignment__Group__6 : rule__IntegerAssignment__Group__6__Impl ;
    public final void rule__IntegerAssignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1693:1: ( rule__IntegerAssignment__Group__6__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1694:2: rule__IntegerAssignment__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__6__Impl_in_rule__IntegerAssignment__Group__63365);
            rule__IntegerAssignment__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__6"


    // $ANTLR start "rule__IntegerAssignment__Group__6__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1700:1: rule__IntegerAssignment__Group__6__Impl : ( ';' ) ;
    public final void rule__IntegerAssignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1704:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1705:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1705:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1706:1: ';'
            {
             before(grammarAccess.getIntegerAssignmentAccess().getSemicolonKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__IntegerAssignment__Group__6__Impl3393); 
             after(grammarAccess.getIntegerAssignmentAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__6__Impl"


    // $ANTLR start "rule__StateAssignment__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1733:1: rule__StateAssignment__Group__0 : rule__StateAssignment__Group__0__Impl rule__StateAssignment__Group__1 ;
    public final void rule__StateAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1737:1: ( rule__StateAssignment__Group__0__Impl rule__StateAssignment__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1738:2: rule__StateAssignment__Group__0__Impl rule__StateAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__0__Impl_in_rule__StateAssignment__Group__03438);
            rule__StateAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__1_in_rule__StateAssignment__Group__03441);
            rule__StateAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__0"


    // $ANTLR start "rule__StateAssignment__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1745:1: rule__StateAssignment__Group__0__Impl : ( 'init' ) ;
    public final void rule__StateAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1749:1: ( ( 'init' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1750:1: ( 'init' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1750:1: ( 'init' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1751:1: 'init'
            {
             before(grammarAccess.getStateAssignmentAccess().getInitKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__StateAssignment__Group__0__Impl3469); 
             after(grammarAccess.getStateAssignmentAccess().getInitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__0__Impl"


    // $ANTLR start "rule__StateAssignment__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1764:1: rule__StateAssignment__Group__1 : rule__StateAssignment__Group__1__Impl rule__StateAssignment__Group__2 ;
    public final void rule__StateAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1768:1: ( rule__StateAssignment__Group__1__Impl rule__StateAssignment__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1769:2: rule__StateAssignment__Group__1__Impl rule__StateAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__1__Impl_in_rule__StateAssignment__Group__13500);
            rule__StateAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__2_in_rule__StateAssignment__Group__13503);
            rule__StateAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__1"


    // $ANTLR start "rule__StateAssignment__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1776:1: rule__StateAssignment__Group__1__Impl : ( '(' ) ;
    public final void rule__StateAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1780:1: ( ( '(' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1781:1: ( '(' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1781:1: ( '(' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1782:1: '('
            {
             before(grammarAccess.getStateAssignmentAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__StateAssignment__Group__1__Impl3531); 
             after(grammarAccess.getStateAssignmentAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__1__Impl"


    // $ANTLR start "rule__StateAssignment__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1795:1: rule__StateAssignment__Group__2 : rule__StateAssignment__Group__2__Impl rule__StateAssignment__Group__3 ;
    public final void rule__StateAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1799:1: ( rule__StateAssignment__Group__2__Impl rule__StateAssignment__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1800:2: rule__StateAssignment__Group__2__Impl rule__StateAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__2__Impl_in_rule__StateAssignment__Group__23562);
            rule__StateAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__3_in_rule__StateAssignment__Group__23565);
            rule__StateAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__2"


    // $ANTLR start "rule__StateAssignment__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1807:1: rule__StateAssignment__Group__2__Impl : ( ( rule__StateAssignment__VarAssignment_2 ) ) ;
    public final void rule__StateAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1811:1: ( ( ( rule__StateAssignment__VarAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1812:1: ( ( rule__StateAssignment__VarAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1812:1: ( ( rule__StateAssignment__VarAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1813:1: ( rule__StateAssignment__VarAssignment_2 )
            {
             before(grammarAccess.getStateAssignmentAccess().getVarAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1814:1: ( rule__StateAssignment__VarAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1814:2: rule__StateAssignment__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__StateAssignment__VarAssignment_2_in_rule__StateAssignment__Group__2__Impl3592);
            rule__StateAssignment__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAssignmentAccess().getVarAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__2__Impl"


    // $ANTLR start "rule__StateAssignment__Group__3"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1824:1: rule__StateAssignment__Group__3 : rule__StateAssignment__Group__3__Impl rule__StateAssignment__Group__4 ;
    public final void rule__StateAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1828:1: ( rule__StateAssignment__Group__3__Impl rule__StateAssignment__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1829:2: rule__StateAssignment__Group__3__Impl rule__StateAssignment__Group__4
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__3__Impl_in_rule__StateAssignment__Group__33622);
            rule__StateAssignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__4_in_rule__StateAssignment__Group__33625);
            rule__StateAssignment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__3"


    // $ANTLR start "rule__StateAssignment__Group__3__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1836:1: rule__StateAssignment__Group__3__Impl : ( ')' ) ;
    public final void rule__StateAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1840:1: ( ( ')' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1841:1: ( ')' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1841:1: ( ')' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1842:1: ')'
            {
             before(grammarAccess.getStateAssignmentAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__StateAssignment__Group__3__Impl3653); 
             after(grammarAccess.getStateAssignmentAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__3__Impl"


    // $ANTLR start "rule__StateAssignment__Group__4"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1855:1: rule__StateAssignment__Group__4 : rule__StateAssignment__Group__4__Impl rule__StateAssignment__Group__5 ;
    public final void rule__StateAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1859:1: ( rule__StateAssignment__Group__4__Impl rule__StateAssignment__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1860:2: rule__StateAssignment__Group__4__Impl rule__StateAssignment__Group__5
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__4__Impl_in_rule__StateAssignment__Group__43684);
            rule__StateAssignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__5_in_rule__StateAssignment__Group__43687);
            rule__StateAssignment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__4"


    // $ANTLR start "rule__StateAssignment__Group__4__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1867:1: rule__StateAssignment__Group__4__Impl : ( ':=' ) ;
    public final void rule__StateAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1871:1: ( ( ':=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1872:1: ( ':=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1872:1: ( ':=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1873:1: ':='
            {
             before(grammarAccess.getStateAssignmentAccess().getColonEqualsSignKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__StateAssignment__Group__4__Impl3715); 
             after(grammarAccess.getStateAssignmentAccess().getColonEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__4__Impl"


    // $ANTLR start "rule__StateAssignment__Group__5"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1886:1: rule__StateAssignment__Group__5 : rule__StateAssignment__Group__5__Impl rule__StateAssignment__Group__6 ;
    public final void rule__StateAssignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1890:1: ( rule__StateAssignment__Group__5__Impl rule__StateAssignment__Group__6 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1891:2: rule__StateAssignment__Group__5__Impl rule__StateAssignment__Group__6
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__5__Impl_in_rule__StateAssignment__Group__53746);
            rule__StateAssignment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__6_in_rule__StateAssignment__Group__53749);
            rule__StateAssignment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__5"


    // $ANTLR start "rule__StateAssignment__Group__5__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1898:1: rule__StateAssignment__Group__5__Impl : ( ( rule__StateAssignment__ValueAssignment_5 ) ) ;
    public final void rule__StateAssignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1902:1: ( ( ( rule__StateAssignment__ValueAssignment_5 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1903:1: ( ( rule__StateAssignment__ValueAssignment_5 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1903:1: ( ( rule__StateAssignment__ValueAssignment_5 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1904:1: ( rule__StateAssignment__ValueAssignment_5 )
            {
             before(grammarAccess.getStateAssignmentAccess().getValueAssignment_5()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1905:1: ( rule__StateAssignment__ValueAssignment_5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1905:2: rule__StateAssignment__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__StateAssignment__ValueAssignment_5_in_rule__StateAssignment__Group__5__Impl3776);
            rule__StateAssignment__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStateAssignmentAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__5__Impl"


    // $ANTLR start "rule__StateAssignment__Group__6"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1915:1: rule__StateAssignment__Group__6 : rule__StateAssignment__Group__6__Impl ;
    public final void rule__StateAssignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1919:1: ( rule__StateAssignment__Group__6__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1920:2: rule__StateAssignment__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__6__Impl_in_rule__StateAssignment__Group__63806);
            rule__StateAssignment__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__6"


    // $ANTLR start "rule__StateAssignment__Group__6__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1926:1: rule__StateAssignment__Group__6__Impl : ( ';' ) ;
    public final void rule__StateAssignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1930:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1931:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1931:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1932:1: ';'
            {
             before(grammarAccess.getStateAssignmentAccess().getSemicolonKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__StateAssignment__Group__6__Impl3834); 
             after(grammarAccess.getStateAssignmentAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__Group__6__Impl"


    // $ANTLR start "rule__Model__SectionsAssignment"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1960:1: rule__Model__SectionsAssignment : ( ruleSection ) ;
    public final void rule__Model__SectionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1964:1: ( ( ruleSection ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1965:1: ( ruleSection )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1965:1: ( ruleSection )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1966:1: ruleSection
            {
             before(grammarAccess.getModelAccess().getSectionsSectionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Model__SectionsAssignment3884);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSectionsSectionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SectionsAssignment"


    // $ANTLR start "rule__VariablesSection__VariablesAssignment_2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1975:1: rule__VariablesSection__VariablesAssignment_2 : ( ruleVariableDeclaration ) ;
    public final void rule__VariablesSection__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1979:1: ( ( ruleVariableDeclaration ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1980:1: ( ruleVariableDeclaration )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1980:1: ( ruleVariableDeclaration )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1981:1: ruleVariableDeclaration
            {
             before(grammarAccess.getVariablesSectionAccess().getVariablesVariableDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__VariablesSection__VariablesAssignment_23915);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariablesSectionAccess().getVariablesVariableDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariablesSection__VariablesAssignment_2"


    // $ANTLR start "rule__Assignments__AssignmentsAssignment_2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1990:1: rule__Assignments__AssignmentsAssignment_2 : ( ruleAssignmentExpression ) ;
    public final void rule__Assignments__AssignmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1994:1: ( ( ruleAssignmentExpression ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1995:1: ( ruleAssignmentExpression )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1995:1: ( ruleAssignmentExpression )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1996:1: ruleAssignmentExpression
            {
             before(grammarAccess.getAssignmentsAccess().getAssignmentsAssignmentExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_rule__Assignments__AssignmentsAssignment_23946);
            ruleAssignmentExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentsAccess().getAssignmentsAssignmentExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__AssignmentsAssignment_2"


    // $ANTLR start "rule__IntegerDeclarion__NameAssignment_0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2005:1: rule__IntegerDeclarion__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IntegerDeclarion__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2009:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2010:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2010:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2011:1: RULE_ID
            {
             before(grammarAccess.getIntegerDeclarionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerDeclarion__NameAssignment_03977); 
             after(grammarAccess.getIntegerDeclarionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerDeclarion__NameAssignment_0"


    // $ANTLR start "rule__BooleanDeclarion__NameAssignment_0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2020:1: rule__BooleanDeclarion__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BooleanDeclarion__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2024:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2025:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2025:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2026:1: RULE_ID
            {
             before(grammarAccess.getBooleanDeclarionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BooleanDeclarion__NameAssignment_04008); 
             after(grammarAccess.getBooleanDeclarionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanDeclarion__NameAssignment_0"


    // $ANTLR start "rule__StateVariableDeclaration__NameAssignment_0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2035:1: rule__StateVariableDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__StateVariableDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2039:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2040:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2040:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2041:1: RULE_ID
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__NameAssignment_04039); 
             after(grammarAccess.getStateVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__NameAssignment_0"


    // $ANTLR start "rule__StateVariableDeclaration__StatesAssignment_3"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2050:1: rule__StateVariableDeclaration__StatesAssignment_3 : ( RULE_ID ) ;
    public final void rule__StateVariableDeclaration__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2054:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2055:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2055:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2056:1: RULE_ID
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getStatesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__StatesAssignment_34070); 
             after(grammarAccess.getStateVariableDeclarationAccess().getStatesIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__StatesAssignment_3"


    // $ANTLR start "rule__StateVariableDeclaration__StatesAssignment_4_1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2065:1: rule__StateVariableDeclaration__StatesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__StateVariableDeclaration__StatesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2069:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2070:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2070:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2071:1: RULE_ID
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getStatesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__StatesAssignment_4_14101); 
             after(grammarAccess.getStateVariableDeclarationAccess().getStatesIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateVariableDeclaration__StatesAssignment_4_1"


    // $ANTLR start "rule__BooleanAssignment__VarAssignment_2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2080:1: rule__BooleanAssignment__VarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BooleanAssignment__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2084:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2085:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2085:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2086:1: ( RULE_ID )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getVarBooleanDeclarionCrossReference_2_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2087:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2088:1: RULE_ID
            {
             before(grammarAccess.getBooleanAssignmentAccess().getVarBooleanDeclarionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BooleanAssignment__VarAssignment_24136); 
             after(grammarAccess.getBooleanAssignmentAccess().getVarBooleanDeclarionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBooleanAssignmentAccess().getVarBooleanDeclarionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__VarAssignment_2"


    // $ANTLR start "rule__BooleanAssignment__ValueAssignment_5"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2099:1: rule__BooleanAssignment__ValueAssignment_5 : ( ruleBOOL ) ;
    public final void rule__BooleanAssignment__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2103:1: ( ( ruleBOOL ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2104:1: ( ruleBOOL )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2104:1: ( ruleBOOL )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2105:1: ruleBOOL
            {
             before(grammarAccess.getBooleanAssignmentAccess().getValueBOOLParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBOOL_in_rule__BooleanAssignment__ValueAssignment_54171);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getBooleanAssignmentAccess().getValueBOOLParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__ValueAssignment_5"


    // $ANTLR start "rule__IntegerAssignment__VarAssignment_2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2114:1: rule__IntegerAssignment__VarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__IntegerAssignment__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2118:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2119:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2119:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2120:1: ( RULE_ID )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getVarIntegerDeclarionCrossReference_2_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2121:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2122:1: RULE_ID
            {
             before(grammarAccess.getIntegerAssignmentAccess().getVarIntegerDeclarionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerAssignment__VarAssignment_24206); 
             after(grammarAccess.getIntegerAssignmentAccess().getVarIntegerDeclarionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getIntegerAssignmentAccess().getVarIntegerDeclarionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__VarAssignment_2"


    // $ANTLR start "rule__IntegerAssignment__ValueAssignment_5"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2133:1: rule__IntegerAssignment__ValueAssignment_5 : ( RULE_INT ) ;
    public final void rule__IntegerAssignment__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2137:1: ( ( RULE_INT ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2138:1: ( RULE_INT )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2138:1: ( RULE_INT )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2139:1: RULE_INT
            {
             before(grammarAccess.getIntegerAssignmentAccess().getValueINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerAssignment__ValueAssignment_54241); 
             after(grammarAccess.getIntegerAssignmentAccess().getValueINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__ValueAssignment_5"


    // $ANTLR start "rule__StateAssignment__VarAssignment_2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2148:1: rule__StateAssignment__VarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StateAssignment__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2152:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2153:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2153:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2154:1: ( RULE_ID )
            {
             before(grammarAccess.getStateAssignmentAccess().getVarStateVariableDeclarationCrossReference_2_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2155:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2156:1: RULE_ID
            {
             before(grammarAccess.getStateAssignmentAccess().getVarStateVariableDeclarationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateAssignment__VarAssignment_24276); 
             after(grammarAccess.getStateAssignmentAccess().getVarStateVariableDeclarationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStateAssignmentAccess().getVarStateVariableDeclarationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__VarAssignment_2"


    // $ANTLR start "rule__StateAssignment__ValueAssignment_5"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2167:1: rule__StateAssignment__ValueAssignment_5 : ( RULE_ID ) ;
    public final void rule__StateAssignment__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2171:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2172:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2172:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2173:1: RULE_ID
            {
             before(grammarAccess.getStateAssignmentAccess().getValueIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateAssignment__ValueAssignment_54311); 
             after(grammarAccess.getStateAssignmentAccess().getValueIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateAssignment__ValueAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SectionsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Alternatives_in_ruleSection155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesSection_in_entryRuleVariablesSection182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablesSection189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesSection__Group__0_in_ruleVariablesSection215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignments_in_entryRuleAssignments242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignments249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignments__Group__0_in_ruleAssignments275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Alternatives_in_ruleVariableDeclaration335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDeclarion_in_entryRuleIntegerDeclarion362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerDeclarion369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__0_in_ruleIntegerDeclarion395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDeclarion_in_entryRuleBooleanDeclarion422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanDeclarion429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__0_in_ruleBooleanDeclarion455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateVariableDeclaration489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__0_in_ruleStateVariableDeclaration515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Alternatives_in_ruleAssignmentExpression575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAssignment609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__0_in_ruleBooleanAssignment635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerAssignment729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__0_in_ruleIntegerAssignment755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAssignment_in_entryRuleStateAssignment782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateAssignment789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__0_in_ruleStateAssignment815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesSection_in_rule__Section__Alternatives851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignments_in_rule__Section__Alternatives868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDeclarion_in_rule__VariableDeclaration__Alternatives900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDeclarion_in_rule__VariableDeclaration__Alternatives917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_rule__VariableDeclaration__Alternatives934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAssignment_in_rule__AssignmentExpression__Alternatives966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAssignment_in_rule__AssignmentExpression__Alternatives983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAssignment_in_rule__AssignmentExpression__Alternatives1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BOOL__Alternatives1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BOOL__Alternatives1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesSection__Group__0__Impl_in_rule__VariablesSection__Group__01085 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__VariablesSection__Group__1_in_rule__VariablesSection__Group__01088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesSection__Group__1__Impl_in_rule__VariablesSection__Group__11146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariablesSection__Group__2_in_rule__VariablesSection__Group__11149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VariablesSection__Group__1__Impl1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesSection__Group__2__Impl_in_rule__VariablesSection__Group__21208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesSection__VariablesAssignment_2_in_rule__VariablesSection__Group__2__Impl1237 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__VariablesSection__VariablesAssignment_2_in_rule__VariablesSection__Group__2__Impl1249 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Assignments__Group__0__Impl_in_rule__Assignments__Group__01288 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Assignments__Group__1_in_rule__Assignments__Group__01291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignments__Group__1__Impl_in_rule__Assignments__Group__11349 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Assignments__Group__2_in_rule__Assignments__Group__11352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Assignments__Group__1__Impl1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignments__Group__2__Impl_in_rule__Assignments__Group__21411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignments__AssignmentsAssignment_2_in_rule__Assignments__Group__2__Impl1440 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Assignments__AssignmentsAssignment_2_in_rule__Assignments__Group__2__Impl1452 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__0__Impl_in_rule__IntegerDeclarion__Group__01491 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__1_in_rule__IntegerDeclarion__Group__01494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__NameAssignment_0_in_rule__IntegerDeclarion__Group__0__Impl1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__1__Impl_in_rule__IntegerDeclarion__Group__11551 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__2_in_rule__IntegerDeclarion__Group__11554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__IntegerDeclarion__Group__1__Impl1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__2__Impl_in_rule__IntegerDeclarion__Group__21613 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__3_in_rule__IntegerDeclarion__Group__21616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__IntegerDeclarion__Group__2__Impl1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__3__Impl_in_rule__IntegerDeclarion__Group__31675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__IntegerDeclarion__Group__3__Impl1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__0__Impl_in_rule__BooleanDeclarion__Group__01742 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__1_in_rule__BooleanDeclarion__Group__01745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__NameAssignment_0_in_rule__BooleanDeclarion__Group__0__Impl1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__1__Impl_in_rule__BooleanDeclarion__Group__11802 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__2_in_rule__BooleanDeclarion__Group__11805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BooleanDeclarion__Group__1__Impl1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__2__Impl_in_rule__BooleanDeclarion__Group__21864 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__3_in_rule__BooleanDeclarion__Group__21867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BooleanDeclarion__Group__2__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__3__Impl_in_rule__BooleanDeclarion__Group__31926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BooleanDeclarion__Group__3__Impl1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__0__Impl_in_rule__StateVariableDeclaration__Group__01993 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__1_in_rule__StateVariableDeclaration__Group__01996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__NameAssignment_0_in_rule__StateVariableDeclaration__Group__0__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__1__Impl_in_rule__StateVariableDeclaration__Group__12053 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__2_in_rule__StateVariableDeclaration__Group__12056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__StateVariableDeclaration__Group__1__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__2__Impl_in_rule__StateVariableDeclaration__Group__22115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__3_in_rule__StateVariableDeclaration__Group__22118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StateVariableDeclaration__Group__2__Impl2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__3__Impl_in_rule__StateVariableDeclaration__Group__32177 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__4_in_rule__StateVariableDeclaration__Group__32180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__StatesAssignment_3_in_rule__StateVariableDeclaration__Group__3__Impl2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__4__Impl_in_rule__StateVariableDeclaration__Group__42237 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__5_in_rule__StateVariableDeclaration__Group__42240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group_4__0_in_rule__StateVariableDeclaration__Group__4__Impl2267 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__5__Impl_in_rule__StateVariableDeclaration__Group__52298 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__6_in_rule__StateVariableDeclaration__Group__52301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StateVariableDeclaration__Group__5__Impl2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__6__Impl_in_rule__StateVariableDeclaration__Group__62360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StateVariableDeclaration__Group__6__Impl2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group_4__0__Impl_in_rule__StateVariableDeclaration__Group_4__02433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group_4__1_in_rule__StateVariableDeclaration__Group_4__02436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StateVariableDeclaration__Group_4__0__Impl2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group_4__1__Impl_in_rule__StateVariableDeclaration__Group_4__12495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__StatesAssignment_4_1_in_rule__StateVariableDeclaration__Group_4__1__Impl2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__0__Impl_in_rule__BooleanAssignment__Group__02556 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__1_in_rule__BooleanAssignment__Group__02559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BooleanAssignment__Group__0__Impl2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__1__Impl_in_rule__BooleanAssignment__Group__12618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__2_in_rule__BooleanAssignment__Group__12621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BooleanAssignment__Group__1__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__2__Impl_in_rule__BooleanAssignment__Group__22680 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__3_in_rule__BooleanAssignment__Group__22683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__VarAssignment_2_in_rule__BooleanAssignment__Group__2__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__3__Impl_in_rule__BooleanAssignment__Group__32740 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__4_in_rule__BooleanAssignment__Group__32743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BooleanAssignment__Group__3__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__4__Impl_in_rule__BooleanAssignment__Group__42802 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__5_in_rule__BooleanAssignment__Group__42805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BooleanAssignment__Group__4__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__5__Impl_in_rule__BooleanAssignment__Group__52864 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__6_in_rule__BooleanAssignment__Group__52867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__ValueAssignment_5_in_rule__BooleanAssignment__Group__5__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__6__Impl_in_rule__BooleanAssignment__Group__62924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BooleanAssignment__Group__6__Impl2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__0__Impl_in_rule__IntegerAssignment__Group__02997 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__1_in_rule__IntegerAssignment__Group__03000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IntegerAssignment__Group__0__Impl3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__1__Impl_in_rule__IntegerAssignment__Group__13059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__2_in_rule__IntegerAssignment__Group__13062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IntegerAssignment__Group__1__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__2__Impl_in_rule__IntegerAssignment__Group__23121 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__3_in_rule__IntegerAssignment__Group__23124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__VarAssignment_2_in_rule__IntegerAssignment__Group__2__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__3__Impl_in_rule__IntegerAssignment__Group__33181 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__4_in_rule__IntegerAssignment__Group__33184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IntegerAssignment__Group__3__Impl3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__4__Impl_in_rule__IntegerAssignment__Group__43243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__5_in_rule__IntegerAssignment__Group__43246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IntegerAssignment__Group__4__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__5__Impl_in_rule__IntegerAssignment__Group__53305 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__6_in_rule__IntegerAssignment__Group__53308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__ValueAssignment_5_in_rule__IntegerAssignment__Group__5__Impl3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__6__Impl_in_rule__IntegerAssignment__Group__63365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__IntegerAssignment__Group__6__Impl3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__0__Impl_in_rule__StateAssignment__Group__03438 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__1_in_rule__StateAssignment__Group__03441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StateAssignment__Group__0__Impl3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__1__Impl_in_rule__StateAssignment__Group__13500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__2_in_rule__StateAssignment__Group__13503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StateAssignment__Group__1__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__2__Impl_in_rule__StateAssignment__Group__23562 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__3_in_rule__StateAssignment__Group__23565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__VarAssignment_2_in_rule__StateAssignment__Group__2__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__3__Impl_in_rule__StateAssignment__Group__33622 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__4_in_rule__StateAssignment__Group__33625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StateAssignment__Group__3__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__4__Impl_in_rule__StateAssignment__Group__43684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__5_in_rule__StateAssignment__Group__43687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StateAssignment__Group__4__Impl3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__5__Impl_in_rule__StateAssignment__Group__53746 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__6_in_rule__StateAssignment__Group__53749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__ValueAssignment_5_in_rule__StateAssignment__Group__5__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__6__Impl_in_rule__StateAssignment__Group__63806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StateAssignment__Group__6__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Model__SectionsAssignment3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__VariablesSection__VariablesAssignment_23915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_rule__Assignments__AssignmentsAssignment_23946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerDeclarion__NameAssignment_03977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanDeclarion__NameAssignment_04008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__NameAssignment_04039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__StatesAssignment_34070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__StatesAssignment_4_14101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanAssignment__VarAssignment_24136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__BooleanAssignment__ValueAssignment_54171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerAssignment__VarAssignment_24206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerAssignment__ValueAssignment_54241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateAssignment__VarAssignment_24276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateAssignment__ValueAssignment_54311 = new BitSet(new long[]{0x0000000000000002L});

}