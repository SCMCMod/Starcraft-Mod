package io.github.scmcmod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.rom.block.BlockFallingGeneric;

/**
 * @author Ocelot5836
 */
public class SCGravel extends BlockFallingGeneric
{

	public SCGravel(Material material, MapColor color, int dustcolor)
	{
		super(material, color, dustcolor);
		setHarvestLevel("shovel", -1);
	}

	@Nullable
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		if (fortune > 3)
		{
			fortune = 3;
		}

		return rand.nextInt(10 - fortune * 3) == 0 ? Items.FLINT : Item.getItemFromBlock(this);
	}
}