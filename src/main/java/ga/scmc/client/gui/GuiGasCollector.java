package ga.scmc.client.gui;

import java.util.ArrayList;
import java.util.List;

import ga.scmc.container.ContainerGasCollector;
import ga.scmc.enums.EnumMetaBlock.GasCollectorType;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.tileentity.TileEntityGasCollector;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import ocelot.api.utils.GuiUtils;
import ocelot.api.utils.TextureUtils;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 */
public class GuiGasCollector extends GuiContainer {

	private TileEntityGasCollector te;
	private IInventory playerInv;
	private IItemHandler itemHandler;

	private String[] names;

	public GuiGasCollector(EntityPlayer player, TileEntityGasCollector te) {
		super(new ContainerGasCollector(player, te));

		this.te = te;
		this.playerInv = player.inventory;
		this.itemHandler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
	}

	@Override
	public void initGui() {
		this.guiLeft = 175;
		this.guiTop = 165;
		names = new String[] { I18n.format("item.protoss_ingot.name") + "s", I18n.format(Blocks.PLANKS.getUnlocalizedName() + ".name"), I18n.format(ItemHandler.ORGANIC_TISSUE.getUnlocalizedName() + ".name") + "s" };
		super.initGui();
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		bindTexture();
		drawTexturedModalRect((width - xSize) / 2, (height - ySize) / 2, 0, 0, this.xSize, this.ySize);
		GlStateManager.color(1F, 1F, 1F, 1F);
		GlStateManager.pushMatrix();
		{
			GlStateManager.scale(0.5f, 0.5f, 0.5f);
			drawTexturedModalRect(((width / 2) + 46) * 2, ((height / 2) - 48) * 2, xSize, 0, 32, 32);
		}
		GlStateManager.popMatrix();
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
		if (itemHandler.getStackInSlot(9) == null) {
			bindTexture();
			String ss = "s";
			if (te.getType() == 1 || getRequiredFuel() == 1)
				ss = "";
			String s = TextFormatting.GRAY + I18n.format("gui.gas_collector." + GasCollectorType.values()[te.getType()] + ".fuel.tooltip", getRequiredFuel(), TextFormatting.DARK_GRAY + names[te.getType()] + TextFormatting.GRAY);
			drawTooltip(s, (width / 2) + 45, (height / 2) - 49, 17, 18, mouseX, mouseY);
		}
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		int color = 4210752;
		this.mc.fontRendererObj.drawString(I18n.format("gui.gas_collector." + GasCollectorType.values()[te.getType()]), this.xSize / 2 - this.mc.fontRendererObj.getStringWidth(I18n.format("gui.gas_collector." + GasCollectorType.values()[te.getType()])) / 2, 6, 4210752);
		this.mc.fontRendererObj.drawString(this.playerInv.getDisplayName().getFormattedText(), 8, 72, color);
	}

	public int getRequiredFuel() {
		ItemStack stack = itemHandler.getStackInSlot(9);
		if (stack != null) {
			if (stack.stackSize > 4) {
				return 0;
			} else {
				return stack.stackSize;
			}
		}
		return 4;
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	private void bindTexture() {
		TextureUtils.bindTexture("textures/gui/container/gas_collector_" + GasCollectorType.values()[te.getType()].getName() + ".png");
	}

	public void drawTooltip(List<String> lines, int posX, int posY, int width, int height, int mouseX, int mouseY) {
		if (GuiUtils.isMouseInside(posX, posY, width, height, mouseX, mouseY)) {
			drawHoveringText(lines, mouseX, mouseY);
		}
	}

	public void drawTooltip(String line, int posX, int posY, int width, int height, int mouseX, int mouseY) {
		if (GuiUtils.isMouseInside(posX, posY, width, height, mouseX, mouseY)) {
			List<String> lines = new ArrayList<String>();
			lines.add(line);
			drawHoveringText(lines, mouseX, mouseY);
		}
	}
}