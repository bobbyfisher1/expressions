package org.example.expressions.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.expressions.expressions.ExpressionsModel;
import org.example.expressions.expressions.ExpressionsPackage;
import org.example.expressions.tests.ExpressionsInjectorProvider;
import org.example.expressions.validation.ExpressionsValidator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExpressionsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionValidatorTest {
  @Inject
  @Extension
  private ParseHelper<ExpressionsModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testForwardReferenceInExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var i = j var j = 10");
      ExpressionsModel _parse = this._parseHelper.parse(_builder);
      final Procedure1<ExpressionsModel> _function = (ExpressionsModel it) -> {
        this._validationTestHelper.assertError(it, 
          ExpressionsPackage.eINSTANCE.getVariableRef(), 
          ExpressionsValidator.FORWARD_REFERENCE, 
          "variable forward reference not allowed: \'j\'");
        Assert.assertEquals(1, this._validationTestHelper.validate(it).size());
      };
      ObjectExtensions.<ExpressionsModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNoForwardReference() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var j = 0");
      _builder.newLine();
      _builder.append("var i = j");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
