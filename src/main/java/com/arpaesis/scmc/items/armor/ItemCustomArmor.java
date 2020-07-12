package com.arpaesis.scmc.items.armor;

import com.arpaesis.scmc.Starcraft;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.rom.client.model.armor.ModelArmorBase;


public class ItemCustomArmor extends ItemArmor
{

	protected ModelArmorBase armorModel = null;
	protected int layer1;
	protected int layer2;

	public ItemCustomArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot, int layer1, int layer2)
	{
		super(material, renderIndex, equipmentSlot);
		this.layer1 = layer1;
		this.layer2 = layer2;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped defaultModel)
	{

		if (itemStack != null)
		{
			if (this instanceof ItemArmor)
			{

				EntityEquipmentSlot type = armorType;
				switch (type)
				{
				case HEAD:
				case LEGS:
					armorModel = Starcraft.proxy.getArmorModel(layer1);
					break;
				case FEET:
				case CHEST:
					armorModel = Starcraft.proxy.getArmorModel(layer2);
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