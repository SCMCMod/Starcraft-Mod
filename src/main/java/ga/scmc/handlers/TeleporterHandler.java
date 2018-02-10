package ga.scmc.handlers;

import javax.annotation.Nonnull;

import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 */
public class TeleporterHandler extends Teleporter {
	private final WorldServer	worldServer;
	private double				x;
	private double				y;
	private double				z;

	public TeleporterHandler(int lastDim, WorldServer world, double x, double y, double z, boolean hasNoSurface) {
		super(world);
		worldServer = world;
		if(world.provider.getDimension() != ConfigurationHandler.INT_DIMENSION_SPACE) {
			BlockPos playerSpawn = new BlockPos(x, 100, z);
			if (hasNoSurface == false) {
				while (world.isAirBlock(playerSpawn)) {
					playerSpawn = playerSpawn.down();
				}
			}
			this.x = x;
			this.y = playerSpawn.getY() + 1;
			world.setBlockState(playerSpawn, Blocks.OBSIDIAN.getDefaultState());
			world.setBlockState(playerSpawn.add(-1, 0, 1), Blocks.OBSIDIAN.getDefaultState());
			world.setBlockState(playerSpawn.add(0, 0, 1), Blocks.OBSIDIAN.getDefaultState());
			world.setBlockState(playerSpawn.add(1, 0, 1), Blocks.OBSIDIAN.getDefaultState());

			world.setBlockState(playerSpawn.add(-1, 0, -1), Blocks.OBSIDIAN.getDefaultState());
			world.setBlockState(playerSpawn.add(0, 0, -1), Blocks.OBSIDIAN.getDefaultState());
			world.setBlockState(playerSpawn.add(1, 0, -1), Blocks.OBSIDIAN.getDefaultState());

			world.setBlockState(playerSpawn.add(1, 0, 0), Blocks.OBSIDIAN.getDefaultState());
			world.setBlockState(playerSpawn.add(-1, 0, 0), Blocks.OBSIDIAN.getDefaultState());
			this.z = z;
		}else {
			if(lastDim == 0) {
				this.x = 0;
				this.y = 180;
				this.z = 0;
				/*
				world.setBlockState(playerSpawn.add(0, -3, 0), Blocks.OBSIDIAN.getDefaultState());
				world.setBlockState(playerSpawn.add(-1, -3, 1), Blocks.OBSIDIAN.getDefaultState());
				world.setBlockState(playerSpawn.add(0, -3, 1), Blocks.OBSIDIAN.getDefaultState());
				world.setBlockState(playerSpawn.add(1, -3, 1), Blocks.OBSIDIAN.getDefaultState());

				world.setBlockState(playerSpawn.add(-1, -3, -1), Blocks.OBSIDIAN.getDefaultState());
				world.setBlockState(playerSpawn.add(0, -3, -1), Blocks.OBSIDIAN.getDefaultState());
				world.setBlockState(playerSpawn.add(1, -3, -1), Blocks.OBSIDIAN.getDefaultState());

				world.setBlockState(playerSpawn.add(1, -3, 0), Blocks.OBSIDIAN.getDefaultState());
				world.setBlockState(playerSpawn.add(-1, -3, 0), Blocks.OBSIDIAN.getDefaultState());
				*/
			}else if(lastDim == ConfigurationHandler.INT_DIMENSION_CHAR) {
				this.x = -1515;
				this.y = 180;
				this.z = 17776;
			}
		}
	}

	@Override
	public void placeInPortal(@Nonnull Entity entity, float rotationYaw) {
		entity.setPosition(x, y + 3, z);
		entity.motionX = 0;
		entity.motionY = 0;
		entity.motionZ = 0;
	}
}
