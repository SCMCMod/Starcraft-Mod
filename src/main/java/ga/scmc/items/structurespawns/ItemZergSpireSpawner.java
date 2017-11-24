package ga.scmc.items.structurespawns;

import java.util.Random;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.worldgen.structure.StructureZergSpireTemplate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemZergSpireSpawner extends Item {

	Random rand;
	
	public ItemZergSpireSpawner() {
		setUnlocalizedName("zerg.spawner.spire");
		setRegistryName("zerg.spawner.spire");
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		StructureZergSpireTemplate ZERG_SPIRE = new StructureZergSpireTemplate();
		ZERG_SPIRE.generate(worldIn, rand, 0, 0, 0, pos, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}
