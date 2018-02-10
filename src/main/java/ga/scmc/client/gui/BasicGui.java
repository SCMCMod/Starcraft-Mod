package ga.scmc.client.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;

public class BasicGui extends GuiScreen {

	protected static final Minecraft	MC	= Minecraft.getMinecraft();

	protected int						xSize, ySize;
	protected int						guiLeft, guiTop;

	@Override
	public void initGui() {
		this.guiLeft = (width - xSize) / 2;
		this.guiTop = (height - ySize) / 2;
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		int i = this.guiLeft;
		int j = this.guiTop;
		this.drawGuiBackgroundLayer(partialTicks, mouseX, mouseY);
		GlStateManager.disableRescaleNormal();
		RenderHelper.disableStandardItemLighting();
		GlStateManager.disableLighting();
		GlStateManager.disableDepth();
		super.drawScreen(mouseX, mouseY, partialTicks);
		RenderHelper.enableGUIStandardItemLighting();
		GlStateManager.pushMatrix();
		GlStateManager.translate((float) i, (float) j, 0.0F);
		GlStateManager.color(1F, 1F, 1F, 1F);
		GlStateManager.enableRescaleNormal();
		int k = 240;
		int l = 240;
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
		GlStateManager.color(1F, 1F, 1F, 1F);

		this.drawCenterLayer(mouseX, mouseY);

		RenderHelper.disableStandardItemLighting();
		this.drawGuiForegroundLayer(mouseX, mouseY);
		RenderHelper.enableGUIStandardItemLighting();
		GlStateManager.popMatrix();
		GlStateManager.enableLighting();
		GlStateManager.enableDepth();
		RenderHelper.enableStandardItemLighting();

		drawTooltips(mouseX, mouseY);
	}

	protected void drawGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
	}

	protected void drawCenterLayer(int mouseX, int mouseY) {
	}

	protected void drawGuiForegroundLayer(int mouseX, int mouseY) {
	}

	protected void drawTooltips(int mouseX, int mouseY) {
	}

	@Override
	protected void keyTyped(char typedChar, int keyCode) throws IOException {
		super.keyTyped(typedChar, keyCode);
		if (keyCode == 1 || this.mc.gameSettings.keyBindInventory.isActiveAndMatches(keyCode)) {
			this.mc.player.closeScreen();
		}
	}

	public void drawTooltip(List<String> lines, int posX, int posY, int width, int height, int mouseX, int mouseY) {
		if (lines == null) {
			drawHoveringText(new ArrayList<String>(), mouseX, mouseY);
			return;
		}

		if (mouseX >= posX && mouseX < (posX + width) && mouseY >= posY && mouseY < (posY + height)) {
			drawHoveringText(lines, mouseX, mouseY);
		}
	}

	public void drawTooltip(String line, float posX, float posY, float width, float height, int mouseX, int mouseY) {
		if (line == null) {
			drawHoveringText(Arrays.asList(new String[] {}), mouseX, mouseY);
			return;
		}

		if (mouseX >= posX && mouseX < (posX + width) && mouseY >= posY && mouseY < (posY + height)) {
			drawHoveringText(Arrays.asList(new String[] { line }), mouseX, mouseY);
		}
	}
}