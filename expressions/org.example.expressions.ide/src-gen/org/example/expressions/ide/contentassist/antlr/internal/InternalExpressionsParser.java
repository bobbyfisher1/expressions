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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'var'", "'='", "'eval'", "'+'", "'-'", "'('", "')'"
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
    // InternalExpressions.g:162:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:166:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalExpressions.g:167:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalExpressions.g:167:2: ( ( rule__Expression__Group__0 ) )
            // InternalExpressions.g:168:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalExpressions.g:169:3: ( rule__Expression__Group__0 )
            // InternalExpressions.g:169:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleAtomic"
    // InternalExpressions.g:178:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalExpressions.g:179:1: ( ruleAtomic EOF )
            // InternalExpressions.g:180:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalExpressions.g:187:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:191:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalExpressions.g:192:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalExpressions.g:192:2: ( ( rule__Atomic__Alternatives ) )
            // InternalExpressions.g:193:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalExpressions.g:194:3: ( rule__Atomic__Alternatives )
            // InternalExpressions.g:194:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalExpressions.g:202:1: rule__AbstractElement__Alternatives : ( ( ruleVariable ) | ( ruleEvalExpression ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:206:1: ( ( ruleVariable ) | ( ruleEvalExpression ) )
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
                    // InternalExpressions.g:207:2: ( ruleVariable )
                    {
                    // InternalExpressions.g:207:2: ( ruleVariable )
                    // InternalExpressions.g:208:3: ruleVariable
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
                    // InternalExpressions.g:213:2: ( ruleEvalExpression )
                    {
                    // InternalExpressions.g:213:2: ( ruleEvalExpression )
                    // InternalExpressions.g:214:3: ruleEvalExpression
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


    // $ANTLR start "rule__Expression__Alternatives_1_0"
    // InternalExpressions.g:223:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__Group_1_0_0__0 ) ) | ( ( rule__Expression__Group_1_0_1__0 ) ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:227:1: ( ( ( rule__Expression__Group_1_0_0__0 ) ) | ( ( rule__Expression__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalExpressions.g:228:2: ( ( rule__Expression__Group_1_0_0__0 ) )
                    {
                    // InternalExpressions.g:228:2: ( ( rule__Expression__Group_1_0_0__0 ) )
                    // InternalExpressions.g:229:3: ( rule__Expression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_0_0()); 
                    // InternalExpressions.g:230:3: ( rule__Expression__Group_1_0_0__0 )
                    // InternalExpressions.g:230:4: rule__Expression__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:234:2: ( ( rule__Expression__Group_1_0_1__0 ) )
                    {
                    // InternalExpressions.g:234:2: ( ( rule__Expression__Group_1_0_1__0 ) )
                    // InternalExpressions.g:235:3: ( rule__Expression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_0_1()); 
                    // InternalExpressions.g:236:3: ( rule__Expression__Group_1_0_1__0 )
                    // InternalExpressions.g:236:4: rule__Expression__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Expression__Alternatives_1_0"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalExpressions.g:244:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:248:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            case 11:
            case 12:
                {
                alt4=4;
                }
                break;
            case RULE_ID:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalExpressions.g:249:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalExpressions.g:249:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalExpressions.g:250:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalExpressions.g:251:3: ( rule__Atomic__Group_0__0 )
                    // InternalExpressions.g:251:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:255:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalExpressions.g:255:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalExpressions.g:256:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalExpressions.g:257:3: ( rule__Atomic__Group_1__0 )
                    // InternalExpressions.g:257:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:261:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalExpressions.g:261:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalExpressions.g:262:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalExpressions.g:263:3: ( rule__Atomic__Group_2__0 )
                    // InternalExpressions.g:263:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExpressions.g:267:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalExpressions.g:267:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalExpressions.g:268:3: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // InternalExpressions.g:269:3: ( rule__Atomic__Group_3__0 )
                    // InternalExpressions.g:269:4: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExpressions.g:273:2: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // InternalExpressions.g:273:2: ( ( rule__Atomic__Group_4__0 ) )
                    // InternalExpressions.g:274:3: ( rule__Atomic__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    // InternalExpressions.g:275:3: ( rule__Atomic__Group_4__0 )
                    // InternalExpressions.g:275:4: rule__Atomic__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_3_1_0"
    // InternalExpressions.g:283:1: rule__Atomic__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:287:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalExpressions.g:288:2: ( 'true' )
                    {
                    // InternalExpressions.g:288:2: ( 'true' )
                    // InternalExpressions.g:289:3: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:294:2: ( 'false' )
                    {
                    // InternalExpressions.g:294:2: ( 'false' )
                    // InternalExpressions.g:295:3: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1()); 

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
    // $ANTLR end "rule__Atomic__ValueAlternatives_3_1_0"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalExpressions.g:304:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:308:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalExpressions.g:309:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalExpressions.g:316:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:320:1: ( ( 'var' ) )
            // InternalExpressions.g:321:1: ( 'var' )
            {
            // InternalExpressions.g:321:1: ( 'var' )
            // InternalExpressions.g:322:2: 'var'
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
    // InternalExpressions.g:331:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:335:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalExpressions.g:336:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
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
    // InternalExpressions.g:343:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:347:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalExpressions.g:348:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalExpressions.g:348:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalExpressions.g:349:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalExpressions.g:350:2: ( rule__Variable__NameAssignment_1 )
            // InternalExpressions.g:350:3: rule__Variable__NameAssignment_1
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
    // InternalExpressions.g:358:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:362:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalExpressions.g:363:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
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
    // InternalExpressions.g:370:1: rule__Variable__Group__2__Impl : ( '=' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:374:1: ( ( '=' ) )
            // InternalExpressions.g:375:1: ( '=' )
            {
            // InternalExpressions.g:375:1: ( '=' )
            // InternalExpressions.g:376:2: '='
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
    // InternalExpressions.g:385:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:389:1: ( rule__Variable__Group__3__Impl )
            // InternalExpressions.g:390:2: rule__Variable__Group__3__Impl
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
    // InternalExpressions.g:396:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__ExpressionAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:400:1: ( ( ( rule__Variable__ExpressionAssignment_3 ) ) )
            // InternalExpressions.g:401:1: ( ( rule__Variable__ExpressionAssignment_3 ) )
            {
            // InternalExpressions.g:401:1: ( ( rule__Variable__ExpressionAssignment_3 ) )
            // InternalExpressions.g:402:2: ( rule__Variable__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_3()); 
            // InternalExpressions.g:403:2: ( rule__Variable__ExpressionAssignment_3 )
            // InternalExpressions.g:403:3: rule__Variable__ExpressionAssignment_3
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
    // InternalExpressions.g:412:1: rule__EvalExpression__Group__0 : rule__EvalExpression__Group__0__Impl rule__EvalExpression__Group__1 ;
    public final void rule__EvalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:416:1: ( rule__EvalExpression__Group__0__Impl rule__EvalExpression__Group__1 )
            // InternalExpressions.g:417:2: rule__EvalExpression__Group__0__Impl rule__EvalExpression__Group__1
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
    // InternalExpressions.g:424:1: rule__EvalExpression__Group__0__Impl : ( 'eval' ) ;
    public final void rule__EvalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:428:1: ( ( 'eval' ) )
            // InternalExpressions.g:429:1: ( 'eval' )
            {
            // InternalExpressions.g:429:1: ( 'eval' )
            // InternalExpressions.g:430:2: 'eval'
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
    // InternalExpressions.g:439:1: rule__EvalExpression__Group__1 : rule__EvalExpression__Group__1__Impl ;
    public final void rule__EvalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:443:1: ( rule__EvalExpression__Group__1__Impl )
            // InternalExpressions.g:444:2: rule__EvalExpression__Group__1__Impl
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
    // InternalExpressions.g:450:1: rule__EvalExpression__Group__1__Impl : ( ( rule__EvalExpression__ExpressionAssignment_1 ) ) ;
    public final void rule__EvalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:454:1: ( ( ( rule__EvalExpression__ExpressionAssignment_1 ) ) )
            // InternalExpressions.g:455:1: ( ( rule__EvalExpression__ExpressionAssignment_1 ) )
            {
            // InternalExpressions.g:455:1: ( ( rule__EvalExpression__ExpressionAssignment_1 ) )
            // InternalExpressions.g:456:2: ( rule__EvalExpression__ExpressionAssignment_1 )
            {
             before(grammarAccess.getEvalExpressionAccess().getExpressionAssignment_1()); 
            // InternalExpressions.g:457:2: ( rule__EvalExpression__ExpressionAssignment_1 )
            // InternalExpressions.g:457:3: rule__EvalExpression__ExpressionAssignment_1
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


    // $ANTLR start "rule__Expression__Group__0"
    // InternalExpressions.g:466:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:470:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalExpressions.g:471:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalExpressions.g:478:1: rule__Expression__Group__0__Impl : ( ruleAtomic ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:482:1: ( ( ruleAtomic ) )
            // InternalExpressions.g:483:1: ( ruleAtomic )
            {
            // InternalExpressions.g:483:1: ( ruleAtomic )
            // InternalExpressions.g:484:2: ruleAtomic
            {
             before(grammarAccess.getExpressionAccess().getAtomicParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAtomicParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalExpressions.g:493:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:497:1: ( rule__Expression__Group__1__Impl )
            // InternalExpressions.g:498:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalExpressions.g:504:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:508:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalExpressions.g:509:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalExpressions.g:509:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalExpressions.g:510:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalExpressions.g:511:2: ( rule__Expression__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalExpressions.g:511:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalExpressions.g:520:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:524:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalExpressions.g:525:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalExpressions.g:532:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:536:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // InternalExpressions.g:537:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // InternalExpressions.g:537:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // InternalExpressions.g:538:2: ( rule__Expression__Alternatives_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            // InternalExpressions.g:539:2: ( rule__Expression__Alternatives_1_0 )
            // InternalExpressions.g:539:3: rule__Expression__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalExpressions.g:547:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:551:1: ( rule__Expression__Group_1__1__Impl )
            // InternalExpressions.g:552:2: rule__Expression__Group_1__1__Impl
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
    // InternalExpressions.g:558:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:562:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // InternalExpressions.g:563:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // InternalExpressions.g:563:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // InternalExpressions.g:564:2: ( rule__Expression__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            // InternalExpressions.g:565:2: ( rule__Expression__RightAssignment_1_1 )
            // InternalExpressions.g:565:3: rule__Expression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Expression__Group_1_0_0__0"
    // InternalExpressions.g:574:1: rule__Expression__Group_1_0_0__0 : rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1 ;
    public final void rule__Expression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:578:1: ( rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1 )
            // InternalExpressions.g:579:2: rule__Expression__Group_1_0_0__0__Impl rule__Expression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_0__1();

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
    // $ANTLR end "rule__Expression__Group_1_0_0__0"


    // $ANTLR start "rule__Expression__Group_1_0_0__0__Impl"
    // InternalExpressions.g:586:1: rule__Expression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:590:1: ( ( () ) )
            // InternalExpressions.g:591:1: ( () )
            {
            // InternalExpressions.g:591:1: ( () )
            // InternalExpressions.g:592:2: ()
            {
             before(grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalExpressions.g:593:2: ()
            // InternalExpressions.g:593:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_0__1"
    // InternalExpressions.g:601:1: rule__Expression__Group_1_0_0__1 : rule__Expression__Group_1_0_0__1__Impl ;
    public final void rule__Expression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:605:1: ( rule__Expression__Group_1_0_0__1__Impl )
            // InternalExpressions.g:606:2: rule__Expression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_1_0_0__1"


    // $ANTLR start "rule__Expression__Group_1_0_0__1__Impl"
    // InternalExpressions.g:612:1: rule__Expression__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Expression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:616:1: ( ( '+' ) )
            // InternalExpressions.g:617:1: ( '+' )
            {
            // InternalExpressions.g:617:1: ( '+' )
            // InternalExpressions.g:618:2: '+'
            {
             before(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_1__0"
    // InternalExpressions.g:628:1: rule__Expression__Group_1_0_1__0 : rule__Expression__Group_1_0_1__0__Impl rule__Expression__Group_1_0_1__1 ;
    public final void rule__Expression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:632:1: ( rule__Expression__Group_1_0_1__0__Impl rule__Expression__Group_1_0_1__1 )
            // InternalExpressions.g:633:2: rule__Expression__Group_1_0_1__0__Impl rule__Expression__Group_1_0_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_1__1();

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
    // $ANTLR end "rule__Expression__Group_1_0_1__0"


    // $ANTLR start "rule__Expression__Group_1_0_1__0__Impl"
    // InternalExpressions.g:640:1: rule__Expression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:644:1: ( ( () ) )
            // InternalExpressions.g:645:1: ( () )
            {
            // InternalExpressions.g:645:1: ( () )
            // InternalExpressions.g:646:2: ()
            {
             before(grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalExpressions.g:647:2: ()
            // InternalExpressions.g:647:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0_1__1"
    // InternalExpressions.g:655:1: rule__Expression__Group_1_0_1__1 : rule__Expression__Group_1_0_1__1__Impl ;
    public final void rule__Expression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:659:1: ( rule__Expression__Group_1_0_1__1__Impl )
            // InternalExpressions.g:660:2: rule__Expression__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Expression__Group_1_0_1__1"


    // $ANTLR start "rule__Expression__Group_1_0_1__1__Impl"
    // InternalExpressions.g:666:1: rule__Expression__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Expression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:670:1: ( ( '-' ) )
            // InternalExpressions.g:671:1: ( '-' )
            {
            // InternalExpressions.g:671:1: ( '-' )
            // InternalExpressions.g:672:2: '-'
            {
             before(grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalExpressions.g:682:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:686:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalExpressions.g:687:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

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
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalExpressions.g:694:1: rule__Atomic__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:698:1: ( ( '(' ) )
            // InternalExpressions.g:699:1: ( '(' )
            {
            // InternalExpressions.g:699:1: ( '(' )
            // InternalExpressions.g:700:2: '('
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalExpressions.g:709:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:713:1: ( rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 )
            // InternalExpressions.g:714:2: rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Atomic__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__2();

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
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalExpressions.g:721:1: rule__Atomic__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:725:1: ( ( ruleExpression ) )
            // InternalExpressions.g:726:1: ( ruleExpression )
            {
            // InternalExpressions.g:726:1: ( ruleExpression )
            // InternalExpressions.g:727:2: ruleExpression
            {
             before(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_0__2"
    // InternalExpressions.g:736:1: rule__Atomic__Group_0__2 : rule__Atomic__Group_0__2__Impl ;
    public final void rule__Atomic__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:740:1: ( rule__Atomic__Group_0__2__Impl )
            // InternalExpressions.g:741:2: rule__Atomic__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__2__Impl();

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
    // $ANTLR end "rule__Atomic__Group_0__2"


    // $ANTLR start "rule__Atomic__Group_0__2__Impl"
    // InternalExpressions.g:747:1: rule__Atomic__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:751:1: ( ( ')' ) )
            // InternalExpressions.g:752:1: ( ')' )
            {
            // InternalExpressions.g:752:1: ( ')' )
            // InternalExpressions.g:753:2: ')'
            {
             before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__2__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalExpressions.g:763:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:767:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalExpressions.g:768:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

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
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalExpressions.g:775:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:779:1: ( ( () ) )
            // InternalExpressions.g:780:1: ( () )
            {
            // InternalExpressions.g:780:1: ( () )
            // InternalExpressions.g:781:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 
            // InternalExpressions.g:782:2: ()
            // InternalExpressions.g:782:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalExpressions.g:790:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:794:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalExpressions.g:795:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalExpressions.g:801:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:805:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalExpressions.g:806:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalExpressions.g:806:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalExpressions.g:807:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // InternalExpressions.g:808:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalExpressions.g:808:3: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalExpressions.g:817:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:821:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalExpressions.g:822:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalExpressions.g:829:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:833:1: ( ( () ) )
            // InternalExpressions.g:834:1: ( () )
            {
            // InternalExpressions.g:834:1: ( () )
            // InternalExpressions.g:835:2: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_2_0()); 
            // InternalExpressions.g:836:2: ()
            // InternalExpressions.g:836:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalExpressions.g:844:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:848:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalExpressions.g:849:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalExpressions.g:855:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:859:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalExpressions.g:860:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalExpressions.g:860:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalExpressions.g:861:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalExpressions.g:862:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalExpressions.g:862:3: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // InternalExpressions.g:871:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:875:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalExpressions.g:876:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1();

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
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // InternalExpressions.g:883:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:887:1: ( ( () ) )
            // InternalExpressions.g:888:1: ( () )
            {
            // InternalExpressions.g:888:1: ( () )
            // InternalExpressions.g:889:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_3_0()); 
            // InternalExpressions.g:890:2: ()
            // InternalExpressions.g:890:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBoolConstantAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // InternalExpressions.g:898:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:902:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalExpressions.g:903:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // InternalExpressions.g:909:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:913:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // InternalExpressions.g:914:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // InternalExpressions.g:914:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // InternalExpressions.g:915:2: ( rule__Atomic__ValueAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            // InternalExpressions.g:916:2: ( rule__Atomic__ValueAssignment_3_1 )
            // InternalExpressions.g:916:3: rule__Atomic__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__Atomic__Group_4__0"
    // InternalExpressions.g:925:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:929:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // InternalExpressions.g:930:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Atomic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__1();

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
    // $ANTLR end "rule__Atomic__Group_4__0"


    // $ANTLR start "rule__Atomic__Group_4__0__Impl"
    // InternalExpressions.g:937:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:941:1: ( ( () ) )
            // InternalExpressions.g:942:1: ( () )
            {
            // InternalExpressions.g:942:1: ( () )
            // InternalExpressions.g:943:2: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableRefAction_4_0()); 
            // InternalExpressions.g:944:2: ()
            // InternalExpressions.g:944:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getVariableRefAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0__Impl"


    // $ANTLR start "rule__Atomic__Group_4__1"
    // InternalExpressions.g:952:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:956:1: ( rule__Atomic__Group_4__1__Impl )
            // InternalExpressions.g:957:2: rule__Atomic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_4__1"


    // $ANTLR start "rule__Atomic__Group_4__1__Impl"
    // InternalExpressions.g:963:1: rule__Atomic__Group_4__1__Impl : ( ( rule__Atomic__VariableAssignment_4_1 ) ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:967:1: ( ( ( rule__Atomic__VariableAssignment_4_1 ) ) )
            // InternalExpressions.g:968:1: ( ( rule__Atomic__VariableAssignment_4_1 ) )
            {
            // InternalExpressions.g:968:1: ( ( rule__Atomic__VariableAssignment_4_1 ) )
            // InternalExpressions.g:969:2: ( rule__Atomic__VariableAssignment_4_1 )
            {
             before(grammarAccess.getAtomicAccess().getVariableAssignment_4_1()); 
            // InternalExpressions.g:970:2: ( rule__Atomic__VariableAssignment_4_1 )
            // InternalExpressions.g:970:3: rule__Atomic__VariableAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__VariableAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getVariableAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__1__Impl"


    // $ANTLR start "rule__ExpressionsModel__ElementsAssignment"
    // InternalExpressions.g:979:1: rule__ExpressionsModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__ExpressionsModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:983:1: ( ( ruleAbstractElement ) )
            // InternalExpressions.g:984:2: ( ruleAbstractElement )
            {
            // InternalExpressions.g:984:2: ( ruleAbstractElement )
            // InternalExpressions.g:985:3: ruleAbstractElement
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
    // InternalExpressions.g:994:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:998:1: ( ( RULE_ID ) )
            // InternalExpressions.g:999:2: ( RULE_ID )
            {
            // InternalExpressions.g:999:2: ( RULE_ID )
            // InternalExpressions.g:1000:3: RULE_ID
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
    // InternalExpressions.g:1009:1: rule__Variable__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1013:1: ( ( ruleExpression ) )
            // InternalExpressions.g:1014:2: ( ruleExpression )
            {
            // InternalExpressions.g:1014:2: ( ruleExpression )
            // InternalExpressions.g:1015:3: ruleExpression
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
    // InternalExpressions.g:1024:1: rule__EvalExpression__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__EvalExpression__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1028:1: ( ( ruleExpression ) )
            // InternalExpressions.g:1029:2: ( ruleExpression )
            {
            // InternalExpressions.g:1029:2: ( ruleExpression )
            // InternalExpressions.g:1030:3: ruleExpression
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


    // $ANTLR start "rule__Expression__RightAssignment_1_1"
    // InternalExpressions.g:1039:1: rule__Expression__RightAssignment_1_1 : ( ruleAtomic ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1043:1: ( ( ruleAtomic ) )
            // InternalExpressions.g:1044:2: ( ruleAtomic )
            {
            // InternalExpressions.g:1044:2: ( ruleAtomic )
            // InternalExpressions.g:1045:3: ruleAtomic
            {
             before(grammarAccess.getExpressionAccess().getRightAtomicParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightAtomicParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // InternalExpressions.g:1054:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1058:1: ( ( RULE_INT ) )
            // InternalExpressions.g:1059:2: ( RULE_INT )
            {
            // InternalExpressions.g:1059:2: ( RULE_INT )
            // InternalExpressions.g:1060:3: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // InternalExpressions.g:1069:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1073:1: ( ( RULE_STRING ) )
            // InternalExpressions.g:1074:2: ( RULE_STRING )
            {
            // InternalExpressions.g:1074:2: ( RULE_STRING )
            // InternalExpressions.g:1075:3: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_3_1"
    // InternalExpressions.g:1084:1: rule__Atomic__ValueAssignment_3_1 : ( ( rule__Atomic__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1088:1: ( ( ( rule__Atomic__ValueAlternatives_3_1_0 ) ) )
            // InternalExpressions.g:1089:2: ( ( rule__Atomic__ValueAlternatives_3_1_0 ) )
            {
            // InternalExpressions.g:1089:2: ( ( rule__Atomic__ValueAlternatives_3_1_0 ) )
            // InternalExpressions.g:1090:3: ( rule__Atomic__ValueAlternatives_3_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_3_1_0()); 
            // InternalExpressions.g:1091:3: ( rule__Atomic__ValueAlternatives_3_1_0 )
            // InternalExpressions.g:1091:4: rule__Atomic__ValueAlternatives_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAlternatives_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_3_1"


    // $ANTLR start "rule__Atomic__VariableAssignment_4_1"
    // InternalExpressions.g:1099:1: rule__Atomic__VariableAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__VariableAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExpressions.g:1103:1: ( ( ( RULE_ID ) ) )
            // InternalExpressions.g:1104:2: ( ( RULE_ID ) )
            {
            // InternalExpressions.g:1104:2: ( ( RULE_ID ) )
            // InternalExpressions.g:1105:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_4_1_0()); 
            // InternalExpressions.g:1106:3: ( RULE_ID )
            // InternalExpressions.g:1107:4: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__VariableAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000041870L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001800L});

}