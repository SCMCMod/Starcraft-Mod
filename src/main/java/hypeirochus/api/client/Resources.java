package hypeirochus.api.client;

import ga.scmc.lib.Library;
import hypeirochus.api.client.render.Texture;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Resources {
	public static final Texture BLANK = new Texture(Library.MODID, "textures/misc/blank.png");
}