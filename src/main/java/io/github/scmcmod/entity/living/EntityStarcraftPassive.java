package io.github.scmcmod.entity.living;

import java.util.HashMap;
import java.util.Map;

import io.github.scmcmod.api.IEntityTeamColorable;
import io.github.scmcmod.enums.EnumColors;
import io.github.scmcmod.enums.EnumFactionTypes;
import io.github.scmcmod.enums.EnumTypeAttributes;
import io.github.scmcmod.handlers.ItemHandler;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public abstract class EntityStarcraftPassive extends EntityTameable implements IEntityTeamColorable<EntityStarcraftPassive>
{

	private static final DataParameter<Integer> COLOR = EntityDataManager.createKey(EntityStarcraftPassive.class, DataSerializers.VARINT);
	private static final DataParameter<String> OWNER = EntityDataManager.createKey(EntityStarcraftPassive.class, DataSerializers.STRING);

	Map<Integer, EnumTypeAttributes> types = new HashMap<Integer, EnumTypeAttributes>();
	Map<Integer, EnumFactionTypes> factions = new HashMap<Integer, EnumFactionTypes>();
	EnumColors color;

	public EntityStarcraftPassive(World world)
	{
		super(world);
	}

	/**
	 * Makes starcraft creatures spawn anywhere, as long as the difficulty is not
	 * peaceful.
	 */
	@Override
	public boolean getCanSpawnHere()
	{
		return true;
	}

	/**
	 * Initializes the entity NBT values. Owner is set to empty by default.
	 */
	@Override
	protected void entityInit()
	{
		super.entityInit();

		this.getDataManager().register(COLOR, 0);
		this.getDataManager().register(OWNER, "");
	}

	public int secondsToTicks(int seconds)
	{
		return seconds * 20;
	}

	/**
	 * @param type The type we are checking the creature for.
	 * @return True if the creature is the type requested, false otherwise.
	 */
	public boolean hasAttribute(EnumTypeAttributes type)
	{
		for (int x = 0; x < types.size(); x++)
		{
			if (this.types.get(x) == type)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * @param faction The faction we are checking the creature for.
	 * @return True if the creature is of the requested faction, false otherwise.
	 */
	public boolean isFaction(EnumFactionTypes faction)
	{
		for (int x = 0; x < factions.size(); x++)
		{
			if (this.factions.get(x) == faction)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Gets the color of the mob.
	 */
	public EnumColors getColor()
	{
		for (EnumColors color : EnumColors.values())
		{
			if (color.ordinal() == this.getColorID())
			{
				return color;
			}
		}
		return null;
	}

	/**
	 * Sets the color of this mob to whatever the color specified is.
	 */
	public EntityStarcraftPassive setColor(EnumColors color)
	{
		this.color = color;
		//TODO CHANGE
		this.setColorID(color.ordinal());
		return this;
	}

	/**
	 * @param types The attributes we want our entity to have.
	 * @return The creature.
	 */
	public EntityStarcraftPassive setAttributes(EnumTypeAttributes... types)
	{
		for (int x = 0; x < types.length; x++)
		{
			this.types.put(x, types[x]);
		}
		return this;
	}

	public EntityStarcraftPassive amendAttribute(EnumTypeAttributes type)
	{
		this.types.put(types.size(), type);
		return this;
	}

	public EntityStarcraftPassive removeAttribute(EnumTypeAttributes type)
	{
		for (int x = 0; x < types.size(); x++)
		{
			if (this.types.get(x) == type)
			{
				this.types.remove(x);
				return this;
			}
		}
		return this;
	}

	/**
	 * @param types Sets the creature to be under the given factions.
	 * @return The creature.a
	 */
	public EntityStarcraftPassive setFactions(EnumFactionTypes... types)
	{
		for (int x = 0; x < types.length; x++)
		{
			this.factions.put(x, types[x]);
		}
		this.setStarcraftOwner(types[0].toString());
		return this;
	}

	/**
	 * Stores the NBT for the entity.
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound nbt)
	{
		super.writeEntityToNBT(nbt);

		nbt.setInteger("Color", this.getColorID());
		nbt.setString("Owner", this.getStarcraftOwner());
	}

	/**
	 * Reads the NBT from saved files for this entity.
	 */
	@Override
	public void readEntityFromNBT(NBTTagCompound nbt)
	{
		super.readEntityFromNBT(nbt);

		this.setColorID(nbt.getInteger("Color"));
		this.setStarcraftOwner(nbt.getString("Owner"));
	}

	public int getColorID()
	{
		return this.getDataManager().get(COLOR);
	}

	public void setColorID(int colornum)
	{
		this.getDataManager().set(COLOR, colornum);
	}

	/**
	 * Gets the owner of this creature. Used mostly to determine if two entities
	 * should attack, along with the factions.
	 * 
	 * @return
	 */
	public String getStarcraftOwner()
	{
		return this.getDataManager().get(OWNER);
	}

	/**
	 * Sets the owner of this creature. Set through events such as unit purchase,
	 * mind control, and so on.
	 * 
	 * @param owner The owner this creature will be under.
	 */
	public void setStarcraftOwner(String owner)
	{
		this.getDataManager().set(OWNER, owner);
	}

	// TODO: Remove this eventually.
	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand)
	{
		ItemStack heldItem = player.getHeldItem(hand);
		if (heldItem != null && heldItem.getItem() == ItemHandler.PLEDGE)
		{
			this.setStarcraftOwner(player.getUniqueID().toString());
			heldItem.shrink(1);
			return true;
		} else if (heldItem != null && heldItem.getItem() == Items.DYE)
		{
			int meta = heldItem.getMetadata();
			setColor(EnumColors.values()[15 - meta]);
			heldItem.shrink(1);
			return true;
		} else
		{
			return super.processInteract(player, hand);
		}
	}

	@Override
	protected int getExperiencePoints(EntityPlayer player)
	{
		return (int) (this.getMaxHealth() * 3 / 4);
	}
}