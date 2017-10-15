package ga.scmc.worldgen.structure;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface INBTStructure {

	boolean generate(World world, int offsetX, int offsetY, int offsetZ, BlockPos position);

	void clear(World world, int offsetX, int offsetY, int offsetZ, BlockPos position);
}