package io.github.scmcmod.config.category;

import java.util.List;

import io.github.scmcmod.config.SCConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.GuiConfigEntries.CategoryEntry;
import net.minecraftforge.fml.client.config.IConfigElement;


public class CategoryEntryMobSpawning extends CategoryEntry
{

	public CategoryEntryMobSpawning(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement)
	{
		super(owningScreen, owningEntryList, configElement);
	}

	@Override
	protected GuiScreen buildChildScreen()
	{
		Configuration config = SCConfig.getConfig();
		ConfigElement categoryMobSpawning = new ConfigElement(config.getCategory(SCConfig.CATEGORY_NAME_MOB_OPTIONS));
		List<IConfigElement> propertiesOnScreen = categoryMobSpawning.getChildElements();
		String windowTitle = I18n.format("gui.starcraft.config.category.mob.spawning");
		return new GuiConfig(owningScreen, propertiesOnScreen, owningScreen.modID, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart, this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart, windowTitle);
	}
}