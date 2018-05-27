package com.hypeirochus.scmc.worldgen.structure;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.template.Template;

/**
 * Allows support for basic NBT structures at ease.
 * 
 * @author Ocelot5836
 */
public class BasicNBTStructure implements INBTStructure {

	private String name;

	public BasicNBTStructure(String name) {
		this.name = name;
	}

	@Override
	public void setFlags(Object[] flags) {
	}

	@Override
	public boolean generate(World world, BlockPos position) {
		Template template = getTemplate(world, name);
		if (template != null) {
			template.addBlocksToWorld(world, position, this.getDefaultPlacementSettings());
			return true;
		}
		return false;
	}
}