package com.hypeirochus.scmc.items;

import com.hypeirochus.api.world.entity.player.inventory.Inventories;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.ocelot.api.utils.InventoryUtils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemC14GaussRifle extends ItemWeapon {

	public ItemC14GaussRifle() {
		super("terran.riflec14", 5, 25);
		setFull3D();
		setMaxStackSize(1);
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	@Override
	public void shoot(EntityPlayer shooter) {
		super.shoot(shooter);
		shooter.world.playSound(null, shooter.getPosition().getX(), shooter.getPosition().getY(), shooter.getPosition().getZ(), SoundHandler.FX_C14GAUSSRIFLE_FIRING, SoundCategory.PLAYERS, 0.4F, 1.5F);
	}

	@Override
	public boolean hasAmmo(World world, EntityPlayer player, ItemStack stack) {
		if (Inventories.playerHas(getAmmo(world, player), player)) {
			ItemStack ammoStack = player.inventory.mainInventory.get(InventoryUtils.getItemSlot(player, getAmmo(world, player), MetaHandler.BulletMagazineType.C14.getID()));

			if (!ammoStack.isEmpty() && ammoStack.getMetadata() == MetaHandler.BulletMagazineType.C14.getID() && ammoStack.hasTagCompound()) {
				NBTTagCompound nbt = ammoStack.getTagCompound();
				return nbt.getInteger("BulletCount") >= 1;
			}
		}
		return false;
	}

	public Item getAmmo(World world, EntityPlayer player) {
		return ItemHandler.BULLET_MAGAZINE;
	}

	@Override
	public void takeAmmo(World world, EntityPlayer player, ItemStack stack) {
		ItemStack ammoStack = player.inventory.mainInventory.get(InventoryUtils.getItemSlot(player, getAmmo(world, player), MetaHandler.BulletMagazineType.C14.getID()));

		if (!ammoStack.isEmpty() && ammoStack.getMetadata() == MetaHandler.BulletMagazineType.C14.getID() && ammoStack.hasTagCompound()) {
			NBTTagCompound nbt = ammoStack.getTagCompound();
			if (nbt.getInteger("BulletCount") >= 1) {
				nbt.setInteger("BulletCount", nbt.getInteger("BulletCount") - 1);
			}
		}
	}
}
