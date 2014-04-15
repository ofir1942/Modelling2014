
package org.xtext.osy.views;

import org.eclipse.jface.viewers.ITableLabelProvider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;


/**
 * This class holds the image that represents each specification.
 * 
 * @see org.eclipse.jface.viewers.LabelProvider 
 */
public class SpecLabelProvider extends LabelProvider implements ITableLabelProvider {

	
	/**
	 * @return The image of the item. 
	 */
	private Image getImage(Image image) {
		return image;
	}

	/**
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object, int)
	 */
	public String getColumnText(Object element, int columnIndex) {
		return ""; // we don't need any column text
	}

	/**
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object, int)
	 */
	public Image getColumnImage(Object element, int columnIndex) {
		return (columnIndex == 0) ?   //for now we have only one column
			getImage(((Spec) element).getImage()) :
			null;
	}

}
