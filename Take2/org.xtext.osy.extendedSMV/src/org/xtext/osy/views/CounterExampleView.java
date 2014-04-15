package org.xtext.osy.views;

import java.util.ArrayList;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

/**
 * This class represents the view web part that displays whether the specifications
 * are true or displays counter examples otherwise. 
 */
public class CounterExampleView extends ViewPart {

	
	//The ID of the view as specified by the extension.
	public static final String ID = "org.xtext.osy.views.CounterExampleView";

	//The name of the column in the viewpath 
	private final String IMAGE_COLUMN 	= "SPEC Image";

	//Table column names int the Counter Example view part.
	private String[] columnNames = new String[] { 
			IMAGE_COLUMN
			};
	
	//The table that will hold one row per specification.
	private Table table;	
	//TableViewer is the class that displays this table.
	private TableViewer tableViewer;
	//The specification list to display.
	private SpecList specList = new SpecList();

	/**
	 * @see org.eclipse.ui.part.ViewPart#init(org.eclipse.ui.IViewSite)
	 */
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
	}
	
	/**
	 * Adds the specification to the view.
	 * @param spec The specification to add.
	 */
	public void addSpec(String spec){
		specList.addSpec(spec);
	}
	
	/**
	 * Adds all specifications in the given list to the Counter Example view.
	 * @param specs List of specification to add.
	 */
	public void addSpecs(ArrayList<String> specs){
		for(String spec: specs){
			specList.addSpec(spec);
		}
	}

	/**
	 * Clears all specifications from the Counter Example view.
	 */
	public void clearSpecs(){
		specList.clearSpecs();
	}

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {
		tableViewer.getControl().setFocus();
	}
	
	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {
		createTable(parent);
		createTableViewer();
	}
	/**
	 * This method creates the table for displaying the specification result.
	 * @param parent
	 */
	private void createTable(Composite parent) {
		int style = SWT.SINGLE | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | 
					SWT.FULL_SELECTION | SWT.HIDE_SELECTION;

		table = new Table(parent, style);
		
		GridData gridData = new GridData(GridData.FILL_BOTH);
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalSpan = 3;
		table.setLayoutData(gridData);		
					
		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		TableColumn column = new TableColumn(table, SWT.CENTER, 0);		
		column.setText(IMAGE_COLUMN);
		column.setWidth(2000);
	}
	
	/**
	 * Creates the TableViewer of the created table. 
	 */
	private void createTableViewer() {
		tableViewer = new TableViewer(table);
		tableViewer.setUseHashlookup(true);
		tableViewer.setColumnProperties(columnNames);
		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setLabelProvider(new SpecLabelProvider());
		tableViewer.setInput(specList);
	}
	
	/**
	 * This class holds the content of the TableViewer.
	 * It is also responsible of registering or removing the change listeners with the 
	 * specificationListViewer 
	 */
	class ContentProvider implements IStructuredContentProvider, ISpecListViewer {
		
		/**
		 * registers or remove change listers when the table content gets updated.
		 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
		 */
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			if (newInput != null)
				((SpecList) newInput).addChangeListener(this);
			if (oldInput != null)
				((SpecList) oldInput).removeChangeListener(this);
		}

		/**
		 * Removes the listener (the current one).
		 */
		public void dispose() {
			specList.removeChangeListener(this);
		}

		/**
		 * @return All the specifications in this view.
		 */
		public Object[] getElements(Object parent) {
			return specList.getSpecs().toArray();
		}

		/* (non-Javadoc)
		 * @see ITaskListViewer#addTask(ExampleTask)
		 */
		public void addSpec(Spec task) {
			tableViewer.add(task);
		}

		/* (non-Javadoc)
		 * @see ITaskListViewer#removeTask(ExampleTask)
		 */
		public void removeSpec(Spec task) {
			tableViewer.remove(task);			
		}

		/* (non-Javadoc)
		 * @see ITaskListViewer#updateTask(ExampleTask)
		 */
		public void updateSpec(Spec task) {
			tableViewer.update(task, null);	
		}
	}
}
