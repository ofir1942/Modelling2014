package org.xtext.osy.views;

public interface ISpecListViewer {
	
	/**
	 * Update the view to reflect the fact that a spec was added 
	 * to the spec list
	 * 
	 * @param spec
	 */
	public void addSpec(Spec spec);
	
	/**
	 * Update the view to reflect the fact that a spec was removed 
	 * from the spec list
	 * 
	 * @param spec
	 */
	public void removeSpec(Spec spec);
	
	/**
	 * Update the view to reflect the fact that one of the specs
	 * was modified 
	 * 
	 * @param spec
	 */
	public void updateSpec(Spec spec);
}
