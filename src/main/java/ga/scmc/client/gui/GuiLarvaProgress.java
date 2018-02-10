package ga.scmc.client.gui;

import java.io.IOException;

import ga.scmc.Starcraft;
import ga.scmc.capabilities.ColorProvider;
import ga.scmc.entity.living.EntityLarvaCocoon;
import ga.scmc.enums.EnumTeamColors;
import ga.scmc.network.NetworkHandler;
import ga.scmc.network.message.MessageKillEntity;
import ga.scmc.network.message.MessageSyncLarvaCocoonGui;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import ocelot.api.utils.GuiUtils;
import ocelot.api.utils.TextureUtils;

public class GuiLarvaProgress extends BasicGui {

	public static final GuiLarvaProgress	INSTANCE	= new GuiLarvaProgress();

	private EntityLarvaCocoon				cocoon;

	@Override
	public void initGui() {
		xSize = 140;
		ySize = 97;
		super.initGui();

		buttonList.add(new GuiButton(0, guiLeft + (xSize / 2 - 40), guiTop + ySize - 30, 80, 20, I18n.format("gui.larva_progress.cancel")));
	}

	public void openGUI(EntityPlayer player, Object mod, int guiID, World world, int x, int y, int z, EntityLarvaCocoon cocoon) {
		if (cocoon.getTeamColor() == EnumTeamColors.getColorById(player.getCapability(ColorProvider.COLOR, null).getColor())) {
			player.openGui(Starcraft.instance, guiID, world, x, y, z);
			setCocoon(cocoon);
			NetworkHandler.sendToAllClients(new MessageSyncLarvaCocoonGui(cocoon));
		}
	}

	@Override
	protected void drawGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		TextureUtils.bindTexture("textures/gui/larva_progress.png");
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		if (cocoon != null) {
			float percentage = (cocoon.ticksExisted / 20f) / (float) (cocoon.getTransformTime() / 20);
			drawTexturedModalRect(guiLeft + 6, guiTop + 33, 140, 0, (int) (percentage * 85), 9);
		}
		int entityX = guiLeft + xSize - 29;
		int entityY = guiTop + 45;
		GuiUtils.drawEntityOnScreen(entityX, entityY, 15, entityX - mouseX, entityY - mouseY - 10, cocoon);
	}

	@Override
	protected void drawGuiForegroundLayer(int mouseX, int mouseY) {
		this.mc.fontRendererObj.drawString(I18n.format("gui.larva_progress"), this.xSize / 2 - this.mc.fontRendererObj.getStringWidth(I18n.format("gui.larva_progress")) / 2, 6, 4210752);
	}

	@Override
	protected void drawTooltips(int mouseX, int mouseY) {
		if (cocoon != null) {
			float percentage = (cocoon.ticksExisted / 20f) / (float) (cocoon.getTransformTime() / 20);
			drawTooltip(I18n.format("gui.larva_progress.bar_percentage", (int) (percentage * 100), "%"), guiLeft + 5, guiTop + 32, 87, 11, mouseX, mouseY);
		}
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		switch (button.id) {
		case 0:
			Minecraft.getMinecraft().player.closeScreen();
			Minecraft.getMinecraft().player.playSound(cocoon.getDeathSound(), 1, 1);
			NetworkHandler.sendToServer(new MessageKillEntity(cocoon));
			break;
		}
	}

	@Override
	public void updateScreen() {
		if (cocoon == null || cocoon.isDead) {
			Minecraft.getMinecraft().player.closeScreen();
		}
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	public void setCocoon(EntityLarvaCocoon larva) {
		this.cocoon = larva;
	}
}