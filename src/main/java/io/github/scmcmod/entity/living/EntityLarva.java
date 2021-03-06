package io.github.scmcmod.entity.living;

import java.util.Random;

import io.github.scmcmod.Starcraft;
import io.github.scmcmod.client.gui.GuiLarvaMorph;
import io.github.scmcmod.entity.ai.pathfinding.PathNavigateCreep;
import io.github.scmcmod.enums.EnumColors;
import io.github.scmcmod.enums.EnumFactionTypes;
import io.github.scmcmod.enums.EnumTypeAttributes;
import io.github.scmcmod.enums.MetaHandler;
import io.github.scmcmod.handlers.GuiHandler;
import io.github.scmcmod.handlers.ItemHandler;
import io.github.scmcmod.handlers.SoundHandler;
import io.github.scmcmod.init.StarCraftBlocks;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityLarva extends EntityZergPassive
{
	private int fire;
	private int nextStepDistance;
	private Random random = new Random();

	// Redo entity movement
	public EntityLarva(World world)
	{
		super(world);
		setSize(1.0F, .5F);
		this.setColor(EnumColors.PURPLE);
		this.setFactions(EnumFactionTypes.SWARM);
		setAttributes(EnumTypeAttributes.LIGHT, EnumTypeAttributes.BIOLOGICAL, EnumTypeAttributes.GROUND);
		this.initEntityAI();
	}

	@Override
	protected void initEntityAI()
	{
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIMoveTowardsRestriction(this, 1));
		tasks.addTask(2, new EntityAIWander(this, 1));
		tasks.addTask(3, new EntityAILookIdle(this));
		tasks.addTask(4, new EntityAIAvoidEntity<EntityProtossMob>(this, EntityProtossMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(4, new EntityAIAvoidEntity<EntityTerranMob>(this, EntityTerranMob.class, 16.0F, 1.0D, 1.0D));
		tasks.addTask(4, new EntityAIAvoidEntity<EntityPlayer>(this, EntityPlayer.class, 16.0F, 1.0D, 1.0D));
		super.initEntityAI();
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(.10241212312);
		getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(20.0D);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_)
	{
		return null;
	}

	@Override
	protected void dropFewItems(boolean recentlyHit, int looting)
	{
		ItemDrop drop = new ItemDrop(50, new ItemStack(ItemHandler.ZERG_CARAPACE, 1 + this.rand.nextInt(2), MetaHandler.CarapaceType.T1.getID()));
		drop.tryDrop(this);
	}

	@Override
	protected PathNavigate createNavigator(World worldIn)
	{
		return new PathNavigateCreep(this, worldIn);
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand)
	{
		ItemStack stack = player.getHeldItem(hand);
		boolean flag = !stack.isEmpty() && stack.getItem() != Items.SPAWN_EGG;

		if (!flag && this.isEntityAlive() && !this.isChild() && !player.isSneaking())
		{
			if (this.world.isRemote)
			{
				GuiLarvaMorph.INSTANCE.openGUI(player, Starcraft.instance, GuiHandler.LARVA_MORPH_ID, world, (int) player.posX, (int) player.posY, (int) player.posZ, this);
			}
			return true;
		} else
		{
			return super.processInteract(player, hand);
		}
	}

	@Override
	public SoundEvent getAmbientSound()
	{
		return SoundHandler.ENTITY_LARVA_LIVE1;
	}

	@Override
	public SoundEvent getDeathSound()
	{
		return SoundHandler.ENTITY_LARVA_DEATH;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource source)
	{
		return SoundHandler.ENTITY_LARVA_HURT;
	}

	@Override
	public int getTalkInterval()
	{
		return 160;
	}

	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();

		// Larva should die instantly when they are not on creep.
		if (this.getEntityWorld().getBlockState(this.getPosition().add(0, -1, 0)).getBlock() != StarCraftBlocks.ZERG_CREEP && this.getEntityWorld().getBlockState(this.getPosition().add(0, -1, 0)).getBlock() != Blocks.AIR)
		{
			this.attackEntityFrom(DamageSource.OUT_OF_WORLD, this.getMaxHealth());
		}
	}

	@Override
	protected void jump()
	{
	}
}
