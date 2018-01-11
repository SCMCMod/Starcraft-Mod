package ocelot.api.client.gui;

import ga.scmc.network.NetworkHandler;
import ga.scmc.network.message.MessageSpawnItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ocelot.api.client.gui.component.Component;
import ocelot.api.client.gui.component.ComponentButton;
import ocelot.api.client.gui.component.ComponentItem;
import ocelot.api.client.gui.component.listener.MouseListener;
import ocelot.api.utils.GuiUtils;
import ocelot.api.utils.GuiUtils.GuiType;

/**
 * A gui that can be used for reference when trying to create a new custom one.
 * 
 * @author Ocelot5836
 *
 */
public class GuiTest extends GuiBase {

	private Component item;
	private Component button;

	public GuiTest() {
		super(150, 150);
	}

	@Override
	public void initGui() {
		super.initGui();
		ItemStack stack = new ItemStack(Items.EMERALD, 2048, 0);
		item = new ComponentItem(stack, 0, 0, 16, 16);
		item.setMouseListener(new MouseListener() {
			@Override
			public void mousePressed(int mouseButton, int mouseX, int mouseY) {
				
			}
			
			@Override
			public void mouseReleased(int mouseButton, int mouseX, int mouseY) {
				
			}
		});
		
		button = new ComponentButton(xSize / 2 - 40, ySize - 25, 80, 20, "Test");
		button.setMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(int mouseButton, int mouseX, int mouseY) {
				
			}
			
			@Override
			public void mousePressed(int mouseButton, int mouseX, int mouseY) {
				Minecraft.getMinecraft().player.closeScreen();
			}
		});
		
		addComponent(item);
		addComponent(button);
	}

	@Override
	protected void renderGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GuiUtils.drawCustomSizeGui(guiLeft, guiTop, xSize, ySize, GuiType.BOOK);
	}

	@Override
	protected void renderCenterLayer(int mouseX, int mouseY) {

	}

	@Override
	protected void renderGuiForegroundLayer(int mouseX, int mouseY) {

	}
}