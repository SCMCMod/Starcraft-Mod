package io.github.scmcmod.lib;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * Allows the implementation of additional methods into a class.
 * 
 * @author Ocelot5836
 */

public interface IObjectParsable
{

	byte BYTE = 0;
	byte SHORT = 1;
	byte INTEGER = 2;
	byte FLOAT = 3;
	byte DOUBLE = 4;
	byte LONG = 5;
	byte BOOLEAN = 6;

	/**
	 * Parses a byte from an obj. If the obj is not a string or proper value, it
	 * calls {@link #onParseFail(byte)}.
	 * 
	 * @param obj The obj to parse
	 * @return The parsed value
	 */
	default byte parseByte(Object obj)
	{
		try
		{
			return obj instanceof String ? Byte.parseByte((String) obj) : (byte) obj;
		} catch (Exception e)
		{
			this.onParseFail(BYTE, e);
		}
		return -1;
	}

	/**
	 * Parses a short from an obj. If the obj is not a string or proper value, it
	 * calls {@link #onParseFail(byte)}.
	 * 
	 * @param obj The obj to parse
	 * @return The parsed value
	 */
	default short parseShort(Object obj)
	{
		try
		{
			return obj instanceof String ? Short.parseShort((String) obj) : (short) obj;
		} catch (Exception e)
		{
			this.onParseFail(SHORT, e);
		}
		return -1;
	}

	/**
	 * Parses a int from an obj. If the obj is not a string or proper value, it
	 * calls {@link #onParseFail(byte)}.
	 * 
	 * @param obj The obj to parse
	 * @return The parsed value
	 */
	default int parseInt(Object obj)
	{
		try
		{
			return obj instanceof String ? Integer.parseInt((String) obj) : (int) obj;
		} catch (Exception e)
		{
			this.onParseFail(INTEGER, e);
		}
		return -1;
	}

	/**
	 * Parses a float from an obj. If the obj is not a string or proper value, it
	 * calls {@link #onParseFail(byte)}.
	 * 
	 * @param obj The obj to parse
	 * @return The parsed value
	 */
	default float parseFloat(Object obj)
	{
		try
		{
			return obj instanceof String ? Float.parseFloat((String) obj) : (float) obj;
		} catch (Exception e)
		{
			this.onParseFail(FLOAT, e);
		}
		return -1;
	}

	/**
	 * Parses a double from an obj. If the obj is not a string or proper value, it
	 * calls {@link #onParseFail(byte)}.
	 * 
	 * @param obj The obj to parse
	 * @return The parsed value
	 */
	default double parseDouble(Object obj)
	{
		try
		{
			return obj instanceof String ? Double.parseDouble((String) obj) : (double) obj;
		} catch (Exception e)
		{
			this.onParseFail(DOUBLE, e);
		}
		return -1;
	}

	/**
	 * Parses a long from an obj. If the obj is not a string or proper value, it
	 * calls {@link #onParseFail(byte)}.
	 * 
	 * @param obj The obj to parse
	 * @return The parsed value
	 */
	default long parseLong(Object obj)
	{
		try
		{
			return obj instanceof String ? Long.parseLong((String) obj) : (long) obj;
		} catch (Exception e)
		{
			this.onParseFail(LONG, e);
		}
		return -1;
	}

	/**
	 * Parses a boolean from an obj. If the obj is not a string or proper value, it
	 * calls {@link #onParseFail(byte)}.
	 * 
	 * @param obj The obj to parse
	 * @return The parsed value
	 */
	default boolean parseBoolean(Object obj)
	{
		try
		{
			return obj instanceof String ? Boolean.parseBoolean((String) obj) : (boolean) obj;
		} catch (Exception e)
		{
			this.onParseFail(BOOLEAN, e);
		}
		return false;
	}

	/**
	 * Called when a value is not parsed properly.
	 * 
	 * @param parseType The data type being parsed
	 * @param e The reason the parse failed
	 */
	void onParseFail(byte parseType, Exception e);
}