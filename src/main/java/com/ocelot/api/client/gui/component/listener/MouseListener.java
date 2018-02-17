package com.ocelot.api.client.gui.component.listener;

import com.ocelot.api.client.gui.component.Component;

/**
 * <em><b>Copyright (c) 2018 Ocelot5836.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Allows a {@link Component} to run custom code when the mouse is hovered over it and clicked.
 * 
 * @author Ocelot5836
 */
public interface MouseListener {

	/**
	 * Called when the mouse is pressed.
	 * 
	 * @param mouseButton
	 *            The button the mouse is using
	 * @param mouseX
	 *            The x position of the mouse
	 * @param mouseY
	 *            The y position of the mouse
	 */
	void mousePressed(int mouseButton, int mouseX, int mouseY);

	/**
	 * Called when the mouse is released.
	 * 
	 * @param mouseButton
	 *            The button the mouse is using
	 * @param mouseX
	 *            The x position of the mouse
	 * @param mouseY
	 *            The y position of the mouse
	 */
	void mouseReleased(int mouseButton, int mouseX, int mouseY);

}