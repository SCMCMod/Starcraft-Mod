package ga.scmc.items.structurespawns;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.SoundHandler;
import ga.scmc.worldgen.structure.StructureProtossCyberneticsCoreTemplate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemProtossDarkCyberneticsCoreSpawner extends Item {

	public ItemProtossDarkCyberneticsCoreSpawner() {
		setUnlocalizedName("spawnerProtossDarkCyberneticsCore");
		setRegistryName("spawner_protoss_dark_cyberneticscore");
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		StructureProtossCyberneticsCoreTemplate CYBERNETICS_CORE = new StructureProtossCyberneticsCoreTemplate();
		CYBERNETICS_CORE.generate_r0(1, 4, worldIn, 0, 0, 0, pos, false);
		worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundHandler.STRUC_CYBERNETICSCORE_BIRTH, null, 0.7F, 1F, false);
		return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
}
