package org.example.expressions.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.example.expressions.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'var'", "'='", "'eval'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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

    	public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleExpressionsModel"
    // InternalExpressions.g:53:1: entryRuleExpressionsModel : ruleExpressionsModel EOF ;
    public final void entryRuleExpressionsModel() throws RecognitionException {
        try {
            // InternalExpressions.g:54:1: ( ruleExpressionsModel EOF )
            // InternalExpressions.g:55:1: ruleExpressionsModel EOF
            {
             before(grammarAccess.getExpressionsModelRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionsModel();

            state._fsp--;

             after(grammarAccess.getExpressionsModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpressionsModel"


    // $ANTLR start "ruleExpressionsModel"
    // InternalExpressions.g:62:1: ruleExpressionsModel : ( ( rule__ExpressionsModel__ElementsAssignment )* ) ;
    public final void ruleExpressionsModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:66:2: ( ( ( rule__ExpressionsModel__ElementsAssignment )* ) )
            // InternalExpressions.g:67:2: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            {
            // InternalExpressions.g:67:2: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            // InternalExpressions.g:68:3: ( rule__ExpressionsModel__ElementsAssignment )*
            {
             before(grammarAccess.getExpressionsModelAccess().getElementsAssignment()); 
            // InternalExpressions.g:69:3: ( rule__ExpressionsModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExpressions.g:69:4: rule__ExpressionsModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ExpressionsModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getExpressionsModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionsModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalExpressions.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalExpressions.g:79:1: ( ruleAbstractElement EOF )
            // InternalExpressions.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalExpressions.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalExpressions.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalExpressions.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalExpressions.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalExpressions.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalExpressions.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleVariable"
    // InternalExpressions.g:103:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalExpressions.g:104:1: ( ruleVariable EOF )
            // InternalExpressions.g:105:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalExpressions.g:112:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:116:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalExpressions.g:117:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalExpressions.g:117:2: ( ( rule__Variable__Group__0 ) )
            // InternalExpressions.g:118:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalExpressions.g:119:3: ( rule__Variable__Group__0 )
            // InternalExpressions.g:119:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEvalExpression"
    // InternalExpressions.g:128:1: entryRuleEvalExpression : ruleEvalExpression EOF ;
    public final void entryRuleEvalExpression() throws RecognitionException {
        try {
            // InternalExpressions.g:129:1: ( ruleEvalExpression EOF )
            // InternalExpressions.g:130:1: ruleEvalExpression EOF
            {
             before(grammarAccess.getEvalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEvalExpression();

            state._fsp--;

             after(grammarAccess.getEvalExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvalExpression"


    // $ANTLR start "ruleEvalExpression"
    // InternalExpressions.g:137:1: ruleEvalExpression : ( ( rule__EvalExpression__Group__0 ) ) ;
    public final void ruleEvalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:141:2: ( ( ( rule__EvalExpression__Group__0 ) ) )
            // InternalExpressions.g:142:2: ( ( rule__EvalExpression__Group__0 ) )
            {
            // InternalExpressions.g:142:2: ( ( rule__EvalExpression__Group__0 ) )
            // InternalExpressions.g:143:3: ( rule__EvalExpression__Group__0 )
            {
             before(grammarAccess.getEvalExpressionAccess().getGroup()); 
            // InternalExpressions.g:144:3: ( rule__EvalExpression__Group__0 )
            // InternalExpressions.g:144:4: rule__EvalExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvalExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvalExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvalExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalExpressions.g:153:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalExpressions.g:154:1: ( ruleExpression EOF )
            // InternalExpressions.g:155:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalExpressions.g:162:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:166:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalExpressions.g:167:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalExpressions.g:167:2: ( ( rule__Expression__Alternatives ) )
            // InternalExpressions.g:168:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalExpressions.g:169:3: ( rule__Expression__Alternatives )
            // InternalExpressions.g:169:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalExpressions.g:177:1: rule__AbstractElement__Alternatives : ( ( ruleVariable ) | ( ruleEvalExpression ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:181:1: ( ( ruleVariable ) | ( ruleEvalExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
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
                    // InternalExpressions.g:182:2: ( ruleVariable )
                    {
                    // InternalExpressions.g:182:2: ( ruleVariable )
                    // InternalExpressions.g:183:3: ruleVariable
                    {
                     before(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:188:2: ( ruleEvalExpression )
                    {
                    // InternalExpressions.g:188:2: ( ruleEvalExpression )
                    // InternalExpressions.g:189:3: ruleEvalExpression
                    {
                     before(grammarAccess.getAbstractElementAccess().getEvalExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvalExpression();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getEvalExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalExpressions.g:198:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__Group_2__0 ) ) | ( ( rule__Expression__Group_3__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:202:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__Group_2__0 ) ) | ( ( rule__Expression__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case 11:
            case 12:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalExpressions.g:203:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalExpressions.g:203:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalExpressions.g:204:3: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // InternalExpressions.g:205:3: ( rule__Expression__Group_0__0 )
                    // InternalExpressions.g:205:4: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:209:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalExpressions.g:209:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalExpressions.g:210:3: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // InternalExpressions.g:211:3: ( rule__Expression__Group_1__0 )
                    // InternalExpressions.g:211:4: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:215:2: ( ( rule__Expression__Group_2__0 ) )
                    {
                    // InternalExpressions.g:215:2: ( ( rule__Expression__Group_2__0 ) )
                    // InternalExpressions.g:216:3: ( rule__Expression__Group_2__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_2()); 
                    // InternalExpressions.g:217:3: ( rule__Expression__Group_2__0 )
                    // InternalExpressions.g:217:4: rule__Expression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpressions.g:221:2: ( ( rule__Expression__Group_3__0 ) )
                    {
                    // InternalExpressions.g:221:2: ( ( rule__Expression__Group_3__0 ) )
                    // InternalExpressions.g:222:3: ( rule__Expression__Group_3__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_3()); 
                    // InternalExpressions.g:223:3: ( rule__Expression__Group_3__0 )
                    // InternalExpressions.g:223:4: rule__Expression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Expression__ValueAlternatives_2_1_0"
    // InternalExpressions.g:231:1: rule__Expression__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Expression__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:235:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExpressions.g:236:2: ( 'true' )
                    {
                    // InternalExpressions.g:236:2: ( 'true' )
                    // InternalExpressions.g:237:3: 'true'
                    {
                     before(grammarAccess.getExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:242:2: ( 'false' )
                    {
                    // InternalExpressions.g:242:2: ( 'false' )
                    // InternalExpressions.g:243:3: 'false'
                    {
                     before(grammarAccess.getExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getValueFalseKeyword_2_1_0_1()); 

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
    // $ANTLR end "rule__Expression__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalExpressions.g:252:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:256:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalExpressions.g:257:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalExpressions.g:264:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:268:1: ( ( 'var' ) )
            // InternalExpressions.g:269:1: ( 'var' )
            {
            // InternalExpressions.g:269:1: ( 'var' )
            // InternalExpressions.g:270:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalExpressions.g:279:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:283:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalExpressions.g:284:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalExpressions.g:291:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:295:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalExpressions.g:296:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalExpressions.g:296:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalExpressions.g:297:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalExpressions.g:298:2: ( rule__Variable__NameAssignment_1 )
            // InternalExpressions.g:298:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalExpressions.g:306:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:310:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalExpressions.g:311:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalExpressions.g:318:1: rule__Variable__Group__2__Impl : ( '=' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:322:1: ( ( '=' ) )
            // InternalExpressions.g:323:1: ( '=' )
            {
            // InternalExpressions.g:323:1: ( '=' )
            // InternalExpressions.g:324:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalExpressions.g:333:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:337:1: ( rule__Variable__Group__3__Impl )
            // InternalExpressions.g:338:2: rule__Variable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__3__Impl();

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
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalExpressions.g:344:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__ExpressionAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:348:1: ( ( ( rule__Variable__ExpressionAssignment_3 ) ) )
            // InternalExpressions.g:349:1: ( ( rule__Variable__ExpressionAssignment_3 ) )
            {
            // InternalExpressions.g:349:1: ( ( rule__Variable__ExpressionAssignment_3 ) )
            // InternalExpressions.g:350:2: ( rule__Variable__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_3()); 
            // InternalExpressions.g:351:2: ( rule__Variable__ExpressionAssignment_3 )
            // InternalExpressions.g:351:3: rule__Variable__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__EvalExpression__Group__0"
    // InternalExpressions.g:360:1: rule__EvalExpression__Group__0 : rule__EvalExpression__Group__0__Impl rule__EvalExpression__Group__1 ;
    public final void rule__EvalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:364:1: ( rule__EvalExpression__Group__0__Impl rule__EvalExpression__Group__1 )
            // InternalExpressions.g:365:2: rule__EvalExpression__Group__0__Impl rule__EvalExpression__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__EvalExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvalExpression__Group__1();

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
    // $ANTLR end "rule__EvalExpression__Group__0"


    // $ANTLR start "rule__EvalExpression__Group__0__Impl"
    // InternalExpressions.g:372:1: rule__EvalExpression__Group__0__Impl : ( 'eval' ) ;
    public final void rule__EvalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:376:1: ( ( 'eval' ) )
            // InternalExpressions.g:377:1: ( 'eval' )
            {
            // InternalExpressions.g:377:1: ( 'eval' )
            // InternalExpressions.g:378:2: 'eval'
            {
             before(grammarAccess.getEvalExpressionAccess().getEvalKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEvalExpressionAccess().getEvalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalExpression__Group__0__Impl"


    // $ANTLR start "rule__EvalExpression__Group__1"
    // InternalExpressions.g:387:1: rule__EvalExpression__Group__1 : rule__EvalExpression__Group__1__Impl ;
    public final void rule__EvalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:391:1: ( rule__EvalExpression__Group__1__Impl )
            // InternalExpressions.g:392:2: rule__EvalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvalExpression__Group__1__Impl();

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
    // $ANTLR end "rule__EvalExpression__Group__1"


    // $ANTLR start "rule__EvalExpression__Group__1__Impl"
    // InternalExpressions.g:398:1: rule__EvalExpression__Group__1__Impl : ( ( rule__EvalExpression__ExpressionAssignment_1 ) ) ;
    public final void rule__EvalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:402:1: ( ( ( rule__EvalExpression__ExpressionAssignment_1 ) ) )
            // InternalExpressions.g:403:1: ( ( rule__EvalExpression__ExpressionAssignment_1 ) )
            {
            // InternalExpressions.g:403:1: ( ( rule__EvalExpression__ExpressionAssignment_1 ) )
            // InternalExpressions.g:404:2: ( rule__EvalExpression__ExpressionAssignment_1 )
            {
             before(grammarAccess.getEvalExpressionAccess().getExpressionAssignment_1()); 
            // InternalExpressions.g:405:2: ( rule__EvalExpression__ExpressionAssignment_1 )
            // InternalExpressions.g:405:3: rule__EvalExpression__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvalExpression__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvalExpressionAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalExpression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_0__0"
    // InternalExpressions.g:414:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:418:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // InternalExpressions.g:419:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1();

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
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // InternalExpressions.g:426:1: rule__Expression__Group_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:430:1: ( ( () ) )
            // InternalExpressions.g:431:1: ( () )
            {
            // InternalExpressions.g:431:1: ( () )
            // InternalExpressions.g:432:2: ()
            {
             before(grammarAccess.getExpressionAccess().getIntConstantAction_0_0()); 
            // InternalExpressions.g:433:2: ()
            // InternalExpressions.g:433:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0__1"
    // InternalExpressions.g:441:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:445:1: ( rule__Expression__Group_0__1__Impl )
            // InternalExpressions.g:446:2: rule__Expression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_0__1"


    // $ANTLR start "rule__Expression__Group_0__1__Impl"
    // InternalExpressions.g:452:1: rule__Expression__Group_0__1__Impl : ( ( rule__Expression__ValueAssignment_0_1 ) ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:456:1: ( ( ( rule__Expression__ValueAssignment_0_1 ) ) )
            // InternalExpressions.g:457:1: ( ( rule__Expression__ValueAssignment_0_1 ) )
            {
            // InternalExpressions.g:457:1: ( ( rule__Expression__ValueAssignment_0_1 ) )
            // InternalExpressions.g:458:2: ( rule__Expression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_0_1()); 
            // InternalExpressions.g:459:2: ( rule__Expression__ValueAssignment_0_1 )
            // InternalExpressions.g:459:3: rule__Expression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalExpressions.g:468:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:472:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalExpressions.g:473:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalExpressions.g:480:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:484:1: ( ( () ) )
            // InternalExpressions.g:485:1: ( () )
            {
            // InternalExpressions.g:485:1: ( () )
            // InternalExpressions.g:486:2: ()
            {
             before(grammarAccess.getExpressionAccess().getStringConstantAction_1_0()); 
            // InternalExpressions.g:487:2: ()
            // InternalExpressions.g:487:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalExpressions.g:495:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:499:1: ( rule__Expression__Group_1__1__Impl )
            // InternalExpressions.g:500:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalExpressions.g:506:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ValueAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:510:1: ( ( ( rule__Expression__ValueAssignment_1_1 ) ) )
            // InternalExpressions.g:511:1: ( ( rule__Expression__ValueAssignment_1_1 ) )
            {
            // InternalExpressions.g:511:1: ( ( rule__Expression__ValueAssignment_1_1 ) )
            // InternalExpressions.g:512:2: ( rule__Expression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_1_1()); 
            // InternalExpressions.g:513:2: ( rule__Expression__ValueAssignment_1_1 )
            // InternalExpressions.g:513:3: rule__Expression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_2__0"
    // InternalExpressions.g:522:1: rule__Expression__Group_2__0 : rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 ;
    public final void rule__Expression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:526:1: ( rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 )
            // InternalExpressions.g:527:2: rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__1();

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
    // $ANTLR end "rule__Expression__Group_2__0"


    // $ANTLR start "rule__Expression__Group_2__0__Impl"
    // InternalExpressions.g:534:1: rule__Expression__Group_2__0__Impl : ( () ) ;
    public final void rule__Expression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:538:1: ( ( () ) )
            // InternalExpressions.g:539:1: ( () )
            {
            // InternalExpressions.g:539:1: ( () )
            // InternalExpressions.g:540:2: ()
            {
             before(grammarAccess.getExpressionAccess().getBoolConstantAction_2_0()); 
            // InternalExpressions.g:541:2: ()
            // InternalExpressions.g:541:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__0__Impl"


    // $ANTLR start "rule__Expression__Group_2__1"
    // InternalExpressions.g:549:1: rule__Expression__Group_2__1 : rule__Expression__Group_2__1__Impl ;
    public final void rule__Expression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:553:1: ( rule__Expression__Group_2__1__Impl )
            // InternalExpressions.g:554:2: rule__Expression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_2__1"


    // $ANTLR start "rule__Expression__Group_2__1__Impl"
    // InternalExpressions.g:560:1: rule__Expression__Group_2__1__Impl : ( ( rule__Expression__ValueAssignment_2_1 ) ) ;
    public final void rule__Expression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:564:1: ( ( ( rule__Expression__ValueAssignment_2_1 ) ) )
            // InternalExpressions.g:565:1: ( ( rule__Expression__ValueAssignment_2_1 ) )
            {
            // InternalExpressions.g:565:1: ( ( rule__Expression__ValueAssignment_2_1 ) )
            // InternalExpressions.g:566:2: ( rule__Expression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_2_1()); 
            // InternalExpressions.g:567:2: ( rule__Expression__ValueAssignment_2_1 )
            // InternalExpressions.g:567:3: rule__Expression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__1__Impl"


    // $ANTLR start "rule__Expression__Group_3__0"
    // InternalExpressions.g:576:1: rule__Expression__Group_3__0 : rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 ;
    public final void rule__Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:580:1: ( rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 )
            // InternalExpressions.g:581:2: rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Expression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__1();

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
    // $ANTLR end "rule__Expression__Group_3__0"


    // $ANTLR start "rule__Expression__Group_3__0__Impl"
    // InternalExpressions.g:588:1: rule__Expression__Group_3__0__Impl : ( () ) ;
    public final void rule__Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:592:1: ( ( () ) )
            // InternalExpressions.g:593:1: ( () )
            {
            // InternalExpressions.g:593:1: ( () )
            // InternalExpressions.g:594:2: ()
            {
             before(grammarAccess.getExpressionAccess().getVariableRefAction_3_0()); 
            // InternalExpressions.g:595:2: ()
            // InternalExpressions.g:595:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getVariableRefAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Expression__Group_3__1"
    // InternalExpressions.g:603:1: rule__Expression__Group_3__1 : rule__Expression__Group_3__1__Impl ;
    public final void rule__Expression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:607:1: ( rule__Expression__Group_3__1__Impl )
            // InternalExpressions.g:608:2: rule__Expression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_3__1"


    // $ANTLR start "rule__Expression__Group_3__1__Impl"
    // InternalExpressions.g:614:1: rule__Expression__Group_3__1__Impl : ( ( rule__Expression__VariableAssignment_3_1 ) ) ;
    public final void rule__Expression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:618:1: ( ( ( rule__Expression__VariableAssignment_3_1 ) ) )
            // InternalExpressions.g:619:1: ( ( rule__Expression__VariableAssignment_3_1 ) )
            {
            // InternalExpressions.g:619:1: ( ( rule__Expression__VariableAssignment_3_1 ) )
            // InternalExpressions.g:620:2: ( rule__Expression__VariableAssignment_3_1 )
            {
             before(grammarAccess.getExpressionAccess().getVariableAssignment_3_1()); 
            // InternalExpressions.g:621:2: ( rule__Expression__VariableAssignment_3_1 )
            // InternalExpressions.g:621:3: rule__Expression__VariableAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__VariableAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getVariableAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_3__1__Impl"


    // $ANTLR start "rule__ExpressionsModel__ElementsAssignment"
    // InternalExpressions.g:630:1: rule__ExpressionsModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__ExpressionsModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:634:1: ( ( ruleAbstractElement ) )
            // InternalExpressions.g:635:2: ( ruleAbstractElement )
            {
            // InternalExpressions.g:635:2: ( ruleAbstractElement )
            // InternalExpressions.g:636:3: ruleAbstractElement
            {
             before(grammarAccess.getExpressionsModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getExpressionsModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionsModel__ElementsAssignment"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalExpressions.g:645:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:649:1: ( ( RULE_ID ) )
            // InternalExpressions.g:650:2: ( RULE_ID )
            {
            // InternalExpressions.g:650:2: ( RULE_ID )
            // InternalExpressions.g:651:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__ExpressionAssignment_3"
    // InternalExpressions.g:660:1: rule__Variable__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:664:1: ( ( ruleExpression ) )
            // InternalExpressions.g:665:2: ( ruleExpression )
            {
            // InternalExpressions.g:665:2: ( ruleExpression )
            // InternalExpressions.g:666:3: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ExpressionAssignment_3"


    // $ANTLR start "rule__EvalExpression__ExpressionAssignment_1"
    // InternalExpressions.g:675:1: rule__EvalExpression__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__EvalExpression__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:679:1: ( ( ruleExpression ) )
            // InternalExpressions.g:680:2: ( ruleExpression )
            {
            // InternalExpressions.g:680:2: ( ruleExpression )
            // InternalExpressions.g:681:3: ruleExpression
            {
             before(grammarAccess.getEvalExpressionAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEvalExpressionAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvalExpression__ExpressionAssignment_1"


    // $ANTLR start "rule__Expression__ValueAssignment_0_1"
    // InternalExpressions.g:690:1: rule__Expression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Expression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:694:1: ( ( RULE_INT ) )
            // InternalExpressions.g:695:2: ( RULE_INT )
            {
            // InternalExpressions.g:695:2: ( RULE_INT )
            // InternalExpressions.g:696:3: RULE_INT
            {
             before(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ValueAssignment_0_1"


    // $ANTLR start "rule__Expression__ValueAssignment_1_1"
    // InternalExpressions.g:705:1: rule__Expression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Expression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:709:1: ( ( RULE_STRING ) )
            // InternalExpressions.g:710:2: ( RULE_STRING )
            {
            // InternalExpressions.g:710:2: ( RULE_STRING )
            // InternalExpressions.g:711:3: RULE_STRING
            {
             before(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ValueAssignment_1_1"


    // $ANTLR start "rule__Expression__ValueAssignment_2_1"
    // InternalExpressions.g:720:1: rule__Expression__ValueAssignment_2_1 : ( ( rule__Expression__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Expression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:724:1: ( ( ( rule__Expression__ValueAlternatives_2_1_0 ) ) )
            // InternalExpressions.g:725:2: ( ( rule__Expression__ValueAlternatives_2_1_0 ) )
            {
            // InternalExpressions.g:725:2: ( ( rule__Expression__ValueAlternatives_2_1_0 ) )
            // InternalExpressions.g:726:3: ( rule__Expression__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getValueAlternatives_2_1_0()); 
            // InternalExpressions.g:727:3: ( rule__Expression__ValueAlternatives_2_1_0 )
            // InternalExpressions.g:727:4: rule__Expression__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ValueAssignment_2_1"


    // $ANTLR start "rule__Expression__VariableAssignment_3_1"
    // InternalExpressions.g:735:1: rule__Expression__VariableAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Expression__VariableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:739:1: ( ( ( RULE_ID ) ) )
            // InternalExpressions.g:740:2: ( ( RULE_ID ) )
            {
            // InternalExpressions.g:740:2: ( ( RULE_ID ) )
            // InternalExpressions.g:741:3: ( RULE_ID )
            {
             before(grammarAccess.getExpressionAccess().getVariableVariableCrossReference_3_1_0()); 
            // InternalExpressions.g:742:3: ( RULE_ID )
            // InternalExpressions.g:743:4: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getExpressionAccess().getVariableVariableCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__VariableAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001800L});

}