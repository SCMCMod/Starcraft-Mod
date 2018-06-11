package com.ruthless_bug13.rapi.api.machine;

/*
 * @author Ruthless_Bug13
 */
//TODO: MOVE TO CORE MOD
public interface IFurnaceMachine 
{
	/**
	 * @return - Returns current cook time
	 */
    public int GetCurrentCookTime();
    
    /**
     * @return - Returns the total cook time
     */
    public int GetTotalCookTime();
    
    /**
     * @return - Returns current item burn time
     */
    public int GetCurrentItemBurnTime();
    
    /**
     * @return - Returns true if the IFurnaceMachine is burning
     */
    public boolean IsBurning();
}