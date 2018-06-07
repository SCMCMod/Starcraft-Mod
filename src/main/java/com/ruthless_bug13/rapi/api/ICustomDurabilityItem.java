package com.ruthless_bug13.rapi.api;

import net.minecraft.item.ItemStack;

/**
 * @author Ruthless_Bug13
 *
 * Used for items that use custom durability. Can be implemented into CUSTOM durability bars too.
 */
public interface ICustomDurabilityItem 
{
	/**
	 * Gets the durability from @param stack
	 * 
	 * @param stack - Stack to check
	 * @return - Returns  the energy stored in @param stack
	 */
	double GetDurability(ItemStack stack);
	
	/**
	 * Sets the durability of @param stack to @param amount
	 * 
	 * @param stack - Stack to modify
	 * @param amount - Amount to modify by
	 */
    void SetDurability(ItemStack stack, double amount);
    
    /**
     * Gets the max durability for @param stack
     * 
     * @param stack - Stack to check
     * @return - Returns the max energy of @param stack
     */
    double GetMaxDurability(ItemStack stack);
    
    /**
     * Gets the max transfer for @param stack
     * 
     * @param stack - Stack to check
     * @return Returns the max transfer of @param stack
     */
    double GetMaxTransfer(ItemStack stack);
    
    /**
     * Checks if @param stack can receive durability
     * 
     * @param stack - Stack to check
     * @return - Returns true if @param stack can receive durability
     */
    boolean CanReceive(ItemStack stack);
    /**
     * Checks if @param stack can send durability
     * 
     * @param stack - Stack to check
     * @return - Returns true if @param stack can send durability
     */
    boolean CanSend(ItemStack stack);
}