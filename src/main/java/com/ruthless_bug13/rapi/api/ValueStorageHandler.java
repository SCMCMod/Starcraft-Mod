package com.ruthless_bug13.rapi.api;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants.NBT;

/*
 * @author Ruthless_Bug13
 * 
 * Used to pull/send data from an ItemStack through NBT data.
 */
//TODO: MOVE TO CORE MOD
public class ValueStorageHandler 
{
	// Data compound prefix to store data in
	public static final String DATAID = "RUTHLESSAPI_NBT_DATA";
	
	/**
	 * Gets the data map of @param stack
	 * 
	 * @param stack - Stack to check
	 * @return Returns the compound of data type DATAID
	 */
	public static NBTTagCompound GetDataMap(ItemStack stack)
	{
		initStack(stack);
		
		return stack.getTagCompound().getCompoundTag(DATAID);
	}
	
	/**
	 * Checks if @stack has data of @param key
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 * @return Returns true if @param stack has @param key
	 */
	public static boolean HasData(ItemStack stack, String key)
	{
		initStack(stack);
		
		return GetDataMap(stack).hasKey(key);
	}
	
	/**
	 * Removes @param key from @param stack
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 */
	public static void RemoveData(ItemStack stack, String key)
	{
		initStack(stack);
		
		GetDataMap(stack).removeTag(key);
	}
	
	/**
	 * Gets a integer from @param stack with @param key
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 * @return Returns the integer stored in @param stack with name @param key
	 */
	public static int GetInt(ItemStack stack, String key)
	{
		initStack(stack);
		
		return GetDataMap(stack).getInteger(key);
	}
	
	/**
	 * Gets a boolean from @param stack with @param key
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 * @return Returns the boolean stored in @param stack with name @param key
	 */
	public static boolean GetBoolean(ItemStack stack, String key)
	{
		initStack(stack);
		
		return GetDataMap(stack).getBoolean(key);
	}
	
	/**
	 * Gets a double from @param stack with @param key
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 * @return double the boolean stored in @param stack with name @param key
	 */
	public static double GetDouble(ItemStack stack, String key)
	{
		initStack(stack);
		
		return GetDataMap(stack).getDouble(key);
	}
	
	/**
	 * Gets a string from @param stack with @param key
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 * @return Returns the string stored in @param stack with name @param key
	 */
	public static String GetString(ItemStack stack, String key)
	{
		initStack(stack);
		
		return GetDataMap(stack).getString(key);
	}
	
	/**
	 * Gets a nbbt compound from @param stack with @param key
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 * @return Returns the nbt compound stored in @param stack with name @param key
	 */
	public static NBTTagCompound GetCompound(ItemStack stack, String key)
	{
		initStack(stack);
		
		return GetDataMap(stack).getCompoundTag(key);
	}
	
	/**
	 * Gets a nbt list from @param stack with @param key
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 * @return Returns the nbt list stored in @param stack with name @param key
	 */
	public static NBTTagList GetList(ItemStack stack, String key)
	{
		initStack(stack);
		
		return GetDataMap(stack).getTagList(key, NBT.TAG_COMPOUND);
	}
	
	/**
	 * Sets a integer in @param stack with name @param key to value @param value
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 * @param value - Value to set
	 */
	public static void SetInt(ItemStack stack, String key, int value)
	{
		initStack(stack);
		
		GetDataMap(stack).setInteger(key, value);
	}
	
	/**
	 * Sets a boolean in @param stack with name @param key to value @param value
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 * @param value - Value to set
	 */
	public static void SetBoolean(ItemStack stack, String key, boolean value)
	{
		initStack(stack);
		
		GetDataMap(stack).setBoolean(key, value);
	}
	
	/**
	 * Sets a double in @param stack with name @param key to value @param value
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 * @param value - Value to set
	 */
	public static void SetDouble(ItemStack stack, String key, double value)
	{
		initStack(stack);
		
		GetDataMap(stack).setDouble(key, value);
	}
	
	/**
	 * Sets a string in @param stack with name @param key to value @param value
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 * @param value - Value to set
	 */
	public static void SetString(ItemStack stack, String key, String value)
	{
		initStack(stack);
		
		GetDataMap(stack).setString(key, value);
	}
	
	/**
	 * Sets a nbt compound in @param stack with name @param key to value @param value
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 * @param value - Value to set
	 */
	public static void SetCompound(ItemStack stack, String key, NBTTagCompound value)
	{
		initStack(stack);
		
		GetDataMap(stack).setTag(key, value);
	}
	
	/**
	 * Sets a nbt list in @param stack with name @param key to value @param value
	 * 
	 * @param stack - Stack to check
	 * @param key - Key to check for
	 * @param value - Value to set
	 */
	public static void SetList(ItemStack stack, String key, NBTTagList value)
	{
		initStack(stack);
		
		GetDataMap(stack).setTag(key, value);
	}
	
	/**
	 * Initializes a stack with NBT data
	 * 
	 * @param stack - Stack to initialize
	 */
	private static void initStack(ItemStack stack)
	{
		if(stack.getTagCompound() == null)
		{
			stack.setTagCompound(new NBTTagCompound());
		}
		
		if(!stack.getTagCompound().hasKey(DATAID))
		{
			stack.getTagCompound().setTag(DATAID, new NBTTagCompound());
		}
	}
}