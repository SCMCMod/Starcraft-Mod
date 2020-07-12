package io.github.scmcmod.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import io.github.scmcmod.SCConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.DummyConfigElement.DummyCategoryElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;


public class SCConfigGuiFactory implements IModGuiFactory
{

	@Override
	public void initialize(Minecraft minecraftInstance)
	{
	}

	@Override
	public boolean hasConfigGui()
	{
		return true;
	}

	@Override
	public GuiScreen createConfigGui(GuiScreen parentScreen)
	{
		return new SCConfigGui(parentScreen);
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
	{
		return null;
	}

	public static class SCConfigGui extends GuiConfig
	{

		public SCConfigGui(GuiScreen parentScreen)
		{
			super(parentScreen, getConfigElements(), SCConstants.MODID, false, false, I18n.format("gui.starcraft.config.main_title"));
		}

		private static List<IConfigElement> getConfigElements()
		{
			List<IConfigElement> list = new ArrayList<IConfigElement>();
			for (int i = 0; i < SCConfig.categories.size(); i++)
			{
				Category category = SCConfig.categories.get(i);
				list.add(new DummyCategoryElement(category.getTranslatedName(), category.getFormattedName(), category.getEntryClass()));
			}
			return list;
		}
	}
}