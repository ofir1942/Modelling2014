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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VAR'", "'ASSIGN'", "':'", "'integer'", "';'", "'boolean'", "'{'", "','", "'}'", "'init'", "'('", "')'", "':='", "'True'", "'False'"
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

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
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

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
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


    // $ANTLR start "entryRuleVariablesSection"
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:146:1: entryRuleVariablesSection returns [EObject current=null] : iv_ruleVariablesSection= ruleVariablesSection EOF ;
    public final EObject entryRuleVariablesSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesSection = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:147:2: (iv_ruleVariablesSection= ruleVariablesSection EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:148:2: iv_ruleVariablesSection= ruleVariablesSection EOF
            {
             newCompositeNode(grammarAccess.getVariablesSectionRule()); 
            pushFollow(FOLLOW_ruleVariablesSection_in_entryRuleVariablesSection285);
            iv_ruleVariablesSection=ruleVariablesSection();

            state._fsp--;

             current =iv_ruleVariablesSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablesSection295); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:155:1: ruleVariablesSection returns [EObject current=null] : ( () otherlv_1= 'VAR' ( (lv_variables_2_0= ruleVariableDeclaration ) )+ ) ;
    public final EObject ruleVariablesSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variables_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:158:28: ( ( () otherlv_1= 'VAR' ( (lv_variables_2_0= ruleVariableDeclaration ) )+ ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:159:1: ( () otherlv_1= 'VAR' ( (lv_variables_2_0= ruleVariableDeclaration ) )+ )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:159:1: ( () otherlv_1= 'VAR' ( (lv_variables_2_0= ruleVariableDeclaration ) )+ )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:159:2: () otherlv_1= 'VAR' ( (lv_variables_2_0= ruleVariableDeclaration ) )+
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:159:2: ()
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:160:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariablesSectionAccess().getVariablesSectionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleVariablesSection341); 

                	newLeafNode(otherlv_1, grammarAccess.getVariablesSectionAccess().getVARKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:169:1: ( (lv_variables_2_0= ruleVariableDeclaration ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:170:1: (lv_variables_2_0= ruleVariableDeclaration )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:170:1: (lv_variables_2_0= ruleVariableDeclaration )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:171:3: lv_variables_2_0= ruleVariableDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariablesSectionAccess().getVariablesVariableDeclarationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariablesSection362);
            	    lv_variables_2_0=ruleVariableDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariablesSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_2_0, 
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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:195:1: entryRuleAssignments returns [EObject current=null] : iv_ruleAssignments= ruleAssignments EOF ;
    public final EObject entryRuleAssignments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignments = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:196:2: (iv_ruleAssignments= ruleAssignments EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:197:2: iv_ruleAssignments= ruleAssignments EOF
            {
             newCompositeNode(grammarAccess.getAssignmentsRule()); 
            pushFollow(FOLLOW_ruleAssignments_in_entryRuleAssignments399);
            iv_ruleAssignments=ruleAssignments();

            state._fsp--;

             current =iv_ruleAssignments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignments409); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:204:1: ruleAssignments returns [EObject current=null] : ( () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+ ) ;
    public final EObject ruleAssignments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_assignments_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:207:28: ( ( () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+ ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:208:1: ( () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+ )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:208:1: ( () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+ )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:208:2: () otherlv_1= 'ASSIGN' ( (lv_assignments_2_0= ruleAssignmentExpression ) )+
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:208:2: ()
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:209:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssignmentsAccess().getAssignmentsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAssignments455); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentsAccess().getASSIGNKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:218:1: ( (lv_assignments_2_0= ruleAssignmentExpression ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:219:1: (lv_assignments_2_0= ruleAssignmentExpression )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:219:1: (lv_assignments_2_0= ruleAssignmentExpression )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:220:3: lv_assignments_2_0= ruleAssignmentExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssignmentsAccess().getAssignmentsAssignmentExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleAssignments476);
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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:244:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:245:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:246:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration513);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration523); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:253:1: ruleVariableDeclaration returns [EObject current=null] : (this_IntegerDeclarion_0= ruleIntegerDeclarion | this_BooleanDeclarion_1= ruleBooleanDeclarion | this_StateVariableDeclaration_2= ruleStateVariableDeclaration ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerDeclarion_0 = null;

        EObject this_BooleanDeclarion_1 = null;

        EObject this_StateVariableDeclaration_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:256:28: ( (this_IntegerDeclarion_0= ruleIntegerDeclarion | this_BooleanDeclarion_1= ruleBooleanDeclarion | this_StateVariableDeclaration_2= ruleStateVariableDeclaration ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:257:1: (this_IntegerDeclarion_0= ruleIntegerDeclarion | this_BooleanDeclarion_1= ruleBooleanDeclarion | this_StateVariableDeclaration_2= ruleStateVariableDeclaration )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:257:1: (this_IntegerDeclarion_0= ruleIntegerDeclarion | this_BooleanDeclarion_1= ruleBooleanDeclarion | this_StateVariableDeclaration_2= ruleStateVariableDeclaration )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==13) ) {
                    switch ( input.LA(3) ) {
                    case 17:
                        {
                        alt5=3;
                        }
                        break;
                    case 16:
                        {
                        alt5=2;
                        }
                        break;
                    case 14:
                        {
                        alt5=1;
                        }
                        break;
                    default:
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
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:258:5: this_IntegerDeclarion_0= ruleIntegerDeclarion
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDeclarationAccess().getIntegerDeclarionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerDeclarion_in_ruleVariableDeclaration570);
                    this_IntegerDeclarion_0=ruleIntegerDeclarion();

                    state._fsp--;

                     
                            current = this_IntegerDeclarion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:268:5: this_BooleanDeclarion_1= ruleBooleanDeclarion
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDeclarationAccess().getBooleanDeclarionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanDeclarion_in_ruleVariableDeclaration597);
                    this_BooleanDeclarion_1=ruleBooleanDeclarion();

                    state._fsp--;

                     
                            current = this_BooleanDeclarion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:278:5: this_StateVariableDeclaration_2= ruleStateVariableDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getVariableDeclarationAccess().getStateVariableDeclarationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStateVariableDeclaration_in_ruleVariableDeclaration624);
                    this_StateVariableDeclaration_2=ruleStateVariableDeclaration();

                    state._fsp--;

                     
                            current = this_StateVariableDeclaration_2; 
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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:294:1: entryRuleIntegerDeclarion returns [EObject current=null] : iv_ruleIntegerDeclarion= ruleIntegerDeclarion EOF ;
    public final EObject entryRuleIntegerDeclarion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerDeclarion = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:295:2: (iv_ruleIntegerDeclarion= ruleIntegerDeclarion EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:296:2: iv_ruleIntegerDeclarion= ruleIntegerDeclarion EOF
            {
             newCompositeNode(grammarAccess.getIntegerDeclarionRule()); 
            pushFollow(FOLLOW_ruleIntegerDeclarion_in_entryRuleIntegerDeclarion659);
            iv_ruleIntegerDeclarion=ruleIntegerDeclarion();

            state._fsp--;

             current =iv_ruleIntegerDeclarion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerDeclarion669); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:303:1: ruleIntegerDeclarion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';' ) ;
    public final EObject ruleIntegerDeclarion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:306:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:307:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:307:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:307:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'integer' otherlv_3= ';'
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:307:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:308:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:308:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:309:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerDeclarion711); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleIntegerDeclarion728); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerDeclarionAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleIntegerDeclarion740); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerDeclarionAccess().getIntegerKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleIntegerDeclarion752); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:345:1: entryRuleBooleanDeclarion returns [EObject current=null] : iv_ruleBooleanDeclarion= ruleBooleanDeclarion EOF ;
    public final EObject entryRuleBooleanDeclarion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanDeclarion = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:346:2: (iv_ruleBooleanDeclarion= ruleBooleanDeclarion EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:347:2: iv_ruleBooleanDeclarion= ruleBooleanDeclarion EOF
            {
             newCompositeNode(grammarAccess.getBooleanDeclarionRule()); 
            pushFollow(FOLLOW_ruleBooleanDeclarion_in_entryRuleBooleanDeclarion788);
            iv_ruleBooleanDeclarion=ruleBooleanDeclarion();

            state._fsp--;

             current =iv_ruleBooleanDeclarion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanDeclarion798); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:354:1: ruleBooleanDeclarion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';' ) ;
    public final EObject ruleBooleanDeclarion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:357:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:358:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:358:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:358:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'boolean' otherlv_3= ';'
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:358:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:359:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:359:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:360:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanDeclarion840); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleBooleanDeclarion857); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanDeclarionAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleBooleanDeclarion869); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanDeclarionAccess().getBooleanKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleBooleanDeclarion881); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:396:1: entryRuleStateVariableDeclaration returns [EObject current=null] : iv_ruleStateVariableDeclaration= ruleStateVariableDeclaration EOF ;
    public final EObject entryRuleStateVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateVariableDeclaration = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:397:2: (iv_ruleStateVariableDeclaration= ruleStateVariableDeclaration EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:398:2: iv_ruleStateVariableDeclaration= ruleStateVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStateVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration917);
            iv_ruleStateVariableDeclaration=ruleStateVariableDeclaration();

            state._fsp--;

             current =iv_ruleStateVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateVariableDeclaration927); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:405:1: ruleStateVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' ) ;
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
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:408:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:409:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:409:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:409:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' ( (lv_states_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';'
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:409:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:410:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:410:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:411:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateVariableDeclaration969); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleStateVariableDeclaration986); 

                	newLeafNode(otherlv_1, grammarAccess.getStateVariableDeclarationAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStateVariableDeclaration998); 

                	newLeafNode(otherlv_2, grammarAccess.getStateVariableDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:435:1: ( (lv_states_3_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:436:1: (lv_states_3_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:436:1: (lv_states_3_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:437:3: lv_states_3_0= RULE_ID
            {
            lv_states_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateVariableDeclaration1015); 

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

            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:453:2: (otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:453:4: otherlv_4= ',' ( (lv_states_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStateVariableDeclaration1033); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStateVariableDeclarationAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:457:1: ( (lv_states_5_0= RULE_ID ) )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:458:1: (lv_states_5_0= RULE_ID )
            	    {
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:458:1: (lv_states_5_0= RULE_ID )
            	    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:459:3: lv_states_5_0= RULE_ID
            	    {
            	    lv_states_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateVariableDeclaration1050); 

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

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleStateVariableDeclaration1069); 

                	newLeafNode(otherlv_6, grammarAccess.getStateVariableDeclarationAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleStateVariableDeclaration1081); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:491:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:492:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:493:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
             newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression1117);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;

             current =iv_ruleAssignmentExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression1127); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:500:1: ruleAssignmentExpression returns [EObject current=null] : (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerAssignment_0 = null;

        EObject this_BooleanAssignment_1 = null;

        EObject this_StateAssignment_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:503:28: ( (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:504:1: (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:504:1: (this_IntegerAssignment_0= ruleIntegerAssignment | this_BooleanAssignment_1= ruleBooleanAssignment | this_StateAssignment_2= ruleStateAssignment )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==21) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==RULE_ID) ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3==22) ) {
                            int LA7_4 = input.LA(5);

                            if ( (LA7_4==23) ) {
                                switch ( input.LA(6) ) {
                                case RULE_INT:
                                    {
                                    alt7=1;
                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    alt7=3;
                                    }
                                    break;
                                case 24:
                                case 25:
                                    {
                                    alt7=2;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 7, 5, input);

                                    throw nvae;
                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:505:5: this_IntegerAssignment_0= ruleIntegerAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getIntegerAssignmentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerAssignment_in_ruleAssignmentExpression1174);
                    this_IntegerAssignment_0=ruleIntegerAssignment();

                    state._fsp--;

                     
                            current = this_IntegerAssignment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:515:5: this_BooleanAssignment_1= ruleBooleanAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getBooleanAssignmentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanAssignment_in_ruleAssignmentExpression1201);
                    this_BooleanAssignment_1=ruleBooleanAssignment();

                    state._fsp--;

                     
                            current = this_BooleanAssignment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:525:5: this_StateAssignment_2= ruleStateAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getStateAssignmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStateAssignment_in_ruleAssignmentExpression1228);
                    this_StateAssignment_2=ruleStateAssignment();

                    state._fsp--;

                     
                            current = this_StateAssignment_2; 
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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:541:1: entryRuleBooleanAssignment returns [EObject current=null] : iv_ruleBooleanAssignment= ruleBooleanAssignment EOF ;
    public final EObject entryRuleBooleanAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAssignment = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:542:2: (iv_ruleBooleanAssignment= ruleBooleanAssignment EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:543:2: iv_ruleBooleanAssignment= ruleBooleanAssignment EOF
            {
             newCompositeNode(grammarAccess.getBooleanAssignmentRule()); 
            pushFollow(FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment1263);
            iv_ruleBooleanAssignment=ruleBooleanAssignment();

            state._fsp--;

             current =iv_ruleBooleanAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAssignment1273); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:550:1: ruleBooleanAssignment returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';' ) ;
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
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:553:28: ( (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:554:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:554:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:554:3: otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= ruleBOOL ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleBooleanAssignment1310); 

                	newLeafNode(otherlv_0, grammarAccess.getBooleanAssignmentAccess().getInitKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleBooleanAssignment1322); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanAssignmentAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:562:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:563:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:563:1: (otherlv_2= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:564:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanAssignmentRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanAssignment1342); 

            		newLeafNode(otherlv_2, grammarAccess.getBooleanAssignmentAccess().getVarBooleanDeclarionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleBooleanAssignment1354); 

                	newLeafNode(otherlv_3, grammarAccess.getBooleanAssignmentAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleBooleanAssignment1366); 

                	newLeafNode(otherlv_4, grammarAccess.getBooleanAssignmentAccess().getColonEqualsSignKeyword_4());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:583:1: ( (lv_value_5_0= ruleBOOL ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:584:1: (lv_value_5_0= ruleBOOL )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:584:1: (lv_value_5_0= ruleBOOL )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:585:3: lv_value_5_0= ruleBOOL
            {
             
            	        newCompositeNode(grammarAccess.getBooleanAssignmentAccess().getValueBOOLParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOL_in_ruleBooleanAssignment1387);
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleBooleanAssignment1399); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:613:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:614:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:615:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL1436);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL1447); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:622:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'True' | kw= 'False' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:625:28: ( (kw= 'True' | kw= 'False' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:626:1: (kw= 'True' | kw= 'False' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:626:1: (kw= 'True' | kw= 'False' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:627:2: kw= 'True'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleBOOL1485); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:634:2: kw= 'False'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleBOOL1504); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:647:1: entryRuleIntegerAssignment returns [EObject current=null] : iv_ruleIntegerAssignment= ruleIntegerAssignment EOF ;
    public final EObject entryRuleIntegerAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerAssignment = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:648:2: (iv_ruleIntegerAssignment= ruleIntegerAssignment EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:649:2: iv_ruleIntegerAssignment= ruleIntegerAssignment EOF
            {
             newCompositeNode(grammarAccess.getIntegerAssignmentRule()); 
            pushFollow(FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment1544);
            iv_ruleIntegerAssignment=ruleIntegerAssignment();

            state._fsp--;

             current =iv_ruleIntegerAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerAssignment1554); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:656:1: ruleIntegerAssignment returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';' ) ;
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
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:659:28: ( (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:660:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:660:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:660:3: otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleIntegerAssignment1591); 

                	newLeafNode(otherlv_0, grammarAccess.getIntegerAssignmentAccess().getInitKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleIntegerAssignment1603); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerAssignmentAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:668:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:669:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:669:1: (otherlv_2= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:670:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerAssignmentRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerAssignment1623); 

            		newLeafNode(otherlv_2, grammarAccess.getIntegerAssignmentAccess().getVarIntegerDeclarionCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleIntegerAssignment1635); 

                	newLeafNode(otherlv_3, grammarAccess.getIntegerAssignmentAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleIntegerAssignment1647); 

                	newLeafNode(otherlv_4, grammarAccess.getIntegerAssignmentAccess().getColonEqualsSignKeyword_4());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:689:1: ( (lv_value_5_0= RULE_INT ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:690:1: (lv_value_5_0= RULE_INT )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:690:1: (lv_value_5_0= RULE_INT )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:691:3: lv_value_5_0= RULE_INT
            {
            lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerAssignment1664); 

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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleIntegerAssignment1681); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:719:1: entryRuleStateAssignment returns [EObject current=null] : iv_ruleStateAssignment= ruleStateAssignment EOF ;
    public final EObject entryRuleStateAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateAssignment = null;


        try {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:720:2: (iv_ruleStateAssignment= ruleStateAssignment EOF )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:721:2: iv_ruleStateAssignment= ruleStateAssignment EOF
            {
             newCompositeNode(grammarAccess.getStateAssignmentRule()); 
            pushFollow(FOLLOW_ruleStateAssignment_in_entryRuleStateAssignment1717);
            iv_ruleStateAssignment=ruleStateAssignment();

            state._fsp--;

             current =iv_ruleStateAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateAssignment1727); 

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
    // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:728:1: ruleStateAssignment returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';' ) ;
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
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:731:28: ( (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';' ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:732:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';' )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:732:1: (otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';' )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:732:3: otherlv_0= 'init' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= ':=' ( (lv_value_5_0= RULE_ID ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleStateAssignment1764); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAssignmentAccess().getInitKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleStateAssignment1776); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAssignmentAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:740:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:741:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:741:1: (otherlv_2= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:742:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStateAssignmentRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateAssignment1796); 

            		newLeafNode(otherlv_2, grammarAccess.getStateAssignmentAccess().getVarStateVariableDeclarationCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleStateAssignment1808); 

                	newLeafNode(otherlv_3, grammarAccess.getStateAssignmentAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleStateAssignment1820); 

                	newLeafNode(otherlv_4, grammarAccess.getStateAssignmentAccess().getColonEqualsSignKeyword_4());
                
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:761:1: ( (lv_value_5_0= RULE_ID ) )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:762:1: (lv_value_5_0= RULE_ID )
            {
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:762:1: (lv_value_5_0= RULE_ID )
            // ../org.xtext.osy.extendedsmv/src-gen/org/xtext/osy/parser/antlr/internal/InternalExtendedSMV.g:763:3: lv_value_5_0= RULE_ID
            {
            lv_value_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateAssignment1837); 

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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleStateAssignment1854); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_ruleModel130 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesSection_in_ruleSection223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignments_in_ruleSection250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesSection_in_entryRuleVariablesSection285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablesSection295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleVariablesSection341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesSection362 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAssignments_in_entryRuleAssignments399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignments409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAssignments455 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleAssignments476 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDeclarion_in_ruleVariableDeclaration570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDeclarion_in_ruleVariableDeclaration597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_ruleVariableDeclaration624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDeclarion_in_entryRuleIntegerDeclarion659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerDeclarion669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerDeclarion711 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIntegerDeclarion728 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIntegerDeclarion740 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIntegerDeclarion752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanDeclarion_in_entryRuleBooleanDeclarion788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanDeclarion798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanDeclarion840 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBooleanDeclarion857 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBooleanDeclarion869 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBooleanDeclarion881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateVariableDeclaration927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateVariableDeclaration969 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStateVariableDeclaration986 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStateVariableDeclaration998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateVariableDeclaration1015 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleStateVariableDeclaration1033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateVariableDeclaration1050 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleStateVariableDeclaration1069 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStateVariableDeclaration1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression1117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAssignment_in_ruleAssignmentExpression1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAssignment_in_ruleAssignmentExpression1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAssignment_in_ruleAssignmentExpression1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAssignment1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBooleanAssignment1310 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBooleanAssignment1322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanAssignment1342 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBooleanAssignment1354 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBooleanAssignment1366 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleBooleanAssignment1387 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBooleanAssignment1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL1436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBOOL1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBOOL1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment1544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerAssignment1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleIntegerAssignment1591 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleIntegerAssignment1603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerAssignment1623 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntegerAssignment1635 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleIntegerAssignment1647 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerAssignment1664 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIntegerAssignment1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateAssignment_in_entryRuleStateAssignment1717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateAssignment1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleStateAssignment1764 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStateAssignment1776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateAssignment1796 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStateAssignment1808 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStateAssignment1820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateAssignment1837 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStateAssignment1854 = new BitSet(new long[]{0x0000000000000002L});

}