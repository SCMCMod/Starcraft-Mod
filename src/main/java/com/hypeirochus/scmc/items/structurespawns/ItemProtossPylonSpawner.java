package com.hypeirochus.scmc.items.structurespawns;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.worldgen.structure.StructureProtossPylonTemplate;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemProtossPylonSpawner extends Item {

	public ItemProtossPylonSpawner() {
		setUnlocalizedName("protoss.spawner.pylon");
		setRegistryName("protoss.spawner.pylon");
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		StructureProtossPylonTemplate PROTOSS_PYLON = new StructureProtossPylonTemplate();
		PROTOSS_PYLON.generate_r0(0, 0, worldIn, 3, pos, false);
		worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundHandler.STRUC_PYLON_BIRTH, null, 0.7F, 1F, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}
