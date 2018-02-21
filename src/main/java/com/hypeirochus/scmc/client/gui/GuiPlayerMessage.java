package com.hypeirochus.scmc.client.gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.hypeirochus.scmc.network.NetworkHandler;
import com.hypeirochus.scmc.network.message.MessageKillEntity;
import com.ocelot.api.client.gui.GuiBase;
import com.ocelot.api.client.gui.component.Component;
import com.ocelot.api.client.gui.component.ComponentTextButton;
import com.ocelot.api.client.gui.component.listener.MouseListener;
import com.ocelot.api.utils.GuiUtils;
import com.ocelot.api.utils.GuiUtils.GuiType;

import net.minecraft.util.text.TextFormatting;

public class GuiPlayerMessage extends GuiBase {

	private EnumPlayerMessageType	message;

	private List<String>			currentText	= new ArrayList<String>();
	private List<String>			textLines;
	private StringBuilder			builder		= new StringBuilder();
	private int						nextLine;
	private int						updateCount;

	public GuiPlayerMessage(EnumPlayerMessageType message) {
		super(300, 100, false);
		this.message = message;
	}

	@Override
	public void initGui() {
		super.initGui();
		guiTop = height - ySize;

		reloadText();
	}

	private void reloadText() {
		clearComponents();
		currentText = new ArrayList<String>();
		nextLine = 0;
		updateCount = 0;
		textLines = fontRenderer.listFormattedStringToWidth(message.getText(), xSize / 2 - 16);
		for (int i = 0; i < textLines.size(); i++) {
			currentText.add("");
		}
		alpha = 0;
		builder.append(textLines.get(nextLine).charAt(0));
		for (int i = 0; i < message.options.length; i++) {
			Component c = new ComponentTextButton(xSize / 2 + 16, 8 + i * 9, message.options[i], TextFormatting.ITALIC + ">" + message.options[i], 0x000000, 0x555555);
			c.setVisible(false);
			final int id = i;
			c.setMouseListener(new MouseListener() {
				@Override
				public void mouseReleased(int mouseButton, int mouseX, int mouseY) {

				}

				@Override
				public void mousePressed(int mouseButton, int mouseX, int mouseY) {
					switch (message) {
					case TEST:
						if (id == 0) {
							message = EnumPlayerMessageType.TEST1;
							reloadText();
						}
						break;
					case TEST1:
						if (id == 1) {
							message = EnumPlayerMessageType.TEST;
							reloadText();
						}
						break;
					case CONFIRMATION:
						if (id == 0) {
							message = EnumPlayerMessageType.TEST;
							reloadText();
						}
						if (id == 3) {
							mc.player.closeScreen();
							NetworkHandler.sendToServer(new MessageKillEntity(mc.player));
						}
						break;
					}
				}
			});
			addComponent(c);
		}
	}

	int alpha = 0;

	@Override
	public void updateScreen() {
		super.updateScreen();
		updateCount++;
		if (alpha < 255) {
			alpha += 15;
			if (alpha > 255)
				alpha = 255;
			for (int i = 0; i < getComponents().size(); i++) {
				if (getComponents().get(i) instanceof ComponentTextButton) {
					ComponentTextButton button = (ComponentTextButton) getComponents().get(i);
					Color c = new Color(button.getColor());
					button.setColor(new Color(c.getRed(), c.getGreen(), c.getBlue(), alpha).getRGB());
					Color c1 = new Color(button.getHighlightColor());
					button.setHighlightColor(new Color(c1.getRed(), c1.getGreen(), c1.getBlue(), alpha).getRGB());
					button.setVisible(true);
				}
			}
		}
		int speed = 20;
		if (nextLine < textLines.size()) {
			if (updateCount >= textLines.get(nextLine).length()) {
				nextLine++;
				updateCount = 0;
				builder = new StringBuilder();
			}
			if (nextLine < textLines.size()) {
				builder.append(textLines.get(nextLine).charAt(updateCount));
				currentText.set(nextLine, "");
				currentText.set(nextLine, builder.toString());
			}
		}
	}

	@Override
	protected void renderGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GuiUtils.drawCustomSizeGui(guiLeft - 8, guiTop, xSize / 2, ySize, GuiType.DEFAULT);
		GuiUtils.drawCustomSizeGui(guiLeft + xSize / 2 + 8, guiTop, xSize / 2, ySize, GuiType.DEFAULT);
	}

	@Override
	protected void renderGuiForegroundLayer(int mouseX, int mouseY) {
		for (int i = 0; i < currentText.size(); i++) {
			fontRenderer.drawString(currentText.get(i), 0, 8 + 8 * i, 0);
		}
	}

	public enum EnumPlayerMessageType {
		TEST("This is a testing message", "I hate you", "U smell like fritos"),
		TEST1("This is yet another testing message", "Why do you do this to me?", "Go away", "this sux"),
		CONFIRMATION("How much do you like this mod?", "A lot!", "ehh I've seen better", "this mod is not too great", "this mod is a piece of shit");

		private String		text;
		private String[]	options;

		private EnumPlayerMessageType(String text, String... options) {
			this.text = text;
			this.options = options;
		}

		public String getText() {
			return text;
		}

		public String[] getOptions() {
			return options;
		}
	}
}