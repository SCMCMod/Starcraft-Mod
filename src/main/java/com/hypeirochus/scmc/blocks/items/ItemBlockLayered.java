package com.hypeirochus.scmc.blocks.items;

import com.hypeirochus.scmc.blocks.StarcraftBlockLayered;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
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
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * Allows a layered block to be placed on itself and layer like snow.
 * 
 * @author Ocelot5836
 */
//TODO: MOVE TO CORE MOD
public class ItemBlockLayered extends ItemBlock
{

	public ItemBlockLayered(StarcraftBlockLayered block)
	{
		super(block);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		ItemStack itemstack = player.getHeldItem(hand);

		if (!itemstack.isEmpty() && player.canPlayerEdit(pos, facing, itemstack))
		{
			IBlockState iblockstate = world.getBlockState(pos);
			Block block = iblockstate.getBlock();
			BlockPos blockpos = pos;

			if ((facing != EnumFacing.UP || block != this.block) && !block.isReplaceable(world, pos))
			{
				blockpos = pos.offset(facing);
				iblockstate = world.getBlockState(blockpos);
				block = iblockstate.getBlock();
			}

			if (block == this.block)
			{
				int i = ((Integer) iblockstate.getValue(StarcraftBlockLayered.LAYERS)).intValue();

				if (i < 8)
				{
					IBlockState iblockstate1 = iblockstate.withProperty(StarcraftBlockLayered.LAYERS, Integer.valueOf(i + 1));
					AxisAlignedBB axisalignedbb = iblockstate1.getCollisionBoundingBox(world, blockpos);

					if (axisalignedbb != Block.NULL_AABB && world.checkNoEntityCollision(axisalignedbb.offset(blockpos)) && world.setBlockState(blockpos, iblockstate1, 10))
					{
						SoundType soundtype = this.block.getSoundType(iblockstate1, world, pos, player);
						world.playSound(player, blockpos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);

						if (player instanceof EntityPlayerMP)
						{
							CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP) player, pos, itemstack);
						}

						itemstack.shrink(1);
						return EnumActionResult.SUCCESS;
					}
				}
			}

			return super.onItemUse(player, world, pos, hand, facing, hitX, hitY, hitZ);
		} else
		{
			return EnumActionResult.FAIL;
		}
	}

	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}

	@Override
	public boolean canPlaceBlockOnSide(World world, BlockPos pos, EnumFacing side, EntityPlayer player, ItemStack stack)
	{
		IBlockState state = world.getBlockState(pos);
		return (state.getBlock() != this.block || ((Integer) state.getValue(StarcraftBlockLayered.LAYERS)) > 7) ? super.canPlaceBlockOnSide(world, pos, side, player, stack) : true;
	}
}