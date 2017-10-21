package ga.scmc.client.renderer;

import ga.scmc.client.renderer.items.ItemRenderC14GaussRifle;
import ga.scmc.client.renderer.items.ItemRenderFlamethrower;
import ga.scmc.client.renderer.items.ItemRenderStarcraftSkull;
import ga.scmc.client.renderer.items.ItemRenderTable;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ItemHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class ItemRenderRegistrationHandler {

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelBake(ModelBakeEvent event) {
		event.getModelRegistry().putObject(new ModelResourceLocation(ItemHandler.C14_GAUSS_RIFLE.getRegistryName(), "inventory"), new ItemRenderC14GaussRifle());
		event.getModelRegistry().putObject(new ModelResourceLocation(ItemHandler.FLAMETHROWER.getRegistryName(), "inventory"), new ItemRenderFlamethrower());
		event.getModelRegistry().putObject(new ModelResourceLocation(BlockHandler.TEST.getRegistryName(), "inventory"), new ItemRenderTable());
		event.getModelRegistry().putObject(new ModelResourceLocation(ItemHandler.STARCRAFT_SKULL.getRegistryName(), "inventory"), new ItemRenderStarcraftSkull());
	}
}