package com.ocelot.api.client.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ocelot.api.client.gui.component.Component;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;

/**
 * <em><b>Copyright (c) 2018 Ocelot5836.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Allows for a basic gui that handles most of the work and errors in a normal gui.
 * 
 * @author Ocelot5836
 */
public abstract class GuiBase extends GuiScreen {

	private List<Component> components = new ArrayList<Component>();

	protected int xSize, ySize;
	protected int guiLeft, guiTop;
	protected boolean renderDefaultBackground;

	private Component selectedComonent;

	/**
	 * Constructs a gui with the specified width and height.
	 * 
	 * @param xSize
	 *            The width of the gui
	 * @param ySize
	 *            The height of the gui
	 */
	public GuiBase(int xSize, int ySize) {
		this(xSize, ySize, true);
	}

	/**
	 * Constructs a gui with the specified width, height, and whether or not to render the background behind it.
	 * 
	 * @param xSize
	 *            The width of the gui
	 * @param ySize
	 *            The height of the gui
	 * @param renderDefaultBackground
	 *            Whether or not to render the black background behind the gui
	 */
	public GuiBase(int xSize, int ySize, boolean renderDefaultBackground) {
		this.xSize = xSize;
		this.ySize = ySize;
		this.renderDefaultBackground = renderDefaultBackground;
	}

	@Override
	public void initGui() {
		this.guiLeft = (width - xSize) / 2;
		this.guiTop = (height - ySize) / 2;
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		if (renderDefaultBackground)
			this.drawDefaultBackground();
		this.renderGuiBackgroundLayer(partialTicks, mouseX, mouseY);
		GlStateManager.disableRescaleNormal();
		RenderHelper.disableStandardItemLighting();
		GlStateManager.disableLighting();
		GlStateManager.disableDepth();
		super.drawScreen(mouseX, mouseY, partialTicks);
		for (int i = 0; i < components.size(); i++) {
			Component component = components.get(i);
			if (component.isVisible()) {
				component.renderBackground(mc, partialTicks, mouseX, mouseY);
			}
		}
		RenderHelper.enableGUIStandardItemLighting();
		GlStateManager.pushMatrix();
		GlStateManager.translate((float) this.guiLeft, (float) this.guiTop, 0.0F);
		GlStateManager.color(1F, 1F, 1F, 1F);
		GlStateManager.enableRescaleNormal();
		int k = 240;
		int l = 240;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
		GlStateManager.color(1F, 1F, 1F, 1F);
		this.renderCenterLayer(mouseX, mouseY);
		for (int i = 0; i < components.size(); i++) {
			Component component = components.get(i);
			if (component.isVisible()) {
				component.renderForeground(mc, partialTicks, mouseX, mouseY);
			}
		}
		RenderHelper.disableStandardItemLighting();
		this.renderGuiForegroundLayer(mouseX, mouseY);
		RenderHelper.enableGUIStandardItemLighting();
		GlStateManager.popMatrix();
		GlStateManager.enableLighting();
		GlStateManager.enableDepth();
		RenderHelper.enableStandardItemLighting();

		for (int i = 0; i < components.size(); i++) {
			components.get(i).renderTooltips(mouseX, mouseY);
		}
		renderTooltips(mouseX, mouseY);
	}

	protected void renderGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
	}

	protected void renderCenterLayer(int mouseX, int mouseY) {
	}

	protected void renderGuiForegroundLayer(int mouseX, int mouseY) {
	}

	protected void renderTooltips(int mouseX, int mouseY) {
	}

	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		for (int i = 0; i < this.components.size(); ++i) {
			Component component = (Component) this.components.get(i);

			if (component.isHovered(mouseX, mouseY)) {
				this.selectedComonent = component;
				component.mousePressed(mouseButton, mouseX, mouseY);
			}
		}
	}

	@Override
	protected void mouseReleased(int mouseX, int mouseY, int state) {
		if (this.selectedComonent != null) {
			this.selectedComonent.mouseReleased(state, mouseX, mouseY);
			this.selectedComonent = null;
		}
	}

	@Override
	protected void keyTyped(char typedChar, int keyCode) throws IOException {
		super.keyTyped(typedChar, keyCode);
		if (keyCode == 1 || this.mc.gameSettings.keyBindInventory.isActiveAndMatches(keyCode)) {
			this.mc.player.closeScreen();
		}
	}

	@Override
	public void updateScreen() {
		super.updateScreen();

		for (int i = 0; i < this.components.size(); ++i) {
			Component component = (Component) this.components.get(i);
			component.update();
		}
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	public void renderTooltip(List<String> lines, int posX, int posY, int width, int height, int mouseX, int mouseY) {
		if (lines == null) {
			drawHoveringText(new ArrayList<String>(), mouseX, mouseY);
			return;
		}

		if (mouseX >= posX && mouseX < (posX + width) && mouseY >= posY && mouseY < (posY + height)) {
			drawHoveringText(lines, mouseX, mouseY);
		}
	}

	public void renderTooltip(String line, float posX, float posY, float width, float height, int mouseX, int mouseY) {
		if (line == null) {
			drawHoveringText(Arrays.asList(new String[] {}), mouseX, mouseY);
			return;
		}

		if (mouseX >= posX && mouseX < (posX + width) && mouseY >= posY && mouseY < (posY + height)) {
			drawHoveringText(Arrays.asList(new String[] { line }), mouseX, mouseY);
		}
	}

	public void addComponent(Component component) {
		component.setParent(this);
		component.onAddComponent();
		components.add(component);
	}

	public void clearComponents() {
		components.clear();
	}

	public List<Component> getComponents() {
		return components;
	}

	public int getX() {
		return guiLeft;
	}

	public int getY() {
		return guiTop;
	}

	public int getWidth() {
		return xSize;
	}

	public int getHeight() {
		return ySize;
	}
}