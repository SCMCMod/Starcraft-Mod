package com.hypeirochus.scmc.blocks;

import java.util.Random;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.lib.Library;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Basic magma block that will set water above it to air and set itself to lava when broken.
 * 
 * @author Ocelot5836
 * @author wundrweapon
 */
public class BlockMagma extends StarcraftBlock {

	public BlockMagma(String name) {
		super(name, RegistryType.FULL, Material.ROCK, MapColor.NETHERRACK);
		setSoundType(SoundType.STONE);
		setHardness(0.5F);
		setResistance(0.83F);
		setLightLevel(0.2F);
		setTickRandomly(true);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		world.setBlockState(pos, Blocks.FLOWING_LAVA.getDefaultState());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getPackedLightmapCoords(IBlockState state, IBlockAccess source, BlockPos pos) {
		return 7864;
	}

	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase) entityIn)) {
			entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 1.0F);
		}

		super.onEntityWalk(worldIn, pos, entityIn);
	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
		BlockPos posUp = pos.up();
		IBlockState stateUp = world.getBlockState(posUp);

		if (stateUp.getBlock() instanceof BlockLiquid) {
			world.setBlockToAir(posUp);
			world.playSound((EntityPlayer) null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);

			if (world instanceof WorldServer) {
				((WorldServer) world).spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double) posUp.getX() + 0.5D, (double) posUp.getY() + 0.25D, (double) posUp.getZ() + 0.5D, 8, 0.5D, 0.25D, 0.5D, 0.0D);
			}
		}

		if (!Library.checkCube(world, Blocks.FLOWING_LAVA.getDefaultState(), pos, 3).isEmpty()) {
			breakBlock(world, pos, state);
		}
	}
}
