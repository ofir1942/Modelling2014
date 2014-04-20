package org.xtext.osy.launch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.*;
import java.util.ArrayList;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.xtext.osy.views.CounterExampleView;

/**
 * This Class is used to process the created NuSMV file, it will execute it, and will display the results of the given specifications.
 */
public class Launch implements ILaunchConfigurationDelegate{

	/**
	 * The main method. When the NuSMV project is executed this method is called.
	 * It is responsible of several things:
	 * 		1. It will find the created SMV file from the ESMV in the project that was executed.
	 * 		2. Using a Python script it will run the NuSMV tool with the created SMV file.
	 * 		3. Using the supplied DOT library it will create visual counter examples (if exists), 
	 * 		   otherwise it will generate and diplay an appropriate message
	 * 
	 * for other parameters:
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		//get object which represents the workspace  			  
		String workspaceLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		String projectName = configuration.getAttribute("org.eclipse.jdt.launching.PROJECT_ATTR", "");
		String smvStartPath = workspaceLocation+"\\"+projectName;
		String fileName = ".smv";
		String smvFilePath = findFilePath(smvStartPath, fileName);
		
		String currentClass = getClass().getProtectionDomain().getCodeSource().getLocation().getFile().substring(1)+"../";
		String pythonFileName = "SMVParser.py";
		String pythonFileNamePath = findFilePath(currentClass , pythonFileName);
		
		System.out.println("zzzz: "+pythonFileNamePath);
		
		

		final ArrayList<String> specs = new ArrayList<String>();
		try {
			Process p = new ProcessBuilder("python.exe", pythonFileNamePath, smvFilePath).start();
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
			    specs.add(line);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Display.getDefault().asyncExec(new Runnable() {
		    @Override
		    public void run() {		    	
		    	try {
		    		//This will show (if its not already shown) our counter example view.
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.xtext.osy.views.CounterExampleView");
				} catch (PartInitException e) {
					e.printStackTrace();
				}
		        CounterExampleView counterExView = (CounterExampleView)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("org.xtext.osy.views.CounterExampleView");
		        counterExView.clearSpecs(); // first clear all the specs
		        counterExView.addSpecs(specs);
		    }
		});

	}
	
	/**
	 * Finds the first occurrence of the file with the given name. The search begins in the given startPath.
	 * @param startPath The start path to search from
	 * @param fileName The name of the file we are searching
	 * @return A path to the file with the given name.
	 */
	public static String findFilePath(String startPathString, String fileName){
		Path startPath = Paths.get(startPathString);
		FileFinder finder = new FileFinder(fileName);
        try {
			Files.walkFileTree(startPath, finder);
		} catch (IOException e) {
			System.err.println("Failed to walk file tree: "+startPath.toString());
			e.printStackTrace();
		} 
		return finder.getPath();
	}

	/**
	 *	An auxiliary class for the findFilePath method.
	 *	This class holds the name of the file we want to find. 
	 */
	private static class FileFinder extends SimpleFileVisitor<Path>{ 
	    
		//the path to the file.
		private String path;
		//the name of the searched file.
		private String fileName;
		
		/**
		 * Ctor.
		 * @param fileName the name of the search file
		 */
		public FileFinder(String fileName){
			this.fileName = fileName;
			path = null;
		}
		
		/**
		 * @return The path of the file, otherwise null if not found.
		 */
		public String getPath(){
			return path;
		}
		
		/**
		 * @see java.nio.file.SimpleFileVisitor#visitFile(java.lang.Object, java.nio.file.attribute.BasicFileAttributes)
		 */
		@Override
	    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
	        throws IOException {
	        if(file.toString().endsWith(fileName)){
	        	path = file.toString();
	        	return FileVisitResult.TERMINATE;
	        }
	        return FileVisitResult.CONTINUE;
	    }
	}

}

