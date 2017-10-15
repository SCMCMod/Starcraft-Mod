package ga.scmc.client.gui;

import java.io.IOException;

import ga.scmc.client.gui.element.GuiButtonLavaLarvaOptions;
import ga.scmc.lib.GuiUtils;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;

/**
 * @since 5.1
 * @author Ocelot5836
 */
public class GuiLavaLarva extends BasicGui {

	/** The player being traded with. */
	private EntityPlayer customer;

	public GuiLavaLarva(EntityPlayer player) {
		this.customer = player;
	}

	@Override
	public void initGui() {
		xSize = 136;
		ySize = 100;
		super.initGui();

		buttonList.clear();
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 3; y++) {
				buttonList.add(new GuiButtonLavaLarvaOptions(x + y * 5, x + y * 5, 4 + guiLeft + 26 * x, 12 + guiTop + 26 * y));
			}
		}
	}

	@Override
	public void drawGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		bindGuiTexture();
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

	@Override
	protected void drawGuiForegroundLayer(int mouseX, int mouseY) {

	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		switch (button.id) {
		case 0:
			break;
		}
	}

	private void bindGuiTexture() {
		GuiUtils.bindTexture("textures/gui/lava_larva.png");
	}

	private void bindIconTexture() {
		GuiUtils.bindTexture("textures/gui/lava_larva_icons.png");
	}
}