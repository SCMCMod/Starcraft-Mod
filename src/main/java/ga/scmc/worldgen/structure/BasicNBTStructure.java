package ga.scmc.worldgen.structure;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Allows support for basic NBT structures at ease.
 * 
 * @author Ocelot5836
 */
public class BasicNBTStructure extends SCWorldGenerator implements INBTStructure {

	private String name;

	public BasicNBTStructure(String name) {
		this.name = name;
	}

	@Override
	public boolean generate(World world, int offsetX, int offsetY, int offsetZ, BlockPos position) {
		return hasLoadedStructure(position, world, name);
	}

	@Override
	public void clear(World world, int offsetX, int offsetY, int offsetZ, BlockPos position) {

	}
}