package org.xtext.osy.views;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;


public class CounterExampleView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.xtext.osy.views.CounterExampleView";
	private final String SPEC_COLUMN 	= "SPEC Name";
	private final String IMAGE_COLUMN 	= "Image";

	// Set column names
	private String[] columnNames = new String[] { 
			SPEC_COLUMN, 
			IMAGE_COLUMN
			};
	
	private Table table;	
	private TableViewer tableViewer;
	public SpecList specList = new SpecList();


	
	class CounterExampleContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		public Object[] getElements(Object parent) {
			return new String[] {"LTLSPEC1:" , "LTLSPEC2:"};
		}
	}
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		public Image getImage(Object obj) {
			return new Image(null, "C:\\aaa.jpg");
		}
	}

	//private TableViewer viewer;


	public CounterExampleView() {
		super();
	}

	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		// Normally we might do other stuff here.
	}
	
	public void addSpec(){
		specList.addSpec();
	}

	public void clearSpecs(){
		specList.clearSpecs();
	}

	public void setFocus() {
		tableViewer.getControl().setFocus();
	}

	public void createPartControl(Composite parent) {
		/*		label = new Label(parent, 0);
			label.setText("Hello World");
		 */

		/*
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new CounterExampleContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setInput(getViewSite());
		*/
		
		createTable(parent);
		createTableViewer();

		
	}

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
		column.setText("LTLSPEC Name");
		column.setWidth(100);
		
		// 2nd column with task Description
		column = new TableColumn(table, SWT.LEFT, 1);
		column.setText("Image");
		column.setWidth(400);

	}
	
	/**
	 * Create the TableViewer 
	 */
	private void createTableViewer() {
		tableViewer = new TableViewer(table);
		tableViewer.setUseHashlookup(true);
		tableViewer.setColumnProperties(columnNames);
		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setLabelProvider(new MyLabelProvider());
		tableViewer.setInput(specList);
	}
	
	/**
	 * InnerClass that acts as a proxy for the ExampleTaskList 
	 * providing content for the Table. It implements the ITaskListViewer 
	 * interface since it must register changeListeners with the 
	 * ExampleTaskList 
	 */
	class ContentProvider implements IStructuredContentProvider, ISpecListViewer {
		
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			if (newInput != null)
				((SpecList) newInput).addChangeListener(this);
			if (oldInput != null)
				((SpecList) oldInput).removeChangeListener(this);
		}

		public void dispose() {
			specList.removeChangeListener(this);
		}

		// Return the tasks as an array of Objects
		public Object[] getElements(Object parent) {
			return specList.getTasks().toArray();
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
