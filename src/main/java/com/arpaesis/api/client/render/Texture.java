package com.arpaesis.api.client.render;

import com.ocelot.api.utils.TextureUtils;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//TODO: MOVE TO CORE MOD
public class Texture extends ResourceLocation
{
	public Texture(ResourceLocation resource)
	{
		this(resource.getNamespace(), resource.getPath());
	}

	public Texture(String location)
	{
		super(location);
	}

	public Texture(String domain, String location)
	{
		super(domain, location);
	}

	@SideOnly(Side.CLIENT)
	public void bind()
	{
		TextureUtils.bindTexture(this);
	}
}