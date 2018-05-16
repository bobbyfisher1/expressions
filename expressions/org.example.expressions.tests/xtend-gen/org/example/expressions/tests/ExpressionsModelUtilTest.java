package org.example.expressions.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.expressions.ExpressionsModelUtil;
import org.example.expressions.expressions.AbstractElement;
import org.example.expressions.expressions.Expression;
import org.example.expressions.expressions.ExpressionsModel;
import org.example.expressions.expressions.Variable;
import org.example.expressions.expressions.VariableRef;
import org.example.expressions.tests.ExpressionsInjectorProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExpressionsInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionsModelUtilTest {
  @Inject
  @Extension
  private ParseHelper<ExpressionsModel> _parseHelper;
  
  @Inject
  @Extension
  private ExpressionsModelUtil _expressionsModelUtil;
  
  @Test
  public void variablesBeforeVariable() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("eval true    // (0)");
      _builder.newLine();
      _builder.append("var i = 0    // (1)");
      _builder.newLine();
      _builder.append("eval i + 10    // (2)");
      _builder.newLine();
      _builder.append("var j = i    // (3)");
      _builder.newLine();
      _builder.append("eval i + j    // (4)");
      _builder.newLine();
      ExpressionsModel _parse = this._parseHelper.parse(_builder);
      final Procedure1<ExpressionsModel> _function = (ExpressionsModel it) -> {
        this.assertVariablesDefinedBefore(it, 0, "");
        this.assertVariablesDefinedBefore(it, 1, "");
        this.assertVariablesDefinedBefore(it, 2, "i");
        this.assertVariablesDefinedBefore(it, 3, "i");
        this.assertVariablesDefinedBefore(it, 4, "i,j");
      };
      ObjectExtensions.<ExpressionsModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIsVariableDefinedBeforeTrue() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var i = 0");
    _builder.newLine();
    _builder.append("eval i");
    _builder.newLine();
    this.assertVariableDefinedBefore(_builder, true);
  }
  
  @Test
  public void testIsVariableDefinedBeforeFalse() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var i = i");
    _builder.newLine();
    this.assertVariableDefinedBefore(_builder, false);
  }
  
  @Test
  public void testIsVariableDefinedBeforeWhenVariableUndefined() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eval i");
    _builder.newLine();
    this.assertVariableDefinedBefore(_builder, false);
  }
  
  private void assertVariablesDefinedBefore(final ExpressionsModel model, final int elemIndex, final CharSequence expectedVars) {
    final Function1<Variable, String> _function = (Variable it) -> {
      return it.getName();
    };
    Assert.assertEquals(expectedVars, 
      IterableExtensions.join(IterableExtensions.<Variable, String>map(this._expressionsModelUtil.variablesDefinedBefore(model.getElements().get(elemIndex)), _function), ","));
  }
  
  private void assertVariableDefinedBefore(final CharSequence input, final boolean expected) {
    try {
      Expression _expression = IterableExtensions.<AbstractElement>last(this._parseHelper.parse(input).getElements()).getExpression();
      Assert.assertEquals(Boolean.valueOf(expected), 
        Boolean.valueOf(this._expressionsModelUtil.isVariableDefinedBefore(((VariableRef) _expression))));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
