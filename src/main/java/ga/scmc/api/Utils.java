package ga.scmc.api;

import org.apache.commons.codec.language.bm.Lang;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ga.scmc.lib.Library;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.oredict.OreDictionary;

/**
 * <em><b>Edited by Ocelot5836 for the SCMC mod.</b></em> <br>
 * </br>
 * 
 * This is where some useful methods will be.
 * 
 * 
 * @author CJMinecraft
 */
public class Utils {

	/**
	 * Makes the variables which will be initialized when there getter method is called
	 */
	private static Logger logger;
	private static Lang lang;

	/**
	 * Returns the logger. This makes System.our.println look shabby
	 * 
	 * @return The {@link Logger}
	 */
	public static Logger getLogger() {
		if (logger == null) {
			logger = LogManager.getFormatterLogger(Library.MODID);
		}
		return logger;
	}

	/**
	 * Calculate the redstone current from a item stack handler
	 * 
	 * @param handler
	 *            The handler
	 * @return The redstone power
	 */
	public static int calculateRedstone(ItemStackHandler handler) {
		int i = 0;
		float f = 0.0F;
		for (int j = 0; j < handler.getSlots(); j++) {
			ItemStack stack = handler.getStackInSlot(j);
			if (stack != null) {
				f += (float) stack.stackSize / (float) Math.min(handler.getStackInSlot(j).getMaxStackSize(), stack.getMaxStackSize());
				i++;
			}
		}
		f = f / (float) handler.getSlots();
		return (int) (Math.floor(f * 14.0F) + (i > 0 ? 1 : 0));
	}

	/**
	 * Adds the chosen item stack to the inventory
	 * 
	 * @param handler
	 *            The holder of the items
	 * @param stack
	 *            The stack to add
	 * @param simulate
	 *            Is the task a simulation?
	 * @return The remainder left if the slot was full
	 */
	public static ItemStack addStackToInventory(IItemHandler handler, ItemStack stack, boolean simulate) {
		ItemStack remainder = stack;
		for (int slot = 0; slot < handler.getSlots(); slot++) {
			remainder = handler.insertItem(slot, stack, simulate);
			if (remainder == null)
				break;
		}
		return remainder;
	}

	/**
	 * Adds the chosen item stack to the inventory
	 * 
	 * @param handler
	 *            The holder of the items
	 * @param maxSlot
	 *            The max slot to add to
	 * @param stack
	 *            The stack to add
	 * @param simulate
	 *            Is the task a simulation?
	 * @return The remainder left if the slot was full
	 */
	public static ItemStack addStackToInventory(IItemHandler handler, int maxSlot, ItemStack stack, boolean simulate) {
		ItemStack remainder = stack;
		for (int slot = 0; slot < maxSlot; slot++) {
			remainder = handler.insertItem(slot, stack, simulate);
			if (remainder == null)
				break;
		}
		return remainder;
	}

	/**
	 * Takes the chosen item stack from a specified slot to the inventory
	 * 
	 * @param handler
	 *            The holder of the items
	 * @param maxSlot
	 *            The max slot to take from
	 * @param amount
	 *            The amount to take
	 * @param simulate
	 *            Is the task a simulation?
	 * @return The remainder left if the slot was full
	 */
	public static ItemStack removeStackFromInventory(IItemHandler handler, int maxSlot, int amount, boolean simulate) {
		ItemStack remainder = null;
		for (int slot = 0; slot < maxSlot; slot++) {
			remainder = handler.extractItem(slot, amount, simulate);
			if (remainder == null)
				break;
		}
		return remainder;
	}

	/**
	 * Checks if the inventory is full
	 * 
	 * @param handler
	 *            The inventory
	 * @return true if it is full
	 */
	public static boolean isInventoryFull(IItemHandler handler) {
		int filledSlots = 0;
		for (int slot = 0; slot < handler.getSlots(); slot++) {
			if (handler.getStackInSlot(slot).stackSize == handler.getStackInSlot(slot).getMaxStackSize())
				filledSlots++;
		}
		return filledSlots == handler.getSlots();
	}

	/**
	 * Checks if the inventory is full
	 * 
	 * @param handler
	 *            The inventory
	 * @param maxSlot
	 *            The number of slots to check
	 * @return true if it is full
	 */
	public static boolean isInventoryFull(IItemHandler handler, int maxSlot) {
		int filledSlots = 0;
		for (int slot = 0; slot < maxSlot; slot++) {
			if (handler.getStackInSlot(slot) != null)
				if (handler.getStackInSlot(slot).stackSize == handler.getStackInSlot(slot).getMaxStackSize())
					filledSlots++;
		}
		return filledSlots == maxSlot;
	}

	/**
	 * Gets the correct colour from any item stack using the ore dictionary The item must be registered as a dye
	 * 
	 * @param stack
	 *            The {@link ItemStack} to test
	 * @return The {@link EnumDyeColor} of the {@link ItemStack} to test. If the stack is not registered as a dye, the {@link EnumDyeColor#WHITE} will be used
	 */
	public static EnumDyeColor getColorFromDye(ItemStack stack) {
		for (int id : OreDictionary.getOreIDs(stack)) {
			if (id == OreDictionary.getOreID("dyeBlack"))
				return EnumDyeColor.BLACK;
			if (id == OreDictionary.getOreID("dyeRed"))
				return EnumDyeColor.RED;
			if (id == OreDictionary.getOreID("dyeGreen"))
				return EnumDyeColor.GREEN;
			if (id == OreDictionary.getOreID("dyeBrown"))
				return EnumDyeColor.BROWN;
			if (id == OreDictionary.getOreID("dyeBlue"))
				return EnumDyeColor.BLUE;
			if (id == OreDictionary.getOreID("dyePurple"))
				return EnumDyeColor.PURPLE;
			if (id == OreDictionary.getOreID("dyeCyan"))
				return EnumDyeColor.CYAN;
			if (id == OreDictionary.getOreID("dyeLightGray"))
				return EnumDyeColor.SILVER;
			if (id == OreDictionary.getOreID("dyeGray"))
				return EnumDyeColor.GRAY;
			if (id == OreDictionary.getOreID("dyePink"))
				return EnumDyeColor.PINK;
			if (id == OreDictionary.getOreID("dyeLime"))
				return EnumDyeColor.LIME;
			if (id == OreDictionary.getOreID("dyeYellow"))
				return EnumDyeColor.YELLOW;
			if (id == OreDictionary.getOreID("dyeLightBlue"))
				return EnumDyeColor.LIGHT_BLUE;
			if (id == OreDictionary.getOreID("dyeMagenta"))
				return EnumDyeColor.MAGENTA;
			if (id == OreDictionary.getOreID("dyeOrange"))
				return EnumDyeColor.ORANGE;
			if (id == OreDictionary.getOreID("dyeWhite"))
				return EnumDyeColor.WHITE;
		}
		return EnumDyeColor.WHITE;
	}

	public static boolean checkSurroundingBlocks(World world, IBlockState state) {
		for (int x = -1; x < 2; x++) {
			for (int y = -1; y < 2; y++) {
				for (int z = -1; z < 2; z++) {
					if (world.getBlockState(new BlockPos(x, y, z)) == state)
						return true;
				}
			}
		}
		return false;
	}

	public static boolean checkSurroundingBlocks(World world) {
		for (int x = -1; x < 2; x++) {
			for (int y = -1; y < 2; y++) {
				for (int z = -1; z < 2; z++) {
					if (world.getBlockState(new BlockPos(x, y, z)) != Blocks.AIR)
						return true;
				}
			}
		}
		return false;
	}
}