package ga.scmc.items.structurespawns;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.worldgen.structure.StructureTerranBarracksTemplate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemTerranBarracksSpawner extends Item {

	public ItemTerranBarracksSpawner() {
		setUnlocalizedName("terran.spawner.barracks");
		setRegistryName("terran.spawner.barracks");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		StructureTerranBarracksTemplate TERRAN_BARRACKS = new StructureTerranBarracksTemplate();
		TERRAN_BARRACKS.generate(worldIn, pos, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}
