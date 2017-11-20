package ga.scmc.blocks;

import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.TeleporterHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockDimPortalKorhal extends BlockDimPortal {

	public BlockDimPortalKorhal() {
		super(ConfigurationHandler.INT_DIMENSION_KORHAL);
		setUnlocalizedName("korhal.portal");
		setRegistryName("korhal.portal");
	}
}