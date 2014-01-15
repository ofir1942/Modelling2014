/**
 */
package org.xtext.osy.extendedSMV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.StateAssignment#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.osy.extendedSMV.StateAssignment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getStateAssignment()
 * @model
 * @generated
 */
public interface StateAssignment extends AssignmentExpression
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(StateVariableDeclaration)
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getStateAssignment_Var()
   * @model
   * @generated
   */
  StateVariableDeclaration getVar();

  /**
   * Sets the value of the '{@link org.xtext.osy.extendedSMV.StateAssignment#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(StateVariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getStateAssignment_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.osy.extendedSMV.StateAssignment#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // StateAssignment
