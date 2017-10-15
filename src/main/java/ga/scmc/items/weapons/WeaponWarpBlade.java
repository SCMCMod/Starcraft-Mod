package ga.scmc.items.weapons;

import com.arisux.mdx.lib.world.entity.player.inventory.Inventories;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.ItemEnumHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.SoundHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class WeaponWarpBlade extends ItemSword {
	public WeaponWarpBlade(ToolMaterial material) {
		super(material);
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		player.world.playSound(null, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), SoundHandler.FX_WARPBLADE_ATTACK, SoundCategory.PLAYERS , 1.0F, 1.0F);
		return super.onLeftClickEntity(stack, player, entity);
	}
	
	public void checkCanReplace(EntityPlayer player, ItemStack stack) {
		Inventories.consumeItem(player, stack.getItem());
		player.inventory.addItemStackToInventory(new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, ItemEnumHandler.FocuserType.AIUR.getID()));
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if(stack.getItemDamage() > 74) {
			checkCanReplace((EntityPlayer)entityIn, stack);
		}
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
	
	@Override
	public int getMaxDamage() {
		return 75;
	}
}
