/**
 * generated by Xtext 2.13.0
 */
package org.example.smalljava;

import org.example.smalljava.SmallJavaStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SmallJavaStandaloneSetup extends SmallJavaStandaloneSetupGenerated {
  public static void doSetup() {
    new SmallJavaStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
