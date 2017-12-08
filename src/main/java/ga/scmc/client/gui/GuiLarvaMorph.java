package ga.scmc.client.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ga.scmc.Starcraft;
import ga.scmc.client.gui.element.LarvaOption;
import ga.scmc.entity.living.EntityLarva;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.network.NetworkHandler;
import ga.scmc.network.message.MessageMorphLarva;
import ga.scmc.network.message.MessageSyncLarvaGui;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import ocelot.api.utils.GuiUtils;
import ocelot.api.utils.InventoryUtils;
import ocelot.api.utils.SoundUtils;

/**
 * @since 5.1
 * @author Ocelot5836
 */
public class GuiLarvaMorph extends BasicGui {

	public static final GuiLarvaMorph INSTANCE = new GuiLarvaMorph();
	private EntityPlayer customer;
	private EntityLarva larva;
	private List<LarvaOption> subOptions = new ArrayList<LarvaOption>();
	private int subOptionsX, subOptionsY;

	public GuiLarvaMorph(EntityPlayer player) {
		this.customer = player;
	}

	public GuiLarvaMorph() {
	}

	@Override
	public void initGui() {
		xSize = 105;
		ySize = 51;
		super.initGui();
	}

	@Override
	public void drawGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GuiUtils.drawCustomSizeGui(guiLeft, guiTop, xSize, ySize, zLevel);
	}

	public void openGUI(EntityPlayer player, Object mod, int guiID, World world, int x, int y, int z, EntityLarva larva) {
		player.openGui(Starcraft.instance, guiID, world, x, y, z);
		setLarva(larva);
		NetworkHandler.sendToClient(new MessageSyncLarvaGui(larva));
	}

	@Override
	protected void drawGuiForegroundLayer(int mouseX, int mouseY) {
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 5; x++) {
				int index = x + y * 5;
				if (index < GuiLists.LARVA_OPTIONS.size()) {
					GuiUtils.drawSlot(7 + x * 18, 7 + y * 18, 18, 18);
					GuiLists.LARVA_OPTIONS.get(index).render(8 + x * 18, 8 + y * 18);
				}
			}
		}

		if (subOptions.size() > 0) {
			this.drawGradientRect(0, 0, xSize, ySize, -1072689136, -804253680);

			int x = subOptionsX - guiLeft;
			int y = subOptionsY - guiTop;
			GuiUtils.drawCustomSizeGui(x - 6, y - 6, 16 * 3, 30, zLevel);
			for (int index = 0; index < subOptions.size(); index++) {
				GuiUtils.drawSlot(x + index * 18, y, 18, 18);
				subOptions.get(index).render(1 + x + index * 18, 1 + y);
			}
		}
	}

	@Override
	protected void drawTooltips(int mouseX, int mouseY) {
		if (subOptions.size() <= 0) {
			for (int y = 0; y < 3; y++) {
				for (int x = 0; x < 5; x++) {
					int index = x + y * 5;
					if (index < GuiLists.LARVA_OPTIONS.size()) {
						List<String> tooltip = new ArrayList<String>(GuiLists.LARVA_OPTIONS.get(index).getTooltip());

						if (GuiLists.LARVA_OPTIONS.get(index).getChildren().length <= 0) {
							tooltip.add(TextFormatting.GRAY + "Mineral Cost: " + GuiLists.LARVA_OPTIONS.get(index).getMineralCost());
							tooltip.add(TextFormatting.GRAY + "Vespene Cost: " + GuiLists.LARVA_OPTIONS.get(index).getVespeneCost());
						} else {
							tooltip.add(TextFormatting.GRAY + "Children: " + GuiLists.LARVA_OPTIONS.get(index).getChildren().length);
						}
						drawTooltip(tooltip, guiLeft + 7 + x * 18, guiTop + 7 + y * 18, 17, 18, mouseX, mouseY);
					}
				}
			}
		} else {
			for (int i = 0; i < subOptions.size(); i++) {
				LarvaOption option = subOptions.get(i);
				List<String> tooltip = new ArrayList<String>(option.getTooltip());
				tooltip.add(TextFormatting.GRAY + "Mineral Cost: " + option.getMineralCost());
				tooltip.add(TextFormatting.GRAY + "Vespene Cost: " + option.getVespeneCost());
				drawTooltip(tooltip, subOptionsX + i * 18, subOptionsY, 18, 18, mouseX, mouseY);
			}
		}
	}

	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		super.mouseClicked(mouseX, mouseY, mouseButton);

		if (subOptions.size() <= 0) {
			if (mouseButton == 0) {
				for (int y = 0; y < 3; y++) {
					for (int x = 0; x < 5; x++) {
						int index = x + y * 5;
						if (index < GuiLists.LARVA_OPTIONS.size()) {
							if (GuiUtils.isMouseInside(guiLeft + 7 + x * 18, guiTop + 7 + y * 18, 17, 18, mouseX, mouseY)) {
								LarvaOption larvaOption = GuiLists.LARVA_OPTIONS.get(index);
								EntityPlayer player = Minecraft.getMinecraft().player;
								SoundUtils.playButtonClick();

								if (larvaOption.getChildren().length > 0) {
									for (int i = 0; i < larvaOption.getChildren().length; i++)
										subOptions.add(larvaOption.getChildren()[i]);
									subOptionsX = mouseX + 8;
									subOptionsY = mouseY - 8;
								} else {
									if (InventoryUtils.hasItemAndAmount(player, ItemHandler.MINERAL_SHARD, larvaOption.getMineralCost(), 0) && InventoryUtils.hasItemAndAmount(player, ItemHandler.VESPENE, larvaOption.getVespeneCost())) {
										InventoryUtils.removeItemWithAmount(player, ItemHandler.MINERAL_SHARD, larvaOption.getMineralCost(), 0);
										InventoryUtils.removeItemWithAmount(player, ItemHandler.VESPENE, larvaOption.getVespeneCost(), 0);
										NetworkHandler.sendToServer(new MessageMorphLarva(larva, index));
										Minecraft.getMinecraft().player.closeScreen();
									}
								}
								return;
							}
						}
					}
				}
			}
		} else {
			for (int i = 0; i < subOptions.size(); i++) {
				if (GuiUtils.isMouseInside(subOptionsX + i * 18, subOptionsY, 18, 18, mouseX, mouseY)) {
					LarvaOption option = subOptions.get(i);
					EntityPlayer player = Minecraft.getMinecraft().player;
					SoundUtils.playButtonClick();
					if (InventoryUtils.hasItemAndAmount(player, ItemHandler.MINERAL_SHARD, option.getMineralCost(), 0) && InventoryUtils.hasItemAndAmount(player, ItemHandler.VESPENE, option.getVespeneCost())) {
						InventoryUtils.removeItemWithAmount(player, ItemHandler.MINERAL_SHARD, option.getMineralCost(), 0);
						InventoryUtils.removeItemWithAmount(player, ItemHandler.VESPENE, option.getVespeneCost(), 0);
						NetworkHandler.sendToServer(new MessageMorphLarva(larva, option.getIconId()));
						Minecraft.getMinecraft().player.closeScreen();
					}
					return;
				}
			}
			subOptions.clear();
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

	public EntityLarva getLarva() {
		return larva;
	}

	public void setLarva(EntityLarva larva) {
		this.larva = larva;
	}
}