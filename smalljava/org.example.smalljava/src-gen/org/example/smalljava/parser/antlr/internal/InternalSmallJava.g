/*
 * generated by Xtext 2.13.0
 */
grammar InternalSmallJava;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.example.smalljava.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSJProgram
entryRuleSJProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJProgramRule()); }
	iv_ruleSJProgram=ruleSJProgram
	{ $current=$iv_ruleSJProgram.current; }
	EOF;

// Rule SJProgram
ruleSJProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getSJProgramAccess().getClassesSJClassParserRuleCall_0());
			}
			lv_classes_0_0=ruleSJClass
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getSJProgramRule());
				}
				add(
					$current,
					"classes",
					lv_classes_0_0,
					"org.example.smalljava.SmallJava.SJClass");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleSJClass
entryRuleSJClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJClassRule()); }
	iv_ruleSJClass=ruleSJClass
	{ $current=$iv_ruleSJClass.current; }
	EOF;

// Rule SJClass
ruleSJClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='class'
		{
			newLeafNode(otherlv_0, grammarAccess.getSJClassAccess().getClassKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSJClassAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSJClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='extends'
			{
				newLeafNode(otherlv_2, grammarAccess.getSJClassAccess().getExtendsKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSJClassRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getSJClassAccess().getSuperclassSJClassCrossReference_2_1_0());
					}
				)
			)
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getSJClassAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSJClassAccess().getMembersSJMemberParserRuleCall_4_0());
				}
				lv_members_5_0=ruleSJMember
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSJClassRule());
					}
					add(
						$current,
						"members",
						lv_members_5_0,
						"org.example.smalljava.SmallJava.SJMember");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getSJClassAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleSJMember
entryRuleSJMember returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJMemberRule()); }
	iv_ruleSJMember=ruleSJMember
	{ $current=$iv_ruleSJMember.current; }
	EOF;

// Rule SJMember
ruleSJMember returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSJMemberAccess().getSJFieldParserRuleCall_0());
		}
		this_SJField_0=ruleSJField
		{
			$current = $this_SJField_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSJMemberAccess().getSJMethodParserRuleCall_1());
		}
		this_SJMethod_1=ruleSJMethod
		{
			$current = $this_SJMethod_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSJField
entryRuleSJField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJFieldRule()); }
	iv_ruleSJField=ruleSJField
	{ $current=$iv_ruleSJField.current; }
	EOF;

// Rule SJField
ruleSJField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getSJFieldRule());
			}
			newCompositeNode(grammarAccess.getSJFieldAccess().getSJTypedDeclarationParserRuleCall_0());
		}
		this_SJTypedDeclaration_0=ruleSJTypedDeclaration[$current]
		{
			$current = $this_SJTypedDeclaration_0.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_1=';'
		{
			newLeafNode(otherlv_1, grammarAccess.getSJFieldAccess().getSemicolonKeyword_1());
		}
	)
;

// Entry rule entryRuleSJMethod
entryRuleSJMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJMethodRule()); }
	iv_ruleSJMethod=ruleSJMethod
	{ $current=$iv_ruleSJMethod.current; }
	EOF;

// Rule SJMethod
ruleSJMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getSJMethodRule());
			}
			newCompositeNode(grammarAccess.getSJMethodAccess().getSJTypedDeclarationParserRuleCall_0());
		}
		this_SJTypedDeclaration_0=ruleSJTypedDeclaration[$current]
		{
			$current = $this_SJTypedDeclaration_0.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getSJMethodAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_2_0_0());
					}
					lv_params_2_0=ruleSJParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSJMethodRule());
						}
						add(
							$current,
							"params",
							lv_params_2_0,
							"org.example.smalljava.SmallJava.SJParameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getSJMethodAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_2_1_1_0());
						}
						lv_params_4_0=ruleSJParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSJMethodRule());
							}
							add(
								$current,
								"params",
								lv_params_4_0,
								"org.example.smalljava.SmallJava.SJParameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getSJMethodAccess().getRightParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSJMethodAccess().getBodySJBlockParserRuleCall_4_0());
				}
				lv_body_6_0=ruleSJBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSJMethodRule());
					}
					set(
						$current,
						"body",
						lv_body_6_0,
						"org.example.smalljava.SmallJava.SJBlock");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSJParameter
entryRuleSJParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJParameterRule()); }
	iv_ruleSJParameter=ruleSJParameter
	{ $current=$iv_ruleSJParameter.current; }
	EOF;

