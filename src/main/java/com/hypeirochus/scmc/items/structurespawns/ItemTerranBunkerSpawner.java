package com.hypeirochus.scmc.items.structurespawns;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.worldgen.structure.StructureTerranBunkerTemplate;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemTerranBunkerSpawner extends Item {

	public ItemTerranBunkerSpawner() {
		setUnlocalizedName("terran.spawner.bunker");
		setRegistryName("terran.spawner.bunker");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		StructureTerranBunkerTemplate TERRAN_BUNKER = new StructureTerranBunkerTemplate();
		TERRAN_BUNKER.generate_r0(worldIn, pos, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}
