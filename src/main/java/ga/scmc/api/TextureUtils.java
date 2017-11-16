package ga.scmc.api;

import java.awt.image.BufferedImage;

import ga.scmc.client.renderer.RenderUtil;
import ga.scmc.lib.Library;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * @author Ocelot5836
 */
public class TextureUtils {

	private static final Minecraft MC = Minecraft.getMinecraft();

	/**
	 * Creates a texture from a buffered image.
	 * 
	 * @param image
	 *            The image to become a texture
	 * @return The {@link ResourceLocation} to that texture
	 */
	public static ResourceLocation createBufferedImageTexture(BufferedImage image) {
		return MC.getTextureManager().getDynamicTextureLocation(" ", new DynamicTexture(image));
	}

	/**
	 * Deletes the specified image from memory.
	 * 
	 * @param image
	 *            The image to delete
	 */
	public static void deleteTexture(ResourceLocation texture) {
		MC.getTextureManager().deleteTexture(texture);
	}

	/**
	 * Binds the specified image.
	 * 
	 * @param image
	 *            The image to bind
	 */
	public static void bindTexture(ResourceLocation texture) {
		RenderUtil.bindTexture(texture);
	}

	/**
	 * Binds a texture using the specified domain and path.
	 * 
	 * @param domain
	 *            The domain of the texture
	 * @param path
	 *            The path to the texture
	 */
	public static void bindTexture(String domain, String path) {
		bindTexture(new ResourceLocation(domain, path));
	}

	/**
	 * Binds a texture using the specified path.
	 * 
	 * @param path
	 *            The path to the texture
	 */
	public static void bindTexture(String path) {
		bindTexture(Library.MODID, path);
	}
}