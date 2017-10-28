package ga.scmc.lib;

import java.util.List;

import ga.scmc.client.renderer.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 */
public class GuiUtils {

	private static Minecraft mc = Minecraft.getMinecraft();

	public static void playButtonClick() {
		mc.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
	}

	public static void renderItem(ItemStack stack, int x, int y) {
		try {
			mc.getRenderItem().renderItemAndEffectIntoGUI(stack, x, y);
		} catch (Exception e) {
		}
	}

	public static void drawLines(List<String> lines, int posX, int posY, int color) {
		for (int i = 0; i < lines.size(); i++) {
			mc.fontRendererObj.drawString(lines.get(i), posX, posY + (i * 8), color);
		}
	}

	public static boolean isMouseInside(int posX, int posY, int width, int height, int mouseX, int mouseY) {
		if (mouseX >= posX && mouseX <= (posX + width) && mouseY >= posY && mouseY < (posY + height)) {
			return true;
		}
		return false;
	}

	public static void bindTexture(String domain, String path) {
		RenderUtil.bindTexture(new ResourceLocation(domain, path));
	}

	public static void bindTexture(String path) {
		bindTexture(Library.MODID, path);
	}
}