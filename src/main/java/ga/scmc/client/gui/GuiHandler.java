package ga.scmc.client.gui;

import ga.scmc.Starcraft;
import ga.scmc.container.ContainerGasCollector;
import ga.scmc.tileentity.TileEntityGasCollector;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
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

	public static final int GAS_COLLECTOR_ID = 0;
	public static final int SHOP_ID = 1;
	public static final int LARVA_ID = 2;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == GAS_COLLECTOR_ID)
			return new ContainerGasCollector(player, (TileEntityGasCollector) world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == GAS_COLLECTOR_ID)
			return new GuiGasCollector(player, (TileEntityGasCollector) world.getTileEntity(new BlockPos(x, y, z)));
		if (ID == SHOP_ID)
			return new GuiItemShop(player);
		if (ID == LARVA_ID)
			return new GuiLarva(player);
		return null;
	}

	/**
	 * Registers the GUI handler to the network using {@link NetworkRegistry}.
	 */
	public static void init() {
		NetworkRegistry.INSTANCE.registerGuiHandler(Starcraft.instance, GuiHandler.INSTANCE);
	}
}