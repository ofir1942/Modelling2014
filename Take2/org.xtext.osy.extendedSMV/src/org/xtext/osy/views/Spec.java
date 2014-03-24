package org.xtext.osy.views;

import org.eclipse.swt.graphics.Image;

public class Spec {

	private Image image;

	/**
	 * Create a task with an initial description
	 * 
	 * @param string
	 */
	public Spec(String imagePath) {
		super();
		this.image = new Image(null, imagePath);
	}

	public Image getImage(){
		return image;
	}
}
