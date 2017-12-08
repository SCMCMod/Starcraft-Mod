package ga.scmc.client.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ga.scmc.Starcraft;
import ga.scmc.entity.living.EntityLarvaCocoon;
import ga.scmc.network.NetworkHandler;
import ga.scmc.network.message.MessageSyncLarvaCocoonGui;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import ocelot.api.utils.GuiUtils;
import ocelot.api.utils.TextureUtils;

public class GuiLarvaProgress extends BasicGui {

	public static final GuiLarvaProgress INSTANCE = new GuiLarvaProgress();

	private EntityLarvaCocoon larva;

	public GuiLarvaProgress() {

	}

	@Override
	public void initGui() {
		xSize = 140;
		ySize = 97;
		super.initGui();

		buttonList.add(new GuiButton(0, guiLeft + (xSize / 2 - 40), guiTop + ySize - 30, 80, 20, I18n.format("gui.larva_progress.cancel")));
	}

	public void openGUI(EntityPlayer player, Object mod, int guiID, World world, int x, int y, int z, EntityLarvaCocoon larva) {
		player.openGui(Starcraft.instance, guiID, world, x, y, z);
		setLarva(larva);
		NetworkHandler.sendToAllClients(new MessageSyncLarvaCocoonGui(larva));
	}

	@Override
	protected void drawGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		TextureUtils.bindTexture("textures/gui/larva_progress.png");
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		drawTexturedModalRect(guiLeft + 8, guiTop + 33, 140, 0, larva.ticksExisted / 20, 9);
		int entityX = guiLeft + xSize - 30;
		int entityY = guiTop + 45;
		GuiUtils.drawEntityOnScreen(entityX, entityY, 15, entityX - mouseX, entityY - mouseY - 5, larva);
	}

	public void renderBar() {

	}

	@Override
	protected void drawGuiForegroundLayer(int mouseX, int mouseY) {
		this.mc.fontRendererObj.drawString(I18n.format("gui.larva_progress"), this.xSize / 2 - this.mc.fontRendererObj.getStringWidth(I18n.format("gui.larva_progress")) / 2, 6, 4210752);
	}

	@Override
	protected void drawTooltips(int mouseX, int mouseY) {
		List<String> tooltip = new ArrayList<String>();
		tooltip.add(I18n.format("gui.larva_progress.transform", larva.getEntityById(mc.world, larva.getEntityId()).getName()));
		tooltip.add("");
		tooltip.add(TextFormatting.GRAY + I18n.format("gui.larva_progress.time_remaining", 85 - larva.ticksExisted / 20));
		drawTooltip(tooltip, guiLeft + 93, guiTop + 21, 33, 33, mouseX, mouseY);

		drawTooltip(I18n.format("gui.larva_progress.bar_percentage", larva.ticksExisted / 20, "%"), guiLeft + 7, guiTop + 32, 82, 11, mouseX, mouseY);
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		switch (button.id) {
		case 0:
			// TODO kill larva here
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString("Need to add a message to actually remove this larva serverside."));
			break;
		}
	}

	@Override
	public void updateScreen() {
		if (larva != null && larva.isDead) {
			Minecraft.getMinecraft().player.closeScreen();
		}
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	public EntityLarvaCocoon getLarva() {
		return larva;
	}

	public void setLarva(EntityLarvaCocoon larva) {
		this.larva = larva;
	}
}