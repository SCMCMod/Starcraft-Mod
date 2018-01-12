package ga.scmc.client.renderer.items;

import ga.scmc.client.renderer.RenderUtil;
import ga.scmc.client.renderer.model.blocks.ModelTable;
import ga.scmc.client.renderer.model.blocks.ModelZerusGlowPod;
import ga.scmc.lib.Library;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import ocelot.api.utils.TextureUtils;

/**
 * @author Ocelot5836
 */
public class ItemRenderZerusGlowPod extends ItemRenderer {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Library.MODID, "textures/models/block/zerus_glow_pod.png");

	public ItemRenderZerusGlowPod() {
		super(null, TEXTURE);
	}

	@Override
	public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		renderFirstPersonRight(itemstack, entity, cameraTransformType);
	}

	@Override
	public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(0, 0, 1, 0);
		GlStateManager.translate(-0.5, -0.9, -0.5);
		renderModel(0.0625 * 0.4);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(30, 1, 0, 0);
		GlStateManager.rotate(225, 0, 1, 0);
		GlStateManager.scale(1.8, 1.8, 1.8);
		GlStateManager.translate(-0.5, -0.68, -0.5);
		renderModel(0.0625 * 0.626);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(45, 0, 1, 0);
		GlStateManager.scale(1.8, 1.8, 1.8);
		GlStateManager.translate(-0.5, -1.2, -0.5);
		renderModel(0.0625 * 0.25);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderFixed(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.scale(1.8, 1.8, 1.8);
		GlStateManager.translate(-0.5, -0.85, -0.5);
		renderModel(0.0625 * 0.5);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderHead(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {

	}

	@Override
	public void renderThirdPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		renderThirdPersonRight(itemstack, entity, cameraTransformType);
	}

	@Override
	public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(75, 1, 0, 0);
		GlStateManager.rotate(45, 0, 1, 0);
		GlStateManager.translate(-0.45, -0.9, -0.55);
		renderModel(0.0625 * 0.4);
		GlStateManager.popMatrix();
	}

	public void renderModel(double scale) {
		GlStateManager.pushMatrix();
		ModelZerusGlowPod model = new ModelZerusGlowPod();
		GlStateManager.translate(0.5, 1.5, 0.5);
		GlStateManager.rotate(180, 0, 0, 1);
		bindTexture();
		model.render((float) scale, 1);
		GlStateManager.popMatrix();
	}
}