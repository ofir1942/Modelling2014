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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SMV_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'True'", "'False'", "'VAR'", "'ASSIGN'", "':'", "'integer'", "';'", "'boolean'", "'{'", "'}'", "','", "'init'", "'('", "')'", "':='"
    };
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_SMV_COMMENT=4;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

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

                if ( ((LA1_0>=14 && LA1_0<=15)) ) {
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


    // $ANTLR start "entryRuleComment"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:116:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:117:1: ( ruleComment EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:118:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment182);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment189); 

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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:125:1: ruleComment : ( ( rule__Comment__CommentAssignment ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:129:2: ( ( ( rule__Comment__CommentAssignment ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:130:1: ( ( rule__Comment__CommentAssignment ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:130:1: ( ( rule__Comment__CommentAssignment ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:131:1: ( rule__Comment__CommentAssignment )
            {
             before(grammarAccess.getCommentAccess().getCommentAssignment()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:132:1: ( rule__Comment__CommentAssignment )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:132:2: rule__Comment__CommentAssignment
            {
            pushFollow(FOLLOW_rule__Comment__CommentAssignment_in_ruleComment215);
            rule__Comment__CommentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getCommentAssignment()); 

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleVariablesSection"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:144:1: entryRuleVariablesSection : ruleVariablesSection EOF ;
    public final void entryRuleVariablesSection() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:145:1: ( ruleVariablesSection EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:146:1: ruleVariablesSection EOF
            {
             before(grammarAccess.getVariablesSectionRule()); 
            pushFollow(FOLLOW_ruleVariablesSection_in_entryRuleVariablesSection242);
            ruleVariablesSection();

            state._fsp--;

             after(grammarAccess.getVariablesSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablesSection249); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:153:1: ruleVariablesSection : ( ( rule__VariablesSection__Group__0 ) ) ;
    public final void ruleVariablesSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:157:2: ( ( ( rule__VariablesSection__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:158:1: ( ( rule__VariablesSection__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:158:1: ( ( rule__VariablesSection__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:159:1: ( rule__VariablesSection__Group__0 )
            {
             before(grammarAccess.getVariablesSectionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:160:1: ( rule__VariablesSection__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:160:2: rule__VariablesSection__Group__0
            {
            pushFollow(FOLLOW_rule__VariablesSection__Group__0_in_ruleVariablesSection275);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:172:1: entryRuleAssignments : ruleAssignments EOF ;
    public final void entryRuleAssignments() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:173:1: ( ruleAssignments EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:174:1: ruleAssignments EOF
            {
             before(grammarAccess.getAssignmentsRule()); 
            pushFollow(FOLLOW_ruleAssignments_in_entryRuleAssignments302);
            ruleAssignments();

            state._fsp--;

             after(grammarAccess.getAssignmentsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignments309); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:181:1: ruleAssignments : ( ( rule__Assignments__Group__0 ) ) ;
    public final void ruleAssignments() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:185:2: ( ( ( rule__Assignments__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:186:1: ( ( rule__Assignments__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:186:1: ( ( rule__Assignments__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:187:1: ( rule__Assignments__Group__0 )
            {
             before(grammarAccess.getAssignmentsAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:188:1: ( rule__Assignments__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:188:2: rule__Assignments__Group__0
            {
            pushFollow(FOLLOW_rule__Assignments__Group__0_in_ruleAssignments335);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:200:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:201:1: ( ruleVariableDeclaration EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:202:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration362);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration369); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:209:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Alternatives ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:213:2: ( ( ( rule__VariableDeclaration__Alternatives ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:214:1: ( ( rule__VariableDeclaration__Alternatives ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:214:1: ( ( rule__VariableDeclaration__Alternatives ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:215:1: ( rule__VariableDeclaration__Alternatives )
            {
             before(grammarAccess.getVariableDeclarationAccess().getAlternatives()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:216:1: ( rule__VariableDeclaration__Alternatives )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:216:2: rule__VariableDeclaration__Alternatives
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Alternatives_in_ruleVariableDeclaration395);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:228:1: entryRuleIntegerDeclarion : ruleIntegerDeclarion EOF ;
    public final void entryRuleIntegerDeclarion() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:229:1: ( ruleIntegerDeclarion EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:230:1: ruleIntegerDeclarion EOF
            {
             before(grammarAccess.getIntegerDeclarionRule()); 
            pushFollow(FOLLOW_ruleIntegerDeclarion_in_entryRuleIntegerDeclarion422);
            ruleIntegerDeclarion();

            state._fsp--;

             after(grammarAccess.getIntegerDeclarionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerDeclarion429); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:237:1: ruleIntegerDeclarion : ( ( rule__IntegerDeclarion__Group__0 ) ) ;
    public final void ruleIntegerDeclarion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:241:2: ( ( ( rule__IntegerDeclarion__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:242:1: ( ( rule__IntegerDeclarion__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:242:1: ( ( rule__IntegerDeclarion__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:243:1: ( rule__IntegerDeclarion__Group__0 )
            {
             before(grammarAccess.getIntegerDeclarionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:244:1: ( rule__IntegerDeclarion__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:244:2: rule__IntegerDeclarion__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__0_in_ruleIntegerDeclarion455);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:256:1: entryRuleBooleanDeclarion : ruleBooleanDeclarion EOF ;
    public final void entryRuleBooleanDeclarion() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:257:1: ( ruleBooleanDeclarion EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:258:1: ruleBooleanDeclarion EOF
            {
             before(grammarAccess.getBooleanDeclarionRule()); 
            pushFollow(FOLLOW_ruleBooleanDeclarion_in_entryRuleBooleanDeclarion482);
            ruleBooleanDeclarion();

            state._fsp--;

             after(grammarAccess.getBooleanDeclarionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanDeclarion489); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:265:1: ruleBooleanDeclarion : ( ( rule__BooleanDeclarion__Group__0 ) ) ;
    public final void ruleBooleanDeclarion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:269:2: ( ( ( rule__BooleanDeclarion__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:270:1: ( ( rule__BooleanDeclarion__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:270:1: ( ( rule__BooleanDeclarion__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:271:1: ( rule__BooleanDeclarion__Group__0 )
            {
             before(grammarAccess.getBooleanDeclarionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:272:1: ( rule__BooleanDeclarion__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:272:2: rule__BooleanDeclarion__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__0_in_ruleBooleanDeclarion515);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:284:1: entryRuleStateVariableDeclaration : ruleStateVariableDeclaration EOF ;
    public final void entryRuleStateVariableDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:285:1: ( ruleStateVariableDeclaration EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:286:1: ruleStateVariableDeclaration EOF
            {
             before(grammarAccess.getStateVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration542);
            ruleStateVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getStateVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateVariableDeclaration549); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:293:1: ruleStateVariableDeclaration : ( ( rule__StateVariableDeclaration__Group__0 ) ) ;
    public final void ruleStateVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:297:2: ( ( ( rule__StateVariableDeclaration__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:298:1: ( ( rule__StateVariableDeclaration__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:298:1: ( ( rule__StateVariableDeclaration__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:299:1: ( rule__StateVariableDeclaration__Group__0 )
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:300:1: ( rule__StateVariableDeclaration__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:300:2: rule__StateVariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__0_in_ruleStateVariableDeclaration575);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:312:1: entryRuleAssignmentExpression : ruleAssignmentExpression EOF ;
    public final void entryRuleAssignmentExpression() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:313:1: ( ruleAssignmentExpression EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:314:1: ruleAssignmentExpression EOF
            {
             before(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression602);
            ruleAssignmentExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression609); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:321:1: ruleAssignmentExpression : ( ( rule__AssignmentExpression__Alternatives ) ) ;
    public final void ruleAssignmentExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:325:2: ( ( ( rule__AssignmentExpression__Alternatives ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:326:1: ( ( rule__AssignmentExpression__Alternatives ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:326:1: ( ( rule__AssignmentExpression__Alternatives ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:327:1: ( rule__AssignmentExpression__Alternatives )
            {
             before(grammarAccess.getAssignmentExpressionAccess().getAlternatives()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:328:1: ( rule__AssignmentExpression__Alternatives )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:328:2: rule__AssignmentExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__Alternatives_in_ruleAssignmentExpression635);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:340:1: entryRuleBooleanAssignment : ruleBooleanAssignment EOF ;
    public final void entryRuleBooleanAssignment() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:341:1: ( ruleBooleanAssignment EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:342:1: ruleBooleanAssignment EOF
            {
             before(grammarAccess.getBooleanAssignmentRule()); 
            pushFollow(FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment662);
            ruleBooleanAssignment();

            state._fsp--;

             after(grammarAccess.getBooleanAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAssignment669); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:349:1: ruleBooleanAssignment : ( ( rule__BooleanAssignment__Group__0 ) ) ;
    public final void ruleBooleanAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:353:2: ( ( ( rule__BooleanAssignment__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:354:1: ( ( rule__BooleanAssignment__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:354:1: ( ( rule__BooleanAssignment__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:355:1: ( rule__BooleanAssignment__Group__0 )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:356:1: ( rule__BooleanAssignment__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:356:2: rule__BooleanAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__0_in_ruleBooleanAssignment695);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:368:1: entryRuleBOOL : ruleBOOL EOF ;
    public final void entryRuleBOOL() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:369:1: ( ruleBOOL EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:370:1: ruleBOOL EOF
            {
             before(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL722);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getBOOLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL729); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:377:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:381:2: ( ( ( rule__BOOL__Alternatives ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:382:1: ( ( rule__BOOL__Alternatives ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:382:1: ( ( rule__BOOL__Alternatives ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:383:1: ( rule__BOOL__Alternatives )
            {
             before(grammarAccess.getBOOLAccess().getAlternatives()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:384:1: ( rule__BOOL__Alternatives )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:384:2: rule__BOOL__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL755);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:396:1: entryRuleIntegerAssignment : ruleIntegerAssignment EOF ;
    public final void entryRuleIntegerAssignment() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:397:1: ( ruleIntegerAssignment EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:398:1: ruleIntegerAssignment EOF
            {
             before(grammarAccess.getIntegerAssignmentRule()); 
            pushFollow(FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment782);
            ruleIntegerAssignment();

            state._fsp--;

             after(grammarAccess.getIntegerAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerAssignment789); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:405:1: ruleIntegerAssignment : ( ( rule__IntegerAssignment__Group__0 ) ) ;
    public final void ruleIntegerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:409:2: ( ( ( rule__IntegerAssignment__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:410:1: ( ( rule__IntegerAssignment__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:410:1: ( ( rule__IntegerAssignment__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:411:1: ( rule__IntegerAssignment__Group__0 )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:412:1: ( rule__IntegerAssignment__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:412:2: rule__IntegerAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__0_in_ruleIntegerAssignment815);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:424:1: entryRuleStateAssignment : ruleStateAssignment EOF ;
    public final void entryRuleStateAssignment() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:425:1: ( ruleStateAssignment EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:426:1: ruleStateAssignment EOF
            {
             before(grammarAccess.getStateAssignmentRule()); 
            pushFollow(FOLLOW_ruleStateAssignment_in_entryRuleStateAssignment842);
            ruleStateAssignment();

            state._fsp--;

             after(grammarAccess.getStateAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateAssignment849); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:433:1: ruleStateAssignment : ( ( rule__StateAssignment__Group__0 ) ) ;
    public final void ruleStateAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:437:2: ( ( ( rule__StateAssignment__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:438:1: ( ( rule__StateAssignment__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:438:1: ( ( rule__StateAssignment__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:439:1: ( rule__StateAssignment__Group__0 )
            {
             before(grammarAccess.getStateAssignmentAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:440:1: ( rule__StateAssignment__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:440:2: rule__StateAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__0_in_ruleStateAssignment875);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:452:1: rule__Section__Alternatives : ( ( ruleVariablesSection ) | ( ruleAssignments ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:456:1: ( ( ruleVariablesSection ) | ( ruleAssignments ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:457:1: ( ruleVariablesSection )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:457:1: ( ruleVariablesSection )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:458:1: ruleVariablesSection
                    {
                     before(grammarAccess.getSectionAccess().getVariablesSectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVariablesSection_in_rule__Section__Alternatives911);
                    ruleVariablesSection();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getVariablesSectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:463:6: ( ruleAssignments )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:463:6: ( ruleAssignments )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:464:1: ruleAssignments
                    {
                     before(grammarAccess.getSectionAccess().getAssignmentsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAssignments_in_rule__Section__Alternatives928);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:474:1: rule__VariableDeclaration__Alternatives : ( ( ruleIntegerDeclarion ) | ( ruleBooleanDeclarion ) | ( ruleStateVariableDeclaration ) | ( ruleComment ) );
    public final void rule__VariableDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:478:1: ( ( ruleIntegerDeclarion ) | ( ruleBooleanDeclarion ) | ( ruleStateVariableDeclaration ) | ( ruleComment ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==16) ) {
                    switch ( input.LA(3) ) {
                    case 20:
                        {
                        alt3=3;
                        }
                        break;
                    case 17:
                        {
                        alt3=1;
                        }
                        break;
                    case 19:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_SMV_COMMENT) ) {
                alt3=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:479:1: ( ruleIntegerDeclarion )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:479:1: ( ruleIntegerDeclarion )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:480:1: ruleIntegerDeclarion
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getIntegerDeclarionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerDeclarion_in_rule__VariableDeclaration__Alternatives960);
                    ruleIntegerDeclarion();

                    state._fsp--;

                     after(grammarAccess.getVariableDeclarationAccess().getIntegerDeclarionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:485:6: ( ruleBooleanDeclarion )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:485:6: ( ruleBooleanDeclarion )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:486:1: ruleBooleanDeclarion
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getBooleanDeclarionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanDeclarion_in_rule__VariableDeclaration__Alternatives977);
                    ruleBooleanDeclarion();

                    state._fsp--;

                     after(grammarAccess.getVariableDeclarationAccess().getBooleanDeclarionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:491:6: ( ruleStateVariableDeclaration )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:491:6: ( ruleStateVariableDeclaration )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:492:1: ruleStateVariableDeclaration
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getStateVariableDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStateVariableDeclaration_in_rule__VariableDeclaration__Alternatives994);
                    ruleStateVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVariableDeclarationAccess().getStateVariableDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:497:6: ( ruleComment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:497:6: ( ruleComment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:498:1: ruleComment
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getCommentParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleComment_in_rule__VariableDeclaration__Alternatives1011);
                    ruleComment();

                    state._fsp--;

                     after(grammarAccess.getVariableDeclarationAccess().getCommentParserRuleCall_3()); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:508:1: rule__AssignmentExpression__Alternatives : ( ( ruleIntegerAssignment ) | ( ruleBooleanAssignment ) | ( ruleStateAssignment ) | ( ruleComment ) );
    public final void rule__AssignmentExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:512:1: ( ( ruleIntegerAssignment ) | ( ruleBooleanAssignment ) | ( ruleStateAssignment ) | ( ruleComment ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:513:1: ( ruleIntegerAssignment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:513:1: ( ruleIntegerAssignment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:514:1: ruleIntegerAssignment
                    {
                     before(grammarAccess.getAssignmentExpressionAccess().getIntegerAssignmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerAssignment_in_rule__AssignmentExpression__Alternatives1043);
                    ruleIntegerAssignment();

                    state._fsp--;

                     after(grammarAccess.getAssignmentExpressionAccess().getIntegerAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:519:6: ( ruleBooleanAssignment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:519:6: ( ruleBooleanAssignment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:520:1: ruleBooleanAssignment
                    {
                     before(grammarAccess.getAssignmentExpressionAccess().getBooleanAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanAssignment_in_rule__AssignmentExpression__Alternatives1060);
                    ruleBooleanAssignment();

                    state._fsp--;

                     after(grammarAccess.getAssignmentExpressionAccess().getBooleanAssignmentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:525:6: ( ruleStateAssignment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:525:6: ( ruleStateAssignment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:526:1: ruleStateAssignment
                    {
                     before(grammarAccess.getAssignmentExpressionAccess().getStateAssignmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStateAssignment_in_rule__AssignmentExpression__Alternatives1077);
                    ruleStateAssignment();

                    state._fsp--;

                     after(grammarAccess.getAssignmentExpressionAccess().getStateAssignmentParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:531:6: ( ruleComment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:531:6: ( ruleComment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:532:1: ruleComment
                    {
                     before(grammarAccess.getAssignmentExpressionAccess().getCommentParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleComment_in_rule__AssignmentExpression__Alternatives1094);
                    ruleComment();

                    state._fsp--;

                     after(grammarAccess.getAssignmentExpressionAccess().getCommentParserRuleCall_3()); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:542:1: rule__BOOL__Alternatives : ( ( 'True' ) | ( 'False' ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:546:1: ( ( 'True' ) | ( 'False' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:547:1: ( 'True' )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:547:1: ( 'True' )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:548:1: 'True'
                    {
                     before(grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__BOOL__Alternatives1127); 
                     after(grammarAccess.getBOOLAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:555:6: ( 'False' )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:555:6: ( 'False' )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:556:1: 'False'
                    {
                     before(grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__BOOL__Alternatives1147); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:570:1: rule__VariablesSection__Group__0 : rule__VariablesSection__Group__0__Impl rule__VariablesSection__Group__1 ;
    public final void rule__VariablesSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:574:1: ( rule__VariablesSection__Group__0__Impl rule__VariablesSection__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:575:2: rule__VariablesSection__Group__0__Impl rule__VariablesSection__Group__1
            {
            pushFollow(FOLLOW_rule__VariablesSection__Group__0__Impl_in_rule__VariablesSection__Group__01179);
            rule__VariablesSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariablesSection__Group__1_in_rule__VariablesSection__Group__01182);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:582:1: rule__VariablesSection__Group__0__Impl : ( 'VAR' ) ;
    public final void rule__VariablesSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:586:1: ( ( 'VAR' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:587:1: ( 'VAR' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:587:1: ( 'VAR' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:588:1: 'VAR'
            {
             before(grammarAccess.getVariablesSectionAccess().getVARKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__VariablesSection__Group__0__Impl1210); 
             after(grammarAccess.getVariablesSectionAccess().getVARKeyword_0()); 

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
    // $ANTLR end "rule__VariablesSection__Group__0__Impl"


    // $ANTLR start "rule__VariablesSection__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:601:1: rule__VariablesSection__Group__1 : rule__VariablesSection__Group__1__Impl ;
    public final void rule__VariablesSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:605:1: ( rule__VariablesSection__Group__1__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:606:2: rule__VariablesSection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariablesSection__Group__1__Impl_in_rule__VariablesSection__Group__11241);
            rule__VariablesSection__Group__1__Impl();

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:612:1: rule__VariablesSection__Group__1__Impl : ( ( ( rule__VariablesSection__VariablesAssignment_1 ) ) ( ( rule__VariablesSection__VariablesAssignment_1 )* ) ) ;
    public final void rule__VariablesSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:616:1: ( ( ( ( rule__VariablesSection__VariablesAssignment_1 ) ) ( ( rule__VariablesSection__VariablesAssignment_1 )* ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:617:1: ( ( ( rule__VariablesSection__VariablesAssignment_1 ) ) ( ( rule__VariablesSection__VariablesAssignment_1 )* ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:617:1: ( ( ( rule__VariablesSection__VariablesAssignment_1 ) ) ( ( rule__VariablesSection__VariablesAssignment_1 )* ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:618:1: ( ( rule__VariablesSection__VariablesAssignment_1 ) ) ( ( rule__VariablesSection__VariablesAssignment_1 )* )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:618:1: ( ( rule__VariablesSection__VariablesAssignment_1 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:619:1: ( rule__VariablesSection__VariablesAssignment_1 )
            {
             before(grammarAccess.getVariablesSectionAccess().getVariablesAssignment_1()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:620:1: ( rule__VariablesSection__VariablesAssignment_1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:620:2: rule__VariablesSection__VariablesAssignment_1
            {
            pushFollow(FOLLOW_rule__VariablesSection__VariablesAssignment_1_in_rule__VariablesSection__Group__1__Impl1270);
            rule__VariablesSection__VariablesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariablesSectionAccess().getVariablesAssignment_1()); 

            }

            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:623:1: ( ( rule__VariablesSection__VariablesAssignment_1 )* )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:624:1: ( rule__VariablesSection__VariablesAssignment_1 )*
            {
             before(grammarAccess.getVariablesSectionAccess().getVariablesAssignment_1()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:625:1: ( rule__VariablesSection__VariablesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_SMV_COMMENT && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:625:2: rule__VariablesSection__VariablesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__VariablesSection__VariablesAssignment_1_in_rule__VariablesSection__Group__1__Impl1282);
            	    rule__VariablesSection__VariablesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getVariablesSectionAccess().getVariablesAssignment_1()); 

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
    // $ANTLR end "rule__VariablesSection__Group__1__Impl"


    // $ANTLR start "rule__Assignments__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:640:1: rule__Assignments__Group__0 : rule__Assignments__Group__0__Impl rule__Assignments__Group__1 ;
    public final void rule__Assignments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:644:1: ( rule__Assignments__Group__0__Impl rule__Assignments__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:645:2: rule__Assignments__Group__0__Impl rule__Assignments__Group__1
            {
            pushFollow(FOLLOW_rule__Assignments__Group__0__Impl_in_rule__Assignments__Group__01319);
            rule__Assignments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignments__Group__1_in_rule__Assignments__Group__01322);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:652:1: rule__Assignments__Group__0__Impl : ( () ) ;
    public final void rule__Assignments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:656:1: ( ( () ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:657:1: ( () )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:657:1: ( () )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:658:1: ()
            {
             before(grammarAccess.getAssignmentsAccess().getAssignmentsAction_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:659:1: ()
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:661:1: 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:671:1: rule__Assignments__Group__1 : rule__Assignments__Group__1__Impl rule__Assignments__Group__2 ;
    public final void rule__Assignments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:675:1: ( rule__Assignments__Group__1__Impl rule__Assignments__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:676:2: rule__Assignments__Group__1__Impl rule__Assignments__Group__2
            {
            pushFollow(FOLLOW_rule__Assignments__Group__1__Impl_in_rule__Assignments__Group__11380);
            rule__Assignments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignments__Group__2_in_rule__Assignments__Group__11383);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:683:1: rule__Assignments__Group__1__Impl : ( 'ASSIGN' ) ;
    public final void rule__Assignments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:687:1: ( ( 'ASSIGN' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:688:1: ( 'ASSIGN' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:688:1: ( 'ASSIGN' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:689:1: 'ASSIGN'
            {
             before(grammarAccess.getAssignmentsAccess().getASSIGNKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Assignments__Group__1__Impl1411); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:702:1: rule__Assignments__Group__2 : rule__Assignments__Group__2__Impl ;
    public final void rule__Assignments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:706:1: ( rule__Assignments__Group__2__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:707:2: rule__Assignments__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignments__Group__2__Impl_in_rule__Assignments__Group__21442);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:713:1: rule__Assignments__Group__2__Impl : ( ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* ) ) ;
    public final void rule__Assignments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:717:1: ( ( ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:718:1: ( ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:718:1: ( ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:719:1: ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:719:1: ( ( rule__Assignments__AssignmentsAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:720:1: ( rule__Assignments__AssignmentsAssignment_2 )
            {
             before(grammarAccess.getAssignmentsAccess().getAssignmentsAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:721:1: ( rule__Assignments__AssignmentsAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:721:2: rule__Assignments__AssignmentsAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignments__AssignmentsAssignment_2_in_rule__Assignments__Group__2__Impl1471);
            rule__Assignments__AssignmentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentsAccess().getAssignmentsAssignment_2()); 

            }

            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:724:1: ( ( rule__Assignments__AssignmentsAssignment_2 )* )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:725:1: ( rule__Assignments__AssignmentsAssignment_2 )*
            {
             before(grammarAccess.getAssignmentsAccess().getAssignmentsAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:726:1: ( rule__Assignments__AssignmentsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_SMV_COMMENT||LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:726:2: rule__Assignments__AssignmentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Assignments__AssignmentsAssignment_2_in_rule__Assignments__Group__2__Impl1483);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:743:1: rule__IntegerDeclarion__Group__0 : rule__IntegerDeclarion__Group__0__Impl rule__IntegerDeclarion__Group__1 ;
    public final void rule__IntegerDeclarion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:747:1: ( rule__IntegerDeclarion__Group__0__Impl rule__IntegerDeclarion__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:748:2: rule__IntegerDeclarion__Group__0__Impl rule__IntegerDeclarion__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__0__Impl_in_rule__IntegerDeclarion__Group__01522);
            rule__IntegerDeclarion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__1_in_rule__IntegerDeclarion__Group__01525);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:755:1: rule__IntegerDeclarion__Group__0__Impl : ( ( rule__IntegerDeclarion__NameAssignment_0 ) ) ;
    public final void rule__IntegerDeclarion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:759:1: ( ( ( rule__IntegerDeclarion__NameAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:760:1: ( ( rule__IntegerDeclarion__NameAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:760:1: ( ( rule__IntegerDeclarion__NameAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:761:1: ( rule__IntegerDeclarion__NameAssignment_0 )
            {
             before(grammarAccess.getIntegerDeclarionAccess().getNameAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:762:1: ( rule__IntegerDeclarion__NameAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:762:2: rule__IntegerDeclarion__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__NameAssignment_0_in_rule__IntegerDeclarion__Group__0__Impl1552);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:772:1: rule__IntegerDeclarion__Group__1 : rule__IntegerDeclarion__Group__1__Impl rule__IntegerDeclarion__Group__2 ;
    public final void rule__IntegerDeclarion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:776:1: ( rule__IntegerDeclarion__Group__1__Impl rule__IntegerDeclarion__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:777:2: rule__IntegerDeclarion__Group__1__Impl rule__IntegerDeclarion__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__1__Impl_in_rule__IntegerDeclarion__Group__11582);
            rule__IntegerDeclarion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__2_in_rule__IntegerDeclarion__Group__11585);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:784:1: rule__IntegerDeclarion__Group__1__Impl : ( ':' ) ;
    public final void rule__IntegerDeclarion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:788:1: ( ( ':' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:789:1: ( ':' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:789:1: ( ':' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:790:1: ':'
            {
             before(grammarAccess.getIntegerDeclarionAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__IntegerDeclarion__Group__1__Impl1613); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:803:1: rule__IntegerDeclarion__Group__2 : rule__IntegerDeclarion__Group__2__Impl rule__IntegerDeclarion__Group__3 ;
    public final void rule__IntegerDeclarion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:807:1: ( rule__IntegerDeclarion__Group__2__Impl rule__IntegerDeclarion__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:808:2: rule__IntegerDeclarion__Group__2__Impl rule__IntegerDeclarion__Group__3
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__2__Impl_in_rule__IntegerDeclarion__Group__21644);
            rule__IntegerDeclarion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__3_in_rule__IntegerDeclarion__Group__21647);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:815:1: rule__IntegerDeclarion__Group__2__Impl : ( 'integer' ) ;
    public final void rule__IntegerDeclarion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:819:1: ( ( 'integer' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:820:1: ( 'integer' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:820:1: ( 'integer' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:821:1: 'integer'
            {
             before(grammarAccess.getIntegerDeclarionAccess().getIntegerKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__IntegerDeclarion__Group__2__Impl1675); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:834:1: rule__IntegerDeclarion__Group__3 : rule__IntegerDeclarion__Group__3__Impl ;
    public final void rule__IntegerDeclarion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:838:1: ( rule__IntegerDeclarion__Group__3__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:839:2: rule__IntegerDeclarion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__3__Impl_in_rule__IntegerDeclarion__Group__31706);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:845:1: rule__IntegerDeclarion__Group__3__Impl : ( ';' ) ;
    public final void rule__IntegerDeclarion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:849:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:850:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:850:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:851:1: ';'
            {
             before(grammarAccess.getIntegerDeclarionAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__IntegerDeclarion__Group__3__Impl1734); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:872:1: rule__BooleanDeclarion__Group__0 : rule__BooleanDeclarion__Group__0__Impl rule__BooleanDeclarion__Group__1 ;
    public final void rule__BooleanDeclarion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:876:1: ( rule__BooleanDeclarion__Group__0__Impl rule__BooleanDeclarion__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:877:2: rule__BooleanDeclarion__Group__0__Impl rule__BooleanDeclarion__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__0__Impl_in_rule__BooleanDeclarion__Group__01773);
            rule__BooleanDeclarion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__1_in_rule__BooleanDeclarion__Group__01776);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:884:1: rule__BooleanDeclarion__Group__0__Impl : ( ( rule__BooleanDeclarion__NameAssignment_0 ) ) ;
    public final void rule__BooleanDeclarion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:888:1: ( ( ( rule__BooleanDeclarion__NameAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:889:1: ( ( rule__BooleanDeclarion__NameAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:889:1: ( ( rule__BooleanDeclarion__NameAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:890:1: ( rule__BooleanDeclarion__NameAssignment_0 )
            {
             before(grammarAccess.getBooleanDeclarionAccess().getNameAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:891:1: ( rule__BooleanDeclarion__NameAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:891:2: rule__BooleanDeclarion__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__NameAssignment_0_in_rule__BooleanDeclarion__Group__0__Impl1803);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:901:1: rule__BooleanDeclarion__Group__1 : rule__BooleanDeclarion__Group__1__Impl rule__BooleanDeclarion__Group__2 ;
    public final void rule__BooleanDeclarion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:905:1: ( rule__BooleanDeclarion__Group__1__Impl rule__BooleanDeclarion__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:906:2: rule__BooleanDeclarion__Group__1__Impl rule__BooleanDeclarion__Group__2
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__1__Impl_in_rule__BooleanDeclarion__Group__11833);
            rule__BooleanDeclarion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__2_in_rule__BooleanDeclarion__Group__11836);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:913:1: rule__BooleanDeclarion__Group__1__Impl : ( ':' ) ;
    public final void rule__BooleanDeclarion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:917:1: ( ( ':' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:918:1: ( ':' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:918:1: ( ':' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:919:1: ':'
            {
             before(grammarAccess.getBooleanDeclarionAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__BooleanDeclarion__Group__1__Impl1864); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:932:1: rule__BooleanDeclarion__Group__2 : rule__BooleanDeclarion__Group__2__Impl rule__BooleanDeclarion__Group__3 ;
    public final void rule__BooleanDeclarion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:936:1: ( rule__BooleanDeclarion__Group__2__Impl rule__BooleanDeclarion__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:937:2: rule__BooleanDeclarion__Group__2__Impl rule__BooleanDeclarion__Group__3
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__2__Impl_in_rule__BooleanDeclarion__Group__21895);
            rule__BooleanDeclarion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__3_in_rule__BooleanDeclarion__Group__21898);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:944:1: rule__BooleanDeclarion__Group__2__Impl : ( 'boolean' ) ;
    public final void rule__BooleanDeclarion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:948:1: ( ( 'boolean' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:949:1: ( 'boolean' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:949:1: ( 'boolean' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:950:1: 'boolean'
            {
             before(grammarAccess.getBooleanDeclarionAccess().getBooleanKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__BooleanDeclarion__Group__2__Impl1926); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:963:1: rule__BooleanDeclarion__Group__3 : rule__BooleanDeclarion__Group__3__Impl ;
    public final void rule__BooleanDeclarion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:967:1: ( rule__BooleanDeclarion__Group__3__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:968:2: rule__BooleanDeclarion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__3__Impl_in_rule__BooleanDeclarion__Group__31957);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:974:1: rule__BooleanDeclarion__Group__3__Impl : ( ';' ) ;
    public final void rule__BooleanDeclarion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:978:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:979:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:979:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:980:1: ';'
            {
             before(grammarAccess.getBooleanDeclarionAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__BooleanDeclarion__Group__3__Impl1985); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1001:1: rule__StateVariableDeclaration__Group__0 : rule__StateVariableDeclaration__Group__0__Impl rule__StateVariableDeclaration__Group__1 ;
    public final void rule__StateVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1005:1: ( rule__StateVariableDeclaration__Group__0__Impl rule__StateVariableDeclaration__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1006:2: rule__StateVariableDeclaration__Group__0__Impl rule__StateVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__0__Impl_in_rule__StateVariableDeclaration__Group__02024);
            rule__StateVariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__1_in_rule__StateVariableDeclaration__Group__02027);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1013:1: rule__StateVariableDeclaration__Group__0__Impl : ( ( rule__StateVariableDeclaration__NameAssignment_0 ) ) ;
    public final void rule__StateVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1017:1: ( ( ( rule__StateVariableDeclaration__NameAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1018:1: ( ( rule__StateVariableDeclaration__NameAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1018:1: ( ( rule__StateVariableDeclaration__NameAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1019:1: ( rule__StateVariableDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getNameAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1020:1: ( rule__StateVariableDeclaration__NameAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1020:2: rule__StateVariableDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__NameAssignment_0_in_rule__StateVariableDeclaration__Group__0__Impl2054);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1030:1: rule__StateVariableDeclaration__Group__1 : rule__StateVariableDeclaration__Group__1__Impl rule__StateVariableDeclaration__Group__2 ;
    public final void rule__StateVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1034:1: ( rule__StateVariableDeclaration__Group__1__Impl rule__StateVariableDeclaration__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1035:2: rule__StateVariableDeclaration__Group__1__Impl rule__StateVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__1__Impl_in_rule__StateVariableDeclaration__Group__12084);
            rule__StateVariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__2_in_rule__StateVariableDeclaration__Group__12087);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1042:1: rule__StateVariableDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__StateVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1046:1: ( ( ':' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1047:1: ( ':' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1047:1: ( ':' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1048:1: ':'
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__StateVariableDeclaration__Group__1__Impl2115); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1061:1: rule__StateVariableDeclaration__Group__2 : rule__StateVariableDeclaration__Group__2__Impl rule__StateVariableDeclaration__Group__3 ;
    public final void rule__StateVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1065:1: ( rule__StateVariableDeclaration__Group__2__Impl rule__StateVariableDeclaration__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1066:2: rule__StateVariableDeclaration__Group__2__Impl rule__StateVariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__2__Impl_in_rule__StateVariableDeclaration__Group__22146);
            rule__StateVariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__3_in_rule__StateVariableDeclaration__Group__22149);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1073:1: rule__StateVariableDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__StateVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1077:1: ( ( '{' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1078:1: ( '{' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1078:1: ( '{' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1079:1: '{'
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__StateVariableDeclaration__Group__2__Impl2177); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1092:1: rule__StateVariableDeclaration__Group__3 : rule__StateVariableDeclaration__Group__3__Impl rule__StateVariableDeclaration__Group__4 ;
    public final void rule__StateVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1096:1: ( rule__StateVariableDeclaration__Group__3__Impl rule__StateVariableDeclaration__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1097:2: rule__StateVariableDeclaration__Group__3__Impl rule__StateVariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__3__Impl_in_rule__StateVariableDeclaration__Group__32208);
            rule__StateVariableDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__4_in_rule__StateVariableDeclaration__Group__32211);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1104:1: rule__StateVariableDeclaration__Group__3__Impl : ( ( rule__StateVariableDeclaration__StatesAssignment_3 ) ) ;
    public final void rule__StateVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1108:1: ( ( ( rule__StateVariableDeclaration__StatesAssignment_3 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1109:1: ( ( rule__StateVariableDeclaration__StatesAssignment_3 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1109:1: ( ( rule__StateVariableDeclaration__StatesAssignment_3 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1110:1: ( rule__StateVariableDeclaration__StatesAssignment_3 )
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getStatesAssignment_3()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1111:1: ( rule__StateVariableDeclaration__StatesAssignment_3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1111:2: rule__StateVariableDeclaration__StatesAssignment_3
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__StatesAssignment_3_in_rule__StateVariableDeclaration__Group__3__Impl2238);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1121:1: rule__StateVariableDeclaration__Group__4 : rule__StateVariableDeclaration__Group__4__Impl rule__StateVariableDeclaration__Group__5 ;
    public final void rule__StateVariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1125:1: ( rule__StateVariableDeclaration__Group__4__Impl rule__StateVariableDeclaration__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1126:2: rule__StateVariableDeclaration__Group__4__Impl rule__StateVariableDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__4__Impl_in_rule__StateVariableDeclaration__Group__42268);
            rule__StateVariableDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__5_in_rule__StateVariableDeclaration__Group__42271);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1133:1: rule__StateVariableDeclaration__Group__4__Impl : ( ( rule__StateVariableDeclaration__Group_4__0 )* ) ;
    public final void rule__StateVariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1137:1: ( ( ( rule__StateVariableDeclaration__Group_4__0 )* ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1138:1: ( ( rule__StateVariableDeclaration__Group_4__0 )* )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1138:1: ( ( rule__StateVariableDeclaration__Group_4__0 )* )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1139:1: ( rule__StateVariableDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getGroup_4()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1140:1: ( rule__StateVariableDeclaration__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1140:2: rule__StateVariableDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__StateVariableDeclaration__Group_4__0_in_rule__StateVariableDeclaration__Group__4__Impl2298);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1150:1: rule__StateVariableDeclaration__Group__5 : rule__StateVariableDeclaration__Group__5__Impl rule__StateVariableDeclaration__Group__6 ;
    public final void rule__StateVariableDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1154:1: ( rule__StateVariableDeclaration__Group__5__Impl rule__StateVariableDeclaration__Group__6 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1155:2: rule__StateVariableDeclaration__Group__5__Impl rule__StateVariableDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__5__Impl_in_rule__StateVariableDeclaration__Group__52329);
            rule__StateVariableDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__6_in_rule__StateVariableDeclaration__Group__52332);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1162:1: rule__StateVariableDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__StateVariableDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1166:1: ( ( '}' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1167:1: ( '}' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1167:1: ( '}' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1168:1: '}'
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__StateVariableDeclaration__Group__5__Impl2360); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1181:1: rule__StateVariableDeclaration__Group__6 : rule__StateVariableDeclaration__Group__6__Impl ;
    public final void rule__StateVariableDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1185:1: ( rule__StateVariableDeclaration__Group__6__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1186:2: rule__StateVariableDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__6__Impl_in_rule__StateVariableDeclaration__Group__62391);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1192:1: rule__StateVariableDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__StateVariableDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1196:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1197:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1197:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1198:1: ';'
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getSemicolonKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__StateVariableDeclaration__Group__6__Impl2419); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1225:1: rule__StateVariableDeclaration__Group_4__0 : rule__StateVariableDeclaration__Group_4__0__Impl rule__StateVariableDeclaration__Group_4__1 ;
    public final void rule__StateVariableDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1229:1: ( rule__StateVariableDeclaration__Group_4__0__Impl rule__StateVariableDeclaration__Group_4__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1230:2: rule__StateVariableDeclaration__Group_4__0__Impl rule__StateVariableDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group_4__0__Impl_in_rule__StateVariableDeclaration__Group_4__02464);
            rule__StateVariableDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group_4__1_in_rule__StateVariableDeclaration__Group_4__02467);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1237:1: rule__StateVariableDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StateVariableDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1241:1: ( ( ',' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1242:1: ( ',' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1242:1: ( ',' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1243:1: ','
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getCommaKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__StateVariableDeclaration__Group_4__0__Impl2495); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1256:1: rule__StateVariableDeclaration__Group_4__1 : rule__StateVariableDeclaration__Group_4__1__Impl ;
    public final void rule__StateVariableDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1260:1: ( rule__StateVariableDeclaration__Group_4__1__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1261:2: rule__StateVariableDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group_4__1__Impl_in_rule__StateVariableDeclaration__Group_4__12526);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1267:1: rule__StateVariableDeclaration__Group_4__1__Impl : ( ( rule__StateVariableDeclaration__StatesAssignment_4_1 ) ) ;
    public final void rule__StateVariableDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1271:1: ( ( ( rule__StateVariableDeclaration__StatesAssignment_4_1 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1272:1: ( ( rule__StateVariableDeclaration__StatesAssignment_4_1 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1272:1: ( ( rule__StateVariableDeclaration__StatesAssignment_4_1 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1273:1: ( rule__StateVariableDeclaration__StatesAssignment_4_1 )
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getStatesAssignment_4_1()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1274:1: ( rule__StateVariableDeclaration__StatesAssignment_4_1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1274:2: rule__StateVariableDeclaration__StatesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__StatesAssignment_4_1_in_rule__StateVariableDeclaration__Group_4__1__Impl2553);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1288:1: rule__BooleanAssignment__Group__0 : rule__BooleanAssignment__Group__0__Impl rule__BooleanAssignment__Group__1 ;
    public final void rule__BooleanAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1292:1: ( rule__BooleanAssignment__Group__0__Impl rule__BooleanAssignment__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1293:2: rule__BooleanAssignment__Group__0__Impl rule__BooleanAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__0__Impl_in_rule__BooleanAssignment__Group__02587);
            rule__BooleanAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__1_in_rule__BooleanAssignment__Group__02590);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1300:1: rule__BooleanAssignment__Group__0__Impl : ( 'init' ) ;
    public final void rule__BooleanAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1304:1: ( ( 'init' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1305:1: ( 'init' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1305:1: ( 'init' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1306:1: 'init'
            {
             before(grammarAccess.getBooleanAssignmentAccess().getInitKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__BooleanAssignment__Group__0__Impl2618); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1319:1: rule__BooleanAssignment__Group__1 : rule__BooleanAssignment__Group__1__Impl rule__BooleanAssignment__Group__2 ;
    public final void rule__BooleanAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1323:1: ( rule__BooleanAssignment__Group__1__Impl rule__BooleanAssignment__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1324:2: rule__BooleanAssignment__Group__1__Impl rule__BooleanAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__1__Impl_in_rule__BooleanAssignment__Group__12649);
            rule__BooleanAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__2_in_rule__BooleanAssignment__Group__12652);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1331:1: rule__BooleanAssignment__Group__1__Impl : ( '(' ) ;
    public final void rule__BooleanAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1335:1: ( ( '(' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1336:1: ( '(' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1336:1: ( '(' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1337:1: '('
            {
             before(grammarAccess.getBooleanAssignmentAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__BooleanAssignment__Group__1__Impl2680); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1350:1: rule__BooleanAssignment__Group__2 : rule__BooleanAssignment__Group__2__Impl rule__BooleanAssignment__Group__3 ;
    public final void rule__BooleanAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1354:1: ( rule__BooleanAssignment__Group__2__Impl rule__BooleanAssignment__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1355:2: rule__BooleanAssignment__Group__2__Impl rule__BooleanAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__2__Impl_in_rule__BooleanAssignment__Group__22711);
            rule__BooleanAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__3_in_rule__BooleanAssignment__Group__22714);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1362:1: rule__BooleanAssignment__Group__2__Impl : ( ( rule__BooleanAssignment__VarAssignment_2 ) ) ;
    public final void rule__BooleanAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1366:1: ( ( ( rule__BooleanAssignment__VarAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1367:1: ( ( rule__BooleanAssignment__VarAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1367:1: ( ( rule__BooleanAssignment__VarAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1368:1: ( rule__BooleanAssignment__VarAssignment_2 )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getVarAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1369:1: ( rule__BooleanAssignment__VarAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1369:2: rule__BooleanAssignment__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__VarAssignment_2_in_rule__BooleanAssignment__Group__2__Impl2741);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1379:1: rule__BooleanAssignment__Group__3 : rule__BooleanAssignment__Group__3__Impl rule__BooleanAssignment__Group__4 ;
    public final void rule__BooleanAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1383:1: ( rule__BooleanAssignment__Group__3__Impl rule__BooleanAssignment__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1384:2: rule__BooleanAssignment__Group__3__Impl rule__BooleanAssignment__Group__4
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__3__Impl_in_rule__BooleanAssignment__Group__32771);
            rule__BooleanAssignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__4_in_rule__BooleanAssignment__Group__32774);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1391:1: rule__BooleanAssignment__Group__3__Impl : ( ')' ) ;
    public final void rule__BooleanAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1395:1: ( ( ')' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1396:1: ( ')' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1396:1: ( ')' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1397:1: ')'
            {
             before(grammarAccess.getBooleanAssignmentAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__BooleanAssignment__Group__3__Impl2802); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1410:1: rule__BooleanAssignment__Group__4 : rule__BooleanAssignment__Group__4__Impl rule__BooleanAssignment__Group__5 ;
    public final void rule__BooleanAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1414:1: ( rule__BooleanAssignment__Group__4__Impl rule__BooleanAssignment__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1415:2: rule__BooleanAssignment__Group__4__Impl rule__BooleanAssignment__Group__5
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__4__Impl_in_rule__BooleanAssignment__Group__42833);
            rule__BooleanAssignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__5_in_rule__BooleanAssignment__Group__42836);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1422:1: rule__BooleanAssignment__Group__4__Impl : ( ':=' ) ;
    public final void rule__BooleanAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1426:1: ( ( ':=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1427:1: ( ':=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1427:1: ( ':=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1428:1: ':='
            {
             before(grammarAccess.getBooleanAssignmentAccess().getColonEqualsSignKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__BooleanAssignment__Group__4__Impl2864); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1441:1: rule__BooleanAssignment__Group__5 : rule__BooleanAssignment__Group__5__Impl rule__BooleanAssignment__Group__6 ;
    public final void rule__BooleanAssignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1445:1: ( rule__BooleanAssignment__Group__5__Impl rule__BooleanAssignment__Group__6 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1446:2: rule__BooleanAssignment__Group__5__Impl rule__BooleanAssignment__Group__6
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__5__Impl_in_rule__BooleanAssignment__Group__52895);
            rule__BooleanAssignment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__6_in_rule__BooleanAssignment__Group__52898);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1453:1: rule__BooleanAssignment__Group__5__Impl : ( ( rule__BooleanAssignment__ValueAssignment_5 ) ) ;
    public final void rule__BooleanAssignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1457:1: ( ( ( rule__BooleanAssignment__ValueAssignment_5 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1458:1: ( ( rule__BooleanAssignment__ValueAssignment_5 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1458:1: ( ( rule__BooleanAssignment__ValueAssignment_5 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1459:1: ( rule__BooleanAssignment__ValueAssignment_5 )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getValueAssignment_5()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1460:1: ( rule__BooleanAssignment__ValueAssignment_5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1460:2: rule__BooleanAssignment__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__ValueAssignment_5_in_rule__BooleanAssignment__Group__5__Impl2925);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1470:1: rule__BooleanAssignment__Group__6 : rule__BooleanAssignment__Group__6__Impl ;
    public final void rule__BooleanAssignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1474:1: ( rule__BooleanAssignment__Group__6__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1475:2: rule__BooleanAssignment__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__6__Impl_in_rule__BooleanAssignment__Group__62955);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1481:1: rule__BooleanAssignment__Group__6__Impl : ( ';' ) ;
    public final void rule__BooleanAssignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1485:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1486:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1486:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1487:1: ';'
            {
             before(grammarAccess.getBooleanAssignmentAccess().getSemicolonKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__BooleanAssignment__Group__6__Impl2983); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1514:1: rule__IntegerAssignment__Group__0 : rule__IntegerAssignment__Group__0__Impl rule__IntegerAssignment__Group__1 ;
    public final void rule__IntegerAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1518:1: ( rule__IntegerAssignment__Group__0__Impl rule__IntegerAssignment__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1519:2: rule__IntegerAssignment__Group__0__Impl rule__IntegerAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__0__Impl_in_rule__IntegerAssignment__Group__03028);
            rule__IntegerAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__1_in_rule__IntegerAssignment__Group__03031);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1526:1: rule__IntegerAssignment__Group__0__Impl : ( 'init' ) ;
    public final void rule__IntegerAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1530:1: ( ( 'init' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1531:1: ( 'init' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1531:1: ( 'init' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1532:1: 'init'
            {
             before(grammarAccess.getIntegerAssignmentAccess().getInitKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__IntegerAssignment__Group__0__Impl3059); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1545:1: rule__IntegerAssignment__Group__1 : rule__IntegerAssignment__Group__1__Impl rule__IntegerAssignment__Group__2 ;
    public final void rule__IntegerAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1549:1: ( rule__IntegerAssignment__Group__1__Impl rule__IntegerAssignment__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1550:2: rule__IntegerAssignment__Group__1__Impl rule__IntegerAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__1__Impl_in_rule__IntegerAssignment__Group__13090);
            rule__IntegerAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__2_in_rule__IntegerAssignment__Group__13093);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1557:1: rule__IntegerAssignment__Group__1__Impl : ( '(' ) ;
    public final void rule__IntegerAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1561:1: ( ( '(' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1562:1: ( '(' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1562:1: ( '(' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1563:1: '('
            {
             before(grammarAccess.getIntegerAssignmentAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__IntegerAssignment__Group__1__Impl3121); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1576:1: rule__IntegerAssignment__Group__2 : rule__IntegerAssignment__Group__2__Impl rule__IntegerAssignment__Group__3 ;
    public final void rule__IntegerAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1580:1: ( rule__IntegerAssignment__Group__2__Impl rule__IntegerAssignment__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1581:2: rule__IntegerAssignment__Group__2__Impl rule__IntegerAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__2__Impl_in_rule__IntegerAssignment__Group__23152);
            rule__IntegerAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__3_in_rule__IntegerAssignment__Group__23155);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1588:1: rule__IntegerAssignment__Group__2__Impl : ( ( rule__IntegerAssignment__VarAssignment_2 ) ) ;
    public final void rule__IntegerAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1592:1: ( ( ( rule__IntegerAssignment__VarAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1593:1: ( ( rule__IntegerAssignment__VarAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1593:1: ( ( rule__IntegerAssignment__VarAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1594:1: ( rule__IntegerAssignment__VarAssignment_2 )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getVarAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1595:1: ( rule__IntegerAssignment__VarAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1595:2: rule__IntegerAssignment__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__VarAssignment_2_in_rule__IntegerAssignment__Group__2__Impl3182);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1605:1: rule__IntegerAssignment__Group__3 : rule__IntegerAssignment__Group__3__Impl rule__IntegerAssignment__Group__4 ;
    public final void rule__IntegerAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1609:1: ( rule__IntegerAssignment__Group__3__Impl rule__IntegerAssignment__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1610:2: rule__IntegerAssignment__Group__3__Impl rule__IntegerAssignment__Group__4
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__3__Impl_in_rule__IntegerAssignment__Group__33212);
            rule__IntegerAssignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__4_in_rule__IntegerAssignment__Group__33215);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1617:1: rule__IntegerAssignment__Group__3__Impl : ( ')' ) ;
    public final void rule__IntegerAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1621:1: ( ( ')' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1622:1: ( ')' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1622:1: ( ')' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1623:1: ')'
            {
             before(grammarAccess.getIntegerAssignmentAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__IntegerAssignment__Group__3__Impl3243); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1636:1: rule__IntegerAssignment__Group__4 : rule__IntegerAssignment__Group__4__Impl rule__IntegerAssignment__Group__5 ;
    public final void rule__IntegerAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1640:1: ( rule__IntegerAssignment__Group__4__Impl rule__IntegerAssignment__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1641:2: rule__IntegerAssignment__Group__4__Impl rule__IntegerAssignment__Group__5
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__4__Impl_in_rule__IntegerAssignment__Group__43274);
            rule__IntegerAssignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__5_in_rule__IntegerAssignment__Group__43277);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1648:1: rule__IntegerAssignment__Group__4__Impl : ( ':=' ) ;
    public final void rule__IntegerAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1652:1: ( ( ':=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1653:1: ( ':=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1653:1: ( ':=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1654:1: ':='
            {
             before(grammarAccess.getIntegerAssignmentAccess().getColonEqualsSignKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__IntegerAssignment__Group__4__Impl3305); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1667:1: rule__IntegerAssignment__Group__5 : rule__IntegerAssignment__Group__5__Impl rule__IntegerAssignment__Group__6 ;
    public final void rule__IntegerAssignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1671:1: ( rule__IntegerAssignment__Group__5__Impl rule__IntegerAssignment__Group__6 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1672:2: rule__IntegerAssignment__Group__5__Impl rule__IntegerAssignment__Group__6
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__5__Impl_in_rule__IntegerAssignment__Group__53336);
            rule__IntegerAssignment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__6_in_rule__IntegerAssignment__Group__53339);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1679:1: rule__IntegerAssignment__Group__5__Impl : ( ( rule__IntegerAssignment__ValueAssignment_5 ) ) ;
    public final void rule__IntegerAssignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1683:1: ( ( ( rule__IntegerAssignment__ValueAssignment_5 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1684:1: ( ( rule__IntegerAssignment__ValueAssignment_5 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1684:1: ( ( rule__IntegerAssignment__ValueAssignment_5 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1685:1: ( rule__IntegerAssignment__ValueAssignment_5 )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getValueAssignment_5()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1686:1: ( rule__IntegerAssignment__ValueAssignment_5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1686:2: rule__IntegerAssignment__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__ValueAssignment_5_in_rule__IntegerAssignment__Group__5__Impl3366);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1696:1: rule__IntegerAssignment__Group__6 : rule__IntegerAssignment__Group__6__Impl ;
    public final void rule__IntegerAssignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1700:1: ( rule__IntegerAssignment__Group__6__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1701:2: rule__IntegerAssignment__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__6__Impl_in_rule__IntegerAssignment__Group__63396);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1707:1: rule__IntegerAssignment__Group__6__Impl : ( ';' ) ;
    public final void rule__IntegerAssignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1711:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1712:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1712:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1713:1: ';'
            {
             before(grammarAccess.getIntegerAssignmentAccess().getSemicolonKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__IntegerAssignment__Group__6__Impl3424); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1740:1: rule__StateAssignment__Group__0 : rule__StateAssignment__Group__0__Impl rule__StateAssignment__Group__1 ;
    public final void rule__StateAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1744:1: ( rule__StateAssignment__Group__0__Impl rule__StateAssignment__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1745:2: rule__StateAssignment__Group__0__Impl rule__StateAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__0__Impl_in_rule__StateAssignment__Group__03469);
            rule__StateAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__1_in_rule__StateAssignment__Group__03472);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1752:1: rule__StateAssignment__Group__0__Impl : ( 'init' ) ;
    public final void rule__StateAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1756:1: ( ( 'init' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1757:1: ( 'init' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1757:1: ( 'init' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1758:1: 'init'
            {
             before(grammarAccess.getStateAssignmentAccess().getInitKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__StateAssignment__Group__0__Impl3500); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1771:1: rule__StateAssignment__Group__1 : rule__StateAssignment__Group__1__Impl rule__StateAssignment__Group__2 ;
    public final void rule__StateAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1775:1: ( rule__StateAssignment__Group__1__Impl rule__StateAssignment__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1776:2: rule__StateAssignment__Group__1__Impl rule__StateAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__1__Impl_in_rule__StateAssignment__Group__13531);
            rule__StateAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__2_in_rule__StateAssignment__Group__13534);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1783:1: rule__StateAssignment__Group__1__Impl : ( '(' ) ;
    public final void rule__StateAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1787:1: ( ( '(' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1788:1: ( '(' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1788:1: ( '(' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1789:1: '('
            {
             before(grammarAccess.getStateAssignmentAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__StateAssignment__Group__1__Impl3562); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1802:1: rule__StateAssignment__Group__2 : rule__StateAssignment__Group__2__Impl rule__StateAssignment__Group__3 ;
    public final void rule__StateAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1806:1: ( rule__StateAssignment__Group__2__Impl rule__StateAssignment__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1807:2: rule__StateAssignment__Group__2__Impl rule__StateAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__2__Impl_in_rule__StateAssignment__Group__23593);
            rule__StateAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__3_in_rule__StateAssignment__Group__23596);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1814:1: rule__StateAssignment__Group__2__Impl : ( ( rule__StateAssignment__VarAssignment_2 ) ) ;
    public final void rule__StateAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1818:1: ( ( ( rule__StateAssignment__VarAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1819:1: ( ( rule__StateAssignment__VarAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1819:1: ( ( rule__StateAssignment__VarAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1820:1: ( rule__StateAssignment__VarAssignment_2 )
            {
             before(grammarAccess.getStateAssignmentAccess().getVarAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1821:1: ( rule__StateAssignment__VarAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1821:2: rule__StateAssignment__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__StateAssignment__VarAssignment_2_in_rule__StateAssignment__Group__2__Impl3623);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1831:1: rule__StateAssignment__Group__3 : rule__StateAssignment__Group__3__Impl rule__StateAssignment__Group__4 ;
    public final void rule__StateAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1835:1: ( rule__StateAssignment__Group__3__Impl rule__StateAssignment__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1836:2: rule__StateAssignment__Group__3__Impl rule__StateAssignment__Group__4
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__3__Impl_in_rule__StateAssignment__Group__33653);
            rule__StateAssignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__4_in_rule__StateAssignment__Group__33656);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1843:1: rule__StateAssignment__Group__3__Impl : ( ')' ) ;
    public final void rule__StateAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1847:1: ( ( ')' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1848:1: ( ')' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1848:1: ( ')' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1849:1: ')'
            {
             before(grammarAccess.getStateAssignmentAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__StateAssignment__Group__3__Impl3684); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1862:1: rule__StateAssignment__Group__4 : rule__StateAssignment__Group__4__Impl rule__StateAssignment__Group__5 ;
    public final void rule__StateAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1866:1: ( rule__StateAssignment__Group__4__Impl rule__StateAssignment__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1867:2: rule__StateAssignment__Group__4__Impl rule__StateAssignment__Group__5
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__4__Impl_in_rule__StateAssignment__Group__43715);
            rule__StateAssignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__5_in_rule__StateAssignment__Group__43718);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1874:1: rule__StateAssignment__Group__4__Impl : ( ':=' ) ;
    public final void rule__StateAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1878:1: ( ( ':=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1879:1: ( ':=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1879:1: ( ':=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1880:1: ':='
            {
             before(grammarAccess.getStateAssignmentAccess().getColonEqualsSignKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__StateAssignment__Group__4__Impl3746); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1893:1: rule__StateAssignment__Group__5 : rule__StateAssignment__Group__5__Impl rule__StateAssignment__Group__6 ;
    public final void rule__StateAssignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1897:1: ( rule__StateAssignment__Group__5__Impl rule__StateAssignment__Group__6 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1898:2: rule__StateAssignment__Group__5__Impl rule__StateAssignment__Group__6
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__5__Impl_in_rule__StateAssignment__Group__53777);
            rule__StateAssignment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__6_in_rule__StateAssignment__Group__53780);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1905:1: rule__StateAssignment__Group__5__Impl : ( ( rule__StateAssignment__ValueAssignment_5 ) ) ;
    public final void rule__StateAssignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1909:1: ( ( ( rule__StateAssignment__ValueAssignment_5 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1910:1: ( ( rule__StateAssignment__ValueAssignment_5 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1910:1: ( ( rule__StateAssignment__ValueAssignment_5 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1911:1: ( rule__StateAssignment__ValueAssignment_5 )
            {
             before(grammarAccess.getStateAssignmentAccess().getValueAssignment_5()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1912:1: ( rule__StateAssignment__ValueAssignment_5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1912:2: rule__StateAssignment__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__StateAssignment__ValueAssignment_5_in_rule__StateAssignment__Group__5__Impl3807);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1922:1: rule__StateAssignment__Group__6 : rule__StateAssignment__Group__6__Impl ;
    public final void rule__StateAssignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1926:1: ( rule__StateAssignment__Group__6__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1927:2: rule__StateAssignment__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__6__Impl_in_rule__StateAssignment__Group__63837);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1933:1: rule__StateAssignment__Group__6__Impl : ( ';' ) ;
    public final void rule__StateAssignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1937:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1938:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1938:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1939:1: ';'
            {
             before(grammarAccess.getStateAssignmentAccess().getSemicolonKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__StateAssignment__Group__6__Impl3865); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1967:1: rule__Model__SectionsAssignment : ( ruleSection ) ;
    public final void rule__Model__SectionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1971:1: ( ( ruleSection ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1972:1: ( ruleSection )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1972:1: ( ruleSection )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1973:1: ruleSection
            {
             before(grammarAccess.getModelAccess().getSectionsSectionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Model__SectionsAssignment3915);
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


    // $ANTLR start "rule__Comment__CommentAssignment"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1982:1: rule__Comment__CommentAssignment : ( RULE_SMV_COMMENT ) ;
    public final void rule__Comment__CommentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1986:1: ( ( RULE_SMV_COMMENT ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1987:1: ( RULE_SMV_COMMENT )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1987:1: ( RULE_SMV_COMMENT )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1988:1: RULE_SMV_COMMENT
            {
             before(grammarAccess.getCommentAccess().getCommentSMV_COMMENTTerminalRuleCall_0()); 
            match(input,RULE_SMV_COMMENT,FOLLOW_RULE_SMV_COMMENT_in_rule__Comment__CommentAssignment3946); 
             after(grammarAccess.getCommentAccess().getCommentSMV_COMMENTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Comment__CommentAssignment"


    // $ANTLR start "rule__VariablesSection__VariablesAssignment_1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1997:1: rule__VariablesSection__VariablesAssignment_1 : ( ruleVariableDeclaration ) ;
    public final void rule__VariablesSection__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2001:1: ( ( ruleVariableDeclaration ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2002:1: ( ruleVariableDeclaration )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2002:1: ( ruleVariableDeclaration )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2003:1: ruleVariableDeclaration
            {
             before(grammarAccess.getVariablesSectionAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__VariablesSection__VariablesAssignment_13977);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariablesSectionAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariablesSection__VariablesAssignment_1"


    // $ANTLR start "rule__Assignments__AssignmentsAssignment_2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2012:1: rule__Assignments__AssignmentsAssignment_2 : ( ruleAssignmentExpression ) ;
    public final void rule__Assignments__AssignmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2016:1: ( ( ruleAssignmentExpression ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2017:1: ( ruleAssignmentExpression )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2017:1: ( ruleAssignmentExpression )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2018:1: ruleAssignmentExpression
            {
             before(grammarAccess.getAssignmentsAccess().getAssignmentsAssignmentExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_rule__Assignments__AssignmentsAssignment_24008);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2027:1: rule__IntegerDeclarion__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IntegerDeclarion__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2031:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2032:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2032:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2033:1: RULE_ID
            {
             before(grammarAccess.getIntegerDeclarionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerDeclarion__NameAssignment_04039); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2042:1: rule__BooleanDeclarion__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BooleanDeclarion__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2046:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2047:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2047:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2048:1: RULE_ID
            {
             before(grammarAccess.getBooleanDeclarionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BooleanDeclarion__NameAssignment_04070); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2057:1: rule__StateVariableDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__StateVariableDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2061:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2062:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2062:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2063:1: RULE_ID
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__NameAssignment_04101); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2072:1: rule__StateVariableDeclaration__StatesAssignment_3 : ( RULE_ID ) ;
    public final void rule__StateVariableDeclaration__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2076:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2077:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2077:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2078:1: RULE_ID
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getStatesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__StatesAssignment_34132); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2087:1: rule__StateVariableDeclaration__StatesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__StateVariableDeclaration__StatesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2091:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2092:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2092:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2093:1: RULE_ID
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getStatesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__StatesAssignment_4_14163); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2102:1: rule__BooleanAssignment__VarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BooleanAssignment__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2106:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2107:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2107:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2108:1: ( RULE_ID )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getVarBooleanDeclarionCrossReference_2_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2109:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2110:1: RULE_ID
            {
             before(grammarAccess.getBooleanAssignmentAccess().getVarBooleanDeclarionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BooleanAssignment__VarAssignment_24198); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2121:1: rule__BooleanAssignment__ValueAssignment_5 : ( ruleBOOL ) ;
    public final void rule__BooleanAssignment__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2125:1: ( ( ruleBOOL ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2126:1: ( ruleBOOL )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2126:1: ( ruleBOOL )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2127:1: ruleBOOL
            {
             before(grammarAccess.getBooleanAssignmentAccess().getValueBOOLParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBOOL_in_rule__BooleanAssignment__ValueAssignment_54233);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2136:1: rule__IntegerAssignment__VarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__IntegerAssignment__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2140:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2141:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2141:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2142:1: ( RULE_ID )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getVarIntegerDeclarionCrossReference_2_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2143:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2144:1: RULE_ID
            {
             before(grammarAccess.getIntegerAssignmentAccess().getVarIntegerDeclarionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerAssignment__VarAssignment_24268); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2155:1: rule__IntegerAssignment__ValueAssignment_5 : ( RULE_INT ) ;
    public final void rule__IntegerAssignment__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2159:1: ( ( RULE_INT ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2160:1: ( RULE_INT )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2160:1: ( RULE_INT )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2161:1: RULE_INT
            {
             before(grammarAccess.getIntegerAssignmentAccess().getValueINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerAssignment__ValueAssignment_54303); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2170:1: rule__StateAssignment__VarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StateAssignment__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2174:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2175:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2175:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2176:1: ( RULE_ID )
            {
             before(grammarAccess.getStateAssignmentAccess().getVarStateVariableDeclarationCrossReference_2_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2177:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2178:1: RULE_ID
            {
             before(grammarAccess.getStateAssignmentAccess().getVarStateVariableDeclarationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateAssignment__VarAssignment_24338); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2189:1: rule__StateAssignment__ValueAssignment_5 : ( RULE_ID ) ;
    public final void rule__StateAssignment__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2193:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2194:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2194:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2195:1: RULE_ID
            {
             before(grammarAccess.getStateAssignmentAccess().getValueIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateAssignment__ValueAssignment_54373); 
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\4\1\30\1\uffff\1\5\1\31\1\32\1\5\3\uffff";
    static final String DFA4_maxS =
        "\1\27\1\30\1\uffff\1\5\1\31\1\32\1\15\3\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\4\4\uffff\1\3\1\1\1\2";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\22\uffff\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\1\10\5\uffff\2\11",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "508:1: rule__AssignmentExpression__Alternatives : ( ( ruleIntegerAssignment ) | ( ruleBooleanAssignment ) | ( ruleStateAssignment ) | ( ruleComment ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SectionsAssignment_in_ruleModel94 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Alternatives_in_ruleSection155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__CommentAssignment_in_ruleComment215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesSection_in_entryRuleVariablesSection242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablesSection249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesSection__Group__0_in_ruleVariablesSection275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignments_in_entryRuleAssignments302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignments309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignments__Group__0_in_ruleAssignments335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Alternatives_in_ruleVariableDeclaration395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDeclarion_in_entryRuleIntegerDeclarion422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerDeclarion429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__0_in_ruleIntegerDeclarion455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDeclarion_in_entryRuleBooleanDeclarion482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanDeclarion489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__0_in_ruleBooleanDeclarion515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateVariableDeclaration549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__0_in_ruleStateVariableDeclaration575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Alternatives_in_ruleAssignmentExpression635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAssignment669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__0_in_ruleBooleanAssignment695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerAssignment789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__0_in_ruleIntegerAssignment815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAssignment_in_entryRuleStateAssignment842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateAssignment849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__0_in_ruleStateAssignment875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesSection_in_rule__Section__Alternatives911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignments_in_rule__Section__Alternatives928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDeclarion_in_rule__VariableDeclaration__Alternatives960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDeclarion_in_rule__VariableDeclaration__Alternatives977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_rule__VariableDeclaration__Alternatives994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__VariableDeclaration__Alternatives1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAssignment_in_rule__AssignmentExpression__Alternatives1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAssignment_in_rule__AssignmentExpression__Alternatives1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAssignment_in_rule__AssignmentExpression__Alternatives1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__AssignmentExpression__Alternatives1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BOOL__Alternatives1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BOOL__Alternatives1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesSection__Group__0__Impl_in_rule__VariablesSection__Group__01179 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__VariablesSection__Group__1_in_rule__VariablesSection__Group__01182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__VariablesSection__Group__0__Impl1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesSection__Group__1__Impl_in_rule__VariablesSection__Group__11241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesSection__VariablesAssignment_1_in_rule__VariablesSection__Group__1__Impl1270 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__VariablesSection__VariablesAssignment_1_in_rule__VariablesSection__Group__1__Impl1282 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Assignments__Group__0__Impl_in_rule__Assignments__Group__01319 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Assignments__Group__1_in_rule__Assignments__Group__01322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignments__Group__1__Impl_in_rule__Assignments__Group__11380 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_rule__Assignments__Group__2_in_rule__Assignments__Group__11383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Assignments__Group__1__Impl1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignments__Group__2__Impl_in_rule__Assignments__Group__21442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignments__AssignmentsAssignment_2_in_rule__Assignments__Group__2__Impl1471 = new BitSet(new long[]{0x0000000000800032L});
    public static final BitSet FOLLOW_rule__Assignments__AssignmentsAssignment_2_in_rule__Assignments__Group__2__Impl1483 = new BitSet(new long[]{0x0000000000800032L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__0__Impl_in_rule__IntegerDeclarion__Group__01522 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__1_in_rule__IntegerDeclarion__Group__01525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__NameAssignment_0_in_rule__IntegerDeclarion__Group__0__Impl1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__1__Impl_in_rule__IntegerDeclarion__Group__11582 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__2_in_rule__IntegerDeclarion__Group__11585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__IntegerDeclarion__Group__1__Impl1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__2__Impl_in_rule__IntegerDeclarion__Group__21644 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__3_in_rule__IntegerDeclarion__Group__21647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__IntegerDeclarion__Group__2__Impl1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__3__Impl_in_rule__IntegerDeclarion__Group__31706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__IntegerDeclarion__Group__3__Impl1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__0__Impl_in_rule__BooleanDeclarion__Group__01773 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__1_in_rule__BooleanDeclarion__Group__01776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__NameAssignment_0_in_rule__BooleanDeclarion__Group__0__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__1__Impl_in_rule__BooleanDeclarion__Group__11833 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__2_in_rule__BooleanDeclarion__Group__11836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanDeclarion__Group__1__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__2__Impl_in_rule__BooleanDeclarion__Group__21895 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__3_in_rule__BooleanDeclarion__Group__21898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BooleanDeclarion__Group__2__Impl1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__3__Impl_in_rule__BooleanDeclarion__Group__31957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BooleanDeclarion__Group__3__Impl1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__0__Impl_in_rule__StateVariableDeclaration__Group__02024 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__1_in_rule__StateVariableDeclaration__Group__02027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__NameAssignment_0_in_rule__StateVariableDeclaration__Group__0__Impl2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__1__Impl_in_rule__StateVariableDeclaration__Group__12084 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__2_in_rule__StateVariableDeclaration__Group__12087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__StateVariableDeclaration__Group__1__Impl2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__2__Impl_in_rule__StateVariableDeclaration__Group__22146 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__3_in_rule__StateVariableDeclaration__Group__22149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StateVariableDeclaration__Group__2__Impl2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__3__Impl_in_rule__StateVariableDeclaration__Group__32208 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__4_in_rule__StateVariableDeclaration__Group__32211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__StatesAssignment_3_in_rule__StateVariableDeclaration__Group__3__Impl2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__4__Impl_in_rule__StateVariableDeclaration__Group__42268 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__5_in_rule__StateVariableDeclaration__Group__42271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group_4__0_in_rule__StateVariableDeclaration__Group__4__Impl2298 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__5__Impl_in_rule__StateVariableDeclaration__Group__52329 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__6_in_rule__StateVariableDeclaration__Group__52332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StateVariableDeclaration__Group__5__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__6__Impl_in_rule__StateVariableDeclaration__Group__62391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StateVariableDeclaration__Group__6__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group_4__0__Impl_in_rule__StateVariableDeclaration__Group_4__02464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group_4__1_in_rule__StateVariableDeclaration__Group_4__02467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StateVariableDeclaration__Group_4__0__Impl2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group_4__1__Impl_in_rule__StateVariableDeclaration__Group_4__12526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__StatesAssignment_4_1_in_rule__StateVariableDeclaration__Group_4__1__Impl2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__0__Impl_in_rule__BooleanAssignment__Group__02587 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__1_in_rule__BooleanAssignment__Group__02590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BooleanAssignment__Group__0__Impl2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__1__Impl_in_rule__BooleanAssignment__Group__12649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__2_in_rule__BooleanAssignment__Group__12652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BooleanAssignment__Group__1__Impl2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__2__Impl_in_rule__BooleanAssignment__Group__22711 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__3_in_rule__BooleanAssignment__Group__22714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__VarAssignment_2_in_rule__BooleanAssignment__Group__2__Impl2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__3__Impl_in_rule__BooleanAssignment__Group__32771 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__4_in_rule__BooleanAssignment__Group__32774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BooleanAssignment__Group__3__Impl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__4__Impl_in_rule__BooleanAssignment__Group__42833 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__5_in_rule__BooleanAssignment__Group__42836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BooleanAssignment__Group__4__Impl2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__5__Impl_in_rule__BooleanAssignment__Group__52895 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__6_in_rule__BooleanAssignment__Group__52898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__ValueAssignment_5_in_rule__BooleanAssignment__Group__5__Impl2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__6__Impl_in_rule__BooleanAssignment__Group__62955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BooleanAssignment__Group__6__Impl2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__0__Impl_in_rule__IntegerAssignment__Group__03028 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__1_in_rule__IntegerAssignment__Group__03031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IntegerAssignment__Group__0__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__1__Impl_in_rule__IntegerAssignment__Group__13090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__2_in_rule__IntegerAssignment__Group__13093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IntegerAssignment__Group__1__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__2__Impl_in_rule__IntegerAssignment__Group__23152 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__3_in_rule__IntegerAssignment__Group__23155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__VarAssignment_2_in_rule__IntegerAssignment__Group__2__Impl3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__3__Impl_in_rule__IntegerAssignment__Group__33212 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__4_in_rule__IntegerAssignment__Group__33215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IntegerAssignment__Group__3__Impl3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__4__Impl_in_rule__IntegerAssignment__Group__43274 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__5_in_rule__IntegerAssignment__Group__43277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__IntegerAssignment__Group__4__Impl3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__5__Impl_in_rule__IntegerAssignment__Group__53336 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__6_in_rule__IntegerAssignment__Group__53339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__ValueAssignment_5_in_rule__IntegerAssignment__Group__5__Impl3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__6__Impl_in_rule__IntegerAssignment__Group__63396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__IntegerAssignment__Group__6__Impl3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__0__Impl_in_rule__StateAssignment__Group__03469 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__1_in_rule__StateAssignment__Group__03472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StateAssignment__Group__0__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__1__Impl_in_rule__StateAssignment__Group__13531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__2_in_rule__StateAssignment__Group__13534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StateAssignment__Group__1__Impl3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__2__Impl_in_rule__StateAssignment__Group__23593 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__3_in_rule__StateAssignment__Group__23596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__VarAssignment_2_in_rule__StateAssignment__Group__2__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__3__Impl_in_rule__StateAssignment__Group__33653 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__4_in_rule__StateAssignment__Group__33656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StateAssignment__Group__3__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__4__Impl_in_rule__StateAssignment__Group__43715 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__5_in_rule__StateAssignment__Group__43718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StateAssignment__Group__4__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__5__Impl_in_rule__StateAssignment__Group__53777 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__6_in_rule__StateAssignment__Group__53780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__ValueAssignment_5_in_rule__StateAssignment__Group__5__Impl3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__6__Impl_in_rule__StateAssignment__Group__63837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StateAssignment__Group__6__Impl3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Model__SectionsAssignment3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMV_COMMENT_in_rule__Comment__CommentAssignment3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__VariablesSection__VariablesAssignment_13977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_rule__Assignments__AssignmentsAssignment_24008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerDeclarion__NameAssignment_04039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanDeclarion__NameAssignment_04070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__NameAssignment_04101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__StatesAssignment_34132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__StatesAssignment_4_14163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanAssignment__VarAssignment_24198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__BooleanAssignment__ValueAssignment_54233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerAssignment__VarAssignment_24268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerAssignment__ValueAssignment_54303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateAssignment__VarAssignment_24338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateAssignment__ValueAssignment_54373 = new BitSet(new long[]{0x0000000000000002L});

}