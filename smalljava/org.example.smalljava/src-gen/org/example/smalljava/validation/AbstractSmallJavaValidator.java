/*
 * generated by Xtext 2.13.0
 */
package org.example.smalljava.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSmallJavaValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.example.smalljava.smallJava.SmallJavaPackage.eINSTANCE);
		return result;
	}
	
}
