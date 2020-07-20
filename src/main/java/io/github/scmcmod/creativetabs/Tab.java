package io.github.scmcmod.creativetabs;

import io.github.scmcmod.utils.Assets;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class Tab extends CreativeTabs {

	private String assetName;
	
	public Tab(String label) {
		super(label);
	}

	public Tab(String label, String assetName) {
		super(label);
		setBackgroundImageName(assetName);
	}

	@Override
	public Tab setBackgroundImageName(String assetName) {
		this.assetName = assetName;
		return this;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ResourceLocation getBackgroundImage() {
		return Assets.getTexture(assetName);
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

	@Override
	public ItemStack createIcon() {
		return null;
	}
}
