package com.ruthless_bug13.rapi.api;

/**
 * @author Ruthless_Bug13
 * 
 * If extended by a class/interface that uses a minimum/max value, 
 *  it can be used to check if the minimum value is exceeding the max, which will cause an overflow.
 */
public interface IOverFlowable 
{
	/**
	 * Called if a minimum value exceeds the max value.
	 */
	public void OnOverflow();
}