/**
 */
package org.xtext.osy.extendedSMV.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.osy.extendedSMV.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedSMVFactoryImpl extends EFactoryImpl implements ExtendedSMVFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExtendedSMVFactory init()
  {
    try
    {
      ExtendedSMVFactory theExtendedSMVFactory = (ExtendedSMVFactory)EPackage.Registry.INSTANCE.getEFactory(ExtendedSMVPackage.eNS_URI);
      if (theExtendedSMVFactory != null)
      {
        return theExtendedSMVFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExtendedSMVFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedSMVFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ExtendedSMVPackage.MODEL: return createModel();
      case ExtendedSMVPackage.SECTION: return createSection();
      case ExtendedSMVPackage.COMMENT: return createComment();
      case ExtendedSMVPackage.VARIABLES_SECTION: return createVariablesSection();
      case ExtendedSMVPackage.ASSIGNMENTS: return createAssignments();
      case ExtendedSMVPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case ExtendedSMVPackage.INTEGER_DECLARION: return createIntegerDeclarion();
      case ExtendedSMVPackage.BOOLEAN_DECLARION: return createBooleanDeclarion();
      case ExtendedSMVPackage.STATE_VARIABLE_DECLARATION: return createStateVariableDeclaration();
      case ExtendedSMVPackage.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
      case ExtendedSMVPackage.BOOLEAN_ASSIGNMENT: return createBooleanAssignment();
      case ExtendedSMVPackage.INTEGER_ASSIGNMENT: return createIntegerAssignment();
      case ExtendedSMVPackage.STATE_ASSIGNMENT: return createStateAssignment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariablesSection createVariablesSection()
  {
    VariablesSectionImpl variablesSection = new VariablesSectionImpl();
    return variablesSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignments createAssignments()
  {
    AssignmentsImpl assignments = new AssignmentsImpl();
    return assignments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerDeclarion createIntegerDeclarion()
  {
    IntegerDeclarionImpl integerDeclarion = new IntegerDeclarionImpl();
    return integerDeclarion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanDeclarion createBooleanDeclarion()
  {
    BooleanDeclarionImpl booleanDeclarion = new BooleanDeclarionImpl();
    return booleanDeclarion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateVariableDeclaration createStateVariableDeclaration()
  {
    StateVariableDeclarationImpl stateVariableDeclaration = new StateVariableDeclarationImpl();
    return stateVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentExpression createAssignmentExpression()
  {
    AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
    return assignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanAssignment createBooleanAssignment()
  {
    BooleanAssignmentImpl booleanAssignment = new BooleanAssignmentImpl();
    return booleanAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerAssignment createIntegerAssignment()
  {
    IntegerAssignmentImpl integerAssignment = new IntegerAssignmentImpl();
    return integerAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateAssignment createStateAssignment()
  {
    StateAssignmentImpl stateAssignment = new StateAssignmentImpl();
    return stateAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedSMVPackage getExtendedSMVPackage()
  {
    return (ExtendedSMVPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExtendedSMVPackage getPackage()
  {
    return ExtendedSMVPackage.eINSTANCE;
  }

} //ExtendedSMVFactoryImpl
