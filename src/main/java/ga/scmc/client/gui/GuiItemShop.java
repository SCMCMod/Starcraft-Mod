package ga.scmc.client.gui;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ga.scmc.client.gui.element.Tab;
import ga.scmc.handlers.ArmorHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.MetaBlockHandler;
import ga.scmc.handlers.ToolHandler;
import ga.scmc.lib.GuiUtils;
import ga.scmc.lib.InventoryUtil;
import ga.scmc.network.NetworkHandler;
import ga.scmc.network.message.MessageSpawnItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;

/**
 * @since 5.1
 * @author Ocelot5836
 */
public class GuiItemShop extends GuiScreen {

	/** The player being traded with. */
	private EntityPlayer customer;

	private String displayName;

	private int xSize, ySize;
	private int guiLeft, guiTop;
	private int tabWidth, tabHeight;
	private int xOffset = 14;

	private static final ItemStack MINERAL = new ItemStack(ItemHandler.MINERAL_SHARD);
	private static final ItemStack VESPENE = new ItemStack(ItemHandler.VESPENE, 1, 2);
	private static final int HIGHLIGHT_COLOR = new Color(246, 255, 0, 60).getRGB();
	private static final int NO_FUNDS_COLOR = new Color(200, 50, 0, 60).getRGB();

	public static List<Tab> tabs = new ArrayList<Tab>();
	private static int tab = 0;

	private static GuiButton buttonBuy;
	private static final int BUTTON_BUY = 0;

	private int selectedIndex = -1;

	public GuiItemShop(EntityPlayer player) {
		this(player, I18n.format("gui.item_shop"));
	}

	public GuiItemShop(EntityPlayer player, String displayName) {
		this.customer = player;
		this.displayName = displayName;
	}

	@Override
	public void initGui() {
		xSize = 152;
		ySize = 230;
		guiLeft = (width - xSize) / 2;
		guiTop = (height - ySize) / 2;

		tabWidth = 32;
		tabHeight = 28;

		tabs.clear();
		tabs.add(new Tab(new ItemStack(ItemHandler.BULLET, 1, 0), I18n.format("itemGroup.terran.general"), 0, guiLeft - 29, guiTop + 4, tabWidth, tabHeight));
		tabs.add(new Tab(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, 1), I18n.format("itemGroup.terran.machine"), 1, guiLeft - 29, guiTop + 34, tabWidth, tabHeight));
		tabs.add(new Tab(new ItemStack(MetaBlockHandler.PARISTEEL_METAL, 1, 0), I18n.format("itemGroup.terran.decoration"), 2, guiLeft - 29, guiTop + 64, tabWidth, tabHeight));
		tabs.add(new Tab(new ItemStack(ItemHandler.C14_GAUSS_RIFLE, 1, 0), I18n.format("itemGroup.terran.weapons"), 3, guiLeft - 29, guiTop + 94, tabWidth, tabHeight));
		tabs.add(new Tab(new ItemStack(ArmorHandler.COPPER_HELMET, 1, 0), I18n.format("itemGroup.terran.armors"), 4, guiLeft - 29, guiTop + 124, tabWidth, tabHeight));
		tabs.add(new Tab(new ItemStack(ToolHandler.COPPER_PICKAXE, 1, 0), I18n.format("itemGroup.terran.tools"), 5, guiLeft - 29, guiTop + 154, tabWidth, tabHeight));
		tab = 0;

		buttonList.clear();
		buttonBuy = new GuiButton(0, guiLeft + 105, guiTop + 120, 30, 20, I18n.format("gui.buy"));
		buttonList.add(buttonBuy);
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
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GlStateManager.enableRescaleNormal();
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

		for (Tab tab : tabs) {
			tab.renderLit(mouseX, mouseY);
			tab.renderIcon();
		}

		GlStateManager.translate((float) i, (float) j, 0.0F);
		drawCenterLayer(mouseX, mouseY);
		RenderHelper.disableStandardItemLighting();
		this.drawGuiForegroundLayer(mouseX, mouseY);
		GlStateManager.popMatrix();
		GlStateManager.enableLighting();
		GlStateManager.enableDepth();
		RenderHelper.enableStandardItemLighting();

