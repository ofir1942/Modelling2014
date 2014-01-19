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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SMV_COMMENT", "RULE_AND_OR", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VAR'", "'ASSIGN'", "'TRANS'", "'->'", "'='", "'next'", "'('", "')'", "':'", "'integer'", "';'", "'boolean'", "'{'", "','", "'}'", "'init'", "':='", "'True'", "'False'"
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

                if ( ((LA1_0>=13 && LA1_0<=15)) ) {
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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:115:1: ruleSection returns [EObject current=null] : (this_VariablesSection_0= ruleVariablesSection | this_Assignments_1= ruleAssignments | this_Transactions_2= ruleTransactions ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        EObject this_VariablesSection_0 = null;

        EObject this_Assignments_1 = null;

        EObject this_Transactions_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:118:28: ( (this_VariablesSection_0= ruleVariablesSection | this_Assignments_1= ruleAssignments | this_Transactions_2= ruleTransactions ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:119:1: (this_VariablesSection_0= ruleVariablesSection | this_Assignments_1= ruleAssignments | this_Transactions_2= ruleTransactions )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:119:1: (this_VariablesSection_0= ruleVariablesSection | this_Assignments_1= ruleAssignments | this_Transactions_2= ruleTransactions )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
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
                case 3 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:140:5: this_Transactions_2= ruleTransactions
                    {
                     
                            newCompositeNode(grammarAccess.getSectionAccess().getTransactionsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTransactions_in_ruleSection277);
                    this_Transactions_2=ruleTransactions();

                    state._fsp--;

                     
                            current = this_Transactions_2; 
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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:156:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:157:2: (iv_ruleComment= ruleComment EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:158:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment312);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment322); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:165:1: ruleComment returns [EObject current=null] : ( (lv_comment_0_0= RULE_SMV_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:168:28: ( ( (lv_comment_0_0= RULE_SMV_COMMENT ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:169:1: ( (lv_comment_0_0= RULE_SMV_COMMENT ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:169:1: ( (lv_comment_0_0= RULE_SMV_COMMENT ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:170:1: (lv_comment_0_0= RULE_SMV_COMMENT )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:170:1: (lv_comment_0_0= RULE_SMV_COMMENT )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:171:3: lv_comment_0_0= RULE_SMV_COMMENT
            {
            lv_comment_0_0=(Token)match(input,RULE_SMV_COMMENT,FOLLOW_RULE_SMV_COMMENT_in_ruleComment363); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:195:1: entryRuleVariablesSection returns [EObject current=null] : iv_ruleVariablesSection= ruleVariablesSection EOF ;
    public final EObject entryRuleVariablesSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesSection = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:196:2: (iv_ruleVariablesSection= ruleVariablesSection EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:197:2: iv_ruleVariablesSection= ruleVariablesSection EOF
            {
             newCompositeNode(grammarAccess.getVariablesSectionRule()); 
            pushFollow(FOLLOW_ruleVariablesSection_in_entryRuleVariablesSection403);
            iv_ruleVariablesSection=ruleVariablesSection();

            state._fsp--;

             current =iv_ruleVariablesSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablesSection413); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:204:1: ruleVariablesSection returns [EObject current=null] : (otherlv_0= 'VAR' ( (lv_variables_1_0= ruleVariableDeclaration ) )+ ) ;
    public final EObject ruleVariablesSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_variables_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:207:28: ( (otherlv_0= 'VAR' ( (lv_variables_1_0= ruleVariableDeclaration ) )+ ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:208:1: (otherlv_0= 'VAR' ( (lv_variables_1_0= ruleVariableDeclaration ) )+ )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:208:1: (otherlv_0= 'VAR' ( (lv_variables_1_0= ruleVariableDeclaration ) )+ )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:208:3: otherlv_0= 'VAR' ( (lv_variables_1_0= ruleVariableDeclaration ) )+
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleVariablesSection450); 

                	newLeafNode(otherlv_0, grammarAccess.getVariablesSectionAccess().getVARKeyword_0());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:212:1: ( (lv_variables_1_0= ruleVariableDeclaration ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_SMV_COMMENT||LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:213:1: (lv_variables_1_0= ruleVariableDeclaration )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:213:1: (lv_variables_1_0= ruleVariableDeclaration )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:214:3: lv_variables_1_0= ruleVariableDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariablesSectionAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariablesSection471);
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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:238:1: entryRuleAssignments returns [EObject current=null] : iv_ruleAssignments= ruleAssignments EOF ;
    public final EObject entryRuleAssignments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignments = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:239:2: (iv_ruleAssignments= ruleAssignments EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:240:2: iv_ruleAssignments= ruleAssignments EOF
            {
             newCompositeNode(grammarAccess.getAssignmentsRule()); 
            pushFollow(FOLLOW_ruleAssignments_in_entryRuleAssignments508);
            iv_ruleAssignments=ruleAssignments();

            state._fsp--;

             current =iv_ruleAssignments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignments518); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:247:1: ruleAssignments returns [EObject current=null] : ( () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+ ) ;
    public final EObject ruleAssignments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_assignments_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:250:28: ( ( () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+ ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:251:1: ( () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+ )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:251:1: ( () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+ )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:251:2: () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:251:2: ()
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:252:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssignmentsAccess().getAssignmentsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleAssignments564); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentsAccess().getASSIGNKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:261:1: ( (lv_assignments_2_0= ruleAssignmentExpression ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_SMV_COMMENT||LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:262:1: (lv_assignments_2_0= ruleAssignmentExpression )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:262:1: (lv_assignments_2_0= ruleAssignmentExpression )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:263:3: lv_assignments_2_0= ruleAssignmentExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssignmentsAccess().getAssignmentsAssignmentExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleAssignments585);
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


    // $ANTLR start "entryRuleTransactions"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:287:1: entryRuleTransactions returns [EObject current=null] : iv_ruleTransactions= ruleTransactions EOF ;
    public final EObject entryRuleTransactions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransactions = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:288:2: (iv_ruleTransactions= ruleTransactions EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:289:2: iv_ruleTransactions= ruleTransactions EOF
            {
             newCompositeNode(grammarAccess.getTransactionsRule()); 
            pushFollow(FOLLOW_ruleTransactions_in_entryRuleTransactions622);
            iv_ruleTransactions=ruleTransactions();

            state._fsp--;

             current =iv_ruleTransactions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactions632); 

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
    // $ANTLR end "entryRuleTransactions"


    // $ANTLR start "ruleTransactions"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:296:1: ruleTransactions returns [EObject current=null] : (otherlv_0= 'TRANS' ( (lv_transaction_1_0= ruleTransactionStatement ) )+ ) ;
    public final EObject ruleTransactions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_transaction_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:299:28: ( (otherlv_0= 'TRANS' ( (lv_transaction_1_0= ruleTransactionStatement ) )+ ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:300:1: (otherlv_0= 'TRANS' ( (lv_transaction_1_0= ruleTransactionStatement ) )+ )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:300:1: (otherlv_0= 'TRANS' ( (lv_transaction_1_0= ruleTransactionStatement ) )+ )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:300:3: otherlv_0= 'TRANS' ( (lv_transaction_1_0= ruleTransactionStatement ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleTransactions669); 

                	newLeafNode(otherlv_0, grammarAccess.getTransactionsAccess().getTRANSKeyword_0());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:304:1: ( (lv_transaction_1_0= ruleTransactionStatement ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_SMV_COMMENT||LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:305:1: (lv_transaction_1_0= ruleTransactionStatement )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:305:1: (lv_transaction_1_0= ruleTransactionStatement )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:306:3: lv_transaction_1_0= ruleTransactionStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransactionsAccess().getTransactionTransactionStatementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransactionStatement_in_ruleTransactions690);
            	    lv_transaction_1_0=ruleTransactionStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransactionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transaction",
            	            		lv_transaction_1_0, 
            	            		"TransactionStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "ruleTransactions"


    // $ANTLR start "entryRuleTransactionStatement"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:330:1: entryRuleTransactionStatement returns [EObject current=null] : iv_ruleTransactionStatement= ruleTransactionStatement EOF ;
    public final EObject entryRuleTransactionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransactionStatement = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:331:2: (iv_ruleTransactionStatement= ruleTransactionStatement EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:332:2: iv_ruleTransactionStatement= ruleTransactionStatement EOF
            {
             newCompositeNode(grammarAccess.getTransactionStatementRule()); 
            pushFollow(FOLLOW_ruleTransactionStatement_in_entryRuleTransactionStatement727);
            iv_ruleTransactionStatement=ruleTransactionStatement();

            state._fsp--;

             current =iv_ruleTransactionStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactionStatement737); 

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
    // $ANTLR end "entryRuleTransactionStatement"


    // $ANTLR start "ruleTransactionStatement"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:339:1: ruleTransactionStatement returns [EObject current=null] : ( ( (lv_precondition_0_0= ruleTransactionPrecondition ) ) otherlv_1= '->' ( (lv_postTransaction_2_0= rulePostTransaction ) ) ) ;
    public final EObject ruleTransactionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_precondition_0_0 = null;

        EObject lv_postTransaction_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:342:28: ( ( ( (lv_precondition_0_0= ruleTransactionPrecondition ) ) otherlv_1= '->' ( (lv_postTransaction_2_0= rulePostTransaction ) ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:343:1: ( ( (lv_precondition_0_0= ruleTransactionPrecondition ) ) otherlv_1= '->' ( (lv_postTransaction_2_0= rulePostTransaction ) ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:343:1: ( ( (lv_precondition_0_0= ruleTransactionPrecondition ) ) otherlv_1= '->' ( (lv_postTransaction_2_0= rulePostTransaction ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:343:2: ( (lv_precondition_0_0= ruleTransactionPrecondition ) ) otherlv_1= '->' ( (lv_postTransaction_2_0= rulePostTransaction ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:343:2: ( (lv_precondition_0_0= ruleTransactionPrecondition ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:344:1: (lv_precondition_0_0= ruleTransactionPrecondition )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:344:1: (lv_precondition_0_0= ruleTransactionPrecondition )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:345:3: lv_precondition_0_0= ruleTransactionPrecondition
            {
             
            	        newCompositeNode(grammarAccess.getTransactionStatementAccess().getPreconditionTransactionPreconditionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTransactionPrecondition_in_ruleTransactionStatement783);
            lv_precondition_0_0=ruleTransactionPrecondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransactionStatementRule());
            	        }
                   		set(
                   			current, 
                   			"precondition",
                    		lv_precondition_0_0, 
                    		"TransactionPrecondition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleTransactionStatement795); 

                	newLeafNode(otherlv_1, grammarAccess.getTransactionStatementAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:365:1: ( (lv_postTransaction_2_0= rulePostTransaction ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:366:1: (lv_postTransaction_2_0= rulePostTransaction )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:366:1: (lv_postTransaction_2_0= rulePostTransaction )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:367:3: lv_postTransaction_2_0= rulePostTransaction
            {
             
            	        newCompositeNode(grammarAccess.getTransactionStatementAccess().getPostTransactionPostTransactionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePostTransaction_in_ruleTransactionStatement816);
            lv_postTransaction_2_0=rulePostTransaction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransactionStatementRule());
            	        }
                   		set(
                   			current, 
                   			"postTransaction",
                    		lv_postTransaction_2_0, 
                    		"PostTransaction");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleTransactionStatement"


    // $ANTLR start "entryRuleTransactionPrecondition"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:391:1: entryRuleTransactionPrecondition returns [EObject current=null] : iv_ruleTransactionPrecondition= ruleTransactionPrecondition EOF ;
    public final EObject entryRuleTransactionPrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransactionPrecondition = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:392:2: (iv_ruleTransactionPrecondition= ruleTransactionPrecondition EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:393:2: iv_ruleTransactionPrecondition= ruleTransactionPrecondition EOF
            {
             newCompositeNode(grammarAccess.getTransactionPreconditionRule()); 
            pushFollow(FOLLOW_ruleTransactionPrecondition_in_entryRuleTransactionPrecondition852);
            iv_ruleTransactionPrecondition=ruleTransactionPrecondition();

            state._fsp--;

             current =iv_ruleTransactionPrecondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactionPrecondition862); 

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
    // $ANTLR end "entryRuleTransactionPrecondition"


    // $ANTLR start "ruleTransactionPrecondition"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:400:1: ruleTransactionPrecondition returns [EObject current=null] : ( ( (lv_preconditions_0_0= rulePreconditionStatement ) ) ( ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_preconditions_2_0= rulePreconditionStatement ) ) )* ) ;
    public final EObject ruleTransactionPrecondition() throws RecognitionException {
        EObject current = null;

        Token lv_logicalOperator_1_0=null;
        EObject lv_preconditions_0_0 = null;

        EObject lv_preconditions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:403:28: ( ( ( (lv_preconditions_0_0= rulePreconditionStatement ) ) ( ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_preconditions_2_0= rulePreconditionStatement ) ) )* ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:404:1: ( ( (lv_preconditions_0_0= rulePreconditionStatement ) ) ( ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_preconditions_2_0= rulePreconditionStatement ) ) )* )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:404:1: ( ( (lv_preconditions_0_0= rulePreconditionStatement ) ) ( ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_preconditions_2_0= rulePreconditionStatement ) ) )* )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:404:2: ( (lv_preconditions_0_0= rulePreconditionStatement ) ) ( ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_preconditions_2_0= rulePreconditionStatement ) ) )*
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:404:2: ( (lv_preconditions_0_0= rulePreconditionStatement ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:405:1: (lv_preconditions_0_0= rulePreconditionStatement )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:405:1: (lv_preconditions_0_0= rulePreconditionStatement )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:406:3: lv_preconditions_0_0= rulePreconditionStatement
            {
             
            	        newCompositeNode(grammarAccess.getTransactionPreconditionAccess().getPreconditionsPreconditionStatementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePreconditionStatement_in_ruleTransactionPrecondition908);
            lv_preconditions_0_0=rulePreconditionStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransactionPreconditionRule());
            	        }
                   		add(
                   			current, 
                   			"preconditions",
                    		lv_preconditions_0_0, 
                    		"PreconditionStatement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:422:2: ( ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_preconditions_2_0= rulePreconditionStatement ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_AND_OR) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:422:3: ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_preconditions_2_0= rulePreconditionStatement ) )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:422:3: ( (lv_logicalOperator_1_0= RULE_AND_OR ) )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:423:1: (lv_logicalOperator_1_0= RULE_AND_OR )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:423:1: (lv_logicalOperator_1_0= RULE_AND_OR )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:424:3: lv_logicalOperator_1_0= RULE_AND_OR
            	    {
            	    lv_logicalOperator_1_0=(Token)match(input,RULE_AND_OR,FOLLOW_RULE_AND_OR_in_ruleTransactionPrecondition926); 

            	    			newLeafNode(lv_logicalOperator_1_0, grammarAccess.getTransactionPreconditionAccess().getLogicalOperatorAND_ORTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTransactionPreconditionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"logicalOperator",
            	            		lv_logicalOperator_1_0, 
            	            		"AND_OR");
            	    	    

            	    }


            	    }

            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:440:2: ( (lv_preconditions_2_0= rulePreconditionStatement ) )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:441:1: (lv_preconditions_2_0= rulePreconditionStatement )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:441:1: (lv_preconditions_2_0= rulePreconditionStatement )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:442:3: lv_preconditions_2_0= rulePreconditionStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransactionPreconditionAccess().getPreconditionsPreconditionStatementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePreconditionStatement_in_ruleTransactionPrecondition952);
            	    lv_preconditions_2_0=rulePreconditionStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransactionPreconditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"preconditions",
            	            		lv_preconditions_2_0, 
            	            		"PreconditionStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
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
    // $ANTLR end "ruleTransactionPrecondition"


    // $ANTLR start "entryRulePreconditionStatement"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:466:1: entryRulePreconditionStatement returns [EObject current=null] : iv_rulePreconditionStatement= rulePreconditionStatement EOF ;
    public final EObject entryRulePreconditionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreconditionStatement = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:467:2: (iv_rulePreconditionStatement= rulePreconditionStatement EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:468:2: iv_rulePreconditionStatement= rulePreconditionStatement EOF
            {
             newCompositeNode(grammarAccess.getPreconditionStatementRule()); 
            pushFollow(FOLLOW_rulePreconditionStatement_in_entryRulePreconditionStatement990);
            iv_rulePreconditionStatement=rulePreconditionStatement();

            state._fsp--;

             current =iv_rulePreconditionStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreconditionStatement1000); 

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
    // $ANTLR end "entryRulePreconditionStatement"


    // $ANTLR start "rulePreconditionStatement"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:475:1: rulePreconditionStatement returns [EObject current=null] : (this_IntegerPrecondition_0= ruleIntegerPrecondition | this_BooleanPrecondition_1= ruleBooleanPrecondition | this_StatePrecondition_2= ruleStatePrecondition | this_Comment_3= ruleComment ) ;
    public final EObject rulePreconditionStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerPrecondition_0 = null;

        EObject this_BooleanPrecondition_1 = null;

        EObject this_StatePrecondition_2 = null;

        EObject this_Comment_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:478:28: ( (this_IntegerPrecondition_0= ruleIntegerPrecondition | this_BooleanPrecondition_1= ruleBooleanPrecondition | this_StatePrecondition_2= ruleStatePrecondition | this_Comment_3= ruleComment ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:479:1: (this_IntegerPrecondition_0= ruleIntegerPrecondition | this_BooleanPrecondition_1= ruleBooleanPrecondition | this_StatePrecondition_2= ruleStatePrecondition | this_Comment_3= ruleComment )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:479:1: (this_IntegerPrecondition_0= ruleIntegerPrecondition | this_BooleanPrecondition_1= ruleBooleanPrecondition | this_StatePrecondition_2= ruleStatePrecondition | this_Comment_3= ruleComment )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==17) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        alt7=3;
                        }
                        break;
                    case 30:
                    case 31:
                        {
                        alt7=2;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt7=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_SMV_COMMENT) ) {
                alt7=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:480:5: this_IntegerPrecondition_0= ruleIntegerPrecondition
                    {
                     
                            newCompositeNode(grammarAccess.getPreconditionStatementAccess().getIntegerPreconditionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerPrecondition_in_rulePreconditionStatement1047);
                    this_IntegerPrecondition_0=ruleIntegerPrecondition();

                    state._fsp--;

                     
                            current = this_IntegerPrecondition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:490:5: this_BooleanPrecondition_1= ruleBooleanPrecondition
                    {
                     
                            newCompositeNode(grammarAccess.getPreconditionStatementAccess().getBooleanPreconditionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanPrecondition_in_rulePreconditionStatement1074);
                    this_BooleanPrecondition_1=ruleBooleanPrecondition();

                    state._fsp--;

                     
                            current = this_BooleanPrecondition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:500:5: this_StatePrecondition_2= ruleStatePrecondition
                    {
                     
                            newCompositeNode(grammarAccess.getPreconditionStatementAccess().getStatePreconditionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStatePrecondition_in_rulePreconditionStatement1101);
                    this_StatePrecondition_2=ruleStatePrecondition();

                    state._fsp--;

                     
                            current = this_StatePrecondition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:510:5: this_Comment_3= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getPreconditionStatementAccess().getCommentParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_rulePreconditionStatement1128);
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
    // $ANTLR end "rulePreconditionStatement"


    // $ANTLR start "entryRuleStatePrecondition"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:526:1: entryRuleStatePrecondition returns [EObject current=null] : iv_ruleStatePrecondition= ruleStatePrecondition EOF ;
    public final EObject entryRuleStatePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatePrecondition = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:527:2: (iv_ruleStatePrecondition= ruleStatePrecondition EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:528:2: iv_ruleStatePrecondition= ruleStatePrecondition EOF
            {
             newCompositeNode(grammarAccess.getStatePreconditionRule()); 
            pushFollow(FOLLOW_ruleStatePrecondition_in_entryRuleStatePrecondition1163);
            iv_ruleStatePrecondition=ruleStatePrecondition();

            state._fsp--;

             current =iv_ruleStatePrecondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatePrecondition1173); 

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
    // $ANTLR end "entryRuleStatePrecondition"


    // $ANTLR start "ruleStatePrecondition"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:535:1: ruleStatePrecondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) ) ;
    public final EObject ruleStatePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:538:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:539:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:539:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:539:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:539:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:540:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:540:1: (otherlv_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:541:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStatePreconditionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatePrecondition1218); 

            		newLeafNode(otherlv_0, grammarAccess.getStatePreconditionAccess().getVarStateVariableDeclarationCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleStatePrecondition1230); 

                	newLeafNode(otherlv_1, grammarAccess.getStatePreconditionAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:556:1: ( (lv_value_2_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:557:1: (lv_value_2_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:557:1: (lv_value_2_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:558:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatePrecondition1247); 

            			newLeafNode(lv_value_2_0, grammarAccess.getStatePreconditionAccess().getValueIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStatePreconditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleStatePrecondition"


    // $ANTLR start "entryRuleBooleanPrecondition"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:582:1: entryRuleBooleanPrecondition returns [EObject current=null] : iv_ruleBooleanPrecondition= ruleBooleanPrecondition EOF ;
    public final EObject entryRuleBooleanPrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanPrecondition = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:583:2: (iv_ruleBooleanPrecondition= ruleBooleanPrecondition EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:584:2: iv_ruleBooleanPrecondition= ruleBooleanPrecondition EOF
            {
             newCompositeNode(grammarAccess.getBooleanPreconditionRule()); 
            pushFollow(FOLLOW_ruleBooleanPrecondition_in_entryRuleBooleanPrecondition1288);
            iv_ruleBooleanPrecondition=ruleBooleanPrecondition();

            state._fsp--;

             current =iv_ruleBooleanPrecondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanPrecondition1298); 

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
    // $ANTLR end "entryRuleBooleanPrecondition"


    // $ANTLR start "ruleBooleanPrecondition"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:591:1: ruleBooleanPrecondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) ) ) ;
    public final EObject ruleBooleanPrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:594:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:595:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:595:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:595:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleBOOL ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:595:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:596:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:596:1: (otherlv_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:597:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanPreconditionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanPrecondition1343); 

            		newLeafNode(otherlv_0, grammarAccess.getBooleanPreconditionAccess().getVarBooleanDeclarionCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleBooleanPrecondition1355); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanPreconditionAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:612:1: ( (lv_value_2_0= ruleBOOL ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:613:1: (lv_value_2_0= ruleBOOL )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:613:1: (lv_value_2_0= ruleBOOL )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:614:3: lv_value_2_0= ruleBOOL
            {
             
            	        newCompositeNode(grammarAccess.getBooleanPreconditionAccess().getValueBOOLParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanPrecondition1376);
            lv_value_2_0=ruleBOOL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanPreconditionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"BOOL");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleBooleanPrecondition"


    // $ANTLR start "entryRuleIntegerPrecondition"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:638:1: entryRuleIntegerPrecondition returns [EObject current=null] : iv_ruleIntegerPrecondition= ruleIntegerPrecondition EOF ;
    public final EObject entryRuleIntegerPrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerPrecondition = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:639:2: (iv_ruleIntegerPrecondition= ruleIntegerPrecondition EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:640:2: iv_ruleIntegerPrecondition= ruleIntegerPrecondition EOF
            {
             newCompositeNode(grammarAccess.getIntegerPreconditionRule()); 
            pushFollow(FOLLOW_ruleIntegerPrecondition_in_entryRuleIntegerPrecondition1412);
            iv_ruleIntegerPrecondition=ruleIntegerPrecondition();

            state._fsp--;

             current =iv_ruleIntegerPrecondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerPrecondition1422); 

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
    // $ANTLR end "entryRuleIntegerPrecondition"


    // $ANTLR start "ruleIntegerPrecondition"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:647:1: ruleIntegerPrecondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerPrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:650:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:651:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:651:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:651:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:651:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:652:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:652:1: (otherlv_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:653:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerPreconditionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerPrecondition1467); 

            		newLeafNode(otherlv_0, grammarAccess.getIntegerPreconditionAccess().getVarIntegerDeclarionCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleIntegerPrecondition1479); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerPreconditionAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:668:1: ( (lv_value_2_0= RULE_INT ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:669:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:669:1: (lv_value_2_0= RULE_INT )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:670:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerPrecondition1496); 

            			newLeafNode(lv_value_2_0, grammarAccess.getIntegerPreconditionAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerPreconditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INT");
            	    

            }


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
    // $ANTLR end "ruleIntegerPrecondition"


    // $ANTLR start "entryRulePostTransaction"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:694:1: entryRulePostTransaction returns [EObject current=null] : iv_rulePostTransaction= rulePostTransaction EOF ;
    public final EObject entryRulePostTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostTransaction = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:695:2: (iv_rulePostTransaction= rulePostTransaction EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:696:2: iv_rulePostTransaction= rulePostTransaction EOF
            {
             newCompositeNode(grammarAccess.getPostTransactionRule()); 
            pushFollow(FOLLOW_rulePostTransaction_in_entryRulePostTransaction1537);
            iv_rulePostTransaction=rulePostTransaction();

            state._fsp--;

             current =iv_rulePostTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostTransaction1547); 

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
    // $ANTLR end "entryRulePostTransaction"


    // $ANTLR start "rulePostTransaction"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:703:1: rulePostTransaction returns [EObject current=null] : ( ( (lv_postTransactions_0_0= rulePostTransactionStatement ) ) ( ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_postTransactions_2_0= rulePostTransactionStatement ) ) )* ) ;
    public final EObject rulePostTransaction() throws RecognitionException {
        EObject current = null;

        Token lv_logicalOperator_1_0=null;
        EObject lv_postTransactions_0_0 = null;

        EObject lv_postTransactions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:706:28: ( ( ( (lv_postTransactions_0_0= rulePostTransactionStatement ) ) ( ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_postTransactions_2_0= rulePostTransactionStatement ) ) )* ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:707:1: ( ( (lv_postTransactions_0_0= rulePostTransactionStatement ) ) ( ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_postTransactions_2_0= rulePostTransactionStatement ) ) )* )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:707:1: ( ( (lv_postTransactions_0_0= rulePostTransactionStatement ) ) ( ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_postTransactions_2_0= rulePostTransactionStatement ) ) )* )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:707:2: ( (lv_postTransactions_0_0= rulePostTransactionStatement ) ) ( ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_postTransactions_2_0= rulePostTransactionStatement ) ) )*
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:707:2: ( (lv_postTransactions_0_0= rulePostTransactionStatement ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:708:1: (lv_postTransactions_0_0= rulePostTransactionStatement )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:708:1: (lv_postTransactions_0_0= rulePostTransactionStatement )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:709:3: lv_postTransactions_0_0= rulePostTransactionStatement
            {
             
            	        newCompositeNode(grammarAccess.getPostTransactionAccess().getPostTransactionsPostTransactionStatementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePostTransactionStatement_in_rulePostTransaction1593);
            lv_postTransactions_0_0=rulePostTransactionStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPostTransactionRule());
            	        }
                   		add(
                   			current, 
                   			"postTransactions",
                    		lv_postTransactions_0_0, 
                    		"PostTransactionStatement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:725:2: ( ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_postTransactions_2_0= rulePostTransactionStatement ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_AND_OR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:725:3: ( (lv_logicalOperator_1_0= RULE_AND_OR ) ) ( (lv_postTransactions_2_0= rulePostTransactionStatement ) )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:725:3: ( (lv_logicalOperator_1_0= RULE_AND_OR ) )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:726:1: (lv_logicalOperator_1_0= RULE_AND_OR )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:726:1: (lv_logicalOperator_1_0= RULE_AND_OR )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:727:3: lv_logicalOperator_1_0= RULE_AND_OR
            	    {
            	    lv_logicalOperator_1_0=(Token)match(input,RULE_AND_OR,FOLLOW_RULE_AND_OR_in_rulePostTransaction1611); 

            	    			newLeafNode(lv_logicalOperator_1_0, grammarAccess.getPostTransactionAccess().getLogicalOperatorAND_ORTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPostTransactionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"logicalOperator",
            	            		lv_logicalOperator_1_0, 
            	            		"AND_OR");
            	    	    

            	    }


            	    }

            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:743:2: ( (lv_postTransactions_2_0= rulePostTransactionStatement ) )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:744:1: (lv_postTransactions_2_0= rulePostTransactionStatement )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:744:1: (lv_postTransactions_2_0= rulePostTransactionStatement )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:745:3: lv_postTransactions_2_0= rulePostTransactionStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPostTransactionAccess().getPostTransactionsPostTransactionStatementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePostTransactionStatement_in_rulePostTransaction1637);
            	    lv_postTransactions_2_0=rulePostTransactionStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPostTransactionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"postTransactions",
            	            		lv_postTransactions_2_0, 
            	            		"PostTransactionStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
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
    // $ANTLR end "rulePostTransaction"


    // $ANTLR start "entryRulePostTransactionStatement"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:769:1: entryRulePostTransactionStatement returns [EObject current=null] : iv_rulePostTransactionStatement= rulePostTransactionStatement EOF ;
    public final EObject entryRulePostTransactionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostTransactionStatement = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:770:2: (iv_rulePostTransactionStatement= rulePostTransactionStatement EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:771:2: iv_rulePostTransactionStatement= rulePostTransactionStatement EOF
            {
             newCompositeNode(grammarAccess.getPostTransactionStatementRule()); 
            pushFollow(FOLLOW_rulePostTransactionStatement_in_entryRulePostTransactionStatement1675);
            iv_rulePostTransactionStatement=rulePostTransactionStatement();

            state._fsp--;

             current =iv_rulePostTransactionStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostTransactionStatement1685); 

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
    // $ANTLR end "entryRulePostTransactionStatement"


    // $ANTLR start "rulePostTransactionStatement"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:778:1: rulePostTransactionStatement returns [EObject current=null] : (this_ConditionalPostTRansaction_0= ruleConditionalPostTRansaction | this_SimplePostTransaction_1= ruleSimplePostTransaction ) ;
    public final EObject rulePostTransactionStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalPostTRansaction_0 = null;

        EObject this_SimplePostTransaction_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:781:28: ( (this_ConditionalPostTRansaction_0= ruleConditionalPostTRansaction | this_SimplePostTransaction_1= ruleSimplePostTransaction ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:782:1: (this_ConditionalPostTRansaction_0= ruleConditionalPostTRansaction | this_SimplePostTransaction_1= ruleSimplePostTransaction )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:782:1: (this_ConditionalPostTRansaction_0= ruleConditionalPostTRansaction | this_SimplePostTransaction_1= ruleSimplePostTransaction )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:783:5: this_ConditionalPostTRansaction_0= ruleConditionalPostTRansaction
                    {
                     
                            newCompositeNode(grammarAccess.getPostTransactionStatementAccess().getConditionalPostTRansactionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConditionalPostTRansaction_in_rulePostTransactionStatement1732);
                    this_ConditionalPostTRansaction_0=ruleConditionalPostTRansaction();

                    state._fsp--;

                     
                            current = this_ConditionalPostTRansaction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:793:5: this_SimplePostTransaction_1= ruleSimplePostTransaction
                    {
                     
                            newCompositeNode(grammarAccess.getPostTransactionStatementAccess().getSimplePostTransactionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSimplePostTransaction_in_rulePostTransactionStatement1759);
                    this_SimplePostTransaction_1=ruleSimplePostTransaction();

                    state._fsp--;

                     
                            current = this_SimplePostTransaction_1; 
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
    // $ANTLR end "rulePostTransactionStatement"


    // $ANTLR start "entryRuleSimplePostTransaction"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:809:1: entryRuleSimplePostTransaction returns [EObject current=null] : iv_ruleSimplePostTransaction= ruleSimplePostTransaction EOF ;
    public final EObject entryRuleSimplePostTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimplePostTransaction = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:810:2: (iv_ruleSimplePostTransaction= ruleSimplePostTransaction EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:811:2: iv_ruleSimplePostTransaction= ruleSimplePostTransaction EOF
            {
             newCompositeNode(grammarAccess.getSimplePostTransactionRule()); 
            pushFollow(FOLLOW_ruleSimplePostTransaction_in_entryRuleSimplePostTransaction1794);
            iv_ruleSimplePostTransaction=ruleSimplePostTransaction();

            state._fsp--;

             current =iv_ruleSimplePostTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimplePostTransaction1804); 

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
    // $ANTLR end "entryRuleSimplePostTransaction"


    // $ANTLR start "ruleSimplePostTransaction"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:818:1: ruleSimplePostTransaction returns [EObject current=null] : (this_IntegerPostTransaction_0= ruleIntegerPostTransaction | this_BooleanPostTransaction_1= ruleBooleanPostTransaction | this_StatePostTransaction_2= ruleStatePostTransaction ) ;
    public final EObject ruleSimplePostTransaction() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerPostTransaction_0 = null;

        EObject this_BooleanPostTransaction_1 = null;

        EObject this_StatePostTransaction_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:821:28: ( (this_IntegerPostTransaction_0= ruleIntegerPostTransaction | this_BooleanPostTransaction_1= ruleBooleanPostTransaction | this_StatePostTransaction_2= ruleStatePostTransaction ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:822:1: (this_IntegerPostTransaction_0= ruleIntegerPostTransaction | this_BooleanPostTransaction_1= ruleBooleanPostTransaction | this_StatePostTransaction_2= ruleStatePostTransaction )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:822:1: (this_IntegerPostTransaction_0= ruleIntegerPostTransaction | this_BooleanPostTransaction_1= ruleBooleanPostTransaction | this_StatePostTransaction_2= ruleStatePostTransaction )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==19) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==RULE_ID) ) {
                        int LA10_3 = input.LA(4);

                        if ( (LA10_3==20) ) {
                            int LA10_4 = input.LA(5);

                            if ( (LA10_4==17) ) {
                                switch ( input.LA(6) ) {
                                case RULE_INT:
                                    {
                                    alt10=1;
                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    alt10=3;
                                    }
                                    break;
                                case 30:
                                case 31:
                                    {
                                    alt10=2;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 10, 5, input);

                                    throw nvae;
                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:823:5: this_IntegerPostTransaction_0= ruleIntegerPostTransaction
                    {
                     
                            newCompositeNode(grammarAccess.getSimplePostTransactionAccess().getIntegerPostTransactionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerPostTransaction_in_ruleSimplePostTransaction1851);
                    this_IntegerPostTransaction_0=ruleIntegerPostTransaction();

                    state._fsp--;

                     
                            current = this_IntegerPostTransaction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:833:5: this_BooleanPostTransaction_1= ruleBooleanPostTransaction
                    {
                     
                            newCompositeNode(grammarAccess.getSimplePostTransactionAccess().getBooleanPostTransactionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanPostTransaction_in_ruleSimplePostTransaction1878);
                    this_BooleanPostTransaction_1=ruleBooleanPostTransaction();

                    state._fsp--;

                     
                            current = this_BooleanPostTransaction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:843:5: this_StatePostTransaction_2= ruleStatePostTransaction
                    {
                     
                            newCompositeNode(grammarAccess.getSimplePostTransactionAccess().getStatePostTransactionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStatePostTransaction_in_ruleSimplePostTransaction1905);
                    this_StatePostTransaction_2=ruleStatePostTransaction();

                    state._fsp--;

                     
                            current = this_StatePostTransaction_2; 
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
    // $ANTLR end "ruleSimplePostTransaction"


    // $ANTLR start "entryRuleStatePostTransaction"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:859:1: entryRuleStatePostTransaction returns [EObject current=null] : iv_ruleStatePostTransaction= ruleStatePostTransaction EOF ;
    public final EObject entryRuleStatePostTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatePostTransaction = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:860:2: (iv_ruleStatePostTransaction= ruleStatePostTransaction EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:861:2: iv_ruleStatePostTransaction= ruleStatePostTransaction EOF
            {
             newCompositeNode(grammarAccess.getStatePostTransactionRule()); 
            pushFollow(FOLLOW_ruleStatePostTransaction_in_entryRuleStatePostTransaction1940);
            iv_ruleStatePostTransaction=ruleStatePostTransaction();

            state._fsp--;

             current =iv_ruleStatePostTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatePostTransaction1950); 

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
    // $ANTLR end "entryRuleStatePostTransaction"


    // $ANTLR start "ruleStatePostTransaction"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:868:1: ruleStatePostTransaction returns [EObject current=null] : (otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= RULE_ID ) ) ) ;
    public final EObject ruleStatePostTransaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:871:28: ( (otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= RULE_ID ) ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:872:1: (otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= RULE_ID ) ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:872:1: (otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:872:3: otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleStatePostTransaction1987); 

                	newLeafNode(otherlv_0, grammarAccess.getStatePostTransactionAccess().getNextKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleStatePostTransaction1999); 

                	newLeafNode(otherlv_1, grammarAccess.getStatePostTransactionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:880:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:881:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:881:1: (otherlv_2= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:882:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStatePostTransactionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatePostTransaction2019); 

            		newLeafNode(otherlv_2, grammarAccess.getStatePostTransactionAccess().getVarStateVariableDeclarationCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleStatePostTransaction2031); 

                	newLeafNode(otherlv_3, grammarAccess.getStatePostTransactionAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleStatePostTransaction2043); 

                	newLeafNode(otherlv_4, grammarAccess.getStatePostTransactionAccess().getEqualsSignKeyword_4());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:901:1: ( (lv_value_5_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:902:1: (lv_value_5_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:902:1: (lv_value_5_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:903:3: lv_value_5_0= RULE_ID
            {
            lv_value_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatePostTransaction2060); 

            			newLeafNode(lv_value_5_0, grammarAccess.getStatePostTransactionAccess().getValueIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStatePostTransactionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleStatePostTransaction"


    // $ANTLR start "entryRuleBooleanPostTransaction"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:927:1: entryRuleBooleanPostTransaction returns [EObject current=null] : iv_ruleBooleanPostTransaction= ruleBooleanPostTransaction EOF ;
    public final EObject entryRuleBooleanPostTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanPostTransaction = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:928:2: (iv_ruleBooleanPostTransaction= ruleBooleanPostTransaction EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:929:2: iv_ruleBooleanPostTransaction= ruleBooleanPostTransaction EOF
            {
             newCompositeNode(grammarAccess.getBooleanPostTransactionRule()); 
            pushFollow(FOLLOW_ruleBooleanPostTransaction_in_entryRuleBooleanPostTransaction2101);
            iv_ruleBooleanPostTransaction=ruleBooleanPostTransaction();

            state._fsp--;

             current =iv_ruleBooleanPostTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanPostTransaction2111); 

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
    // $ANTLR end "entryRuleBooleanPostTransaction"


    // $ANTLR start "ruleBooleanPostTransaction"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:936:1: ruleBooleanPostTransaction returns [EObject current=null] : (otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= ruleBOOL ) ) ) ;
    public final EObject ruleBooleanPostTransaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:939:28: ( (otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= ruleBOOL ) ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:940:1: (otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= ruleBOOL ) ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:940:1: (otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= ruleBOOL ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:940:3: otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= ruleBOOL ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleBooleanPostTransaction2148); 

                	newLeafNode(otherlv_0, grammarAccess.getBooleanPostTransactionAccess().getNextKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleBooleanPostTransaction2160); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanPostTransactionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:948:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:949:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:949:1: (otherlv_2= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:950:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanPostTransactionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanPostTransaction2180); 

            		newLeafNode(otherlv_2, grammarAccess.getBooleanPostTransactionAccess().getVarBooleanDeclarionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleBooleanPostTransaction2192); 

                	newLeafNode(otherlv_3, grammarAccess.getBooleanPostTransactionAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleBooleanPostTransaction2204); 

                	newLeafNode(otherlv_4, grammarAccess.getBooleanPostTransactionAccess().getEqualsSignKeyword_4());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:969:1: ( (lv_value_5_0= ruleBOOL ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:970:1: (lv_value_5_0= ruleBOOL )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:970:1: (lv_value_5_0= ruleBOOL )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:971:3: lv_value_5_0= ruleBOOL
            {
             
            	        newCompositeNode(grammarAccess.getBooleanPostTransactionAccess().getValueBOOLParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanPostTransaction2225);
            lv_value_5_0=ruleBOOL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanPostTransactionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"BOOL");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleBooleanPostTransaction"


    // $ANTLR start "entryRuleIntegerPostTransaction"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:995:1: entryRuleIntegerPostTransaction returns [EObject current=null] : iv_ruleIntegerPostTransaction= ruleIntegerPostTransaction EOF ;
    public final EObject entryRuleIntegerPostTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerPostTransaction = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:996:2: (iv_ruleIntegerPostTransaction= ruleIntegerPostTransaction EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:997:2: iv_ruleIntegerPostTransaction= ruleIntegerPostTransaction EOF
            {
             newCompositeNode(grammarAccess.getIntegerPostTransactionRule()); 
            pushFollow(FOLLOW_ruleIntegerPostTransaction_in_entryRuleIntegerPostTransaction2261);
            iv_ruleIntegerPostTransaction=ruleIntegerPostTransaction();

            state._fsp--;

             current =iv_ruleIntegerPostTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerPostTransaction2271); 

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
    // $ANTLR end "entryRuleIntegerPostTransaction"


    // $ANTLR start "ruleIntegerPostTransaction"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1004:1: ruleIntegerPostTransaction returns [EObject current=null] : (otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerPostTransaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1007:28: ( (otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1008:1: (otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1008:1: (otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1008:3: otherlv_0= 'next' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '=' ( (lv_value_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleIntegerPostTransaction2308); 

                	newLeafNode(otherlv_0, grammarAccess.getIntegerPostTransactionAccess().getNextKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleIntegerPostTransaction2320); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerPostTransactionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1016:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1017:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1017:1: (otherlv_2= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1018:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerPostTransactionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerPostTransaction2340); 

            		newLeafNode(otherlv_2, grammarAccess.getIntegerPostTransactionAccess().getVarIntegerDeclarionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleIntegerPostTransaction2352); 

                	newLeafNode(otherlv_3, grammarAccess.getIntegerPostTransactionAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleIntegerPostTransaction2364); 

                	newLeafNode(otherlv_4, grammarAccess.getIntegerPostTransactionAccess().getEqualsSignKeyword_4());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1037:1: ( (lv_value_5_0= RULE_INT ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1038:1: (lv_value_5_0= RULE_INT )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1038:1: (lv_value_5_0= RULE_INT )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1039:3: lv_value_5_0= RULE_INT
            {
            lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerPostTransaction2381); 

            			newLeafNode(lv_value_5_0, grammarAccess.getIntegerPostTransactionAccess().getValueINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerPostTransactionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"INT");
            	    

            }


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
    // $ANTLR end "ruleIntegerPostTransaction"


    // $ANTLR start "entryRuleConditionalPostTRansaction"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1063:1: entryRuleConditionalPostTRansaction returns [EObject current=null] : iv_ruleConditionalPostTRansaction= ruleConditionalPostTRansaction EOF ;
    public final EObject entryRuleConditionalPostTRansaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalPostTRansaction = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1064:2: (iv_ruleConditionalPostTRansaction= ruleConditionalPostTRansaction EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1065:2: iv_ruleConditionalPostTRansaction= ruleConditionalPostTRansaction EOF
            {
             newCompositeNode(grammarAccess.getConditionalPostTRansactionRule()); 
            pushFollow(FOLLOW_ruleConditionalPostTRansaction_in_entryRuleConditionalPostTRansaction2422);
            iv_ruleConditionalPostTRansaction=ruleConditionalPostTRansaction();

            state._fsp--;

             current =iv_ruleConditionalPostTRansaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalPostTRansaction2432); 

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
    // $ANTLR end "entryRuleConditionalPostTRansaction"


    // $ANTLR start "ruleConditionalPostTRansaction"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1072:1: ruleConditionalPostTRansaction returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleConditionalPostTRansaction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1075:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1076:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1076:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1077:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1077:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1078:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConditionalPostTRansaction2473); 

            			newLeafNode(lv_name_0_0, grammarAccess.getConditionalPostTRansactionAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionalPostTRansactionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleConditionalPostTRansaction"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1102:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1103:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1104:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2513);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration2523); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1111:1: ruleVariableDeclaration returns [EObject current=null] : (this_IntegerDeclarion_0= ruleIntegerDeclarion | this_BooleanDeclarion_1= ruleBooleanDeclarion | this_StateVariableDeclaration_2= ruleStateVariableDeclaration | this_Comment_3= ruleComment ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerDeclarion_0 = null;

        EObject this_BooleanDeclarion_1 = null;

        EObject this_StateVariableDeclaration_2 = null;

        EObject this_Comment_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1114:28: ( (this_IntegerDeclarion_0= ruleIntegerDeclarion | this_BooleanDeclarion_1= ruleBooleanDeclarion | this_StateVariableDeclaration_2= ruleStateVariableDeclaration | this_Comment_3= ruleComment ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1115:1: (this_IntegerDeclarion_0= ruleIntegerDeclarion | this_BooleanDeclarion_1= ruleBooleanDeclarion | this_StateVariableDeclaration_2= ruleStateVariableDeclaration | this_Comment_3= ruleComment )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1115:1: (this_IntegerDeclarion_0= ruleIntegerDeclarion | this_BooleanDeclarion_1= ruleBooleanDeclarion | this_StateVariableDeclaration_2= ruleStateVariableDeclaration | this_Comment_3= ruleComment )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==21) ) {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        alt11=2;
                        }
                        break;
                    case 22:
                        {
                        alt11=1;
                        }
                        break;
                    case 25:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==RULE_SMV_COMMENT) ) {
                alt11=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1116:5: this_IntegerDeclarion_0= ruleIntegerDeclarion
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDeclarationAccess().getIntegerDeclarionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerDeclarion_in_ruleVariableDeclaration2570);
                    this_IntegerDeclarion_0=ruleIntegerDeclarion();

                    state._fsp--;

                     
                            current = this_IntegerDeclarion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1126:5: this_BooleanDeclarion_1= ruleBooleanDeclarion
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDeclarationAccess().getBooleanDeclarionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanDeclarion_in_ruleVariableDeclaration2597);
                    this_BooleanDeclarion_1=ruleBooleanDeclarion();

                    state._fsp--;

                     
                            current = this_BooleanDeclarion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1136:5: this_StateVariableDeclaration_2= ruleStateVariableDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDeclarationAccess().getStateVariableDeclarationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStateVariableDeclaration_in_ruleVariableDeclaration2624);
                    this_StateVariableDeclaration_2=ruleStateVariableDeclaration();

                    state._fsp--;

                     
                            current = this_StateVariableDeclaration_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1146:5: this_Comment_3= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDeclarationAccess().getCommentParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleVariableDeclaration2651);
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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1162:1: entryRuleIntegerDeclarion returns [EObject current=null] : iv_ruleIntegerDeclarion= ruleIntegerDeclarion EOF ;
    public final EObject entryRuleIntegerDeclarion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerDeclarion = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1163:2: (iv_ruleIntegerDeclarion= ruleIntegerDeclarion EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1164:2: iv_ruleIntegerDeclarion= ruleIntegerDeclarion EOF
            {
             newCompositeNode(grammarAccess.getIntegerDeclarionRule()); 
            pushFollow(FOLLOW_ruleIntegerDeclarion_in_entryRuleIntegerDeclarion2686);
            iv_ruleIntegerDeclarion=ruleIntegerDeclarion();

            state._fsp--;

             current =iv_ruleIntegerDeclarion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerDeclarion2696); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1171:1: ruleIntegerDeclarion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';' ) ;
    public final EObject ruleIntegerDeclarion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1174:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1175:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1175:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1175:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';'
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1175:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1176:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1176:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1177:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerDeclarion2738); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleIntegerDeclarion2755); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerDeclarionAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleIntegerDeclarion2767); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerDeclarionAccess().getIntegerKeyword_2());
                
            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleIntegerDeclarion2779); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1213:1: entryRuleBooleanDeclarion returns [EObject current=null] : iv_ruleBooleanDeclarion= ruleBooleanDeclarion EOF ;
    public final EObject entryRuleBooleanDeclarion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanDeclarion = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1214:2: (iv_ruleBooleanDeclarion= ruleBooleanDeclarion EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1215:2: iv_ruleBooleanDeclarion= ruleBooleanDeclarion EOF
            {
             newCompositeNode(grammarAccess.getBooleanDeclarionRule()); 
            pushFollow(FOLLOW_ruleBooleanDeclarion_in_entryRuleBooleanDeclarion2815);
            iv_ruleBooleanDeclarion=ruleBooleanDeclarion();

            state._fsp--;

             current =iv_ruleBooleanDeclarion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanDeclarion2825); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1222:1: ruleBooleanDeclarion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';' ) ;
    public final EObject ruleBooleanDeclarion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1225:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1226:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1226:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1226:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';'
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1226:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1227:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1227:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1228:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanDeclarion2867); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleBooleanDeclarion2884); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanDeclarionAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleBooleanDeclarion2896); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanDeclarionAccess().getBooleanKeyword_2());
                
            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleBooleanDeclarion2908); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1264:1: entryRuleStateVariableDeclaration returns [EObject current=null] : iv_ruleStateVariableDeclaration= ruleStateVariableDeclaration EOF ;
    public final EObject entryRuleStateVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateVariableDeclaration = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1265:2: (iv_ruleStateVariableDeclaration= ruleStateVariableDeclaration EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1266:2: iv_ruleStateVariableDeclaration= ruleStateVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStateVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration2944);
            iv_ruleStateVariableDeclaration=ruleStateVariableDeclaration();

            state._fsp--;

             current =iv_ruleStateVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateVariableDeclaration2954); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1273:1: ruleStateVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' ) ;
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
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1276:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1277:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1277:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1277:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';'
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1277:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1278:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1278:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1279:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateVariableDeclaration2996); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleStateVariableDeclaration3013); 

                	newLeafNode(otherlv_1, grammarAccess.getStateVariableDeclarationAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleStateVariableDeclaration3025); 

                	newLeafNode(otherlv_2, grammarAccess.getStateVariableDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1303:1: ( (lv_states_3_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1304:1: (lv_states_3_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1304:1: (lv_states_3_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1305:3: lv_states_3_0= RULE_ID
            {
            lv_states_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateVariableDeclaration3042); 

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

            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1321:2: (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1321:4: otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleStateVariableDeclaration3060); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStateVariableDeclarationAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1325:1: ( (lv_states_5_0= RULE_ID ) )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1326:1: (lv_states_5_0= RULE_ID )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1326:1: (lv_states_5_0= RULE_ID )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1327:3: lv_states_5_0= RULE_ID
            	    {
            	    lv_states_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateVariableDeclaration3077); 

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
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleStateVariableDeclaration3096); 

                	newLeafNode(otherlv_6, grammarAccess.getStateVariableDeclarationAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleStateVariableDeclaration3108); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1359:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1360:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1361:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
             newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression3144);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;

             current =iv_ruleAssignmentExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression3154); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1368:1: ruleAssignmentExpression returns [EObject current=null] : (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment | this_Comment_3= ruleComment ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerAssignment_0 = null;

        EObject this_BooleanAssignment_1 = null;

        EObject this_StateAssignment_2 = null;

        EObject this_Comment_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1371:28: ( (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment | this_Comment_3= ruleComment ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1372:1: (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment | this_Comment_3= ruleComment )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1372:1: (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment | this_Comment_3= ruleComment )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1373:5: this_IntegerAssignment_0= ruleIntegerAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getIntegerAssignmentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerAssignment_in_ruleAssignmentExpression3201);
                    this_IntegerAssignment_0=ruleIntegerAssignment();

                    state._fsp--;

                     
                            current = this_IntegerAssignment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1383:5: this_BooleanAssignment_1= ruleBooleanAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getBooleanAssignmentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanAssignment_in_ruleAssignmentExpression3228);
                    this_BooleanAssignment_1=ruleBooleanAssignment();

                    state._fsp--;

                     
                            current = this_BooleanAssignment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1393:5: this_StateAssignment_2= ruleStateAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getStateAssignmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStateAssignment_in_ruleAssignmentExpression3255);
                    this_StateAssignment_2=ruleStateAssignment();

                    state._fsp--;

                     
                            current = this_StateAssignment_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1403:5: this_Comment_3= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getCommentParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleAssignmentExpression3282);
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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1419:1: entryRuleBooleanAssignment returns [EObject current=null] : iv_ruleBooleanAssignment= ruleBooleanAssignment EOF ;
    public final EObject entryRuleBooleanAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAssignment = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1420:2: (iv_ruleBooleanAssignment= ruleBooleanAssignment EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1421:2: iv_ruleBooleanAssignment= ruleBooleanAssignment EOF
            {
             newCompositeNode(grammarAccess.getBooleanAssignmentRule()); 
            pushFollow(FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment3317);
            iv_ruleBooleanAssignment=ruleBooleanAssignment();

            state._fsp--;

             current =iv_ruleBooleanAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAssignment3327); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1428:1: ruleBooleanAssignment returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';' ) ;
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
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1431:28: ( (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1432:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1432:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1432:3: otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleBooleanAssignment3364); 

                	newLeafNode(otherlv_0, grammarAccess.getBooleanAssignmentAccess().getInitKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleBooleanAssignment3376); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanAssignmentAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1440:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1441:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1441:1: (otherlv_2= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1442:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanAssignmentRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanAssignment3396); 

            		newLeafNode(otherlv_2, grammarAccess.getBooleanAssignmentAccess().getVarBooleanDeclarionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleBooleanAssignment3408); 

                	newLeafNode(otherlv_3, grammarAccess.getBooleanAssignmentAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleBooleanAssignment3420); 

                	newLeafNode(otherlv_4, grammarAccess.getBooleanAssignmentAccess().getColonEqualsSignKeyword_4());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1461:1: ( (lv_value_5_0= ruleBOOL ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1462:1: (lv_value_5_0= ruleBOOL )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1462:1: (lv_value_5_0= ruleBOOL )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1463:3: lv_value_5_0= ruleBOOL
            {
             
            	        newCompositeNode(grammarAccess.getBooleanAssignmentAccess().getValueBOOLParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanAssignment3441);
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

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleBooleanAssignment3453); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1491:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1492:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1493:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL3490);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL3501); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1500:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'True' | kw= 'False' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1503:28: ( (kw= 'True' | kw= 'False' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1504:1: (kw= 'True' | kw= 'False' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1504:1: (kw= 'True' | kw= 'False' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1505:2: kw= 'True'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleBOOL3539); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1512:2: kw= 'False'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleBOOL3558); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1525:1: entryRuleIntegerAssignment returns [EObject current=null] : iv_ruleIntegerAssignment= ruleIntegerAssignment EOF ;
    public final EObject entryRuleIntegerAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerAssignment = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1526:2: (iv_ruleIntegerAssignment= ruleIntegerAssignment EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1527:2: iv_ruleIntegerAssignment= ruleIntegerAssignment EOF
            {
             newCompositeNode(grammarAccess.getIntegerAssignmentRule()); 
            pushFollow(FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment3598);
            iv_ruleIntegerAssignment=ruleIntegerAssignment();

            state._fsp--;

             current =iv_ruleIntegerAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerAssignment3608); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1534:1: ruleIntegerAssignment returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';' ) ;
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
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1537:28: ( (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1538:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1538:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1538:3: otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleIntegerAssignment3645); 

                	newLeafNode(otherlv_0, grammarAccess.getIntegerAssignmentAccess().getInitKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleIntegerAssignment3657); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerAssignmentAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1546:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1547:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1547:1: (otherlv_2= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1548:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerAssignmentRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerAssignment3677); 

            		newLeafNode(otherlv_2, grammarAccess.getIntegerAssignmentAccess().getVarIntegerDeclarionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleIntegerAssignment3689); 

                	newLeafNode(otherlv_3, grammarAccess.getIntegerAssignmentAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleIntegerAssignment3701); 

                	newLeafNode(otherlv_4, grammarAccess.getIntegerAssignmentAccess().getColonEqualsSignKeyword_4());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1567:1: ( (lv_value_5_0= RULE_INT ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1568:1: (lv_value_5_0= RULE_INT )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1568:1: (lv_value_5_0= RULE_INT )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1569:3: lv_value_5_0= RULE_INT
            {
            lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerAssignment3718); 

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

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleIntegerAssignment3735); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1597:1: entryRuleStateAssignment returns [EObject current=null] : iv_ruleStateAssignment= ruleStateAssignment EOF ;
    public final EObject entryRuleStateAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateAssignment = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1598:2: (iv_ruleStateAssignment= ruleStateAssignment EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1599:2: iv_ruleStateAssignment= ruleStateAssignment EOF
            {
             newCompositeNode(grammarAccess.getStateAssignmentRule()); 
            pushFollow(FOLLOW_ruleStateAssignment_in_entryRuleStateAssignment3771);
            iv_ruleStateAssignment=ruleStateAssignment();

            state._fsp--;

             current =iv_ruleStateAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateAssignment3781); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1606:1: ruleStateAssignment returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';' ) ;
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
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1609:28: ( (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1610:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1610:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1610:3: otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleStateAssignment3818); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAssignmentAccess().getInitKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleStateAssignment3830); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAssignmentAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1618:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1619:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1619:1: (otherlv_2= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1620:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStateAssignmentRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateAssignment3850); 

            		newLeafNode(otherlv_2, grammarAccess.getStateAssignmentAccess().getVarStateVariableDeclarationCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleStateAssignment3862); 

                	newLeafNode(otherlv_3, grammarAccess.getStateAssignmentAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleStateAssignment3874); 

                	newLeafNode(otherlv_4, grammarAccess.getStateAssignmentAccess().getColonEqualsSignKeyword_4());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1639:1: ( (lv_value_5_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1640:1: (lv_value_5_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1640:1: (lv_value_5_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:1641:3: lv_value_5_0= RULE_ID
            {
            lv_value_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateAssignment3891); 

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

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleStateAssignment3908); 

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


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\12\uffff";
    static final String DFA13_eofS =
        "\12\uffff";
    static final String DFA13_minS =
        "\1\4\1\23\1\uffff\1\6\1\24\1\35\1\6\3\uffff";
    static final String DFA13_maxS =
        "\1\34\1\23\1\uffff\1\6\1\24\1\35\1\37\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\4\4\uffff\1\3\1\1\1\2";
    static final String DFA13_specialS =
        "\12\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\27\uffff\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\1\10\26\uffff\2\11",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1372:1: (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment | this_Comment_3= ruleComment )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_ruleModel130 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesSection_in_ruleSection223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignments_in_ruleSection250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactions_in_ruleSection277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMV_COMMENT_in_ruleComment363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesSection_in_entryRuleVariablesSection403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablesSection413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVariablesSection450 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesSection471 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_ruleAssignments_in_entryRuleAssignments508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignments518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAssignments564 = new BitSet(new long[]{0x0000000010000050L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleAssignments585 = new BitSet(new long[]{0x0000000010000052L});
    public static final BitSet FOLLOW_ruleTransactions_in_entryRuleTransactions622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactions632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTransactions669 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleTransactionStatement_in_ruleTransactions690 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_ruleTransactionStatement_in_entryRuleTransactionStatement727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactionStatement737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactionPrecondition_in_ruleTransactionStatement783 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTransactionStatement795 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_rulePostTransaction_in_ruleTransactionStatement816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactionPrecondition_in_entryRuleTransactionPrecondition852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactionPrecondition862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreconditionStatement_in_ruleTransactionPrecondition908 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_AND_OR_in_ruleTransactionPrecondition926 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rulePreconditionStatement_in_ruleTransactionPrecondition952 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulePreconditionStatement_in_entryRulePreconditionStatement990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreconditionStatement1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerPrecondition_in_rulePreconditionStatement1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanPrecondition_in_rulePreconditionStatement1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatePrecondition_in_rulePreconditionStatement1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rulePreconditionStatement1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatePrecondition_in_entryRuleStatePrecondition1163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatePrecondition1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatePrecondition1218 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStatePrecondition1230 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatePrecondition1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanPrecondition_in_entryRuleBooleanPrecondition1288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanPrecondition1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanPrecondition1343 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBooleanPrecondition1355 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanPrecondition1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerPrecondition_in_entryRuleIntegerPrecondition1412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerPrecondition1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerPrecondition1467 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIntegerPrecondition1479 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerPrecondition1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostTransaction_in_entryRulePostTransaction1537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostTransaction1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostTransactionStatement_in_rulePostTransaction1593 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_AND_OR_in_rulePostTransaction1611 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_rulePostTransactionStatement_in_rulePostTransaction1637 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulePostTransactionStatement_in_entryRulePostTransactionStatement1675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostTransactionStatement1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalPostTRansaction_in_rulePostTransactionStatement1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimplePostTransaction_in_rulePostTransactionStatement1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimplePostTransaction_in_entryRuleSimplePostTransaction1794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimplePostTransaction1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerPostTransaction_in_ruleSimplePostTransaction1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanPostTransaction_in_ruleSimplePostTransaction1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatePostTransaction_in_ruleSimplePostTransaction1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatePostTransaction_in_entryRuleStatePostTransaction1940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatePostTransaction1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStatePostTransaction1987 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStatePostTransaction1999 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatePostTransaction2019 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatePostTransaction2031 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStatePostTransaction2043 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatePostTransaction2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanPostTransaction_in_entryRuleBooleanPostTransaction2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanPostTransaction2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBooleanPostTransaction2148 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBooleanPostTransaction2160 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanPostTransaction2180 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBooleanPostTransaction2192 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBooleanPostTransaction2204 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanPostTransaction2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerPostTransaction_in_entryRuleIntegerPostTransaction2261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerPostTransaction2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleIntegerPostTransaction2308 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIntegerPostTransaction2320 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerPostTransaction2340 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIntegerPostTransaction2352 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIntegerPostTransaction2364 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerPostTransaction2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalPostTRansaction_in_entryRuleConditionalPostTRansaction2422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalPostTRansaction2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConditionalPostTRansaction2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDeclarion_in_ruleVariableDeclaration2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDeclarion_in_ruleVariableDeclaration2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_ruleVariableDeclaration2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleVariableDeclaration2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDeclarion_in_entryRuleIntegerDeclarion2686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerDeclarion2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerDeclarion2738 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleIntegerDeclarion2755 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntegerDeclarion2767 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleIntegerDeclarion2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDeclarion_in_entryRuleBooleanDeclarion2815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanDeclarion2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanDeclarion2867 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBooleanDeclarion2884 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBooleanDeclarion2896 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBooleanDeclarion2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration2944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateVariableDeclaration2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateVariableDeclaration2996 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStateVariableDeclaration3013 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStateVariableDeclaration3025 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateVariableDeclaration3042 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleStateVariableDeclaration3060 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateVariableDeclaration3077 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27_in_ruleStateVariableDeclaration3096 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStateVariableDeclaration3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression3144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAssignment_in_ruleAssignmentExpression3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAssignment_in_ruleAssignmentExpression3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAssignment_in_ruleAssignmentExpression3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleAssignmentExpression3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment3317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAssignment3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBooleanAssignment3364 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBooleanAssignment3376 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanAssignment3396 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBooleanAssignment3408 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBooleanAssignment3420 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanAssignment3441 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBooleanAssignment3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL3490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBOOL3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBOOL3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment3598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerAssignment3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleIntegerAssignment3645 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIntegerAssignment3657 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerAssignment3677 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIntegerAssignment3689 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIntegerAssignment3701 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerAssignment3718 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleIntegerAssignment3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAssignment_in_entryRuleStateAssignment3771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateAssignment3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleStateAssignment3818 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStateAssignment3830 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateAssignment3850 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStateAssignment3862 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleStateAssignment3874 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateAssignment3891 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStateAssignment3908 = new BitSet(new long[]{0x0000000000000002L});

}