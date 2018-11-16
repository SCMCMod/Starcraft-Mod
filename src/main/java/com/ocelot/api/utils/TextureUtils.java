package com.ocelot.api.utils;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.ResourceLocation;

/**
 * <em><b>Copyright (c) 2018 Ocelot5836.</b></em> <br>
 * </br>
 * This class holds methods to manage textures easily.
 * 
 * @author Ocelot5836
 */
// TODO: MOVE TO CORE MOD
public class TextureUtils
{

	private static Minecraft mc = Minecraft.getMinecraft();

	private static Map<String, ResourceLocation> textures = new HashMap<String, ResourceLocation>();

	/**
	 * Creates a texture from a buffered image.
	 * 
	 * @param image The image to become a texture
	 * @return The {@link ResourceLocation} to that texture
	 */
	public static ResourceLocation createBufferedImageTexture(BufferedImage image)
	{
		return mc.getTextureManager().getDynamicTextureLocation(" ", new DynamicTexture(image));
	}

	/**
	 * Creates a texture from a buffered image.
	 * 
	 * @param name The name of this texture
	 * @param image The image to become a texture
	 * @return The {@link ResourceLocation} to that texture using the specified name
	 */
	public static ResourceLocation createBufferedImageTexture(String name, BufferedImage image)
	{
		return mc.getTextureManager().getDynamicTextureLocation(name, new DynamicTexture(image));
	}

	/**
	 * Deletes the specified texture from memory.
	 * 
	 * @param texture The texture to delete
	 */
	public static void deleteTexture(ResourceLocation texture)
	{
		mc.getTextureManager().deleteTexture(texture);
	}

	/**
	 * Binds the specified texture.
	 * 
	 * @param texture The texture to bind
	 */
	public static void bindTexture(ResourceLocation texture)
	{
		mc.getTextureManager().bindTexture(texture);
	}

	/**
	 * Binds a texture using the specified domain and path.
	 * 
	 * @param domain The domain of the texture
	 * @param path The path to the texture
	 */
	public static void bindTexture(String domain, String path)
	{
		String locationString = domain + ":" + path;
		if (textures.containsKey(locationString))
		{
			mc.getTextureManager().bindTexture(textures.get(locationString));
		} else
		{
			ResourceLocation location = new ResourceLocation(locationString);
			textures.put(locationString, location);
			mc.getTextureManager().bindTexture(location);
		}
	}

	/**
	 * Binds a texture using the specified path. This does not support a custom id
	 * so use either {@link TextureUtils#bindTexture(String, String)} or
	 * {@link TextureUtils#bindTexture(ResourceLocation)} if you want to use a
	 * different id than minecraft.
	 * 
	 * @param path The path to the texture
	 */
	public static void bindTexture(String path)
	{
		String locationString = "minecraft:" + path;
		if (textures.containsKey(locationString))
		{
			mc.getTextureManager().bindTexture(textures.get(locationString));
		} else
		{
			ResourceLocation location = new ResourceLocation(locationString);
			textures.put(locationString, location);
			mc.getTextureManager().bindTexture(location);
		}
	}

	/**
	 * @return The default missing image texture
	 */
	public static TextureAtlasSprite getMissingSprite()
	{
		return mc.getTextureMapBlocks().getMissingSprite();
	}
}