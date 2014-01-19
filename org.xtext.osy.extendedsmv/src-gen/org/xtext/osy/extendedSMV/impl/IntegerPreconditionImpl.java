/**
 */
package org.xtext.osy.extendedSMV.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.osy.extendedSMV.ExtendedSMVPackage;
import org.xtext.osy.extendedSMV.IntegerDeclarion;
import org.xtext.osy.extendedSMV.IntegerPrecondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Precondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.impl.IntegerPreconditionImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.osy.extendedSMV.impl.IntegerPreconditionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerPreconditionImpl extends PreconditionStatementImpl implements IntegerPrecondition
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected IntegerDeclarion var;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntegerPreconditionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExtendedSMVPackage.Literals.INTEGER_PRECONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerDeclarion getVar()
  {
    if (var != null && var.eIsProxy())
    {
      InternalEObject oldVar = (InternalEObject)var;
      var = (IntegerDeclarion)eResolveProxy(oldVar);
      if (var != oldVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtendedSMVPackage.INTEGER_PRECONDITION__VAR, oldVar, var));
      }
    }
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerDeclarion basicGetVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(IntegerDeclarion newVar)
  {
    IntegerDeclarion oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtendedSMVPackage.INTEGER_PRECONDITION__VAR, oldVar, var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtendedSMVPackage.INTEGER_PRECONDITION__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExtendedSMVPackage.INTEGER_PRECONDITION__VAR:
        if (resolve) return getVar();
        return basicGetVar();
      case ExtendedSMVPackage.INTEGER_PRECONDITION__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExtendedSMVPackage.INTEGER_PRECONDITION__VAR:
        setVar((IntegerDeclarion)newValue);
        return;
      case ExtendedSMVPackage.INTEGER_PRECONDITION__VALUE:
        setValue((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExtendedSMVPackage.INTEGER_PRECONDITION__VAR:
        setVar((IntegerDeclarion)null);
        return;
      case ExtendedSMVPackage.INTEGER_PRECONDITION__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExtendedSMVPackage.INTEGER_PRECONDITION__VAR:
        return var != null;
      case ExtendedSMVPackage.INTEGER_PRECONDITION__VALUE:
        return value != VALUE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //IntegerPreconditionImpl
