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


public class Launch implements ILaunchConfigurationDelegate{

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		//get object which represents the workspace  			  
		String workspaceLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		String projectName = configuration.getAttribute("org.eclipse.jdt.launching.PROJECT_ATTR", "");
		FileFinder finder = new FileFinder();
		Path startPath = Paths.get(workspaceLocation+"\\"+projectName);
        try {
			Files.walkFileTree(startPath, finder);
		} catch (IOException e) {
			System.err.println("Failed to walk file tree: "+startPath.toString());
			e.printStackTrace();
		} 
		String smvFilePath = finder.getPath();
        /*try {
			Process p = new ProcessBuilder("nusmv.exe",smvFilePath).start();	
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedWriter out = new BufferedWriter(new FileWriter("f:\\out.txt"));
			String line;
			while ((line = in.readLine()) != null) {
			    out.write(line+'\n');
			}
			out.close();
			in.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		System.out.println("smv path: "+smvFilePath);
		final ArrayList<String> specs = new ArrayList<String>();
		try {
			Process p = new ProcessBuilder("python.exe", "C:\\Users\\DELL\\git\\Modelling2014OfirVersion\\Take2\\NuSMVParser\\SMVParser.py", smvFilePath).start();
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
			    specs.add(line);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//dot.exe filename -Tjpg -o f:\aa.jpg
		
		/*try {
			Process p = new ProcessBuilder("dot.exe", "F:\\graph.dot","-o","F:\\aab.jpg","-Tjpg").start();
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			BufferedWriter out = new BufferedWriter(new FileWriter("f:\\zzz.txt"));
			String line;
			while ((line = in.readLine()) != null) {
			    out.write(line+'\n');
			}
			out.close();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
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

		/*try {
			String command = "cmd /c start cmd.exe /k nusmv.exe \"C:\\runtime-EclipseApplication\\Ofir\\src-gen\\main.smv\"";
			Process proc = Runtime.getRuntime().exec(command);
			BufferedReader stdInput = new BufferedReader(new 
					InputStreamReader(proc.getInputStream()));

			BufferedReader stdError = new BufferedReader(new 
		             InputStreamReader(proc.getErrorStream()));

			
			// read the output from the command
			System.out.println("Here is the standard output of the command:\n");
			String s = null;
			while ((s = stdInput.readLine()) != null) {
				System.out.println(s);
			}
			

	        // read any errors from the attempted command
	        System.out.println("Here is the standard error of the command (if any):\n");
	        while ((s = stdError.readLine()) != null) {
	            System.out.println(s);
	        }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	private static class FileFinder extends SimpleFileVisitor<Path>{ 
	    
		private String path = null;
		
		public String getPath(){
			return path;
		}
		
		@Override
	    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
	        throws IOException {
	        if(file.toString().endsWith(".smv")){
	        	path = file.toString();
	        	return FileVisitResult.TERMINATE;
	        }
	        return FileVisitResult.CONTINUE;
	    }
	}

}

