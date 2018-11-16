package com.hypeirochus.scmc.blocks;

import java.util.Random;

import org.lwjgl.util.vector.Vector3f;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.MaterialHandler;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Ocelot5836
 */
public class BlockTerrazineGas extends BlockGas
{

	public BlockTerrazineGas()
	{
		super(MaterialHandler.VESPENE_GAS, "gas.terrazine");
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	@Override
	public void displayParticles(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	{
		double x = (double) pos.getX() + 0.5D;
		double y = (double) pos.getY() + rand.nextDouble() * 9.0D / 16.0D;
		double z = (double) pos.getZ() + 0.5D;

		Vector3f color = new Vector3f(0.5f, 0f, 0.25f);

		worldIn.spawnParticle(EnumParticleTypes.SPELL_MOB, x, y, z, color.x, color.y, color.z, new int[0]);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity)
	{
		if (entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) entity;
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 750));
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 750));
			player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 750));
		}
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		ItemStack heldItem = player.getHeldItem(hand);
		if (!heldItem.isEmpty() && heldItem.getItem() == ItemHandler.GAS_CONTAINER)
		{
			int meta = heldItem.getMetadata();
			for (int i = 0; i < MetaHandler.ContainerType.values().length; i++)
			{
				if (meta == i)
				{
					if (!player.isCreative())
					{
						world.destroyBlock(pos, false);
						player.inventory.decrStackSize(player.inventory.getSlotFor(player.getHeldItemMainhand()), 1);
					}
					player.inventory.addItemStackToInventory(new ItemStack(ItemHandler.TERRAZINE, 1, 1 + meta));
					return true;
				}
			}
		}
		return super.onBlockActivated(world, pos, state, player, hand, side, hitX, hitY, hitZ);
	}
}
