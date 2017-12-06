package ga.scmc.items.structurespawns;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.worldgen.structure.StructureTerranCommandCenterTemplate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemTerranCommandCenterSpawner extends Item {

	public ItemTerranCommandCenterSpawner() {
		setUnlocalizedName("terran.spawner.commandcenter");
		setRegistryName("terran.spawner.commandcenter");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		StructureTerranCommandCenterTemplate TERRAN_CC = new StructureTerranCommandCenterTemplate();
		TERRAN_CC.generate(worldIn, pos, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}
