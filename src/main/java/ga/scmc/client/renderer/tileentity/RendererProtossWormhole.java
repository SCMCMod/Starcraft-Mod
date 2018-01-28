package ga.scmc.client.renderer.tileentity;

import java.lang.reflect.Method;

import ga.scmc.tileentity.TileEntityProtossWormhole;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class RendererProtossWormhole extends TileEntitySpecialRenderer<TileEntityProtossWormhole> {
	
	@Override
	public void renderTileEntityAt(TileEntityProtossWormhole te, double x, double y, double z, float partialTicks, int destroyStage) {
	}
}