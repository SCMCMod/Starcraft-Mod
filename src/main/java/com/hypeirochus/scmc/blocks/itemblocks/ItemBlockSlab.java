package com.hypeirochus.scmc.blocks.itemblocks;

import com.hypeirochus.scmc.blocks.StarcraftSlab;

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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBlockSlab extends ItemBlock {

	public ItemBlockSlab(StarcraftSlab slab) {
		super(slab);
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (stack.stackSize != 0 && playerIn.canPlayerEdit(pos.offset(facing), facing, stack)) {
			IBlockState iblockstate = worldIn.getBlockState(pos);

			if (iblockstate.getBlock() == this.block) {
				StarcraftSlab.Part half = (StarcraftSlab.Part) iblockstate.getValue(StarcraftSlab.PART);

				if ((facing == EnumFacing.UP && half == StarcraftSlab.Part.BOTTOM) || (facing == EnumFacing.DOWN && half == StarcraftSlab.Part.TOP)) {
					IBlockState iblockstate1 = block.getDefaultState().withProperty(StarcraftSlab.PART, StarcraftSlab.Part.FULL);
					AxisAlignedBB axisalignedbb = block.getDefaultState().withProperty(StarcraftSlab.PART, half).getCollisionBoundingBox(worldIn, pos);

					if (axisalignedbb != Block.NULL_AABB && worldIn.checkNoEntityCollision(axisalignedbb.offset(pos)) && worldIn.setBlockState(pos, iblockstate1, 11)) {
						SoundType soundtype = this.block.getSoundType(iblockstate1, worldIn, pos, playerIn);
						worldIn.playSound(playerIn, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
						--stack.stackSize;
					}

					return EnumActionResult.SUCCESS;
				}
			}

			return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
		} else {
			return EnumActionResult.FAIL;
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side, EntityPlayer player, ItemStack stack) {
		BlockPos blockpos = pos;
		IBlockState iblockstate = worldIn.getBlockState(pos);

		if (iblockstate.getBlock() == this.block) {
			boolean flag = iblockstate.getValue(StarcraftSlab.PART) == StarcraftSlab.Part.TOP;

			if (side == EnumFacing.UP && !flag || side == EnumFacing.DOWN && flag) {
				return true;
			}
		}

		pos = pos.offset(side);
		IBlockState iblockstate1 = worldIn.getBlockState(pos);
		return iblockstate1.getBlock() == this.block ? iblockstate1.getValue(StarcraftSlab.PART) != StarcraftSlab.Part.FULL : super.canPlaceBlockOnSide(worldIn, blockpos, side, player, stack);
	}

	private boolean tryPlace(EntityPlayer player, ItemStack stack, World worldIn, BlockPos pos) {
		IBlockState iblockstate = worldIn.getBlockState(pos);

		if (iblockstate.getBlock() == this.block) {
			IBlockState iblockstate1 = block.getDefaultState().withProperty(StarcraftSlab.PART, StarcraftSlab.Part.FULL);
			AxisAlignedBB axisalignedbb = iblockstate1.getCollisionBoundingBox(worldIn, pos);

			if (axisalignedbb != Block.NULL_AABB && worldIn.checkNoEntityCollision(axisalignedbb.offset(pos)) && worldIn.setBlockState(pos, iblockstate1, 11)) {
				SoundType soundtype = this.block.getSoundType(iblockstate1, worldIn, pos, player);
				worldIn.playSound(player, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
				--stack.stackSize;
			}

			return true;
		}

		return false;
	}
}