package com.ocelot.api.client.gui.component;

import net.minecraft.client.Minecraft;

/**
 * <em><b>Copyright (c) 2018 Ocelot5836.</b></em>
 * 
 * <br>
 * </br>
 * 
 * A button that uses text instead of the vanilla button texture.
 * 
 * @author Ocelot5836
 */
//TODO: MOVE TO CORE MOD
public class ComponentTextButton extends Component {

	private String text;
	private String highlightText;
	private int color;
	private int highlightColor;

	public ComponentTextButton(int x, int y, String text, int color, int highlightColor) {
		this(x, y, text, text, color, highlightColor);
	}

	public ComponentTextButton(int x, int y, String text, String highlightText, int color, int highlightColor) {
		super(x, y, fontRenderer.getStringWidth(text), 8);
		this.text = text;
		this.highlightText = highlightText;
		this.color = color;
		this.highlightColor = highlightColor;
	}

	@Override
	public void renderForeground(Minecraft mc, float partialTicks, int mouseX, int mouseY) {
		if (isHovered(mouseX, mouseY)) {
			fontRenderer.drawString(highlightText, x, y, highlightColor);
		} else {
			fontRenderer.drawString(text, x, y, color);
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getHighlightText() {
		return highlightText;
	}

	public void setHighlightText(String highlightText) {
		this.highlightText = highlightText;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getHighlightColor() {
		return highlightColor;
	}

	public void setHighlightColor(int highlightColor) {
		this.highlightColor = highlightColor;
	}
}