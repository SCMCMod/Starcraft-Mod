package com.hypeirochus.scmc.config.category;

import java.util.List;

import com.hypeirochus.scmc.config.StarcraftConfig;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.GuiConfigEntries.CategoryEntry;
import net.minecraftforge.fml.client.config.IConfigElement;

//TODO: MOVE TO CORE MOD
public class CategoryEntryDimensionIds extends CategoryEntry {

	public CategoryEntryDimensionIds(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
		super(owningScreen, owningEntryList, configElement);
	}

	@Override
	protected GuiScreen buildChildScreen() {
		Configuration config = StarcraftConfig.getConfig();
		ConfigElement categoryDimensionIds = new ConfigElement(config.getCategory(StarcraftConfig.CATEGORY_NAME_DIMENSION_IDS));
		List<IConfigElement> propertiesOnScreen = categoryDimensionIds.getChildElements();
		String windowTitle = I18n.format("gui.starcraft.config.category.dimension.ids");
		return new GuiConfig(owningScreen, propertiesOnScreen, owningScreen.modID, this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart, this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart, windowTitle);
	}
}