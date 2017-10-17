package ga.scmc.client.gui.element;

import java.util.ArrayList;
import java.util.List;

import ga.scmc.lib.GuiUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;

/**
 * This class is an option for the lava larva GUI.
 * 
 * @author Ocelot5836
 */
public class LavaLarvaOption extends GuiButton {

	private int iconId;
	private List<String> tooltip;
	private boolean unlocked;
	private LavaLarvaOption parent;

	public LavaLarvaOption(int buttonId, int iconId, int x, int y) {
		this(null, buttonId, iconId, x, y);
	}

	public LavaLarvaOption(LavaLarvaOption parent, int buttonId, int iconId, int x, int y) {
		super(buttonId, x, y, 24, 24, "");
		this.iconId = iconId;
		this.tooltip = new ArrayList<String>();
		this.parent = parent;
		this.unlocked = false;
	}

	@Override
	protected int getHoverState(boolean unlockable) {
		int i = 1;

		if (!this.enabled) {
			i = 0;
		} else if (unlockable) {
			i = 2;
		}

		return i;
	}

	@Override
	public void drawButton(Minecraft mc, int mouseX, int mouseY) {
		if (!isUnlocked() && !isUnlockable())
			enabled = false;
		bindGuiTexture();
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.hovered = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
		int i = getHoverState(isUnlockable());
		drawTexturedModalRect(xPosition, yPosition, 137 + i * width, 0, width, height);
		bindIconsTexture();
		drawTexturedModalRect(xPosition + width / 6, yPosition + height / 6, (iconId % 16) * 16, (iconId / 16) * 16, 16, 16);
		this.mouseDragged(mc, mouseX, mouseY);

		if (hovered) {

		}
	}

	@Override
	public boolean mousePressed(Minecraft mc, int mouseX, int mouseY) {
		return super.mousePressed(mc, mouseX, mouseY) && !isUnlocked();
	}

	private void bindGuiTexture() {
		GuiUtils.bindTexture("textures/gui/lava_larva.png");
	}

	private void bindIconsTexture() {
		GuiUtils.bindTexture("textures/gui/lava_larva_icons.png");
	}

	public int getIconId() {
		return iconId;
	}

	public List<String> getTooltip() {
		return tooltip;
	}

	public LavaLarvaOption getParent() {
		if (parent == null) {
			return this;
		}
		return parent;
	}

	public boolean isUnlocked() {
		return unlocked;
	}

	public boolean isUnlockable() {
		if (getParent() == this)
			return false;
		boolean capability = false;
		capability = getParent().isUnlocked();
		return capability;
	}

	public LavaLarvaOption unlock() {
		this.unlocked = true;
		return this;
	}

	public LavaLarvaOption setTooltip(String tooltip) {
		this.tooltip.add(tooltip);
		return this;
	}

	public LavaLarvaOption setTooltip(String tooltip, String delimeter) {
		String[] tokens = tooltip.split(delimeter);
		for (int i = 0; i < tokens.length; i++)
			this.tooltip.add(tokens[i]);
		
		return this;
	}
}