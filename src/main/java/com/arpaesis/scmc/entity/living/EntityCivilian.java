package com.arpaesis.scmc.entity.living;

import java.util.Random;

import com.arpaesis.scmc.Starcraft;
import com.arpaesis.scmc.entity.ai.EntityAITradePlayer;
import com.arpaesis.scmc.enums.EnumColors;
import com.arpaesis.scmc.enums.EnumFactionTypes;
import com.arpaesis.scmc.enums.EnumTypeAttributes;
import com.arpaesis.scmc.handlers.GuiHandler;
import com.arpaesis.scmc.handlers.LootTableHandler;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityCivilian extends EntityTerranPassive
{

	private Random random = new Random();
	private EntityPlayer customer;

	public EntityCivilian(World world)
	{
		super(world);
		setSize(0.6F, 1.8F);
		this.setColor(EnumColors.BLUE);
		this.setFactions(EnumFactionTypes.RAIDERS);
		setAttributes(EnumTypeAttributes.LIGHT, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND);
		this.initEntityAI();
	}

	@Override
	protected void initEntityAI()
	{
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAvoidEntity<EntityZergMob>(this, EntityZergMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(2, new EntityAIAvoidEntity<EntityProtossMob>(this, EntityProtossMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(3, new EntityAIWander(this, 1));
		tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8));
		tasks.addTask(10, new EntityAITradePlayer(this));
		tasks.addTask(5, new EntityAILookIdle(this));
		super.initEntityAI();
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.43000000417232513D);
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand)
	{
		ItemStack stack = player.getHeldItem(hand);
		boolean flag = stack != null && stack.getItem() == Items.SPAWN_EGG;

		setSize(0.6F, 1.8F);
		if (!flag && this.isEntityAlive() && !this.isChild() && !player.isSneaking())
		{
			if (this.world.isRemote)
			{
				player.openGui(Starcraft.instance, GuiHandler.SHOP_ID, world, (int) player.posX, (int) player.posY, (int) player.posZ);
				this.customer = player;
			}
			return true;
		} else
		{
			return super.processInteract(player, hand);
		}
	}

	@Override
	protected ResourceLocation getLootTable()
	{
		return LootTableHandler.ENTITY_CIVILIAN;
	}

	@Override
	protected boolean canDespawn()
	{
		return false;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_)
	{
		return null;
	}

	public EntityPlayer getCustomer()
	{
		return customer;
	}

	public void setCustomer(EntityPlayer customer)
	{
		this.customer = customer;
	}
}