// Rule SJParameter
ruleSJParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		if ($current==null) {
			$current = createModelElement(grammarAccess.getSJParameterRule());
		}
		newCompositeNode(grammarAccess.getSJParameterAccess().getSJTypedDeclarationParserRuleCall());
	}
	this_SJTypedDeclaration_0=ruleSJTypedDeclaration[$current]
	{
		$current = $this_SJTypedDeclaration_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleSJBlock
entryRuleSJBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJBlockRule()); }
	iv_ruleSJBlock=ruleSJBlock
	{ $current=$iv_ruleSJBlock.current; }
	EOF;

// Rule SJBlock
ruleSJBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSJBlockAccess().getSJBlockAction_0(),
					$current);
			}
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getSJBlockAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSJBlockAccess().getStatementsSJStatementParserRuleCall_2_0());
				}
				lv_statements_2_0=ruleSJStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSJBlockRule());
					}
					add(
						$current,
						"statements",
						lv_statements_2_0,
						"org.example.smalljava.SmallJava.SJStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getSJBlockAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleSJStatement
entryRuleSJStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJStatementRule()); }
	iv_ruleSJStatement=ruleSJStatement
	{ $current=$iv_ruleSJStatement.current; }
	EOF;

// Rule SJStatement
ruleSJStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSJStatementAccess().getSJVariableDeclarationParserRuleCall_0());
		}
		this_SJVariableDeclaration_0=ruleSJVariableDeclaration
		{
			$current = $this_SJVariableDeclaration_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSJStatementAccess().getSJReturnParserRuleCall_1());
		}
		this_SJReturn_1=ruleSJReturn
		{
			$current = $this_SJReturn_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			{
				newCompositeNode(grammarAccess.getSJStatementAccess().getSJExpressionParserRuleCall_2_0());
			}
			this_SJExpression_2=ruleSJExpression
			{
				$current = $this_SJExpression_2.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getSJStatementAccess().getSemicolonKeyword_2_1());
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getSJStatementAccess().getSJIfStatementParserRuleCall_3());
		}
		this_SJIfStatement_4=ruleSJIfStatement
		{
			$current = $this_SJIfStatement_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSJVariableDeclaration
entryRuleSJVariableDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJVariableDeclarationRule()); }
	iv_ruleSJVariableDeclaration=ruleSJVariableDeclaration
	{ $current=$iv_ruleSJVariableDeclaration.current; }
	EOF;

// Rule SJVariableDeclaration
ruleSJVariableDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getSJVariableDeclarationRule());
			}
			newCompositeNode(grammarAccess.getSJVariableDeclarationAccess().getSJTypedDeclarationParserRuleCall_0());
		}
		this_SJTypedDeclaration_0=ruleSJTypedDeclaration[$current]
		{
			$current = $this_SJTypedDeclaration_0.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getSJVariableDeclarationAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSJVariableDeclarationAccess().getExpressionSJExpressionParserRuleCall_2_0());
				}
				lv_expression_2_0=ruleSJExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSJVariableDeclarationRule());
					}
					set(
						$current,
						"expression",
						lv_expression_2_0,
						"org.example.smalljava.SmallJava.SJExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getSJVariableDeclarationAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleSJReturn
entryRuleSJReturn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJReturnRule()); }
	iv_ruleSJReturn=ruleSJReturn
	{ $current=$iv_ruleSJReturn.current; }
	EOF;

// Rule SJReturn
ruleSJReturn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='return'
		{
			newLeafNode(otherlv_0, grammarAccess.getSJReturnAccess().getReturnKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSJReturnAccess().getExpressionSJExpressionParserRuleCall_1_0());
				}
				lv_expression_1_0=ruleSJExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSJReturnRule());
					}
					set(
						$current,
						"expression",
						lv_expression_1_0,
						"org.example.smalljava.SmallJava.SJExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getSJReturnAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleSJIfStatement
entryRuleSJIfStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJIfStatementRule()); }
	iv_ruleSJIfStatement=ruleSJIfStatement
	{ $current=$iv_ruleSJIfStatement.current; }
	EOF;

