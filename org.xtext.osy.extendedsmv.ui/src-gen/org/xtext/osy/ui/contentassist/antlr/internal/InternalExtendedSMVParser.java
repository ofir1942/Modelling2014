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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SMV_COMMENT", "RULE_AND_OR", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'True'", "'False'", "'VAR'", "'ASSIGN'", "'TRANS'", "'->'", "'='", "'next'", "'('", "')'", "':'", "'integer'", "';'", "'boolean'", "'{'", "'}'", "','", "'init'", "':='"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_AND_OR=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_SMV_COMMENT=4;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=11;

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

                if ( ((LA1_0>=15 && LA1_0<=17)) ) {
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


    // $ANTLR start "entryRuleTransactions"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:200:1: entryRuleTransactions : ruleTransactions EOF ;
    public final void entryRuleTransactions() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:201:1: ( ruleTransactions EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:202:1: ruleTransactions EOF
            {
             before(grammarAccess.getTransactionsRule()); 
            pushFollow(FOLLOW_ruleTransactions_in_entryRuleTransactions362);
            ruleTransactions();

            state._fsp--;

             after(grammarAccess.getTransactionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactions369); 

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
    // $ANTLR end "entryRuleTransactions"


    // $ANTLR start "ruleTransactions"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:209:1: ruleTransactions : ( ( rule__Transactions__Group__0 ) ) ;
    public final void ruleTransactions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:213:2: ( ( ( rule__Transactions__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:214:1: ( ( rule__Transactions__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:214:1: ( ( rule__Transactions__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:215:1: ( rule__Transactions__Group__0 )
            {
             before(grammarAccess.getTransactionsAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:216:1: ( rule__Transactions__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:216:2: rule__Transactions__Group__0
            {
            pushFollow(FOLLOW_rule__Transactions__Group__0_in_ruleTransactions395);
            rule__Transactions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionsAccess().getGroup()); 

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
    // $ANTLR end "ruleTransactions"


    // $ANTLR start "entryRuleTransactionStatement"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:228:1: entryRuleTransactionStatement : ruleTransactionStatement EOF ;
    public final void entryRuleTransactionStatement() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:229:1: ( ruleTransactionStatement EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:230:1: ruleTransactionStatement EOF
            {
             before(grammarAccess.getTransactionStatementRule()); 
            pushFollow(FOLLOW_ruleTransactionStatement_in_entryRuleTransactionStatement422);
            ruleTransactionStatement();

            state._fsp--;

             after(grammarAccess.getTransactionStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactionStatement429); 

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
    // $ANTLR end "entryRuleTransactionStatement"


    // $ANTLR start "ruleTransactionStatement"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:237:1: ruleTransactionStatement : ( ( rule__TransactionStatement__Group__0 ) ) ;
    public final void ruleTransactionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:241:2: ( ( ( rule__TransactionStatement__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:242:1: ( ( rule__TransactionStatement__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:242:1: ( ( rule__TransactionStatement__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:243:1: ( rule__TransactionStatement__Group__0 )
            {
             before(grammarAccess.getTransactionStatementAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:244:1: ( rule__TransactionStatement__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:244:2: rule__TransactionStatement__Group__0
            {
            pushFollow(FOLLOW_rule__TransactionStatement__Group__0_in_ruleTransactionStatement455);
            rule__TransactionStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleTransactionStatement"


    // $ANTLR start "entryRuleTransactionPrecondition"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:256:1: entryRuleTransactionPrecondition : ruleTransactionPrecondition EOF ;
    public final void entryRuleTransactionPrecondition() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:257:1: ( ruleTransactionPrecondition EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:258:1: ruleTransactionPrecondition EOF
            {
             before(grammarAccess.getTransactionPreconditionRule()); 
            pushFollow(FOLLOW_ruleTransactionPrecondition_in_entryRuleTransactionPrecondition482);
            ruleTransactionPrecondition();

            state._fsp--;

             after(grammarAccess.getTransactionPreconditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactionPrecondition489); 

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
    // $ANTLR end "entryRuleTransactionPrecondition"


    // $ANTLR start "ruleTransactionPrecondition"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:265:1: ruleTransactionPrecondition : ( ( rule__TransactionPrecondition__Group__0 ) ) ;
    public final void ruleTransactionPrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:269:2: ( ( ( rule__TransactionPrecondition__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:270:1: ( ( rule__TransactionPrecondition__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:270:1: ( ( rule__TransactionPrecondition__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:271:1: ( rule__TransactionPrecondition__Group__0 )
            {
             before(grammarAccess.getTransactionPreconditionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:272:1: ( rule__TransactionPrecondition__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:272:2: rule__TransactionPrecondition__Group__0
            {
            pushFollow(FOLLOW_rule__TransactionPrecondition__Group__0_in_ruleTransactionPrecondition515);
            rule__TransactionPrecondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionPreconditionAccess().getGroup()); 

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
    // $ANTLR end "ruleTransactionPrecondition"


    // $ANTLR start "entryRulePreconditionStatement"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:284:1: entryRulePreconditionStatement : rulePreconditionStatement EOF ;
    public final void entryRulePreconditionStatement() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:285:1: ( rulePreconditionStatement EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:286:1: rulePreconditionStatement EOF
            {
             before(grammarAccess.getPreconditionStatementRule()); 
            pushFollow(FOLLOW_rulePreconditionStatement_in_entryRulePreconditionStatement542);
            rulePreconditionStatement();

            state._fsp--;

             after(grammarAccess.getPreconditionStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreconditionStatement549); 

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
    // $ANTLR end "entryRulePreconditionStatement"


    // $ANTLR start "rulePreconditionStatement"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:293:1: rulePreconditionStatement : ( ( rule__PreconditionStatement__Alternatives ) ) ;
    public final void rulePreconditionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:297:2: ( ( ( rule__PreconditionStatement__Alternatives ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:298:1: ( ( rule__PreconditionStatement__Alternatives ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:298:1: ( ( rule__PreconditionStatement__Alternatives ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:299:1: ( rule__PreconditionStatement__Alternatives )
            {
             before(grammarAccess.getPreconditionStatementAccess().getAlternatives()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:300:1: ( rule__PreconditionStatement__Alternatives )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:300:2: rule__PreconditionStatement__Alternatives
            {
            pushFollow(FOLLOW_rule__PreconditionStatement__Alternatives_in_rulePreconditionStatement575);
            rule__PreconditionStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionStatementAccess().getAlternatives()); 

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
    // $ANTLR end "rulePreconditionStatement"


    // $ANTLR start "entryRuleStatePrecondition"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:312:1: entryRuleStatePrecondition : ruleStatePrecondition EOF ;
    public final void entryRuleStatePrecondition() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:313:1: ( ruleStatePrecondition EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:314:1: ruleStatePrecondition EOF
            {
             before(grammarAccess.getStatePreconditionRule()); 
            pushFollow(FOLLOW_ruleStatePrecondition_in_entryRuleStatePrecondition602);
            ruleStatePrecondition();

            state._fsp--;

             after(grammarAccess.getStatePreconditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatePrecondition609); 

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
    // $ANTLR end "entryRuleStatePrecondition"


    // $ANTLR start "ruleStatePrecondition"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:321:1: ruleStatePrecondition : ( ( rule__StatePrecondition__Group__0 ) ) ;
    public final void ruleStatePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:325:2: ( ( ( rule__StatePrecondition__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:326:1: ( ( rule__StatePrecondition__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:326:1: ( ( rule__StatePrecondition__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:327:1: ( rule__StatePrecondition__Group__0 )
            {
             before(grammarAccess.getStatePreconditionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:328:1: ( rule__StatePrecondition__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:328:2: rule__StatePrecondition__Group__0
            {
            pushFollow(FOLLOW_rule__StatePrecondition__Group__0_in_ruleStatePrecondition635);
            rule__StatePrecondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatePreconditionAccess().getGroup()); 

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
    // $ANTLR end "ruleStatePrecondition"


    // $ANTLR start "entryRuleBooleanPrecondition"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:340:1: entryRuleBooleanPrecondition : ruleBooleanPrecondition EOF ;
    public final void entryRuleBooleanPrecondition() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:341:1: ( ruleBooleanPrecondition EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:342:1: ruleBooleanPrecondition EOF
            {
             before(grammarAccess.getBooleanPreconditionRule()); 
            pushFollow(FOLLOW_ruleBooleanPrecondition_in_entryRuleBooleanPrecondition662);
            ruleBooleanPrecondition();

            state._fsp--;

             after(grammarAccess.getBooleanPreconditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanPrecondition669); 

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
    // $ANTLR end "entryRuleBooleanPrecondition"


    // $ANTLR start "ruleBooleanPrecondition"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:349:1: ruleBooleanPrecondition : ( ( rule__BooleanPrecondition__Group__0 ) ) ;
    public final void ruleBooleanPrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:353:2: ( ( ( rule__BooleanPrecondition__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:354:1: ( ( rule__BooleanPrecondition__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:354:1: ( ( rule__BooleanPrecondition__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:355:1: ( rule__BooleanPrecondition__Group__0 )
            {
             before(grammarAccess.getBooleanPreconditionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:356:1: ( rule__BooleanPrecondition__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:356:2: rule__BooleanPrecondition__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanPrecondition__Group__0_in_ruleBooleanPrecondition695);
            rule__BooleanPrecondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanPreconditionAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanPrecondition"


    // $ANTLR start "entryRuleIntegerPrecondition"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:368:1: entryRuleIntegerPrecondition : ruleIntegerPrecondition EOF ;
    public final void entryRuleIntegerPrecondition() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:369:1: ( ruleIntegerPrecondition EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:370:1: ruleIntegerPrecondition EOF
            {
             before(grammarAccess.getIntegerPreconditionRule()); 
            pushFollow(FOLLOW_ruleIntegerPrecondition_in_entryRuleIntegerPrecondition722);
            ruleIntegerPrecondition();

            state._fsp--;

             after(grammarAccess.getIntegerPreconditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerPrecondition729); 

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
    // $ANTLR end "entryRuleIntegerPrecondition"


    // $ANTLR start "ruleIntegerPrecondition"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:377:1: ruleIntegerPrecondition : ( ( rule__IntegerPrecondition__Group__0 ) ) ;
    public final void ruleIntegerPrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:381:2: ( ( ( rule__IntegerPrecondition__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:382:1: ( ( rule__IntegerPrecondition__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:382:1: ( ( rule__IntegerPrecondition__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:383:1: ( rule__IntegerPrecondition__Group__0 )
            {
             before(grammarAccess.getIntegerPreconditionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:384:1: ( rule__IntegerPrecondition__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:384:2: rule__IntegerPrecondition__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerPrecondition__Group__0_in_ruleIntegerPrecondition755);
            rule__IntegerPrecondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPreconditionAccess().getGroup()); 

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
    // $ANTLR end "ruleIntegerPrecondition"


    // $ANTLR start "entryRulePostTransaction"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:396:1: entryRulePostTransaction : rulePostTransaction EOF ;
    public final void entryRulePostTransaction() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:397:1: ( rulePostTransaction EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:398:1: rulePostTransaction EOF
            {
             before(grammarAccess.getPostTransactionRule()); 
            pushFollow(FOLLOW_rulePostTransaction_in_entryRulePostTransaction782);
            rulePostTransaction();

            state._fsp--;

             after(grammarAccess.getPostTransactionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostTransaction789); 

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
    // $ANTLR end "entryRulePostTransaction"


    // $ANTLR start "rulePostTransaction"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:405:1: rulePostTransaction : ( ( rule__PostTransaction__Group__0 ) ) ;
    public final void rulePostTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:409:2: ( ( ( rule__PostTransaction__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:410:1: ( ( rule__PostTransaction__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:410:1: ( ( rule__PostTransaction__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:411:1: ( rule__PostTransaction__Group__0 )
            {
             before(grammarAccess.getPostTransactionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:412:1: ( rule__PostTransaction__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:412:2: rule__PostTransaction__Group__0
            {
            pushFollow(FOLLOW_rule__PostTransaction__Group__0_in_rulePostTransaction815);
            rule__PostTransaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPostTransactionAccess().getGroup()); 

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
    // $ANTLR end "rulePostTransaction"


    // $ANTLR start "entryRulePostTransactionStatement"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:424:1: entryRulePostTransactionStatement : rulePostTransactionStatement EOF ;
    public final void entryRulePostTransactionStatement() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:425:1: ( rulePostTransactionStatement EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:426:1: rulePostTransactionStatement EOF
            {
             before(grammarAccess.getPostTransactionStatementRule()); 
            pushFollow(FOLLOW_rulePostTransactionStatement_in_entryRulePostTransactionStatement842);
            rulePostTransactionStatement();

            state._fsp--;

             after(grammarAccess.getPostTransactionStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostTransactionStatement849); 

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
    // $ANTLR end "entryRulePostTransactionStatement"


    // $ANTLR start "rulePostTransactionStatement"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:433:1: rulePostTransactionStatement : ( ( rule__PostTransactionStatement__Alternatives ) ) ;
    public final void rulePostTransactionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:437:2: ( ( ( rule__PostTransactionStatement__Alternatives ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:438:1: ( ( rule__PostTransactionStatement__Alternatives ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:438:1: ( ( rule__PostTransactionStatement__Alternatives ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:439:1: ( rule__PostTransactionStatement__Alternatives )
            {
             before(grammarAccess.getPostTransactionStatementAccess().getAlternatives()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:440:1: ( rule__PostTransactionStatement__Alternatives )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:440:2: rule__PostTransactionStatement__Alternatives
            {
            pushFollow(FOLLOW_rule__PostTransactionStatement__Alternatives_in_rulePostTransactionStatement875);
            rule__PostTransactionStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPostTransactionStatementAccess().getAlternatives()); 

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
    // $ANTLR end "rulePostTransactionStatement"


    // $ANTLR start "entryRuleSimplePostTransaction"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:452:1: entryRuleSimplePostTransaction : ruleSimplePostTransaction EOF ;
    public final void entryRuleSimplePostTransaction() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:453:1: ( ruleSimplePostTransaction EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:454:1: ruleSimplePostTransaction EOF
            {
             before(grammarAccess.getSimplePostTransactionRule()); 
            pushFollow(FOLLOW_ruleSimplePostTransaction_in_entryRuleSimplePostTransaction902);
            ruleSimplePostTransaction();

            state._fsp--;

             after(grammarAccess.getSimplePostTransactionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimplePostTransaction909); 

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
    // $ANTLR end "entryRuleSimplePostTransaction"


    // $ANTLR start "ruleSimplePostTransaction"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:461:1: ruleSimplePostTransaction : ( ( rule__SimplePostTransaction__Alternatives ) ) ;
    public final void ruleSimplePostTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:465:2: ( ( ( rule__SimplePostTransaction__Alternatives ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:466:1: ( ( rule__SimplePostTransaction__Alternatives ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:466:1: ( ( rule__SimplePostTransaction__Alternatives ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:467:1: ( rule__SimplePostTransaction__Alternatives )
            {
             before(grammarAccess.getSimplePostTransactionAccess().getAlternatives()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:468:1: ( rule__SimplePostTransaction__Alternatives )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:468:2: rule__SimplePostTransaction__Alternatives
            {
            pushFollow(FOLLOW_rule__SimplePostTransaction__Alternatives_in_ruleSimplePostTransaction935);
            rule__SimplePostTransaction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimplePostTransactionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSimplePostTransaction"


    // $ANTLR start "entryRuleStatePostTransaction"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:480:1: entryRuleStatePostTransaction : ruleStatePostTransaction EOF ;
    public final void entryRuleStatePostTransaction() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:481:1: ( ruleStatePostTransaction EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:482:1: ruleStatePostTransaction EOF
            {
             before(grammarAccess.getStatePostTransactionRule()); 
            pushFollow(FOLLOW_ruleStatePostTransaction_in_entryRuleStatePostTransaction962);
            ruleStatePostTransaction();

            state._fsp--;

             after(grammarAccess.getStatePostTransactionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatePostTransaction969); 

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
    // $ANTLR end "entryRuleStatePostTransaction"


    // $ANTLR start "ruleStatePostTransaction"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:489:1: ruleStatePostTransaction : ( ( rule__StatePostTransaction__Group__0 ) ) ;
    public final void ruleStatePostTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:493:2: ( ( ( rule__StatePostTransaction__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:494:1: ( ( rule__StatePostTransaction__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:494:1: ( ( rule__StatePostTransaction__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:495:1: ( rule__StatePostTransaction__Group__0 )
            {
             before(grammarAccess.getStatePostTransactionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:496:1: ( rule__StatePostTransaction__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:496:2: rule__StatePostTransaction__Group__0
            {
            pushFollow(FOLLOW_rule__StatePostTransaction__Group__0_in_ruleStatePostTransaction995);
            rule__StatePostTransaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatePostTransactionAccess().getGroup()); 

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
    // $ANTLR end "ruleStatePostTransaction"


    // $ANTLR start "entryRuleBooleanPostTransaction"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:508:1: entryRuleBooleanPostTransaction : ruleBooleanPostTransaction EOF ;
    public final void entryRuleBooleanPostTransaction() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:509:1: ( ruleBooleanPostTransaction EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:510:1: ruleBooleanPostTransaction EOF
            {
             before(grammarAccess.getBooleanPostTransactionRule()); 
            pushFollow(FOLLOW_ruleBooleanPostTransaction_in_entryRuleBooleanPostTransaction1022);
            ruleBooleanPostTransaction();

            state._fsp--;

             after(grammarAccess.getBooleanPostTransactionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanPostTransaction1029); 

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
    // $ANTLR end "entryRuleBooleanPostTransaction"


    // $ANTLR start "ruleBooleanPostTransaction"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:517:1: ruleBooleanPostTransaction : ( ( rule__BooleanPostTransaction__Group__0 ) ) ;
    public final void ruleBooleanPostTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:521:2: ( ( ( rule__BooleanPostTransaction__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:522:1: ( ( rule__BooleanPostTransaction__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:522:1: ( ( rule__BooleanPostTransaction__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:523:1: ( rule__BooleanPostTransaction__Group__0 )
            {
             before(grammarAccess.getBooleanPostTransactionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:524:1: ( rule__BooleanPostTransaction__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:524:2: rule__BooleanPostTransaction__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanPostTransaction__Group__0_in_ruleBooleanPostTransaction1055);
            rule__BooleanPostTransaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanPostTransactionAccess().getGroup()); 

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
    // $ANTLR end "ruleBooleanPostTransaction"


    // $ANTLR start "entryRuleIntegerPostTransaction"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:536:1: entryRuleIntegerPostTransaction : ruleIntegerPostTransaction EOF ;
    public final void entryRuleIntegerPostTransaction() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:537:1: ( ruleIntegerPostTransaction EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:538:1: ruleIntegerPostTransaction EOF
            {
             before(grammarAccess.getIntegerPostTransactionRule()); 
            pushFollow(FOLLOW_ruleIntegerPostTransaction_in_entryRuleIntegerPostTransaction1082);
            ruleIntegerPostTransaction();

            state._fsp--;

             after(grammarAccess.getIntegerPostTransactionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerPostTransaction1089); 

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
    // $ANTLR end "entryRuleIntegerPostTransaction"


    // $ANTLR start "ruleIntegerPostTransaction"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:545:1: ruleIntegerPostTransaction : ( ( rule__IntegerPostTransaction__Group__0 ) ) ;
    public final void ruleIntegerPostTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:549:2: ( ( ( rule__IntegerPostTransaction__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:550:1: ( ( rule__IntegerPostTransaction__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:550:1: ( ( rule__IntegerPostTransaction__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:551:1: ( rule__IntegerPostTransaction__Group__0 )
            {
             before(grammarAccess.getIntegerPostTransactionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:552:1: ( rule__IntegerPostTransaction__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:552:2: rule__IntegerPostTransaction__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerPostTransaction__Group__0_in_ruleIntegerPostTransaction1115);
            rule__IntegerPostTransaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPostTransactionAccess().getGroup()); 

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
    // $ANTLR end "ruleIntegerPostTransaction"


    // $ANTLR start "entryRuleConditionalPostTRansaction"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:564:1: entryRuleConditionalPostTRansaction : ruleConditionalPostTRansaction EOF ;
    public final void entryRuleConditionalPostTRansaction() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:565:1: ( ruleConditionalPostTRansaction EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:566:1: ruleConditionalPostTRansaction EOF
            {
             before(grammarAccess.getConditionalPostTRansactionRule()); 
            pushFollow(FOLLOW_ruleConditionalPostTRansaction_in_entryRuleConditionalPostTRansaction1142);
            ruleConditionalPostTRansaction();

            state._fsp--;

             after(grammarAccess.getConditionalPostTRansactionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalPostTRansaction1149); 

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
    // $ANTLR end "entryRuleConditionalPostTRansaction"


    // $ANTLR start "ruleConditionalPostTRansaction"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:573:1: ruleConditionalPostTRansaction : ( ( rule__ConditionalPostTRansaction__NameAssignment ) ) ;
    public final void ruleConditionalPostTRansaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:577:2: ( ( ( rule__ConditionalPostTRansaction__NameAssignment ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:578:1: ( ( rule__ConditionalPostTRansaction__NameAssignment ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:578:1: ( ( rule__ConditionalPostTRansaction__NameAssignment ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:579:1: ( rule__ConditionalPostTRansaction__NameAssignment )
            {
             before(grammarAccess.getConditionalPostTRansactionAccess().getNameAssignment()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:580:1: ( rule__ConditionalPostTRansaction__NameAssignment )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:580:2: rule__ConditionalPostTRansaction__NameAssignment
            {
            pushFollow(FOLLOW_rule__ConditionalPostTRansaction__NameAssignment_in_ruleConditionalPostTRansaction1175);
            rule__ConditionalPostTRansaction__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConditionalPostTRansactionAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleConditionalPostTRansaction"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:592:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:593:1: ( ruleVariableDeclaration EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:594:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1202);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration1209); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:601:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Alternatives ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:605:2: ( ( ( rule__VariableDeclaration__Alternatives ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:606:1: ( ( rule__VariableDeclaration__Alternatives ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:606:1: ( ( rule__VariableDeclaration__Alternatives ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:607:1: ( rule__VariableDeclaration__Alternatives )
            {
             before(grammarAccess.getVariableDeclarationAccess().getAlternatives()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:608:1: ( rule__VariableDeclaration__Alternatives )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:608:2: rule__VariableDeclaration__Alternatives
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Alternatives_in_ruleVariableDeclaration1235);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:620:1: entryRuleIntegerDeclarion : ruleIntegerDeclarion EOF ;
    public final void entryRuleIntegerDeclarion() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:621:1: ( ruleIntegerDeclarion EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:622:1: ruleIntegerDeclarion EOF
            {
             before(grammarAccess.getIntegerDeclarionRule()); 
            pushFollow(FOLLOW_ruleIntegerDeclarion_in_entryRuleIntegerDeclarion1262);
            ruleIntegerDeclarion();

            state._fsp--;

             after(grammarAccess.getIntegerDeclarionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerDeclarion1269); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:629:1: ruleIntegerDeclarion : ( ( rule__IntegerDeclarion__Group__0 ) ) ;
    public final void ruleIntegerDeclarion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:633:2: ( ( ( rule__IntegerDeclarion__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:634:1: ( ( rule__IntegerDeclarion__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:634:1: ( ( rule__IntegerDeclarion__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:635:1: ( rule__IntegerDeclarion__Group__0 )
            {
             before(grammarAccess.getIntegerDeclarionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:636:1: ( rule__IntegerDeclarion__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:636:2: rule__IntegerDeclarion__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__0_in_ruleIntegerDeclarion1295);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:648:1: entryRuleBooleanDeclarion : ruleBooleanDeclarion EOF ;
    public final void entryRuleBooleanDeclarion() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:649:1: ( ruleBooleanDeclarion EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:650:1: ruleBooleanDeclarion EOF
            {
             before(grammarAccess.getBooleanDeclarionRule()); 
            pushFollow(FOLLOW_ruleBooleanDeclarion_in_entryRuleBooleanDeclarion1322);
            ruleBooleanDeclarion();

            state._fsp--;

             after(grammarAccess.getBooleanDeclarionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanDeclarion1329); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:657:1: ruleBooleanDeclarion : ( ( rule__BooleanDeclarion__Group__0 ) ) ;
    public final void ruleBooleanDeclarion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:661:2: ( ( ( rule__BooleanDeclarion__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:662:1: ( ( rule__BooleanDeclarion__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:662:1: ( ( rule__BooleanDeclarion__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:663:1: ( rule__BooleanDeclarion__Group__0 )
            {
             before(grammarAccess.getBooleanDeclarionAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:664:1: ( rule__BooleanDeclarion__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:664:2: rule__BooleanDeclarion__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__0_in_ruleBooleanDeclarion1355);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:676:1: entryRuleStateVariableDeclaration : ruleStateVariableDeclaration EOF ;
    public final void entryRuleStateVariableDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:677:1: ( ruleStateVariableDeclaration EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:678:1: ruleStateVariableDeclaration EOF
            {
             before(grammarAccess.getStateVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration1382);
            ruleStateVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getStateVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateVariableDeclaration1389); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:685:1: ruleStateVariableDeclaration : ( ( rule__StateVariableDeclaration__Group__0 ) ) ;
    public final void ruleStateVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:689:2: ( ( ( rule__StateVariableDeclaration__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:690:1: ( ( rule__StateVariableDeclaration__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:690:1: ( ( rule__StateVariableDeclaration__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:691:1: ( rule__StateVariableDeclaration__Group__0 )
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:692:1: ( rule__StateVariableDeclaration__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:692:2: rule__StateVariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__0_in_ruleStateVariableDeclaration1415);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:704:1: entryRuleAssignmentExpression : ruleAssignmentExpression EOF ;
    public final void entryRuleAssignmentExpression() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:705:1: ( ruleAssignmentExpression EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:706:1: ruleAssignmentExpression EOF
            {
             before(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression1442);
            ruleAssignmentExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression1449); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:713:1: ruleAssignmentExpression : ( ( rule__AssignmentExpression__Alternatives ) ) ;
    public final void ruleAssignmentExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:717:2: ( ( ( rule__AssignmentExpression__Alternatives ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:718:1: ( ( rule__AssignmentExpression__Alternatives ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:718:1: ( ( rule__AssignmentExpression__Alternatives ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:719:1: ( rule__AssignmentExpression__Alternatives )
            {
             before(grammarAccess.getAssignmentExpressionAccess().getAlternatives()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:720:1: ( rule__AssignmentExpression__Alternatives )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:720:2: rule__AssignmentExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__AssignmentExpression__Alternatives_in_ruleAssignmentExpression1475);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:732:1: entryRuleBooleanAssignment : ruleBooleanAssignment EOF ;
    public final void entryRuleBooleanAssignment() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:733:1: ( ruleBooleanAssignment EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:734:1: ruleBooleanAssignment EOF
            {
             before(grammarAccess.getBooleanAssignmentRule()); 
            pushFollow(FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment1502);
            ruleBooleanAssignment();

            state._fsp--;

             after(grammarAccess.getBooleanAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAssignment1509); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:741:1: ruleBooleanAssignment : ( ( rule__BooleanAssignment__Group__0 ) ) ;
    public final void ruleBooleanAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:745:2: ( ( ( rule__BooleanAssignment__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:746:1: ( ( rule__BooleanAssignment__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:746:1: ( ( rule__BooleanAssignment__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:747:1: ( rule__BooleanAssignment__Group__0 )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:748:1: ( rule__BooleanAssignment__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:748:2: rule__BooleanAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__0_in_ruleBooleanAssignment1535);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:760:1: entryRuleBOOL : ruleBOOL EOF ;
    public final void entryRuleBOOL() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:761:1: ( ruleBOOL EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:762:1: ruleBOOL EOF
            {
             before(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL1562);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getBOOLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL1569); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:769:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:773:2: ( ( ( rule__BOOL__Alternatives ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:774:1: ( ( rule__BOOL__Alternatives ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:774:1: ( ( rule__BOOL__Alternatives ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:775:1: ( rule__BOOL__Alternatives )
            {
             before(grammarAccess.getBOOLAccess().getAlternatives()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:776:1: ( rule__BOOL__Alternatives )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:776:2: rule__BOOL__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL1595);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:788:1: entryRuleIntegerAssignment : ruleIntegerAssignment EOF ;
    public final void entryRuleIntegerAssignment() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:789:1: ( ruleIntegerAssignment EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:790:1: ruleIntegerAssignment EOF
            {
             before(grammarAccess.getIntegerAssignmentRule()); 
            pushFollow(FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment1622);
            ruleIntegerAssignment();

            state._fsp--;

             after(grammarAccess.getIntegerAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerAssignment1629); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:797:1: ruleIntegerAssignment : ( ( rule__IntegerAssignment__Group__0 ) ) ;
    public final void ruleIntegerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:801:2: ( ( ( rule__IntegerAssignment__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:802:1: ( ( rule__IntegerAssignment__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:802:1: ( ( rule__IntegerAssignment__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:803:1: ( rule__IntegerAssignment__Group__0 )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:804:1: ( rule__IntegerAssignment__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:804:2: rule__IntegerAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__0_in_ruleIntegerAssignment1655);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:816:1: entryRuleStateAssignment : ruleStateAssignment EOF ;
    public final void entryRuleStateAssignment() throws RecognitionException {
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:817:1: ( ruleStateAssignment EOF )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:818:1: ruleStateAssignment EOF
            {
             before(grammarAccess.getStateAssignmentRule()); 
            pushFollow(FOLLOW_ruleStateAssignment_in_entryRuleStateAssignment1682);
            ruleStateAssignment();

            state._fsp--;

             after(grammarAccess.getStateAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateAssignment1689); 

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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:825:1: ruleStateAssignment : ( ( rule__StateAssignment__Group__0 ) ) ;
    public final void ruleStateAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:829:2: ( ( ( rule__StateAssignment__Group__0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:830:1: ( ( rule__StateAssignment__Group__0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:830:1: ( ( rule__StateAssignment__Group__0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:831:1: ( rule__StateAssignment__Group__0 )
            {
             before(grammarAccess.getStateAssignmentAccess().getGroup()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:832:1: ( rule__StateAssignment__Group__0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:832:2: rule__StateAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__0_in_ruleStateAssignment1715);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:844:1: rule__Section__Alternatives : ( ( ruleVariablesSection ) | ( ruleAssignments ) | ( ruleTransactions ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:848:1: ( ( ruleVariablesSection ) | ( ruleAssignments ) | ( ruleTransactions ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:849:1: ( ruleVariablesSection )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:849:1: ( ruleVariablesSection )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:850:1: ruleVariablesSection
                    {
                     before(grammarAccess.getSectionAccess().getVariablesSectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVariablesSection_in_rule__Section__Alternatives1751);
                    ruleVariablesSection();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getVariablesSectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:855:6: ( ruleAssignments )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:855:6: ( ruleAssignments )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:856:1: ruleAssignments
                    {
                     before(grammarAccess.getSectionAccess().getAssignmentsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAssignments_in_rule__Section__Alternatives1768);
                    ruleAssignments();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getAssignmentsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:861:6: ( ruleTransactions )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:861:6: ( ruleTransactions )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:862:1: ruleTransactions
                    {
                     before(grammarAccess.getSectionAccess().getTransactionsParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTransactions_in_rule__Section__Alternatives1785);
                    ruleTransactions();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getTransactionsParserRuleCall_2()); 

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


    // $ANTLR start "rule__PreconditionStatement__Alternatives"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:872:1: rule__PreconditionStatement__Alternatives : ( ( ruleIntegerPrecondition ) | ( ruleBooleanPrecondition ) | ( ruleStatePrecondition ) | ( ruleComment ) );
    public final void rule__PreconditionStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:876:1: ( ( ruleIntegerPrecondition ) | ( ruleBooleanPrecondition ) | ( ruleStatePrecondition ) | ( ruleComment ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==19) ) {
                    switch ( input.LA(3) ) {
                    case 13:
                    case 14:
                        {
                        alt3=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt3=3;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt3=1;
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
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:877:1: ( ruleIntegerPrecondition )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:877:1: ( ruleIntegerPrecondition )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:878:1: ruleIntegerPrecondition
                    {
                     before(grammarAccess.getPreconditionStatementAccess().getIntegerPreconditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerPrecondition_in_rule__PreconditionStatement__Alternatives1817);
                    ruleIntegerPrecondition();

                    state._fsp--;

                     after(grammarAccess.getPreconditionStatementAccess().getIntegerPreconditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:883:6: ( ruleBooleanPrecondition )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:883:6: ( ruleBooleanPrecondition )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:884:1: ruleBooleanPrecondition
                    {
                     before(grammarAccess.getPreconditionStatementAccess().getBooleanPreconditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanPrecondition_in_rule__PreconditionStatement__Alternatives1834);
                    ruleBooleanPrecondition();

                    state._fsp--;

                     after(grammarAccess.getPreconditionStatementAccess().getBooleanPreconditionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:889:6: ( ruleStatePrecondition )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:889:6: ( ruleStatePrecondition )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:890:1: ruleStatePrecondition
                    {
                     before(grammarAccess.getPreconditionStatementAccess().getStatePreconditionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStatePrecondition_in_rule__PreconditionStatement__Alternatives1851);
                    ruleStatePrecondition();

                    state._fsp--;

                     after(grammarAccess.getPreconditionStatementAccess().getStatePreconditionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:895:6: ( ruleComment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:895:6: ( ruleComment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:896:1: ruleComment
                    {
                     before(grammarAccess.getPreconditionStatementAccess().getCommentParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleComment_in_rule__PreconditionStatement__Alternatives1868);
                    ruleComment();

                    state._fsp--;

                     after(grammarAccess.getPreconditionStatementAccess().getCommentParserRuleCall_3()); 

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
    // $ANTLR end "rule__PreconditionStatement__Alternatives"


    // $ANTLR start "rule__PostTransactionStatement__Alternatives"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:906:1: rule__PostTransactionStatement__Alternatives : ( ( ruleConditionalPostTRansaction ) | ( ruleSimplePostTransaction ) );
    public final void rule__PostTransactionStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:910:1: ( ( ruleConditionalPostTRansaction ) | ( ruleSimplePostTransaction ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:911:1: ( ruleConditionalPostTRansaction )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:911:1: ( ruleConditionalPostTRansaction )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:912:1: ruleConditionalPostTRansaction
                    {
                     before(grammarAccess.getPostTransactionStatementAccess().getConditionalPostTRansactionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConditionalPostTRansaction_in_rule__PostTransactionStatement__Alternatives1900);
                    ruleConditionalPostTRansaction();

                    state._fsp--;

                     after(grammarAccess.getPostTransactionStatementAccess().getConditionalPostTRansactionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:917:6: ( ruleSimplePostTransaction )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:917:6: ( ruleSimplePostTransaction )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:918:1: ruleSimplePostTransaction
                    {
                     before(grammarAccess.getPostTransactionStatementAccess().getSimplePostTransactionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSimplePostTransaction_in_rule__PostTransactionStatement__Alternatives1917);
                    ruleSimplePostTransaction();

                    state._fsp--;

                     after(grammarAccess.getPostTransactionStatementAccess().getSimplePostTransactionParserRuleCall_1()); 

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
    // $ANTLR end "rule__PostTransactionStatement__Alternatives"


    // $ANTLR start "rule__SimplePostTransaction__Alternatives"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:928:1: rule__SimplePostTransaction__Alternatives : ( ( ruleIntegerPostTransaction ) | ( ruleBooleanPostTransaction ) | ( ruleStatePostTransaction ) );
    public final void rule__SimplePostTransaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:932:1: ( ( ruleIntegerPostTransaction ) | ( ruleBooleanPostTransaction ) | ( ruleStatePostTransaction ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==21) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_ID) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==22) ) {
                            int LA5_4 = input.LA(5);

                            if ( (LA5_4==19) ) {
                                switch ( input.LA(6) ) {
                                case RULE_ID:
                                    {
                                    alt5=3;
                                    }
                                    break;
                                case 13:
                                case 14:
                                    {
                                    alt5=2;
                                    }
                                    break;
                                case RULE_INT:
                                    {
                                    alt5=1;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 5, input);

                                    throw nvae;
                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:933:1: ( ruleIntegerPostTransaction )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:933:1: ( ruleIntegerPostTransaction )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:934:1: ruleIntegerPostTransaction
                    {
                     before(grammarAccess.getSimplePostTransactionAccess().getIntegerPostTransactionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerPostTransaction_in_rule__SimplePostTransaction__Alternatives1949);
                    ruleIntegerPostTransaction();

                    state._fsp--;

                     after(grammarAccess.getSimplePostTransactionAccess().getIntegerPostTransactionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:939:6: ( ruleBooleanPostTransaction )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:939:6: ( ruleBooleanPostTransaction )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:940:1: ruleBooleanPostTransaction
                    {
                     before(grammarAccess.getSimplePostTransactionAccess().getBooleanPostTransactionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanPostTransaction_in_rule__SimplePostTransaction__Alternatives1966);
                    ruleBooleanPostTransaction();

                    state._fsp--;

                     after(grammarAccess.getSimplePostTransactionAccess().getBooleanPostTransactionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:945:6: ( ruleStatePostTransaction )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:945:6: ( ruleStatePostTransaction )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:946:1: ruleStatePostTransaction
                    {
                     before(grammarAccess.getSimplePostTransactionAccess().getStatePostTransactionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStatePostTransaction_in_rule__SimplePostTransaction__Alternatives1983);
                    ruleStatePostTransaction();

                    state._fsp--;

                     after(grammarAccess.getSimplePostTransactionAccess().getStatePostTransactionParserRuleCall_2()); 

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
    // $ANTLR end "rule__SimplePostTransaction__Alternatives"


    // $ANTLR start "rule__VariableDeclaration__Alternatives"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:956:1: rule__VariableDeclaration__Alternatives : ( ( ruleIntegerDeclarion ) | ( ruleBooleanDeclarion ) | ( ruleStateVariableDeclaration ) | ( ruleComment ) );
    public final void rule__VariableDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:960:1: ( ( ruleIntegerDeclarion ) | ( ruleBooleanDeclarion ) | ( ruleStateVariableDeclaration ) | ( ruleComment ) )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==23) ) {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        alt6=1;
                        }
                        break;
                    case 27:
                        {
                        alt6=3;
                        }
                        break;
                    case 26:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_SMV_COMMENT) ) {
                alt6=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:961:1: ( ruleIntegerDeclarion )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:961:1: ( ruleIntegerDeclarion )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:962:1: ruleIntegerDeclarion
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getIntegerDeclarionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerDeclarion_in_rule__VariableDeclaration__Alternatives2015);
                    ruleIntegerDeclarion();

                    state._fsp--;

                     after(grammarAccess.getVariableDeclarationAccess().getIntegerDeclarionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:967:6: ( ruleBooleanDeclarion )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:967:6: ( ruleBooleanDeclarion )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:968:1: ruleBooleanDeclarion
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getBooleanDeclarionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanDeclarion_in_rule__VariableDeclaration__Alternatives2032);
                    ruleBooleanDeclarion();

                    state._fsp--;

                     after(grammarAccess.getVariableDeclarationAccess().getBooleanDeclarionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:973:6: ( ruleStateVariableDeclaration )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:973:6: ( ruleStateVariableDeclaration )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:974:1: ruleStateVariableDeclaration
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getStateVariableDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStateVariableDeclaration_in_rule__VariableDeclaration__Alternatives2049);
                    ruleStateVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVariableDeclarationAccess().getStateVariableDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:979:6: ( ruleComment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:979:6: ( ruleComment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:980:1: ruleComment
                    {
                     before(grammarAccess.getVariableDeclarationAccess().getCommentParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleComment_in_rule__VariableDeclaration__Alternatives2066);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:990:1: rule__AssignmentExpression__Alternatives : ( ( ruleIntegerAssignment ) | ( ruleBooleanAssignment ) | ( ruleStateAssignment ) | ( ruleComment ) );
    public final void rule__AssignmentExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:994:1: ( ( ruleIntegerAssignment ) | ( ruleBooleanAssignment ) | ( ruleStateAssignment ) | ( ruleComment ) )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:995:1: ( ruleIntegerAssignment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:995:1: ( ruleIntegerAssignment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:996:1: ruleIntegerAssignment
                    {
                     before(grammarAccess.getAssignmentExpressionAccess().getIntegerAssignmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerAssignment_in_rule__AssignmentExpression__Alternatives2098);
                    ruleIntegerAssignment();

                    state._fsp--;

                     after(grammarAccess.getAssignmentExpressionAccess().getIntegerAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1001:6: ( ruleBooleanAssignment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1001:6: ( ruleBooleanAssignment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1002:1: ruleBooleanAssignment
                    {
                     before(grammarAccess.getAssignmentExpressionAccess().getBooleanAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanAssignment_in_rule__AssignmentExpression__Alternatives2115);
                    ruleBooleanAssignment();

                    state._fsp--;

                     after(grammarAccess.getAssignmentExpressionAccess().getBooleanAssignmentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1007:6: ( ruleStateAssignment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1007:6: ( ruleStateAssignment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1008:1: ruleStateAssignment
                    {
                     before(grammarAccess.getAssignmentExpressionAccess().getStateAssignmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStateAssignment_in_rule__AssignmentExpression__Alternatives2132);
                    ruleStateAssignment();

                    state._fsp--;

                     after(grammarAccess.getAssignmentExpressionAccess().getStateAssignmentParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1013:6: ( ruleComment )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1013:6: ( ruleComment )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1014:1: ruleComment
                    {
                     before(grammarAccess.getAssignmentExpressionAccess().getCommentParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleComment_in_rule__AssignmentExpression__Alternatives2149);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1024:1: rule__BOOL__Alternatives : ( ( 'True' ) | ( 'False' ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1028:1: ( ( 'True' ) | ( 'False' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1029:1: ( 'True' )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1029:1: ( 'True' )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1030:1: 'True'
                    {
                     before(grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__BOOL__Alternatives2182); 
                     after(grammarAccess.getBOOLAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1037:6: ( 'False' )
                    {
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1037:6: ( 'False' )
                    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1038:1: 'False'
                    {
                     before(grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__BOOL__Alternatives2202); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1052:1: rule__VariablesSection__Group__0 : rule__VariablesSection__Group__0__Impl rule__VariablesSection__Group__1 ;
    public final void rule__VariablesSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1056:1: ( rule__VariablesSection__Group__0__Impl rule__VariablesSection__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1057:2: rule__VariablesSection__Group__0__Impl rule__VariablesSection__Group__1
            {
            pushFollow(FOLLOW_rule__VariablesSection__Group__0__Impl_in_rule__VariablesSection__Group__02234);
            rule__VariablesSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariablesSection__Group__1_in_rule__VariablesSection__Group__02237);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1064:1: rule__VariablesSection__Group__0__Impl : ( 'VAR' ) ;
    public final void rule__VariablesSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1068:1: ( ( 'VAR' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1069:1: ( 'VAR' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1069:1: ( 'VAR' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1070:1: 'VAR'
            {
             before(grammarAccess.getVariablesSectionAccess().getVARKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__VariablesSection__Group__0__Impl2265); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1083:1: rule__VariablesSection__Group__1 : rule__VariablesSection__Group__1__Impl ;
    public final void rule__VariablesSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1087:1: ( rule__VariablesSection__Group__1__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1088:2: rule__VariablesSection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariablesSection__Group__1__Impl_in_rule__VariablesSection__Group__12296);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1094:1: rule__VariablesSection__Group__1__Impl : ( ( ( rule__VariablesSection__VariablesAssignment_1 ) ) ( ( rule__VariablesSection__VariablesAssignment_1 )* ) ) ;
    public final void rule__VariablesSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1098:1: ( ( ( ( rule__VariablesSection__VariablesAssignment_1 ) ) ( ( rule__VariablesSection__VariablesAssignment_1 )* ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1099:1: ( ( ( rule__VariablesSection__VariablesAssignment_1 ) ) ( ( rule__VariablesSection__VariablesAssignment_1 )* ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1099:1: ( ( ( rule__VariablesSection__VariablesAssignment_1 ) ) ( ( rule__VariablesSection__VariablesAssignment_1 )* ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1100:1: ( ( rule__VariablesSection__VariablesAssignment_1 ) ) ( ( rule__VariablesSection__VariablesAssignment_1 )* )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1100:1: ( ( rule__VariablesSection__VariablesAssignment_1 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1101:1: ( rule__VariablesSection__VariablesAssignment_1 )
            {
             before(grammarAccess.getVariablesSectionAccess().getVariablesAssignment_1()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1102:1: ( rule__VariablesSection__VariablesAssignment_1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1102:2: rule__VariablesSection__VariablesAssignment_1
            {
            pushFollow(FOLLOW_rule__VariablesSection__VariablesAssignment_1_in_rule__VariablesSection__Group__1__Impl2325);
            rule__VariablesSection__VariablesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariablesSectionAccess().getVariablesAssignment_1()); 

            }

            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1105:1: ( ( rule__VariablesSection__VariablesAssignment_1 )* )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1106:1: ( rule__VariablesSection__VariablesAssignment_1 )*
            {
             before(grammarAccess.getVariablesSectionAccess().getVariablesAssignment_1()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1107:1: ( rule__VariablesSection__VariablesAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_SMV_COMMENT||LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1107:2: rule__VariablesSection__VariablesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__VariablesSection__VariablesAssignment_1_in_rule__VariablesSection__Group__1__Impl2337);
            	    rule__VariablesSection__VariablesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1122:1: rule__Assignments__Group__0 : rule__Assignments__Group__0__Impl rule__Assignments__Group__1 ;
    public final void rule__Assignments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1126:1: ( rule__Assignments__Group__0__Impl rule__Assignments__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1127:2: rule__Assignments__Group__0__Impl rule__Assignments__Group__1
            {
            pushFollow(FOLLOW_rule__Assignments__Group__0__Impl_in_rule__Assignments__Group__02374);
            rule__Assignments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignments__Group__1_in_rule__Assignments__Group__02377);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1134:1: rule__Assignments__Group__0__Impl : ( () ) ;
    public final void rule__Assignments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1138:1: ( ( () ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1139:1: ( () )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1139:1: ( () )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1140:1: ()
            {
             before(grammarAccess.getAssignmentsAccess().getAssignmentsAction_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1141:1: ()
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1143:1: 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1153:1: rule__Assignments__Group__1 : rule__Assignments__Group__1__Impl rule__Assignments__Group__2 ;
    public final void rule__Assignments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1157:1: ( rule__Assignments__Group__1__Impl rule__Assignments__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1158:2: rule__Assignments__Group__1__Impl rule__Assignments__Group__2
            {
            pushFollow(FOLLOW_rule__Assignments__Group__1__Impl_in_rule__Assignments__Group__12435);
            rule__Assignments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignments__Group__2_in_rule__Assignments__Group__12438);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1165:1: rule__Assignments__Group__1__Impl : ( 'ASSIGN' ) ;
    public final void rule__Assignments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1169:1: ( ( 'ASSIGN' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1170:1: ( 'ASSIGN' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1170:1: ( 'ASSIGN' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1171:1: 'ASSIGN'
            {
             before(grammarAccess.getAssignmentsAccess().getASSIGNKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Assignments__Group__1__Impl2466); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1184:1: rule__Assignments__Group__2 : rule__Assignments__Group__2__Impl ;
    public final void rule__Assignments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1188:1: ( rule__Assignments__Group__2__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1189:2: rule__Assignments__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignments__Group__2__Impl_in_rule__Assignments__Group__22497);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1195:1: rule__Assignments__Group__2__Impl : ( ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* ) ) ;
    public final void rule__Assignments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1199:1: ( ( ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1200:1: ( ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1200:1: ( ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1201:1: ( ( rule__Assignments__AssignmentsAssignment_2 ) ) ( ( rule__Assignments__AssignmentsAssignment_2 )* )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1201:1: ( ( rule__Assignments__AssignmentsAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1202:1: ( rule__Assignments__AssignmentsAssignment_2 )
            {
             before(grammarAccess.getAssignmentsAccess().getAssignmentsAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1203:1: ( rule__Assignments__AssignmentsAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1203:2: rule__Assignments__AssignmentsAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignments__AssignmentsAssignment_2_in_rule__Assignments__Group__2__Impl2526);
            rule__Assignments__AssignmentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentsAccess().getAssignmentsAssignment_2()); 

            }

            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1206:1: ( ( rule__Assignments__AssignmentsAssignment_2 )* )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1207:1: ( rule__Assignments__AssignmentsAssignment_2 )*
            {
             before(grammarAccess.getAssignmentsAccess().getAssignmentsAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1208:1: ( rule__Assignments__AssignmentsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_SMV_COMMENT||LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1208:2: rule__Assignments__AssignmentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Assignments__AssignmentsAssignment_2_in_rule__Assignments__Group__2__Impl2538);
            	    rule__Assignments__AssignmentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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


    // $ANTLR start "rule__Transactions__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1225:1: rule__Transactions__Group__0 : rule__Transactions__Group__0__Impl rule__Transactions__Group__1 ;
    public final void rule__Transactions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1229:1: ( rule__Transactions__Group__0__Impl rule__Transactions__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1230:2: rule__Transactions__Group__0__Impl rule__Transactions__Group__1
            {
            pushFollow(FOLLOW_rule__Transactions__Group__0__Impl_in_rule__Transactions__Group__02577);
            rule__Transactions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transactions__Group__1_in_rule__Transactions__Group__02580);
            rule__Transactions__Group__1();

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
    // $ANTLR end "rule__Transactions__Group__0"


    // $ANTLR start "rule__Transactions__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1237:1: rule__Transactions__Group__0__Impl : ( 'TRANS' ) ;
    public final void rule__Transactions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1241:1: ( ( 'TRANS' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1242:1: ( 'TRANS' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1242:1: ( 'TRANS' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1243:1: 'TRANS'
            {
             before(grammarAccess.getTransactionsAccess().getTRANSKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Transactions__Group__0__Impl2608); 
             after(grammarAccess.getTransactionsAccess().getTRANSKeyword_0()); 

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
    // $ANTLR end "rule__Transactions__Group__0__Impl"


    // $ANTLR start "rule__Transactions__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1256:1: rule__Transactions__Group__1 : rule__Transactions__Group__1__Impl ;
    public final void rule__Transactions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1260:1: ( rule__Transactions__Group__1__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1261:2: rule__Transactions__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Transactions__Group__1__Impl_in_rule__Transactions__Group__12639);
            rule__Transactions__Group__1__Impl();

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
    // $ANTLR end "rule__Transactions__Group__1"


    // $ANTLR start "rule__Transactions__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1267:1: rule__Transactions__Group__1__Impl : ( ( ( rule__Transactions__TransactionAssignment_1 ) ) ( ( rule__Transactions__TransactionAssignment_1 )* ) ) ;
    public final void rule__Transactions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1271:1: ( ( ( ( rule__Transactions__TransactionAssignment_1 ) ) ( ( rule__Transactions__TransactionAssignment_1 )* ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1272:1: ( ( ( rule__Transactions__TransactionAssignment_1 ) ) ( ( rule__Transactions__TransactionAssignment_1 )* ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1272:1: ( ( ( rule__Transactions__TransactionAssignment_1 ) ) ( ( rule__Transactions__TransactionAssignment_1 )* ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1273:1: ( ( rule__Transactions__TransactionAssignment_1 ) ) ( ( rule__Transactions__TransactionAssignment_1 )* )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1273:1: ( ( rule__Transactions__TransactionAssignment_1 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1274:1: ( rule__Transactions__TransactionAssignment_1 )
            {
             before(grammarAccess.getTransactionsAccess().getTransactionAssignment_1()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1275:1: ( rule__Transactions__TransactionAssignment_1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1275:2: rule__Transactions__TransactionAssignment_1
            {
            pushFollow(FOLLOW_rule__Transactions__TransactionAssignment_1_in_rule__Transactions__Group__1__Impl2668);
            rule__Transactions__TransactionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransactionsAccess().getTransactionAssignment_1()); 

            }

            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1278:1: ( ( rule__Transactions__TransactionAssignment_1 )* )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1279:1: ( rule__Transactions__TransactionAssignment_1 )*
            {
             before(grammarAccess.getTransactionsAccess().getTransactionAssignment_1()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1280:1: ( rule__Transactions__TransactionAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_SMV_COMMENT||LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1280:2: rule__Transactions__TransactionAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Transactions__TransactionAssignment_1_in_rule__Transactions__Group__1__Impl2680);
            	    rule__Transactions__TransactionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTransactionsAccess().getTransactionAssignment_1()); 

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
    // $ANTLR end "rule__Transactions__Group__1__Impl"


    // $ANTLR start "rule__TransactionStatement__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1295:1: rule__TransactionStatement__Group__0 : rule__TransactionStatement__Group__0__Impl rule__TransactionStatement__Group__1 ;
    public final void rule__TransactionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1299:1: ( rule__TransactionStatement__Group__0__Impl rule__TransactionStatement__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1300:2: rule__TransactionStatement__Group__0__Impl rule__TransactionStatement__Group__1
            {
            pushFollow(FOLLOW_rule__TransactionStatement__Group__0__Impl_in_rule__TransactionStatement__Group__02717);
            rule__TransactionStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransactionStatement__Group__1_in_rule__TransactionStatement__Group__02720);
            rule__TransactionStatement__Group__1();

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
    // $ANTLR end "rule__TransactionStatement__Group__0"


    // $ANTLR start "rule__TransactionStatement__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1307:1: rule__TransactionStatement__Group__0__Impl : ( ( rule__TransactionStatement__PreconditionAssignment_0 ) ) ;
    public final void rule__TransactionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1311:1: ( ( ( rule__TransactionStatement__PreconditionAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1312:1: ( ( rule__TransactionStatement__PreconditionAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1312:1: ( ( rule__TransactionStatement__PreconditionAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1313:1: ( rule__TransactionStatement__PreconditionAssignment_0 )
            {
             before(grammarAccess.getTransactionStatementAccess().getPreconditionAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1314:1: ( rule__TransactionStatement__PreconditionAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1314:2: rule__TransactionStatement__PreconditionAssignment_0
            {
            pushFollow(FOLLOW_rule__TransactionStatement__PreconditionAssignment_0_in_rule__TransactionStatement__Group__0__Impl2747);
            rule__TransactionStatement__PreconditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionStatementAccess().getPreconditionAssignment_0()); 

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
    // $ANTLR end "rule__TransactionStatement__Group__0__Impl"


    // $ANTLR start "rule__TransactionStatement__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1324:1: rule__TransactionStatement__Group__1 : rule__TransactionStatement__Group__1__Impl rule__TransactionStatement__Group__2 ;
    public final void rule__TransactionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1328:1: ( rule__TransactionStatement__Group__1__Impl rule__TransactionStatement__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1329:2: rule__TransactionStatement__Group__1__Impl rule__TransactionStatement__Group__2
            {
            pushFollow(FOLLOW_rule__TransactionStatement__Group__1__Impl_in_rule__TransactionStatement__Group__12777);
            rule__TransactionStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransactionStatement__Group__2_in_rule__TransactionStatement__Group__12780);
            rule__TransactionStatement__Group__2();

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
    // $ANTLR end "rule__TransactionStatement__Group__1"


    // $ANTLR start "rule__TransactionStatement__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1336:1: rule__TransactionStatement__Group__1__Impl : ( '->' ) ;
    public final void rule__TransactionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1340:1: ( ( '->' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1341:1: ( '->' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1341:1: ( '->' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1342:1: '->'
            {
             before(grammarAccess.getTransactionStatementAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__TransactionStatement__Group__1__Impl2808); 
             after(grammarAccess.getTransactionStatementAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__TransactionStatement__Group__1__Impl"


    // $ANTLR start "rule__TransactionStatement__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1355:1: rule__TransactionStatement__Group__2 : rule__TransactionStatement__Group__2__Impl ;
    public final void rule__TransactionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1359:1: ( rule__TransactionStatement__Group__2__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1360:2: rule__TransactionStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TransactionStatement__Group__2__Impl_in_rule__TransactionStatement__Group__22839);
            rule__TransactionStatement__Group__2__Impl();

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
    // $ANTLR end "rule__TransactionStatement__Group__2"


    // $ANTLR start "rule__TransactionStatement__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1366:1: rule__TransactionStatement__Group__2__Impl : ( ( rule__TransactionStatement__PostTransactionAssignment_2 ) ) ;
    public final void rule__TransactionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1370:1: ( ( ( rule__TransactionStatement__PostTransactionAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1371:1: ( ( rule__TransactionStatement__PostTransactionAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1371:1: ( ( rule__TransactionStatement__PostTransactionAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1372:1: ( rule__TransactionStatement__PostTransactionAssignment_2 )
            {
             before(grammarAccess.getTransactionStatementAccess().getPostTransactionAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1373:1: ( rule__TransactionStatement__PostTransactionAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1373:2: rule__TransactionStatement__PostTransactionAssignment_2
            {
            pushFollow(FOLLOW_rule__TransactionStatement__PostTransactionAssignment_2_in_rule__TransactionStatement__Group__2__Impl2866);
            rule__TransactionStatement__PostTransactionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransactionStatementAccess().getPostTransactionAssignment_2()); 

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
    // $ANTLR end "rule__TransactionStatement__Group__2__Impl"


    // $ANTLR start "rule__TransactionPrecondition__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1389:1: rule__TransactionPrecondition__Group__0 : rule__TransactionPrecondition__Group__0__Impl rule__TransactionPrecondition__Group__1 ;
    public final void rule__TransactionPrecondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1393:1: ( rule__TransactionPrecondition__Group__0__Impl rule__TransactionPrecondition__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1394:2: rule__TransactionPrecondition__Group__0__Impl rule__TransactionPrecondition__Group__1
            {
            pushFollow(FOLLOW_rule__TransactionPrecondition__Group__0__Impl_in_rule__TransactionPrecondition__Group__02902);
            rule__TransactionPrecondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransactionPrecondition__Group__1_in_rule__TransactionPrecondition__Group__02905);
            rule__TransactionPrecondition__Group__1();

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
    // $ANTLR end "rule__TransactionPrecondition__Group__0"


    // $ANTLR start "rule__TransactionPrecondition__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1401:1: rule__TransactionPrecondition__Group__0__Impl : ( ( rule__TransactionPrecondition__PreconditionsAssignment_0 ) ) ;
    public final void rule__TransactionPrecondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1405:1: ( ( ( rule__TransactionPrecondition__PreconditionsAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1406:1: ( ( rule__TransactionPrecondition__PreconditionsAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1406:1: ( ( rule__TransactionPrecondition__PreconditionsAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1407:1: ( rule__TransactionPrecondition__PreconditionsAssignment_0 )
            {
             before(grammarAccess.getTransactionPreconditionAccess().getPreconditionsAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1408:1: ( rule__TransactionPrecondition__PreconditionsAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1408:2: rule__TransactionPrecondition__PreconditionsAssignment_0
            {
            pushFollow(FOLLOW_rule__TransactionPrecondition__PreconditionsAssignment_0_in_rule__TransactionPrecondition__Group__0__Impl2932);
            rule__TransactionPrecondition__PreconditionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionPreconditionAccess().getPreconditionsAssignment_0()); 

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
    // $ANTLR end "rule__TransactionPrecondition__Group__0__Impl"


    // $ANTLR start "rule__TransactionPrecondition__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1418:1: rule__TransactionPrecondition__Group__1 : rule__TransactionPrecondition__Group__1__Impl ;
    public final void rule__TransactionPrecondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1422:1: ( rule__TransactionPrecondition__Group__1__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1423:2: rule__TransactionPrecondition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TransactionPrecondition__Group__1__Impl_in_rule__TransactionPrecondition__Group__12962);
            rule__TransactionPrecondition__Group__1__Impl();

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
    // $ANTLR end "rule__TransactionPrecondition__Group__1"


    // $ANTLR start "rule__TransactionPrecondition__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1429:1: rule__TransactionPrecondition__Group__1__Impl : ( ( rule__TransactionPrecondition__Group_1__0 )* ) ;
    public final void rule__TransactionPrecondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1433:1: ( ( ( rule__TransactionPrecondition__Group_1__0 )* ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1434:1: ( ( rule__TransactionPrecondition__Group_1__0 )* )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1434:1: ( ( rule__TransactionPrecondition__Group_1__0 )* )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1435:1: ( rule__TransactionPrecondition__Group_1__0 )*
            {
             before(grammarAccess.getTransactionPreconditionAccess().getGroup_1()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1436:1: ( rule__TransactionPrecondition__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_AND_OR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1436:2: rule__TransactionPrecondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TransactionPrecondition__Group_1__0_in_rule__TransactionPrecondition__Group__1__Impl2989);
            	    rule__TransactionPrecondition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTransactionPreconditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TransactionPrecondition__Group__1__Impl"


    // $ANTLR start "rule__TransactionPrecondition__Group_1__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1450:1: rule__TransactionPrecondition__Group_1__0 : rule__TransactionPrecondition__Group_1__0__Impl rule__TransactionPrecondition__Group_1__1 ;
    public final void rule__TransactionPrecondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1454:1: ( rule__TransactionPrecondition__Group_1__0__Impl rule__TransactionPrecondition__Group_1__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1455:2: rule__TransactionPrecondition__Group_1__0__Impl rule__TransactionPrecondition__Group_1__1
            {
            pushFollow(FOLLOW_rule__TransactionPrecondition__Group_1__0__Impl_in_rule__TransactionPrecondition__Group_1__03024);
            rule__TransactionPrecondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransactionPrecondition__Group_1__1_in_rule__TransactionPrecondition__Group_1__03027);
            rule__TransactionPrecondition__Group_1__1();

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
    // $ANTLR end "rule__TransactionPrecondition__Group_1__0"


    // $ANTLR start "rule__TransactionPrecondition__Group_1__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1462:1: rule__TransactionPrecondition__Group_1__0__Impl : ( ( rule__TransactionPrecondition__LogicalOperatorAssignment_1_0 ) ) ;
    public final void rule__TransactionPrecondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1466:1: ( ( ( rule__TransactionPrecondition__LogicalOperatorAssignment_1_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1467:1: ( ( rule__TransactionPrecondition__LogicalOperatorAssignment_1_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1467:1: ( ( rule__TransactionPrecondition__LogicalOperatorAssignment_1_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1468:1: ( rule__TransactionPrecondition__LogicalOperatorAssignment_1_0 )
            {
             before(grammarAccess.getTransactionPreconditionAccess().getLogicalOperatorAssignment_1_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1469:1: ( rule__TransactionPrecondition__LogicalOperatorAssignment_1_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1469:2: rule__TransactionPrecondition__LogicalOperatorAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TransactionPrecondition__LogicalOperatorAssignment_1_0_in_rule__TransactionPrecondition__Group_1__0__Impl3054);
            rule__TransactionPrecondition__LogicalOperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionPreconditionAccess().getLogicalOperatorAssignment_1_0()); 

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
    // $ANTLR end "rule__TransactionPrecondition__Group_1__0__Impl"


    // $ANTLR start "rule__TransactionPrecondition__Group_1__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1479:1: rule__TransactionPrecondition__Group_1__1 : rule__TransactionPrecondition__Group_1__1__Impl ;
    public final void rule__TransactionPrecondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1483:1: ( rule__TransactionPrecondition__Group_1__1__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1484:2: rule__TransactionPrecondition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TransactionPrecondition__Group_1__1__Impl_in_rule__TransactionPrecondition__Group_1__13084);
            rule__TransactionPrecondition__Group_1__1__Impl();

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
    // $ANTLR end "rule__TransactionPrecondition__Group_1__1"


    // $ANTLR start "rule__TransactionPrecondition__Group_1__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1490:1: rule__TransactionPrecondition__Group_1__1__Impl : ( ( rule__TransactionPrecondition__PreconditionsAssignment_1_1 ) ) ;
    public final void rule__TransactionPrecondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1494:1: ( ( ( rule__TransactionPrecondition__PreconditionsAssignment_1_1 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1495:1: ( ( rule__TransactionPrecondition__PreconditionsAssignment_1_1 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1495:1: ( ( rule__TransactionPrecondition__PreconditionsAssignment_1_1 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1496:1: ( rule__TransactionPrecondition__PreconditionsAssignment_1_1 )
            {
             before(grammarAccess.getTransactionPreconditionAccess().getPreconditionsAssignment_1_1()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1497:1: ( rule__TransactionPrecondition__PreconditionsAssignment_1_1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1497:2: rule__TransactionPrecondition__PreconditionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TransactionPrecondition__PreconditionsAssignment_1_1_in_rule__TransactionPrecondition__Group_1__1__Impl3111);
            rule__TransactionPrecondition__PreconditionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransactionPreconditionAccess().getPreconditionsAssignment_1_1()); 

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
    // $ANTLR end "rule__TransactionPrecondition__Group_1__1__Impl"


    // $ANTLR start "rule__StatePrecondition__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1511:1: rule__StatePrecondition__Group__0 : rule__StatePrecondition__Group__0__Impl rule__StatePrecondition__Group__1 ;
    public final void rule__StatePrecondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1515:1: ( rule__StatePrecondition__Group__0__Impl rule__StatePrecondition__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1516:2: rule__StatePrecondition__Group__0__Impl rule__StatePrecondition__Group__1
            {
            pushFollow(FOLLOW_rule__StatePrecondition__Group__0__Impl_in_rule__StatePrecondition__Group__03145);
            rule__StatePrecondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatePrecondition__Group__1_in_rule__StatePrecondition__Group__03148);
            rule__StatePrecondition__Group__1();

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
    // $ANTLR end "rule__StatePrecondition__Group__0"


    // $ANTLR start "rule__StatePrecondition__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1523:1: rule__StatePrecondition__Group__0__Impl : ( ( rule__StatePrecondition__VarAssignment_0 ) ) ;
    public final void rule__StatePrecondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1527:1: ( ( ( rule__StatePrecondition__VarAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1528:1: ( ( rule__StatePrecondition__VarAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1528:1: ( ( rule__StatePrecondition__VarAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1529:1: ( rule__StatePrecondition__VarAssignment_0 )
            {
             before(grammarAccess.getStatePreconditionAccess().getVarAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1530:1: ( rule__StatePrecondition__VarAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1530:2: rule__StatePrecondition__VarAssignment_0
            {
            pushFollow(FOLLOW_rule__StatePrecondition__VarAssignment_0_in_rule__StatePrecondition__Group__0__Impl3175);
            rule__StatePrecondition__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatePreconditionAccess().getVarAssignment_0()); 

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
    // $ANTLR end "rule__StatePrecondition__Group__0__Impl"


    // $ANTLR start "rule__StatePrecondition__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1540:1: rule__StatePrecondition__Group__1 : rule__StatePrecondition__Group__1__Impl rule__StatePrecondition__Group__2 ;
    public final void rule__StatePrecondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1544:1: ( rule__StatePrecondition__Group__1__Impl rule__StatePrecondition__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1545:2: rule__StatePrecondition__Group__1__Impl rule__StatePrecondition__Group__2
            {
            pushFollow(FOLLOW_rule__StatePrecondition__Group__1__Impl_in_rule__StatePrecondition__Group__13205);
            rule__StatePrecondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatePrecondition__Group__2_in_rule__StatePrecondition__Group__13208);
            rule__StatePrecondition__Group__2();

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
    // $ANTLR end "rule__StatePrecondition__Group__1"


    // $ANTLR start "rule__StatePrecondition__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1552:1: rule__StatePrecondition__Group__1__Impl : ( '=' ) ;
    public final void rule__StatePrecondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1556:1: ( ( '=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1557:1: ( '=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1557:1: ( '=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1558:1: '='
            {
             before(grammarAccess.getStatePreconditionAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__StatePrecondition__Group__1__Impl3236); 
             after(grammarAccess.getStatePreconditionAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__StatePrecondition__Group__1__Impl"


    // $ANTLR start "rule__StatePrecondition__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1571:1: rule__StatePrecondition__Group__2 : rule__StatePrecondition__Group__2__Impl ;
    public final void rule__StatePrecondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1575:1: ( rule__StatePrecondition__Group__2__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1576:2: rule__StatePrecondition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StatePrecondition__Group__2__Impl_in_rule__StatePrecondition__Group__23267);
            rule__StatePrecondition__Group__2__Impl();

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
    // $ANTLR end "rule__StatePrecondition__Group__2"


    // $ANTLR start "rule__StatePrecondition__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1582:1: rule__StatePrecondition__Group__2__Impl : ( ( rule__StatePrecondition__ValueAssignment_2 ) ) ;
    public final void rule__StatePrecondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1586:1: ( ( ( rule__StatePrecondition__ValueAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1587:1: ( ( rule__StatePrecondition__ValueAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1587:1: ( ( rule__StatePrecondition__ValueAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1588:1: ( rule__StatePrecondition__ValueAssignment_2 )
            {
             before(grammarAccess.getStatePreconditionAccess().getValueAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1589:1: ( rule__StatePrecondition__ValueAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1589:2: rule__StatePrecondition__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__StatePrecondition__ValueAssignment_2_in_rule__StatePrecondition__Group__2__Impl3294);
            rule__StatePrecondition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStatePreconditionAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__StatePrecondition__Group__2__Impl"


    // $ANTLR start "rule__BooleanPrecondition__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1605:1: rule__BooleanPrecondition__Group__0 : rule__BooleanPrecondition__Group__0__Impl rule__BooleanPrecondition__Group__1 ;
    public final void rule__BooleanPrecondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1609:1: ( rule__BooleanPrecondition__Group__0__Impl rule__BooleanPrecondition__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1610:2: rule__BooleanPrecondition__Group__0__Impl rule__BooleanPrecondition__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanPrecondition__Group__0__Impl_in_rule__BooleanPrecondition__Group__03330);
            rule__BooleanPrecondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanPrecondition__Group__1_in_rule__BooleanPrecondition__Group__03333);
            rule__BooleanPrecondition__Group__1();

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
    // $ANTLR end "rule__BooleanPrecondition__Group__0"


    // $ANTLR start "rule__BooleanPrecondition__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1617:1: rule__BooleanPrecondition__Group__0__Impl : ( ( rule__BooleanPrecondition__VarAssignment_0 ) ) ;
    public final void rule__BooleanPrecondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1621:1: ( ( ( rule__BooleanPrecondition__VarAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1622:1: ( ( rule__BooleanPrecondition__VarAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1622:1: ( ( rule__BooleanPrecondition__VarAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1623:1: ( rule__BooleanPrecondition__VarAssignment_0 )
            {
             before(grammarAccess.getBooleanPreconditionAccess().getVarAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1624:1: ( rule__BooleanPrecondition__VarAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1624:2: rule__BooleanPrecondition__VarAssignment_0
            {
            pushFollow(FOLLOW_rule__BooleanPrecondition__VarAssignment_0_in_rule__BooleanPrecondition__Group__0__Impl3360);
            rule__BooleanPrecondition__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanPreconditionAccess().getVarAssignment_0()); 

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
    // $ANTLR end "rule__BooleanPrecondition__Group__0__Impl"


    // $ANTLR start "rule__BooleanPrecondition__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1634:1: rule__BooleanPrecondition__Group__1 : rule__BooleanPrecondition__Group__1__Impl rule__BooleanPrecondition__Group__2 ;
    public final void rule__BooleanPrecondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1638:1: ( rule__BooleanPrecondition__Group__1__Impl rule__BooleanPrecondition__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1639:2: rule__BooleanPrecondition__Group__1__Impl rule__BooleanPrecondition__Group__2
            {
            pushFollow(FOLLOW_rule__BooleanPrecondition__Group__1__Impl_in_rule__BooleanPrecondition__Group__13390);
            rule__BooleanPrecondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanPrecondition__Group__2_in_rule__BooleanPrecondition__Group__13393);
            rule__BooleanPrecondition__Group__2();

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
    // $ANTLR end "rule__BooleanPrecondition__Group__1"


    // $ANTLR start "rule__BooleanPrecondition__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1646:1: rule__BooleanPrecondition__Group__1__Impl : ( '=' ) ;
    public final void rule__BooleanPrecondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1650:1: ( ( '=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1651:1: ( '=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1651:1: ( '=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1652:1: '='
            {
             before(grammarAccess.getBooleanPreconditionAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__BooleanPrecondition__Group__1__Impl3421); 
             after(grammarAccess.getBooleanPreconditionAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__BooleanPrecondition__Group__1__Impl"


    // $ANTLR start "rule__BooleanPrecondition__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1665:1: rule__BooleanPrecondition__Group__2 : rule__BooleanPrecondition__Group__2__Impl ;
    public final void rule__BooleanPrecondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1669:1: ( rule__BooleanPrecondition__Group__2__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1670:2: rule__BooleanPrecondition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BooleanPrecondition__Group__2__Impl_in_rule__BooleanPrecondition__Group__23452);
            rule__BooleanPrecondition__Group__2__Impl();

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
    // $ANTLR end "rule__BooleanPrecondition__Group__2"


    // $ANTLR start "rule__BooleanPrecondition__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1676:1: rule__BooleanPrecondition__Group__2__Impl : ( ( rule__BooleanPrecondition__ValueAssignment_2 ) ) ;
    public final void rule__BooleanPrecondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1680:1: ( ( ( rule__BooleanPrecondition__ValueAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1681:1: ( ( rule__BooleanPrecondition__ValueAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1681:1: ( ( rule__BooleanPrecondition__ValueAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1682:1: ( rule__BooleanPrecondition__ValueAssignment_2 )
            {
             before(grammarAccess.getBooleanPreconditionAccess().getValueAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1683:1: ( rule__BooleanPrecondition__ValueAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1683:2: rule__BooleanPrecondition__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__BooleanPrecondition__ValueAssignment_2_in_rule__BooleanPrecondition__Group__2__Impl3479);
            rule__BooleanPrecondition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanPreconditionAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__BooleanPrecondition__Group__2__Impl"


    // $ANTLR start "rule__IntegerPrecondition__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1699:1: rule__IntegerPrecondition__Group__0 : rule__IntegerPrecondition__Group__0__Impl rule__IntegerPrecondition__Group__1 ;
    public final void rule__IntegerPrecondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1703:1: ( rule__IntegerPrecondition__Group__0__Impl rule__IntegerPrecondition__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1704:2: rule__IntegerPrecondition__Group__0__Impl rule__IntegerPrecondition__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerPrecondition__Group__0__Impl_in_rule__IntegerPrecondition__Group__03515);
            rule__IntegerPrecondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerPrecondition__Group__1_in_rule__IntegerPrecondition__Group__03518);
            rule__IntegerPrecondition__Group__1();

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
    // $ANTLR end "rule__IntegerPrecondition__Group__0"


    // $ANTLR start "rule__IntegerPrecondition__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1711:1: rule__IntegerPrecondition__Group__0__Impl : ( ( rule__IntegerPrecondition__VarAssignment_0 ) ) ;
    public final void rule__IntegerPrecondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1715:1: ( ( ( rule__IntegerPrecondition__VarAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1716:1: ( ( rule__IntegerPrecondition__VarAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1716:1: ( ( rule__IntegerPrecondition__VarAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1717:1: ( rule__IntegerPrecondition__VarAssignment_0 )
            {
             before(grammarAccess.getIntegerPreconditionAccess().getVarAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1718:1: ( rule__IntegerPrecondition__VarAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1718:2: rule__IntegerPrecondition__VarAssignment_0
            {
            pushFollow(FOLLOW_rule__IntegerPrecondition__VarAssignment_0_in_rule__IntegerPrecondition__Group__0__Impl3545);
            rule__IntegerPrecondition__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPreconditionAccess().getVarAssignment_0()); 

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
    // $ANTLR end "rule__IntegerPrecondition__Group__0__Impl"


    // $ANTLR start "rule__IntegerPrecondition__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1728:1: rule__IntegerPrecondition__Group__1 : rule__IntegerPrecondition__Group__1__Impl rule__IntegerPrecondition__Group__2 ;
    public final void rule__IntegerPrecondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1732:1: ( rule__IntegerPrecondition__Group__1__Impl rule__IntegerPrecondition__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1733:2: rule__IntegerPrecondition__Group__1__Impl rule__IntegerPrecondition__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerPrecondition__Group__1__Impl_in_rule__IntegerPrecondition__Group__13575);
            rule__IntegerPrecondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerPrecondition__Group__2_in_rule__IntegerPrecondition__Group__13578);
            rule__IntegerPrecondition__Group__2();

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
    // $ANTLR end "rule__IntegerPrecondition__Group__1"


    // $ANTLR start "rule__IntegerPrecondition__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1740:1: rule__IntegerPrecondition__Group__1__Impl : ( '=' ) ;
    public final void rule__IntegerPrecondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1744:1: ( ( '=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1745:1: ( '=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1745:1: ( '=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1746:1: '='
            {
             before(grammarAccess.getIntegerPreconditionAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__IntegerPrecondition__Group__1__Impl3606); 
             after(grammarAccess.getIntegerPreconditionAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__IntegerPrecondition__Group__1__Impl"


    // $ANTLR start "rule__IntegerPrecondition__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1759:1: rule__IntegerPrecondition__Group__2 : rule__IntegerPrecondition__Group__2__Impl ;
    public final void rule__IntegerPrecondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1763:1: ( rule__IntegerPrecondition__Group__2__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1764:2: rule__IntegerPrecondition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IntegerPrecondition__Group__2__Impl_in_rule__IntegerPrecondition__Group__23637);
            rule__IntegerPrecondition__Group__2__Impl();

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
    // $ANTLR end "rule__IntegerPrecondition__Group__2"


    // $ANTLR start "rule__IntegerPrecondition__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1770:1: rule__IntegerPrecondition__Group__2__Impl : ( ( rule__IntegerPrecondition__ValueAssignment_2 ) ) ;
    public final void rule__IntegerPrecondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1774:1: ( ( ( rule__IntegerPrecondition__ValueAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1775:1: ( ( rule__IntegerPrecondition__ValueAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1775:1: ( ( rule__IntegerPrecondition__ValueAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1776:1: ( rule__IntegerPrecondition__ValueAssignment_2 )
            {
             before(grammarAccess.getIntegerPreconditionAccess().getValueAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1777:1: ( rule__IntegerPrecondition__ValueAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1777:2: rule__IntegerPrecondition__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerPrecondition__ValueAssignment_2_in_rule__IntegerPrecondition__Group__2__Impl3664);
            rule__IntegerPrecondition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPreconditionAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__IntegerPrecondition__Group__2__Impl"


    // $ANTLR start "rule__PostTransaction__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1793:1: rule__PostTransaction__Group__0 : rule__PostTransaction__Group__0__Impl rule__PostTransaction__Group__1 ;
    public final void rule__PostTransaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1797:1: ( rule__PostTransaction__Group__0__Impl rule__PostTransaction__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1798:2: rule__PostTransaction__Group__0__Impl rule__PostTransaction__Group__1
            {
            pushFollow(FOLLOW_rule__PostTransaction__Group__0__Impl_in_rule__PostTransaction__Group__03700);
            rule__PostTransaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PostTransaction__Group__1_in_rule__PostTransaction__Group__03703);
            rule__PostTransaction__Group__1();

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
    // $ANTLR end "rule__PostTransaction__Group__0"


    // $ANTLR start "rule__PostTransaction__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1805:1: rule__PostTransaction__Group__0__Impl : ( ( rule__PostTransaction__PostTransactionsAssignment_0 ) ) ;
    public final void rule__PostTransaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1809:1: ( ( ( rule__PostTransaction__PostTransactionsAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1810:1: ( ( rule__PostTransaction__PostTransactionsAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1810:1: ( ( rule__PostTransaction__PostTransactionsAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1811:1: ( rule__PostTransaction__PostTransactionsAssignment_0 )
            {
             before(grammarAccess.getPostTransactionAccess().getPostTransactionsAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1812:1: ( rule__PostTransaction__PostTransactionsAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1812:2: rule__PostTransaction__PostTransactionsAssignment_0
            {
            pushFollow(FOLLOW_rule__PostTransaction__PostTransactionsAssignment_0_in_rule__PostTransaction__Group__0__Impl3730);
            rule__PostTransaction__PostTransactionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPostTransactionAccess().getPostTransactionsAssignment_0()); 

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
    // $ANTLR end "rule__PostTransaction__Group__0__Impl"


    // $ANTLR start "rule__PostTransaction__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1822:1: rule__PostTransaction__Group__1 : rule__PostTransaction__Group__1__Impl ;
    public final void rule__PostTransaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1826:1: ( rule__PostTransaction__Group__1__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1827:2: rule__PostTransaction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PostTransaction__Group__1__Impl_in_rule__PostTransaction__Group__13760);
            rule__PostTransaction__Group__1__Impl();

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
    // $ANTLR end "rule__PostTransaction__Group__1"


    // $ANTLR start "rule__PostTransaction__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1833:1: rule__PostTransaction__Group__1__Impl : ( ( rule__PostTransaction__Group_1__0 )* ) ;
    public final void rule__PostTransaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1837:1: ( ( ( rule__PostTransaction__Group_1__0 )* ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1838:1: ( ( rule__PostTransaction__Group_1__0 )* )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1838:1: ( ( rule__PostTransaction__Group_1__0 )* )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1839:1: ( rule__PostTransaction__Group_1__0 )*
            {
             before(grammarAccess.getPostTransactionAccess().getGroup_1()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1840:1: ( rule__PostTransaction__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_AND_OR) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1840:2: rule__PostTransaction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PostTransaction__Group_1__0_in_rule__PostTransaction__Group__1__Impl3787);
            	    rule__PostTransaction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPostTransactionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PostTransaction__Group__1__Impl"


    // $ANTLR start "rule__PostTransaction__Group_1__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1854:1: rule__PostTransaction__Group_1__0 : rule__PostTransaction__Group_1__0__Impl rule__PostTransaction__Group_1__1 ;
    public final void rule__PostTransaction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1858:1: ( rule__PostTransaction__Group_1__0__Impl rule__PostTransaction__Group_1__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1859:2: rule__PostTransaction__Group_1__0__Impl rule__PostTransaction__Group_1__1
            {
            pushFollow(FOLLOW_rule__PostTransaction__Group_1__0__Impl_in_rule__PostTransaction__Group_1__03822);
            rule__PostTransaction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PostTransaction__Group_1__1_in_rule__PostTransaction__Group_1__03825);
            rule__PostTransaction__Group_1__1();

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
    // $ANTLR end "rule__PostTransaction__Group_1__0"


    // $ANTLR start "rule__PostTransaction__Group_1__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1866:1: rule__PostTransaction__Group_1__0__Impl : ( ( rule__PostTransaction__LogicalOperatorAssignment_1_0 ) ) ;
    public final void rule__PostTransaction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1870:1: ( ( ( rule__PostTransaction__LogicalOperatorAssignment_1_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1871:1: ( ( rule__PostTransaction__LogicalOperatorAssignment_1_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1871:1: ( ( rule__PostTransaction__LogicalOperatorAssignment_1_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1872:1: ( rule__PostTransaction__LogicalOperatorAssignment_1_0 )
            {
             before(grammarAccess.getPostTransactionAccess().getLogicalOperatorAssignment_1_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1873:1: ( rule__PostTransaction__LogicalOperatorAssignment_1_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1873:2: rule__PostTransaction__LogicalOperatorAssignment_1_0
            {
            pushFollow(FOLLOW_rule__PostTransaction__LogicalOperatorAssignment_1_0_in_rule__PostTransaction__Group_1__0__Impl3852);
            rule__PostTransaction__LogicalOperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPostTransactionAccess().getLogicalOperatorAssignment_1_0()); 

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
    // $ANTLR end "rule__PostTransaction__Group_1__0__Impl"


    // $ANTLR start "rule__PostTransaction__Group_1__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1883:1: rule__PostTransaction__Group_1__1 : rule__PostTransaction__Group_1__1__Impl ;
    public final void rule__PostTransaction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1887:1: ( rule__PostTransaction__Group_1__1__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1888:2: rule__PostTransaction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PostTransaction__Group_1__1__Impl_in_rule__PostTransaction__Group_1__13882);
            rule__PostTransaction__Group_1__1__Impl();

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
    // $ANTLR end "rule__PostTransaction__Group_1__1"


    // $ANTLR start "rule__PostTransaction__Group_1__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1894:1: rule__PostTransaction__Group_1__1__Impl : ( ( rule__PostTransaction__PostTransactionsAssignment_1_1 ) ) ;
    public final void rule__PostTransaction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1898:1: ( ( ( rule__PostTransaction__PostTransactionsAssignment_1_1 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1899:1: ( ( rule__PostTransaction__PostTransactionsAssignment_1_1 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1899:1: ( ( rule__PostTransaction__PostTransactionsAssignment_1_1 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1900:1: ( rule__PostTransaction__PostTransactionsAssignment_1_1 )
            {
             before(grammarAccess.getPostTransactionAccess().getPostTransactionsAssignment_1_1()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1901:1: ( rule__PostTransaction__PostTransactionsAssignment_1_1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1901:2: rule__PostTransaction__PostTransactionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PostTransaction__PostTransactionsAssignment_1_1_in_rule__PostTransaction__Group_1__1__Impl3909);
            rule__PostTransaction__PostTransactionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPostTransactionAccess().getPostTransactionsAssignment_1_1()); 

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
    // $ANTLR end "rule__PostTransaction__Group_1__1__Impl"


    // $ANTLR start "rule__StatePostTransaction__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1915:1: rule__StatePostTransaction__Group__0 : rule__StatePostTransaction__Group__0__Impl rule__StatePostTransaction__Group__1 ;
    public final void rule__StatePostTransaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1919:1: ( rule__StatePostTransaction__Group__0__Impl rule__StatePostTransaction__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1920:2: rule__StatePostTransaction__Group__0__Impl rule__StatePostTransaction__Group__1
            {
            pushFollow(FOLLOW_rule__StatePostTransaction__Group__0__Impl_in_rule__StatePostTransaction__Group__03943);
            rule__StatePostTransaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatePostTransaction__Group__1_in_rule__StatePostTransaction__Group__03946);
            rule__StatePostTransaction__Group__1();

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
    // $ANTLR end "rule__StatePostTransaction__Group__0"


    // $ANTLR start "rule__StatePostTransaction__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1927:1: rule__StatePostTransaction__Group__0__Impl : ( 'next' ) ;
    public final void rule__StatePostTransaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1931:1: ( ( 'next' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1932:1: ( 'next' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1932:1: ( 'next' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1933:1: 'next'
            {
             before(grammarAccess.getStatePostTransactionAccess().getNextKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__StatePostTransaction__Group__0__Impl3974); 
             after(grammarAccess.getStatePostTransactionAccess().getNextKeyword_0()); 

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
    // $ANTLR end "rule__StatePostTransaction__Group__0__Impl"


    // $ANTLR start "rule__StatePostTransaction__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1946:1: rule__StatePostTransaction__Group__1 : rule__StatePostTransaction__Group__1__Impl rule__StatePostTransaction__Group__2 ;
    public final void rule__StatePostTransaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1950:1: ( rule__StatePostTransaction__Group__1__Impl rule__StatePostTransaction__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1951:2: rule__StatePostTransaction__Group__1__Impl rule__StatePostTransaction__Group__2
            {
            pushFollow(FOLLOW_rule__StatePostTransaction__Group__1__Impl_in_rule__StatePostTransaction__Group__14005);
            rule__StatePostTransaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatePostTransaction__Group__2_in_rule__StatePostTransaction__Group__14008);
            rule__StatePostTransaction__Group__2();

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
    // $ANTLR end "rule__StatePostTransaction__Group__1"


    // $ANTLR start "rule__StatePostTransaction__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1958:1: rule__StatePostTransaction__Group__1__Impl : ( '(' ) ;
    public final void rule__StatePostTransaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1962:1: ( ( '(' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1963:1: ( '(' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1963:1: ( '(' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1964:1: '('
            {
             before(grammarAccess.getStatePostTransactionAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__StatePostTransaction__Group__1__Impl4036); 
             after(grammarAccess.getStatePostTransactionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__StatePostTransaction__Group__1__Impl"


    // $ANTLR start "rule__StatePostTransaction__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1977:1: rule__StatePostTransaction__Group__2 : rule__StatePostTransaction__Group__2__Impl rule__StatePostTransaction__Group__3 ;
    public final void rule__StatePostTransaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1981:1: ( rule__StatePostTransaction__Group__2__Impl rule__StatePostTransaction__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1982:2: rule__StatePostTransaction__Group__2__Impl rule__StatePostTransaction__Group__3
            {
            pushFollow(FOLLOW_rule__StatePostTransaction__Group__2__Impl_in_rule__StatePostTransaction__Group__24067);
            rule__StatePostTransaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatePostTransaction__Group__3_in_rule__StatePostTransaction__Group__24070);
            rule__StatePostTransaction__Group__3();

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
    // $ANTLR end "rule__StatePostTransaction__Group__2"


    // $ANTLR start "rule__StatePostTransaction__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1989:1: rule__StatePostTransaction__Group__2__Impl : ( ( rule__StatePostTransaction__VarAssignment_2 ) ) ;
    public final void rule__StatePostTransaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1993:1: ( ( ( rule__StatePostTransaction__VarAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1994:1: ( ( rule__StatePostTransaction__VarAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1994:1: ( ( rule__StatePostTransaction__VarAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1995:1: ( rule__StatePostTransaction__VarAssignment_2 )
            {
             before(grammarAccess.getStatePostTransactionAccess().getVarAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1996:1: ( rule__StatePostTransaction__VarAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:1996:2: rule__StatePostTransaction__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__StatePostTransaction__VarAssignment_2_in_rule__StatePostTransaction__Group__2__Impl4097);
            rule__StatePostTransaction__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStatePostTransactionAccess().getVarAssignment_2()); 

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
    // $ANTLR end "rule__StatePostTransaction__Group__2__Impl"


    // $ANTLR start "rule__StatePostTransaction__Group__3"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2006:1: rule__StatePostTransaction__Group__3 : rule__StatePostTransaction__Group__3__Impl rule__StatePostTransaction__Group__4 ;
    public final void rule__StatePostTransaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2010:1: ( rule__StatePostTransaction__Group__3__Impl rule__StatePostTransaction__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2011:2: rule__StatePostTransaction__Group__3__Impl rule__StatePostTransaction__Group__4
            {
            pushFollow(FOLLOW_rule__StatePostTransaction__Group__3__Impl_in_rule__StatePostTransaction__Group__34127);
            rule__StatePostTransaction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatePostTransaction__Group__4_in_rule__StatePostTransaction__Group__34130);
            rule__StatePostTransaction__Group__4();

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
    // $ANTLR end "rule__StatePostTransaction__Group__3"


    // $ANTLR start "rule__StatePostTransaction__Group__3__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2018:1: rule__StatePostTransaction__Group__3__Impl : ( ')' ) ;
    public final void rule__StatePostTransaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2022:1: ( ( ')' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2023:1: ( ')' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2023:1: ( ')' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2024:1: ')'
            {
             before(grammarAccess.getStatePostTransactionAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__StatePostTransaction__Group__3__Impl4158); 
             after(grammarAccess.getStatePostTransactionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__StatePostTransaction__Group__3__Impl"


    // $ANTLR start "rule__StatePostTransaction__Group__4"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2037:1: rule__StatePostTransaction__Group__4 : rule__StatePostTransaction__Group__4__Impl rule__StatePostTransaction__Group__5 ;
    public final void rule__StatePostTransaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2041:1: ( rule__StatePostTransaction__Group__4__Impl rule__StatePostTransaction__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2042:2: rule__StatePostTransaction__Group__4__Impl rule__StatePostTransaction__Group__5
            {
            pushFollow(FOLLOW_rule__StatePostTransaction__Group__4__Impl_in_rule__StatePostTransaction__Group__44189);
            rule__StatePostTransaction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatePostTransaction__Group__5_in_rule__StatePostTransaction__Group__44192);
            rule__StatePostTransaction__Group__5();

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
    // $ANTLR end "rule__StatePostTransaction__Group__4"


    // $ANTLR start "rule__StatePostTransaction__Group__4__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2049:1: rule__StatePostTransaction__Group__4__Impl : ( '=' ) ;
    public final void rule__StatePostTransaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2053:1: ( ( '=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2054:1: ( '=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2054:1: ( '=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2055:1: '='
            {
             before(grammarAccess.getStatePostTransactionAccess().getEqualsSignKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__StatePostTransaction__Group__4__Impl4220); 
             after(grammarAccess.getStatePostTransactionAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__StatePostTransaction__Group__4__Impl"


    // $ANTLR start "rule__StatePostTransaction__Group__5"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2068:1: rule__StatePostTransaction__Group__5 : rule__StatePostTransaction__Group__5__Impl ;
    public final void rule__StatePostTransaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2072:1: ( rule__StatePostTransaction__Group__5__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2073:2: rule__StatePostTransaction__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StatePostTransaction__Group__5__Impl_in_rule__StatePostTransaction__Group__54251);
            rule__StatePostTransaction__Group__5__Impl();

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
    // $ANTLR end "rule__StatePostTransaction__Group__5"


    // $ANTLR start "rule__StatePostTransaction__Group__5__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2079:1: rule__StatePostTransaction__Group__5__Impl : ( ( rule__StatePostTransaction__ValueAssignment_5 ) ) ;
    public final void rule__StatePostTransaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2083:1: ( ( ( rule__StatePostTransaction__ValueAssignment_5 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2084:1: ( ( rule__StatePostTransaction__ValueAssignment_5 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2084:1: ( ( rule__StatePostTransaction__ValueAssignment_5 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2085:1: ( rule__StatePostTransaction__ValueAssignment_5 )
            {
             before(grammarAccess.getStatePostTransactionAccess().getValueAssignment_5()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2086:1: ( rule__StatePostTransaction__ValueAssignment_5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2086:2: rule__StatePostTransaction__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__StatePostTransaction__ValueAssignment_5_in_rule__StatePostTransaction__Group__5__Impl4278);
            rule__StatePostTransaction__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStatePostTransactionAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__StatePostTransaction__Group__5__Impl"


    // $ANTLR start "rule__BooleanPostTransaction__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2108:1: rule__BooleanPostTransaction__Group__0 : rule__BooleanPostTransaction__Group__0__Impl rule__BooleanPostTransaction__Group__1 ;
    public final void rule__BooleanPostTransaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2112:1: ( rule__BooleanPostTransaction__Group__0__Impl rule__BooleanPostTransaction__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2113:2: rule__BooleanPostTransaction__Group__0__Impl rule__BooleanPostTransaction__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanPostTransaction__Group__0__Impl_in_rule__BooleanPostTransaction__Group__04320);
            rule__BooleanPostTransaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanPostTransaction__Group__1_in_rule__BooleanPostTransaction__Group__04323);
            rule__BooleanPostTransaction__Group__1();

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
    // $ANTLR end "rule__BooleanPostTransaction__Group__0"


    // $ANTLR start "rule__BooleanPostTransaction__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2120:1: rule__BooleanPostTransaction__Group__0__Impl : ( 'next' ) ;
    public final void rule__BooleanPostTransaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2124:1: ( ( 'next' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2125:1: ( 'next' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2125:1: ( 'next' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2126:1: 'next'
            {
             before(grammarAccess.getBooleanPostTransactionAccess().getNextKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__BooleanPostTransaction__Group__0__Impl4351); 
             after(grammarAccess.getBooleanPostTransactionAccess().getNextKeyword_0()); 

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
    // $ANTLR end "rule__BooleanPostTransaction__Group__0__Impl"


    // $ANTLR start "rule__BooleanPostTransaction__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2139:1: rule__BooleanPostTransaction__Group__1 : rule__BooleanPostTransaction__Group__1__Impl rule__BooleanPostTransaction__Group__2 ;
    public final void rule__BooleanPostTransaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2143:1: ( rule__BooleanPostTransaction__Group__1__Impl rule__BooleanPostTransaction__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2144:2: rule__BooleanPostTransaction__Group__1__Impl rule__BooleanPostTransaction__Group__2
            {
            pushFollow(FOLLOW_rule__BooleanPostTransaction__Group__1__Impl_in_rule__BooleanPostTransaction__Group__14382);
            rule__BooleanPostTransaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanPostTransaction__Group__2_in_rule__BooleanPostTransaction__Group__14385);
            rule__BooleanPostTransaction__Group__2();

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
    // $ANTLR end "rule__BooleanPostTransaction__Group__1"


    // $ANTLR start "rule__BooleanPostTransaction__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2151:1: rule__BooleanPostTransaction__Group__1__Impl : ( '(' ) ;
    public final void rule__BooleanPostTransaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2155:1: ( ( '(' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2156:1: ( '(' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2156:1: ( '(' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2157:1: '('
            {
             before(grammarAccess.getBooleanPostTransactionAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__BooleanPostTransaction__Group__1__Impl4413); 
             after(grammarAccess.getBooleanPostTransactionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__BooleanPostTransaction__Group__1__Impl"


    // $ANTLR start "rule__BooleanPostTransaction__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2170:1: rule__BooleanPostTransaction__Group__2 : rule__BooleanPostTransaction__Group__2__Impl rule__BooleanPostTransaction__Group__3 ;
    public final void rule__BooleanPostTransaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2174:1: ( rule__BooleanPostTransaction__Group__2__Impl rule__BooleanPostTransaction__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2175:2: rule__BooleanPostTransaction__Group__2__Impl rule__BooleanPostTransaction__Group__3
            {
            pushFollow(FOLLOW_rule__BooleanPostTransaction__Group__2__Impl_in_rule__BooleanPostTransaction__Group__24444);
            rule__BooleanPostTransaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanPostTransaction__Group__3_in_rule__BooleanPostTransaction__Group__24447);
            rule__BooleanPostTransaction__Group__3();

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
    // $ANTLR end "rule__BooleanPostTransaction__Group__2"


    // $ANTLR start "rule__BooleanPostTransaction__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2182:1: rule__BooleanPostTransaction__Group__2__Impl : ( ( rule__BooleanPostTransaction__VarAssignment_2 ) ) ;
    public final void rule__BooleanPostTransaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2186:1: ( ( ( rule__BooleanPostTransaction__VarAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2187:1: ( ( rule__BooleanPostTransaction__VarAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2187:1: ( ( rule__BooleanPostTransaction__VarAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2188:1: ( rule__BooleanPostTransaction__VarAssignment_2 )
            {
             before(grammarAccess.getBooleanPostTransactionAccess().getVarAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2189:1: ( rule__BooleanPostTransaction__VarAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2189:2: rule__BooleanPostTransaction__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__BooleanPostTransaction__VarAssignment_2_in_rule__BooleanPostTransaction__Group__2__Impl4474);
            rule__BooleanPostTransaction__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanPostTransactionAccess().getVarAssignment_2()); 

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
    // $ANTLR end "rule__BooleanPostTransaction__Group__2__Impl"


    // $ANTLR start "rule__BooleanPostTransaction__Group__3"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2199:1: rule__BooleanPostTransaction__Group__3 : rule__BooleanPostTransaction__Group__3__Impl rule__BooleanPostTransaction__Group__4 ;
    public final void rule__BooleanPostTransaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2203:1: ( rule__BooleanPostTransaction__Group__3__Impl rule__BooleanPostTransaction__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2204:2: rule__BooleanPostTransaction__Group__3__Impl rule__BooleanPostTransaction__Group__4
            {
            pushFollow(FOLLOW_rule__BooleanPostTransaction__Group__3__Impl_in_rule__BooleanPostTransaction__Group__34504);
            rule__BooleanPostTransaction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanPostTransaction__Group__4_in_rule__BooleanPostTransaction__Group__34507);
            rule__BooleanPostTransaction__Group__4();

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
    // $ANTLR end "rule__BooleanPostTransaction__Group__3"


    // $ANTLR start "rule__BooleanPostTransaction__Group__3__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2211:1: rule__BooleanPostTransaction__Group__3__Impl : ( ')' ) ;
    public final void rule__BooleanPostTransaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2215:1: ( ( ')' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2216:1: ( ')' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2216:1: ( ')' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2217:1: ')'
            {
             before(grammarAccess.getBooleanPostTransactionAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__BooleanPostTransaction__Group__3__Impl4535); 
             after(grammarAccess.getBooleanPostTransactionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__BooleanPostTransaction__Group__3__Impl"


    // $ANTLR start "rule__BooleanPostTransaction__Group__4"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2230:1: rule__BooleanPostTransaction__Group__4 : rule__BooleanPostTransaction__Group__4__Impl rule__BooleanPostTransaction__Group__5 ;
    public final void rule__BooleanPostTransaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2234:1: ( rule__BooleanPostTransaction__Group__4__Impl rule__BooleanPostTransaction__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2235:2: rule__BooleanPostTransaction__Group__4__Impl rule__BooleanPostTransaction__Group__5
            {
            pushFollow(FOLLOW_rule__BooleanPostTransaction__Group__4__Impl_in_rule__BooleanPostTransaction__Group__44566);
            rule__BooleanPostTransaction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanPostTransaction__Group__5_in_rule__BooleanPostTransaction__Group__44569);
            rule__BooleanPostTransaction__Group__5();

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
    // $ANTLR end "rule__BooleanPostTransaction__Group__4"


    // $ANTLR start "rule__BooleanPostTransaction__Group__4__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2242:1: rule__BooleanPostTransaction__Group__4__Impl : ( '=' ) ;
    public final void rule__BooleanPostTransaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2246:1: ( ( '=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2247:1: ( '=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2247:1: ( '=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2248:1: '='
            {
             before(grammarAccess.getBooleanPostTransactionAccess().getEqualsSignKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__BooleanPostTransaction__Group__4__Impl4597); 
             after(grammarAccess.getBooleanPostTransactionAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__BooleanPostTransaction__Group__4__Impl"


    // $ANTLR start "rule__BooleanPostTransaction__Group__5"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2261:1: rule__BooleanPostTransaction__Group__5 : rule__BooleanPostTransaction__Group__5__Impl ;
    public final void rule__BooleanPostTransaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2265:1: ( rule__BooleanPostTransaction__Group__5__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2266:2: rule__BooleanPostTransaction__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__BooleanPostTransaction__Group__5__Impl_in_rule__BooleanPostTransaction__Group__54628);
            rule__BooleanPostTransaction__Group__5__Impl();

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
    // $ANTLR end "rule__BooleanPostTransaction__Group__5"


    // $ANTLR start "rule__BooleanPostTransaction__Group__5__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2272:1: rule__BooleanPostTransaction__Group__5__Impl : ( ( rule__BooleanPostTransaction__ValueAssignment_5 ) ) ;
    public final void rule__BooleanPostTransaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2276:1: ( ( ( rule__BooleanPostTransaction__ValueAssignment_5 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2277:1: ( ( rule__BooleanPostTransaction__ValueAssignment_5 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2277:1: ( ( rule__BooleanPostTransaction__ValueAssignment_5 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2278:1: ( rule__BooleanPostTransaction__ValueAssignment_5 )
            {
             before(grammarAccess.getBooleanPostTransactionAccess().getValueAssignment_5()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2279:1: ( rule__BooleanPostTransaction__ValueAssignment_5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2279:2: rule__BooleanPostTransaction__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__BooleanPostTransaction__ValueAssignment_5_in_rule__BooleanPostTransaction__Group__5__Impl4655);
            rule__BooleanPostTransaction__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBooleanPostTransactionAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__BooleanPostTransaction__Group__5__Impl"


    // $ANTLR start "rule__IntegerPostTransaction__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2301:1: rule__IntegerPostTransaction__Group__0 : rule__IntegerPostTransaction__Group__0__Impl rule__IntegerPostTransaction__Group__1 ;
    public final void rule__IntegerPostTransaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2305:1: ( rule__IntegerPostTransaction__Group__0__Impl rule__IntegerPostTransaction__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2306:2: rule__IntegerPostTransaction__Group__0__Impl rule__IntegerPostTransaction__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerPostTransaction__Group__0__Impl_in_rule__IntegerPostTransaction__Group__04697);
            rule__IntegerPostTransaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerPostTransaction__Group__1_in_rule__IntegerPostTransaction__Group__04700);
            rule__IntegerPostTransaction__Group__1();

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
    // $ANTLR end "rule__IntegerPostTransaction__Group__0"


    // $ANTLR start "rule__IntegerPostTransaction__Group__0__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2313:1: rule__IntegerPostTransaction__Group__0__Impl : ( 'next' ) ;
    public final void rule__IntegerPostTransaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2317:1: ( ( 'next' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2318:1: ( 'next' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2318:1: ( 'next' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2319:1: 'next'
            {
             before(grammarAccess.getIntegerPostTransactionAccess().getNextKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__IntegerPostTransaction__Group__0__Impl4728); 
             after(grammarAccess.getIntegerPostTransactionAccess().getNextKeyword_0()); 

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
    // $ANTLR end "rule__IntegerPostTransaction__Group__0__Impl"


    // $ANTLR start "rule__IntegerPostTransaction__Group__1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2332:1: rule__IntegerPostTransaction__Group__1 : rule__IntegerPostTransaction__Group__1__Impl rule__IntegerPostTransaction__Group__2 ;
    public final void rule__IntegerPostTransaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2336:1: ( rule__IntegerPostTransaction__Group__1__Impl rule__IntegerPostTransaction__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2337:2: rule__IntegerPostTransaction__Group__1__Impl rule__IntegerPostTransaction__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerPostTransaction__Group__1__Impl_in_rule__IntegerPostTransaction__Group__14759);
            rule__IntegerPostTransaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerPostTransaction__Group__2_in_rule__IntegerPostTransaction__Group__14762);
            rule__IntegerPostTransaction__Group__2();

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
    // $ANTLR end "rule__IntegerPostTransaction__Group__1"


    // $ANTLR start "rule__IntegerPostTransaction__Group__1__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2344:1: rule__IntegerPostTransaction__Group__1__Impl : ( '(' ) ;
    public final void rule__IntegerPostTransaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2348:1: ( ( '(' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2349:1: ( '(' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2349:1: ( '(' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2350:1: '('
            {
             before(grammarAccess.getIntegerPostTransactionAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__IntegerPostTransaction__Group__1__Impl4790); 
             after(grammarAccess.getIntegerPostTransactionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__IntegerPostTransaction__Group__1__Impl"


    // $ANTLR start "rule__IntegerPostTransaction__Group__2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2363:1: rule__IntegerPostTransaction__Group__2 : rule__IntegerPostTransaction__Group__2__Impl rule__IntegerPostTransaction__Group__3 ;
    public final void rule__IntegerPostTransaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2367:1: ( rule__IntegerPostTransaction__Group__2__Impl rule__IntegerPostTransaction__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2368:2: rule__IntegerPostTransaction__Group__2__Impl rule__IntegerPostTransaction__Group__3
            {
            pushFollow(FOLLOW_rule__IntegerPostTransaction__Group__2__Impl_in_rule__IntegerPostTransaction__Group__24821);
            rule__IntegerPostTransaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerPostTransaction__Group__3_in_rule__IntegerPostTransaction__Group__24824);
            rule__IntegerPostTransaction__Group__3();

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
    // $ANTLR end "rule__IntegerPostTransaction__Group__2"


    // $ANTLR start "rule__IntegerPostTransaction__Group__2__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2375:1: rule__IntegerPostTransaction__Group__2__Impl : ( ( rule__IntegerPostTransaction__VarAssignment_2 ) ) ;
    public final void rule__IntegerPostTransaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2379:1: ( ( ( rule__IntegerPostTransaction__VarAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2380:1: ( ( rule__IntegerPostTransaction__VarAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2380:1: ( ( rule__IntegerPostTransaction__VarAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2381:1: ( rule__IntegerPostTransaction__VarAssignment_2 )
            {
             before(grammarAccess.getIntegerPostTransactionAccess().getVarAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2382:1: ( rule__IntegerPostTransaction__VarAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2382:2: rule__IntegerPostTransaction__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerPostTransaction__VarAssignment_2_in_rule__IntegerPostTransaction__Group__2__Impl4851);
            rule__IntegerPostTransaction__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPostTransactionAccess().getVarAssignment_2()); 

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
    // $ANTLR end "rule__IntegerPostTransaction__Group__2__Impl"


    // $ANTLR start "rule__IntegerPostTransaction__Group__3"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2392:1: rule__IntegerPostTransaction__Group__3 : rule__IntegerPostTransaction__Group__3__Impl rule__IntegerPostTransaction__Group__4 ;
    public final void rule__IntegerPostTransaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2396:1: ( rule__IntegerPostTransaction__Group__3__Impl rule__IntegerPostTransaction__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2397:2: rule__IntegerPostTransaction__Group__3__Impl rule__IntegerPostTransaction__Group__4
            {
            pushFollow(FOLLOW_rule__IntegerPostTransaction__Group__3__Impl_in_rule__IntegerPostTransaction__Group__34881);
            rule__IntegerPostTransaction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerPostTransaction__Group__4_in_rule__IntegerPostTransaction__Group__34884);
            rule__IntegerPostTransaction__Group__4();

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
    // $ANTLR end "rule__IntegerPostTransaction__Group__3"


    // $ANTLR start "rule__IntegerPostTransaction__Group__3__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2404:1: rule__IntegerPostTransaction__Group__3__Impl : ( ')' ) ;
    public final void rule__IntegerPostTransaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2408:1: ( ( ')' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2409:1: ( ')' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2409:1: ( ')' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2410:1: ')'
            {
             before(grammarAccess.getIntegerPostTransactionAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__IntegerPostTransaction__Group__3__Impl4912); 
             after(grammarAccess.getIntegerPostTransactionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__IntegerPostTransaction__Group__3__Impl"


    // $ANTLR start "rule__IntegerPostTransaction__Group__4"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2423:1: rule__IntegerPostTransaction__Group__4 : rule__IntegerPostTransaction__Group__4__Impl rule__IntegerPostTransaction__Group__5 ;
    public final void rule__IntegerPostTransaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2427:1: ( rule__IntegerPostTransaction__Group__4__Impl rule__IntegerPostTransaction__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2428:2: rule__IntegerPostTransaction__Group__4__Impl rule__IntegerPostTransaction__Group__5
            {
            pushFollow(FOLLOW_rule__IntegerPostTransaction__Group__4__Impl_in_rule__IntegerPostTransaction__Group__44943);
            rule__IntegerPostTransaction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerPostTransaction__Group__5_in_rule__IntegerPostTransaction__Group__44946);
            rule__IntegerPostTransaction__Group__5();

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
    // $ANTLR end "rule__IntegerPostTransaction__Group__4"


    // $ANTLR start "rule__IntegerPostTransaction__Group__4__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2435:1: rule__IntegerPostTransaction__Group__4__Impl : ( '=' ) ;
    public final void rule__IntegerPostTransaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2439:1: ( ( '=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2440:1: ( '=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2440:1: ( '=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2441:1: '='
            {
             before(grammarAccess.getIntegerPostTransactionAccess().getEqualsSignKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__IntegerPostTransaction__Group__4__Impl4974); 
             after(grammarAccess.getIntegerPostTransactionAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__IntegerPostTransaction__Group__4__Impl"


    // $ANTLR start "rule__IntegerPostTransaction__Group__5"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2454:1: rule__IntegerPostTransaction__Group__5 : rule__IntegerPostTransaction__Group__5__Impl ;
    public final void rule__IntegerPostTransaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2458:1: ( rule__IntegerPostTransaction__Group__5__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2459:2: rule__IntegerPostTransaction__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__IntegerPostTransaction__Group__5__Impl_in_rule__IntegerPostTransaction__Group__55005);
            rule__IntegerPostTransaction__Group__5__Impl();

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
    // $ANTLR end "rule__IntegerPostTransaction__Group__5"


    // $ANTLR start "rule__IntegerPostTransaction__Group__5__Impl"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2465:1: rule__IntegerPostTransaction__Group__5__Impl : ( ( rule__IntegerPostTransaction__ValueAssignment_5 ) ) ;
    public final void rule__IntegerPostTransaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2469:1: ( ( ( rule__IntegerPostTransaction__ValueAssignment_5 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2470:1: ( ( rule__IntegerPostTransaction__ValueAssignment_5 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2470:1: ( ( rule__IntegerPostTransaction__ValueAssignment_5 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2471:1: ( rule__IntegerPostTransaction__ValueAssignment_5 )
            {
             before(grammarAccess.getIntegerPostTransactionAccess().getValueAssignment_5()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2472:1: ( rule__IntegerPostTransaction__ValueAssignment_5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2472:2: rule__IntegerPostTransaction__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__IntegerPostTransaction__ValueAssignment_5_in_rule__IntegerPostTransaction__Group__5__Impl5032);
            rule__IntegerPostTransaction__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPostTransactionAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__IntegerPostTransaction__Group__5__Impl"


    // $ANTLR start "rule__IntegerDeclarion__Group__0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2494:1: rule__IntegerDeclarion__Group__0 : rule__IntegerDeclarion__Group__0__Impl rule__IntegerDeclarion__Group__1 ;
    public final void rule__IntegerDeclarion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2498:1: ( rule__IntegerDeclarion__Group__0__Impl rule__IntegerDeclarion__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2499:2: rule__IntegerDeclarion__Group__0__Impl rule__IntegerDeclarion__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__0__Impl_in_rule__IntegerDeclarion__Group__05074);
            rule__IntegerDeclarion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__1_in_rule__IntegerDeclarion__Group__05077);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2506:1: rule__IntegerDeclarion__Group__0__Impl : ( ( rule__IntegerDeclarion__NameAssignment_0 ) ) ;
    public final void rule__IntegerDeclarion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2510:1: ( ( ( rule__IntegerDeclarion__NameAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2511:1: ( ( rule__IntegerDeclarion__NameAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2511:1: ( ( rule__IntegerDeclarion__NameAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2512:1: ( rule__IntegerDeclarion__NameAssignment_0 )
            {
             before(grammarAccess.getIntegerDeclarionAccess().getNameAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2513:1: ( rule__IntegerDeclarion__NameAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2513:2: rule__IntegerDeclarion__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__NameAssignment_0_in_rule__IntegerDeclarion__Group__0__Impl5104);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2523:1: rule__IntegerDeclarion__Group__1 : rule__IntegerDeclarion__Group__1__Impl rule__IntegerDeclarion__Group__2 ;
    public final void rule__IntegerDeclarion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2527:1: ( rule__IntegerDeclarion__Group__1__Impl rule__IntegerDeclarion__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2528:2: rule__IntegerDeclarion__Group__1__Impl rule__IntegerDeclarion__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__1__Impl_in_rule__IntegerDeclarion__Group__15134);
            rule__IntegerDeclarion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__2_in_rule__IntegerDeclarion__Group__15137);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2535:1: rule__IntegerDeclarion__Group__1__Impl : ( ':' ) ;
    public final void rule__IntegerDeclarion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2539:1: ( ( ':' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2540:1: ( ':' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2540:1: ( ':' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2541:1: ':'
            {
             before(grammarAccess.getIntegerDeclarionAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__IntegerDeclarion__Group__1__Impl5165); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2554:1: rule__IntegerDeclarion__Group__2 : rule__IntegerDeclarion__Group__2__Impl rule__IntegerDeclarion__Group__3 ;
    public final void rule__IntegerDeclarion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2558:1: ( rule__IntegerDeclarion__Group__2__Impl rule__IntegerDeclarion__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2559:2: rule__IntegerDeclarion__Group__2__Impl rule__IntegerDeclarion__Group__3
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__2__Impl_in_rule__IntegerDeclarion__Group__25196);
            rule__IntegerDeclarion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__3_in_rule__IntegerDeclarion__Group__25199);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2566:1: rule__IntegerDeclarion__Group__2__Impl : ( 'integer' ) ;
    public final void rule__IntegerDeclarion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2570:1: ( ( 'integer' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2571:1: ( 'integer' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2571:1: ( 'integer' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2572:1: 'integer'
            {
             before(grammarAccess.getIntegerDeclarionAccess().getIntegerKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__IntegerDeclarion__Group__2__Impl5227); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2585:1: rule__IntegerDeclarion__Group__3 : rule__IntegerDeclarion__Group__3__Impl ;
    public final void rule__IntegerDeclarion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2589:1: ( rule__IntegerDeclarion__Group__3__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2590:2: rule__IntegerDeclarion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IntegerDeclarion__Group__3__Impl_in_rule__IntegerDeclarion__Group__35258);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2596:1: rule__IntegerDeclarion__Group__3__Impl : ( ';' ) ;
    public final void rule__IntegerDeclarion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2600:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2601:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2601:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2602:1: ';'
            {
             before(grammarAccess.getIntegerDeclarionAccess().getSemicolonKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__IntegerDeclarion__Group__3__Impl5286); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2623:1: rule__BooleanDeclarion__Group__0 : rule__BooleanDeclarion__Group__0__Impl rule__BooleanDeclarion__Group__1 ;
    public final void rule__BooleanDeclarion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2627:1: ( rule__BooleanDeclarion__Group__0__Impl rule__BooleanDeclarion__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2628:2: rule__BooleanDeclarion__Group__0__Impl rule__BooleanDeclarion__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__0__Impl_in_rule__BooleanDeclarion__Group__05325);
            rule__BooleanDeclarion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__1_in_rule__BooleanDeclarion__Group__05328);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2635:1: rule__BooleanDeclarion__Group__0__Impl : ( ( rule__BooleanDeclarion__NameAssignment_0 ) ) ;
    public final void rule__BooleanDeclarion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2639:1: ( ( ( rule__BooleanDeclarion__NameAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2640:1: ( ( rule__BooleanDeclarion__NameAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2640:1: ( ( rule__BooleanDeclarion__NameAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2641:1: ( rule__BooleanDeclarion__NameAssignment_0 )
            {
             before(grammarAccess.getBooleanDeclarionAccess().getNameAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2642:1: ( rule__BooleanDeclarion__NameAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2642:2: rule__BooleanDeclarion__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__NameAssignment_0_in_rule__BooleanDeclarion__Group__0__Impl5355);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2652:1: rule__BooleanDeclarion__Group__1 : rule__BooleanDeclarion__Group__1__Impl rule__BooleanDeclarion__Group__2 ;
    public final void rule__BooleanDeclarion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2656:1: ( rule__BooleanDeclarion__Group__1__Impl rule__BooleanDeclarion__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2657:2: rule__BooleanDeclarion__Group__1__Impl rule__BooleanDeclarion__Group__2
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__1__Impl_in_rule__BooleanDeclarion__Group__15385);
            rule__BooleanDeclarion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__2_in_rule__BooleanDeclarion__Group__15388);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2664:1: rule__BooleanDeclarion__Group__1__Impl : ( ':' ) ;
    public final void rule__BooleanDeclarion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2668:1: ( ( ':' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2669:1: ( ':' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2669:1: ( ':' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2670:1: ':'
            {
             before(grammarAccess.getBooleanDeclarionAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__BooleanDeclarion__Group__1__Impl5416); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2683:1: rule__BooleanDeclarion__Group__2 : rule__BooleanDeclarion__Group__2__Impl rule__BooleanDeclarion__Group__3 ;
    public final void rule__BooleanDeclarion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2687:1: ( rule__BooleanDeclarion__Group__2__Impl rule__BooleanDeclarion__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2688:2: rule__BooleanDeclarion__Group__2__Impl rule__BooleanDeclarion__Group__3
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__2__Impl_in_rule__BooleanDeclarion__Group__25447);
            rule__BooleanDeclarion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__3_in_rule__BooleanDeclarion__Group__25450);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2695:1: rule__BooleanDeclarion__Group__2__Impl : ( 'boolean' ) ;
    public final void rule__BooleanDeclarion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2699:1: ( ( 'boolean' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2700:1: ( 'boolean' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2700:1: ( 'boolean' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2701:1: 'boolean'
            {
             before(grammarAccess.getBooleanDeclarionAccess().getBooleanKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__BooleanDeclarion__Group__2__Impl5478); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2714:1: rule__BooleanDeclarion__Group__3 : rule__BooleanDeclarion__Group__3__Impl ;
    public final void rule__BooleanDeclarion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2718:1: ( rule__BooleanDeclarion__Group__3__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2719:2: rule__BooleanDeclarion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BooleanDeclarion__Group__3__Impl_in_rule__BooleanDeclarion__Group__35509);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2725:1: rule__BooleanDeclarion__Group__3__Impl : ( ';' ) ;
    public final void rule__BooleanDeclarion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2729:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2730:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2730:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2731:1: ';'
            {
             before(grammarAccess.getBooleanDeclarionAccess().getSemicolonKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__BooleanDeclarion__Group__3__Impl5537); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2752:1: rule__StateVariableDeclaration__Group__0 : rule__StateVariableDeclaration__Group__0__Impl rule__StateVariableDeclaration__Group__1 ;
    public final void rule__StateVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2756:1: ( rule__StateVariableDeclaration__Group__0__Impl rule__StateVariableDeclaration__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2757:2: rule__StateVariableDeclaration__Group__0__Impl rule__StateVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__0__Impl_in_rule__StateVariableDeclaration__Group__05576);
            rule__StateVariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__1_in_rule__StateVariableDeclaration__Group__05579);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2764:1: rule__StateVariableDeclaration__Group__0__Impl : ( ( rule__StateVariableDeclaration__NameAssignment_0 ) ) ;
    public final void rule__StateVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2768:1: ( ( ( rule__StateVariableDeclaration__NameAssignment_0 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2769:1: ( ( rule__StateVariableDeclaration__NameAssignment_0 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2769:1: ( ( rule__StateVariableDeclaration__NameAssignment_0 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2770:1: ( rule__StateVariableDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getNameAssignment_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2771:1: ( rule__StateVariableDeclaration__NameAssignment_0 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2771:2: rule__StateVariableDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__NameAssignment_0_in_rule__StateVariableDeclaration__Group__0__Impl5606);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2781:1: rule__StateVariableDeclaration__Group__1 : rule__StateVariableDeclaration__Group__1__Impl rule__StateVariableDeclaration__Group__2 ;
    public final void rule__StateVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2785:1: ( rule__StateVariableDeclaration__Group__1__Impl rule__StateVariableDeclaration__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2786:2: rule__StateVariableDeclaration__Group__1__Impl rule__StateVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__1__Impl_in_rule__StateVariableDeclaration__Group__15636);
            rule__StateVariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__2_in_rule__StateVariableDeclaration__Group__15639);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2793:1: rule__StateVariableDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__StateVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2797:1: ( ( ':' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2798:1: ( ':' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2798:1: ( ':' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2799:1: ':'
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__StateVariableDeclaration__Group__1__Impl5667); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2812:1: rule__StateVariableDeclaration__Group__2 : rule__StateVariableDeclaration__Group__2__Impl rule__StateVariableDeclaration__Group__3 ;
    public final void rule__StateVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2816:1: ( rule__StateVariableDeclaration__Group__2__Impl rule__StateVariableDeclaration__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2817:2: rule__StateVariableDeclaration__Group__2__Impl rule__StateVariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__2__Impl_in_rule__StateVariableDeclaration__Group__25698);
            rule__StateVariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__3_in_rule__StateVariableDeclaration__Group__25701);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2824:1: rule__StateVariableDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__StateVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2828:1: ( ( '{' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2829:1: ( '{' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2829:1: ( '{' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2830:1: '{'
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__StateVariableDeclaration__Group__2__Impl5729); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2843:1: rule__StateVariableDeclaration__Group__3 : rule__StateVariableDeclaration__Group__3__Impl rule__StateVariableDeclaration__Group__4 ;
    public final void rule__StateVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2847:1: ( rule__StateVariableDeclaration__Group__3__Impl rule__StateVariableDeclaration__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2848:2: rule__StateVariableDeclaration__Group__3__Impl rule__StateVariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__3__Impl_in_rule__StateVariableDeclaration__Group__35760);
            rule__StateVariableDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__4_in_rule__StateVariableDeclaration__Group__35763);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2855:1: rule__StateVariableDeclaration__Group__3__Impl : ( ( rule__StateVariableDeclaration__StatesAssignment_3 ) ) ;
    public final void rule__StateVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2859:1: ( ( ( rule__StateVariableDeclaration__StatesAssignment_3 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2860:1: ( ( rule__StateVariableDeclaration__StatesAssignment_3 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2860:1: ( ( rule__StateVariableDeclaration__StatesAssignment_3 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2861:1: ( rule__StateVariableDeclaration__StatesAssignment_3 )
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getStatesAssignment_3()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2862:1: ( rule__StateVariableDeclaration__StatesAssignment_3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2862:2: rule__StateVariableDeclaration__StatesAssignment_3
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__StatesAssignment_3_in_rule__StateVariableDeclaration__Group__3__Impl5790);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2872:1: rule__StateVariableDeclaration__Group__4 : rule__StateVariableDeclaration__Group__4__Impl rule__StateVariableDeclaration__Group__5 ;
    public final void rule__StateVariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2876:1: ( rule__StateVariableDeclaration__Group__4__Impl rule__StateVariableDeclaration__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2877:2: rule__StateVariableDeclaration__Group__4__Impl rule__StateVariableDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__4__Impl_in_rule__StateVariableDeclaration__Group__45820);
            rule__StateVariableDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__5_in_rule__StateVariableDeclaration__Group__45823);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2884:1: rule__StateVariableDeclaration__Group__4__Impl : ( ( rule__StateVariableDeclaration__Group_4__0 )* ) ;
    public final void rule__StateVariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2888:1: ( ( ( rule__StateVariableDeclaration__Group_4__0 )* ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2889:1: ( ( rule__StateVariableDeclaration__Group_4__0 )* )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2889:1: ( ( rule__StateVariableDeclaration__Group_4__0 )* )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2890:1: ( rule__StateVariableDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getGroup_4()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2891:1: ( rule__StateVariableDeclaration__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2891:2: rule__StateVariableDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__StateVariableDeclaration__Group_4__0_in_rule__StateVariableDeclaration__Group__4__Impl5850);
            	    rule__StateVariableDeclaration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2901:1: rule__StateVariableDeclaration__Group__5 : rule__StateVariableDeclaration__Group__5__Impl rule__StateVariableDeclaration__Group__6 ;
    public final void rule__StateVariableDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2905:1: ( rule__StateVariableDeclaration__Group__5__Impl rule__StateVariableDeclaration__Group__6 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2906:2: rule__StateVariableDeclaration__Group__5__Impl rule__StateVariableDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__5__Impl_in_rule__StateVariableDeclaration__Group__55881);
            rule__StateVariableDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__6_in_rule__StateVariableDeclaration__Group__55884);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2913:1: rule__StateVariableDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__StateVariableDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2917:1: ( ( '}' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2918:1: ( '}' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2918:1: ( '}' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2919:1: '}'
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_28_in_rule__StateVariableDeclaration__Group__5__Impl5912); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2932:1: rule__StateVariableDeclaration__Group__6 : rule__StateVariableDeclaration__Group__6__Impl ;
    public final void rule__StateVariableDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2936:1: ( rule__StateVariableDeclaration__Group__6__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2937:2: rule__StateVariableDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group__6__Impl_in_rule__StateVariableDeclaration__Group__65943);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2943:1: rule__StateVariableDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__StateVariableDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2947:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2948:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2948:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2949:1: ';'
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getSemicolonKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__StateVariableDeclaration__Group__6__Impl5971); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2976:1: rule__StateVariableDeclaration__Group_4__0 : rule__StateVariableDeclaration__Group_4__0__Impl rule__StateVariableDeclaration__Group_4__1 ;
    public final void rule__StateVariableDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2980:1: ( rule__StateVariableDeclaration__Group_4__0__Impl rule__StateVariableDeclaration__Group_4__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2981:2: rule__StateVariableDeclaration__Group_4__0__Impl rule__StateVariableDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group_4__0__Impl_in_rule__StateVariableDeclaration__Group_4__06016);
            rule__StateVariableDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group_4__1_in_rule__StateVariableDeclaration__Group_4__06019);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2988:1: rule__StateVariableDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StateVariableDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2992:1: ( ( ',' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2993:1: ( ',' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2993:1: ( ',' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:2994:1: ','
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getCommaKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__StateVariableDeclaration__Group_4__0__Impl6047); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3007:1: rule__StateVariableDeclaration__Group_4__1 : rule__StateVariableDeclaration__Group_4__1__Impl ;
    public final void rule__StateVariableDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3011:1: ( rule__StateVariableDeclaration__Group_4__1__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3012:2: rule__StateVariableDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__Group_4__1__Impl_in_rule__StateVariableDeclaration__Group_4__16078);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3018:1: rule__StateVariableDeclaration__Group_4__1__Impl : ( ( rule__StateVariableDeclaration__StatesAssignment_4_1 ) ) ;
    public final void rule__StateVariableDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3022:1: ( ( ( rule__StateVariableDeclaration__StatesAssignment_4_1 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3023:1: ( ( rule__StateVariableDeclaration__StatesAssignment_4_1 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3023:1: ( ( rule__StateVariableDeclaration__StatesAssignment_4_1 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3024:1: ( rule__StateVariableDeclaration__StatesAssignment_4_1 )
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getStatesAssignment_4_1()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3025:1: ( rule__StateVariableDeclaration__StatesAssignment_4_1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3025:2: rule__StateVariableDeclaration__StatesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StateVariableDeclaration__StatesAssignment_4_1_in_rule__StateVariableDeclaration__Group_4__1__Impl6105);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3039:1: rule__BooleanAssignment__Group__0 : rule__BooleanAssignment__Group__0__Impl rule__BooleanAssignment__Group__1 ;
    public final void rule__BooleanAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3043:1: ( rule__BooleanAssignment__Group__0__Impl rule__BooleanAssignment__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3044:2: rule__BooleanAssignment__Group__0__Impl rule__BooleanAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__0__Impl_in_rule__BooleanAssignment__Group__06139);
            rule__BooleanAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__1_in_rule__BooleanAssignment__Group__06142);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3051:1: rule__BooleanAssignment__Group__0__Impl : ( 'init' ) ;
    public final void rule__BooleanAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3055:1: ( ( 'init' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3056:1: ( 'init' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3056:1: ( 'init' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3057:1: 'init'
            {
             before(grammarAccess.getBooleanAssignmentAccess().getInitKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__BooleanAssignment__Group__0__Impl6170); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3070:1: rule__BooleanAssignment__Group__1 : rule__BooleanAssignment__Group__1__Impl rule__BooleanAssignment__Group__2 ;
    public final void rule__BooleanAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3074:1: ( rule__BooleanAssignment__Group__1__Impl rule__BooleanAssignment__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3075:2: rule__BooleanAssignment__Group__1__Impl rule__BooleanAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__1__Impl_in_rule__BooleanAssignment__Group__16201);
            rule__BooleanAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__2_in_rule__BooleanAssignment__Group__16204);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3082:1: rule__BooleanAssignment__Group__1__Impl : ( '(' ) ;
    public final void rule__BooleanAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3086:1: ( ( '(' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3087:1: ( '(' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3087:1: ( '(' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3088:1: '('
            {
             before(grammarAccess.getBooleanAssignmentAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__BooleanAssignment__Group__1__Impl6232); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3101:1: rule__BooleanAssignment__Group__2 : rule__BooleanAssignment__Group__2__Impl rule__BooleanAssignment__Group__3 ;
    public final void rule__BooleanAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3105:1: ( rule__BooleanAssignment__Group__2__Impl rule__BooleanAssignment__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3106:2: rule__BooleanAssignment__Group__2__Impl rule__BooleanAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__2__Impl_in_rule__BooleanAssignment__Group__26263);
            rule__BooleanAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__3_in_rule__BooleanAssignment__Group__26266);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3113:1: rule__BooleanAssignment__Group__2__Impl : ( ( rule__BooleanAssignment__VarAssignment_2 ) ) ;
    public final void rule__BooleanAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3117:1: ( ( ( rule__BooleanAssignment__VarAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3118:1: ( ( rule__BooleanAssignment__VarAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3118:1: ( ( rule__BooleanAssignment__VarAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3119:1: ( rule__BooleanAssignment__VarAssignment_2 )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getVarAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3120:1: ( rule__BooleanAssignment__VarAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3120:2: rule__BooleanAssignment__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__VarAssignment_2_in_rule__BooleanAssignment__Group__2__Impl6293);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3130:1: rule__BooleanAssignment__Group__3 : rule__BooleanAssignment__Group__3__Impl rule__BooleanAssignment__Group__4 ;
    public final void rule__BooleanAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3134:1: ( rule__BooleanAssignment__Group__3__Impl rule__BooleanAssignment__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3135:2: rule__BooleanAssignment__Group__3__Impl rule__BooleanAssignment__Group__4
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__3__Impl_in_rule__BooleanAssignment__Group__36323);
            rule__BooleanAssignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__4_in_rule__BooleanAssignment__Group__36326);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3142:1: rule__BooleanAssignment__Group__3__Impl : ( ')' ) ;
    public final void rule__BooleanAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3146:1: ( ( ')' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3147:1: ( ')' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3147:1: ( ')' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3148:1: ')'
            {
             before(grammarAccess.getBooleanAssignmentAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__BooleanAssignment__Group__3__Impl6354); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3161:1: rule__BooleanAssignment__Group__4 : rule__BooleanAssignment__Group__4__Impl rule__BooleanAssignment__Group__5 ;
    public final void rule__BooleanAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3165:1: ( rule__BooleanAssignment__Group__4__Impl rule__BooleanAssignment__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3166:2: rule__BooleanAssignment__Group__4__Impl rule__BooleanAssignment__Group__5
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__4__Impl_in_rule__BooleanAssignment__Group__46385);
            rule__BooleanAssignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__5_in_rule__BooleanAssignment__Group__46388);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3173:1: rule__BooleanAssignment__Group__4__Impl : ( ':=' ) ;
    public final void rule__BooleanAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3177:1: ( ( ':=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3178:1: ( ':=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3178:1: ( ':=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3179:1: ':='
            {
             before(grammarAccess.getBooleanAssignmentAccess().getColonEqualsSignKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__BooleanAssignment__Group__4__Impl6416); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3192:1: rule__BooleanAssignment__Group__5 : rule__BooleanAssignment__Group__5__Impl rule__BooleanAssignment__Group__6 ;
    public final void rule__BooleanAssignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3196:1: ( rule__BooleanAssignment__Group__5__Impl rule__BooleanAssignment__Group__6 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3197:2: rule__BooleanAssignment__Group__5__Impl rule__BooleanAssignment__Group__6
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__5__Impl_in_rule__BooleanAssignment__Group__56447);
            rule__BooleanAssignment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanAssignment__Group__6_in_rule__BooleanAssignment__Group__56450);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3204:1: rule__BooleanAssignment__Group__5__Impl : ( ( rule__BooleanAssignment__ValueAssignment_5 ) ) ;
    public final void rule__BooleanAssignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3208:1: ( ( ( rule__BooleanAssignment__ValueAssignment_5 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3209:1: ( ( rule__BooleanAssignment__ValueAssignment_5 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3209:1: ( ( rule__BooleanAssignment__ValueAssignment_5 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3210:1: ( rule__BooleanAssignment__ValueAssignment_5 )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getValueAssignment_5()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3211:1: ( rule__BooleanAssignment__ValueAssignment_5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3211:2: rule__BooleanAssignment__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__ValueAssignment_5_in_rule__BooleanAssignment__Group__5__Impl6477);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3221:1: rule__BooleanAssignment__Group__6 : rule__BooleanAssignment__Group__6__Impl ;
    public final void rule__BooleanAssignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3225:1: ( rule__BooleanAssignment__Group__6__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3226:2: rule__BooleanAssignment__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__BooleanAssignment__Group__6__Impl_in_rule__BooleanAssignment__Group__66507);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3232:1: rule__BooleanAssignment__Group__6__Impl : ( ';' ) ;
    public final void rule__BooleanAssignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3236:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3237:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3237:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3238:1: ';'
            {
             before(grammarAccess.getBooleanAssignmentAccess().getSemicolonKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__BooleanAssignment__Group__6__Impl6535); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3265:1: rule__IntegerAssignment__Group__0 : rule__IntegerAssignment__Group__0__Impl rule__IntegerAssignment__Group__1 ;
    public final void rule__IntegerAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3269:1: ( rule__IntegerAssignment__Group__0__Impl rule__IntegerAssignment__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3270:2: rule__IntegerAssignment__Group__0__Impl rule__IntegerAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__0__Impl_in_rule__IntegerAssignment__Group__06580);
            rule__IntegerAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__1_in_rule__IntegerAssignment__Group__06583);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3277:1: rule__IntegerAssignment__Group__0__Impl : ( 'init' ) ;
    public final void rule__IntegerAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3281:1: ( ( 'init' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3282:1: ( 'init' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3282:1: ( 'init' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3283:1: 'init'
            {
             before(grammarAccess.getIntegerAssignmentAccess().getInitKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__IntegerAssignment__Group__0__Impl6611); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3296:1: rule__IntegerAssignment__Group__1 : rule__IntegerAssignment__Group__1__Impl rule__IntegerAssignment__Group__2 ;
    public final void rule__IntegerAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3300:1: ( rule__IntegerAssignment__Group__1__Impl rule__IntegerAssignment__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3301:2: rule__IntegerAssignment__Group__1__Impl rule__IntegerAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__1__Impl_in_rule__IntegerAssignment__Group__16642);
            rule__IntegerAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__2_in_rule__IntegerAssignment__Group__16645);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3308:1: rule__IntegerAssignment__Group__1__Impl : ( '(' ) ;
    public final void rule__IntegerAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3312:1: ( ( '(' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3313:1: ( '(' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3313:1: ( '(' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3314:1: '('
            {
             before(grammarAccess.getIntegerAssignmentAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__IntegerAssignment__Group__1__Impl6673); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3327:1: rule__IntegerAssignment__Group__2 : rule__IntegerAssignment__Group__2__Impl rule__IntegerAssignment__Group__3 ;
    public final void rule__IntegerAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3331:1: ( rule__IntegerAssignment__Group__2__Impl rule__IntegerAssignment__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3332:2: rule__IntegerAssignment__Group__2__Impl rule__IntegerAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__2__Impl_in_rule__IntegerAssignment__Group__26704);
            rule__IntegerAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__3_in_rule__IntegerAssignment__Group__26707);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3339:1: rule__IntegerAssignment__Group__2__Impl : ( ( rule__IntegerAssignment__VarAssignment_2 ) ) ;
    public final void rule__IntegerAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3343:1: ( ( ( rule__IntegerAssignment__VarAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3344:1: ( ( rule__IntegerAssignment__VarAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3344:1: ( ( rule__IntegerAssignment__VarAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3345:1: ( rule__IntegerAssignment__VarAssignment_2 )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getVarAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3346:1: ( rule__IntegerAssignment__VarAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3346:2: rule__IntegerAssignment__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__VarAssignment_2_in_rule__IntegerAssignment__Group__2__Impl6734);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3356:1: rule__IntegerAssignment__Group__3 : rule__IntegerAssignment__Group__3__Impl rule__IntegerAssignment__Group__4 ;
    public final void rule__IntegerAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3360:1: ( rule__IntegerAssignment__Group__3__Impl rule__IntegerAssignment__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3361:2: rule__IntegerAssignment__Group__3__Impl rule__IntegerAssignment__Group__4
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__3__Impl_in_rule__IntegerAssignment__Group__36764);
            rule__IntegerAssignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__4_in_rule__IntegerAssignment__Group__36767);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3368:1: rule__IntegerAssignment__Group__3__Impl : ( ')' ) ;
    public final void rule__IntegerAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3372:1: ( ( ')' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3373:1: ( ')' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3373:1: ( ')' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3374:1: ')'
            {
             before(grammarAccess.getIntegerAssignmentAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__IntegerAssignment__Group__3__Impl6795); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3387:1: rule__IntegerAssignment__Group__4 : rule__IntegerAssignment__Group__4__Impl rule__IntegerAssignment__Group__5 ;
    public final void rule__IntegerAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3391:1: ( rule__IntegerAssignment__Group__4__Impl rule__IntegerAssignment__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3392:2: rule__IntegerAssignment__Group__4__Impl rule__IntegerAssignment__Group__5
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__4__Impl_in_rule__IntegerAssignment__Group__46826);
            rule__IntegerAssignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__5_in_rule__IntegerAssignment__Group__46829);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3399:1: rule__IntegerAssignment__Group__4__Impl : ( ':=' ) ;
    public final void rule__IntegerAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3403:1: ( ( ':=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3404:1: ( ':=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3404:1: ( ':=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3405:1: ':='
            {
             before(grammarAccess.getIntegerAssignmentAccess().getColonEqualsSignKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__IntegerAssignment__Group__4__Impl6857); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3418:1: rule__IntegerAssignment__Group__5 : rule__IntegerAssignment__Group__5__Impl rule__IntegerAssignment__Group__6 ;
    public final void rule__IntegerAssignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3422:1: ( rule__IntegerAssignment__Group__5__Impl rule__IntegerAssignment__Group__6 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3423:2: rule__IntegerAssignment__Group__5__Impl rule__IntegerAssignment__Group__6
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__5__Impl_in_rule__IntegerAssignment__Group__56888);
            rule__IntegerAssignment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntegerAssignment__Group__6_in_rule__IntegerAssignment__Group__56891);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3430:1: rule__IntegerAssignment__Group__5__Impl : ( ( rule__IntegerAssignment__ValueAssignment_5 ) ) ;
    public final void rule__IntegerAssignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3434:1: ( ( ( rule__IntegerAssignment__ValueAssignment_5 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3435:1: ( ( rule__IntegerAssignment__ValueAssignment_5 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3435:1: ( ( rule__IntegerAssignment__ValueAssignment_5 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3436:1: ( rule__IntegerAssignment__ValueAssignment_5 )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getValueAssignment_5()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3437:1: ( rule__IntegerAssignment__ValueAssignment_5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3437:2: rule__IntegerAssignment__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__ValueAssignment_5_in_rule__IntegerAssignment__Group__5__Impl6918);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3447:1: rule__IntegerAssignment__Group__6 : rule__IntegerAssignment__Group__6__Impl ;
    public final void rule__IntegerAssignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3451:1: ( rule__IntegerAssignment__Group__6__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3452:2: rule__IntegerAssignment__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__IntegerAssignment__Group__6__Impl_in_rule__IntegerAssignment__Group__66948);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3458:1: rule__IntegerAssignment__Group__6__Impl : ( ';' ) ;
    public final void rule__IntegerAssignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3462:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3463:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3463:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3464:1: ';'
            {
             before(grammarAccess.getIntegerAssignmentAccess().getSemicolonKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__IntegerAssignment__Group__6__Impl6976); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3491:1: rule__StateAssignment__Group__0 : rule__StateAssignment__Group__0__Impl rule__StateAssignment__Group__1 ;
    public final void rule__StateAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3495:1: ( rule__StateAssignment__Group__0__Impl rule__StateAssignment__Group__1 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3496:2: rule__StateAssignment__Group__0__Impl rule__StateAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__0__Impl_in_rule__StateAssignment__Group__07021);
            rule__StateAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__1_in_rule__StateAssignment__Group__07024);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3503:1: rule__StateAssignment__Group__0__Impl : ( 'init' ) ;
    public final void rule__StateAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3507:1: ( ( 'init' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3508:1: ( 'init' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3508:1: ( 'init' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3509:1: 'init'
            {
             before(grammarAccess.getStateAssignmentAccess().getInitKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__StateAssignment__Group__0__Impl7052); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3522:1: rule__StateAssignment__Group__1 : rule__StateAssignment__Group__1__Impl rule__StateAssignment__Group__2 ;
    public final void rule__StateAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3526:1: ( rule__StateAssignment__Group__1__Impl rule__StateAssignment__Group__2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3527:2: rule__StateAssignment__Group__1__Impl rule__StateAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__1__Impl_in_rule__StateAssignment__Group__17083);
            rule__StateAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__2_in_rule__StateAssignment__Group__17086);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3534:1: rule__StateAssignment__Group__1__Impl : ( '(' ) ;
    public final void rule__StateAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3538:1: ( ( '(' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3539:1: ( '(' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3539:1: ( '(' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3540:1: '('
            {
             before(grammarAccess.getStateAssignmentAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__StateAssignment__Group__1__Impl7114); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3553:1: rule__StateAssignment__Group__2 : rule__StateAssignment__Group__2__Impl rule__StateAssignment__Group__3 ;
    public final void rule__StateAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3557:1: ( rule__StateAssignment__Group__2__Impl rule__StateAssignment__Group__3 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3558:2: rule__StateAssignment__Group__2__Impl rule__StateAssignment__Group__3
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__2__Impl_in_rule__StateAssignment__Group__27145);
            rule__StateAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__3_in_rule__StateAssignment__Group__27148);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3565:1: rule__StateAssignment__Group__2__Impl : ( ( rule__StateAssignment__VarAssignment_2 ) ) ;
    public final void rule__StateAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3569:1: ( ( ( rule__StateAssignment__VarAssignment_2 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3570:1: ( ( rule__StateAssignment__VarAssignment_2 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3570:1: ( ( rule__StateAssignment__VarAssignment_2 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3571:1: ( rule__StateAssignment__VarAssignment_2 )
            {
             before(grammarAccess.getStateAssignmentAccess().getVarAssignment_2()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3572:1: ( rule__StateAssignment__VarAssignment_2 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3572:2: rule__StateAssignment__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__StateAssignment__VarAssignment_2_in_rule__StateAssignment__Group__2__Impl7175);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3582:1: rule__StateAssignment__Group__3 : rule__StateAssignment__Group__3__Impl rule__StateAssignment__Group__4 ;
    public final void rule__StateAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3586:1: ( rule__StateAssignment__Group__3__Impl rule__StateAssignment__Group__4 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3587:2: rule__StateAssignment__Group__3__Impl rule__StateAssignment__Group__4
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__3__Impl_in_rule__StateAssignment__Group__37205);
            rule__StateAssignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__4_in_rule__StateAssignment__Group__37208);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3594:1: rule__StateAssignment__Group__3__Impl : ( ')' ) ;
    public final void rule__StateAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3598:1: ( ( ')' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3599:1: ( ')' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3599:1: ( ')' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3600:1: ')'
            {
             before(grammarAccess.getStateAssignmentAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__StateAssignment__Group__3__Impl7236); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3613:1: rule__StateAssignment__Group__4 : rule__StateAssignment__Group__4__Impl rule__StateAssignment__Group__5 ;
    public final void rule__StateAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3617:1: ( rule__StateAssignment__Group__4__Impl rule__StateAssignment__Group__5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3618:2: rule__StateAssignment__Group__4__Impl rule__StateAssignment__Group__5
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__4__Impl_in_rule__StateAssignment__Group__47267);
            rule__StateAssignment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__5_in_rule__StateAssignment__Group__47270);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3625:1: rule__StateAssignment__Group__4__Impl : ( ':=' ) ;
    public final void rule__StateAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3629:1: ( ( ':=' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3630:1: ( ':=' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3630:1: ( ':=' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3631:1: ':='
            {
             before(grammarAccess.getStateAssignmentAccess().getColonEqualsSignKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__StateAssignment__Group__4__Impl7298); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3644:1: rule__StateAssignment__Group__5 : rule__StateAssignment__Group__5__Impl rule__StateAssignment__Group__6 ;
    public final void rule__StateAssignment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3648:1: ( rule__StateAssignment__Group__5__Impl rule__StateAssignment__Group__6 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3649:2: rule__StateAssignment__Group__5__Impl rule__StateAssignment__Group__6
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__5__Impl_in_rule__StateAssignment__Group__57329);
            rule__StateAssignment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateAssignment__Group__6_in_rule__StateAssignment__Group__57332);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3656:1: rule__StateAssignment__Group__5__Impl : ( ( rule__StateAssignment__ValueAssignment_5 ) ) ;
    public final void rule__StateAssignment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3660:1: ( ( ( rule__StateAssignment__ValueAssignment_5 ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3661:1: ( ( rule__StateAssignment__ValueAssignment_5 ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3661:1: ( ( rule__StateAssignment__ValueAssignment_5 ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3662:1: ( rule__StateAssignment__ValueAssignment_5 )
            {
             before(grammarAccess.getStateAssignmentAccess().getValueAssignment_5()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3663:1: ( rule__StateAssignment__ValueAssignment_5 )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3663:2: rule__StateAssignment__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__StateAssignment__ValueAssignment_5_in_rule__StateAssignment__Group__5__Impl7359);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3673:1: rule__StateAssignment__Group__6 : rule__StateAssignment__Group__6__Impl ;
    public final void rule__StateAssignment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3677:1: ( rule__StateAssignment__Group__6__Impl )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3678:2: rule__StateAssignment__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__StateAssignment__Group__6__Impl_in_rule__StateAssignment__Group__67389);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3684:1: rule__StateAssignment__Group__6__Impl : ( ';' ) ;
    public final void rule__StateAssignment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3688:1: ( ( ';' ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3689:1: ( ';' )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3689:1: ( ';' )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3690:1: ';'
            {
             before(grammarAccess.getStateAssignmentAccess().getSemicolonKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__StateAssignment__Group__6__Impl7417); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3718:1: rule__Model__SectionsAssignment : ( ruleSection ) ;
    public final void rule__Model__SectionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3722:1: ( ( ruleSection ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3723:1: ( ruleSection )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3723:1: ( ruleSection )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3724:1: ruleSection
            {
             before(grammarAccess.getModelAccess().getSectionsSectionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__Model__SectionsAssignment7467);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3733:1: rule__Comment__CommentAssignment : ( RULE_SMV_COMMENT ) ;
    public final void rule__Comment__CommentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3737:1: ( ( RULE_SMV_COMMENT ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3738:1: ( RULE_SMV_COMMENT )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3738:1: ( RULE_SMV_COMMENT )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3739:1: RULE_SMV_COMMENT
            {
             before(grammarAccess.getCommentAccess().getCommentSMV_COMMENTTerminalRuleCall_0()); 
            match(input,RULE_SMV_COMMENT,FOLLOW_RULE_SMV_COMMENT_in_rule__Comment__CommentAssignment7498); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3748:1: rule__VariablesSection__VariablesAssignment_1 : ( ruleVariableDeclaration ) ;
    public final void rule__VariablesSection__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3752:1: ( ( ruleVariableDeclaration ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3753:1: ( ruleVariableDeclaration )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3753:1: ( ruleVariableDeclaration )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3754:1: ruleVariableDeclaration
            {
             before(grammarAccess.getVariablesSectionAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__VariablesSection__VariablesAssignment_17529);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3763:1: rule__Assignments__AssignmentsAssignment_2 : ( ruleAssignmentExpression ) ;
    public final void rule__Assignments__AssignmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3767:1: ( ( ruleAssignmentExpression ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3768:1: ( ruleAssignmentExpression )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3768:1: ( ruleAssignmentExpression )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3769:1: ruleAssignmentExpression
            {
             before(grammarAccess.getAssignmentsAccess().getAssignmentsAssignmentExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_rule__Assignments__AssignmentsAssignment_27560);
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


    // $ANTLR start "rule__Transactions__TransactionAssignment_1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3778:1: rule__Transactions__TransactionAssignment_1 : ( ruleTransactionStatement ) ;
    public final void rule__Transactions__TransactionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3782:1: ( ( ruleTransactionStatement ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3783:1: ( ruleTransactionStatement )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3783:1: ( ruleTransactionStatement )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3784:1: ruleTransactionStatement
            {
             before(grammarAccess.getTransactionsAccess().getTransactionTransactionStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTransactionStatement_in_rule__Transactions__TransactionAssignment_17591);
            ruleTransactionStatement();

            state._fsp--;

             after(grammarAccess.getTransactionsAccess().getTransactionTransactionStatementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Transactions__TransactionAssignment_1"


    // $ANTLR start "rule__TransactionStatement__PreconditionAssignment_0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3793:1: rule__TransactionStatement__PreconditionAssignment_0 : ( ruleTransactionPrecondition ) ;
    public final void rule__TransactionStatement__PreconditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3797:1: ( ( ruleTransactionPrecondition ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3798:1: ( ruleTransactionPrecondition )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3798:1: ( ruleTransactionPrecondition )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3799:1: ruleTransactionPrecondition
            {
             before(grammarAccess.getTransactionStatementAccess().getPreconditionTransactionPreconditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTransactionPrecondition_in_rule__TransactionStatement__PreconditionAssignment_07622);
            ruleTransactionPrecondition();

            state._fsp--;

             after(grammarAccess.getTransactionStatementAccess().getPreconditionTransactionPreconditionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TransactionStatement__PreconditionAssignment_0"


    // $ANTLR start "rule__TransactionStatement__PostTransactionAssignment_2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3808:1: rule__TransactionStatement__PostTransactionAssignment_2 : ( rulePostTransaction ) ;
    public final void rule__TransactionStatement__PostTransactionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3812:1: ( ( rulePostTransaction ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3813:1: ( rulePostTransaction )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3813:1: ( rulePostTransaction )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3814:1: rulePostTransaction
            {
             before(grammarAccess.getTransactionStatementAccess().getPostTransactionPostTransactionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePostTransaction_in_rule__TransactionStatement__PostTransactionAssignment_27653);
            rulePostTransaction();

            state._fsp--;

             after(grammarAccess.getTransactionStatementAccess().getPostTransactionPostTransactionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TransactionStatement__PostTransactionAssignment_2"


    // $ANTLR start "rule__TransactionPrecondition__PreconditionsAssignment_0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3823:1: rule__TransactionPrecondition__PreconditionsAssignment_0 : ( rulePreconditionStatement ) ;
    public final void rule__TransactionPrecondition__PreconditionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3827:1: ( ( rulePreconditionStatement ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3828:1: ( rulePreconditionStatement )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3828:1: ( rulePreconditionStatement )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3829:1: rulePreconditionStatement
            {
             before(grammarAccess.getTransactionPreconditionAccess().getPreconditionsPreconditionStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePreconditionStatement_in_rule__TransactionPrecondition__PreconditionsAssignment_07684);
            rulePreconditionStatement();

            state._fsp--;

             after(grammarAccess.getTransactionPreconditionAccess().getPreconditionsPreconditionStatementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TransactionPrecondition__PreconditionsAssignment_0"


    // $ANTLR start "rule__TransactionPrecondition__LogicalOperatorAssignment_1_0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3838:1: rule__TransactionPrecondition__LogicalOperatorAssignment_1_0 : ( RULE_AND_OR ) ;
    public final void rule__TransactionPrecondition__LogicalOperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3842:1: ( ( RULE_AND_OR ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3843:1: ( RULE_AND_OR )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3843:1: ( RULE_AND_OR )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3844:1: RULE_AND_OR
            {
             before(grammarAccess.getTransactionPreconditionAccess().getLogicalOperatorAND_ORTerminalRuleCall_1_0_0()); 
            match(input,RULE_AND_OR,FOLLOW_RULE_AND_OR_in_rule__TransactionPrecondition__LogicalOperatorAssignment_1_07715); 
             after(grammarAccess.getTransactionPreconditionAccess().getLogicalOperatorAND_ORTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__TransactionPrecondition__LogicalOperatorAssignment_1_0"


    // $ANTLR start "rule__TransactionPrecondition__PreconditionsAssignment_1_1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3853:1: rule__TransactionPrecondition__PreconditionsAssignment_1_1 : ( rulePreconditionStatement ) ;
    public final void rule__TransactionPrecondition__PreconditionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3857:1: ( ( rulePreconditionStatement ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3858:1: ( rulePreconditionStatement )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3858:1: ( rulePreconditionStatement )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3859:1: rulePreconditionStatement
            {
             before(grammarAccess.getTransactionPreconditionAccess().getPreconditionsPreconditionStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePreconditionStatement_in_rule__TransactionPrecondition__PreconditionsAssignment_1_17746);
            rulePreconditionStatement();

            state._fsp--;

             after(grammarAccess.getTransactionPreconditionAccess().getPreconditionsPreconditionStatementParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__TransactionPrecondition__PreconditionsAssignment_1_1"


    // $ANTLR start "rule__StatePrecondition__VarAssignment_0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3868:1: rule__StatePrecondition__VarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StatePrecondition__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3872:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3873:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3873:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3874:1: ( RULE_ID )
            {
             before(grammarAccess.getStatePreconditionAccess().getVarStateVariableDeclarationCrossReference_0_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3875:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3876:1: RULE_ID
            {
             before(grammarAccess.getStatePreconditionAccess().getVarStateVariableDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StatePrecondition__VarAssignment_07781); 
             after(grammarAccess.getStatePreconditionAccess().getVarStateVariableDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getStatePreconditionAccess().getVarStateVariableDeclarationCrossReference_0_0()); 

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
    // $ANTLR end "rule__StatePrecondition__VarAssignment_0"


    // $ANTLR start "rule__StatePrecondition__ValueAssignment_2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3887:1: rule__StatePrecondition__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__StatePrecondition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3891:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3892:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3892:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3893:1: RULE_ID
            {
             before(grammarAccess.getStatePreconditionAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StatePrecondition__ValueAssignment_27816); 
             after(grammarAccess.getStatePreconditionAccess().getValueIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__StatePrecondition__ValueAssignment_2"


    // $ANTLR start "rule__BooleanPrecondition__VarAssignment_0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3902:1: rule__BooleanPrecondition__VarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BooleanPrecondition__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3906:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3907:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3907:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3908:1: ( RULE_ID )
            {
             before(grammarAccess.getBooleanPreconditionAccess().getVarBooleanDeclarionCrossReference_0_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3909:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3910:1: RULE_ID
            {
             before(grammarAccess.getBooleanPreconditionAccess().getVarBooleanDeclarionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BooleanPrecondition__VarAssignment_07851); 
             after(grammarAccess.getBooleanPreconditionAccess().getVarBooleanDeclarionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBooleanPreconditionAccess().getVarBooleanDeclarionCrossReference_0_0()); 

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
    // $ANTLR end "rule__BooleanPrecondition__VarAssignment_0"


    // $ANTLR start "rule__BooleanPrecondition__ValueAssignment_2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3921:1: rule__BooleanPrecondition__ValueAssignment_2 : ( ruleBOOL ) ;
    public final void rule__BooleanPrecondition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3925:1: ( ( ruleBOOL ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3926:1: ( ruleBOOL )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3926:1: ( ruleBOOL )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3927:1: ruleBOOL
            {
             before(grammarAccess.getBooleanPreconditionAccess().getValueBOOLParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBOOL_in_rule__BooleanPrecondition__ValueAssignment_27886);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getBooleanPreconditionAccess().getValueBOOLParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BooleanPrecondition__ValueAssignment_2"


    // $ANTLR start "rule__IntegerPrecondition__VarAssignment_0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3936:1: rule__IntegerPrecondition__VarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__IntegerPrecondition__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3940:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3941:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3941:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3942:1: ( RULE_ID )
            {
             before(grammarAccess.getIntegerPreconditionAccess().getVarIntegerDeclarionCrossReference_0_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3943:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3944:1: RULE_ID
            {
             before(grammarAccess.getIntegerPreconditionAccess().getVarIntegerDeclarionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerPrecondition__VarAssignment_07921); 
             after(grammarAccess.getIntegerPreconditionAccess().getVarIntegerDeclarionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getIntegerPreconditionAccess().getVarIntegerDeclarionCrossReference_0_0()); 

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
    // $ANTLR end "rule__IntegerPrecondition__VarAssignment_0"


    // $ANTLR start "rule__IntegerPrecondition__ValueAssignment_2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3955:1: rule__IntegerPrecondition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__IntegerPrecondition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3959:1: ( ( RULE_INT ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3960:1: ( RULE_INT )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3960:1: ( RULE_INT )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3961:1: RULE_INT
            {
             before(grammarAccess.getIntegerPreconditionAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerPrecondition__ValueAssignment_27956); 
             after(grammarAccess.getIntegerPreconditionAccess().getValueINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__IntegerPrecondition__ValueAssignment_2"


    // $ANTLR start "rule__PostTransaction__PostTransactionsAssignment_0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3970:1: rule__PostTransaction__PostTransactionsAssignment_0 : ( rulePostTransactionStatement ) ;
    public final void rule__PostTransaction__PostTransactionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3974:1: ( ( rulePostTransactionStatement ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3975:1: ( rulePostTransactionStatement )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3975:1: ( rulePostTransactionStatement )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3976:1: rulePostTransactionStatement
            {
             before(grammarAccess.getPostTransactionAccess().getPostTransactionsPostTransactionStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePostTransactionStatement_in_rule__PostTransaction__PostTransactionsAssignment_07987);
            rulePostTransactionStatement();

            state._fsp--;

             after(grammarAccess.getPostTransactionAccess().getPostTransactionsPostTransactionStatementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__PostTransaction__PostTransactionsAssignment_0"


    // $ANTLR start "rule__PostTransaction__LogicalOperatorAssignment_1_0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3985:1: rule__PostTransaction__LogicalOperatorAssignment_1_0 : ( RULE_AND_OR ) ;
    public final void rule__PostTransaction__LogicalOperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3989:1: ( ( RULE_AND_OR ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3990:1: ( RULE_AND_OR )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3990:1: ( RULE_AND_OR )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:3991:1: RULE_AND_OR
            {
             before(grammarAccess.getPostTransactionAccess().getLogicalOperatorAND_ORTerminalRuleCall_1_0_0()); 
            match(input,RULE_AND_OR,FOLLOW_RULE_AND_OR_in_rule__PostTransaction__LogicalOperatorAssignment_1_08018); 
             after(grammarAccess.getPostTransactionAccess().getLogicalOperatorAND_ORTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__PostTransaction__LogicalOperatorAssignment_1_0"


    // $ANTLR start "rule__PostTransaction__PostTransactionsAssignment_1_1"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4000:1: rule__PostTransaction__PostTransactionsAssignment_1_1 : ( rulePostTransactionStatement ) ;
    public final void rule__PostTransaction__PostTransactionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4004:1: ( ( rulePostTransactionStatement ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4005:1: ( rulePostTransactionStatement )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4005:1: ( rulePostTransactionStatement )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4006:1: rulePostTransactionStatement
            {
             before(grammarAccess.getPostTransactionAccess().getPostTransactionsPostTransactionStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePostTransactionStatement_in_rule__PostTransaction__PostTransactionsAssignment_1_18049);
            rulePostTransactionStatement();

            state._fsp--;

             after(grammarAccess.getPostTransactionAccess().getPostTransactionsPostTransactionStatementParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PostTransaction__PostTransactionsAssignment_1_1"


    // $ANTLR start "rule__StatePostTransaction__VarAssignment_2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4015:1: rule__StatePostTransaction__VarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StatePostTransaction__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4019:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4020:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4020:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4021:1: ( RULE_ID )
            {
             before(grammarAccess.getStatePostTransactionAccess().getVarStateVariableDeclarationCrossReference_2_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4022:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4023:1: RULE_ID
            {
             before(grammarAccess.getStatePostTransactionAccess().getVarStateVariableDeclarationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StatePostTransaction__VarAssignment_28084); 
             after(grammarAccess.getStatePostTransactionAccess().getVarStateVariableDeclarationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStatePostTransactionAccess().getVarStateVariableDeclarationCrossReference_2_0()); 

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
    // $ANTLR end "rule__StatePostTransaction__VarAssignment_2"


    // $ANTLR start "rule__StatePostTransaction__ValueAssignment_5"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4034:1: rule__StatePostTransaction__ValueAssignment_5 : ( RULE_ID ) ;
    public final void rule__StatePostTransaction__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4038:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4039:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4039:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4040:1: RULE_ID
            {
             before(grammarAccess.getStatePostTransactionAccess().getValueIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StatePostTransaction__ValueAssignment_58119); 
             after(grammarAccess.getStatePostTransactionAccess().getValueIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__StatePostTransaction__ValueAssignment_5"


    // $ANTLR start "rule__BooleanPostTransaction__VarAssignment_2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4049:1: rule__BooleanPostTransaction__VarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BooleanPostTransaction__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4053:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4054:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4054:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4055:1: ( RULE_ID )
            {
             before(grammarAccess.getBooleanPostTransactionAccess().getVarBooleanDeclarionCrossReference_2_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4056:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4057:1: RULE_ID
            {
             before(grammarAccess.getBooleanPostTransactionAccess().getVarBooleanDeclarionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BooleanPostTransaction__VarAssignment_28154); 
             after(grammarAccess.getBooleanPostTransactionAccess().getVarBooleanDeclarionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBooleanPostTransactionAccess().getVarBooleanDeclarionCrossReference_2_0()); 

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
    // $ANTLR end "rule__BooleanPostTransaction__VarAssignment_2"


    // $ANTLR start "rule__BooleanPostTransaction__ValueAssignment_5"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4068:1: rule__BooleanPostTransaction__ValueAssignment_5 : ( ruleBOOL ) ;
    public final void rule__BooleanPostTransaction__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4072:1: ( ( ruleBOOL ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4073:1: ( ruleBOOL )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4073:1: ( ruleBOOL )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4074:1: ruleBOOL
            {
             before(grammarAccess.getBooleanPostTransactionAccess().getValueBOOLParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBOOL_in_rule__BooleanPostTransaction__ValueAssignment_58189);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getBooleanPostTransactionAccess().getValueBOOLParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__BooleanPostTransaction__ValueAssignment_5"


    // $ANTLR start "rule__IntegerPostTransaction__VarAssignment_2"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4083:1: rule__IntegerPostTransaction__VarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__IntegerPostTransaction__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4087:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4088:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4088:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4089:1: ( RULE_ID )
            {
             before(grammarAccess.getIntegerPostTransactionAccess().getVarIntegerDeclarionCrossReference_2_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4090:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4091:1: RULE_ID
            {
             before(grammarAccess.getIntegerPostTransactionAccess().getVarIntegerDeclarionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerPostTransaction__VarAssignment_28224); 
             after(grammarAccess.getIntegerPostTransactionAccess().getVarIntegerDeclarionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getIntegerPostTransactionAccess().getVarIntegerDeclarionCrossReference_2_0()); 

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
    // $ANTLR end "rule__IntegerPostTransaction__VarAssignment_2"


    // $ANTLR start "rule__IntegerPostTransaction__ValueAssignment_5"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4102:1: rule__IntegerPostTransaction__ValueAssignment_5 : ( RULE_INT ) ;
    public final void rule__IntegerPostTransaction__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4106:1: ( ( RULE_INT ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4107:1: ( RULE_INT )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4107:1: ( RULE_INT )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4108:1: RULE_INT
            {
             before(grammarAccess.getIntegerPostTransactionAccess().getValueINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerPostTransaction__ValueAssignment_58259); 
             after(grammarAccess.getIntegerPostTransactionAccess().getValueINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__IntegerPostTransaction__ValueAssignment_5"


    // $ANTLR start "rule__ConditionalPostTRansaction__NameAssignment"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4117:1: rule__ConditionalPostTRansaction__NameAssignment : ( RULE_ID ) ;
    public final void rule__ConditionalPostTRansaction__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4121:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4122:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4122:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4123:1: RULE_ID
            {
             before(grammarAccess.getConditionalPostTRansactionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConditionalPostTRansaction__NameAssignment8290); 
             after(grammarAccess.getConditionalPostTRansactionAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ConditionalPostTRansaction__NameAssignment"


    // $ANTLR start "rule__IntegerDeclarion__NameAssignment_0"
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4132:1: rule__IntegerDeclarion__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IntegerDeclarion__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4136:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4137:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4137:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4138:1: RULE_ID
            {
             before(grammarAccess.getIntegerDeclarionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerDeclarion__NameAssignment_08321); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4147:1: rule__BooleanDeclarion__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BooleanDeclarion__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4151:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4152:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4152:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4153:1: RULE_ID
            {
             before(grammarAccess.getBooleanDeclarionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BooleanDeclarion__NameAssignment_08352); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4162:1: rule__StateVariableDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__StateVariableDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4166:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4167:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4167:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4168:1: RULE_ID
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__NameAssignment_08383); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4177:1: rule__StateVariableDeclaration__StatesAssignment_3 : ( RULE_ID ) ;
    public final void rule__StateVariableDeclaration__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4181:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4182:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4182:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4183:1: RULE_ID
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getStatesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__StatesAssignment_38414); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4192:1: rule__StateVariableDeclaration__StatesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__StateVariableDeclaration__StatesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4196:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4197:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4197:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4198:1: RULE_ID
            {
             before(grammarAccess.getStateVariableDeclarationAccess().getStatesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__StatesAssignment_4_18445); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4207:1: rule__BooleanAssignment__VarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BooleanAssignment__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4211:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4212:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4212:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4213:1: ( RULE_ID )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getVarBooleanDeclarionCrossReference_2_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4214:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4215:1: RULE_ID
            {
             before(grammarAccess.getBooleanAssignmentAccess().getVarBooleanDeclarionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BooleanAssignment__VarAssignment_28480); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4226:1: rule__BooleanAssignment__ValueAssignment_5 : ( ruleBOOL ) ;
    public final void rule__BooleanAssignment__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4230:1: ( ( ruleBOOL ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4231:1: ( ruleBOOL )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4231:1: ( ruleBOOL )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4232:1: ruleBOOL
            {
             before(grammarAccess.getBooleanAssignmentAccess().getValueBOOLParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBOOL_in_rule__BooleanAssignment__ValueAssignment_58515);
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4241:1: rule__IntegerAssignment__VarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__IntegerAssignment__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4245:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4246:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4246:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4247:1: ( RULE_ID )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getVarIntegerDeclarionCrossReference_2_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4248:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4249:1: RULE_ID
            {
             before(grammarAccess.getIntegerAssignmentAccess().getVarIntegerDeclarionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntegerAssignment__VarAssignment_28550); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4260:1: rule__IntegerAssignment__ValueAssignment_5 : ( RULE_INT ) ;
    public final void rule__IntegerAssignment__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4264:1: ( ( RULE_INT ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4265:1: ( RULE_INT )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4265:1: ( RULE_INT )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4266:1: RULE_INT
            {
             before(grammarAccess.getIntegerAssignmentAccess().getValueINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerAssignment__ValueAssignment_58585); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4275:1: rule__StateAssignment__VarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StateAssignment__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4279:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4280:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4280:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4281:1: ( RULE_ID )
            {
             before(grammarAccess.getStateAssignmentAccess().getVarStateVariableDeclarationCrossReference_2_0()); 
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4282:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4283:1: RULE_ID
            {
             before(grammarAccess.getStateAssignmentAccess().getVarStateVariableDeclarationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateAssignment__VarAssignment_28620); 
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
    // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4294:1: rule__StateAssignment__ValueAssignment_5 : ( RULE_ID ) ;
    public final void rule__StateAssignment__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4298:1: ( ( RULE_ID ) )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4299:1: ( RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4299:1: ( RULE_ID )
            // ../org.xtext.osy.extendedsmv.ui/src-gen/org/xtext/osy/ui/contentassist/antlr/internal/InternalExtendedSMV.g:4300:1: RULE_ID
            {
             before(grammarAccess.getStateAssignmentAccess().getValueIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateAssignment__ValueAssignment_58655); 
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


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\4\1\25\1\uffff\1\6\1\26\1\37\1\6\3\uffff";
    static final String DFA7_maxS =
        "\1\36\1\25\1\uffff\1\6\1\26\1\37\1\16\3\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\4\4\uffff\1\3\1\1\1\2";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\31\uffff\1\1",
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "990:1: rule__AssignmentExpression__Alternatives : ( ( ruleIntegerAssignment ) | ( ruleBooleanAssignment ) | ( ruleStateAssignment ) | ( ruleComment ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SectionsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000038002L});
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
    public static final BitSet FOLLOW_ruleTransactions_in_entryRuleTransactions362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactions369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__0_in_ruleTransactions395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactionStatement_in_entryRuleTransactionStatement422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactionStatement429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransactionStatement__Group__0_in_ruleTransactionStatement455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactionPrecondition_in_entryRuleTransactionPrecondition482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactionPrecondition489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransactionPrecondition__Group__0_in_ruleTransactionPrecondition515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreconditionStatement_in_entryRulePreconditionStatement542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreconditionStatement549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PreconditionStatement__Alternatives_in_rulePreconditionStatement575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatePrecondition_in_entryRuleStatePrecondition602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatePrecondition609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePrecondition__Group__0_in_ruleStatePrecondition635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanPrecondition_in_entryRuleBooleanPrecondition662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanPrecondition669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPrecondition__Group__0_in_ruleBooleanPrecondition695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerPrecondition_in_entryRuleIntegerPrecondition722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerPrecondition729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPrecondition__Group__0_in_ruleIntegerPrecondition755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostTransaction_in_entryRulePostTransaction782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostTransaction789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostTransaction__Group__0_in_rulePostTransaction815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostTransactionStatement_in_entryRulePostTransactionStatement842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostTransactionStatement849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostTransactionStatement__Alternatives_in_rulePostTransactionStatement875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimplePostTransaction_in_entryRuleSimplePostTransaction902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimplePostTransaction909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimplePostTransaction__Alternatives_in_ruleSimplePostTransaction935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatePostTransaction_in_entryRuleStatePostTransaction962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatePostTransaction969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__Group__0_in_ruleStatePostTransaction995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanPostTransaction_in_entryRuleBooleanPostTransaction1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanPostTransaction1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__Group__0_in_ruleBooleanPostTransaction1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerPostTransaction_in_entryRuleIntegerPostTransaction1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerPostTransaction1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__Group__0_in_ruleIntegerPostTransaction1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalPostTRansaction_in_entryRuleConditionalPostTRansaction1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalPostTRansaction1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalPostTRansaction__NameAssignment_in_ruleConditionalPostTRansaction1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Alternatives_in_ruleVariableDeclaration1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDeclarion_in_entryRuleIntegerDeclarion1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerDeclarion1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__0_in_ruleIntegerDeclarion1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDeclarion_in_entryRuleBooleanDeclarion1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanDeclarion1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__0_in_ruleBooleanDeclarion1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateVariableDeclaration1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__0_in_ruleStateVariableDeclaration1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentExpression__Alternatives_in_ruleAssignmentExpression1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAssignment1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__0_in_ruleBooleanAssignment1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerAssignment1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__0_in_ruleIntegerAssignment1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAssignment_in_entryRuleStateAssignment1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateAssignment1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__0_in_ruleStateAssignment1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesSection_in_rule__Section__Alternatives1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignments_in_rule__Section__Alternatives1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactions_in_rule__Section__Alternatives1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerPrecondition_in_rule__PreconditionStatement__Alternatives1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanPrecondition_in_rule__PreconditionStatement__Alternatives1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatePrecondition_in_rule__PreconditionStatement__Alternatives1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__PreconditionStatement__Alternatives1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalPostTRansaction_in_rule__PostTransactionStatement__Alternatives1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimplePostTransaction_in_rule__PostTransactionStatement__Alternatives1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerPostTransaction_in_rule__SimplePostTransaction__Alternatives1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanPostTransaction_in_rule__SimplePostTransaction__Alternatives1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatePostTransaction_in_rule__SimplePostTransaction__Alternatives1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDeclarion_in_rule__VariableDeclaration__Alternatives2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDeclarion_in_rule__VariableDeclaration__Alternatives2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_rule__VariableDeclaration__Alternatives2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__VariableDeclaration__Alternatives2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAssignment_in_rule__AssignmentExpression__Alternatives2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAssignment_in_rule__AssignmentExpression__Alternatives2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAssignment_in_rule__AssignmentExpression__Alternatives2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__AssignmentExpression__Alternatives2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BOOL__Alternatives2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BOOL__Alternatives2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesSection__Group__0__Impl_in_rule__VariablesSection__Group__02234 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__VariablesSection__Group__1_in_rule__VariablesSection__Group__02237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VariablesSection__Group__0__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesSection__Group__1__Impl_in_rule__VariablesSection__Group__12296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesSection__VariablesAssignment_1_in_rule__VariablesSection__Group__1__Impl2325 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__VariablesSection__VariablesAssignment_1_in_rule__VariablesSection__Group__1__Impl2337 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Assignments__Group__0__Impl_in_rule__Assignments__Group__02374 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Assignments__Group__1_in_rule__Assignments__Group__02377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignments__Group__1__Impl_in_rule__Assignments__Group__12435 = new BitSet(new long[]{0x0000000040000050L});
    public static final BitSet FOLLOW_rule__Assignments__Group__2_in_rule__Assignments__Group__12438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Assignments__Group__1__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignments__Group__2__Impl_in_rule__Assignments__Group__22497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignments__AssignmentsAssignment_2_in_rule__Assignments__Group__2__Impl2526 = new BitSet(new long[]{0x0000000040000052L});
    public static final BitSet FOLLOW_rule__Assignments__AssignmentsAssignment_2_in_rule__Assignments__Group__2__Impl2538 = new BitSet(new long[]{0x0000000040000052L});
    public static final BitSet FOLLOW_rule__Transactions__Group__0__Impl_in_rule__Transactions__Group__02577 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Transactions__Group__1_in_rule__Transactions__Group__02580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Transactions__Group__0__Impl2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__Group__1__Impl_in_rule__Transactions__Group__12639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transactions__TransactionAssignment_1_in_rule__Transactions__Group__1__Impl2668 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Transactions__TransactionAssignment_1_in_rule__Transactions__Group__1__Impl2680 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__TransactionStatement__Group__0__Impl_in_rule__TransactionStatement__Group__02717 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TransactionStatement__Group__1_in_rule__TransactionStatement__Group__02720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransactionStatement__PreconditionAssignment_0_in_rule__TransactionStatement__Group__0__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransactionStatement__Group__1__Impl_in_rule__TransactionStatement__Group__12777 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_rule__TransactionStatement__Group__2_in_rule__TransactionStatement__Group__12780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TransactionStatement__Group__1__Impl2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransactionStatement__Group__2__Impl_in_rule__TransactionStatement__Group__22839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransactionStatement__PostTransactionAssignment_2_in_rule__TransactionStatement__Group__2__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransactionPrecondition__Group__0__Impl_in_rule__TransactionPrecondition__Group__02902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TransactionPrecondition__Group__1_in_rule__TransactionPrecondition__Group__02905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransactionPrecondition__PreconditionsAssignment_0_in_rule__TransactionPrecondition__Group__0__Impl2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransactionPrecondition__Group__1__Impl_in_rule__TransactionPrecondition__Group__12962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransactionPrecondition__Group_1__0_in_rule__TransactionPrecondition__Group__1__Impl2989 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__TransactionPrecondition__Group_1__0__Impl_in_rule__TransactionPrecondition__Group_1__03024 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__TransactionPrecondition__Group_1__1_in_rule__TransactionPrecondition__Group_1__03027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransactionPrecondition__LogicalOperatorAssignment_1_0_in_rule__TransactionPrecondition__Group_1__0__Impl3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransactionPrecondition__Group_1__1__Impl_in_rule__TransactionPrecondition__Group_1__13084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransactionPrecondition__PreconditionsAssignment_1_1_in_rule__TransactionPrecondition__Group_1__1__Impl3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePrecondition__Group__0__Impl_in_rule__StatePrecondition__Group__03145 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StatePrecondition__Group__1_in_rule__StatePrecondition__Group__03148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePrecondition__VarAssignment_0_in_rule__StatePrecondition__Group__0__Impl3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePrecondition__Group__1__Impl_in_rule__StatePrecondition__Group__13205 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StatePrecondition__Group__2_in_rule__StatePrecondition__Group__13208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StatePrecondition__Group__1__Impl3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePrecondition__Group__2__Impl_in_rule__StatePrecondition__Group__23267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePrecondition__ValueAssignment_2_in_rule__StatePrecondition__Group__2__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPrecondition__Group__0__Impl_in_rule__BooleanPrecondition__Group__03330 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BooleanPrecondition__Group__1_in_rule__BooleanPrecondition__Group__03333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPrecondition__VarAssignment_0_in_rule__BooleanPrecondition__Group__0__Impl3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPrecondition__Group__1__Impl_in_rule__BooleanPrecondition__Group__13390 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__BooleanPrecondition__Group__2_in_rule__BooleanPrecondition__Group__13393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BooleanPrecondition__Group__1__Impl3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPrecondition__Group__2__Impl_in_rule__BooleanPrecondition__Group__23452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPrecondition__ValueAssignment_2_in_rule__BooleanPrecondition__Group__2__Impl3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPrecondition__Group__0__Impl_in_rule__IntegerPrecondition__Group__03515 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__IntegerPrecondition__Group__1_in_rule__IntegerPrecondition__Group__03518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPrecondition__VarAssignment_0_in_rule__IntegerPrecondition__Group__0__Impl3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPrecondition__Group__1__Impl_in_rule__IntegerPrecondition__Group__13575 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IntegerPrecondition__Group__2_in_rule__IntegerPrecondition__Group__13578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__IntegerPrecondition__Group__1__Impl3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPrecondition__Group__2__Impl_in_rule__IntegerPrecondition__Group__23637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPrecondition__ValueAssignment_2_in_rule__IntegerPrecondition__Group__2__Impl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostTransaction__Group__0__Impl_in_rule__PostTransaction__Group__03700 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PostTransaction__Group__1_in_rule__PostTransaction__Group__03703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostTransaction__PostTransactionsAssignment_0_in_rule__PostTransaction__Group__0__Impl3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostTransaction__Group__1__Impl_in_rule__PostTransaction__Group__13760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostTransaction__Group_1__0_in_rule__PostTransaction__Group__1__Impl3787 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__PostTransaction__Group_1__0__Impl_in_rule__PostTransaction__Group_1__03822 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_rule__PostTransaction__Group_1__1_in_rule__PostTransaction__Group_1__03825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostTransaction__LogicalOperatorAssignment_1_0_in_rule__PostTransaction__Group_1__0__Impl3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostTransaction__Group_1__1__Impl_in_rule__PostTransaction__Group_1__13882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostTransaction__PostTransactionsAssignment_1_1_in_rule__PostTransaction__Group_1__1__Impl3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__Group__0__Impl_in_rule__StatePostTransaction__Group__03943 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__Group__1_in_rule__StatePostTransaction__Group__03946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StatePostTransaction__Group__0__Impl3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__Group__1__Impl_in_rule__StatePostTransaction__Group__14005 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__Group__2_in_rule__StatePostTransaction__Group__14008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StatePostTransaction__Group__1__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__Group__2__Impl_in_rule__StatePostTransaction__Group__24067 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__Group__3_in_rule__StatePostTransaction__Group__24070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__VarAssignment_2_in_rule__StatePostTransaction__Group__2__Impl4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__Group__3__Impl_in_rule__StatePostTransaction__Group__34127 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__Group__4_in_rule__StatePostTransaction__Group__34130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StatePostTransaction__Group__3__Impl4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__Group__4__Impl_in_rule__StatePostTransaction__Group__44189 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__Group__5_in_rule__StatePostTransaction__Group__44192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StatePostTransaction__Group__4__Impl4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__Group__5__Impl_in_rule__StatePostTransaction__Group__54251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatePostTransaction__ValueAssignment_5_in_rule__StatePostTransaction__Group__5__Impl4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__Group__0__Impl_in_rule__BooleanPostTransaction__Group__04320 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__Group__1_in_rule__BooleanPostTransaction__Group__04323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BooleanPostTransaction__Group__0__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__Group__1__Impl_in_rule__BooleanPostTransaction__Group__14382 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__Group__2_in_rule__BooleanPostTransaction__Group__14385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BooleanPostTransaction__Group__1__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__Group__2__Impl_in_rule__BooleanPostTransaction__Group__24444 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__Group__3_in_rule__BooleanPostTransaction__Group__24447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__VarAssignment_2_in_rule__BooleanPostTransaction__Group__2__Impl4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__Group__3__Impl_in_rule__BooleanPostTransaction__Group__34504 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__Group__4_in_rule__BooleanPostTransaction__Group__34507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BooleanPostTransaction__Group__3__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__Group__4__Impl_in_rule__BooleanPostTransaction__Group__44566 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__Group__5_in_rule__BooleanPostTransaction__Group__44569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BooleanPostTransaction__Group__4__Impl4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__Group__5__Impl_in_rule__BooleanPostTransaction__Group__54628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanPostTransaction__ValueAssignment_5_in_rule__BooleanPostTransaction__Group__5__Impl4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__Group__0__Impl_in_rule__IntegerPostTransaction__Group__04697 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__Group__1_in_rule__IntegerPostTransaction__Group__04700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__IntegerPostTransaction__Group__0__Impl4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__Group__1__Impl_in_rule__IntegerPostTransaction__Group__14759 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__Group__2_in_rule__IntegerPostTransaction__Group__14762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__IntegerPostTransaction__Group__1__Impl4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__Group__2__Impl_in_rule__IntegerPostTransaction__Group__24821 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__Group__3_in_rule__IntegerPostTransaction__Group__24824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__VarAssignment_2_in_rule__IntegerPostTransaction__Group__2__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__Group__3__Impl_in_rule__IntegerPostTransaction__Group__34881 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__Group__4_in_rule__IntegerPostTransaction__Group__34884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IntegerPostTransaction__Group__3__Impl4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__Group__4__Impl_in_rule__IntegerPostTransaction__Group__44943 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__Group__5_in_rule__IntegerPostTransaction__Group__44946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__IntegerPostTransaction__Group__4__Impl4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__Group__5__Impl_in_rule__IntegerPostTransaction__Group__55005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerPostTransaction__ValueAssignment_5_in_rule__IntegerPostTransaction__Group__5__Impl5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__0__Impl_in_rule__IntegerDeclarion__Group__05074 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__1_in_rule__IntegerDeclarion__Group__05077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__NameAssignment_0_in_rule__IntegerDeclarion__Group__0__Impl5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__1__Impl_in_rule__IntegerDeclarion__Group__15134 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__2_in_rule__IntegerDeclarion__Group__15137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IntegerDeclarion__Group__1__Impl5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__2__Impl_in_rule__IntegerDeclarion__Group__25196 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__3_in_rule__IntegerDeclarion__Group__25199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IntegerDeclarion__Group__2__Impl5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDeclarion__Group__3__Impl_in_rule__IntegerDeclarion__Group__35258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IntegerDeclarion__Group__3__Impl5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__0__Impl_in_rule__BooleanDeclarion__Group__05325 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__1_in_rule__BooleanDeclarion__Group__05328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__NameAssignment_0_in_rule__BooleanDeclarion__Group__0__Impl5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__1__Impl_in_rule__BooleanDeclarion__Group__15385 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__2_in_rule__BooleanDeclarion__Group__15388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BooleanDeclarion__Group__1__Impl5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__2__Impl_in_rule__BooleanDeclarion__Group__25447 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__3_in_rule__BooleanDeclarion__Group__25450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BooleanDeclarion__Group__2__Impl5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanDeclarion__Group__3__Impl_in_rule__BooleanDeclarion__Group__35509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BooleanDeclarion__Group__3__Impl5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__0__Impl_in_rule__StateVariableDeclaration__Group__05576 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__1_in_rule__StateVariableDeclaration__Group__05579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__NameAssignment_0_in_rule__StateVariableDeclaration__Group__0__Impl5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__1__Impl_in_rule__StateVariableDeclaration__Group__15636 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__2_in_rule__StateVariableDeclaration__Group__15639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StateVariableDeclaration__Group__1__Impl5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__2__Impl_in_rule__StateVariableDeclaration__Group__25698 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__3_in_rule__StateVariableDeclaration__Group__25701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StateVariableDeclaration__Group__2__Impl5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__3__Impl_in_rule__StateVariableDeclaration__Group__35760 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__4_in_rule__StateVariableDeclaration__Group__35763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__StatesAssignment_3_in_rule__StateVariableDeclaration__Group__3__Impl5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__4__Impl_in_rule__StateVariableDeclaration__Group__45820 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__5_in_rule__StateVariableDeclaration__Group__45823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group_4__0_in_rule__StateVariableDeclaration__Group__4__Impl5850 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__5__Impl_in_rule__StateVariableDeclaration__Group__55881 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__6_in_rule__StateVariableDeclaration__Group__55884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StateVariableDeclaration__Group__5__Impl5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group__6__Impl_in_rule__StateVariableDeclaration__Group__65943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StateVariableDeclaration__Group__6__Impl5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group_4__0__Impl_in_rule__StateVariableDeclaration__Group_4__06016 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group_4__1_in_rule__StateVariableDeclaration__Group_4__06019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StateVariableDeclaration__Group_4__0__Impl6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__Group_4__1__Impl_in_rule__StateVariableDeclaration__Group_4__16078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateVariableDeclaration__StatesAssignment_4_1_in_rule__StateVariableDeclaration__Group_4__1__Impl6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__0__Impl_in_rule__BooleanAssignment__Group__06139 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__1_in_rule__BooleanAssignment__Group__06142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BooleanAssignment__Group__0__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__1__Impl_in_rule__BooleanAssignment__Group__16201 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__2_in_rule__BooleanAssignment__Group__16204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BooleanAssignment__Group__1__Impl6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__2__Impl_in_rule__BooleanAssignment__Group__26263 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__3_in_rule__BooleanAssignment__Group__26266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__VarAssignment_2_in_rule__BooleanAssignment__Group__2__Impl6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__3__Impl_in_rule__BooleanAssignment__Group__36323 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__4_in_rule__BooleanAssignment__Group__36326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BooleanAssignment__Group__3__Impl6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__4__Impl_in_rule__BooleanAssignment__Group__46385 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__5_in_rule__BooleanAssignment__Group__46388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__BooleanAssignment__Group__4__Impl6416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__5__Impl_in_rule__BooleanAssignment__Group__56447 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__6_in_rule__BooleanAssignment__Group__56450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__ValueAssignment_5_in_rule__BooleanAssignment__Group__5__Impl6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanAssignment__Group__6__Impl_in_rule__BooleanAssignment__Group__66507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BooleanAssignment__Group__6__Impl6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__0__Impl_in_rule__IntegerAssignment__Group__06580 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__1_in_rule__IntegerAssignment__Group__06583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__IntegerAssignment__Group__0__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__1__Impl_in_rule__IntegerAssignment__Group__16642 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__2_in_rule__IntegerAssignment__Group__16645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__IntegerAssignment__Group__1__Impl6673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__2__Impl_in_rule__IntegerAssignment__Group__26704 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__3_in_rule__IntegerAssignment__Group__26707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__VarAssignment_2_in_rule__IntegerAssignment__Group__2__Impl6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__3__Impl_in_rule__IntegerAssignment__Group__36764 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__4_in_rule__IntegerAssignment__Group__36767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IntegerAssignment__Group__3__Impl6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__4__Impl_in_rule__IntegerAssignment__Group__46826 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__5_in_rule__IntegerAssignment__Group__46829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__IntegerAssignment__Group__4__Impl6857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__5__Impl_in_rule__IntegerAssignment__Group__56888 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__6_in_rule__IntegerAssignment__Group__56891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__ValueAssignment_5_in_rule__IntegerAssignment__Group__5__Impl6918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerAssignment__Group__6__Impl_in_rule__IntegerAssignment__Group__66948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IntegerAssignment__Group__6__Impl6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__0__Impl_in_rule__StateAssignment__Group__07021 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__1_in_rule__StateAssignment__Group__07024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StateAssignment__Group__0__Impl7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__1__Impl_in_rule__StateAssignment__Group__17083 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__2_in_rule__StateAssignment__Group__17086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StateAssignment__Group__1__Impl7114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__2__Impl_in_rule__StateAssignment__Group__27145 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__3_in_rule__StateAssignment__Group__27148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__VarAssignment_2_in_rule__StateAssignment__Group__2__Impl7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__3__Impl_in_rule__StateAssignment__Group__37205 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__4_in_rule__StateAssignment__Group__37208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StateAssignment__Group__3__Impl7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__4__Impl_in_rule__StateAssignment__Group__47267 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__5_in_rule__StateAssignment__Group__47270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__StateAssignment__Group__4__Impl7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__5__Impl_in_rule__StateAssignment__Group__57329 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__6_in_rule__StateAssignment__Group__57332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__ValueAssignment_5_in_rule__StateAssignment__Group__5__Impl7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateAssignment__Group__6__Impl_in_rule__StateAssignment__Group__67389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StateAssignment__Group__6__Impl7417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__Model__SectionsAssignment7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMV_COMMENT_in_rule__Comment__CommentAssignment7498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__VariablesSection__VariablesAssignment_17529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_rule__Assignments__AssignmentsAssignment_27560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactionStatement_in_rule__Transactions__TransactionAssignment_17591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactionPrecondition_in_rule__TransactionStatement__PreconditionAssignment_07622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostTransaction_in_rule__TransactionStatement__PostTransactionAssignment_27653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreconditionStatement_in_rule__TransactionPrecondition__PreconditionsAssignment_07684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_OR_in_rule__TransactionPrecondition__LogicalOperatorAssignment_1_07715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreconditionStatement_in_rule__TransactionPrecondition__PreconditionsAssignment_1_17746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StatePrecondition__VarAssignment_07781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StatePrecondition__ValueAssignment_27816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanPrecondition__VarAssignment_07851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__BooleanPrecondition__ValueAssignment_27886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerPrecondition__VarAssignment_07921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerPrecondition__ValueAssignment_27956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostTransactionStatement_in_rule__PostTransaction__PostTransactionsAssignment_07987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_OR_in_rule__PostTransaction__LogicalOperatorAssignment_1_08018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostTransactionStatement_in_rule__PostTransaction__PostTransactionsAssignment_1_18049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StatePostTransaction__VarAssignment_28084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StatePostTransaction__ValueAssignment_58119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanPostTransaction__VarAssignment_28154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__BooleanPostTransaction__ValueAssignment_58189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerPostTransaction__VarAssignment_28224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerPostTransaction__ValueAssignment_58259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConditionalPostTRansaction__NameAssignment8290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerDeclarion__NameAssignment_08321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanDeclarion__NameAssignment_08352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__NameAssignment_08383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__StatesAssignment_38414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateVariableDeclaration__StatesAssignment_4_18445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanAssignment__VarAssignment_28480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__BooleanAssignment__ValueAssignment_58515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerAssignment__VarAssignment_28550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerAssignment__ValueAssignment_58585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateAssignment__VarAssignment_28620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateAssignment__ValueAssignment_58655 = new BitSet(new long[]{0x0000000000000002L});

}