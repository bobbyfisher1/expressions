package org.example.smalljava.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.example.smalljava.SmallJavaModelUtil
import org.example.smalljava.smallJava.SJClass
import org.example.smalljava.smallJava.SJMemberSelection
import org.example.smalljava.smallJava.SJProgram
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(SmallJavaInjectorProvider)
class SmallJavaModelUtilTest {

	@Inject extension ParseHelper<SJProgram>
	@Inject extension SmallJavaModelUtil

	@Test
	def void testModelUtilMethodsByType() {
		var s = '''
			class C {
				C f;
				C m() {
					if (true) {
						
					}
					return this.c;
				}
			}
		'''
//		s.parse.classes.head => [
//			"f".assertEquals(fields.head.name)
//			"m".assertEquals(methods.head.name)
//			(methods.head.returnStatement.expression instanceof SJMemberSelection).assertTrue
//		]
		s.parse.classes.head.fields.head.name.assertEquals("f")
		s.parse.classes.head.methods.head.name.assertEquals("m")
		(s.parse.classes.head.methods.head.returnStatement.expression instanceof SJMemberSelection).assertTrue

	}
}
