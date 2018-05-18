package org.example.smalljava.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.smalljava.services.SmallJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSmallJavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'extends'", "'{'", "'}'", "';'", "'('", "','", "')'", "'='", "'return'", "'if'", "'else'", "'.'", "'true'", "'false'", "'this'", "'null'", "'new'"
    };
    public static final int RULE_STRING=5;
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallJavaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallJava.g"; }



     	private SmallJavaGrammarAccess grammarAccess;

        public InternalSmallJavaParser(TokenStream input, SmallJavaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SJProgram";
       	}

       	@Override
       	protected SmallJavaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSJProgram"
    // InternalSmallJava.g:64:1: entryRuleSJProgram returns [EObject current=null] : iv_ruleSJProgram= ruleSJProgram EOF ;
    public final EObject entryRuleSJProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJProgram = null;


        try {
            // InternalSmallJava.g:64:50: (iv_ruleSJProgram= ruleSJProgram EOF )
            // InternalSmallJava.g:65:2: iv_ruleSJProgram= ruleSJProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJProgram=ruleSJProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJProgram"


    // $ANTLR start "ruleSJProgram"
    // InternalSmallJava.g:71:1: ruleSJProgram returns [EObject current=null] : ( (lv_classes_0_0= ruleSJClass ) )* ;
    public final EObject ruleSJProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_classes_0_0 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:77:2: ( ( (lv_classes_0_0= ruleSJClass ) )* )
            // InternalSmallJava.g:78:2: ( (lv_classes_0_0= ruleSJClass ) )*
            {
            // InternalSmallJava.g:78:2: ( (lv_classes_0_0= ruleSJClass ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmallJava.g:79:3: (lv_classes_0_0= ruleSJClass )
            	    {
            	    // InternalSmallJava.g:79:3: (lv_classes_0_0= ruleSJClass )
            	    // InternalSmallJava.g:80:4: lv_classes_0_0= ruleSJClass
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSJProgramAccess().getClassesSJClassParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_classes_0_0=ruleSJClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getSJProgramRule());
            	      				}
            	      				add(
            	      					current,
            	      					"classes",
            	      					lv_classes_0_0,
            	      					"org.example.smalljava.SmallJava.SJClass");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJProgram"


    // $ANTLR start "entryRuleSJClass"
    // InternalSmallJava.g:100:1: entryRuleSJClass returns [EObject current=null] : iv_ruleSJClass= ruleSJClass EOF ;
    public final EObject entryRuleSJClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJClass = null;


        try {
            // InternalSmallJava.g:100:48: (iv_ruleSJClass= ruleSJClass EOF )
            // InternalSmallJava.g:101:2: iv_ruleSJClass= ruleSJClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJClass=ruleSJClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJClass"


    // $ANTLR start "ruleSJClass"
    // InternalSmallJava.g:107:1: ruleSJClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleSJMember ) )* otherlv_6= '}' ) ;
    public final EObject ruleSJClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_5_0 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:113:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleSJMember ) )* otherlv_6= '}' ) )
            // InternalSmallJava.g:114:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleSJMember ) )* otherlv_6= '}' )
            {
            // InternalSmallJava.g:114:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleSJMember ) )* otherlv_6= '}' )
            // InternalSmallJava.g:115:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleSJMember ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSJClassAccess().getClassKeyword_0());
              		
            }
            // InternalSmallJava.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmallJava.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmallJava.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalSmallJava.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSJClassAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSJClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalSmallJava.g:137:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmallJava.g:138:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSJClassAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalSmallJava.g:142:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSmallJava.g:143:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSmallJava.g:143:5: (otherlv_3= RULE_ID )
                    // InternalSmallJava.g:144:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSJClassRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getSJClassAccess().getSuperclassSJClassCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSJClassAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalSmallJava.g:160:3: ( (lv_members_5_0= ruleSJMember ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmallJava.g:161:4: (lv_members_5_0= ruleSJMember )
            	    {
            	    // InternalSmallJava.g:161:4: (lv_members_5_0= ruleSJMember )
            	    // InternalSmallJava.g:162:5: lv_members_5_0= ruleSJMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSJClassAccess().getMembersSJMemberParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_members_5_0=ruleSJMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSJClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_5_0,
            	      						"org.example.smalljava.SmallJava.SJMember");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSJClassAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJClass"


    // $ANTLR start "entryRuleSJMember"
    // InternalSmallJava.g:187:1: entryRuleSJMember returns [EObject current=null] : iv_ruleSJMember= ruleSJMember EOF ;
    public final EObject entryRuleSJMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJMember = null;


        try {
            // InternalSmallJava.g:187:49: (iv_ruleSJMember= ruleSJMember EOF )
            // InternalSmallJava.g:188:2: iv_ruleSJMember= ruleSJMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJMember=ruleSJMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJMember"


    // $ANTLR start "ruleSJMember"
    // InternalSmallJava.g:194:1: ruleSJMember returns [EObject current=null] : (this_SJField_0= ruleSJField | this_SJMethod_1= ruleSJMethod ) ;
    public final EObject ruleSJMember() throws RecognitionException {
        EObject current = null;

        EObject this_SJField_0 = null;

        EObject this_SJMethod_1 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:200:2: ( (this_SJField_0= ruleSJField | this_SJMethod_1= ruleSJMethod ) )
            // InternalSmallJava.g:201:2: (this_SJField_0= ruleSJField | this_SJMethod_1= ruleSJMethod )
            {
            // InternalSmallJava.g:201:2: (this_SJField_0= ruleSJField | this_SJMethod_1= ruleSJMethod )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==16) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==15) ) {
                        alt4=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallJava.g:202:3: this_SJField_0= ruleSJField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSJMemberAccess().getSJFieldParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SJField_0=ruleSJField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SJField_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmallJava.g:211:3: this_SJMethod_1= ruleSJMethod
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSJMemberAccess().getSJMethodParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SJMethod_1=ruleSJMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SJMethod_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJMember"


    // $ANTLR start "entryRuleSJField"
    // InternalSmallJava.g:223:1: entryRuleSJField returns [EObject current=null] : iv_ruleSJField= ruleSJField EOF ;
    public final EObject entryRuleSJField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJField = null;


        try {
            // InternalSmallJava.g:223:48: (iv_ruleSJField= ruleSJField EOF )
            // InternalSmallJava.g:224:2: iv_ruleSJField= ruleSJField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJField=ruleSJField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJField"


    // $ANTLR start "ruleSJField"
    // InternalSmallJava.g:230:1: ruleSJField returns [EObject current=null] : (this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= ';' ) ;
    public final EObject ruleSJField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_SJTypedDeclaration_0 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:236:2: ( (this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= ';' ) )
            // InternalSmallJava.g:237:2: (this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= ';' )
            {
            // InternalSmallJava.g:237:2: (this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= ';' )
            // InternalSmallJava.g:238:3: this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= ';'
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getSJFieldRule());
              			}
              			newCompositeNode(grammarAccess.getSJFieldAccess().getSJTypedDeclarationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_SJTypedDeclaration_0=ruleSJTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SJTypedDeclaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSJFieldAccess().getSemicolonKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJField"


    // $ANTLR start "entryRuleSJMethod"
    // InternalSmallJava.g:257:1: entryRuleSJMethod returns [EObject current=null] : iv_ruleSJMethod= ruleSJMethod EOF ;
    public final EObject entryRuleSJMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJMethod = null;


        try {
            // InternalSmallJava.g:257:49: (iv_ruleSJMethod= ruleSJMethod EOF )
            // InternalSmallJava.g:258:2: iv_ruleSJMethod= ruleSJMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJMethod=ruleSJMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJMethod"


    // $ANTLR start "ruleSJMethod"
    // InternalSmallJava.g:264:1: ruleSJMethod returns [EObject current=null] : (this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleSJParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSJParameter ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleSJBlock ) ) ) ;
    public final EObject ruleSJMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_SJTypedDeclaration_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:270:2: ( (this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleSJParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSJParameter ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleSJBlock ) ) ) )
            // InternalSmallJava.g:271:2: (this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleSJParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSJParameter ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleSJBlock ) ) )
            {
            // InternalSmallJava.g:271:2: (this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleSJParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSJParameter ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleSJBlock ) ) )
            // InternalSmallJava.g:272:3: this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleSJParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSJParameter ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleSJBlock ) )
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getSJMethodRule());
              			}
              			newCompositeNode(grammarAccess.getSJMethodAccess().getSJTypedDeclarationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_SJTypedDeclaration_0=ruleSJTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SJTypedDeclaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSJMethodAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmallJava.g:287:3: ( ( (lv_params_2_0= ruleSJParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSJParameter ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallJava.g:288:4: ( (lv_params_2_0= ruleSJParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleSJParameter ) ) )*
                    {
                    // InternalSmallJava.g:288:4: ( (lv_params_2_0= ruleSJParameter ) )
                    // InternalSmallJava.g:289:5: (lv_params_2_0= ruleSJParameter )
                    {
                    // InternalSmallJava.g:289:5: (lv_params_2_0= ruleSJParameter )
                    // InternalSmallJava.g:290:6: lv_params_2_0= ruleSJParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_params_2_0=ruleSJParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSJMethodRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_2_0,
                      							"org.example.smalljava.SmallJava.SJParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalSmallJava.g:307:4: (otherlv_3= ',' ( (lv_params_4_0= ruleSJParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSmallJava.g:308:5: otherlv_3= ',' ( (lv_params_4_0= ruleSJParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getSJMethodAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalSmallJava.g:312:5: ( (lv_params_4_0= ruleSJParameter ) )
                    	    // InternalSmallJava.g:313:6: (lv_params_4_0= ruleSJParameter )
                    	    {
                    	    // InternalSmallJava.g:313:6: (lv_params_4_0= ruleSJParameter )
                    	    // InternalSmallJava.g:314:7: lv_params_4_0= ruleSJParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_params_4_0=ruleSJParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSJMethodRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"params",
                    	      								lv_params_4_0,
                    	      								"org.example.smalljava.SmallJava.SJParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSJMethodAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalSmallJava.g:337:3: ( (lv_body_6_0= ruleSJBlock ) )
            // InternalSmallJava.g:338:4: (lv_body_6_0= ruleSJBlock )
            {
            // InternalSmallJava.g:338:4: (lv_body_6_0= ruleSJBlock )
            // InternalSmallJava.g:339:5: lv_body_6_0= ruleSJBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSJMethodAccess().getBodySJBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_6_0=ruleSJBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSJMethodRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_6_0,
              						"org.example.smalljava.SmallJava.SJBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJMethod"


    // $ANTLR start "entryRuleSJParameter"
    // InternalSmallJava.g:360:1: entryRuleSJParameter returns [EObject current=null] : iv_ruleSJParameter= ruleSJParameter EOF ;
    public final EObject entryRuleSJParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJParameter = null;


        try {
            // InternalSmallJava.g:360:52: (iv_ruleSJParameter= ruleSJParameter EOF )
            // InternalSmallJava.g:361:2: iv_ruleSJParameter= ruleSJParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJParameter=ruleSJParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJParameter"


    // $ANTLR start "ruleSJParameter"
    // InternalSmallJava.g:367:1: ruleSJParameter returns [EObject current=null] : this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] ;
    public final EObject ruleSJParameter() throws RecognitionException {
        EObject current = null;

        EObject this_SJTypedDeclaration_0 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:373:2: (this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] )
            // InternalSmallJava.g:374:2: this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current]
            {
            if ( state.backtracking==0 ) {

              		if (current==null) {
              			current = createModelElement(grammarAccess.getSJParameterRule());
              		}
              		newCompositeNode(grammarAccess.getSJParameterAccess().getSJTypedDeclarationParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SJTypedDeclaration_0=ruleSJTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_SJTypedDeclaration_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJParameter"


    // $ANTLR start "entryRuleSJBlock"
    // InternalSmallJava.g:388:1: entryRuleSJBlock returns [EObject current=null] : iv_ruleSJBlock= ruleSJBlock EOF ;
    public final EObject entryRuleSJBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJBlock = null;


        try {
            // InternalSmallJava.g:388:48: (iv_ruleSJBlock= ruleSJBlock EOF )
            // InternalSmallJava.g:389:2: iv_ruleSJBlock= ruleSJBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJBlock=ruleSJBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJBlock"


    // $ANTLR start "ruleSJBlock"
    // InternalSmallJava.g:395:1: ruleSJBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleSJBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:401:2: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )* otherlv_3= '}' ) )
            // InternalSmallJava.g:402:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )* otherlv_3= '}' )
            {
            // InternalSmallJava.g:402:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )* otherlv_3= '}' )
            // InternalSmallJava.g:403:3: () otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )* otherlv_3= '}'
            {
            // InternalSmallJava.g:403:3: ()
            // InternalSmallJava.g:404:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSJBlockAccess().getSJBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSJBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalSmallJava.g:414:3: ( (lv_statements_2_0= ruleSJStatement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==16||(LA7_0>=20 && LA7_0<=21)||(LA7_0>=24 && LA7_0<=28)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmallJava.g:415:4: (lv_statements_2_0= ruleSJStatement )
            	    {
            	    // InternalSmallJava.g:415:4: (lv_statements_2_0= ruleSJStatement )
            	    // InternalSmallJava.g:416:5: lv_statements_2_0= ruleSJStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getSJBlockAccess().getStatementsSJStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_statements_2_0=ruleSJStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getSJBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_2_0,
            	      						"org.example.smalljava.SmallJava.SJStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSJBlockAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJBlock"


    // $ANTLR start "entryRuleSJStatement"
    // InternalSmallJava.g:441:1: entryRuleSJStatement returns [EObject current=null] : iv_ruleSJStatement= ruleSJStatement EOF ;
    public final EObject entryRuleSJStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJStatement = null;


        try {
            // InternalSmallJava.g:441:52: (iv_ruleSJStatement= ruleSJStatement EOF )
            // InternalSmallJava.g:442:2: iv_ruleSJStatement= ruleSJStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJStatement=ruleSJStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJStatement"


    // $ANTLR start "ruleSJStatement"
    // InternalSmallJava.g:448:1: ruleSJStatement returns [EObject current=null] : (this_SJVariableDeclaration_0= ruleSJVariableDeclaration | this_SJReturn_1= ruleSJReturn | (this_SJExpression_2= ruleSJExpression otherlv_3= ';' ) | this_SJIfStatement_4= ruleSJIfStatement ) ;
    public final EObject ruleSJStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_SJVariableDeclaration_0 = null;

        EObject this_SJReturn_1 = null;

        EObject this_SJExpression_2 = null;

        EObject this_SJIfStatement_4 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:454:2: ( (this_SJVariableDeclaration_0= ruleSJVariableDeclaration | this_SJReturn_1= ruleSJReturn | (this_SJExpression_2= ruleSJExpression otherlv_3= ';' ) | this_SJIfStatement_4= ruleSJIfStatement ) )
            // InternalSmallJava.g:455:2: (this_SJVariableDeclaration_0= ruleSJVariableDeclaration | this_SJReturn_1= ruleSJReturn | (this_SJExpression_2= ruleSJExpression otherlv_3= ';' ) | this_SJIfStatement_4= ruleSJIfStatement )
            {
            // InternalSmallJava.g:455:2: (this_SJVariableDeclaration_0= ruleSJVariableDeclaration | this_SJReturn_1= ruleSJReturn | (this_SJExpression_2= ruleSJExpression otherlv_3= ';' ) | this_SJIfStatement_4= ruleSJIfStatement )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    alt8=1;
                }
                else if ( (LA8_1==15||LA8_1==19||LA8_1==23) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 16:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSmallJava.g:456:3: this_SJVariableDeclaration_0= ruleSJVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSJStatementAccess().getSJVariableDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SJVariableDeclaration_0=ruleSJVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SJVariableDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmallJava.g:465:3: this_SJReturn_1= ruleSJReturn
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSJStatementAccess().getSJReturnParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SJReturn_1=ruleSJReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SJReturn_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalSmallJava.g:474:3: (this_SJExpression_2= ruleSJExpression otherlv_3= ';' )
                    {
                    // InternalSmallJava.g:474:3: (this_SJExpression_2= ruleSJExpression otherlv_3= ';' )
                    // InternalSmallJava.g:475:4: this_SJExpression_2= ruleSJExpression otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSJStatementAccess().getSJExpressionParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    this_SJExpression_2=ruleSJExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SJExpression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSJStatementAccess().getSemicolonKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalSmallJava.g:489:3: this_SJIfStatement_4= ruleSJIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSJStatementAccess().getSJIfStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SJIfStatement_4=ruleSJIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SJIfStatement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJStatement"


    // $ANTLR start "entryRuleSJVariableDeclaration"
    // InternalSmallJava.g:501:1: entryRuleSJVariableDeclaration returns [EObject current=null] : iv_ruleSJVariableDeclaration= ruleSJVariableDeclaration EOF ;
    public final EObject entryRuleSJVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJVariableDeclaration = null;


        try {
            // InternalSmallJava.g:501:62: (iv_ruleSJVariableDeclaration= ruleSJVariableDeclaration EOF )
            // InternalSmallJava.g:502:2: iv_ruleSJVariableDeclaration= ruleSJVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJVariableDeclaration=ruleSJVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJVariableDeclaration"


    // $ANTLR start "ruleSJVariableDeclaration"
    // InternalSmallJava.g:508:1: ruleSJVariableDeclaration returns [EObject current=null] : (this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleSJVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_SJTypedDeclaration_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:514:2: ( (this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ';' ) )
            // InternalSmallJava.g:515:2: (this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ';' )
            {
            // InternalSmallJava.g:515:2: (this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ';' )
            // InternalSmallJava.g:516:3: this_SJTypedDeclaration_0= ruleSJTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ';'
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getSJVariableDeclarationRule());
              			}
              			newCompositeNode(grammarAccess.getSJVariableDeclarationAccess().getSJTypedDeclarationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_SJTypedDeclaration_0=ruleSJTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SJTypedDeclaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSJVariableDeclarationAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalSmallJava.g:531:3: ( (lv_expression_2_0= ruleSJExpression ) )
            // InternalSmallJava.g:532:4: (lv_expression_2_0= ruleSJExpression )
            {
            // InternalSmallJava.g:532:4: (lv_expression_2_0= ruleSJExpression )
            // InternalSmallJava.g:533:5: lv_expression_2_0= ruleSJExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSJVariableDeclarationAccess().getExpressionSJExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_expression_2_0=ruleSJExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSJVariableDeclarationRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.example.smalljava.SmallJava.SJExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSJVariableDeclarationAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJVariableDeclaration"


    // $ANTLR start "entryRuleSJReturn"
    // InternalSmallJava.g:558:1: entryRuleSJReturn returns [EObject current=null] : iv_ruleSJReturn= ruleSJReturn EOF ;
    public final EObject entryRuleSJReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJReturn = null;


        try {
            // InternalSmallJava.g:558:49: (iv_ruleSJReturn= ruleSJReturn EOF )
            // InternalSmallJava.g:559:2: iv_ruleSJReturn= ruleSJReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJReturn=ruleSJReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJReturn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJReturn"


    // $ANTLR start "ruleSJReturn"
    // InternalSmallJava.g:565:1: ruleSJReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleSJExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleSJReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:571:2: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleSJExpression ) ) otherlv_2= ';' ) )
            // InternalSmallJava.g:572:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleSJExpression ) ) otherlv_2= ';' )
            {
            // InternalSmallJava.g:572:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleSJExpression ) ) otherlv_2= ';' )
            // InternalSmallJava.g:573:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleSJExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSJReturnAccess().getReturnKeyword_0());
              		
            }
            // InternalSmallJava.g:577:3: ( (lv_expression_1_0= ruleSJExpression ) )
            // InternalSmallJava.g:578:4: (lv_expression_1_0= ruleSJExpression )
            {
            // InternalSmallJava.g:578:4: (lv_expression_1_0= ruleSJExpression )
            // InternalSmallJava.g:579:5: lv_expression_1_0= ruleSJExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSJReturnAccess().getExpressionSJExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_expression_1_0=ruleSJExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSJReturnRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.example.smalljava.SmallJava.SJExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSJReturnAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJReturn"


    // $ANTLR start "entryRuleSJIfStatement"
    // InternalSmallJava.g:604:1: entryRuleSJIfStatement returns [EObject current=null] : iv_ruleSJIfStatement= ruleSJIfStatement EOF ;
    public final EObject entryRuleSJIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJIfStatement = null;


        try {
            // InternalSmallJava.g:604:54: (iv_ruleSJIfStatement= ruleSJIfStatement EOF )
            // InternalSmallJava.g:605:2: iv_ruleSJIfStatement= ruleSJIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJIfStatement=ruleSJIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJIfStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJIfStatement"


    // $ANTLR start "ruleSJIfStatement"
    // InternalSmallJava.g:611:1: ruleSJIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleSJIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) ) )? ) ;
    public final EObject ruleSJIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_thenBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:617:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleSJIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) ) )? ) )
            // InternalSmallJava.g:618:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleSJIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) ) )? )
            {
            // InternalSmallJava.g:618:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleSJIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) ) )? )
            // InternalSmallJava.g:619:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleSJIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSJIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSJIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalSmallJava.g:627:3: ( (lv_expression_2_0= ruleSJExpression ) )
            // InternalSmallJava.g:628:4: (lv_expression_2_0= ruleSJExpression )
            {
            // InternalSmallJava.g:628:4: (lv_expression_2_0= ruleSJExpression )
            // InternalSmallJava.g:629:5: lv_expression_2_0= ruleSJExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSJIfStatementAccess().getExpressionSJExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_expression_2_0=ruleSJExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSJIfStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.example.smalljava.SmallJava.SJExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSJIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalSmallJava.g:650:3: ( (lv_thenBlock_4_0= ruleSJIfBlock ) )
            // InternalSmallJava.g:651:4: (lv_thenBlock_4_0= ruleSJIfBlock )
            {
            // InternalSmallJava.g:651:4: (lv_thenBlock_4_0= ruleSJIfBlock )
            // InternalSmallJava.g:652:5: lv_thenBlock_4_0= ruleSJIfBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSJIfStatementAccess().getThenBlockSJIfBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_thenBlock_4_0=ruleSJIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSJIfStatementRule());
              					}
              					set(
              						current,
              						"thenBlock",
              						lv_thenBlock_4_0,
              						"org.example.smalljava.SmallJava.SJIfBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalSmallJava.g:669:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred1_InternalSmallJava()) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallJava.g:670:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) )
                    {
                    // InternalSmallJava.g:670:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalSmallJava.g:671:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getSJIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalSmallJava.g:677:4: ( (lv_elseBlock_6_0= ruleSJIfBlock ) )
                    // InternalSmallJava.g:678:5: (lv_elseBlock_6_0= ruleSJIfBlock )
                    {
                    // InternalSmallJava.g:678:5: (lv_elseBlock_6_0= ruleSJIfBlock )
                    // InternalSmallJava.g:679:6: lv_elseBlock_6_0= ruleSJIfBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSJIfStatementAccess().getElseBlockSJIfBlockParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_6_0=ruleSJIfBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSJIfStatementRule());
                      						}
                      						set(
                      							current,
                      							"elseBlock",
                      							lv_elseBlock_6_0,
                      							"org.example.smalljava.SmallJava.SJIfBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJIfStatement"


    // $ANTLR start "entryRuleSJIfBlock"
    // InternalSmallJava.g:701:1: entryRuleSJIfBlock returns [EObject current=null] : iv_ruleSJIfBlock= ruleSJIfBlock EOF ;
    public final EObject entryRuleSJIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJIfBlock = null;


        try {
            // InternalSmallJava.g:701:50: (iv_ruleSJIfBlock= ruleSJIfBlock EOF )
            // InternalSmallJava.g:702:2: iv_ruleSJIfBlock= ruleSJIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJIfBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJIfBlock=ruleSJIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJIfBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJIfBlock"


    // $ANTLR start "ruleSJIfBlock"
    // InternalSmallJava.g:708:1: ruleSJIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleSJStatement ) ) | this_SJBlock_1= ruleSJBlock ) ;
    public final EObject ruleSJIfBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject this_SJBlock_1 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:714:2: ( ( ( (lv_statements_0_0= ruleSJStatement ) ) | this_SJBlock_1= ruleSJBlock ) )
            // InternalSmallJava.g:715:2: ( ( (lv_statements_0_0= ruleSJStatement ) ) | this_SJBlock_1= ruleSJBlock )
            {
            // InternalSmallJava.g:715:2: ( ( (lv_statements_0_0= ruleSJStatement ) ) | this_SJBlock_1= ruleSJBlock )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==16||(LA10_0>=20 && LA10_0<=21)||(LA10_0>=24 && LA10_0<=28)) ) {
                alt10=1;
            }
            else if ( (LA10_0==13) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallJava.g:716:3: ( (lv_statements_0_0= ruleSJStatement ) )
                    {
                    // InternalSmallJava.g:716:3: ( (lv_statements_0_0= ruleSJStatement ) )
                    // InternalSmallJava.g:717:4: (lv_statements_0_0= ruleSJStatement )
                    {
                    // InternalSmallJava.g:717:4: (lv_statements_0_0= ruleSJStatement )
                    // InternalSmallJava.g:718:5: lv_statements_0_0= ruleSJStatement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSJIfBlockAccess().getStatementsSJStatementParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_statements_0_0=ruleSJStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSJIfBlockRule());
                      					}
                      					add(
                      						current,
                      						"statements",
                      						lv_statements_0_0,
                      						"org.example.smalljava.SmallJava.SJStatement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmallJava.g:736:3: this_SJBlock_1= ruleSJBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSJIfBlockAccess().getSJBlockParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SJBlock_1=ruleSJBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SJBlock_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJIfBlock"


    // $ANTLR start "entryRuleSJSymbol"
    // InternalSmallJava.g:748:1: entryRuleSJSymbol returns [EObject current=null] : iv_ruleSJSymbol= ruleSJSymbol EOF ;
    public final EObject entryRuleSJSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJSymbol = null;


        try {
            // InternalSmallJava.g:748:49: (iv_ruleSJSymbol= ruleSJSymbol EOF )
            // InternalSmallJava.g:749:2: iv_ruleSJSymbol= ruleSJSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJSymbol=ruleSJSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJSymbol; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJSymbol"


    // $ANTLR start "ruleSJSymbol"
    // InternalSmallJava.g:755:1: ruleSJSymbol returns [EObject current=null] : (this_SJVariableDeclaration_0= ruleSJVariableDeclaration | this_SJParameter_1= ruleSJParameter ) ;
    public final EObject ruleSJSymbol() throws RecognitionException {
        EObject current = null;

        EObject this_SJVariableDeclaration_0 = null;

        EObject this_SJParameter_1 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:761:2: ( (this_SJVariableDeclaration_0= ruleSJVariableDeclaration | this_SJParameter_1= ruleSJParameter ) )
            // InternalSmallJava.g:762:2: (this_SJVariableDeclaration_0= ruleSJVariableDeclaration | this_SJParameter_1= ruleSJParameter )
            {
            // InternalSmallJava.g:762:2: (this_SJVariableDeclaration_0= ruleSJVariableDeclaration | this_SJParameter_1= ruleSJParameter )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==19) ) {
                        alt11=1;
                    }
                    else if ( (LA11_2==EOF) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallJava.g:763:3: this_SJVariableDeclaration_0= ruleSJVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSJSymbolAccess().getSJVariableDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SJVariableDeclaration_0=ruleSJVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SJVariableDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalSmallJava.g:772:3: this_SJParameter_1= ruleSJParameter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSJSymbolAccess().getSJParameterParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SJParameter_1=ruleSJParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SJParameter_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJSymbol"


    // $ANTLR start "ruleSJTypedDeclaration"
    // InternalSmallJava.g:785:1: ruleSJTypedDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSJTypedDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSmallJava.g:791:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSmallJava.g:792:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSmallJava.g:792:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSmallJava.g:793:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalSmallJava.g:793:3: ( (otherlv_0= RULE_ID ) )
            // InternalSmallJava.g:794:4: (otherlv_0= RULE_ID )
            {
            // InternalSmallJava.g:794:4: (otherlv_0= RULE_ID )
            // InternalSmallJava.g:795:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSJTypedDeclarationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getSJTypedDeclarationAccess().getTypeSJClassCrossReference_0_0());
              				
            }

            }


            }

            // InternalSmallJava.g:806:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmallJava.g:807:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmallJava.g:807:4: (lv_name_1_0= RULE_ID )
            // InternalSmallJava.g:808:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSJTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSJTypedDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJTypedDeclaration"


    // $ANTLR start "entryRuleSJExpression"
    // InternalSmallJava.g:828:1: entryRuleSJExpression returns [EObject current=null] : iv_ruleSJExpression= ruleSJExpression EOF ;
    public final EObject entryRuleSJExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJExpression = null;


        try {
            // InternalSmallJava.g:828:53: (iv_ruleSJExpression= ruleSJExpression EOF )
            // InternalSmallJava.g:829:2: iv_ruleSJExpression= ruleSJExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJExpression=ruleSJExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJExpression"


    // $ANTLR start "ruleSJExpression"
    // InternalSmallJava.g:835:1: ruleSJExpression returns [EObject current=null] : this_SJAssignment_0= ruleSJAssignment ;
    public final EObject ruleSJExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SJAssignment_0 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:841:2: (this_SJAssignment_0= ruleSJAssignment )
            // InternalSmallJava.g:842:2: this_SJAssignment_0= ruleSJAssignment
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getSJExpressionAccess().getSJAssignmentParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SJAssignment_0=ruleSJAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_SJAssignment_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJExpression"


    // $ANTLR start "entryRuleSJAssignment"
    // InternalSmallJava.g:853:1: entryRuleSJAssignment returns [EObject current=null] : iv_ruleSJAssignment= ruleSJAssignment EOF ;
    public final EObject entryRuleSJAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJAssignment = null;


        try {
            // InternalSmallJava.g:853:53: (iv_ruleSJAssignment= ruleSJAssignment EOF )
            // InternalSmallJava.g:854:2: iv_ruleSJAssignment= ruleSJAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJAssignment=ruleSJAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJAssignment"


    // $ANTLR start "ruleSJAssignment"
    // InternalSmallJava.g:860:1: ruleSJAssignment returns [EObject current=null] : (this_SJSelectionExpression_0= ruleSJSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) ) )? ) ;
    public final EObject ruleSJAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SJSelectionExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:866:2: ( (this_SJSelectionExpression_0= ruleSJSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) ) )? ) )
            // InternalSmallJava.g:867:2: (this_SJSelectionExpression_0= ruleSJSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) ) )? )
            {
            // InternalSmallJava.g:867:2: (this_SJSelectionExpression_0= ruleSJSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) ) )? )
            // InternalSmallJava.g:868:3: this_SJSelectionExpression_0= ruleSJSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSJAssignmentAccess().getSJSelectionExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_SJSelectionExpression_0=ruleSJSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SJSelectionExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmallJava.g:876:3: ( () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmallJava.g:877:4: () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) )
                    {
                    // InternalSmallJava.g:877:4: ()
                    // InternalSmallJava.g:878:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSJAssignmentAccess().getEqualsSignKeyword_1_1());
                      			
                    }
                    // InternalSmallJava.g:888:4: ( (lv_right_3_0= ruleSJExpression ) )
                    // InternalSmallJava.g:889:5: (lv_right_3_0= ruleSJExpression )
                    {
                    // InternalSmallJava.g:889:5: (lv_right_3_0= ruleSJExpression )
                    // InternalSmallJava.g:890:6: lv_right_3_0= ruleSJExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSJAssignmentAccess().getRightSJExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleSJExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSJAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"org.example.smalljava.SmallJava.SJExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJAssignment"


    // $ANTLR start "entryRuleSJSelectionExpression"
    // InternalSmallJava.g:912:1: entryRuleSJSelectionExpression returns [EObject current=null] : iv_ruleSJSelectionExpression= ruleSJSelectionExpression EOF ;
    public final EObject entryRuleSJSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJSelectionExpression = null;


        try {
            // InternalSmallJava.g:912:62: (iv_ruleSJSelectionExpression= ruleSJSelectionExpression EOF )
            // InternalSmallJava.g:913:2: iv_ruleSJSelectionExpression= ruleSJSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJSelectionExpression=ruleSJSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJSelectionExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJSelectionExpression"


    // $ANTLR start "ruleSJSelectionExpression"
    // InternalSmallJava.g:919:1: ruleSJSelectionExpression returns [EObject current=null] : (this_SJTerminalExpression_0= ruleSJTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
    public final EObject ruleSJSelectionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_methodinvocation_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_SJTerminalExpression_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:925:2: ( (this_SJTerminalExpression_0= ruleSJTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // InternalSmallJava.g:926:2: (this_SJTerminalExpression_0= ruleSJTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // InternalSmallJava.g:926:2: (this_SJTerminalExpression_0= ruleSJTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )? )* )
            // InternalSmallJava.g:927:3: this_SJTerminalExpression_0= ruleSJTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSJSelectionExpressionAccess().getSJTerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_SJTerminalExpression_0=ruleSJTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SJTerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalSmallJava.g:935:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )? )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSmallJava.g:936:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // InternalSmallJava.g:936:4: ()
            	    // InternalSmallJava.g:937:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSJSelectionExpressionAccess().getFullStopKeyword_1_1());
            	      			
            	    }
            	    // InternalSmallJava.g:947:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalSmallJava.g:948:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalSmallJava.g:948:5: (otherlv_3= RULE_ID )
            	    // InternalSmallJava.g:949:6: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSJSelectionExpressionRule());
            	      						}
            	      					
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_3, grammarAccess.getSJSelectionExpressionAccess().getMemberSJMemberCrossReference_1_2_0());
            	      					
            	    }

            	    }


            	    }

            	    // InternalSmallJava.g:960:4: ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==16) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalSmallJava.g:961:5: ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // InternalSmallJava.g:961:5: ( (lv_methodinvocation_4_0= '(' ) )
            	            // InternalSmallJava.g:962:6: (lv_methodinvocation_4_0= '(' )
            	            {
            	            // InternalSmallJava.g:962:6: (lv_methodinvocation_4_0= '(' )
            	            // InternalSmallJava.g:963:7: lv_methodinvocation_4_0= '('
            	            {
            	            lv_methodinvocation_4_0=(Token)match(input,16,FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_methodinvocation_4_0, grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getSJSelectionExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "methodinvocation", true, "(");
            	              						
            	            }

            	            }


            	            }

            	            // InternalSmallJava.g:975:5: ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )?
            	            int alt14=2;
            	            int LA14_0 = input.LA(1);

            	            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||LA14_0==16||(LA14_0>=24 && LA14_0<=28)) ) {
            	                alt14=1;
            	            }
            	            switch (alt14) {
            	                case 1 :
            	                    // InternalSmallJava.g:976:6: ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )*
            	                    {
            	                    // InternalSmallJava.g:976:6: ( (lv_args_5_0= ruleSJExpression ) )
            	                    // InternalSmallJava.g:977:7: (lv_args_5_0= ruleSJExpression )
            	                    {
            	                    // InternalSmallJava.g:977:7: (lv_args_5_0= ruleSJExpression )
            	                    // InternalSmallJava.g:978:8: lv_args_5_0= ruleSJExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      								newCompositeNode(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_0_0());
            	                      							
            	                    }
            	                    pushFollow(FOLLOW_11);
            	                    lv_args_5_0=ruleSJExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      								if (current==null) {
            	                      									current = createModelElementForParent(grammarAccess.getSJSelectionExpressionRule());
            	                      								}
            	                      								add(
            	                      									current,
            	                      									"args",
            	                      									lv_args_5_0,
            	                      									"org.example.smalljava.SmallJava.SJExpression");
            	                      								afterParserOrEnumRuleCall();
            	                      							
            	                    }

            	                    }


            	                    }

            	                    // InternalSmallJava.g:995:6: (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )*
            	                    loop13:
            	                    do {
            	                        int alt13=2;
            	                        int LA13_0 = input.LA(1);

            	                        if ( (LA13_0==17) ) {
            	                            alt13=1;
            	                        }


            	                        switch (alt13) {
            	                    	case 1 :
            	                    	    // InternalSmallJava.g:996:7: otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      							newLeafNode(otherlv_6, grammarAccess.getSJSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0());
            	                    	      						
            	                    	    }
            	                    	    // InternalSmallJava.g:1000:7: ( (lv_args_7_0= ruleSJExpression ) )
            	                    	    // InternalSmallJava.g:1001:8: (lv_args_7_0= ruleSJExpression )
            	                    	    {
            	                    	    // InternalSmallJava.g:1001:8: (lv_args_7_0= ruleSJExpression )
            	                    	    // InternalSmallJava.g:1002:9: lv_args_7_0= ruleSJExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									newCompositeNode(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_1_1_0());
            	                    	      								
            	                    	    }
            	                    	    pushFollow(FOLLOW_11);
            	                    	    lv_args_7_0=ruleSJExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									if (current==null) {
            	                    	      										current = createModelElementForParent(grammarAccess.getSJSelectionExpressionRule());
            	                    	      									}
            	                    	      									add(
            	                    	      										current,
            	                    	      										"args",
            	                    	      										lv_args_7_0,
            	                    	      										"org.example.smalljava.SmallJava.SJExpression");
            	                    	      									afterParserOrEnumRuleCall();
            	                    	      								
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop13;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,18,FOLLOW_19); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_8, grammarAccess.getSJSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJSelectionExpression"


    // $ANTLR start "entryRuleSJTerminalExpression"
    // InternalSmallJava.g:1031:1: entryRuleSJTerminalExpression returns [EObject current=null] : iv_ruleSJTerminalExpression= ruleSJTerminalExpression EOF ;
    public final EObject entryRuleSJTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJTerminalExpression = null;


        try {
            // InternalSmallJava.g:1031:61: (iv_ruleSJTerminalExpression= ruleSJTerminalExpression EOF )
            // InternalSmallJava.g:1032:2: iv_ruleSJTerminalExpression= ruleSJTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSJTerminalExpression=ruleSJTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJTerminalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJTerminalExpression"


    // $ANTLR start "ruleSJTerminalExpression"
    // InternalSmallJava.g:1038:1: ruleSJTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'null' ) | ( () ( (otherlv_11= RULE_ID ) ) ) | ( () otherlv_13= 'new' ( (otherlv_14= RULE_ID ) ) otherlv_15= '(' otherlv_16= ')' ) | (otherlv_17= '(' this_SJExpression_18= ruleSJExpression otherlv_19= ')' ) ) ;
    public final EObject ruleSJTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject this_SJExpression_18 = null;



        	enterRule();

        try {
            // InternalSmallJava.g:1044:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'null' ) | ( () ( (otherlv_11= RULE_ID ) ) ) | ( () otherlv_13= 'new' ( (otherlv_14= RULE_ID ) ) otherlv_15= '(' otherlv_16= ')' ) | (otherlv_17= '(' this_SJExpression_18= ruleSJExpression otherlv_19= ')' ) ) )
            // InternalSmallJava.g:1045:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'null' ) | ( () ( (otherlv_11= RULE_ID ) ) ) | ( () otherlv_13= 'new' ( (otherlv_14= RULE_ID ) ) otherlv_15= '(' otherlv_16= ')' ) | (otherlv_17= '(' this_SJExpression_18= ruleSJExpression otherlv_19= ')' ) )
            {
            // InternalSmallJava.g:1045:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'null' ) | ( () ( (otherlv_11= RULE_ID ) ) ) | ( () otherlv_13= 'new' ( (otherlv_14= RULE_ID ) ) otherlv_15= '(' otherlv_16= ')' ) | (otherlv_17= '(' this_SJExpression_18= ruleSJExpression otherlv_19= ')' ) )
            int alt18=8;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
                {
                alt18=2;
                }
                break;
            case 24:
            case 25:
                {
                alt18=3;
                }
                break;
            case 26:
                {
                alt18=4;
                }
                break;
            case 27:
                {
                alt18=5;
                }
                break;
            case RULE_ID:
                {
                alt18=6;
                }
                break;
            case 28:
                {
                alt18=7;
                }
                break;
            case 16:
                {
                alt18=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalSmallJava.g:1046:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalSmallJava.g:1046:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalSmallJava.g:1047:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalSmallJava.g:1047:4: ()
                    // InternalSmallJava.g:1048:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSJTerminalExpressionAccess().getSJStringConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmallJava.g:1054:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalSmallJava.g:1055:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalSmallJava.g:1055:5: (lv_value_1_0= RULE_STRING )
                    // InternalSmallJava.g:1056:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getSJTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmallJava.g:1074:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalSmallJava.g:1074:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalSmallJava.g:1075:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalSmallJava.g:1075:4: ()
                    // InternalSmallJava.g:1076:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSJTerminalExpressionAccess().getSJIntConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmallJava.g:1082:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalSmallJava.g:1083:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalSmallJava.g:1083:5: (lv_value_3_0= RULE_INT )
                    // InternalSmallJava.g:1084:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getSJTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSmallJava.g:1102:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalSmallJava.g:1102:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalSmallJava.g:1103:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalSmallJava.g:1103:4: ()
                    // InternalSmallJava.g:1104:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSJTerminalExpressionAccess().getSJBoolConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmallJava.g:1110:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalSmallJava.g:1111:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalSmallJava.g:1111:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalSmallJava.g:1112:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalSmallJava.g:1112:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==24) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==25) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalSmallJava.g:1113:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_1, grammarAccess.getSJTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalSmallJava.g:1124:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_2, grammarAccess.getSJTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSmallJava.g:1139:3: ( () otherlv_7= 'this' )
                    {
                    // InternalSmallJava.g:1139:3: ( () otherlv_7= 'this' )
                    // InternalSmallJava.g:1140:4: () otherlv_7= 'this'
                    {
                    // InternalSmallJava.g:1140:4: ()
                    // InternalSmallJava.g:1141:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSJTerminalExpressionAccess().getSJThisAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSJTerminalExpressionAccess().getThisKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalSmallJava.g:1153:3: ( () otherlv_9= 'null' )
                    {
                    // InternalSmallJava.g:1153:3: ( () otherlv_9= 'null' )
                    // InternalSmallJava.g:1154:4: () otherlv_9= 'null'
                    {
                    // InternalSmallJava.g:1154:4: ()
                    // InternalSmallJava.g:1155:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSJTerminalExpressionAccess().getSJNullAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getSJTerminalExpressionAccess().getNullKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalSmallJava.g:1167:3: ( () ( (otherlv_11= RULE_ID ) ) )
                    {
                    // InternalSmallJava.g:1167:3: ( () ( (otherlv_11= RULE_ID ) ) )
                    // InternalSmallJava.g:1168:4: () ( (otherlv_11= RULE_ID ) )
                    {
                    // InternalSmallJava.g:1168:4: ()
                    // InternalSmallJava.g:1169:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSJTerminalExpressionAccess().getSJSymbolRefAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalSmallJava.g:1175:4: ( (otherlv_11= RULE_ID ) )
                    // InternalSmallJava.g:1176:5: (otherlv_11= RULE_ID )
                    {
                    // InternalSmallJava.g:1176:5: (otherlv_11= RULE_ID )
                    // InternalSmallJava.g:1177:6: otherlv_11= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
                      						}
                      					
                    }
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getSJTerminalExpressionAccess().getSymbolSJSymbolCrossReference_5_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalSmallJava.g:1190:3: ( () otherlv_13= 'new' ( (otherlv_14= RULE_ID ) ) otherlv_15= '(' otherlv_16= ')' )
                    {
                    // InternalSmallJava.g:1190:3: ( () otherlv_13= 'new' ( (otherlv_14= RULE_ID ) ) otherlv_15= '(' otherlv_16= ')' )
                    // InternalSmallJava.g:1191:4: () otherlv_13= 'new' ( (otherlv_14= RULE_ID ) ) otherlv_15= '(' otherlv_16= ')'
                    {
                    // InternalSmallJava.g:1191:4: ()
                    // InternalSmallJava.g:1192:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSJTerminalExpressionAccess().getSJNewAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_13=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getSJTerminalExpressionAccess().getNewKeyword_6_1());
                      			
                    }
                    // InternalSmallJava.g:1202:4: ( (otherlv_14= RULE_ID ) )
                    // InternalSmallJava.g:1203:5: (otherlv_14= RULE_ID )
                    {
                    // InternalSmallJava.g:1203:5: (otherlv_14= RULE_ID )
                    // InternalSmallJava.g:1204:6: otherlv_14= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
                      						}
                      					
                    }
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_14, grammarAccess.getSJTerminalExpressionAccess().getTypeSJClassCrossReference_6_2_0());
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,16,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_6_3());
                      			
                    }
                    otherlv_16=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_6_4());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalSmallJava.g:1225:3: (otherlv_17= '(' this_SJExpression_18= ruleSJExpression otherlv_19= ')' )
                    {
                    // InternalSmallJava.g:1225:3: (otherlv_17= '(' this_SJExpression_18= ruleSJExpression otherlv_19= ')' )
                    // InternalSmallJava.g:1226:4: otherlv_17= '(' this_SJExpression_18= ruleSJExpression otherlv_19= ')'
                    {
                    otherlv_17=(Token)match(input,16,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_7_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSJTerminalExpressionAccess().getSJExpressionParserRuleCall_7_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_SJExpression_18=ruleSJExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_SJExpression_18;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_19=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_7_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSJTerminalExpression"

    // $ANTLR start synpred1_InternalSmallJava
    public final void synpred1_InternalSmallJava_fragment() throws RecognitionException {   
        // InternalSmallJava.g:671:5: ( 'else' )
        // InternalSmallJava.g:671:6: 'else'
        {
        match(input,22,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSmallJava

    // Delegated rules

    public final boolean synpred1_InternalSmallJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSmallJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000001F314070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001F010070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001F312070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000810002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000001F050070L});

}