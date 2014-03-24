
package org.xtext.osy.views;

import org.eclipse.jface.viewers.ITableLabelProvider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;


/**
 * Label provider for the TableViewerExample
 * 
 * @see org.eclipse.jface.viewers.LabelProvider 
 */
public class MyLabelProvider extends LabelProvider implements ITableLabelProvider {

	
	/**
	 * Returns the image with the given key, or <code>null</code> if not found.
	 */
	private Image getImage(Image image) {
		return image;// new Image(null, "C:\\aaa.jpg");
	}

	/**
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object, int)
	 */
	public String getColumnText(Object element, int columnIndex) {
		return "";
	}

	/**
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object, int)
	 */
	public Image getColumnImage(Object element, int columnIndex) {
		return (columnIndex == 0) ?   // COMPLETED_COLUMN?
			getImage(((Spec) element).getImage()) :
			null;
	}

}
