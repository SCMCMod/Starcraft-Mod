package com.hypeirochus.scmc.client.renderer.items;

import static net.minecraft.inventory.EntityEquipmentSlot.CHEST;
import static net.minecraft.inventory.EntityEquipmentSlot.FEET;
import static net.minecraft.inventory.EntityEquipmentSlot.HEAD;
import static net.minecraft.inventory.EntityEquipmentSlot.LEGS;

import com.hypeirochus.scmc.client.renderer.model.IArmorItem;
import com.hypeirochus.scmc.lib.Library;
import com.ocelot.api.utils.TextureUtils;

import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemRenderModelArmorItem extends ItemRenderer {

	private IArmorItem			model;
	private EntityEquipmentSlot	type;

	private ResourceLocation	textureLayer1;
	private ResourceLocation	textureLayer2;

	public ItemRenderModelArmorItem(EntityEquipmentSlot type, IArmorItem model, ArmorMaterial material) {
		super(null, null);
		this.model = model;
		this.textureLayer1 = new ResourceLocation(Library.RL_BASE + "textures/models/armor/" + material.getName().substring(Library.MODID.length() + 1) + "_layer_1.png");
		this.textureLayer2 = new ResourceLocation(Library.RL_BASE + "textures/models/armor/" + material.getName().substring(Library.MODID.length() + 1) + "_layer_2.png");

		switch (type) {
		case CHEST:
			break;
		case FEET:
			break;
		case HEAD:
			break;
		case LEGS:
			break;
		default:
			throw new IllegalArgumentException(String.format("You cannot have an armor item that uses the hands! 4 available arguments are %s, %s, %s, and %s.", CHEST.toString(), FEET.toString(), HEAD.toString(), LEGS.toString()));
		}

		this.type = type;
	}

	@Override
	public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		renderFirstPersonRight(itemstack, entity, cameraTransformType);
	}

	@Override
	public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = 0.0625f;
		renderArmor(entity, cameraTransformType, scale);
	}

	@Override
	public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = 0.0625f;
		renderArmor(entity, cameraTransformType, scale);
	}

	@Override
	public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = 0.0625f;
		renderArmor(entity, cameraTransformType, scale);
	}

	@Override
	public void renderThirdPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		renderThirdPersonRight(itemstack, entity, cameraTransformType);
	}

	@Override
	public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = 0.0625f;
		renderArmor(entity, cameraTransformType, scale);
	}

	@Override
	public void renderFixed(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = 0.0625f;
		renderArmor(entity, cameraTransformType, scale);
	}

	@Override
	public void renderHead(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {

	}

	public void renderArmor(EntityLivingBase entity, TransformType cameraTransformType, float scale) {
		if (type == HEAD) {
			TextureUtils.bindTexture(textureLayer1);
			model.renderHelmet(cameraTransformType, entity, scale);
			TextureUtils.bindTexture(textureLayer2);
			model.renderHelmet(cameraTransformType, entity, scale);
		}

		if (type == CHEST) {
			TextureUtils.bindTexture(textureLayer1);
			model.renderChestplate(cameraTransformType, entity, scale);
			TextureUtils.bindTexture(textureLayer2);
			model.renderChestplate(cameraTransformType, entity, scale);
		}

		if (type == LEGS) {
			TextureUtils.bindTexture(textureLayer1);
			model.renderLeggings(cameraTransformType, entity, scale);
			TextureUtils.bindTexture(textureLayer2);
			model.renderLeggings(cameraTransformType, entity, scale);
		}

		if (type == FEET) {
			TextureUtils.bindTexture(textureLayer1);
			model.renderBoots(cameraTransformType, entity, scale);
			TextureUtils.bindTexture(textureLayer2);
			model.renderBoots(cameraTransformType, entity, scale);
		}
	}
}