package ga.scmc.client.gui;

import java.io.IOException;
import java.util.List;

import ga.scmc.Starcraft;
import ga.scmc.client.gui.element.LarvaOption;
import ga.scmc.entity.living.EntityLarva;
import ga.scmc.lib.GuiUtils;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * @since 5.1
 * @author Ocelot5836
 */
public class GuiLarvaMorph extends BasicGui {

	public static final GuiLarvaMorph INSTANCE = new GuiLarvaMorph();
	/** The player being traded with. */
	private EntityPlayer customer;
	private EntityLarva larva;

	public GuiLarvaMorph(EntityPlayer player) {
		this.customer = player;
	}

	public GuiLarvaMorph() {
	}

	@Override
	public void initGui() {
		xSize = 104;
		ySize = 68;
		super.initGui();
	}

	@Override
	public void drawGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		bindGuiTexture();
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

	@Override
	protected void drawCenterLayer(int mouseX, int mouseY) {

	}

	public void openGUI(EntityPlayer player, Object mod, int guiID, World world, int x, int y, int z, EntityLarva larva) {
		player.openGui(Starcraft.instance, guiID, world, x, y, z);
		this.larva = larva;
	}

	@Override
	protected void drawGuiForegroundLayer(int mouseX, int mouseY) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				int index = 5 * i + j;
				if (index < GuiLists.LARVA_OPTIONS.size()) {
					LarvaOption option = GuiLists.LARVA_OPTIONS.get(index);
					bindIconTexture();
					drawTexturedModalRect(8 + j * 18, 8 + i * 18, (option.getIconId() % 16) * 16, (option.getIconId() / 16) * 16, 16, 16);
				}
			}
		}
	}

	@Override
	protected void drawTooltips(int mouseX, int mouseY) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				int index = 5 * i + j;
				if (index < GuiLists.LARVA_OPTIONS.size()) {
					List<String> tooltip = GuiLists.LARVA_OPTIONS.get(index).getTooltip();
					drawTooltip(tooltip, guiLeft + 7 + j * 18, guiTop + 7 + i * 18, 17, 18, mouseX, mouseY);
				}
			}
		}
	}

	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		super.mouseClicked(mouseX, mouseY, mouseButton);

		if (mouseButton == 0) {
			for (int y = 0; y < 3; y++) {
				for (int x = 0; x < 5; x++) {
					int index = 5 * y + x;
					if (index < GuiLists.LARVA_OPTIONS.size()) {
						if (GuiUtils.isMouseInside(guiLeft + 7 + x * 18, guiTop + 7 + y * 18, 17, 18, mouseX, mouseY)) {
							GuiUtils.playButtonClick();
							// NetworkHandler.sendToServer(new MessageEditEntity(index));
							return;
						}
					}
				}
			}
		}
	}

	public EntityLarva getLarva() {
		return larva;
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	private void bindGuiTexture() {
		GuiUtils.bindTexture("textures/gui/larva.png");
	}

	private void bindIconTexture() {
		GuiUtils.bindTexture("textures/gui/larva_icons.png");
	}
}