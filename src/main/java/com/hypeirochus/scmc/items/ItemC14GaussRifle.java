package com.hypeirochus.scmc.items;

import com.hypeirochus.api.world.entity.player.inventory.Inventories;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.AccessHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.ocelot.api.utils.InventoryUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemC14GaussRifle extends ItemGun {

	public ItemC14GaussRifle() {
		super("terran.riflec14", 6, 60);
		setFull3D();
		setMaxStackSize(1);
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player) {
		return false;
	}

	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
		return true;
	}

	@Override
	public void onFire(World world, EntityLivingBase entity, ItemStack heldItem) {
		world.playSound(null, entity.getPosition().getX(), entity.getPosition().getY(), entity.getPosition().getZ(), SoundHandler.FX_C14GAUSSRIFLE_FIRING, SoundCategory.PLAYERS, 0.4F, 1.5F);
		Vec3d look = entity.getLook(AccessHandler.getPartialTicks());

		if (world.isRemote) {
			Minecraft.getMinecraft().addScheduledTask(() -> {
				world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, entity.posX + look.x * 0.5, entity.posY + entity.getEyeHeight() + look.y * 0.5, entity.posZ + look.z * 0.5, 0, 0, 0, new int[0]);
			});
		}
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

	public Item getAmmo(World world, EntityPlayer player) {
		return ItemHandler.BULLET_MAGAZINE;
	}

}
