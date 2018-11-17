package com.arpaesis.scmc.capabilities;

public class Shield implements IShield

{

	private double shield = 10;

	@Override
	public void set(double shield)
	{
		this.shield = shield;
	}

	@Override
	public double getShield()
	{
		return shield;
	}

}