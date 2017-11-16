package ga.scmc.client.gui.element;

import java.io.IOException;

import ga.scmc.api.GuiUtils;
import ga.scmc.api.TextureUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.ItemStack;

/**
 * @since 5.1
 * @author Ocelot5836
 */
public class Tab extends GuiScreen {

	private static final Minecraft MC = Minecraft.getMinecraft();

	private ItemStack icon;
	private String name;
	private int id;
	private int x;
	private int y;
	private int width;
	private int height;
	private boolean selected;

	private int xOffset = 14;

	public Tab(ItemStack icon, String name, int id, int x, int y) {
		this.icon = icon;
		this.name = name;
		this.id = id;
		this.x = x;
		this.y = y;
		this.width = 32;
		this.height = 28;
	}

	public Tab(ItemStack icon, String name, int id, int x, int y, int width, int height) {
		this.icon = icon;
		this.name = name;
		this.id = id;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void renderUnlit(int mouseX, int mouseY) {
		if (!selected) {
			bindTexture();
			this.drawTexturedModalRect(x, y, width * id, 0, width, height);
		}
	}

	public void renderLit(int mouseX, int mouseY) {
		if (selected) {
			bindTexture();
			this.drawTexturedModalRect(x, y, width * id, height, width, height);
		}
	}

	public void renderIcon() {
		MC.getRenderItem().renderItemAndEffectIntoGUI(icon, x + 9, y + 7);
	}

	public void onMouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		if (GuiUtils.isMouseInside(x, y, width, height, mouseX, mouseY)) {
			GuiUtils.playButtonClick();
		}
	}

	public void bindTexture() {
		TextureUtils.bindTexture("textures/gui/tabs.png");
	}

	public String getName() {
		return name;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public boolean isSelected() {
		return selected;
	}

	public void select() {
		this.selected = true;
	}

	public void deselect() {
		this.selected = false;
	}
}