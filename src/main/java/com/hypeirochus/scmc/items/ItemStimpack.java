package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemStimpack extends Item {

	public ItemStimpack() {
		setUnlocalizedName("stimpack");
		setRegistryName("stimpack");
		this.setMaxStackSize(1);
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer player, EnumHand hand) {
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 750));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(7), 1));
		player.inventory.decrStackSize(player.inventory.getSlotFor(itemStackIn), 1);
		return super.onItemRightClick(itemStackIn, worldIn, player, hand);
	}
}