		drawTooltips(mouseX, mouseY);
	}

	public void drawGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		for (Tab tab : tabs) {
			tab.renderUnlit(mouseX, mouseY);
		}

		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		bindGuiTexture();
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

		if (MINERAL.stackSize <= 0) {
			bindGuiTexture();
			this.drawTexturedModalRect(guiLeft + 105, guiTop + 91, 152, 0, 16, 16);
		}

		if (VESPENE.stackSize <= 0) {
			bindGuiTexture();
			this.drawTexturedModalRect(guiLeft + 123, guiTop + 91, 152, 0, 16, 16);
		}
	}

	public void drawCenterLayer(int mouseX, int mouseY) {
		if (selectedIndex != -1) {
			int selectedX = selectedIndex % 4;
			int selectedY = selectedIndex / 4;
			GlStateManager.color(0.1F, 0.1F, 0.1F, 0.1F);
			int xOffset = 25;
			int yOffset = 25;
			drawRect(xOffset + selectedX * 18, yOffset + selectedY * 22, xOffset + (selectedX * 18) + 16, yOffset + (selectedY * 22) + 16, HIGHLIGHT_COLOR);
		}

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				int index = 4 * i + j;
				if (index < GuiStuff.TRADES[tab].size()) {
					if (index != selectedIndex && (InventoryUtil.getItemAmount(customer, MINERAL) < GuiStuff.TRADES[tab].get(index).getMineralCost() || InventoryUtil.getItemAmount(customer, VESPENE.getItem()) < GuiStuff.TRADES[tab].get(index).getVespeneCost())) {
						int selectedX = index % 4;
						int selectedY = index / 4;
						GlStateManager.color(0.1F, 0.1F, 0.1F, 0.1F);
						int xOffset = 25;
						int yOffset = 25;
						drawRect(xOffset + selectedX * 18, yOffset + selectedY * 22, xOffset + (selectedX * 18) + 16, yOffset + (selectedY * 22) + 16, NO_FUNDS_COLOR);
					}
					Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(GuiStuff.TRADES[tab].get(index).getStack(), 25 + j * 18, 25 + i * 22);
					Minecraft.getMinecraft().getRenderItem().renderItemOverlays(mc.fontRendererObj, GuiStuff.TRADES[tab].get(index).getStack(), 25 + j * 18, 25 + i * 22);
				}
			}
		}
	}

	public void drawGuiForegroundLayer(int mouseX, int mouseY) {
		this.fontRendererObj.drawString(displayName, xSize / 2 - this.fontRendererObj.getStringWidth(displayName) / 2, 8, 4210752);
		this.fontRendererObj.drawString(I18n.format("gui.item_shop.money"), 123 - this.fontRendererObj.getStringWidth(I18n.format("gui.item_shop.money")) / 2, 75, 4210752);

		MINERAL.stackSize = InventoryUtil.getItemAmount(customer, MINERAL);
		VESPENE.stackSize = InventoryUtil.getItemAmount(customer, VESPENE);

		if (MINERAL.stackSize > 0) {
			Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(MINERAL, 105, 91);
			Minecraft.getMinecraft().getRenderItem().renderItemOverlays(mc.fontRendererObj, MINERAL, 105, 91);
		}

		if (VESPENE.stackSize > 0) {
			Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(VESPENE, 123, 91);
			Minecraft.getMinecraft().getRenderItem().renderItemOverlays(mc.fontRendererObj, VESPENE, 123, 91);
		}
	}

	public void drawTooltips(int mouseX, int mouseY) {
		for (Tab tab : tabs) {
			drawTooltip(tab.getName(), tab.getX(), tab.getY(), tab.getWidth(), tab.getHeight(), mouseX, mouseY);
		}

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				int index = 4 * i + j;
				if (index < GuiStuff.TRADES[tab].size()) {
					List<String> tooltip = GuiStuff.TRADES[tab].get(index).getStack().getTooltip(customer, this.mc.gameSettings.advancedItemTooltips);
					tooltip.add("");
					tooltip.add(TextFormatting.GRAY + I18n.format("gui.item_shop.tooltip.mineral_cost", GuiStuff.TRADES[tab].get(index).getMineralCost()));
					tooltip.add(TextFormatting.GRAY + I18n.format("gui.item_shop.tooltip.vespene_cost", GuiStuff.TRADES[tab].get(index).getVespeneCost()));
					drawTooltip(tooltip, guiLeft + 25 + j * 18, guiTop + 25 + i * 22, 16, 16, mouseX, mouseY);
				}
			}
		}

		if (MINERAL.stackSize <= 0) {
			drawTooltip(I18n.format("gui.item_shop.no_minerals"), guiLeft + 105, guiTop + 91, 16, 16, mouseX, mouseY);
		} else {
			drawTooltip(MINERAL.getTooltip(customer, this.mc.gameSettings.advancedItemTooltips), guiLeft + 105, guiTop + 91, 16, 16, mouseX, mouseY);
		}

		if (VESPENE.stackSize <= 0) {
			drawTooltip(I18n.format("gui.item_shop.no_vespene"), guiLeft + 123, guiTop + 91, 16, 16, mouseX, mouseY);
		} else {
			drawTooltip(VESPENE.getTooltip(customer, this.mc.gameSettings.advancedItemTooltips), guiLeft + 123, guiTop + 91, 16, 16, mouseX, mouseY);
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
					if (index < GuiStuff.TRADES[tab].size()) {
						if (GuiUtils.isMouseInside(guiLeft + 25 + x * 18, guiTop + 25 + y * 22, 16, 16, mouseX, mouseY)) {
							this.selectedIndex = index;
							GuiUtils.playButtonClick();
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
		if (selectedIndex == -1 || InventoryUtil.getItemAmount(customer, MINERAL) < GuiStuff.TRADES[tab].get(selectedIndex).getMineralCost() || InventoryUtil.getItemAmount(customer, VESPENE.getItem()) < GuiStuff.TRADES[tab].get(selectedIndex).getVespeneCost()) {
			buttonBuy.enabled = false;
		} else {
			buttonBuy.enabled = true;
		}

		for (Tab tab : tabs) {
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
			if (selectedIndex != -1 && InventoryUtil.getItemAmount(customer, MINERAL) >= GuiStuff.TRADES[tab].get(selectedIndex).getMineralCost() && InventoryUtil.getItemAmount(customer, VESPENE.getItem()) >= GuiStuff.TRADES[tab].get(selectedIndex).getVespeneCost()) {
				NetworkHandler.sendToServer(new MessageSpawnItem(GuiStuff.TRADES[tab].get(selectedIndex).getStack()));
				InventoryUtil.removeItemWithAmount(customer, MINERAL.getItem(), GuiStuff.TRADES[tab].get(selectedIndex).getMineralCost());
				InventoryUtil.removeItemWithAmount(customer, VESPENE.getItem(), GuiStuff.TRADES[tab].get(selectedIndex).getVespeneCost());
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

	public void drawTooltip(List<String> lines, int posX, int posY, int width, int height, int mouseX, int mouseY) {
		if (mouseX >= posX && mouseX <= (posX + width) && mouseY >= posY && mouseY < (posY + height)) {
			drawHoveringText(lines, mouseX, mouseY);
		}
	}

	public void drawTooltip(String line, float posX, float posY, float width, float height, int mouseX, int mouseY) {
		if (mouseX >= posX && mouseX <= (posX + width) && mouseY >= posY && mouseY < (posY + height)) {
			List<String> lines = new ArrayList<String>();
			lines.add(line);
			drawHoveringText(lines, mouseX, mouseY);
		}
	}

	public void bindGuiTexture() {
		GuiUtils.bindTexture("textures/gui/item_shop.png");
	}
}