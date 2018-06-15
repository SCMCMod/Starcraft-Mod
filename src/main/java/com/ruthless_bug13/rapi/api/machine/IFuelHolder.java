package com.ruthless_bug13.rapi.api.machine;

//TODO: MOVE TO CORE MOD
public interface IFuelHolder 
{
	public int GetFuelAmount();

	public int GetMaxFuelAmount();

	public void SetFuelAmount(int data);

	public void SetMaxFuel(int data);
}