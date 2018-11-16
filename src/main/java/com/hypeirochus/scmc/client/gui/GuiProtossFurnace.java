package com.hypeirochus.scmc.client.gui;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.container.ContainerProtossFurnace;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.network.NetworkHandler;
import com.hypeirochus.scmc.network.message.MessageGetFurnaceData;
import com.hypeirochus.scmc.tileentity.IProtossMachine;
import com.ocelot.api.utils.TextureUtils;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.items.IItemHandler;

/**
 * @author Ocelot5836
 */
public class GuiProtossFurnace extends GuiContainer
{

	public static final ResourceLocation TEXTURE = new ResourceLocation(Starcraft.RL_BASE + "textures/gui/container/protoss_furnace.png");

	private BlockPos pos;
	private EntityPlayer player;

	/**
	 * Used for synchronisation with the server
	 * 
	 * @author CJMinecraft
	 */
	public static float burnTime, cookTime;
	private int sync;

	/**
	 * Create a new gui for a starcraft furnace
	 *
	 * @param player The player for use inside the container
	 * @param furnaceInv The inventory of the furnace for use inside the container
	 * @param worldType The type of furnace this is (used for getting the texture)
	 * @param pos The position of the furnace tile entity
	 */
	public GuiProtossFurnace(EntityPlayer player, IItemHandler furnaceInv, BlockPos pos)
	{
		super(new ContainerProtossFurnace(player, furnaceInv));
		this.pos = pos;
		this.player = player;
		setGuiSize(175, 165);
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks)
	{
		drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
		renderHoveredToolTip(mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float v, int i, int i1)
	{
		GlStateManager.color(1F, 1F, 1F, 1F);
		TextureUtils.bindTexture(TEXTURE);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);

		NetworkHandler.sendToServer(new MessageGetFurnaceData(this.pos, "com.hypeirochus.scmc.client.gui.GuiProtossFurnace", "burnTime", "cookTime"));

		this.drawTexturedModalRect(this.guiLeft + 80, this.guiTop + 35, 176, 0, (int) (cookTime * 24.0F), 17);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
	{
		String title = Item.getItemFromBlock(BlockHandler.FURNACE_PROTOSS).getItemStackDisplayName(new ItemStack(BlockHandler.FURNACE_PROTOSS, 1, 0));
		String hasPylons = "Active: N/A";
		if (player.world.getTileEntity(pos) instanceof IProtossMachine)
			hasPylons = ((IProtossMachine) player.world.getTileEntity(pos)).hasPylons() ? "Active: " + TextFormatting.BLUE + "true" : "Active: " + TextFormatting.DARK_RED + "false";
		this.fontRenderer.drawString(title, this.xSize / 2 - this.fontRenderer.getStringWidth(title) / 2, 7, 4210752);
		this.fontRenderer.drawString(hasPylons, this.xSize / 2 - this.fontRenderer.getStringWidth(hasPylons) / 2, 70, 4210752);
	}
}
