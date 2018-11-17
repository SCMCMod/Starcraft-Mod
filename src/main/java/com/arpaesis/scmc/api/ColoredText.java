package com.arpaesis.scmc.api;

import com.google.gson.annotations.SerializedName;

//TODO: MOVE TO CORE MOD
public class ColoredText
{

	@SerializedName("text")
	private String text;
	@SerializedName("color")
	private int color;

	public ColoredText(String text, int color)
	{
		this.text = text;
		this.color = color;
	}

	public String getText()
	{
		return text;
	}

	public int getColor()
	{
		return color;
	}

	public void setText(String text)
	{
		this.text = text;
	}

	public void setColor(int color)
	{
		this.color = color;
	}
}