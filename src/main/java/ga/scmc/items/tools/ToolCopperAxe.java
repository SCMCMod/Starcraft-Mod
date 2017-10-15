package ga.scmc.items.tools;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ToolCopperAxe extends ItemAxe {

	public ToolCopperAxe(ToolMaterial material) {
		super(material, 8, -3.1f);
		setUnlocalizedName("copperAxe");
		setRegistryName("copper_axe");
		setCreativeTab(StarcraftCreativeTabs.TERRAN);
	}

	@Override
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		Material material = state.getMaterial();
		return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : efficiencyOnProperMaterial;
	}
}