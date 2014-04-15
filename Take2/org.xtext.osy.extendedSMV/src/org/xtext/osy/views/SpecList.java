package org.xtext.osy.views;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

/**
 * This class is responsible of holding all the specification that are in our SMV file.
 * It represents the domain model of the Counter Example View, i.e. when we add
 * a specification the view gets updated through several listeners. 
 */

public class SpecList {

	//List of specifications
	private Vector<Spec> specs;
	//List of specification change listener.
	//When a specification is changed the listener is fired and changes the view correspondly
	private Set<ISpecListViewer> changeListeners;
	
	/**
	 * Ctor.
	 * Creates an empty list of specification.
	 * It will be populated when the NuSMV project would run. 
	 */
	public SpecList() {
		specs = new Vector<Spec>();
		changeListeners = new HashSet<ISpecListViewer>();
	}

	/**
	 * @returns The collection of the specifications
	 */
	public Vector<Spec> getSpecs() {
		return specs;
	}
	
	/**
	 * Removes all specification and clears the Counter Example View.
	 */
	public void clearSpecs(){
		for(Spec s: specs){ // remove all listeners
			Iterator<ISpecListViewer> iterator = changeListeners.iterator();
			while (iterator.hasNext())
				((ISpecListViewer) iterator.next()).removeSpec(s);
		}
		specs.clear(); // remove all specs
	}
	
	/**
	 * Adds the given specification to the collection of specifications.
	 * @param specification the given specification
	 */
	public void addSpec(String specification) {
		Spec spec = new Spec(specification);
		specs.add(specs.size(), spec);
		Iterator<ISpecListViewer> iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((ISpecListViewer) iterator.next()).addSpec(spec);
	}

	/**
	 * Removes the given specification to the collection of specifications.
	 * @param specification the given specification
	 */
	public void removeSpec(Spec spec) {
		specs.remove(spec);
		Iterator<ISpecListViewer> iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((ISpecListViewer) iterator.next()).removeSpec(spec);
	}


	/**
	 * Removes a listener.
	 * @param viewer the given viewer to remove.
	 */
	public void removeChangeListener(ISpecListViewer viewer) {
		changeListeners.remove(viewer);
	}

	/**
	 * Adds a listener.
	 * @param viewer the given viewer to add.
	 */
	public void addChangeListener(ISpecListViewer viewer) {
		changeListeners.add(viewer);
	}

}
