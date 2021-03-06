package io.github.scmcmod.items;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemStimpack extends SCItem
{

	public ItemStimpack()
	{
		super("stimpack");
		setMaxStackSize(1);
		setCreativeTab(SCCreativeTabs.TERRAN);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
	{
		if (!world.isRemote)
		{
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 750));
			player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 1));
			player.getHeldItem(hand).shrink(1);
		}
		return super.onItemRightClick(world, player, hand);
	}
}