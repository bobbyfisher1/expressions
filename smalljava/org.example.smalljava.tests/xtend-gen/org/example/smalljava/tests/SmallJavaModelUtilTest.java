package org.example.smalljava.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.smalljava.SmallJavaModelUtil;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJExpression;
import org.example.smalljava.smallJava.SJField;
import org.example.smalljava.smallJava.SJMemberSelection;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJProgram;
import org.example.smalljava.tests.SmallJavaInjectorProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SmallJavaInjectorProvider.class)
@SuppressWarnings("all")
public class SmallJavaModelUtilTest {
  @Inject
  @Extension
  private ParseHelper<SJProgram> _parseHelper;
  
  @Inject
  @Extension
  private SmallJavaModelUtil _smallJavaModelUtil;
  
  @Test
  public void testModelUtilMethodsByType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("C m() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (true) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return this.c;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String s = _builder.toString();
      Assert.assertEquals(IterableExtensions.<SJField>head(this._smallJavaModelUtil.fields(IterableExtensions.<SJClass>head(this._parseHelper.parse(s).getClasses()))).getName(), "f");
      Assert.assertEquals(IterableExtensions.<SJMethod>head(this._smallJavaModelUtil.methods(IterableExtensions.<SJClass>head(this._parseHelper.parse(s).getClasses()))).getName(), "m");
      SJExpression _expression = this._smallJavaModelUtil.returnStatement(IterableExtensions.<SJMethod>head(this._smallJavaModelUtil.methods(IterableExtensions.<SJClass>head(this._parseHelper.parse(s).getClasses())))).getExpression();
      Assert.assertTrue((_expression instanceof SJMemberSelection));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
