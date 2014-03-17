package org.xtext.osy.launch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

public class Launch implements ILaunchConfigurationDelegate{

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		//get object which represents the workspace  
		IWorkspace workspace = ResourcesPlugin.getWorkspace();  

		//get location of workspace (java.io.File)  
		File workspaceDirectory = workspace.getRoot().getLocation().toFile();


		try {
			Process p = new ProcessBuilder("nusmv.exe","C:\\runtime-EclipseApplication\\Ofir\\src-gen\\main.smv").start();	
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedWriter out = new BufferedWriter(new FileWriter("f:\\aaa.smv"));
			String line;
			while ((line = in.readLine()) != null) {
			    out.write(line+'\n');
			}
			out.close();
			in.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//C:\Users\DELL\git\Modelling2014OfirVersion\Take2\NuSMVParser\SMVParser.py
		try {
			Process p = new ProcessBuilder("python.exe", "F:\\SMVParser.py", "f:\\aaa.smv").start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//dot.exe filename -Tjpg -o f:\aa.jpg
		
		try {
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
		}

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


}
