package io.github.scmcmod.handlers;

import io.github.scmcmod.Starcraft;
import io.github.scmcmod.client.gui.GuiGasCollector;
import io.github.scmcmod.client.gui.GuiItemShop;
import io.github.scmcmod.client.gui.GuiLarvaMorph;
import io.github.scmcmod.client.gui.GuiLarvaProgress;
import io.github.scmcmod.client.gui.GuiPlayerMessage;
import io.github.scmcmod.client.gui.GuiPlayerMessage.EnumPlayerMessageType;
import io.github.scmcmod.client.gui.GuiProtossFurnace;
import io.github.scmcmod.client.gui.GuiStarcraftFurnace;
import io.github.scmcmod.container.ContainerGasCollector;
import io.github.scmcmod.container.ContainerProtossFurnace;
import io.github.scmcmod.container.ContainerStarcraftFurnace;
import io.github.scmcmod.enums.EnumWorldType;
import io.github.scmcmod.tileentity.TileEntityGasCollector;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.items.CapabilityItemHandler;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * Creates a container and a GUI if a block has one when the player opens a
 * GUI/Container.
 * 
 * @author Ocelot5836
 */
public class GuiHandler implements IGuiHandler
{

	/** The instance of Starcraft's GUI handler class */
	public static final GuiHandler INSTANCE = new GuiHandler();

	public static final int TEST_ID = -1;
	public static final int GAS_COLLECTOR_ID = 0;
	public static final int SHOP_ID = 1;
	public static final int LARVA_MORPH_ID = 2;
	public static final int LARVA_PROGRESS_ID = 3;
	public static final int LOG = 4;
	public static final int PLAYER_MESSAGE = 5;

	public static final int CHAR_FURNACE = 6;
	public static final int SHAKURAS_FURNACE = 7;
	public static final int SLAYN_FURNACE = 8;
	public static final int ZERUS_FURNACE = 9;
	public static final int PROTOSS_FURNACE = 10;

	/**
	 * Registers the GUI handler to the network using {@link NetworkRegistry}.
	 */
	public static void init(FMLInitializationEvent event)
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Starcraft.instance, GuiHandler.INSTANCE);
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity te = world.getTileEntity(new BlockPos(x, y, z));
		if (ID == GAS_COLLECTOR_ID)
			return new ContainerGasCollector(player, (TileEntityGasCollector) te);
		if (ID == CHAR_FURNACE || ID == SHAKURAS_FURNACE || ID == SLAYN_FURNACE || ID == ZERUS_FURNACE)
			return new ContainerStarcraftFurnace(player, te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null));
		if (ID == PROTOSS_FURNACE)
			return new ContainerProtossFurnace(player, te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		BlockPos pos = new BlockPos(x, y, z);
		TileEntity te = world.getTileEntity(pos);
		if (ID == GAS_COLLECTOR_ID)
			return new GuiGasCollector(player, (TileEntityGasCollector) te);
		if (ID == SHOP_ID)
			return new GuiItemShop(player);
		if (ID == LARVA_MORPH_ID)
			return new GuiLarvaMorph();
		if (ID == LARVA_PROGRESS_ID)
			return new GuiLarvaProgress();
		if (ID == PLAYER_MESSAGE)
			return new GuiPlayerMessage(EnumPlayerMessageType.values()[x & EnumPlayerMessageType.values().length - 1]);
		if (ID == CHAR_FURNACE)
			return new GuiStarcraftFurnace(player, te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null), EnumWorldType.CHAR, pos);
		if (ID == SHAKURAS_FURNACE)
			return new GuiStarcraftFurnace(player, te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null), EnumWorldType.SHAKURAS, pos);
		if (ID == SLAYN_FURNACE)
			return new GuiStarcraftFurnace(player, te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null), EnumWorldType.SLAYN, pos);
		if (ID == ZERUS_FURNACE)
			return new GuiStarcraftFurnace(player, te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null), EnumWorldType.ZERUS, pos);
		if (ID == PROTOSS_FURNACE)
			return new GuiProtossFurnace(player, te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null), pos);
		return null;
	}
}