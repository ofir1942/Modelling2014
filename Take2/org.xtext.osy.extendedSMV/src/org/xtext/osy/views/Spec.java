package org.xtext.osy.views;

import org.eclipse.swt.graphics.Image;

/**
 * This class represents a single Specification (whether it is LTL/CTL or other).
 * Each specification has one property, an image that represents it.
 * I.e. this image can be a counter example, or the specification itself with 
 * the string "is true" to indicate that it holds.  
 */
public class Spec {

	//the image representing the specification
	private Image image;

	/**
	 * Ctor.
	 * @param imagePath Path to the image that is representing this specification
	 */
	public Spec(String imagePath) {
		this.image = new Image(null, imagePath);
	}

	/**
	 * @return The image that represents this specification.
	 */
	public Image getImage(){
		return image;
	}
}
