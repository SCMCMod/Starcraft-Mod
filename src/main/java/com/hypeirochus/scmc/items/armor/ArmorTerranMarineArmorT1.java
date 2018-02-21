package com.hypeirochus.scmc.items.armor;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.client.model.armor.ModelArmorBase;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorTerranMarineArmorT1 extends ItemArmor {

	ModelArmorBase armorModel = null;

	public ArmorTerranMarineArmorT1(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped defaultModel) {

		if (itemStack != null) {
			if (this instanceof ItemArmor) {

				EntityEquipmentSlot type = armorType;
				switch (type) {
				case HEAD:
				case LEGS:
					armorModel = Starcraft.proxy.getArmorModel(6);
					break;
				case FEET:
				case CHEST:
					armorModel = Starcraft.proxy.getArmorModel(7);
					break;
				default:
					break;
				}

				armorModel.head.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				armorModel.body.showModel = (armorSlot == EntityEquipmentSlot.CHEST) || (armorSlot == EntityEquipmentSlot.CHEST);
				armorModel.rArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				armorModel.lArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				armorModel.rLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS) || (armorSlot == EntityEquipmentSlot.FEET);
				armorModel.lLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS) || (armorSlot == EntityEquipmentSlot.FEET);

				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;
				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;

				return armorModel;
			}
		}
		return null;
	}
}