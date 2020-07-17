package io.github.scmcmod.items;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.enums.MetaHandler;
import net.rom.utils.CoreUtil;
import io.github.scmcmod.handlers.ItemHandler;
import io.github.scmcmod.handlers.SoundHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemC14GaussRifle extends ItemGun
{

	public ItemC14GaussRifle()
	{
		super("terran.riflec14", 6, 60);
		setFull3D();
		setMaxStackSize(1);
		setCreativeTab(SCCreativeTabs.TERRAN);
	}

	@Override
	public void onFire(World world, EntityLivingBase entity, ItemStack heldItem)
	{
		world.playSound(null, entity.getPosition().getX(), entity.getPosition().getY(), entity.getPosition().getZ(), SoundHandler.FX_C14GAUSSRIFLE_FIRING, SoundCategory.PLAYERS, 0.4F, 1.5F);
		Vec3d look = entity.getLook(CoreUtil.getPartialTicks());

		if (world.isRemote)
		{
			Minecraft.getMinecraft().addScheduledTask(() ->
			{
				world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, entity.posX + look.x * 0.5, entity.posY + entity.getEyeHeight() + look.y * 0.5, entity.posZ + look.z * 0.5, 0, 0, 0, new int[0]);
			});
		}
	}

	@Override
	public boolean hasAmmo(World world, EntityPlayer player, ItemStack stack)
	{
//		if (Inventories.playerHas(getAmmo(world, player), player))
//		{
//			ItemStack ammoStack = player.inventory.mainInventory.get(InventoryUtils.getItemSlot(player, getAmmo(world, player), MetaHandler.BulletMagazineType.C14.getID()));
//
//			if (!ammoStack.isEmpty() && ammoStack.getMetadata() == MetaHandler.BulletMagazineType.C14.getID() && ammoStack.hasTagCompound())
//			{
//				NBTTagCompound nbt = ammoStack.getTagCompound();
//				return nbt.getInteger("BulletCount") >= 1;
//			}
//		}
		return false;
	}

	@Override
	public void takeAmmo(World world, EntityPlayer player, ItemStack stack)
	{
//		ItemStack ammoStack = player.inventory.mainInventory.get(InventoryUtils.getItemSlot(player, getAmmo(world, player), MetaHandler.BulletMagazineType.C14.getID()));

//		if (!ammoStack.isEmpty() && ammoStack.getMetadata() == MetaHandler.BulletMagazineType.C14.getID() && ammoStack.hasTagCompound())
//		{
//			NBTTagCompound nbt = ammoStack.getTagCompound();
//			if (nbt.getInteger("BulletCount") >= 1)
//			{
//				nbt.setInteger("BulletCount", nbt.getInteger("BulletCount") - 1);
//			}
//		}
	}

	public Item getAmmo(World world, EntityPlayer player)
	{
		return ItemHandler.BULLET_MAGAZINE;
	}

}
