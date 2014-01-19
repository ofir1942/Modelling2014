/**
 */
package org.xtext.osy.extendedSMV;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.Model#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.osy.extendedSMV.Section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage#getModel_Sections()
   * @model containment="true"
   * @generated
   */
  EList<Section> getSections();

} // Model
