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
	private final WorldServer worldServer;
	private double x;
	private double y;
	private double z;

	public TeleporterHandler(WorldServer world, double x, double y, double z, boolean hasNoSurface) {
		super(world);
		worldServer = world;
		BlockPos playerSpawn = new BlockPos(x, 100, z);
		if(hasNoSurface == false) {
			while(world.isAirBlock(playerSpawn)) {
				playerSpawn = playerSpawn.down();
			}
		}
		this.x = x;
		this.y = playerSpawn.getY()+1;
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
	}

	@Override
	public void placeInPortal(@Nonnull Entity entity, float rotationYaw) {
		entity.setPosition(x, y + 3, z);
		entity.motionX = 0;
		entity.motionY = 0;
		entity.motionZ = 0;
	}
}
