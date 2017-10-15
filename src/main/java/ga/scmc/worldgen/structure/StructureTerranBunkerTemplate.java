package ga.scmc.worldgen.structure;

import java.util.Random;

import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.ItemEnumHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.MetaBlockHandler;
import ga.scmc.lib.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StructureTerranBunkerTemplate extends SCWorldGenerator {

	@Override
	public boolean generate(World world, Random rand, int offsetX, int offsetY, int offsetZ, BlockPos pos, boolean flag) {
		generate_r0(world, pos, flag);
		return true;
	}

	public boolean generate_r0(World world, BlockPos pos, boolean flag) {
		if(flag) {
			if (!LocationIsValidSpawn(world, pos) || !LocationIsValidSpawn(world, pos.add(13, 0, 0)) || !LocationIsValidSpawn(world, pos.add(13, 0, 13)) || !LocationIsValidSpawn(world, pos.add(0, 0, 13))) {
				return false;
			}
		}
		
		if(ConfigurationHandler.BOOL_DEBUG_MODE_ENABLED == true) {
			LogHelper.logger.info("A Bunker is spawning!");
		}
		world.setBlockState(pos.add(6, 0, 0), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(7, 0, 0), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(5, 0, 2), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(6, 0, 2), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(7, 0, 2), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(8, 0, 2), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(4, 0, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(5, 0, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(6, 0, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(7, 0, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(8, 0, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(9, 0, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(3, 0, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(4, 0, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(5, 0, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(6, 0, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(7, 0, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(8, 0, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(9, 0, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(10, 0, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(0, 0, 5), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(2, 0, 5), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(3, 0, 5), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(4, 0, 5), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(5, 0, 5), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(6, 0, 5), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(7, 0, 5), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(8, 0, 5), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(9, 0, 5), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(10, 0, 5), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(11, 0, 5), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(13, 0, 5), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(0, 0, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(2, 0, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(3, 0, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(4, 0, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(5, 0, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(6, 0, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(7, 0, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(8, 0, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(9, 0, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(10, 0, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(11, 0, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(13, 0, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(0, 0, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(2, 0, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(3, 0, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(4, 0, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(5, 0, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(6, 0, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(7, 0, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(8, 0, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(9, 0, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(10, 0, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(11, 0, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(13, 0, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(0, 0, 8), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(2, 0, 8), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(3, 0, 8), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(4, 0, 8), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(5, 0, 8), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(6, 0, 8), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(7, 0, 8), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(8, 0, 8), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(9, 0, 8), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(10, 0, 8), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(11, 0, 8), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(13, 0, 8), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(3, 0, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(4, 0, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(5, 0, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(6, 0, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(7, 0, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(8, 0, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(9, 0, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(10, 0, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(4, 0, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(5, 0, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(6, 0, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(7, 0, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(8, 0, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(9, 0, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(5, 0, 11), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(6, 0, 11), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(7, 0, 11), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(8, 0, 11), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(6, 0, 13), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(7, 0, 13), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(1));
		world.setBlockState(pos.add(5, 1, 0), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 1, 0), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 1, 1), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 1, 1), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 1, 1), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 1, 1), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 1, 1), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 1, 1), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 1, 2), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 1, 2), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(9, 1, 2), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 1, 2), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(2, 1, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 1, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(6, 1, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(7, 1, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));

		TileEntityChest chest = new TileEntityChest();

		world.setBlockState(pos.add(9, 1, 3), Blocks.CHEST.getDefaultState(), 3);
		world.setTileEntity(pos.add(9, 1, 3), chest);
		
		Random randchest = new Random();
		for (int slot = 0; slot < chest.getSizeInventory(); slot++) {
			int num = randchest.nextInt(100);
			if (num == 0) {
				//chest.setInventorySlotContents(slot, new ItemStack(ModItems.COORDINATES, 1, 0));
			} else if (num >= 13 && num <= 59) {
				chest.setInventorySlotContents(slot, new ItemStack(ItemHandler.BULLET, 1 + randchest.nextInt(4), ItemEnumHandler.BulletType.C14.getID()));
			} else if (num == 1) {
				//chest.setInventorySlotContents(slot, new ItemStack(ModItems.COORDINATES, 1, 1));
			}

		}

		world.setBlockState(pos.add(10, 1, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(11, 1, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(0, 1, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(1, 1, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(2, 1, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(6, 1, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(7, 1, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(11, 1, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(12, 1, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(13, 1, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(1, 1, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(12, 1, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(1, 1, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 1, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(4, 1, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(9, 1, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 1, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(12, 1, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(1, 1, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 1, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(4, 1, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(9, 1, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 1, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(12, 1, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(1, 1, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(12, 1, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(0, 1, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(1, 1, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(2, 1, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(6, 1, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(7, 1, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(11, 1, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(12, 1, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(13, 1, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(2, 1, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 1, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));

		TileEntityChest chest2 = new TileEntityChest();
		world.setBlockState(pos.add(4, 1, 10), Blocks.CHEST.getDefaultState(), 3);
		world.setTileEntity(pos.add(4, 1, 10), chest2);
		Random randchest2 = new Random();
		for (int slot = 0; slot < chest2.getSizeInventory(); slot++) {
			int num = randchest2.nextInt(100);
			if (num < 1) {
				chest2.setInventorySlotContents(slot, new ItemStack(ItemHandler.C14_GAUSS_RIFLE, 1));
			} else if (num >= 13 && num <= 59) {
				chest2.setInventorySlotContents(slot, new ItemStack(ItemHandler.BULLET, 1 + randchest2.nextInt(4), ItemEnumHandler.BulletType.C14.getID()));
			} else if (num > 89) {
				chest2.setInventorySlotContents(slot, new ItemStack(ItemHandler.DUST, 1, randchest2.nextInt(2)));
			}
		}

		world.setBlockState(pos.add(6, 1, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(7, 1, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 1, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(11, 1, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 1, 11), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 1, 11), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(9, 1, 11), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 1, 11), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 1, 12), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 1, 12), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 1, 12), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 1, 12), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 1, 12), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 1, 12), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 1, 13), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 1, 13), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 2, 1), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 2, 1), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 2, 1), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 2, 1), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 2, 1), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 2, 1), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 2, 2), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(4, 2, 2), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(9, 2, 2), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 2, 2), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(2, 2, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(3, 2, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(6, 2, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(7, 2, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 2, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(11, 2, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(1, 2, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(2, 2, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(11, 2, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(12, 2, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(1, 2, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(12, 2, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(1, 2, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 2, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 2, 6), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(12, 2, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(1, 2, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 2, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 2, 7), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(12, 2, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(1, 2, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(12, 2, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(1, 2, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(2, 2, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(11, 2, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(12, 2, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(2, 2, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(3, 2, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(6, 2, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(7, 2, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 2, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(11, 2, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(3, 2, 11), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(4, 2, 11), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(9, 2, 11), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 2, 11), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(4, 2, 12), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 2, 12), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 2, 12), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 2, 12), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 2, 12), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 2, 12), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 3, 2), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(5, 3, 2), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 3, 2), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 3, 2), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 3, 2), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 3, 2), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(3, 3, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(4, 3, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(9, 3, 3), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 3, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(2, 3, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(3, 3, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 3, 4), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(11, 3, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(2, 3, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(11, 3, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(2, 3, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(11, 3, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(2, 3, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(11, 3, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(2, 3, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(11, 3, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(2, 3, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(3, 3, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 3, 9), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(11, 3, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(3, 3, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(4, 3, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(9, 3, 10), MetaBlockHandler.NEOSTEEL_METAL.getStateFromMeta(0));
		world.setBlockState(pos.add(10, 3, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(4, 3, 11), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(5, 3, 11), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 3, 11), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 3, 11), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 3, 11), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 3, 11), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(4, 4, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 4, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 4, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 4, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 4, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 4, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 4, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(10, 4, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 4, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(10, 4, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 4, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(10, 4, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 4, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 4, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 4, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(10, 4, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 4, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 4, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 4, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 4, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 5, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 5, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 5, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 5, 3), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 5, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(5, 5, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 5, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 5, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(3, 5, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 5, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 5, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(10, 5, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 5, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(10, 5, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 5, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(10, 5, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(3, 5, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 5, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 5, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(10, 5, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 5, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(5, 5, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 5, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 5, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(3));
		world.setBlockState(pos.add(5, 5, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 5, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 5, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 5, 10), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 6, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 6, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 6, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 6, 4), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 6, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 6, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 6, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 6, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 6, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 6, 5), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 6, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 6, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 6, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 6, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 6, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 6, 6), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 6, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 6, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 6, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 6, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 6, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 6, 7), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(4, 6, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 6, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 6, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 6, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 6, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(9, 6, 8), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(5, 6, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(6, 6, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(7, 6, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		world.setBlockState(pos.add(8, 6, 9), MetaBlockHandler.PARISTEEL_METAL.getStateFromMeta(5));
		return true;

	}

	protected Block[] GetValidSpawnBlocks() {
		return new Block[] { Blocks.GRASS, Blocks.STONE, Blocks.DIRT };
	}

	public boolean LocationIsValidSpawn(World world, BlockPos pos) {

		Block checkBlock = world.getBlockState(pos).getBlock();
		Material m = checkBlock.getBlockState().getBaseState().getMaterial();
		Block blockAbove = world.getBlockState(pos.up()).getBlock();
		Block blockBelow = world.getBlockState(pos.down()).getBlock();

		for (Block i : GetValidSpawnBlocks()) {
			if (blockAbove != Blocks.AIR) {
				return false;
			}
			if (checkBlock == i) {
				return true;
			} else if (checkBlock == Blocks.SNOW_LAYER && blockBelow == i) {
				return true;
			} else if (m == Material.PLANTS && blockBelow == i) {
				world.getBlockState(pos).getMaterial();
				return true;
			}
		}
		return false;
	}
}