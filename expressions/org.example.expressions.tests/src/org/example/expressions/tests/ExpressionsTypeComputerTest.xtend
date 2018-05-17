package org.example.expressions.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.example.expressions.expressions.Expression
import org.example.expressions.expressions.ExpressionsModel
import org.example.expressions.typing.ExpressionsType
import org.example.expressions.typing.ExpressionsTypeComputer
import org.junit.Test
import org.junit.runner.RunWith

import static org.example.expressions.typing.ExpressionsTypeComputer.*

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(ExpressionsInjectorProvider)
class ExpressionsTypeComputerTest {
	@Inject extension ParseHelper<ExpressionsModel>
	@Inject extension ExpressionsTypeComputer

	def assertEvalType(CharSequence input, ExpressionsType expectedType) {
		("eval " + input).assertType(expectedType)
	}

	def assertType(CharSequence input, ExpressionsType expectedType) {
		input.parse.elements.last.expression.assertType(expectedType)
	}

	def assertType(Expression e, ExpressionsType expectedType) {
		expectedType.assertSame(e.typeFor)
	}

	@Test def void test_intConstant() { "10".assertEvalType(INT_TYPE) }

	@Test def void test_stringConstant() { "'foo'".assertEvalType(STRING_TYPE) }

	@Test def void notExp() { "!true".assertEvalType(BOOL_TYPE) }

	@Test def void multiExp() { "1 * 2".assertEvalType(INT_TYPE) }

	@Test def void numericPlus() { "1 + 2".assertEvalType(INT_TYPE) }

	@Test def void stringPlus() { "'a' + 'b'".assertEvalType(STRING_TYPE) }

	@Test def void emptyStringPlus() {
		" '' +    ".assertEvalType(STRING_TYPE)
		" '' + '' ".assertEvalType(STRING_TYPE)
//		"  + '' ".assertEvalType(STRING_TYPE) // throws IllegalArgumentException
	}

	@Test def void numAndStringPlus() { "'a' + 2".assertEvalType(STRING_TYPE) }

	@Test def void numAndStringPlus2() { "2 + 'a'".assertEvalType(STRING_TYPE) }

	@Test def void boolAndStringPlus() { "'a' + true".assertEvalType(STRING_TYPE) }

	@Test def void boolAndStringPlus2() { "false+'a'".assertEvalType(STRING_TYPE) }

	@Test def void varRef() { "var i = 0 eval i".assertType(INT_TYPE) }

	@Test def void varRefToVarDefinedAfter() { "var i = j var j = i".assertType(null) }
}
