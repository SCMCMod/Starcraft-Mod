package ga.scmc.client.gui;

import ga.scmc.Starcraft;
import ga.scmc.container.ContainerGasCollector;
import ga.scmc.container.ContainerStarcraftFurnace;
import ga.scmc.enums.EnumMetaBlock;
import ga.scmc.enums.EnumWorldType;
import ga.scmc.tileentity.TileEntityGasCollector;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.items.CapabilityItemHandler;

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

	public static final int GAS_COLLECTOR_ID = 0;
	public static final int SHOP_ID = 1;
	public static final int LARVA_ID = 2;

	public static final int CHAR_FURNACE = 3;
	public static final int SHAKURAS_FURNACE = 4;
	public static final int SLAYN_FURNACE = 5;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(new BlockPos(x, y, z));
		if (ID == GAS_COLLECTOR_ID)
			return new ContainerGasCollector(player, (TileEntityGasCollector) te);
		if (ID == CHAR_FURNACE || ID == SHAKURAS_FURNACE || ID == SLAYN_FURNACE)
			return new ContainerStarcraftFurnace(player, te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(new BlockPos(x, y, z));
		if (ID == GAS_COLLECTOR_ID)
			return new GuiGasCollector(player, (TileEntityGasCollector) te);
		if (ID == SHOP_ID)
			return new GuiItemShop(player);
		if (ID == LARVA_ID)
			return new GuiLarvaMorph(player);
		if (ID == CHAR_FURNACE)
			return new GuiStarcraftFurnace(player, te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null), EnumWorldType.CHAR);
		if (ID == SHAKURAS_FURNACE)
			return new GuiStarcraftFurnace(player, te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null), EnumWorldType.SHAKURAS);
		if (ID == SLAYN_FURNACE)
			return new GuiStarcraftFurnace(player, te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null), EnumWorldType.SLAYN);
		return null;
	}

	/**
	 * Registers the GUI handler to the network using {@link NetworkRegistry}.
	 */
	public static void init() {
		NetworkRegistry.INSTANCE.registerGuiHandler(Starcraft.instance, GuiHandler.INSTANCE);
	}
}