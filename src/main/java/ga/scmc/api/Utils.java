package ga.scmc.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.language.bm.Lang;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;

import com.google.gson.Gson;

import ga.scmc.Starcraft;
import ga.scmc.items.metaitems.ItemMagazine;
import hypeirochus.api.world.entity.player.inventory.Inventories;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.oredict.OreDictionary;

/**
 * <em><b>Edited by Ocelot5836 for the SCMC mod.</b></em>
 * 
 * <br>
 * </br>
 * 
 * This is where some useful methods will be.
 * 
 * @author CJMinecraft
 */
public class Utils {

	public static final FloatBuffer projection = GLAllocation.createDirectFloatBuffer(16);
	public static final FloatBuffer modelview = GLAllocation.createDirectFloatBuffer(16);

	/**
	 * Makes the variables which will be initialized when there getter method is
	 * called
	 */
	private static Lang lang;

	/**
	 * @return The player's projection matrix
	 */
	public static Matrix4f getProjectionMatrix() {
		GlStateManager.getFloat(GL11.GL_PROJECTION_MATRIX, projection);
		GlStateManager.getFloat(GL11.GL_MODELVIEW_MATRIX, modelview);
		Matrix4f projectionMatrix = (Matrix4f) new Matrix4f().load(projection.asReadOnlyBuffer());
		Matrix4f modelViewMatrix = (Matrix4f) new Matrix4f().load(modelview.asReadOnlyBuffer());
		Matrix4f result = Matrix4f.mul(modelViewMatrix, projectionMatrix, null);
		return result;
	}

	/**
	 * Returns the logger. This makes System.out.println look shabby
	 * 
	 * @return The {@link Logger}
	 */
	public static Logger getLogger() {
		return Starcraft.getLogger();
	}

	/**
	 * Gets the text from the path specified.
	 * 
	 * @param location
	 *            The location of the text
	 * @return an array holding each line of the text
	 */
	public static List<String> loadTextFromFile(ResourceLocation location) {
		List<String> output = new ArrayList<String>();
		try {
			InputStreamReader is = new InputStreamReader(Minecraft.getMinecraft().getResourceManager().getResource(location).getInputStream());
			BufferedReader reader = new BufferedReader(is);
			String line = reader.readLine();
			while (line != null) {
				output.add(line);
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}

	/**
	 * Gets the text from the path specified.
	 * 
	 * @param location
	 *            The location of the text
	 * @return an array holding each line of the text
	 */
	public static List<ColoredText> loadTextJsonFromFile(ResourceLocation location) {
		List<ColoredText> output = new ArrayList<ColoredText>();
		try {
			InputStreamReader is = new InputStreamReader(Minecraft.getMinecraft().getResourceManager().getResource(location).getInputStream());
			Gson gson = new Gson();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}

	/**
	 * Calculate the redstone current from a item stack handler
	 * 
	 * @param handler
	 *            The handler
	 * @return The redstone power
	 */
	public static int calculateRedstone(IItemHandler handler) {
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
		ItemStack remainder = null;
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
	 * Gets the correct colour from any item stack using the ore dictionary The item
	 * must be registered as a dye
	 * 
	 * @param stack
	 *            The {@link ItemStack} to test
	 * @return The {@link EnumDyeColor} of the {@link ItemStack} to test. If the
	 *         stack is not registered as a dye, the {@link EnumDyeColor#WHITE} will
	 *         be used
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

	/**
	 * Recieves the amount of ammo a player has in the inventory.
	 * 
	 * @param player
	 *            The player to search
	 * @param item
	 *            The item that has the tag BulletCount
	 * @return The amount found if the tag was found. If it was not found it returns
	 *         0
	 */
	public static int getTotalAmmo(EntityPlayer player, Item item) {
		int totalCount = 0;
		if (Inventories.playerHas(item, player)) {
			for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
				ItemStack stack = player.inventory.getStackInSlot(i);
				totalCount += ItemMagazine.getBulletCount(stack);
			}
		}
		return totalCount;
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