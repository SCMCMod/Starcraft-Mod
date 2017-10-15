package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockShakurasCobblestone extends Block {

	public BlockShakurasCobblestone() {
		super(Material.ROCK, MapColor.LIGHT_BLUE);
		setUnlocalizedName("shakurasCobblestone");
		setRegistryName("shakuras_cobblestone");
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(30.0F);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
}