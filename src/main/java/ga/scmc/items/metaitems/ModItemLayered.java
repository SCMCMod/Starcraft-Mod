package ga.scmc.items.metaitems;

import ga.scmc.blocks.metablocks.ModBlockLayered;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 */
public class ModItemLayered extends ItemBlock {

	public ModItemLayered(Block block) {
		super(block);
	}

	@Override
	public boolean canPlaceBlockOnSide(World world, BlockPos pos, EnumFacing side, EntityPlayer player, ItemStack stack) {
		IBlockState state = world.getBlockState(pos);
		return (!(state.getBlock() instanceof ModBlockLayered) || (state.getValue(ModBlockLayered.LAYERS)) > 7) ? super.canPlaceBlockOnSide(world, pos, side, player, stack) : true;
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		if(stack.stackSize != 0 && playerIn.canPlayerEdit(pos, facing, stack)) {
			IBlockState iblockstate = worldIn.getBlockState(pos);
			Block block = iblockstate.getBlock();
			BlockPos blockpos = pos;

			if((facing != EnumFacing.UP || block != this.block) && !block.isReplaceable(worldIn, pos)) {
				blockpos = pos.offset(facing);
				iblockstate = worldIn.getBlockState(blockpos);
				block = iblockstate.getBlock();
			}

			if(block == this.block) {
				int i = iblockstate.getValue(ModBlockLayered.LAYERS).intValue();

				if(i <= 7) {
					IBlockState iblockstate1 = iblockstate.withProperty(ModBlockLayered.LAYERS, Integer.valueOf(i + 1));
					AxisAlignedBB axisalignedbb = iblockstate1.getCollisionBoundingBox(worldIn, blockpos);

					if(axisalignedbb != Block.NULL_AABB && worldIn.checkNoEntityCollision(axisalignedbb.offset(blockpos))
							&& worldIn.setBlockState(blockpos, iblockstate1, 10)) {
						SoundType soundtype = this.block.getSoundType(iblockstate1, worldIn, blockpos, playerIn);
						worldIn.playSound(playerIn, blockpos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F,
								soundtype.getPitch() * 0.8F);
						--stack.stackSize;
						return EnumActionResult.SUCCESS;
					}
				}
			}

			return super.onItemUse(stack, playerIn, worldIn, blockpos, hand, facing, hitX, hitY, hitZ);
		} else {
			return EnumActionResult.FAIL;
		}
	}
}
