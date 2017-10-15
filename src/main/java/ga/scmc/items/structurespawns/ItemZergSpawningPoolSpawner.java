package ga.scmc.items.structurespawns;

import java.util.Random;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.worldgen.structure.StructureZergSpawningPoolTemplate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemZergSpawningPoolSpawner extends Item {

	Random rand;
	
	public ItemZergSpawningPoolSpawner() {
		setUnlocalizedName("spawnerZergSpawningPool");
		setRegistryName("spawner_zerg_spawningpool");
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		StructureZergSpawningPoolTemplate ZERG_SPAWNINGPOOL = new StructureZergSpawningPoolTemplate();
		ZERG_SPAWNINGPOOL.generate_r0(worldIn, rand, 0, 0, 0, pos, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}
