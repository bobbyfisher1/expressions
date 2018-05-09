package org.example.expressions.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.expressions.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'eval'", "'+'", "'-'", "'('", "')'", "'true'", "'false'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExpressions.g"; }



     	private ExpressionsGrammarAccess grammarAccess;

        public InternalExpressionsParser(TokenStream input, ExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ExpressionsModel";
       	}

       	@Override
       	protected ExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExpressionsModel"
    // InternalExpressions.g:64:1: entryRuleExpressionsModel returns [EObject current=null] : iv_ruleExpressionsModel= ruleExpressionsModel EOF ;
    public final EObject entryRuleExpressionsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionsModel = null;


        try {
            // InternalExpressions.g:64:57: (iv_ruleExpressionsModel= ruleExpressionsModel EOF )
            // InternalExpressions.g:65:2: iv_ruleExpressionsModel= ruleExpressionsModel EOF
            {
             newCompositeNode(grammarAccess.getExpressionsModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionsModel=ruleExpressionsModel();

            state._fsp--;

             current =iv_ruleExpressionsModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpressionsModel"


    // $ANTLR start "ruleExpressionsModel"
    // InternalExpressions.g:71:1: ruleExpressionsModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleExpressionsModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalExpressions.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalExpressions.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExpressions.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalExpressions.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalExpressions.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getExpressionsModelAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getExpressionsModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.example.expressions.Expressions.AbstractElement");
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
    // $ANTLR end "ruleExpressionsModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalExpressions.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalExpressions.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalExpressions.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalExpressions.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_Variable_0= ruleVariable | this_EvalExpression_1= ruleEvalExpression ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_EvalExpression_1 = null;



        	enterRule();

        try {
            // InternalExpressions.g:113:2: ( (this_Variable_0= ruleVariable | this_EvalExpression_1= ruleEvalExpression ) )
            // InternalExpressions.g:114:2: (this_Variable_0= ruleVariable | this_EvalExpression_1= ruleEvalExpression )
            {
            // InternalExpressions.g:114:2: (this_Variable_0= ruleVariable | this_EvalExpression_1= ruleEvalExpression )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
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
                    // InternalExpressions.g:115:3: this_Variable_0= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_0=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExpressions.g:124:3: this_EvalExpression_1= ruleEvalExpression
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getEvalExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvalExpression_1=ruleEvalExpression();

                    state._fsp--;


                    			current = this_EvalExpression_1;
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleVariable"
    // InternalExpressions.g:136:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalExpressions.g:136:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalExpressions.g:137:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalExpressions.g:143:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:149:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalExpressions.g:150:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalExpressions.g:150:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalExpressions.g:151:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalExpressions.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExpressions.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExpressions.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalExpressions.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalExpressions.g:177:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalExpressions.g:178:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalExpressions.g:178:4: (lv_expression_3_0= ruleExpression )
            // InternalExpressions.g:179:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.example.expressions.Expressions.Expression");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEvalExpression"
    // InternalExpressions.g:200:1: entryRuleEvalExpression returns [EObject current=null] : iv_ruleEvalExpression= ruleEvalExpression EOF ;
    public final EObject entryRuleEvalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvalExpression = null;


        try {
            // InternalExpressions.g:200:55: (iv_ruleEvalExpression= ruleEvalExpression EOF )
            // InternalExpressions.g:201:2: iv_ruleEvalExpression= ruleEvalExpression EOF
            {
             newCompositeNode(grammarAccess.getEvalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvalExpression=ruleEvalExpression();

            state._fsp--;

             current =iv_ruleEvalExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvalExpression"


    // $ANTLR start "ruleEvalExpression"
    // InternalExpressions.g:207:1: ruleEvalExpression returns [EObject current=null] : (otherlv_0= 'eval' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleEvalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:213:2: ( (otherlv_0= 'eval' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalExpressions.g:214:2: (otherlv_0= 'eval' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalExpressions.g:214:2: (otherlv_0= 'eval' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalExpressions.g:215:3: otherlv_0= 'eval' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEvalExpressionAccess().getEvalKeyword_0());
            		
            // InternalExpressions.g:219:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalExpressions.g:220:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalExpressions.g:220:4: (lv_expression_1_0= ruleExpression )
            // InternalExpressions.g:221:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getEvalExpressionAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvalExpressionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.example.expressions.Expressions.Expression");
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
    // $ANTLR end "ruleEvalExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalExpressions.g:242:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalExpressions.g:242:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalExpressions.g:243:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalExpressions.g:249:1: ruleExpression returns [EObject current=null] : (this_Atomic_0= ruleAtomic ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Atomic_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalExpressions.g:255:2: ( (this_Atomic_0= ruleAtomic ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) ) )* ) )
            // InternalExpressions.g:256:2: (this_Atomic_0= ruleAtomic ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) ) )* )
            {
            // InternalExpressions.g:256:2: (this_Atomic_0= ruleAtomic ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) ) )* )
            // InternalExpressions.g:257:3: this_Atomic_0= ruleAtomic ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getAtomicParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Atomic_0=ruleAtomic();

            state._fsp--;


            			current = this_Atomic_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExpressions.g:265:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExpressions.g:266:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleAtomic ) )
            	    {
            	    // InternalExpressions.g:266:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==14) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==15) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalExpressions.g:267:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalExpressions.g:267:5: ( () otherlv_2= '+' )
            	            // InternalExpressions.g:268:6: () otherlv_2= '+'
            	            {
            	            // InternalExpressions.g:268:6: ()
            	            // InternalExpressions.g:269:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalExpressions.g:281:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalExpressions.g:281:5: ( () otherlv_4= '-' )
            	            // InternalExpressions.g:282:6: () otherlv_4= '-'
            	            {
            	            // InternalExpressions.g:282:6: ()
            	            // InternalExpressions.g:283:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,15,FOLLOW_6); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalExpressions.g:295:4: ( (lv_right_5_0= ruleAtomic ) )
            	    // InternalExpressions.g:296:5: (lv_right_5_0= ruleAtomic )
            	    {
            	    // InternalExpressions.g:296:5: (lv_right_5_0= ruleAtomic )
            	    // InternalExpressions.g:297:6: lv_right_5_0= ruleAtomic
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightAtomicParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_5_0=ruleAtomic();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.example.expressions.Expressions.Atomic");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAtomic"
    // InternalExpressions.g:319:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalExpressions.g:319:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalExpressions.g:320:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalExpressions.g:326:1: ruleAtomic returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Token lv_value_8_1=null;
        Token lv_value_8_2=null;
        Token otherlv_10=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalExpressions.g:332:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) ) )
            // InternalExpressions.g:333:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) )
            {
            // InternalExpressions.g:333:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (otherlv_10= RULE_ID ) ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case 18:
            case 19:
                {
                alt6=4;
                }
                break;
            case RULE_ID:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalExpressions.g:334:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalExpressions.g:334:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalExpressions.g:335:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:353:3: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // InternalExpressions.g:353:3: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // InternalExpressions.g:354:4: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // InternalExpressions.g:354:4: ()
                    // InternalExpressions.g:355:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalExpressions.g:361:4: ( (lv_value_4_0= RULE_INT ) )
                    // InternalExpressions.g:362:5: (lv_value_4_0= RULE_INT )
                    {
                    // InternalExpressions.g:362:5: (lv_value_4_0= RULE_INT )
                    // InternalExpressions.g:363:6: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:381:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // InternalExpressions.g:381:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // InternalExpressions.g:382:4: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // InternalExpressions.g:382:4: ()
                    // InternalExpressions.g:383:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalExpressions.g:389:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalExpressions.g:390:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalExpressions.g:390:5: (lv_value_6_0= RULE_STRING )
                    // InternalExpressions.g:391:6: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_6_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalExpressions.g:409:3: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    {
                    // InternalExpressions.g:409:3: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    // InternalExpressions.g:410:4: () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    {
                    // InternalExpressions.g:410:4: ()
                    // InternalExpressions.g:411:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalExpressions.g:417:4: ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    // InternalExpressions.g:418:5: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    {
                    // InternalExpressions.g:418:5: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    // InternalExpressions.g:419:6: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    {
                    // InternalExpressions.g:419:6: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==18) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==19) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalExpressions.g:420:7: lv_value_8_1= 'true'
                            {
                            lv_value_8_1=(Token)match(input,18,FOLLOW_2); 

                            							newLeafNode(lv_value_8_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalExpressions.g:431:7: lv_value_8_2= 'false'
                            {
                            lv_value_8_2=(Token)match(input,19,FOLLOW_2); 

                            							newLeafNode(lv_value_8_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_8_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalExpressions.g:446:3: ( () ( (otherlv_10= RULE_ID ) ) )
                    {
                    // InternalExpressions.g:446:3: ( () ( (otherlv_10= RULE_ID ) ) )
                    // InternalExpressions.g:447:4: () ( (otherlv_10= RULE_ID ) )
                    {
                    // InternalExpressions.g:447:4: ()
                    // InternalExpressions.g:448:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_4_0(),
                    						current);
                    				

                    }

                    // InternalExpressions.g:454:4: ( (otherlv_10= RULE_ID ) )
                    // InternalExpressions.g:455:5: (otherlv_10= RULE_ID )
                    {
                    // InternalExpressions.g:455:5: (otherlv_10= RULE_ID )
                    // InternalExpressions.g:456:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_10, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_4_1_0());
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000D0070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});

}