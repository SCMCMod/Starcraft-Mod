package com.hypeirochus.scmc.items;

import com.hypeirochus.api.world.entity.player.inventory.Inventories;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.ocelot.api.utils.InventoryUtils;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemFlamethrower extends StarcraftItem {

	public ItemFlamethrower() {
		super("terran.flamethrower");
		setFull3D();
		setMaxStackSize(1);
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		ItemStack itemstack = player.getHeldItem(hand);
		if (this.hasAmmo(world, player)) {
			if (!world.isRemote) {
				player.world.playSound(null, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.PLAYERS, 1, 1f);
				// EntityFlamethrowerFlame projectile = new EntityFlamethrowerFlame(world, player);
				// projectile.setThrowableHeading(projectile.motionX, projectile.motionY, projectile.motionZ, 5F, 0F);
				// world.spawnEntity(projectile);
			}
		} else if (!this.hasAmmo(world, player)) {
			player.world.playSound(null, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), SoundHandler.FX_C14GAUSSRIFLE_OUT, SoundCategory.PLAYERS, 0.4F, 0.4F / (itemRand.nextFloat() * 0.5F + 0.8F));
		}
		return super.onItemRightClick(world, player, hand);
	}

	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
		return true;
	}

	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player) {
		return false;
	}

	public boolean hasAmmo(World world, EntityPlayer player) {
		if (player.capabilities.isCreativeMode) {
			return true;
		}

		if (Inventories.playerHas(getAmmo(), player)) {
			ItemStack ammoStack = player.inventory.mainInventory.get(InventoryUtils.getItemSlot(player, getAmmo(), MetaHandler.BulletMagazineType.FLAMETHROWER.getID()));

			if (ammoStack != null && ammoStack.getItem() != null && ammoStack.getMetadata() == MetaHandler.BulletMagazineType.FLAMETHROWER.getID() && ammoStack.hasTagCompound()) {
				NBTTagCompound nbt = ammoStack.getTagCompound();
				if (nbt.getInteger("BulletCount") >= 1) {
					nbt.setInteger("BulletCount", nbt.getInteger("BulletCount") - 1);
				}

				return true;
			}
		}
		return false;
	}

	public Item getAmmo() {
		return ItemHandler.BULLET_MAGAZINE;
	}
}
