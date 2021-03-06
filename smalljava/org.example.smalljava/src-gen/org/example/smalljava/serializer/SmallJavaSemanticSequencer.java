/*
 * generated by Xtext 2.13.0
 */
package org.example.smalljava.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.example.smalljava.services.SmallJavaGrammarAccess;
import org.example.smalljava.smallJava.SJAssignment;
import org.example.smalljava.smallJava.SJBlock;
import org.example.smalljava.smallJava.SJBoolConstant;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJField;
import org.example.smalljava.smallJava.SJIfStatement;
import org.example.smalljava.smallJava.SJIntConstant;
import org.example.smalljava.smallJava.SJMemberSelection;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJNew;
import org.example.smalljava.smallJava.SJNull;
import org.example.smalljava.smallJava.SJParameter;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.smallJava.SJReturn;
import org.example.smalljava.smallJava.SJStringConstant;
import org.example.smalljava.smallJava.SJSymbolRef;
import org.example.smalljava.smallJava.SJThis;
import org.example.smalljava.smallJava.SJVariableDeclaration;
import org.example.smalljava.smallJava.SmallJavaPackage;

@SuppressWarnings("all")
public class SmallJavaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmallJavaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SmallJavaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SmallJavaPackage.SJ_ASSIGNMENT:
				sequence_SJAssignment(context, (SJAssignment) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_BLOCK:
				if (rule == grammarAccess.getSJBlockRule()) {
					sequence_SJBlock(context, (SJBlock) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSJIfBlockRule()) {
					sequence_SJBlock_SJIfBlock(context, (SJBlock) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaPackage.SJ_BOOL_CONSTANT:
				sequence_SJTerminalExpression(context, (SJBoolConstant) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_CLASS:
				sequence_SJClass(context, (SJClass) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_FIELD:
				sequence_SJTypedDeclaration(context, (SJField) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_IF_STATEMENT:
				sequence_SJIfStatement(context, (SJIfStatement) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_INT_CONSTANT:
				sequence_SJTerminalExpression(context, (SJIntConstant) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_MEMBER_SELECTION:
				sequence_SJSelectionExpression(context, (SJMemberSelection) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_METHOD:
				sequence_SJMethod_SJTypedDeclaration(context, (SJMethod) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_NEW:
				sequence_SJTerminalExpression(context, (SJNew) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_NULL:
				sequence_SJTerminalExpression(context, (SJNull) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_PARAMETER:
				sequence_SJTypedDeclaration(context, (SJParameter) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_PROGRAM:
				sequence_SJProgram(context, (SJProgram) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_RETURN:
				sequence_SJReturn(context, (SJReturn) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_STRING_CONSTANT:
				sequence_SJTerminalExpression(context, (SJStringConstant) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_SYMBOL_REF:
				sequence_SJTerminalExpression(context, (SJSymbolRef) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_THIS:
				sequence_SJTerminalExpression(context, (SJThis) semanticObject); 
				return; 
			case SmallJavaPackage.SJ_VARIABLE_DECLARATION:
				sequence_SJTypedDeclaration_SJVariableDeclaration(context, (SJVariableDeclaration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     SJStatement returns SJAssignment
	 *     SJExpression returns SJAssignment
	 *     SJAssignment returns SJAssignment
	 *     SJAssignment.SJAssignment_1_0 returns SJAssignment
	 *     SJSelectionExpression returns SJAssignment
	 *     SJSelectionExpression.SJMemberSelection_1_0 returns SJAssignment
	 *     SJTerminalExpression returns SJAssignment
	 *
	 * Constraint:
	 *     (left=SJAssignment_SJAssignment_1_0 right=SJExpression)
	 */
	protected void sequence_SJAssignment(ISerializationContext context, SJAssignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_ASSIGNMENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_ASSIGNMENT__LEFT));
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_ASSIGNMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_ASSIGNMENT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSJAssignmentAccess().getRightSJExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SJBlock returns SJBlock
	 *
	 * Constraint:
	 *     statements+=SJStatement*
	 */
	protected void sequence_SJBlock(ISerializationContext context, SJBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SJIfBlock returns SJBlock
	 *
	 * Constraint:
	 *     (statements+=SJStatement+ | statements+=SJStatement)?
	 */
	protected void sequence_SJBlock_SJIfBlock(ISerializationContext context, SJBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SJClass returns SJClass
	 *     SJNamedElement returns SJClass
	 *
	 * Constraint:
	 *     (name=ID superclass=[SJClass|ID]? members+=SJMember*)
	 */
	protected void sequence_SJClass(ISerializationContext context, SJClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SJStatement returns SJIfStatement
	 *     SJIfStatement returns SJIfStatement
	 *
	 * Constraint:
	 *     (expression=SJExpression thenBlock=SJIfBlock elseBlock=SJIfBlock?)
	 */
	protected void sequence_SJIfStatement(ISerializationContext context, SJIfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SJMember returns SJMethod
	 *     SJMethod returns SJMethod
	 *     SJNamedElement returns SJMethod
	 *
	 * Constraint:
	 *     (type=[SJClass|ID] name=ID (params+=SJParameter params+=SJParameter*)? body=SJBlock)
	 */
	protected void sequence_SJMethod_SJTypedDeclaration(ISerializationContext context, SJMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SJProgram returns SJProgram
	 *
	 * Constraint:
	 *     classes+=SJClass+
	 */
	protected void sequence_SJProgram(ISerializationContext context, SJProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SJStatement returns SJReturn
	 *     SJReturn returns SJReturn
	 *
	 * Constraint:
	 *     expression=SJExpression
	 */
	protected void sequence_SJReturn(ISerializationContext context, SJReturn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_RETURN__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_RETURN__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSJReturnAccess().getExpressionSJExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SJStatement returns SJMemberSelection
	 *     SJExpression returns SJMemberSelection
	 *     SJAssignment returns SJMemberSelection
	 *     SJAssignment.SJAssignment_1_0 returns SJMemberSelection
	 *     SJSelectionExpression returns SJMemberSelection
	 *     SJSelectionExpression.SJMemberSelection_1_0 returns SJMemberSelection
	 *     SJTerminalExpression returns SJMemberSelection
	 *
	 * Constraint:
	 *     (receiver=SJSelectionExpression_SJMemberSelection_1_0 member=[SJMember|ID] (methodinvocation?='(' (args+=SJExpression args+=SJExpression*)?)?)
	 */
	protected void sequence_SJSelectionExpression(ISerializationContext context, SJMemberSelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SJStatement returns SJBoolConstant
	 *     SJExpression returns SJBoolConstant
	 *     SJAssignment returns SJBoolConstant
	 *     SJAssignment.SJAssignment_1_0 returns SJBoolConstant
	 *     SJSelectionExpression returns SJBoolConstant
	 *     SJSelectionExpression.SJMemberSelection_1_0 returns SJBoolConstant
	 *     SJTerminalExpression returns SJBoolConstant
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_SJTerminalExpression(ISerializationContext context, SJBoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SJStatement returns SJIntConstant
	 *     SJExpression returns SJIntConstant
	 *     SJAssignment returns SJIntConstant
	 *     SJAssignment.SJAssignment_1_0 returns SJIntConstant
	 *     SJSelectionExpression returns SJIntConstant
	 *     SJSelectionExpression.SJMemberSelection_1_0 returns SJIntConstant
	 *     SJTerminalExpression returns SJIntConstant
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_SJTerminalExpression(ISerializationContext context, SJIntConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_INT_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSJTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SJStatement returns SJNew
	 *     SJExpression returns SJNew
	 *     SJAssignment returns SJNew
	 *     SJAssignment.SJAssignment_1_0 returns SJNew
	 *     SJSelectionExpression returns SJNew
	 *     SJSelectionExpression.SJMemberSelection_1_0 returns SJNew
	 *     SJTerminalExpression returns SJNew
	 *
	 * Constraint:
	 *     type=[SJClass|ID]
	 */
	protected void sequence_SJTerminalExpression(ISerializationContext context, SJNew semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_NEW__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_NEW__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSJTerminalExpressionAccess().getTypeSJClassIDTerminalRuleCall_6_2_0_1(), semanticObject.eGet(SmallJavaPackage.Literals.SJ_NEW__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SJStatement returns SJNull
	 *     SJExpression returns SJNull
	 *     SJAssignment returns SJNull
	 *     SJAssignment.SJAssignment_1_0 returns SJNull
	 *     SJSelectionExpression returns SJNull
	 *     SJSelectionExpression.SJMemberSelection_1_0 returns SJNull
	 *     SJTerminalExpression returns SJNull
	 *
	 * Constraint:
	 *     {SJNull}
	 */
	protected void sequence_SJTerminalExpression(ISerializationContext context, SJNull semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SJStatement returns SJStringConstant
	 *     SJExpression returns SJStringConstant
	 *     SJAssignment returns SJStringConstant
	 *     SJAssignment.SJAssignment_1_0 returns SJStringConstant
	 *     SJSelectionExpression returns SJStringConstant
	 *     SJSelectionExpression.SJMemberSelection_1_0 returns SJStringConstant
	 *     SJTerminalExpression returns SJStringConstant
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_SJTerminalExpression(ISerializationContext context, SJStringConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_STRING_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSJTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SJStatement returns SJSymbolRef
	 *     SJExpression returns SJSymbolRef
	 *     SJAssignment returns SJSymbolRef
	 *     SJAssignment.SJAssignment_1_0 returns SJSymbolRef
	 *     SJSelectionExpression returns SJSymbolRef
	 *     SJSelectionExpression.SJMemberSelection_1_0 returns SJSymbolRef
	 *     SJTerminalExpression returns SJSymbolRef
	 *
	 * Constraint:
	 *     symbol=[SJSymbol|ID]
	 */
	protected void sequence_SJTerminalExpression(ISerializationContext context, SJSymbolRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL_REF__SYMBOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL_REF__SYMBOL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSJTerminalExpressionAccess().getSymbolSJSymbolIDTerminalRuleCall_5_1_0_1(), semanticObject.eGet(SmallJavaPackage.Literals.SJ_SYMBOL_REF__SYMBOL, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SJStatement returns SJThis
	 *     SJExpression returns SJThis
	 *     SJAssignment returns SJThis
	 *     SJAssignment.SJAssignment_1_0 returns SJThis
	 *     SJSelectionExpression returns SJThis
	 *     SJSelectionExpression.SJMemberSelection_1_0 returns SJThis
	 *     SJTerminalExpression returns SJThis
	 *
	 * Constraint:
	 *     {SJThis}
	 */
	protected void sequence_SJTerminalExpression(ISerializationContext context, SJThis semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SJMember returns SJField
	 *     SJField returns SJField
	 *     SJNamedElement returns SJField
	 *
	 * Constraint:
	 *     (type=[SJClass|ID] name=ID)
	 */
	protected void sequence_SJTypedDeclaration(ISerializationContext context, SJField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_MEMBER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_MEMBER__TYPE));
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSJTypedDeclarationAccess().getTypeSJClassIDTerminalRuleCall_0_0_1(), semanticObject.eGet(SmallJavaPackage.Literals.SJ_MEMBER__TYPE, false));
		feeder.accept(grammarAccess.getSJTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SJParameter returns SJParameter
	 *     SJSymbol returns SJParameter
	 *     SJNamedElement returns SJParameter
	 *
	 * Constraint:
	 *     (type=[SJClass|ID] name=ID)
	 */
	protected void sequence_SJTypedDeclaration(ISerializationContext context, SJParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_MEMBER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_MEMBER__TYPE));
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSJTypedDeclarationAccess().getTypeSJClassIDTerminalRuleCall_0_0_1(), semanticObject.eGet(SmallJavaPackage.Literals.SJ_MEMBER__TYPE, false));
		feeder.accept(grammarAccess.getSJTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SJStatement returns SJVariableDeclaration
	 *     SJVariableDeclaration returns SJVariableDeclaration
	 *     SJSymbol returns SJVariableDeclaration
	 *     SJNamedElement returns SJVariableDeclaration
	 *
	 * Constraint:
	 *     (type=[SJClass|ID] name=ID expression=SJExpression)
	 */
	protected void sequence_SJTypedDeclaration_SJVariableDeclaration(ISerializationContext context, SJVariableDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_SYMBOL__TYPE));
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SmallJavaPackage.Literals.SJ_VARIABLE_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaPackage.Literals.SJ_VARIABLE_DECLARATION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSJTypedDeclarationAccess().getTypeSJClassIDTerminalRuleCall_0_0_1(), semanticObject.eGet(SmallJavaPackage.Literals.SJ_SYMBOL__TYPE, false));
		feeder.accept(grammarAccess.getSJTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSJVariableDeclarationAccess().getExpressionSJExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
}
