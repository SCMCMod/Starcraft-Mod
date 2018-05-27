package com.hypeirochus.scmc.worldgen.structure;

import javax.annotation.Nullable;

import com.hypeirochus.scmc.Starcraft;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * The basis for any structure being generated with NBT.
 * 
 * @author Ocelot5836
 */
public interface INBTStructure extends IGenericStructure {

	/**
	 * Generates a loaded template into the world.
	 * 
	 * @param template
	 *            The template
	 * @param world
	 *            The world to load the structure into
	 * @param pos
	 *            The position to load the structure to
	 * @param settings
	 *            The settings to use when generating the structure
	 */
	default void placeStructure(Template template, World world, BlockPos pos, PlacementSettings settings) {
		IBlockState iblockstate = world.getBlockState(pos);
		world.notifyBlockUpdate(pos, iblockstate, iblockstate, 3);

		template.addBlocksToWorldChunk(world, pos, settings);
	}

	/**
	 * Loads a structure from the structures folder.
	 * 
	 * @param world
	 *            The world to load the structure from
	 * @param name
	 *            The name of the structure in the files
	 * @return Whether or not the structure could be found and loaded
	 */
	@Nullable
	default Template getTemplate(World world, String name) {
		if (!world.isRemote) {
			WorldServer worldserver = (WorldServer) world;
			MinecraftServer minecraftserver = world.getMinecraftServer();
			TemplateManager templatemanager = worldserver.getStructureTemplateManager();
			ResourceLocation loc = new ResourceLocation(Starcraft.MOD_ID, name);
			Template template = templatemanager.getTemplate(minecraftserver, loc);
			return template;
		}
		return null;
	}

	/**
	 * @return The default placement settings
	 */
	default PlacementSettings getDefaultPlacementSettings() {
		return getPlacementSettings(Mirror.NONE, Rotation.NONE, false);
	}

	/**
	 * @param mirror
	 *            The mirror option
	 * @param rotation
	 *            The rotation of the structure
	 * @param ignoreEntities
	 *            Whether or not to ignore entities
	 * @return The settings created with these options
	 */
	default PlacementSettings getPlacementSettings(Mirror mirror, Rotation rotation, boolean ignoreEntities) {
		return new PlacementSettings().setMirror(mirror).setRotation(rotation).setIgnoreEntities(ignoreEntities).setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false);
	}
}