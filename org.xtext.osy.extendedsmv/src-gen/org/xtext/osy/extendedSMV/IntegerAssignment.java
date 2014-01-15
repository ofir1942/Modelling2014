/**
 */
package org.xtext.osy.extendedSMV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.IntegerAssignment#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.osy.extendedSMV.IntegerAssignment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getIntegerAssignment()
 * @model
 * @generated
 */
public interface IntegerAssignment extends AssignmentExpression
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
   * @see #setVar(IntegerDeclarion)
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getIntegerAssignment_Var()
   * @model
   * @generated
   */
  IntegerDeclarion getVar();

  /**
   * Sets the value of the '{@link org.xtext.osy.extendedSMV.IntegerAssignment#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(IntegerDeclarion value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getIntegerAssignment_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.xtext.osy.extendedSMV.IntegerAssignment#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // IntegerAssignment
