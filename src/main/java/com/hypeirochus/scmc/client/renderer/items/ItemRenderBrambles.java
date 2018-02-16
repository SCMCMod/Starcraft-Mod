package com.hypeirochus.scmc.client.renderer.items;

import com.hypeirochus.scmc.client.renderer.Resources;
import com.hypeirochus.scmc.client.renderer.model.blocks.ModelBrambles;
import com.ocelot.api.utils.TextureUtils;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * @author Ocelot5836
 */
public class ItemRenderBrambles extends ItemRenderer {

	private static final ModelBrambles MODEL = new ModelBrambles();

	public ItemRenderBrambles() {
		super(MODEL, null);
	}

	@Override
	public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		renderFirstPersonRight(itemstack, entity, cameraTransformType);
	}

	@Override
	public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(0, 0, 1, 0);
		GlStateManager.scale(0.5, 0.5, 0.5);
		GlStateManager.translate(-0.5, -0.9, -0.5);
		renderModel(0.0625 * 0.4);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(30, 1, 0, 0);
		GlStateManager.rotate(225, 0, 1, 0);
		GlStateManager.scale(0.6, 0.6, 0.6);
		GlStateManager.translate(-0.5, -1.25, -0.5);
		renderModel(0.0625 * 0.626);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.rotate(45, 0, 1, 0);
		GlStateManager.scale(0.6, 0.6, 0.6);
		GlStateManager.translate(-0.5, -1.2, -0.5);
		renderModel(0.0625 * 0.25);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderFixed(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		GlStateManager.pushMatrix();
		GlStateManager.scale(0.6, 0.6, 0.6);
		GlStateManager.translate(-0.5, -1.25, -0.5);
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
		GlStateManager.scale(0.6, 0.6, 0.6);
		GlStateManager.translate(-0.45, -1.25, -0.65);
		renderModel(0.0625 * 0.4);
		GlStateManager.popMatrix();
	}

	public void renderModel(double scale) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(0.5, 1.5, 0.5);
		GlStateManager.rotate(180, 0, 0, 1);
		int ticksAlive = 0;
		if (entity != null)
			ticksAlive = entity.ticksExisted;
		if (stack.hasTagCompound()) {
			NBTTagCompound nbt = (NBTTagCompound) stack.getTagCompound().getTag("BlockEntityTag");
			if (nbt.hasKey("variant")) {
				switch (nbt.getInteger("variant")) {
				case 0:
					TextureUtils.bindTexture(Resources.KALDIR_BRAMBLES_TEXTURE);
					break;
				case 1:
					TextureUtils.bindTexture(Resources.SHAKURAS_BRAMBLES_TEXTURE);
					break;
				case 2:
					TextureUtils.bindTexture(Resources.ZERUS_BRAMBLES_TEXTURE);
					break;
				}
			} else {
				TextureUtils.bindTexture(Resources.KALDIR_BRAMBLES_TEXTURE);
			}
		} else {
			TextureUtils.bindTexture(Resources.KALDIR_BRAMBLES_TEXTURE);
		}
		MODEL.render((float) scale, ticksAlive);
		GlStateManager.popMatrix();
	}
}