package com.hypeirochus.scmc.blocks;

import java.util.Random;

import org.lwjgl.util.vector.Vector3f;

import com.hypeirochus.scmc.creativetabs.SCCreativeTabs;
import com.hypeirochus.scmc.damagesource.SCDamageSourceManager;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.MaterialHandler;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
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
public class BlockVespeneGas extends BlockGas
{

	public BlockVespeneGas()
	{
		super(MaterialHandler.VESPENE_GAS, "gas.vespene");
		setCreativeTab(SCCreativeTabs.MISC);
	}

	@Override
	public void displayParticles(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	{
		double x = (double) pos.getX() + 0.5D;
		double y = (double) pos.getY() + rand.nextDouble() * 9.0D / 16.0D;
		double z = (double) pos.getZ() + 0.5D;

		Vector3f color = new Vector3f(0.25f, 1f, 0f);

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
		if (world.getBlockState(new BlockPos(pos.getX(), pos.getY() + entity.getEyeHeight(), pos.getZ())).getBlock() == this)
			entity.attackEntityFrom(SCDamageSourceManager.poison_gas, 4);
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
					player.inventory.addItemStackToInventory(new ItemStack(ItemHandler.VESPENE, 1, 1 + meta));
					return true;
				}
			}
		}
		return super.onBlockActivated(world, pos, state, player, hand, side, hitX, hitY, hitZ);
	}
}
