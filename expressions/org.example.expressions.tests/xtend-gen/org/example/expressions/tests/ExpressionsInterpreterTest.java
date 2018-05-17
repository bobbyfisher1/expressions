package org.example.expressions.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.expressions.expressions.AbstractElement;
import org.example.expressions.expressions.ExpressionsModel;
import org.example.expressions.interpreter.ExpressionsInterpreter;
import org.example.expressions.tests.ExpressionsInjectorProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExpressionsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionsInterpreterTest {
  @Inject
  @Extension
  private ParseHelper<ExpressionsModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private ExpressionsInterpreter _expressionsInterpreter;
  
  @Test
  public void intConstant() {
    this.assertInterpret("eval 1", Integer.valueOf(1));
  }
  
  @Test
  public void boolConstant() {
    this.assertInterpret("eval true", Boolean.valueOf(true));
  }
  
  @Test
  public void stringConstant() {
    this.assertInterpret("eval \'abc\'", "abc");
  }
  
  public ExpressionsModel assertInterpret(final CharSequence input, final Object expected) {
    try {
      ExpressionsModel _parse = this._parseHelper.parse(input);
      final Procedure1<ExpressionsModel> _function = (ExpressionsModel it) -> {
        this._validationTestHelper.assertNoErrors(it);
        Assert.assertEquals(expected, this._expressionsInterpreter.interpret(IterableExtensions.<AbstractElement>last(it.getElements()).getExpression()));
      };
      return ObjectExtensions.<ExpressionsModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
