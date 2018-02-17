package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemC14GaussRifle extends StarcraftItem {

	public ItemC14GaussRifle() {
		super("terran.riflec14");
		setFull3D();
		setMaxStackSize(1);
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		if (this.hasAmmo(world, player)) {
			if (!world.isRemote) {
				player.world.playSound(null, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), SoundHandler.FX_C14GAUSSRIFLE_FIRING, SoundCategory.PLAYERS, 0.4F, 1.5F);
				// TODO use rays to fire weapons
				// EntityC14GaussRifleBullet projectile = new EntityC14GaussRifleBullet(world, player);
				// projectile.setThrowableHeading(projectile.motionX, projectile.motionY, projectile.motionZ, 5F, 0F);
				// world.spawnEntity(projectile);
			}
		} else if (!this.hasAmmo(world, player)) {
			player.world.playSound(null, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), SoundHandler.FX_C14GAUSSRIFLE_OUT, SoundCategory.PLAYERS, 0.4F, 0.4F / (itemRand.nextFloat() * 0.5F + 0.8F));
		}
		return super.onItemRightClick(world, player, hand);
	}

	public boolean hasAmmo(World world, EntityPlayer player) {
		if (player.capabilities.isCreativeMode) {
			return true;
		}

		return true;
		// if (Inventories.playerHas(getAmmo(), player)) {
		// ItemStack ammoStack = player.inventory.mainInventory[InventoryUtils.getItemSlot(player, getAmmo(), EnumMetaItem.BulletMagazineType.C14.getID())];
		//
		// if (ammoStack != null && ammoStack.getItem() != null && ammoStack.getMetadata() == EnumMetaItem.BulletMagazineType.C14.getID() && ammoStack.hasTagCompound()) {
		// NBTTagCompound nbt = ammoStack.getTagCompound();
		// if (nbt.getInteger("BulletCount") >= 1) {
		// nbt.setInteger("BulletCount", nbt.getInteger("BulletCount") - 1);
		// }
		//
		// return true;
		// }
		// }
		// return false;
	}

	public ItemStack getAmmo() {
		return ItemStack.EMPTY;
	}
}
