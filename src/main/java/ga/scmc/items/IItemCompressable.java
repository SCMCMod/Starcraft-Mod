package ga.scmc.items;

import net.minecraft.item.ItemStack;

/**
 * @author Ocelot5836
 */
public interface IItemCompressable {

	/**
	 * Used for recipes in the default crafting table.
	 * 
	 * @param metadata
	 *            The metadata of the item
	 * @return The item stack for the item when compressed eg. "###", "###", "###",
	 *         '#' stack returned
	 */
	public ItemStack getCompressedForm(int metadata);

}