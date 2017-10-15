package ga.scmc.blocks;

import ga.scmc.Starcraft;
import ga.scmc.client.gui.GuiHandler;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * This class is a simple block used for GUI and basic block testing. DO NOT DELETE THIS PLZ
 * 
 * @since 5.1
 * @author Ocelot5836
 */
public class BlockTest extends Block {

	public BlockTest() {
		super(Material.IRON, MapColor.YELLOW);
		setUnlocalizedName("test");
		setRegistryName("test");
		setSoundType(SoundType.METAL);
		setBlockUnbreakable();
		setTickRandomly(true);
		setCreativeTab(null);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (world.isRemote)
			player.openGui(Starcraft.instance, GuiHandler.LAVA_LARVA_ID, world, (int) hitX, (int) hitY, (int) hitZ);
		return true;
	}
}