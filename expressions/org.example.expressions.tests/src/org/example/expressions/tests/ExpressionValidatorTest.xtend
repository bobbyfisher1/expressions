package org.example.expressions.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.example.expressions.expressions.ExpressionsModel
import org.example.expressions.expressions.ExpressionsPackage
import org.example.expressions.validation.ExpressionsValidator
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(ExpressionsInjectorProvider)
class ExpressionValidatorTest {

	@Inject extension ParseHelper<ExpressionsModel>
	@Inject extension ValidationTestHelper

	@Test
	def void testForwardReferenceInExpression() {
		'''var i = j var j = 10'''.parse => [
			assertError(
				ExpressionsPackage.eINSTANCE.variableRef,
				ExpressionsValidator.FORWARD_REFERENCE,
				"variable forward reference not allowed: 'j'"
			)
			// check that it is the only error
			1.assertEquals(validate.size)
		]
	}

	@Test
	def void testNoForwardReference() {
		'''
			var j = 0
			var i = j
		'''.parse.assertNoErrors
	}


}
