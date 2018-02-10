package ga.scmc.client.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ga.scmc.client.gui.element.ItemShopTab;
import ga.scmc.enums.EnumMetaItem;
import ga.scmc.handlers.ArmorHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.MetaBlockHandler;
import ga.scmc.handlers.ToolHandler;
import ga.scmc.items.metaitems.ItemMagazine;
import ga.scmc.network.NetworkHandler;
import ga.scmc.network.message.MessageSpawnItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiLabel;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import ocelot.api.utils.GuiUtils;
import ocelot.api.utils.InventoryUtils;
import ocelot.api.utils.SoundUtils;
import ocelot.api.utils.TimeUtils;

/**
 * @author Ocelot5836
 */
public class GuiItemShop extends BasicGui {

	/** The player being traded with. */
	private EntityPlayer			customer;
	private String					displayName;

	private static final ItemStack	MINERAL			= new ItemStack(ItemHandler.MINERAL_SHARD);
	private static final ItemStack	VESPENE			= new ItemStack(ItemHandler.VESPENE, 1, 2);

	public List<ItemShopTab>		tabs			= new ArrayList<ItemShopTab>();
	private int						tab;

	private GuiButton				buttonBuy;
	private static final int		BUTTON_BUY		= 0;

	private int						selectedIndex	= -1;

	public GuiItemShop(EntityPlayer player) {
		this(player, I18n.format("gui.item_shop"));
	}

	public GuiItemShop(EntityPlayer player, String displayName) {
		this.customer = player;
		this.displayName = displayName;
		tab = 0;
	}

	@Override
	public void initGui() {
		xSize = 152;
		ySize = 230;
		guiLeft = (width - xSize) / 2;
		guiTop = (height - ySize) / 2;

		tab = 0;

		tabs.clear();
		tabs.add(new ItemShopTab(((ItemMagazine) ItemHandler.BULLET_MAGAZINE).getDefaultStack(EnumMetaItem.BulletMagazineType.C14.getID()), I18n.format("itemGroup.terran.general"), 0, guiLeft - 29, guiTop + 4, GuiLists.TRADES[0]));
		tabs.add(new ItemShopTab(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, 1), I18n.format("itemGroup.terran.machine"), 1, guiLeft - 29, guiTop + 34, GuiLists.TRADES[1]));
		tabs.add(new ItemShopTab(new ItemStack(MetaBlockHandler.PARISTEEL_METAL, 1, 0), I18n.format("itemGroup.terran.decoration"), 2, guiLeft - 29, guiTop + 64, GuiLists.TRADES[2]));
		tabs.add(new ItemShopTab(new ItemStack(ItemHandler.C14_GAUSS_RIFLE, 1, 0), I18n.format("itemGroup.terran.weapons"), 3, guiLeft - 29, guiTop + 94, GuiLists.TRADES[3]));
		tabs.add(new ItemShopTab(new ItemStack(ArmorHandler.COPPER_HELMET, 1, 0), I18n.format("itemGroup.terran.armors"), 4, guiLeft - 29, guiTop + 124, GuiLists.TRADES[4]));
		tabs.add(new ItemShopTab(new ItemStack(ToolHandler.COPPER_PICKAXE, 1, 0), I18n.format("itemGroup.terran.tools"), 5, guiLeft - 29, guiTop + 154, GuiLists.TRADES[5]));

		buttonList.clear();
		buttonBuy = new GuiButton(0, guiLeft + 105, guiTop + 120, 30, 20, I18n.format("gui.buy"));
		buttonList.add(buttonBuy);
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		this.drawGuiBackgroundLayer(partialTicks, mouseX, mouseY);
		GlStateManager.disableRescaleNormal();
		RenderHelper.disableStandardItemLighting();
		GlStateManager.disableLighting();
		GlStateManager.disableDepth();

		for (int i = 0; i < this.buttonList.size(); ++i) {
			((GuiButton) this.buttonList.get(i)).drawButton(this.mc, mouseX, mouseY);
		}

		for (int j = 0; j < this.labelList.size(); ++j) {
			((GuiLabel) this.labelList.get(j)).drawLabel(this.mc, mouseX, mouseY);
		}

		GlStateManager.pushMatrix();
		GlStateManager.color(1F, 1F, 1F, 1F);
		GlStateManager.enableRescaleNormal();
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
		GlStateManager.color(1F, 1F, 1F, 1F);

		for (ItemShopTab tab : tabs) {
			tab.renderLit(mouseX, mouseY);
			GlStateManager.enableDepth();
			RenderHelper.enableGUIStandardItemLighting();
			tab.renderIcon();
		}

