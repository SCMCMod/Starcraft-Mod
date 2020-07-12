package com.arpaesis.scmc.handlers;

import com.arpaesis.scmc.SCConstants;

import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;

//TODO: Ocelot, was this ever finished?
public class LootTableHandler
{

	public static final ResourceLocation TERRAN_BUNKER = register("chests/terran_bunker");

	public static final ResourceLocation ENTITY_BRAKK = register("entities/zerg/brakk");
	public static final ResourceLocation ENTITY_BRUTALISK = register("entities/zerg/brutalisk");
	public static final ResourceLocation ENTITY_CIVILIAN = register("entities/terran/civilian");
	public static final ResourceLocation ENTITY_PROBE = register("entities/protoss/probe");
	public static final ResourceLocation ENTITY_PROBE_VOID = register("entities/protoss/probe_void");
	public static final ResourceLocation ENTITY_PROBE_DARK = register("entities/protoss/probe_dark");

	/**
	 * Sets a block state in the world to contain loot.
	 * 
	 * @param world The world to place the block into
	 * @param state The block
	 * @param te The tile entity that will contain the loot
	 * @param pos The position of the block
	 * @param loot The loot that will be placed inside
	 */
	public static void generateLootContainer(World world, IBlockState state, TileEntity te, BlockPos pos, ResourceLocation loot)
	{
		world.setBlockState(pos, state);
		if (te instanceof TileEntityLockableLoot)
		{
			((TileEntityLockableLoot) te).setLootTable(loot, 0);
			te.validate();
			world.setTileEntity(pos, te);
		}
	}

	/**
	 * Register a {@link LootTable} with the specified ID.
	 *
	 * @param id The ID of the LootTable without the testmod3: prefix
	 * @return The ID of the LootTable
	 */
	private static ResourceLocation register(String id)
	{
		return LootTableList.register(new ResourceLocation(SCConstants.MODID, id));
	}
}