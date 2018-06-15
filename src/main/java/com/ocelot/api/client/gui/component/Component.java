package com.ocelot.api.client.gui.component;

import com.ocelot.api.client.gui.GuiBase;
import com.ocelot.api.client.gui.component.listener.MouseListener;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;

/**
 * <em><b>Copyright (c) 2018 Ocelot5836.</b></em>
 * 
 * <br>
 * </br>
 * 
 * The basic class for all components.
 * 
 * @author Ocelot5836
 */
public abstract class Component extends Gui {

	protected static Minecraft mc = Minecraft.getMinecraft();
	protected static FontRenderer fontRenderer = mc.fontRenderer;

	protected GuiBase parent;
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected boolean visible;

	protected MouseListener mouseListener;

	public Component(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.visible = true;
	}

	/**
	 * Called when the screen is updated.
	 */
	public void update() {
	}

	/**
	 * Renders the background layer before anything else is rendered.
	 * 
	 * @param mc
	 *            A {@link Minecraft} instance
	 * @param partialTicks
	 *            The partial ticks
	 * @param mouseX
	 *            The x position of the mouse
	 * @param mouseY
	 *            The y position of the mouse
	 */
	public void renderBackground(Minecraft mc, float partialTicks, int mouseX, int mouseY) {
	}

	/**
	 * Renders the foreground layer after everything else is rendered.
	 * 
	 * @param mc
	 *            A {@link Minecraft} instance
	 * @param partialTicks
	 *            The partial ticks
	 * @param mouseX
	 *            The x position of the mouse
	 * @param mouseY
	 *            The y position of the mouse
	 */
	public void renderForeground(Minecraft mc, float partialTicks, int mouseX, int mouseY) {
	}

	/**
	 * Renders the tooltips after the foreground is rendered.
	 * 
	 * @param mc
	 *            A {@link Minecraft} instance
	 * @param partialTicks
	 *            The partial ticks
	 * @param mouseX
	 *            The x position of the mouse
	 * @param mouseY
	 *            The y position of the mouse
	 */
	public void renderTooltips(int mouseX, int mouseY) {
	}

	/**
	 * Checks whether or not the mouse is hovered over the component.
	 * 
	 * @param mouseX
	 *            The x position of the mouse
	 * @param mouseY
	 *            The y position of the mouse
	 * @return whether or not the mouse is hovered over the component
	 */
	public boolean isHovered(int mouseX, int mouseY) {
		// mouseX -= parent.getX();
		// mouseY -= parent.getY();
		return this.visible && mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;
	}

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
	public void mousePressed(int mouseButton, int mouseX, int mouseY) {
		if (mouseListener != null)
			mouseListener.mousePressed(mouseButton, mouseX, mouseY);
	}

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
	public void mouseReleased(int mouseButton, int mouseX, int mouseY) {
		if (mouseListener != null)
			mouseListener.mouseReleased(mouseButton, mouseX, mouseY);
	}

	/**
	 * Called when the component is added to the gui.
	 */
	public void onAddComponent() {
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public void setMouseListener(MouseListener mouseListener) {
		this.mouseListener = mouseListener;
	}

	/**
	 * <b><i>PLEASE DO NOT TOUCH THIS! IT IS USED INTERNALLY!</i></b>
	 */
	public void setParent(GuiBase parent) {
		this.parent = parent;
	}
}