		GlStateManager.translate((float) this.guiLeft, (float) this.guiTop, 0.0F);
		drawCenterLayer(mouseX, mouseY);
		RenderHelper.disableStandardItemLighting();
		this.drawGuiForegroundLayer(mouseX, mouseY);
		GlStateManager.popMatrix();
		GlStateManager.enableLighting();
		GlStateManager.enableDepth();
		GlStateManager.disableDepth();
		RenderHelper.enableStandardItemLighting();

		drawTooltips(mouseX, mouseY);
	}

	@Override
	public void drawGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		for (ItemShopTab tab : tabs) {
			tab.renderUnlit(mouseX, mouseY);
		}

		tabs.get(tab).renderBackground(guiLeft, guiTop, xSize, ySize);

		if (MINERAL.stackSize <= 0) {
			tabs.get(tab).bindTexture();
			this.drawTexturedModalRect(guiLeft + 105, guiTop + 91, 152, 0, 16, 16);
		}

		if (VESPENE.stackSize <= 0) {
			tabs.get(tab).bindTexture();
			this.drawTexturedModalRect(guiLeft + 123, guiTop + 91, 152, 0, 16, 16);
		}
	}

	@Override
	public void drawCenterLayer(int mouseX, int mouseY) {
		if (selectedIndex != -1) {
			int selectedX = selectedIndex % 4;
			int selectedY = selectedIndex / 4;
			GlStateManager.color(0.1F, 0.1F, 0.1F, 0.1F);
			int xOffset = 25;
			int yOffset = 25;
			drawRect(xOffset + selectedX * 18, yOffset + selectedY * 22, xOffset + (selectedX * 18) + 16, yOffset + (selectedY * 22) + 16, GuiLists.HIGHLIGHT_COLOR);
		}

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				int index = 4 * i + j;
				if (index < tabs.get(tab).getItems().size()) {
					if (index != selectedIndex && (MINERAL.stackSize < tabs.get(tab).getItems().get(index).getMineralCost() || VESPENE.stackSize < tabs.get(tab).getItems().get(index).getVespeneCost())) {
						int selectedX = index % 4;
						int selectedY = index / 4;
						int xOffset = 25;
						int yOffset = 25;
						drawRect(xOffset + selectedX * 18, yOffset + selectedY * 22, xOffset + (selectedX * 18) + 16, yOffset + (selectedY * 22) + 16, GuiLists.NO_FUNDS_COLOR);
					}
					Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(tabs.get(tab).getItems().get(index).getStack(), 25 + j * 18, 25 + i * 22);
					Minecraft.getMinecraft().getRenderItem().renderItemOverlays(mc.fontRendererObj, tabs.get(tab).getItems().get(index).getStack(), 25 + j * 18, 25 + i * 22);
				}
			}
		}
	}

	@Override
	public void drawGuiForegroundLayer(int mouseX, int mouseY) {
		this.fontRendererObj.drawString(displayName, xSize / 2 - this.fontRendererObj.getStringWidth(displayName) / 2, 8, 4210752);
		this.fontRendererObj.drawString(I18n.format("gui.item_shop.money"), 123 - this.fontRendererObj.getStringWidth(I18n.format("gui.item_shop.money")) / 2, 75, 4210752);
		if (TimeUtils.isChristmas()) {
			this.fontRendererObj.drawString(I18n.format("gui.item_shop.christmas"), xSize / 2 - this.fontRendererObj.getStringWidth(I18n.format("gui.item_shop.christmas")) / 2, 206, 0x005f00);
		}

		MINERAL.stackSize = InventoryUtils.getItemAmount(customer, MINERAL.getItem(), MINERAL.getItemDamage());
		VESPENE.stackSize = InventoryUtils.getItemAmount(customer, VESPENE.getItem(), VESPENE.getItemDamage());

		if (MINERAL.stackSize > 0) {
			Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(MINERAL, 105, 91);
			Minecraft.getMinecraft().getRenderItem().renderItemOverlays(mc.fontRendererObj, MINERAL, 105, 91);
		}

		if (VESPENE.stackSize > 0) {
			Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(VESPENE, 123, 91);
			Minecraft.getMinecraft().getRenderItem().renderItemOverlays(mc.fontRendererObj, VESPENE, 123, 91);
		}
	}

	@Override
	public void drawTooltips(int mouseX, int mouseY) {
		for (ItemShopTab tab : tabs) {
			drawTooltip(tab.getName(), tab.getX(), tab.getY(), tab.getWidth(), tab.getHeight(), mouseX, mouseY);
		}

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				int index = 4 * i + j;
				if (index < tabs.get(tab).getItems().size()) {
					List<String> tooltip = tabs.get(tab).getItems().get(index).getStack().getTooltip(customer, this.mc.gameSettings.advancedItemTooltips);
					tooltip.add("");
					tooltip.add(TextFormatting.GRAY + I18n.format("gui.item_shop.tooltip.mineral_cost", tabs.get(tab).getItems().get(index).getMineralCost()));
					tooltip.add(TextFormatting.GRAY + I18n.format("gui.item_shop.tooltip.vespene_cost", tabs.get(tab).getItems().get(index).getVespeneCost()));
					drawTooltip(tooltip, guiLeft + 24 + j * 18, guiTop + 24 + i * 22, 18, 18, mouseX, mouseY);
				}
			}
		}

		if (MINERAL.stackSize <= 0) {
			drawTooltip(I18n.format("gui.item_shop.no_minerals"), guiLeft + 105, guiTop + 91, 16, 16, mouseX, mouseY);
		} else {
			drawTooltip(MINERAL.getTooltip(customer, this.mc.gameSettings.advancedItemTooltips), guiLeft + 104, guiTop + 90, 18, 18, mouseX, mouseY);
		}

		if (VESPENE.stackSize <= 0) {
			drawTooltip(I18n.format("gui.item_shop.no_vespene"), guiLeft + 123, guiTop + 91, 16, 16, mouseX, mouseY);
		} else {
			drawTooltip(VESPENE.getTooltip(customer, this.mc.gameSettings.advancedItemTooltips), guiLeft + 122, guiTop + 90, 18, 168, mouseX, mouseY);
		}
	}

	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		for (int i = 0; i < tabs.size(); i++) {
			tabs.get(i).onMouseClicked(mouseX, mouseY, mouseButton);

			if (mouseButton == 0) {
				if (GuiUtils.isMouseInside((int) tabs.get(i).getX(), (int) tabs.get(i).getY(), tabs.get(i).getWidth(), tabs.get(i).getHeight(), mouseX, mouseY)) {
					tab = i;
					selectedIndex = -1;
				}
			}
		}

		if (mouseButton == 0) {
			for (int y = 0; y < 7; y++) {
				for (int x = 0; x < 4; x++) {
					int index = 4 * y + x;
					if (index < tabs.get(tab).getItems().size()) {
						if (GuiUtils.isMouseInside(guiLeft + 25 + x * 18, guiTop + 25 + y * 22, 16, 16, mouseX, mouseY)) {
							this.selectedIndex = index;
							SoundUtils.playButtonClick();
							return;
						}
					}
				}
			}
		} else {
			this.selectedIndex = -1;
		}

		super.mouseClicked(mouseX, mouseY, mouseButton);
	}

	@Override
	public void updateScreen() {
		if (selectedIndex == -1 || MINERAL.stackSize < tabs.get(tab).getItems().get(selectedIndex).getMineralCost() || VESPENE.stackSize < tabs.get(tab).getItems().get(selectedIndex).getVespeneCost()) {
			buttonBuy.enabled = false;
		} else {
			buttonBuy.enabled = true;
		}

		for (ItemShopTab tab : tabs) {
			tab.deselect();
		}

		if (tab > tabs.size()) {
			tab = 0;
		} else {
			tabs.get(tab).select();
		}
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		switch (button.id) {
		case BUTTON_BUY:
			if (selectedIndex != -1 && MINERAL.stackSize >= tabs.get(tab).getItems().get(selectedIndex).getMineralCost() && VESPENE.stackSize >= tabs.get(tab).getItems().get(selectedIndex).getVespeneCost()) {
				NetworkHandler.sendToServer(new MessageSpawnItem(tabs.get(tab).getItems().get(selectedIndex).getStack()));
				InventoryUtils.removeItemWithAmount(customer, MINERAL.getItem(), tabs.get(tab).getItems().get(selectedIndex).getMineralCost());
				InventoryUtils.removeItemWithAmount(customer, VESPENE.getItem(), tabs.get(tab).getItems().get(selectedIndex).getVespeneCost());
			}
			break;
		}
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	@Override
	protected void keyTyped(char typedChar, int keyCode) throws IOException {
		super.keyTyped(typedChar, keyCode);
		if (keyCode == 1 || this.mc.gameSettings.keyBindInventory.isActiveAndMatches(keyCode)) {
			this.mc.player.closeScreen();
		}
	}
}