// Rule SJIfStatement
ruleSJIfStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getSJIfStatementAccess().getIfKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getSJIfStatementAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSJIfStatementAccess().getExpressionSJExpressionParserRuleCall_2_0());
				}
				lv_expression_2_0=ruleSJExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSJIfStatementRule());
					}
					set(
						$current,
						"expression",
						lv_expression_2_0,
						"org.example.smalljava.SmallJava.SJExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getSJIfStatementAccess().getRightParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSJIfStatementAccess().getThenBlockSJIfBlockParserRuleCall_4_0());
				}
				lv_thenBlock_4_0=ruleSJIfBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSJIfStatementRule());
					}
					set(
						$current,
						"thenBlock",
						lv_thenBlock_4_0,
						"org.example.smalljava.SmallJava.SJIfBlock");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				('else')=>
				otherlv_5='else'
				{
					newLeafNode(otherlv_5, grammarAccess.getSJIfStatementAccess().getElseKeyword_5_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSJIfStatementAccess().getElseBlockSJIfBlockParserRuleCall_5_1_0());
					}
					lv_elseBlock_6_0=ruleSJIfBlock
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSJIfStatementRule());
						}
						set(
							$current,
							"elseBlock",
							lv_elseBlock_6_0,
							"org.example.smalljava.SmallJava.SJIfBlock");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleSJIfBlock
entryRuleSJIfBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJIfBlockRule()); }
	iv_ruleSJIfBlock=ruleSJIfBlock
	{ $current=$iv_ruleSJIfBlock.current; }
	EOF;

// Rule SJIfBlock
ruleSJIfBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSJIfBlockAccess().getStatementsSJStatementParserRuleCall_0_0());
				}
				lv_statements_0_0=ruleSJStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSJIfBlockRule());
					}
					add(
						$current,
						"statements",
						lv_statements_0_0,
						"org.example.smalljava.SmallJava.SJStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getSJIfBlockAccess().getSJBlockParserRuleCall_1());
		}
		this_SJBlock_1=ruleSJBlock
		{
			$current = $this_SJBlock_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSJSymbol
entryRuleSJSymbol returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJSymbolRule()); }
	iv_ruleSJSymbol=ruleSJSymbol
	{ $current=$iv_ruleSJSymbol.current; }
	EOF;

// Rule SJSymbol
ruleSJSymbol returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSJSymbolAccess().getSJVariableDeclarationParserRuleCall_0());
		}
		this_SJVariableDeclaration_0=ruleSJVariableDeclaration
		{
			$current = $this_SJVariableDeclaration_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSJSymbolAccess().getSJParameterParserRuleCall_1());
		}
		this_SJParameter_1=ruleSJParameter
		{
			$current = $this_SJParameter_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;


// Rule SJTypedDeclaration
ruleSJTypedDeclaration[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSJTypedDeclarationRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getSJTypedDeclarationAccess().getTypeSJClassCrossReference_0_0());
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSJTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSJTypedDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSJExpression
entryRuleSJExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJExpressionRule()); }
	iv_ruleSJExpression=ruleSJExpression
	{ $current=$iv_ruleSJExpression.current; }
	EOF;

// Rule SJExpression
ruleSJExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getSJExpressionAccess().getSJAssignmentParserRuleCall());
	}
	this_SJAssignment_0=ruleSJAssignment
	{
		$current = $this_SJAssignment_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleSJAssignment
entryRuleSJAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJAssignmentRule()); }
	iv_ruleSJAssignment=ruleSJAssignment
	{ $current=$iv_ruleSJAssignment.current; }
	EOF;

