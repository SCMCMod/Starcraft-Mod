package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.enums.MetaHandler.TerrazineType;
import com.hypeirochus.scmc.enums.MetaHandler.VespeneType;
import com.hypeirochus.scmc.handlers.IMetaRenderHandler;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemTerrazine extends StarcraftItem implements IMetaRenderHandler
{

	public ItemTerrazine()
	{
		super("terrazine");
		setHasSubtypes(true);
	}

	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
	{
		if (entityLiving instanceof EntityPlayer)
		{
			EntityPlayer entityplayer = (EntityPlayer) entityLiving;
			worldIn.playSound((EntityPlayer) null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
			this.onItemConsumed(stack, worldIn, entityplayer);
			entityplayer.addStat(StatList.getObjectUseStats(this));

			if (entityplayer instanceof EntityPlayerMP)
			{
				CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP) entityplayer, stack);
			}
		}

		stack.shrink(1);
		return stack;
	}

	protected void onItemConsumed(ItemStack stack, World worldIn, EntityPlayer player)
	{
		player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 750));
		player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 750));
		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 750));
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack)
	{
		return 32;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack stack)
	{
		return EnumAction.EAT;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);

		if (!playerIn.isCreative())
		{
			playerIn.setActiveHand(handIn);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
		return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		if (tab == CreativeTabs.SEARCH)
		{
			for (int i = 0; i < VespeneType.values().length; i++)
			{
				items.add(new ItemStack(this, 1, i));
			}
		} else
		{
			if (tab == StarcraftCreativeTabs.MISC)
				items.add(new ItemStack(this, 1, 0));
			if (tab == StarcraftCreativeTabs.PROTOSS)
				items.add(new ItemStack(this, 1, 1));
			if (tab == StarcraftCreativeTabs.TERRAN)
				items.add(new ItemStack(this, 1, 2));
			if (tab == StarcraftCreativeTabs.ZERG)
				items.add(new ItemStack(this, 1, 3));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		for (int i = 0; i < TerrazineType.values().length; i++)
		{
			if (stack.getItemDamage() == i)
			{
				return getUnlocalizedName() + "." + TerrazineType.values()[i].getName();
			} else
			{
				continue;
			}
		}
		return getUnlocalizedName() + "." + TerrazineType.RAW.getName();
	}

	@Override
	public int getItemCount()
	{
		return TerrazineType.values().length;
	}

	@Override
	public String getName(int meta)
	{
		return "terrazine." + MetaHandler.TerrazineType.values()[meta].getName();
	}
}