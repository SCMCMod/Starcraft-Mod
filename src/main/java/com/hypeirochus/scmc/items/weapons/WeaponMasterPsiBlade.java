package com.hypeirochus.scmc.items.weapons;

import com.elytradev.mirage.event.GatherLightsEvent;
import com.elytradev.mirage.lighting.IEntityLightEventConsumer;
import com.elytradev.mirage.lighting.Light;
import com.hypeirochus.api.world.entity.player.inventory.Inventories;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class WeaponMasterPsiBlade extends ItemSword implements IEntityLightEventConsumer {

	public WeaponMasterPsiBlade(ToolMaterial material) {
		super(material);
		setUnlocalizedName("protoss.blade.master");
		setRegistryName("protoss.blade.master");
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		player.world.playSound(null, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), SoundHandler.FX_WARPBLADE_ATTACK, SoundCategory.PLAYERS, 1.0F, 1.0F);
		return super.onLeftClickEntity(stack, player, entity);
	}

	public void checkCanReplace(EntityPlayer player, ItemStack stack) {
		Inventories.consumeItem(player, stack.getItem());
		player.inventory.addItemStackToInventory(new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, MetaHandler.FocuserType.AIUR.getID()));
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (stack.getItemDamage() > 74) {
			checkCanReplace((EntityPlayer) entityIn, stack);
		}
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}

	@Override
	public int getMaxDamage() {
		return 75;
	}

	@Override
	public void gatherLights(GatherLightsEvent evt, Entity entity) {
		evt.add(Light.builder().pos(entity).color(0.08F, 0.85F, 0.0F).intensity(0.5F).radius(6).build());
	}
}