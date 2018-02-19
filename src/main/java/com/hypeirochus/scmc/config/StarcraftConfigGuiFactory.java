package com.hypeirochus.scmc.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import com.hypeirochus.scmc.Starcraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.ConfigGuiType;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.minecraftforge.fml.client.config.GuiConfigEntries.IConfigEntry;
import net.minecraftforge.fml.client.config.GuiEditArrayEntries.IArrayEntry;
import net.minecraftforge.fml.client.config.DummyConfigElement.DummyCategoryElement;

public class StarcraftConfigGuiFactory implements IModGuiFactory {

	@Override
	public void initialize(Minecraft minecraftInstance) {
	}

	@Override
	public boolean hasConfigGui() {
		return true;
	}

	@Override
	public GuiScreen createConfigGui(GuiScreen parentScreen) {
		return new StarcraftConfigGui(parentScreen);
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		return null;
	}

	public static class StarcraftConfigGui extends GuiConfig {

		public StarcraftConfigGui(GuiScreen parentScreen) {
			super(parentScreen, getConfigElements(), Starcraft.MOD_ID, false, false, I18n.format("gui.starcraft.config.main_title"));
		}

		private static List<IConfigElement> getConfigElements() {
			List<IConfigElement> list = new ArrayList<IConfigElement>();
			for(int i = 0; i < StarcraftConfig.categories.size(); i++) {
				Category category = StarcraftConfig.categories.get(i);
				list.add(new DummyCategoryElement(category.getTranslatedName(), category.getFormattedName(), category.getEntryClass()));
			}
			return list;
		}
	}
}