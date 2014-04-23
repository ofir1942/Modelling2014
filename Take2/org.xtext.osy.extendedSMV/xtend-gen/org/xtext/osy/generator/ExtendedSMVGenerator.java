/**
 * generated by Xtext
 */
package org.xtext.osy.generator;

import com.google.common.base.Charsets;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.osy.extendedSMV.Assignments;
import org.xtext.osy.extendedSMV.CTLSpecification;
import org.xtext.osy.extendedSMV.Expression;
import org.xtext.osy.extendedSMV.LTLSpecification;
import org.xtext.osy.extendedSMV.Module;
import org.xtext.osy.extendedSMV.PatternsDefinitions;
import org.xtext.osy.extendedSMV.Section;
import org.xtext.osy.extendedSMV.VariableDeclaration;
import org.xtext.osy.launch.Launch;

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
  
  /**
   * Xtend function to compile esmv MODULE
   */
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
        if ((s instanceof VariableDeclaration)) {
          String _CompileVariables = this.CompileVariables(((VariableDeclaration)s));
          String _plus_2 = (code + _CompileVariables);
          code = _plus_2;
        } else {
          if ((s instanceof LTLSpecification)) {
            String _CompileLTLSpec = this.CompileLTLSpec(((LTLSpecification)s));
            String _plus_3 = (code + _CompileLTLSpec);
            code = _plus_3;
          } else {
            if ((s instanceof CTLSpecification)) {
              String _CompileCTLSpec = this.CompileCTLSpec(((CTLSpecification)s));
              String _plus_4 = (code + _CompileCTLSpec);
              code = _plus_4;
            } else {
              if ((s instanceof PatternsDefinitions)) {
                this.CompilePatterns(((PatternsDefinitions)s));
              } else {
                code = (code + "UNKNOWN SECTION\n");
              }
            }
          }
        }
      }
    }
    return code;
  }
  
  /**
   * Compile and save newly defined patterns
   */
  public void CompilePatterns(final PatternsDefinitions definitions) {
    try {
      ICompositeNode _node = NodeModelUtils.getNode(definitions);
      String patterns = NodeModelUtils.getTokenText(_node);
      String _replace = patterns.replace("PATTERNS", "");
      patterns = _replace;
      String _replace_1 = patterns.replace(";", ";\n");
      patterns = _replace_1;
      FileOutputStream _fileOutputStream = new FileOutputStream("./macros.txt");
      FileOutputStream file = _fileOutputStream;
      byte[] _bytes = patterns.getBytes(Charsets.UTF_8);
      file.write(_bytes);
      file.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Compile LTL specifications. Replace "XXX" with the relevant pattern
   */
  public String CompileLTLSpec(final LTLSpecification specification) {
    String code = "LTLSPEC ";
    Expression _expression = specification.getExpression();
    boolean _notEquals = (!Objects.equal(_expression, null));
    if (_notEquals) {
      Expression _expression_1 = specification.getExpression();
      ICompositeNode _node = NodeModelUtils.getNode(_expression_1);
      String _tokenText = NodeModelUtils.getTokenText(_node);
      String _plus = (code + _tokenText);
      code = _plus;
    }
    EList<String> _patterns = specification.getPatterns();
    for (final String p : _patterns) {
      {
        Expression _expression_2 = specification.getExpression();
        boolean _notEquals_1 = (!Objects.equal(_expression_2, null));
        if (_notEquals_1) {
          code = (code + " & ");
        }
        String _TranslatePattern = this.TranslatePattern(p);
        String _plus_1 = (code + _TranslatePattern);
        code = _plus_1;
      }
    }
    code = (code + "\n");
    return code;
  }
  
  /**
   * Compile CTL specifications. Replace "XXX" with the relevant pattern
   */
  public String CompileCTLSpec(final CTLSpecification specification) {
    String code = "CTLSPEC ";
    Expression _expression = specification.getExpression();
    boolean _notEquals = (!Objects.equal(_expression, null));
    if (_notEquals) {
      Expression _expression_1 = specification.getExpression();
      ICompositeNode _node = NodeModelUtils.getNode(_expression_1);
      String _tokenText = NodeModelUtils.getTokenText(_node);
      String _plus = (code + _tokenText);
      code = _plus;
    }
    EList<String> _patterns = specification.getPatterns();
    for (final String p : _patterns) {
      {
        Expression _expression_2 = specification.getExpression();
        boolean _notEquals_1 = (!Objects.equal(_expression_2, null));
        if (_notEquals_1) {
          code = (code + " & ");
        }
        String _TranslatePattern = this.TranslatePattern(p);
        String _plus_1 = (code + _TranslatePattern);
        code = _plus_1;
      }
    }
    code = (code + "\n");
    return code;
  }
  
  /**
   * Translate pattern into the relevant specification
   */
  public String TranslatePattern(final String pattern) {
    try {
      Class<? extends ExtendedSMVGenerator> _class = this.getClass();
      ProtectionDomain _protectionDomain = _class.getProtectionDomain();
      CodeSource _codeSource = _protectionDomain.getCodeSource();
      URL _location = _codeSource.getLocation();
      String _file = _location.getFile();
      String _substring = _file.substring(1);
      String pluginRootDir = (_substring + "../");
      String macroParserPath = Launch.findFilePath(pluginRootDir, "MacroParser.py");
      Runtime _runtime = Runtime.getRuntime();
      Process proc = _runtime.exec(((("python.exe " + macroParserPath) + " ./macros.txt ") + pattern));
      InputStream _inputStream = proc.getInputStream();
      InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
      InputStreamReader stream = _inputStreamReader;
      BufferedReader _bufferedReader = new BufferedReader(stream);
      BufferedReader reader = _bufferedReader;
      return reader.readLine();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Compile ASSIGN section
   */
  public String CompileAssignments(final Assignments assignments) {
    ICompositeNode _node = NodeModelUtils.getNode(assignments);
    String code = NodeModelUtils.getTokenText(_node);
    String _replace = code.replace("ASSIGN", "ASSIGN\n");
    code = _replace;
    String _replace_1 = code.replace(";", ";\n");
    code = _replace_1;
    return code;
  }
  
  /**
   * Compile VAR section
   */
  public String CompileVariables(final VariableDeclaration varsSection) {
    ICompositeNode _node = NodeModelUtils.getNode(varsSection);
    String code = NodeModelUtils.getTokenText(_node);
    String _replace = code.replace("VAR", "VAR\n");
    code = _replace;
    String _replace_1 = code.replace(";", ";\n");
    code = _replace_1;
    return code;
  }
}
