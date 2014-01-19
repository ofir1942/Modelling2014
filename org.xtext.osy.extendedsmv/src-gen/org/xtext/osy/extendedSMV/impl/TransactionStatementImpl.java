/**
 */
package org.xtext.osy.extendedSMV.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.osy.extendedSMV.ExtendedSMVPackage;
import org.xtext.osy.extendedSMV.PostTransaction;
import org.xtext.osy.extendedSMV.TransactionPrecondition;
import org.xtext.osy.extendedSMV.TransactionStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.osy.extendedSMV.impl.TransactionStatementImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.xtext.osy.extendedSMV.impl.TransactionStatementImpl#getPostTransaction <em>Post Transaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionStatementImpl extends MinimalEObjectImpl.Container implements TransactionStatement
{
  /**
   * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecondition()
   * @generated
   * @ordered
   */
  protected TransactionPrecondition precondition;

  /**
   * The cached value of the '{@link #getPostTransaction() <em>Post Transaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostTransaction()
   * @generated
   * @ordered
   */
  protected PostTransaction postTransaction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransactionStatementImpl()
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
    return ExtendedSMVPackage.Literals.TRANSACTION_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransactionPrecondition getPrecondition()
  {
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrecondition(TransactionPrecondition newPrecondition, NotificationChain msgs)
  {
    TransactionPrecondition oldPrecondition = precondition;
    precondition = newPrecondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedSMVPackage.TRANSACTION_STATEMENT__PRECONDITION, oldPrecondition, newPrecondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrecondition(TransactionPrecondition newPrecondition)
  {
    if (newPrecondition != precondition)
    {
      NotificationChain msgs = null;
      if (precondition != null)
        msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedSMVPackage.TRANSACTION_STATEMENT__PRECONDITION, null, msgs);
      if (newPrecondition != null)
        msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedSMVPackage.TRANSACTION_STATEMENT__PRECONDITION, null, msgs);
      msgs = basicSetPrecondition(newPrecondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtendedSMVPackage.TRANSACTION_STATEMENT__PRECONDITION, newPrecondition, newPrecondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostTransaction getPostTransaction()
  {
    return postTransaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostTransaction(PostTransaction newPostTransaction, NotificationChain msgs)
  {
    PostTransaction oldPostTransaction = postTransaction;
    postTransaction = newPostTransaction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedSMVPackage.TRANSACTION_STATEMENT__POST_TRANSACTION, oldPostTransaction, newPostTransaction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostTransaction(PostTransaction newPostTransaction)
  {
    if (newPostTransaction != postTransaction)
    {
      NotificationChain msgs = null;
      if (postTransaction != null)
        msgs = ((InternalEObject)postTransaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedSMVPackage.TRANSACTION_STATEMENT__POST_TRANSACTION, null, msgs);
      if (newPostTransaction != null)
        msgs = ((InternalEObject)newPostTransaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedSMVPackage.TRANSACTION_STATEMENT__POST_TRANSACTION, null, msgs);
      msgs = basicSetPostTransaction(newPostTransaction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtendedSMVPackage.TRANSACTION_STATEMENT__POST_TRANSACTION, newPostTransaction, newPostTransaction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExtendedSMVPackage.TRANSACTION_STATEMENT__PRECONDITION:
        return basicSetPrecondition(null, msgs);
      case ExtendedSMVPackage.TRANSACTION_STATEMENT__POST_TRANSACTION:
        return basicSetPostTransaction(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ExtendedSMVPackage.TRANSACTION_STATEMENT__PRECONDITION:
        return getPrecondition();
      case ExtendedSMVPackage.TRANSACTION_STATEMENT__POST_TRANSACTION:
        return getPostTransaction();
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
      case ExtendedSMVPackage.TRANSACTION_STATEMENT__PRECONDITION:
        setPrecondition((TransactionPrecondition)newValue);
        return;
      case ExtendedSMVPackage.TRANSACTION_STATEMENT__POST_TRANSACTION:
        setPostTransaction((PostTransaction)newValue);
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
      case ExtendedSMVPackage.TRANSACTION_STATEMENT__PRECONDITION:
        setPrecondition((TransactionPrecondition)null);
        return;
      case ExtendedSMVPackage.TRANSACTION_STATEMENT__POST_TRANSACTION:
        setPostTransaction((PostTransaction)null);
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
      case ExtendedSMVPackage.TRANSACTION_STATEMENT__PRECONDITION:
        return precondition != null;
      case ExtendedSMVPackage.TRANSACTION_STATEMENT__POST_TRANSACTION:
        return postTransaction != null;
    }
    return super.eIsSet(featureID);
  }

} //TransactionStatementImpl
