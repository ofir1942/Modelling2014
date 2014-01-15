/**
 */
package org.xtext.osy.extendedSMV;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.StateVariableDeclaration#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getStateVariableDeclaration()
 * @model
 * @generated
 */
public interface StateVariableDeclaration extends VariableDeclaration
{
  /**
   * Returns the value of the '<em><b>States</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' attribute list.
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getStateVariableDeclaration_States()
   * @model unique="false"
   * @generated
   */
  EList<String> getStates();

} // StateVariableDeclaration
