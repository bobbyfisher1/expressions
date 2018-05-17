package org.example.expressions.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.expressions.expressions.AbstractElement;
import org.example.expressions.expressions.Expression;
import org.example.expressions.expressions.ExpressionsModel;
import org.example.expressions.tests.ExpressionsInjectorProvider;
import org.example.expressions.typing.ExpressionsType;
import org.example.expressions.typing.ExpressionsTypeComputer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExpressionsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionsTypeComputerTest {
  @Inject
  @Extension
  private ParseHelper<ExpressionsModel> _parseHelper;
  
  @Inject
  @Extension
  private ExpressionsTypeComputer _expressionsTypeComputer;
  
  public void assertEvalType(final CharSequence input, final ExpressionsType expectedType) {
    this.assertType(("eval " + input), expectedType);
  }
  
  public void assertType(final CharSequence input, final ExpressionsType expectedType) {
    try {
      this.assertType(IterableExtensions.<AbstractElement>last(this._parseHelper.parse(input).getElements()).getExpression(), expectedType);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertType(final Expression e, final ExpressionsType expectedType) {
    Assert.assertSame(expectedType, this._expressionsTypeComputer.typeFor(e));
  }
  
  @Test
  public void test_intConstant() {
    this.assertEvalType("10", ExpressionsTypeComputer.INT_TYPE);
  }
  
  @Test
  public void test_stringConstant() {
    this.assertEvalType("\'foo\'", ExpressionsTypeComputer.STRING_TYPE);
  }
  
  @Test
  public void notExp() {
    this.assertEvalType("!true", ExpressionsTypeComputer.BOOL_TYPE);
  }
  
  @Test
  public void multiExp() {
    this.assertEvalType("1 * 2", ExpressionsTypeComputer.INT_TYPE);
  }
  
  @Test
  public void numericPlus() {
    this.assertEvalType("1 + 2", ExpressionsTypeComputer.INT_TYPE);
  }
  
  @Test
  public void stringPlus() {
    this.assertEvalType("\'a\' + \'b\'", ExpressionsTypeComputer.STRING_TYPE);
  }
  
  @Test
  public void emptyStringPlus() {
    this.assertEvalType(" \'\' +    ", ExpressionsTypeComputer.STRING_TYPE);
    this.assertEvalType(" \'\' + \'\' ", ExpressionsTypeComputer.STRING_TYPE);
  }
  
  @Test
  public void numAndStringPlus() {
    this.assertEvalType("\'a\' + 2", ExpressionsTypeComputer.STRING_TYPE);
  }
  
  @Test
  public void numAndStringPlus2() {
    this.assertEvalType("2 + \'a\'", ExpressionsTypeComputer.STRING_TYPE);
  }
  
  @Test
  public void boolAndStringPlus() {
    this.assertEvalType("\'a\' + true", ExpressionsTypeComputer.STRING_TYPE);
  }
  
  @Test
  public void boolAndStringPlus2() {
    this.assertEvalType("false+\'a\'", ExpressionsTypeComputer.STRING_TYPE);
  }
  
  @Test
  public void varRef() {
    this.assertType("var i = 0 eval i", ExpressionsTypeComputer.INT_TYPE);
  }
  
  @Test
  public void varRefToVarDefinedAfter() {
    this.assertType("var i = j var j = i", null);
  }
}
