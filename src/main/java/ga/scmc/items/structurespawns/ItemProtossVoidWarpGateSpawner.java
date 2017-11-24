package ga.scmc.items.structurespawns;

import java.util.Random;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.SoundHandler;
import ga.scmc.worldgen.structure.StructureProtossWarpGateTemplate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemProtossVoidWarpGateSpawner extends Item {

	public ItemProtossVoidWarpGateSpawner() {
		setUnlocalizedName("protoss.spawner.warpgate.void");
		setRegistryName("protoss.spawner.warpgate.void");
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		StructureProtossWarpGateTemplate PROTOSS_WARPGATE = new StructureProtossWarpGateTemplate();
		Random rand = new Random();
		PROTOSS_WARPGATE.generate(1, 2, worldIn, rand, 0, 0, 0, pos, false);
		worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundHandler.STRUC_GATEWAY_BIRTH, null, 0.7F, 1F, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}