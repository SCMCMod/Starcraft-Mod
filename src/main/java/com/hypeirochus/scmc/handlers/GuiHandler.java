package com.hypeirochus.scmc.handlers;

import com.hypeirochus.scmc.Starcraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Creates a container and a GUI if a block has one when the player opens a GUI/Container.
 * 
 * @author Ocelot5836
 */
public class GuiHandler implements IGuiHandler {

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
	public static void init(FMLInitializationEvent event) {
		NetworkRegistry.INSTANCE.registerGuiHandler(Starcraft.instance, GuiHandler.INSTANCE);
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(new BlockPos(x, y, z));

		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		TileEntity te = world.getTileEntity(pos);

		return null;
	}
}