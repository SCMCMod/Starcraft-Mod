package ga.scmc.client.gui.element;

import ga.scmc.lib.GuiUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;

public class GuiButtonLavaLarvaOptions extends GuiButton {

	private int iconId;

	public GuiButtonLavaLarvaOptions(int buttonId, int iconId, int x, int y) {
		super(buttonId, x, y, 24, 24, "");
		this.iconId = iconId;
	}

	@Override
	public void drawButton(Minecraft mc, int mouseX, int mouseY) {
		if (this.visible) {
			bindGuiTexture();
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			this.hovered = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
			int i = this.getHoverState(this.hovered);
			drawTexturedModalRect(xPosition, yPosition, 136 + i * width, 0, width, height);
			bindIconsTexture();
			drawTexturedModalRect(xPosition + width / 6, yPosition + height / 6, (iconId % 16) * 16, (iconId / 16) * 16, 16, 16);
			this.mouseDragged(mc, mouseX, mouseY);
		}
	}

	private void bindGuiTexture() {
		GuiUtils.bindTexture("textures/gui/lava_larva.png");
	}

	private void bindIconsTexture() {
		GuiUtils.bindTexture("textures/gui/lava_larva_icons.png");
	}
}