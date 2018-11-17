package com.arpaesis.scmc.blocks;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import com.arpaesis.scmc.blocks.items.ItemBlockLayered;
import com.arpaesis.scmc.blocks.items.ItemBlockMeta;
import com.arpaesis.scmc.handlers.BlockHandler;
import com.arpaesis.scmc.handlers.RenderHandler;
import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

//TODO: MOVE TO CORE MOD, AND make this generic and not SCMC based.
public class SCBlock extends Block
{

	public static final int BIT_NO_METADATA = 0x01;

	protected ItemBlock item;
	protected boolean noMeta;

	public SCBlock(Material material)
	{
		super(material, material.getMaterialMapColor());
	}

	public SCBlock(Material material, MapColor color)
	{
		super(material, color);
	}

	public SCBlock(String name, RegistryType type, Material material)
	{
		this(name, type, material, material.getMaterialMapColor());
	}

	public SCBlock(String name, RegistryType type, Material material, int modifiers)
	{
		this(name, type, material);
		setModifiers(modifiers);
	}

	public SCBlock(RegistryType type, Material material)
	{
		this(type, material, material.getMaterialMapColor());
	}

	public SCBlock(String name, RegistryType type, Material material, MapColor color)
	{
		super(material, color);
		this.setNames(name);
		this.registerPre(type);
	}

	public SCBlock(String name, RegistryType type, Material material, MapColor color, int modifiers)
	{
		this(name, type, material, color);
		setModifiers(modifiers);
	}

	public SCBlock(RegistryType type, Material material, MapColor color)
	{
		super(material, color);
		this.registerPre(type);
	}

	public void registerPre(RegistryType type)
	{
		if (type == RegistryType.FULL)
		{
			if (this.item == null)
			{
				BlockHandler.registerFullBlock(this);
			} else
			{
				BlockHandler.registerBlockWithItemBlock(this, this.item);
			}
			if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
			{
				if (noMeta)
				{
					for (int i = 0; i < 16; i++)
					{
						RenderHandler.registerBlockRender(this, i, this.getRegistryName().toString());
					}
				}
			}
		} else if (type == RegistryType.BLOCK)
		{
			BlockHandler.register(this);
		} else if (type == RegistryType.LAYERED)
		{
			if (this instanceof SCBlockLayered)
			{
				setItemBlock(new ItemBlockLayered((SCBlockLayered) this));
				BlockHandler.registerBlockWithItemBlock(this, this.item);
				if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
				{
					RenderHandler.registerLayered(this);
					if (noMeta)
					{
						for (int i = 0; i < 16; i++)
						{
							RenderHandler.registerBlockRender(this, i, this.getRegistryName().toString());
						}
					}
				}
			} else
			{
				throw new IllegalArgumentException(String.format("The given Block %s tried to register as a layered block, but it is not an instance of StarcraftBlockLayered!", this.getUnlocalizedName()));
			}
		} else if (type == RegistryType.META)
		{
			setItemBlock(new ItemBlockMeta(this));
			BlockHandler.registerBlockWithItemBlock(this, this.item);
			if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
			{
				if (noMeta)
				{
					for (int i = 0; i < 16; i++)
					{
						RenderHandler.registerBlockRender(this, i, this.getRegistryName().toString());
					}
				}
			}
		} else
		{
			throw new IllegalArgumentException(String.format("The registry type %s for block %s is not currently supported. Either add support for it or change the type of registry.", type, this.getRegistryName()));
		}
	}

	private void setModifiers(int modifiers)
	{
		this.noMeta = (modifiers & BIT_NO_METADATA) > 0;
	}

	@Nullable
	public RayTraceResult collisionRayTrace(IBlockState blockState, World world, BlockPos pos, Vec3d start, Vec3d end)
	{
		List<RayTraceResult> list = Lists.<RayTraceResult>newArrayList();
		List<AxisAlignedBB> boxes = Lists.<AxisAlignedBB>newArrayList();
		this.getCollisionBoxes(this.getActualState(blockState, world, pos), world, pos, boxes);

		for (AxisAlignedBB axisalignedbb : boxes)
		{
			if (axisalignedbb != NULL_AABB)
			{
				list.add(this.rayTrace(pos, start, end, axisalignedbb));
			}
		}

		RayTraceResult raytraceresult1 = null;
		double d1 = 0.0D;

		for (RayTraceResult raytraceresult : list)
		{
			if (raytraceresult != null)
			{
				double d0 = raytraceresult.hitVec.squareDistanceTo(end);

				if (d0 > d1)
				{
					raytraceresult1 = raytraceresult;
					d1 = d0;
				}
			}
		}

		return raytraceresult1;
	}

	/**
	 * @deprecated Use
	 *             {@link #getCollisionBoxes(IBlockState, World, BlockPos, List)}
	 *             instead.
	 */
	@Override
	public void addCollisionBoxToList(IBlockState state, World world, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean isActualState)
	{
		List<AxisAlignedBB> boxes = new ArrayList<AxisAlignedBB>();
		this.getCollisionBoxes(this.getActualState(state, world, pos), world, pos, boxes);
		for (AxisAlignedBB box : boxes)
		{
			super.addCollisionBoxToList(pos, entityBox, collidingBoxes, box);
		}
	}

	/**
	 * Gets the boxes of the block.
	 * 
	 * @param state The actual state of the block
	 * @param world The world the block is in
	 * @param pos The position of the block
	 * @param boxes The list to add the boxes to
	 */
	protected void getCollisionBoxes(IBlockState state, World world, BlockPos pos, List<AxisAlignedBB> boxes)
	{
		boxes.add(this.getCollisionBoundingBox(state, world, pos));
	}

	public void setNames(String name)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}

	@Override
	public SCBlock setSoundType(SoundType sound)
	{
		return (SCBlock) super.setSoundType(sound);
	}

	/**
	 * Sets or removes the tool and level required to harvest this block.
	 *
	 * @param toolClass Class
	 * @param level Harvest level: Wood: 0 Stone: 1 Iron: 2 Diamond: 3 Gold: 0
	 */
	public SCBlock setBlockHarvestLevel(String toolClass, int level)
	{
		setHarvestLevel(toolClass, level);
		return this;
	}

	/**
	 * Sets or removes the tool and level required to harvest this block.
	 *
	 * @param toolClass Class
	 * @param level Harvest level: Wood: 0 Stone: 1 Iron: 2 Diamond: 3 Gold: 0
	 * @param state The specific state.
	 */
	public SCBlock setBlockHarvestLevel(String toolClass, int level, IBlockState state)
	{
		setHarvestLevel(toolClass, level, state);
		return this;
	}

	public SCBlock setItemBlock(ItemBlock item)
	{
		this.item = item;
		return this;
	}
}
