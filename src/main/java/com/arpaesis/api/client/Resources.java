package com.arpaesis.api.client;

import com.arpaesis.api.client.render.Texture;
import com.arpaesis.scmc.Starcraft;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//TODO: MOVE TO CORE MOD
@SideOnly(Side.CLIENT)
public class Resources
{
	public static final Texture BLANK = new Texture(Starcraft.MOD_ID, "textures/misc/blank.png");
}