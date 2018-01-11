package ocelot.api.client.gui.component;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import ocelot.api.client.gui.GuiBase;
import ocelot.api.client.gui.component.listener.MouseListener;

public abstract class Component extends Gui {

	protected static Minecraft mc = Minecraft.getMinecraft();
	protected static FontRenderer fontRenderer = mc.fontRendererObj;

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

	public void update() {
	}

	public void renderBackground(Minecraft mc, float partialTicks, int mouseX, int mouseY) {
	}

	public void renderForeground(Minecraft mc, float partialTicks, int mouseX, int mouseY) {
	}

	public void renderTooltips(int mouseX, int mouseY) {
	}

	public boolean isHovered(int mouseX, int mouseY) {
		mouseX -= parent.getX();
		mouseY -= parent.getY();
		return this.visible && mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;
	}

	public void mousePressed(int mouseButton, int mouseX, int mouseY) {
		if (mouseListener != null)
			mouseListener.mousePressed(mouseButton, mouseX, mouseY);
	}

	public void mouseReleased(int mouseButton, int mouseX, int mouseY) {
		if (mouseListener != null)
			mouseListener.mouseReleased(mouseButton, mouseX, mouseY);
	}

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

	public void setParent(GuiBase parent) {
		this.parent = parent;
	}
}