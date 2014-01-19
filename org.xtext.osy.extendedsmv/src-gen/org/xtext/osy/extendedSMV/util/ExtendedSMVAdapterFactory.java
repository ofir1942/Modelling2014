/**
 */
package org.xtext.osy.extendedSMV.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.osy.extendedSMV.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.osy.extendedSMV.ExtendedSMVPackage
 * @generated
 */
public class ExtendedSMVAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExtendedSMVPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedSMVAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ExtendedSMVPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendedSMVSwitch<Adapter> modelSwitch =
    new ExtendedSMVSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseSection(Section object)
      {
        return createSectionAdapter();
      }
      @Override
      public Adapter caseComment(Comment object)
      {
        return createCommentAdapter();
      }
      @Override
      public Adapter caseVariablesSection(VariablesSection object)
      {
        return createVariablesSectionAdapter();
      }
      @Override
      public Adapter caseAssignments(Assignments object)
      {
        return createAssignmentsAdapter();
      }
      @Override
      public Adapter caseTransactions(Transactions object)
      {
        return createTransactionsAdapter();
      }
      @Override
      public Adapter caseTransactionStatement(TransactionStatement object)
      {
        return createTransactionStatementAdapter();
      }
      @Override
      public Adapter caseTransactionPrecondition(TransactionPrecondition object)
      {
        return createTransactionPreconditionAdapter();
      }
      @Override
      public Adapter casePreconditionStatement(PreconditionStatement object)
      {
        return createPreconditionStatementAdapter();
      }
      @Override
      public Adapter caseStatePrecondition(StatePrecondition object)
      {
        return createStatePreconditionAdapter();
      }
      @Override
      public Adapter caseBooleanPrecondition(BooleanPrecondition object)
      {
        return createBooleanPreconditionAdapter();
      }
      @Override
      public Adapter caseIntegerPrecondition(IntegerPrecondition object)
      {
        return createIntegerPreconditionAdapter();
      }
      @Override
      public Adapter casePostTransaction(PostTransaction object)
      {
        return createPostTransactionAdapter();
      }
      @Override
      public Adapter casePostTransactionStatement(PostTransactionStatement object)
      {
        return createPostTransactionStatementAdapter();
      }
      @Override
      public Adapter caseSimplePostTransaction(SimplePostTransaction object)
      {
        return createSimplePostTransactionAdapter();
      }
      @Override
      public Adapter caseStatePostTransaction(StatePostTransaction object)
      {
        return createStatePostTransactionAdapter();
      }
      @Override
      public Adapter caseBooleanPostTransaction(BooleanPostTransaction object)
      {
        return createBooleanPostTransactionAdapter();
      }
      @Override
      public Adapter caseIntegerPostTransaction(IntegerPostTransaction object)
      {
        return createIntegerPostTransactionAdapter();
      }
      @Override
      public Adapter caseConditionalPostTRansaction(ConditionalPostTRansaction object)
      {
        return createConditionalPostTRansactionAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseIntegerDeclarion(IntegerDeclarion object)
      {
        return createIntegerDeclarionAdapter();
      }
      @Override
      public Adapter caseBooleanDeclarion(BooleanDeclarion object)
      {
        return createBooleanDeclarionAdapter();
      }
      @Override
      public Adapter caseStateVariableDeclaration(StateVariableDeclaration object)
      {
        return createStateVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseAssignmentExpression(AssignmentExpression object)
      {
        return createAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanAssignment(BooleanAssignment object)
      {
        return createBooleanAssignmentAdapter();
      }
      @Override
      public Adapter caseIntegerAssignment(IntegerAssignment object)
      {
        return createIntegerAssignmentAdapter();
      }
      @Override
      public Adapter caseStateAssignment(StateAssignment object)
      {
        return createStateAssignmentAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.Section
   * @generated
   */
  public Adapter createSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.Comment
   * @generated
   */
  public Adapter createCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.VariablesSection <em>Variables Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.VariablesSection
   * @generated
   */
  public Adapter createVariablesSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.Assignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.Assignments
   * @generated
   */
  public Adapter createAssignmentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.Transactions <em>Transactions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.Transactions
   * @generated
   */
  public Adapter createTransactionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.TransactionStatement <em>Transaction Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.TransactionStatement
   * @generated
   */
  public Adapter createTransactionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.TransactionPrecondition <em>Transaction Precondition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.TransactionPrecondition
   * @generated
   */
  public Adapter createTransactionPreconditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.PreconditionStatement <em>Precondition Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.PreconditionStatement
   * @generated
   */
  public Adapter createPreconditionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.StatePrecondition <em>State Precondition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.StatePrecondition
   * @generated
   */
  public Adapter createStatePreconditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.BooleanPrecondition <em>Boolean Precondition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.BooleanPrecondition
   * @generated
   */
  public Adapter createBooleanPreconditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.IntegerPrecondition <em>Integer Precondition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.IntegerPrecondition
   * @generated
   */
  public Adapter createIntegerPreconditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.PostTransaction <em>Post Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.PostTransaction
   * @generated
   */
  public Adapter createPostTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.PostTransactionStatement <em>Post Transaction Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.PostTransactionStatement
   * @generated
   */
  public Adapter createPostTransactionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.SimplePostTransaction <em>Simple Post Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.SimplePostTransaction
   * @generated
   */
  public Adapter createSimplePostTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.StatePostTransaction <em>State Post Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.StatePostTransaction
   * @generated
   */
  public Adapter createStatePostTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.BooleanPostTransaction <em>Boolean Post Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.BooleanPostTransaction
   * @generated
   */
  public Adapter createBooleanPostTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.IntegerPostTransaction <em>Integer Post Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.IntegerPostTransaction
   * @generated
   */
  public Adapter createIntegerPostTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.ConditionalPostTRansaction <em>Conditional Post TRansaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.ConditionalPostTRansaction
   * @generated
   */
  public Adapter createConditionalPostTRansactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.IntegerDeclarion <em>Integer Declarion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.IntegerDeclarion
   * @generated
   */
  public Adapter createIntegerDeclarionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.BooleanDeclarion <em>Boolean Declarion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.BooleanDeclarion
   * @generated
   */
  public Adapter createBooleanDeclarionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.StateVariableDeclaration <em>State Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.StateVariableDeclaration
   * @generated
   */
  public Adapter createStateVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.AssignmentExpression <em>Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.AssignmentExpression
   * @generated
   */
  public Adapter createAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.BooleanAssignment <em>Boolean Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.BooleanAssignment
   * @generated
   */
  public Adapter createBooleanAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.IntegerAssignment <em>Integer Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.IntegerAssignment
   * @generated
   */
  public Adapter createIntegerAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.osy.extendedSMV.StateAssignment <em>State Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.osy.extendedSMV.StateAssignment
   * @generated
   */
  public Adapter createStateAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ExtendedSMVAdapterFactory
