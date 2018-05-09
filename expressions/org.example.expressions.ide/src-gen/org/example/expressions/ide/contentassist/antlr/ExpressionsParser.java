/*
 * generated by Xtext 2.13.0
 */
package org.example.expressions.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.example.expressions.ide.contentassist.antlr.internal.InternalExpressionsParser;
import org.example.expressions.services.ExpressionsGrammarAccess;

public class ExpressionsParser extends AbstractContentAssistParser {

	@Inject
	private ExpressionsGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalExpressionsParser createParser() {
		InternalExpressionsParser result = new InternalExpressionsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives_1_0(), "rule__Expression__Alternatives_1_0");
					put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
					put(grammarAccess.getAtomicAccess().getValueAlternatives_3_1_0(), "rule__Atomic__ValueAlternatives_3_1_0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getEvalExpressionAccess().getGroup(), "rule__EvalExpression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getExpressionAccess().getGroup_1_0_0(), "rule__Expression__Group_1_0_0__0");
					put(grammarAccess.getExpressionAccess().getGroup_1_0_1(), "rule__Expression__Group_1_0_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
					put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
					put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
					put(grammarAccess.getAtomicAccess().getGroup_4(), "rule__Atomic__Group_4__0");
					put(grammarAccess.getExpressionsModelAccess().getElementsAssignment(), "rule__ExpressionsModel__ElementsAssignment");
					put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
					put(grammarAccess.getVariableAccess().getExpressionAssignment_3(), "rule__Variable__ExpressionAssignment_3");
					put(grammarAccess.getEvalExpressionAccess().getExpressionAssignment_1(), "rule__EvalExpression__ExpressionAssignment_1");
					put(grammarAccess.getExpressionAccess().getRightAssignment_1_1(), "rule__Expression__RightAssignment_1_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_3_1(), "rule__Atomic__ValueAssignment_3_1");
					put(grammarAccess.getAtomicAccess().getVariableAssignment_4_1(), "rule__Atomic__VariableAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ExpressionsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
