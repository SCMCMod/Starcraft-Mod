package ga.scmc.blocks;

import ga.scmc.handlers.TeleporterHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockDimPortalOverworld extends BlockDimPortal {

	private int dim = 0;

	public BlockDimPortalOverworld() {
		setUnlocalizedName("overworldDimPortal");
		setRegistryName("overworld_dim_portal");
	}

	/**
	 * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
	 */
	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		if (!entity.isRiding() && !entity.isBeingRidden() && !world.isRemote) {

			try {
				EntityPlayerMP player = (EntityPlayerMP) entity;
				if (player.dimension != dim) {
					player.getServer().getPlayerList().transferPlayerToDimension(player, dim, new TeleporterHandler(player.mcServer.worldServerForDimension(dim), player.posX, player.posY, player.posZ));
				}
			} catch (ClassCastException e) {
				return; // Not a player
			}
		}
	}
}