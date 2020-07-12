package io.github.scmcmod.entity.living;

import io.github.scmcmod.enums.EnumTypeAttributes;
import io.github.scmcmod.handlers.SoundHandler;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class EntityZergPassive extends EntityStarcraftPassive
{

	private static final DataParameter<Boolean> BURROW = EntityDataManager.createKey(EntityZergPassive.class, DataSerializers.BOOLEAN);

	public EntityZergPassive(World world)
	{
		super(world);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity)
	{
		return null;
	}

	@Override
	public boolean getCanSpawnHere()
	{
		return true;
	}

	@Override
	protected void entityInit()
	{

		this.getDataManager().register(BURROW, false);

		super.entityInit();
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbt)
	{
		super.writeEntityToNBT(nbt);

		nbt.setBoolean("Burrow", this.getBurrowState());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt)
	{
		super.readEntityFromNBT(nbt);

		this.isBurrowed(nbt.getBoolean("Burrow"));
	}

	public boolean getBurrowState()
	{
		return this.getDataManager().get(BURROW);
	}

	public void isBurrowed(boolean isBurrowed)
	{
		this.getDataManager().set(BURROW, isBurrowed);
	}

	protected void clearAITasks()
	{
		tasks.taskEntries.clear();
		targetTasks.taskEntries.clear();
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		if (!this.world.isRemote)
		{
			if (this.getHealth() < this.getMaxHealth() / 6 && this.getBurrowState() == false && isBurrowingZerg())
			{
				world.playSound(null, this.getPosition(), SoundHandler.FX_ZERG_BURROWDOWN, SoundCategory.NEUTRAL, 7.0F, 1.0F);
				this.isBurrowed(true);
				this.clearAITasks();
				this.amendAttribute(EnumTypeAttributes.INVISIBLE);
			} else if (this.getHealth() > this.getMaxHealth() / 6 && this.getBurrowState() == true)
			{
				world.playSound(null, this.getPosition(), SoundHandler.FX_ZERG_BURROWUP, SoundCategory.NEUTRAL, 7.0F, 1.0F);
				this.isBurrowed(false);
				this.initEntityAI();
				this.removeAttribute(EnumTypeAttributes.INVISIBLE);
			}
		}
	}

	public boolean isBurrowingZerg()
	{
		return !(this instanceof EntityLarva) && !(this instanceof EntityLarvaCocoon);
	}
}