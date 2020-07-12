package com.arpaesis.scmc.config.category;

import java.util.List;

import com.arpaesis.scmc.config.SCConfig;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.GuiConfigEntries.CategoryEntry;
import net.minecraftforge.fml.client.config.IConfigElement;


public class CategoryEntryGeneral extends CategoryEntry
{

	public CategoryEntryGeneral(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement)
	{
		super(owningScreen, owningEntryList, configElement);
	}

	@Override
	protected GuiScreen buildChildScreen()
	{
		Configuration config = SCConfig.getConfig();
		ConfigElement categoryGeneral = new ConfigElement(config.getCategory(SCConfig.CATEGORY_NAME_GENERAL));
		List<IConfigElement> propertiesOnScreen = categoryGeneral.getChildElements();
		String windowTitle = I18n.format("gui.starcraft.config.category.general");
		return new GuiConfig(owningScreen, propertiesOnScreen, owningScreen.modID, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart, this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart, windowTitle);
	}
}