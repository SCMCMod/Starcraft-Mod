package ga.scmc.items.metaitems;

import java.util.List;

import com.arisux.mdx.lib.world.entity.player.inventory.Inventories;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.enums.EnumMetaItem;
import ga.scmc.enums.EnumMetaItem.BulletMagazineType;
import ga.scmc.handlers.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * @author Ocelot5836
 */
public class ItemBulletMagazine extends Item {

	public ItemBulletMagazine() {
		setUnlocalizedName("terran.magazine");
		setRegistryName("terran.magazine");
		setHasSubtypes(true);
		setMaxStackSize(1);
		setMaxDamage(0);
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
		if (stack.hasTagCompound()) {
			NBTTagCompound nbt = stack.getTagCompound();
			tooltip.add(nbt.getInteger("BulletCount") + "/" + nbt.getInteger("BulletCapacity") + " Ammo");
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {
		return super.onItemRightClick(stack, world, player, hand);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for (int i = 0; i < BulletMagazineType.values().length; i++) {
			ItemStack stack = new ItemStack(item, 1, i);
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setInteger("BulletCount", EnumMetaItem.BulletMagazineType.values()[i].getBulletCount());
			nbt.setInteger("BulletCapacity", EnumMetaItem.BulletMagazineType.values()[i].getBulletCount());
			stack.setTagCompound(nbt);
			items.add(stack);
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < BulletMagazineType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + BulletMagazineType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + BulletMagazineType.C14.getName();
	}

	@Override
	public double getDurabilityForDisplay(ItemStack stack) {
		if (stack.hasTagCompound()) {
			NBTTagCompound nbt = stack.getTagCompound();
			return 1 - ((double) nbt.getInteger("BulletCount") / (double) nbt.getInteger("BulletCapacity"));
		}
		return super.getDurabilityForDisplay(stack);
	}

	@Override
	public boolean showDurabilityBar(ItemStack stack) {
		return true;
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
		if (!stack.hasTagCompound()) {
			stack = getDefaultStack(stack.getMetadata());
		}
		
		if (entity instanceof EntityPlayer) {
			if (stack.getTagCompound().getInteger("BulletCount") <= 0) {
				Inventories.consumeItem((EntityPlayer) entity, stack.getItem());
			}
		}
	}

	public ItemStack getDefaultStack(int type) {
		ItemStack stack = new ItemStack(ItemHandler.BULLET_MAGAZINE, 1, type);
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("BulletCount", EnumMetaItem.BulletMagazineType.values()[type].getBulletCount());
		nbt.setInteger("BulletCapacity", EnumMetaItem.BulletMagazineType.values()[type].getBulletCount());
		stack.setTagCompound(nbt);
		return stack;
	}

	/**
	 * If the specified stack is a bullet magazine, it will return the amount of bullets inside. If the specified stack is not a bullet magazine, it will return 0.
	 * 
	 * @param stack
	 *            The stack to get the count from
	 * @return The amount of bullets found in the magazine if the stack is one
	 */
	public int getBulletCount(ItemStack stack) {
		int count = 0;
		if (stack != null && stack.hasTagCompound() && stack.getTagCompound().hasKey("BulletCount")) {
			count = stack.getTagCompound().getInteger("BulletCount");
		}
		return count;
	}
}