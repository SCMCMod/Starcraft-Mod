package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.enums.EnumMetaItem;
import ga.scmc.enums.EnumMetaItem.BulletMagazineType;
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
			tooltip.add(nbt.getInteger("BulletCount") + " Count");
			tooltip.add(nbt.getInteger("BulletCapacity") + " Capacity");
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
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setInteger("BulletCount", EnumMetaItem.BulletMagazineType.values()[stack.getItemDamage()].getBulletCount());
			nbt.setInteger("BulletCapacity", EnumMetaItem.BulletMagazineType.values()[stack.getItemDamage()].getBulletCount());
			stack.setTagCompound(nbt);
		}
	}
}