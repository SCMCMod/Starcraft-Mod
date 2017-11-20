package ga.scmc.blocks;

import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.TeleporterHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockDimPortalKaldir extends BlockDimPortal {

	public BlockDimPortalKaldir() {
		super(ConfigurationHandler.INT_DIMENSION_KALDIR);
		setUnlocalizedName("kaldir.portal");
		setRegistryName("kaldir.portal");
	}
}