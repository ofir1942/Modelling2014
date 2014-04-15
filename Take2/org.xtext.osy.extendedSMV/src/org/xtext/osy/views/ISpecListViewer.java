package org.xtext.osy.views;

public interface ISpecListViewer {
	
	/**
	 * Update the view to reflect the fact that a specification was added 
	 * to the specification list
	 * @param spec the added specification
	 */
	public void addSpec(Spec spec);
	
	/**
	 * Update the view to reflect the fact that a specification was removed 
	 * from the specification list
	 * @param spec the added specification
	 */
	public void removeSpec(Spec spec);
}
