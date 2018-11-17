package com.arpaesis.scmc.entity.living;

public interface IMorphResult
{

	default int getMorphTime()
	{
		return secondsToTicks(85);
	}

	static int secondsToTicks(int seconds)
	{
		return seconds * 20;
	}

}