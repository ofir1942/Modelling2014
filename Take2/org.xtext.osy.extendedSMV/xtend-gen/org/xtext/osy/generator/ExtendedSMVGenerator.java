/**
 * generated by Xtext
 */
package org.xtext.osy.generator;

import com.google.common.collect.Iterables;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.osy.extendedSMV.AssignmentExpression;
import org.xtext.osy.extendedSMV.Assignments;
import org.xtext.osy.extendedSMV.BooleanDeclarion;
import org.xtext.osy.extendedSMV.BooleanInit;
import org.xtext.osy.extendedSMV.BooleanVar;
import org.xtext.osy.extendedSMV.CaseAssign;
import org.xtext.osy.extendedSMV.CaseCondition;
import org.xtext.osy.extendedSMV.CaseLiteral;
import org.xtext.osy.extendedSMV.CaseNextLiteral;
import org.xtext.osy.extendedSMV.DefaultCondition;
import org.xtext.osy.extendedSMV.InitAssign;
import org.xtext.osy.extendedSMV.LTLExpression;
import org.xtext.osy.extendedSMV.LTLSpecification;
import org.xtext.osy.extendedSMV.Module;
import org.xtext.osy.extendedSMV.NextAssign;
import org.xtext.osy.extendedSMV.Section;
import org.xtext.osy.extendedSMV.SingleState;
import org.xtext.osy.extendedSMV.StateInit;
import org.xtext.osy.extendedSMV.StateList;
import org.xtext.osy.extendedSMV.StateVariableDeclaration;
import org.xtext.osy.extendedSMV.VariableDeclaration;
import org.xtext.osy.extendedSMV.VariablesSection;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class ExtendedSMVGenerator implements IGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Module> _filter = Iterables.<Module>filter(_iterable, Module.class);
    for (final Module e : _filter) {
      {
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
        String _string = _fullyQualifiedName.toString("/");
        String filePath = (_string + ".smv");
        String _compile = this.compile(e);
        fsa.generateFile(filePath, _compile);
      }
    }
  }
  
  public String compile(final Module m) {
    String _name = m.getName();
    String _plus = ("MODULE " + _name);
    String code = (_plus + "\n");
    EList<Section> _sections = m.getSections();
    for (final Section s : _sections) {
      if ((s instanceof Assignments)) {
        String _CompileAssignments = this.CompileAssignments(((Assignments)s));
        String _plus_1 = (code + _CompileAssignments);
        code = _plus_1;
      } else {
        if ((s instanceof VariablesSection)) {
          String _CompileVariables = this.CompileVariables(((VariablesSection)s));
          String _plus_2 = (code + _CompileVariables);
          code = _plus_2;
        } else {
          if ((s instanceof LTLSpecification)) {
            String _CompileLTLSpec = this.CompileLTLSpec(((LTLSpecification)s));
            String _plus_3 = (code + _CompileLTLSpec);
            code = _plus_3;
          } else {
            code = (code + "Somethingelse1+\n");
          }
        }
      }
    }
    return code;
  }
  
  public String CompileLTLSpec(final LTLSpecification specification) {
    LTLExpression _expression = specification.getExpression();
    String _expression_1 = _expression.getExpression();
    String _plus = ("LTLSPEC G " + _expression_1);
    return (_plus + "\n");
  }
  
  public String CompileAssignments(final Assignments assignments) {
    String code = "\nASSIGN\n";
    EList<AssignmentExpression> _assignments = assignments.getAssignments();
    for (final AssignmentExpression singleAssignment : _assignments) {
      if ((singleAssignment instanceof InitAssign)) {
        String _CompileInitAssignment = this.CompileInitAssignment(((InitAssign)singleAssignment));
        String _plus = (code + _CompileInitAssignment);
        code = _plus;
      } else {
        if ((singleAssignment instanceof NextAssign)) {
          String _CompileNextAssignment = this.CompileNextAssignment(((NextAssign)singleAssignment));
          String _plus_1 = (code + _CompileNextAssignment);
          code = _plus_1;
        } else {
          code = (code + "weird!!");
        }
      }
    }
    return code;
  }
  
  public String CompileNextAssignment(final NextAssign assignment) {
    StateVariableDeclaration _varName = assignment.getVarName();
    String _name = _varName.getName();
    String _plus = ("next( " + _name);
    String code = (_plus + ") := ");
    CaseAssign _nextStatement = assignment.getNextStatement();
    String _CompileCaseAssignment = this.CompileCaseAssignment(_nextStatement);
    String _plus_1 = (code + _CompileCaseAssignment);
    code = _plus_1;
    return code;
  }
  
  public String CompileCaseAssignment(final CaseAssign assign) {
    String tabPrefix = "\t\t";
    String code = "case\n";
    EList<CaseLiteral> _caseLiterals = assign.getCaseLiterals();
    for (final CaseLiteral caseLiteral : _caseLiterals) {
      CaseCondition _condition = caseLiteral.getCondition();
      String _CompileCaseCondition = this.CompileCaseCondition(_condition);
      String _plus = ((code + tabPrefix) + _CompileCaseCondition);
      String _plus_1 = (_plus + " : ");
      CaseNextLiteral _nextValue = caseLiteral.getNextValue();
      String _CompileCaseNextLiteral = this.CompileCaseNextLiteral(_nextValue);
      String _plus_2 = (_plus_1 + _CompileCaseNextLiteral);
      String _plus_3 = (_plus_2 + ";\n");
      code = _plus_3;
    }
    return ((code + tabPrefix) + "esac;\n");
  }
  
  public String CompileCaseNextLiteral(final CaseNextLiteral literal) {
    if ((literal instanceof SingleState)) {
      return this.SingleStateName(((SingleState)literal));
    } else {
      if ((literal instanceof StateList)) {
        return this.StateListString(((StateList)literal));
      }
    }
    return null;
  }
  
  public String StateListString(final StateList list) {
    EList<String> _states = list.getStates();
    String states = IterableExtensions.join(_states, ",");
    return (("{" + states) + "}");
  }
  
  public String SingleStateName(final SingleState singleState) {
    return singleState.getState();
  }
  
  public String CompileCaseCondition(final CaseCondition condition) {
    if ((condition instanceof DefaultCondition)) {
      return "TRUE";
    } else {
      if ((condition instanceof BooleanVar)) {
        return this.BoolVarName(((BooleanVar)condition));
      }
    }
    return null;
  }
  
  public String BoolVarName(final BooleanVar boolVar) {
    BooleanDeclarion _booleanVar = boolVar.getBooleanVar();
    return _booleanVar.getName();
  }
  
  public String CompileInitAssignment(final InitAssign assignment) {
    String code = "";
    if ((assignment instanceof BooleanInit)) {
      String _CompileBoolInitAssignment = this.CompileBoolInitAssignment(((BooleanInit)assignment));
      String _plus = (code + _CompileBoolInitAssignment);
      code = _plus;
    }
    if ((assignment instanceof StateInit)) {
      String _CompileStateInitAssignment = this.CompileStateInitAssignment(((StateInit)assignment));
      String _plus_1 = (code + _CompileStateInitAssignment);
      code = _plus_1;
    }
    return code;
  }
  
  public String CompileStateInitAssignment(final StateInit stateInit) {
    StateVariableDeclaration _varName = stateInit.getVarName();
    String _name = _varName.getName();
    String _plus = ("\tinit(" + _name);
    String _plus_1 = (_plus + ") := ");
    String _value = stateInit.getValue();
    String _plus_2 = (_plus_1 + _value);
    return (_plus_2 + ";\n");
  }
  
  public String CompileBoolInitAssignment(final BooleanInit boolInit) {
    BooleanDeclarion _varName = boolInit.getVarName();
    String _name = _varName.getName();
    String _plus = ("\tinit( " + _name);
    String _plus_1 = (_plus + ") := ");
    String _value = boolInit.getValue();
    String _plus_2 = (_plus_1 + _value);
    return (_plus_2 + ";\n");
  }
  
  public String CompileVariables(final VariablesSection varsSection) {
    String code = "\nVAR\n";
    EList<VariableDeclaration> _variables = varsSection.getVariables();
    for (final VariableDeclaration v : _variables) {
      if ((v instanceof BooleanDeclarion)) {
        String _name = ((BooleanDeclarion)v).getName();
        String _plus = ((code + "\t") + _name);
        String _plus_1 = (_plus + ":");
        String _plus_2 = (_plus_1 + "boolean ;\n");
        code = _plus_2;
      } else {
        if ((v instanceof StateVariableDeclaration)) {
          String _CompileStateVarDeclaration = this.CompileStateVarDeclaration(((StateVariableDeclaration)v));
          String _plus_3 = (code + _CompileStateVarDeclaration);
          code = _plus_3;
        } else {
          code = (code + "Something is wrong\n");
        }
      }
    }
    code = (code + "\n");
    return code;
  }
  
  public String CompileStateVarDeclaration(final StateVariableDeclaration stateVarDeclaration) {
    StateList _possibleStates = stateVarDeclaration.getPossibleStates();
    EList<String> _states = _possibleStates.getStates();
    String states = IterableExtensions.join(_states, ",");
    String _name = stateVarDeclaration.getName();
    String _plus = ("\t" + _name);
    String _plus_1 = (_plus + ":");
    String _plus_2 = (_plus_1 + "{");
    String _plus_3 = (_plus_2 + states);
    return (_plus_3 + "} ;");
  }
  
  public CharSequence compile(final Section s) {
    StringConcatenation _builder = new StringConcatenation();
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(s);
    _builder.append(_fullyQualifiedName, "");
    _builder.append(" h");
    _builder.newLineIfNotEmpty();
    _builder.append("//\t");
    return _builder;
  }
}