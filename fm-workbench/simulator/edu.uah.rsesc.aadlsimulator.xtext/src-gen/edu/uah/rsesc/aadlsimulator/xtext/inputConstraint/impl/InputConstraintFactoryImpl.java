/**
 */
package edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.impl;

import edu.uah.rsesc.aadlsimulator.xtext.inputConstraint.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputConstraintFactoryImpl extends EFactoryImpl implements InputConstraintFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InputConstraintFactory init()
  {
    try
    {
      InputConstraintFactory theInputConstraintFactory = (InputConstraintFactory)EPackage.Registry.INSTANCE.getEFactory(InputConstraintPackage.eNS_URI);
      if (theInputConstraintFactory != null)
      {
        return theInputConstraintFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new InputConstraintFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputConstraintFactoryImpl()
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
      case InputConstraintPackage.INPUT_CONSTRAINT: return createInputConstraint();
      case InputConstraintPackage.EXPRESSION: return createExpression();
      case InputConstraintPackage.SCALAR_EXPRESSION: return createScalarExpression();
      case InputConstraintPackage.RANDOM_EXPRESSION: return createRandomExpression();
      case InputConstraintPackage.REF_EXPRESSION: return createRefExpression();
      case InputConstraintPackage.INTERVAL_EXPRESSION: return createIntervalExpression();
      case InputConstraintPackage.SET_EXPRESSION: return createSetExpression();
      case InputConstraintPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case InputConstraintPackage.REAL_LITERAL: return createRealLiteral();
      case InputConstraintPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case InputConstraintPackage.BINARY_EXPRESSION: return createBinaryExpression();
      case InputConstraintPackage.PRE_EXPRESSION: return createPreExpression();
      case InputConstraintPackage.RANDOM_INTEGER_EXPRESSION: return createRandomIntegerExpression();
      case InputConstraintPackage.RANDOM_REAL_EXPRESSION: return createRandomRealExpression();
      case InputConstraintPackage.RANDOM_ELEMENT_EXPRESSION: return createRandomElementExpression();
      case InputConstraintPackage.ELEMENT_REF_EXPRESSION: return createElementRefExpression();
      case InputConstraintPackage.CONST_REF_EXPRESSION: return createConstRefExpression();
      case InputConstraintPackage.NEGATIVE_EXPRESSION: return createNegativeExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case InputConstraintPackage.OPERATOR:
        return createOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case InputConstraintPackage.OPERATOR:
        return convertOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputConstraint createInputConstraint()
  {
    InputConstraintImpl inputConstraint = new InputConstraintImpl();
    return inputConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression createScalarExpression()
  {
    ScalarExpressionImpl scalarExpression = new ScalarExpressionImpl();
    return scalarExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RandomExpression createRandomExpression()
  {
    RandomExpressionImpl randomExpression = new RandomExpressionImpl();
    return randomExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefExpression createRefExpression()
  {
    RefExpressionImpl refExpression = new RefExpressionImpl();
    return refExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntervalExpression createIntervalExpression()
  {
    IntervalExpressionImpl intervalExpression = new IntervalExpressionImpl();
    return intervalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetExpression createSetExpression()
  {
    SetExpressionImpl setExpression = new SetExpressionImpl();
    return setExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealLiteral createRealLiteral()
  {
    RealLiteralImpl realLiteral = new RealLiteralImpl();
    return realLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpression createBinaryExpression()
  {
    BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
    return binaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreExpression createPreExpression()
  {
    PreExpressionImpl preExpression = new PreExpressionImpl();
    return preExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RandomIntegerExpression createRandomIntegerExpression()
  {
    RandomIntegerExpressionImpl randomIntegerExpression = new RandomIntegerExpressionImpl();
    return randomIntegerExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RandomRealExpression createRandomRealExpression()
  {
    RandomRealExpressionImpl randomRealExpression = new RandomRealExpressionImpl();
    return randomRealExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RandomElementExpression createRandomElementExpression()
  {
    RandomElementExpressionImpl randomElementExpression = new RandomElementExpressionImpl();
    return randomElementExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementRefExpression createElementRefExpression()
  {
    ElementRefExpressionImpl elementRefExpression = new ElementRefExpressionImpl();
    return elementRefExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstRefExpression createConstRefExpression()
  {
    ConstRefExpressionImpl constRefExpression = new ConstRefExpressionImpl();
    return constRefExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegativeExpression createNegativeExpression()
  {
    NegativeExpressionImpl negativeExpression = new NegativeExpressionImpl();
    return negativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperatorFromString(EDataType eDataType, String initialValue)
  {
    Operator result = Operator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputConstraintPackage getInputConstraintPackage()
  {
    return (InputConstraintPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static InputConstraintPackage getPackage()
  {
    return InputConstraintPackage.eINSTANCE;
  }

} //InputConstraintFactoryImpl