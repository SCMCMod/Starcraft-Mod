package com.hypeirochus.api.client;

import com.hypeirochus.api.client.render.Texture;
import com.hypeirochus.scmc.lib.Library;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Resources {
	public static final Texture BLANK = new Texture(Library.MODID, "textures/misc/blank.png");
}