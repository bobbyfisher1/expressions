package org.example.expressions.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.example.expressions.expressions.ExpressionsModel
import org.example.expressions.interpreter.ExpressionsInterpreter
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(ExpressionsInjectorProvider)
class ExpressionsInterpreterTest {
	@Inject extension ParseHelper<ExpressionsModel>
	@Inject extension ValidationTestHelper
	@Inject extension ExpressionsInterpreter

	@Test def void intConstant() { "eval 1".assertInterpret(1) }

	@Test def void boolConstant() { "eval true".assertInterpret(true) }

	@Test def void stringConstant() { "eval 'abc'".assertInterpret("abc") }

	def assertInterpret(CharSequence input, Object expected) {
		input.parse => [
			assertNoErrors;
			expected.assertEquals(elements.last.expression.interpret)
		]
	}

}
