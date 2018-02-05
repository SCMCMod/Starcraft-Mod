package ga.scmc.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.util.Timer;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * A utility class for handling all things to do with the game (which normally we don't have access to)
 * @author CJMinecraft
 */
@SideOnly(Side.CLIENT)
public class MinecraftHandler {

    public static Minecraft getMinecraft() {
        return Minecraft.getMinecraft();
    }

    public static RenderManager getRenderManager() {
        return getMinecraft().getRenderManager();
    }

    public static FontRenderer getFontRenderer() {
        return getMinecraft().fontRendererObj;
    }

    public static float getPartialTicks() {
        return ((Timer) ReflectionHelper.getPrivateValue(Minecraft.class, getMinecraft(), "field_71428_T", "timer")).renderPartialTicks;
    }

    public static boolean isDevEnvironment() {
        return (boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment");
    }

}
