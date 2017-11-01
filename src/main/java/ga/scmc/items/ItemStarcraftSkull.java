package ga.scmc.items;

import java.util.List;

import ga.scmc.blocks.skulls.BlockStarcraftSkull;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.enums.EnumMetaItem;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.tileentity.TileEntityStarcraftSkull;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Ocelot5836
 */
public class ItemStarcraftSkull extends ItemSkull {

	public ItemStarcraftSkull() {
		setUnlocalizedName("starcraftSkullItem");
		setRegistryName("starcraft_skull_item");
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setMaxDamage(0);
		setHasSubtypes(true);
	}

	@SideOnly(Side.CLIENT)
	public EntityEquipmentSlot getEquipmentSlot() {
		return EntityEquipmentSlot.HEAD;
	}

	@Override
	public boolean isValidArmor(ItemStack stack, EntityEquipmentSlot armorType, Entity entity) {
		return armorType == getEquipmentSlot();
	}

	/**
	 * Called when a Block is right-clicked with this Item
	 */
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (facing == EnumFacing.DOWN) {
			return EnumActionResult.FAIL;
		} else {
			if (worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos)) {
				facing = EnumFacing.UP;
				pos = pos.down();
			}
			IBlockState iblockstate = worldIn.getBlockState(pos);
			Block block = iblockstate.getBlock();
			boolean flag = block.isReplaceable(worldIn, pos);

			if (!flag) {
				if (!worldIn.getBlockState(pos).getMaterial().isSolid() && !worldIn.isSideSolid(pos, facing, true)) {
					return EnumActionResult.FAIL;
				}

				pos = pos.offset(facing);
			}

			if (playerIn.canPlayerEdit(pos, facing, stack) && BlockHandler.STARCRAFT_SKULL.canPlaceBlockAt(worldIn, pos)) {
				if (worldIn.isRemote) {
					return EnumActionResult.SUCCESS;
				} else {
					worldIn.setBlockState(pos, BlockHandler.STARCRAFT_SKULL.getDefaultState().withProperty(BlockStarcraftSkull.FACING, facing), 11);
					int i = 0;

					if (facing == EnumFacing.UP) {
						i = MathHelper.floor((double) (playerIn.rotationYaw * 16.0F / 360.0F) + 0.5D) & 15;
					}

					TileEntity tileentity = worldIn.getTileEntity(pos);

					if (tileentity instanceof TileEntityStarcraftSkull) {
						TileEntityStarcraftSkull tileentityskull = (TileEntityStarcraftSkull) tileentity;

						tileentityskull.setType(stack.getMetadata());
						tileentityskull.setSkullRotation(i);
					}

					--stack.stackSize;
					return EnumActionResult.SUCCESS;
				}
			} else {
				return EnumActionResult.FAIL;
			}
		}
	}

	/**
	 * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
	 */
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {
		for (int i = 0; i < EnumMetaItem.SkullType.values().length; ++i) {
			subItems.add(new ItemStack(itemIn, 1, i));
		}
	}

	/**
	 * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have different names based on their damage or NBT.
	 */
	public String getUnlocalizedName(ItemStack stack) {
		int i = stack.getMetadata();

		if (i < 0 || i >= EnumMetaItem.SkullType.values().length) {
			i = 0;
		}

		return super.getUnlocalizedName() + "." + EnumMetaItem.SkullType.values()[i];
	}
}