// Rule SJAssignment
ruleSJAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSJAssignmentAccess().getSJSelectionExpressionParserRuleCall_0());
		}
		this_SJSelectionExpression_0=ruleSJSelectionExpression
		{
			$current = $this_SJSelectionExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='='
			{
				newLeafNode(otherlv_2, grammarAccess.getSJAssignmentAccess().getEqualsSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSJAssignmentAccess().getRightSJExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleSJExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSJAssignmentRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.example.smalljava.SmallJava.SJExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleSJSelectionExpression
entryRuleSJSelectionExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJSelectionExpressionRule()); }
	iv_ruleSJSelectionExpression=ruleSJSelectionExpression
	{ $current=$iv_ruleSJSelectionExpression.current; }
	EOF;

// Rule SJSelectionExpression
ruleSJSelectionExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSJSelectionExpressionAccess().getSJTerminalExpressionParserRuleCall_0());
		}
		this_SJTerminalExpression_0=ruleSJTerminalExpression
		{
			$current = $this_SJTerminalExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0(),
						$current);
				}
			)
			otherlv_2='.'
			{
				newLeafNode(otherlv_2, grammarAccess.getSJSelectionExpressionAccess().getFullStopKeyword_1_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSJSelectionExpressionRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getSJSelectionExpressionAccess().getMemberSJMemberCrossReference_1_2_0());
					}
				)
			)
			(
				(
					(
						lv_methodinvocation_4_0='('
						{
							newLeafNode(lv_methodinvocation_4_0, grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSJSelectionExpressionRule());
							}
							setWithLastConsumed($current, "methodinvocation", true, "(");
						}
					)
				)
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_0_0());
							}
							lv_args_5_0=ruleSJExpression
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSJSelectionExpressionRule());
								}
								add(
									$current,
									"args",
									lv_args_5_0,
									"org.example.smalljava.SmallJava.SJExpression");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_6=','
						{
							newLeafNode(otherlv_6, grammarAccess.getSJSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_1_1_0());
								}
								lv_args_7_0=ruleSJExpression
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getSJSelectionExpressionRule());
									}
									add(
										$current,
										"args",
										lv_args_7_0,
										"org.example.smalljava.SmallJava.SJExpression");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)?
				otherlv_8=')'
				{
					newLeafNode(otherlv_8, grammarAccess.getSJSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2());
				}
			)?
		)*
	)
;

// Entry rule entryRuleSJTerminalExpression
entryRuleSJTerminalExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSJTerminalExpressionRule()); }
	iv_ruleSJTerminalExpression=ruleSJTerminalExpression
	{ $current=$iv_ruleSJTerminalExpression.current; }
	EOF;

// Rule SJTerminalExpression
ruleSJTerminalExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSJTerminalExpressionAccess().getSJStringConstantAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_value_1_0=RULE_STRING
					{
						newLeafNode(lv_value_1_0, grammarAccess.getSJTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSJTerminalExpressionAccess().getSJIntConstantAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_value_3_0=RULE_INT
					{
						newLeafNode(lv_value_3_0, grammarAccess.getSJTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_3_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSJTerminalExpressionAccess().getSJBoolConstantAction_2_0(),
						$current);
				}
			)
			(
				(
					(
						lv_value_5_1='true'
						{
							newLeafNode(lv_value_5_1, grammarAccess.getSJTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
							}
							setWithLastConsumed($current, "value", lv_value_5_1, null);
						}
						    |
						lv_value_5_2='false'
						{
							newLeafNode(lv_value_5_2, grammarAccess.getSJTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
							}
							setWithLastConsumed($current, "value", lv_value_5_2, null);
						}
					)
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSJTerminalExpressionAccess().getSJThisAction_3_0(),
						$current);
				}
			)
			otherlv_7='this'
			{
				newLeafNode(otherlv_7, grammarAccess.getSJTerminalExpressionAccess().getThisKeyword_3_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSJTerminalExpressionAccess().getSJNullAction_4_0(),
						$current);
				}
			)
			otherlv_9='null'
			{
				newLeafNode(otherlv_9, grammarAccess.getSJTerminalExpressionAccess().getNullKeyword_4_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSJTerminalExpressionAccess().getSJSymbolRefAction_5_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
						}
					}
					otherlv_11=RULE_ID
					{
						newLeafNode(otherlv_11, grammarAccess.getSJTerminalExpressionAccess().getSymbolSJSymbolCrossReference_5_1_0());
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getSJTerminalExpressionAccess().getSJNewAction_6_0(),
						$current);
				}
			)
			otherlv_13='new'
			{
				newLeafNode(otherlv_13, grammarAccess.getSJTerminalExpressionAccess().getNewKeyword_6_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
						}
					}
					otherlv_14=RULE_ID
					{
						newLeafNode(otherlv_14, grammarAccess.getSJTerminalExpressionAccess().getTypeSJClassCrossReference_6_2_0());
					}
				)
			)
			otherlv_15='('
			{
				newLeafNode(otherlv_15, grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_6_3());
			}
			otherlv_16=')'
			{
				newLeafNode(otherlv_16, grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_6_4());
			}
		)
		    |
		(
			otherlv_17='('
			{
				newLeafNode(otherlv_17, grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_7_0());
			}
			{
				newCompositeNode(grammarAccess.getSJTerminalExpressionAccess().getSJExpressionParserRuleCall_7_1());
			}
			this_SJExpression_18=ruleSJExpression
			{
				$current = $this_SJExpression_18.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_19=')'
			{
				newLeafNode(otherlv_19, grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_7_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
