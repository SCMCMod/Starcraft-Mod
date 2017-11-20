package ga.scmc.blocks;

import ga.scmc.handlers.TeleporterHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockDimPortalOverworld extends BlockDimPortal {

	public BlockDimPortalOverworld() {
		super(0);
		setUnlocalizedName("overworld.portal");
		setRegistryName("overworld.portal");
	}
}