package org.example.expressions.ui.hover;

import javax.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.expressions.expressions.Expression;
import org.example.expressions.interpreter.ExpressionsInterpreter;
import org.example.expressions.typing.ExpressionsTypeComputer;

@SuppressWarnings("all")
public class ExpressionsEObjectHoverProvider extends DefaultEObjectHoverProvider {
  @Inject
  @Extension
  private ExpressionsTypeComputer _expressionsTypeComputer;
  
  @Inject
  @Extension
  private ExpressionsInterpreter _expressionsInterpreter;
  
  @Override
  public String getHoverInfoAsHtml(final EObject o) {
    if (((o instanceof Expression) && this.programHasNoError(o))) {
      final Expression exp = ((Expression) o);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<p>");
      _builder.newLine();
      _builder.append("type  : <b>");
      String _string = this._expressionsTypeComputer.typeFor(exp).toString();
      _builder.append(_string);
      _builder.append("</b> <br>");
      _builder.newLineIfNotEmpty();
      _builder.append("value : <b>");
      String _string_1 = this._expressionsInterpreter.interpret(exp).toString();
      _builder.append(_string_1);
      _builder.append("</b>");
      _builder.newLineIfNotEmpty();
      _builder.append("</p>");
      _builder.newLine();
      return _builder.toString();
    } else {
      return super.getHoverInfoAsHtml(o);
    }
  }
  
  public boolean programHasNoError(final EObject o) {
    return Diagnostician.INSTANCE.validate(EcoreUtil.getRootContainer(o)).getChildren().isEmpty();
  }
}
