package com.arpaesis.scmc.config;

import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.client.config.GuiConfigEntries.CategoryEntry;

//TODO: MOVE TO CORE MOD
public class Category
{

	private String name;
	private String formattedName;
	private Class<? extends CategoryEntry> entryClass;

	public Category(String name, Class<? extends CategoryEntry> entryClass)
	{
		this(name, "gui.starcraft.config.category." + name, entryClass);
	}

	public Category(String name, String formattedName, Class<? extends CategoryEntry> entryClass)
	{
		this.name = name;
		this.formattedName = formattedName;
		this.entryClass = entryClass;
	}

	public String getName()
	{
		return name;
	}

	public String getFormattedName()
	{
		return formattedName;
	}

	public String getTranslatedName()
	{
		return I18n.format(formattedName);
	}

	public Class<? extends CategoryEntry> getEntryClass()
	{
		return entryClass;
	}
}