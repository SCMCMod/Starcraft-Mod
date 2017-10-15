package ga.scmc.items.weapons;

import com.arisux.mdx.lib.world.entity.player.inventory.Inventories;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class WeaponBalisong extends ItemSword {

	public WeaponBalisong(ToolMaterial material) {
		super(material);
		setUnlocalizedName("balisong");
		setRegistryName("balisong");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
	
	public void checkCanReplace(EntityPlayer player, ItemStack stack) {
		Inventories.consumeItem(player, stack.getItem());
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if(stack.getItemDamage() > 99) {
			checkCanReplace((EntityPlayer)entityIn, stack);
		}
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
	
	@Override
	public int getMaxDamage() {
		return 100;
	}
}