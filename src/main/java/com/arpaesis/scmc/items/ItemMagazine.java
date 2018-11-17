package com.arpaesis.scmc.items;

import java.util.List;

import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.enums.MetaHandler;
import com.arpaesis.scmc.enums.MetaHandler.BulletMagazineType;
import com.arpaesis.scmc.handlers.IMetaRenderHandler;
import com.arpaesis.scmc.handlers.ItemHandler;
import com.ocelot.api.utils.InventoryUtils;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

/**
 * A basic item that has a bullet count and capacity stored in nbt.
 * 
 * @author Ocelot5836
 */
public class ItemMagazine extends SCItem implements IMetaRenderHandler
{

	public ItemMagazine()
	{
		super("terran.magazine");
		setHasSubtypes(true);
		setMaxStackSize(1);
		setMaxDamage(0);
		setCreativeTab(SCCreativeTabs.TERRAN);
	}

	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag)
	{
		if (stack.hasTagCompound())
		{
			NBTTagCompound nbt = stack.getTagCompound();
			tooltip.add(nbt.getInteger("BulletCount") + "/" + nbt.getInteger("BulletCapacity") + " Ammo");
		}
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (isInCreativeTab(tab))
		{
			for (int i = 0; i < BulletMagazineType.values().length; i++)
			{
				ItemStack stack = new ItemStack(this, 1, i);
				NBTTagCompound nbt = new NBTTagCompound();
				nbt.setInteger("BulletCount", MetaHandler.BulletMagazineType.values()[i].getBulletCount());
				nbt.setInteger("BulletCapacity", MetaHandler.BulletMagazineType.values()[i].getBulletCount());
				stack.setTagCompound(nbt);
				items.add(stack);
			}
		}
	}

	@Override
	public String getTranslationKey(ItemStack stack)
	{
		for (int i = 0; i < BulletMagazineType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getTranslationKey() + "." + BulletMagazineType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getTranslationKey() + "." + BulletMagazineType.C14.getName();
	}

	@Override
	public double getDurabilityForDisplay(ItemStack stack)
	{
		if (stack.hasTagCompound())
		{
			NBTTagCompound nbt = stack.getTagCompound();
			return 1 - ((double) nbt.getInteger("BulletCount") / (double) nbt.getInteger("BulletCapacity"));
		}
		return super.getDurabilityForDisplay(stack);
	}

	@Override
	public boolean showDurabilityBar(ItemStack stack)
	{
		return true;
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
	{
		if (!stack.hasTagCompound() && !world.isRemote)
		{
			stack.setTagCompound(getDefaultStack(stack.getMetadata()).getTagCompound());
		}

		if (entity instanceof EntityPlayer)
		{
			if (stack.hasTagCompound() && stack.getTagCompound().hasKey("BulletCount") && stack.getTagCompound().getInteger("BulletCount") <= 0)
			{
				EntityPlayer player = (EntityPlayer) entity;
				player.inventory.setInventorySlotContents(InventoryUtils.getItemSlot(player, stack), ItemStack.EMPTY);
			}
		}
	}

	public static ItemStack getDefaultStack(int type)
	{
		ItemStack stack = new ItemStack(ItemHandler.BULLET_MAGAZINE, 1, type);
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("BulletCount", MetaHandler.BulletMagazineType.values()[type].getBulletCount());
		nbt.setInteger("BulletCapacity", MetaHandler.BulletMagazineType.values()[type].getBulletCount());
		stack.setTagCompound(nbt);
		return stack;
	}

	/**
	 * If the specified stack is a bullet magazine, it will return the amount of
	 * bullets inside. If the specified stack is not a bullet magazine, it will
	 * return 0.
	 * 
	 * @param stack The stack to get the count from
	 * @return The amount of bullets found in the magazine if the stack is one
	 */
	public static int getBulletCount(ItemStack stack)
	{
		int count = 0;
		if (!stack.isEmpty() && stack.hasTagCompound() && stack.getTagCompound().hasKey("BulletCount"))
		{
			count = stack.getTagCompound().getInteger("BulletCount");
		}
		return count;
	}

	@Override
	public int getItemCount()
	{
		return BulletMagazineType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "terran.magazine." + MetaHandler.BulletMagazineType.values()[meta].getName();
	}
}