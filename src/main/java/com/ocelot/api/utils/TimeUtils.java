package com.ocelot.api.utils;

import java.util.Calendar;

/**
 * <em><b>Copyright (c) 2018 Ocelot5836.</b></em> <br>
 * </br>
 * Contains methods that check if the current time is a special event.
 * 
 * @author Ocelot5836
 */
//TODO: MOVE TO CORE MOD
public class TimeUtils
{

	/**
	 * @return If the current time is between the 24 and 26 of December
	 */
	public static boolean isChristmas()
	{
		Calendar calendar = Calendar.getInstance();
		return calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26;
	}

	/**
	 * @return If the current time is October 31
	 */
	public static boolean isHalloween()
	{
		Calendar calendar = Calendar.getInstance();
		return calendar.get(2) + 1 == 10 && calendar.get(5) == 31;
	}
}