package ga.scmc.blocks;

import ga.scmc.tileentity.TileEntityProtossPowerCore;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ProtossPowerCoreBlock extends StarcraftProtossCoreBlock implements ITileEntityProvider {

	public ProtossPowerCoreBlock(String name, Material material, MapColor color) {
		super(name, RegistryType.FULL, material, color);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityProtossPowerCore();
	}
}