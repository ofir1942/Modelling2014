package org.xtext.osy.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.osy.services.ExtendedSMVGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExtendedSMVParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SMV_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VAR'", "'ASSIGN'", "':'", "'integer'", "';'", "'boolean'", "'{'", "','", "'}'", "'init'", "'('", "')'", "':='", "'True'", "'False'"
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
    public String getGrammarFileName() { return "../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g"; }



     	private ExtendedSMVGrammarAccess grammarAccess;
     	
        public InternalExtendedSMVParser(TokenStream input, ExtendedSMVGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ExtendedSMVGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:76:1: ruleModel returns [EObject current=null] : ( (lv_sections_0_0= ruleSection ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_sections_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:79:28: ( ( (lv_sections_0_0= ruleSection ) )* )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:80:1: ( (lv_sections_0_0= ruleSection ) )*
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:80:1: ( (lv_sections_0_0= ruleSection ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:81:1: (lv_sections_0_0= ruleSection )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:81:1: (lv_sections_0_0= ruleSection )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:82:3: lv_sections_0_0= ruleSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSectionsSectionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSection_in_ruleModel130);
            	    lv_sections_0_0=ruleSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_0_0, 
            	            		"Section");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSection"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:106:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:107:2: (iv_ruleSection= ruleSection EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:108:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection166);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:115:1: ruleSection returns [EObject current=null] : (this_VariablesSection_0= ruleVariablesSection | this_Assignments_1= ruleAssignments ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        EObject this_VariablesSection_0 = null;

        EObject this_Assignments_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:118:28: ( (this_VariablesSection_0= ruleVariablesSection | this_Assignments_1= ruleAssignments ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:119:1: (this_VariablesSection_0= ruleVariablesSection | this_Assignments_1= ruleAssignments )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:119:1: (this_VariablesSection_0= ruleVariablesSection | this_Assignments_1= ruleAssignments )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:120:5: this_VariablesSection_0= ruleVariablesSection
                    {
                     
                            newCompositeNode(grammarAccess.getSectionAccess().getVariablesSectionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariablesSection_in_ruleSection223);
                    this_VariablesSection_0=ruleVariablesSection();

                    state._fsp--;

                     
                            current = this_VariablesSection_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:130:5: this_Assignments_1= ruleAssignments
                    {
                     
                            newCompositeNode(grammarAccess.getSectionAccess().getAssignmentsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAssignments_in_ruleSection250);
                    this_Assignments_1=ruleAssignments();

                    state._fsp--;

                     
                            current = this_Assignments_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleComment"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:146:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:147:2: (iv_ruleComment= ruleComment EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:148:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment285);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment295); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:155:1: ruleComment returns [EObject current=null] : ( (lv_comment_0_0= RULE_SMV_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:158:28: ( ( (lv_comment_0_0= RULE_SMV_COMMENT ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:159:1: ( (lv_comment_0_0= RULE_SMV_COMMENT ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:159:1: ( (lv_comment_0_0= RULE_SMV_COMMENT ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:160:1: (lv_comment_0_0= RULE_SMV_COMMENT )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:160:1: (lv_comment_0_0= RULE_SMV_COMMENT )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:161:3: lv_comment_0_0= RULE_SMV_COMMENT
            {
            lv_comment_0_0=(Token)match(input,RULE_SMV_COMMENT,FOLLOW_RULE_SMV_COMMENT_in_ruleComment336); 

            			newLeafNode(lv_comment_0_0, grammarAccess.getCommentAccess().getCommentSMV_COMMENTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"comment",
                    		lv_comment_0_0, 
                    		"SMV_COMMENT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleVariablesSection"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:185:1: entryRuleVariablesSection returns [EObject current=null] : iv_ruleVariablesSection= ruleVariablesSection EOF ;
    public final EObject entryRuleVariablesSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesSection = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:186:2: (iv_ruleVariablesSection= ruleVariablesSection EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:187:2: iv_ruleVariablesSection= ruleVariablesSection EOF
            {
             newCompositeNode(grammarAccess.getVariablesSectionRule()); 
            pushFollow(FOLLOW_ruleVariablesSection_in_entryRuleVariablesSection376);
            iv_ruleVariablesSection=ruleVariablesSection();

            state._fsp--;

             current =iv_ruleVariablesSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablesSection386); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariablesSection"


    // $ANTLR start "ruleVariablesSection"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:194:1: ruleVariablesSection returns [EObject current=null] : (otherlv_0= 'VAR' ( (lv_variables_1_0= ruleVariableDeclaration ) )+ ) ;
    public final EObject ruleVariablesSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_variables_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:197:28: ( (otherlv_0= 'VAR' ( (lv_variables_1_0= ruleVariableDeclaration ) )+ ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:198:1: (otherlv_0= 'VAR' ( (lv_variables_1_0= ruleVariableDeclaration ) )+ )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:198:1: (otherlv_0= 'VAR' ( (lv_variables_1_0= ruleVariableDeclaration ) )+ )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:198:3: otherlv_0= 'VAR' ( (lv_variables_1_0= ruleVariableDeclaration ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleVariablesSection423); 

                	newLeafNode(otherlv_0, grammarAccess.getVariablesSectionAccess().getVARKeyword_0());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:202:1: ( (lv_variables_1_0= ruleVariableDeclaration ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_SMV_COMMENT && LA3_0<=RULE_ID)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:203:1: (lv_variables_1_0= ruleVariableDeclaration )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:203:1: (lv_variables_1_0= ruleVariableDeclaration )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:204:3: lv_variables_1_0= ruleVariableDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariablesSectionAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariablesSection444);
            	    lv_variables_1_0=ruleVariableDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariablesSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_1_0, 
            	            		"VariableDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariablesSection"


    // $ANTLR start "entryRuleAssignments"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:228:1: entryRuleAssignments returns [EObject current=null] : iv_ruleAssignments= ruleAssignments EOF ;
    public final EObject entryRuleAssignments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignments = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:229:2: (iv_ruleAssignments= ruleAssignments EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:230:2: iv_ruleAssignments= ruleAssignments EOF
            {
             newCompositeNode(grammarAccess.getAssignmentsRule()); 
            pushFollow(FOLLOW_ruleAssignments_in_entryRuleAssignments481);
            iv_ruleAssignments=ruleAssignments();

            state._fsp--;

             current =iv_ruleAssignments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignments491); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignments"


    // $ANTLR start "ruleAssignments"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:237:1: ruleAssignments returns [EObject current=null] : ( () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+ ) ;
    public final EObject ruleAssignments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_assignments_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:240:28: ( ( () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+ ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:241:1: ( () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+ )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:241:1: ( () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+ )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:241:2: () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:241:2: ()
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:242:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssignmentsAccess().getAssignmentsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleAssignments537); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentsAccess().getASSIGNKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:251:1: ( (lv_assignments_2_0= ruleAssignmentExpression ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_SMV_COMMENT||LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:252:1: (lv_assignments_2_0= ruleAssignmentExpression )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:252:1: (lv_assignments_2_0= ruleAssignmentExpression )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:253:3: lv_assignments_2_0= ruleAssignmentExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssignmentsAccess().getAssignmentsAssignmentExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleAssignments558);
            	    lv_assignments_2_0=ruleAssignmentExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssignmentsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assignments",
            	            		lv_assignments_2_0, 
            	            		"AssignmentExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignments"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:277:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:278:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:279:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration595);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration605); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:286:1: ruleVariableDeclaration returns [EObject current=null] : (this_IntegerDeclarion_0= ruleIntegerDeclarion | this_BooleanDeclarion_1= ruleBooleanDeclarion | this_StateVariableDeclaration_2= ruleStateVariableDeclaration | this_Comment_3= ruleComment ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerDeclarion_0 = null;

        EObject this_BooleanDeclarion_1 = null;

        EObject this_StateVariableDeclaration_2 = null;

        EObject this_Comment_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:289:28: ( (this_IntegerDeclarion_0= ruleIntegerDeclarion | this_BooleanDeclarion_1= ruleBooleanDeclarion | this_StateVariableDeclaration_2= ruleStateVariableDeclaration | this_Comment_3= ruleComment ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:290:1: (this_IntegerDeclarion_0= ruleIntegerDeclarion | this_BooleanDeclarion_1= ruleBooleanDeclarion | this_StateVariableDeclaration_2= ruleStateVariableDeclaration | this_Comment_3= ruleComment )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:290:1: (this_IntegerDeclarion_0= ruleIntegerDeclarion | this_BooleanDeclarion_1= ruleBooleanDeclarion | this_StateVariableDeclaration_2= ruleStateVariableDeclaration | this_Comment_3= ruleComment )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==14) ) {
                    switch ( input.LA(3) ) {
                    case 17:
                        {
                        alt5=2;
                        }
                        break;
                    case 15:
                        {
                        alt5=1;
                        }
                        break;
                    case 18:
                        {
                        alt5=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_SMV_COMMENT) ) {
                alt5=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:291:5: this_IntegerDeclarion_0= ruleIntegerDeclarion
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDeclarationAccess().getIntegerDeclarionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerDeclarion_in_ruleVariableDeclaration652);
                    this_IntegerDeclarion_0=ruleIntegerDeclarion();

                    state._fsp--;

                     
                            current = this_IntegerDeclarion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:301:5: this_BooleanDeclarion_1= ruleBooleanDeclarion
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDeclarationAccess().getBooleanDeclarionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanDeclarion_in_ruleVariableDeclaration679);
                    this_BooleanDeclarion_1=ruleBooleanDeclarion();

                    state._fsp--;

                     
                            current = this_BooleanDeclarion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:311:5: this_StateVariableDeclaration_2= ruleStateVariableDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDeclarationAccess().getStateVariableDeclarationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStateVariableDeclaration_in_ruleVariableDeclaration706);
                    this_StateVariableDeclaration_2=ruleStateVariableDeclaration();

                    state._fsp--;

                     
                            current = this_StateVariableDeclaration_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:321:5: this_Comment_3= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDeclarationAccess().getCommentParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleVariableDeclaration733);
                    this_Comment_3=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleIntegerDeclarion"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:337:1: entryRuleIntegerDeclarion returns [EObject current=null] : iv_ruleIntegerDeclarion= ruleIntegerDeclarion EOF ;
    public final EObject entryRuleIntegerDeclarion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerDeclarion = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:338:2: (iv_ruleIntegerDeclarion= ruleIntegerDeclarion EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:339:2: iv_ruleIntegerDeclarion= ruleIntegerDeclarion EOF
            {
             newCompositeNode(grammarAccess.getIntegerDeclarionRule()); 
            pushFollow(FOLLOW_ruleIntegerDeclarion_in_entryRuleIntegerDeclarion768);
            iv_ruleIntegerDeclarion=ruleIntegerDeclarion();

            state._fsp--;

             current =iv_ruleIntegerDeclarion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerDeclarion778); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerDeclarion"


    // $ANTLR start "ruleIntegerDeclarion"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:346:1: ruleIntegerDeclarion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';' ) ;
    public final EObject ruleIntegerDeclarion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:349:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:350:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:350:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:350:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';'
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:350:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:351:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:351:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:352:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerDeclarion820); 

            			newLeafNode(lv_name_0_0, grammarAccess.getIntegerDeclarionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerDeclarionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleIntegerDeclarion837); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerDeclarionAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleIntegerDeclarion849); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerDeclarionAccess().getIntegerKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleIntegerDeclarion861); 

                	newLeafNode(otherlv_3, grammarAccess.getIntegerDeclarionAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerDeclarion"


    // $ANTLR start "entryRuleBooleanDeclarion"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:388:1: entryRuleBooleanDeclarion returns [EObject current=null] : iv_ruleBooleanDeclarion= ruleBooleanDeclarion EOF ;
    public final EObject entryRuleBooleanDeclarion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanDeclarion = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:389:2: (iv_ruleBooleanDeclarion= ruleBooleanDeclarion EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:390:2: iv_ruleBooleanDeclarion= ruleBooleanDeclarion EOF
            {
             newCompositeNode(grammarAccess.getBooleanDeclarionRule()); 
            pushFollow(FOLLOW_ruleBooleanDeclarion_in_entryRuleBooleanDeclarion897);
            iv_ruleBooleanDeclarion=ruleBooleanDeclarion();

            state._fsp--;

             current =iv_ruleBooleanDeclarion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanDeclarion907); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanDeclarion"


    // $ANTLR start "ruleBooleanDeclarion"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:397:1: ruleBooleanDeclarion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';' ) ;
    public final EObject ruleBooleanDeclarion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:400:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:401:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:401:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:401:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';'
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:401:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:402:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:402:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:403:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanDeclarion949); 

            			newLeafNode(lv_name_0_0, grammarAccess.getBooleanDeclarionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanDeclarionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleBooleanDeclarion966); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanDeclarionAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleBooleanDeclarion978); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanDeclarionAccess().getBooleanKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleBooleanDeclarion990); 

                	newLeafNode(otherlv_3, grammarAccess.getBooleanDeclarionAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanDeclarion"


    // $ANTLR start "entryRuleStateVariableDeclaration"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:439:1: entryRuleStateVariableDeclaration returns [EObject current=null] : iv_ruleStateVariableDeclaration= ruleStateVariableDeclaration EOF ;
    public final EObject entryRuleStateVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateVariableDeclaration = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:440:2: (iv_ruleStateVariableDeclaration= ruleStateVariableDeclaration EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:441:2: iv_ruleStateVariableDeclaration= ruleStateVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStateVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration1026);
            iv_ruleStateVariableDeclaration=ruleStateVariableDeclaration();

            state._fsp--;

             current =iv_ruleStateVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateVariableDeclaration1036); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateVariableDeclaration"


    // $ANTLR start "ruleStateVariableDeclaration"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:448:1: ruleStateVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleStateVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_states_3_0=null;
        Token otherlv_4=null;
        Token lv_states_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:451:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:452:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:452:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:452:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';'
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:452:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:453:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:453:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:454:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateVariableDeclaration1078); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStateVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateVariableDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleStateVariableDeclaration1095); 

                	newLeafNode(otherlv_1, grammarAccess.getStateVariableDeclarationAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleStateVariableDeclaration1107); 

                	newLeafNode(otherlv_2, grammarAccess.getStateVariableDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:478:1: ( (lv_states_3_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:479:1: (lv_states_3_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:479:1: (lv_states_3_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:480:3: lv_states_3_0= RULE_ID
            {
            lv_states_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateVariableDeclaration1124); 

            			newLeafNode(lv_states_3_0, grammarAccess.getStateVariableDeclarationAccess().getStatesIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateVariableDeclarationRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"states",
                    		lv_states_3_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:496:2: (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:496:4: otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleStateVariableDeclaration1142); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStateVariableDeclarationAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:500:1: ( (lv_states_5_0= RULE_ID ) )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:501:1: (lv_states_5_0= RULE_ID )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:501:1: (lv_states_5_0= RULE_ID )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:502:3: lv_states_5_0= RULE_ID
            	    {
            	    lv_states_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateVariableDeclaration1159); 

            	    			newLeafNode(lv_states_5_0, grammarAccess.getStateVariableDeclarationAccess().getStatesIDTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStateVariableDeclarationRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"states",
            	            		lv_states_5_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleStateVariableDeclaration1178); 

                	newLeafNode(otherlv_6, grammarAccess.getStateVariableDeclarationAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleStateVariableDeclaration1190); 

                	newLeafNode(otherlv_7, grammarAccess.getStateVariableDeclarationAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateVariableDeclaration"


    // $ANTLR start "entryRuleAssignmentExpression"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:534:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:535:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:536:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
             newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression1226);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;

             current =iv_ruleAssignmentExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression1236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:543:1: ruleAssignmentExpression returns [EObject current=null] : (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment | this_Comment_3= ruleComment ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerAssignment_0 = null;

        EObject this_BooleanAssignment_1 = null;

        EObject this_StateAssignment_2 = null;

        EObject this_Comment_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:546:28: ( (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment | this_Comment_3= ruleComment ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:547:1: (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment | this_Comment_3= ruleComment )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:547:1: (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment | this_Comment_3= ruleComment )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:548:5: this_IntegerAssignment_0= ruleIntegerAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getIntegerAssignmentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerAssignment_in_ruleAssignmentExpression1283);
                    this_IntegerAssignment_0=ruleIntegerAssignment();

                    state._fsp--;

                     
                            current = this_IntegerAssignment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:558:5: this_BooleanAssignment_1= ruleBooleanAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getBooleanAssignmentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanAssignment_in_ruleAssignmentExpression1310);
                    this_BooleanAssignment_1=ruleBooleanAssignment();

                    state._fsp--;

                     
                            current = this_BooleanAssignment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:568:5: this_StateAssignment_2= ruleStateAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getStateAssignmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStateAssignment_in_ruleAssignmentExpression1337);
                    this_StateAssignment_2=ruleStateAssignment();

                    state._fsp--;

                     
                            current = this_StateAssignment_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:578:5: this_Comment_3= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getCommentParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleAssignmentExpression1364);
                    this_Comment_3=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleBooleanAssignment"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:594:1: entryRuleBooleanAssignment returns [EObject current=null] : iv_ruleBooleanAssignment= ruleBooleanAssignment EOF ;
    public final EObject entryRuleBooleanAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAssignment = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:595:2: (iv_ruleBooleanAssignment= ruleBooleanAssignment EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:596:2: iv_ruleBooleanAssignment= ruleBooleanAssignment EOF
            {
             newCompositeNode(grammarAccess.getBooleanAssignmentRule()); 
            pushFollow(FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment1399);
            iv_ruleBooleanAssignment=ruleBooleanAssignment();

            state._fsp--;

             current =iv_ruleBooleanAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAssignment1409); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanAssignment"


    // $ANTLR start "ruleBooleanAssignment"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:603:1: ruleBooleanAssignment returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';' ) ;
    public final EObject ruleBooleanAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:606:28: ( (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:607:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:607:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:607:3: otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleBooleanAssignment1446); 

                	newLeafNode(otherlv_0, grammarAccess.getBooleanAssignmentAccess().getInitKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleBooleanAssignment1458); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanAssignmentAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:615:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:616:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:616:1: (otherlv_2= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:617:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanAssignmentRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanAssignment1478); 

            		newLeafNode(otherlv_2, grammarAccess.getBooleanAssignmentAccess().getVarBooleanDeclarionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleBooleanAssignment1490); 

                	newLeafNode(otherlv_3, grammarAccess.getBooleanAssignmentAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleBooleanAssignment1502); 

                	newLeafNode(otherlv_4, grammarAccess.getBooleanAssignmentAccess().getColonEqualsSignKeyword_4());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:636:1: ( (lv_value_5_0= ruleBOOL ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:637:1: (lv_value_5_0= ruleBOOL )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:637:1: (lv_value_5_0= ruleBOOL )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:638:3: lv_value_5_0= ruleBOOL
            {
             
            	        newCompositeNode(grammarAccess.getBooleanAssignmentAccess().getValueBOOLParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanAssignment1523);
            lv_value_5_0=ruleBOOL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"BOOL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleBooleanAssignment1535); 

                	newLeafNode(otherlv_6, grammarAccess.getBooleanAssignmentAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanAssignment"


    // $ANTLR start "entryRuleBOOL"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:666:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:667:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:668:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL1572);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL1583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:675:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'True' | kw= 'False' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:678:28: ( (kw= 'True' | kw= 'False' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:679:1: (kw= 'True' | kw= 'False' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:679:1: (kw= 'True' | kw= 'False' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:680:2: kw= 'True'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleBOOL1621); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:687:2: kw= 'False'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleBOOL1640); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRuleIntegerAssignment"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:700:1: entryRuleIntegerAssignment returns [EObject current=null] : iv_ruleIntegerAssignment= ruleIntegerAssignment EOF ;
    public final EObject entryRuleIntegerAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerAssignment = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:701:2: (iv_ruleIntegerAssignment= ruleIntegerAssignment EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:702:2: iv_ruleIntegerAssignment= ruleIntegerAssignment EOF
            {
             newCompositeNode(grammarAccess.getIntegerAssignmentRule()); 
            pushFollow(FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment1680);
            iv_ruleIntegerAssignment=ruleIntegerAssignment();

            state._fsp--;

             current =iv_ruleIntegerAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerAssignment1690); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerAssignment"


    // $ANTLR start "ruleIntegerAssignment"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:709:1: ruleIntegerAssignment returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';' ) ;
    public final EObject ruleIntegerAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:712:28: ( (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:713:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:713:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:713:3: otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleIntegerAssignment1727); 

                	newLeafNode(otherlv_0, grammarAccess.getIntegerAssignmentAccess().getInitKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleIntegerAssignment1739); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerAssignmentAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:721:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:722:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:722:1: (otherlv_2= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:723:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerAssignmentRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerAssignment1759); 

            		newLeafNode(otherlv_2, grammarAccess.getIntegerAssignmentAccess().getVarIntegerDeclarionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleIntegerAssignment1771); 

                	newLeafNode(otherlv_3, grammarAccess.getIntegerAssignmentAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleIntegerAssignment1783); 

                	newLeafNode(otherlv_4, grammarAccess.getIntegerAssignmentAccess().getColonEqualsSignKeyword_4());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:742:1: ( (lv_value_5_0= RULE_INT ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:743:1: (lv_value_5_0= RULE_INT )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:743:1: (lv_value_5_0= RULE_INT )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:744:3: lv_value_5_0= RULE_INT
            {
            lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerAssignment1800); 

            			newLeafNode(lv_value_5_0, grammarAccess.getIntegerAssignmentAccess().getValueINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleIntegerAssignment1817); 

                	newLeafNode(otherlv_6, grammarAccess.getIntegerAssignmentAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerAssignment"


    // $ANTLR start "entryRuleStateAssignment"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:772:1: entryRuleStateAssignment returns [EObject current=null] : iv_ruleStateAssignment= ruleStateAssignment EOF ;
    public final EObject entryRuleStateAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateAssignment = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:773:2: (iv_ruleStateAssignment= ruleStateAssignment EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:774:2: iv_ruleStateAssignment= ruleStateAssignment EOF
            {
             newCompositeNode(grammarAccess.getStateAssignmentRule()); 
            pushFollow(FOLLOW_ruleStateAssignment_in_entryRuleStateAssignment1853);
            iv_ruleStateAssignment=ruleStateAssignment();

            state._fsp--;

             current =iv_ruleStateAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateAssignment1863); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateAssignment"


    // $ANTLR start "ruleStateAssignment"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:781:1: ruleStateAssignment returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';' ) ;
    public final EObject ruleStateAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:784:28: ( (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:785:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:785:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:785:3: otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleStateAssignment1900); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAssignmentAccess().getInitKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleStateAssignment1912); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAssignmentAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:793:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:794:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:794:1: (otherlv_2= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:795:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStateAssignmentRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateAssignment1932); 

            		newLeafNode(otherlv_2, grammarAccess.getStateAssignmentAccess().getVarStateVariableDeclarationCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleStateAssignment1944); 

                	newLeafNode(otherlv_3, grammarAccess.getStateAssignmentAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleStateAssignment1956); 

                	newLeafNode(otherlv_4, grammarAccess.getStateAssignmentAccess().getColonEqualsSignKeyword_4());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:814:1: ( (lv_value_5_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:815:1: (lv_value_5_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:815:1: (lv_value_5_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:816:3: lv_value_5_0= RULE_ID
            {
            lv_value_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateAssignment1973); 

            			newLeafNode(lv_value_5_0, grammarAccess.getStateAssignmentAccess().getValueIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleStateAssignment1990); 

                	newLeafNode(otherlv_6, grammarAccess.getStateAssignmentAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateAssignment"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\4\1\26\1\uffff\1\5\1\27\1\30\1\5\3\uffff";
    static final String DFA7_maxS =
        "\1\25\1\26\1\uffff\1\5\1\27\1\30\1\32\3\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\4\4\uffff\1\2\1\1\1\3";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\20\uffff\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\11\1\10\22\uffff\2\7",
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
            return "547:1: (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment | this_Comment_3= ruleComment )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_ruleModel130 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesSection_in_ruleSection223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignments_in_ruleSection250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMV_COMMENT_in_ruleComment336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesSection_in_entryRuleVariablesSection376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablesSection386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleVariablesSection423 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesSection444 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleAssignments_in_entryRuleAssignments481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignments491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAssignments537 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleAssignments558 = new BitSet(new long[]{0x0000000000200032L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDeclarion_in_ruleVariableDeclaration652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDeclarion_in_ruleVariableDeclaration679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_ruleVariableDeclaration706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleVariableDeclaration733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDeclarion_in_entryRuleIntegerDeclarion768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerDeclarion778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerDeclarion820 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIntegerDeclarion837 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIntegerDeclarion849 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIntegerDeclarion861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDeclarion_in_entryRuleBooleanDeclarion897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanDeclarion907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanDeclarion949 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBooleanDeclarion966 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBooleanDeclarion978 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBooleanDeclarion990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateVariableDeclaration1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateVariableDeclaration1078 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStateVariableDeclaration1095 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStateVariableDeclaration1107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateVariableDeclaration1124 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleStateVariableDeclaration1142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateVariableDeclaration1159 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleStateVariableDeclaration1178 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStateVariableDeclaration1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression1226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAssignment_in_ruleAssignmentExpression1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAssignment_in_ruleAssignmentExpression1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAssignment_in_ruleAssignmentExpression1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleAssignmentExpression1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment1399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAssignment1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBooleanAssignment1446 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBooleanAssignment1458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanAssignment1478 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBooleanAssignment1490 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBooleanAssignment1502 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanAssignment1523 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBooleanAssignment1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBOOL1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBOOL1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerAssignment1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleIntegerAssignment1727 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntegerAssignment1739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerAssignment1759 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleIntegerAssignment1771 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIntegerAssignment1783 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerAssignment1800 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIntegerAssignment1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAssignment_in_entryRuleStateAssignment1853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateAssignment1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStateAssignment1900 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStateAssignment1912 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateAssignment1932 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStateAssignment1944 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStateAssignment1956 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateAssignment1973 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStateAssignment1990 = new BitSet(new long[]{0x0000000000000002L});

}