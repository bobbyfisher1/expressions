/*
 * generated by Xtext 2.13.0
 */
package org.example.expressions.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ExpressionsAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/example/expressions/parser/antlr/internal/InternalExpressions.tokens");
	}
}
