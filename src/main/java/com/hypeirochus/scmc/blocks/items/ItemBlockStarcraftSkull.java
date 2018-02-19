package com.hypeirochus.scmc.blocks.items;

import com.hypeirochus.scmc.blocks.BlockStarcraftSkull;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.tileentity.TileEntityStarcraftSkull;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBlockStarcraftSkull extends ItemBlock {

	public ItemBlockStarcraftSkull() {
		super(BlockHandler.STARCRAFT_SKULL);
		setMaxDamage(0);
		setHasSubtypes(true);
	}

	@SideOnly(Side.CLIENT)
	public EntityEquipmentSlot getEquipmentSlot() {
		return EntityEquipmentSlot.HEAD;
	}

	@Override
	public boolean isValidArmor(ItemStack stack, EntityEquipmentSlot armorType, Entity entity) {
		return armorType == this.getEquipmentSlot() ? true : super.isValidArmor(stack, armorType, entity);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack stack = player.getHeldItem(hand);
		if (facing == EnumFacing.DOWN) {
			return EnumActionResult.FAIL;
		} else {
			if (world.getBlockState(pos).getBlock().isReplaceable(world, pos)) {
				facing = EnumFacing.UP;
				pos = pos.down();
			}
			IBlockState iblockstate = world.getBlockState(pos);
			Block block = iblockstate.getBlock();
			boolean flag = block.isReplaceable(world, pos);

			if (!flag) {
				if (!world.getBlockState(pos).getMaterial().isSolid() && !world.isSideSolid(pos, facing, true)) {
					return EnumActionResult.FAIL;
				}

				pos = pos.offset(facing);
			}

			if (player.canPlayerEdit(pos, facing, stack) && BlockHandler.STARCRAFT_SKULL.canPlaceBlockAt(world, pos)) {
				if (world.isRemote) {
					return EnumActionResult.SUCCESS;
				} else {
					world.setBlockState(pos, BlockHandler.STARCRAFT_SKULL.getDefaultState().withProperty(BlockStarcraftSkull.FACING, facing), 11);
					int i = 0;

					if (facing == EnumFacing.UP) {
						i = MathHelper.floor((double) (player.rotationYaw * 16.0F / 360.0F) + 0.5D) & 15;
					}

					TileEntity tileentity = world.getTileEntity(pos);

					if (tileentity instanceof TileEntityStarcraftSkull) {
						TileEntityStarcraftSkull tileentityskull = (TileEntityStarcraftSkull) tileentity;

						tileentityskull.setType(stack.getMetadata());
						tileentityskull.setSkullRotation(i);
					}

					stack.shrink(1);
					return EnumActionResult.SUCCESS;
				}
			} else {
				return EnumActionResult.FAIL;
			}
		}
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (isInCreativeTab(tab)) {
			for (int i = 0; i < BlockStarcraftSkull.EnumSkullType.values().length; ++i) {
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		int i = stack.getMetadata();

		if (i < 0 || i >= BlockStarcraftSkull.EnumSkullType.values().length) {
			i = 0;
		}

		return super.getUnlocalizedName() + "." + BlockStarcraftSkull.EnumSkullType.values()[i];
	}
}