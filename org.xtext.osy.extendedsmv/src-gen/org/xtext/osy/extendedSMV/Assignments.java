/**
 */
package org.xtext.osy.extendedSMV;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.Assignments#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getAssignments()
 * @model
 * @generated
 */
public interface Assignments extends Section
{
  /**
   * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.osy.extendedSMV.AssignmentExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignments</em>' containment reference list.
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getAssignments_Assignments()
   * @model containment="true"
   * @generated
   */
  EList<AssignmentExpression> getAssignments();

} // Assignments
