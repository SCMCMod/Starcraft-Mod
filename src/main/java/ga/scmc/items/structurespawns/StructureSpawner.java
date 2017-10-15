package ga.scmc.items.structurespawns;

import ga.scmc.lib.Library;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
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
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * The basis for a structure loader.
 */
public abstract class StructureSpawner extends Item {

	protected String name;

	public StructureSpawner(String name) {
		this.name = name;
	}

	@Override
	public abstract ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player, EnumHand hand);

	protected void generateStructure(World world, EntityPlayer player) {
		loadStructure(player.getPosition(), world, name);
	}

	protected void loadStructure(BlockPos pos, World world, String name) {
		if (!world.isRemote) {
			WorldServer worldserver = (WorldServer) world;
			MinecraftServer minecraftserver = world.getMinecraftServer();
			TemplateManager templatemanager = worldserver.getStructureTemplateManager();
			ResourceLocation loc = new ResourceLocation(Library.MODID, name);
			Template template = templatemanager.getTemplate(minecraftserver, loc);
			// 1.12-Template template = templatemanager.get(minecraftserver, loc);

			if (template != null) {
				IBlockState iblockstate = world.getBlockState(pos);
				world.notifyBlockUpdate(pos, iblockstate, iblockstate, 3);
				PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE).setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false);

				template.addBlocksToWorldChunk(world, pos.add(0, 1, 0), placementsettings);
			}
		}
	}
}