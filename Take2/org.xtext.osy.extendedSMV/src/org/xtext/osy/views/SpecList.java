package org.xtext.osy.views;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

/**
 * Class that plays the role of the domain model in the TableViewerExample
 * In real life, this class would access a persistent store of some kind.
 * 
 */

public class SpecList {

	private Vector<Spec> specs = new Vector<Spec>();
	private Set<ISpecListViewer> changeListeners = new HashSet<ISpecListViewer>();
	
	/**
	 * Constructor
	 */
	public SpecList() {
		super();
		this.initData();
	}
	
	/*
	 * Initialize the table data.
	 * Create COUNT tasks and add them them to the 
	 * collection of tasks
	 */
	private void initData() {
		/*Spec task;
		for (int i = 0; i < 10; i++) {
			task = new Spec("Task "  + i);
			
			specs.add(task);
		}*/
	};
	/**
	 * Return the collection of tasks
	 */
	public Vector<Spec> getTasks() {
		return specs;
	}
	
	public void clearSpecs(){
		for(Spec s: specs){ // remove all listeners
			Iterator<ISpecListViewer> iterator = changeListeners.iterator();
			while (iterator.hasNext())
				((ISpecListViewer) iterator.next()).removeSpec(s);
		}
		specs.clear(); // remove all specs
	}
	
	/**
	 * Add a new task to the collection of tasks
	 */
	public void addSpec(String spec) {
		Spec task = new Spec(spec);
		specs.add(specs.size(), task);
		Iterator<ISpecListViewer> iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((ISpecListViewer) iterator.next()).addSpec(task);
	}

	/**
	 * @param spec
	 */
	public void removeSpec(Spec spec) {
		specs.remove(spec);
		Iterator<ISpecListViewer> iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((ISpecListViewer) iterator.next()).removeSpec(spec);
	}

	/**
	 * @param spec
	 */
	public void specChanged(Spec spec) {
		Iterator<ISpecListViewer> iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((ISpecListViewer) iterator.next()).updateSpec(spec);
	}

	/**
	 * @param viewer
	 */
	public void removeChangeListener(ISpecListViewer viewer) {
		changeListeners.remove(viewer);
	}

	/**
	 * @param viewer
	 */
	public void addChangeListener(ISpecListViewer viewer) {
		changeListeners.add(viewer);
	}

}
