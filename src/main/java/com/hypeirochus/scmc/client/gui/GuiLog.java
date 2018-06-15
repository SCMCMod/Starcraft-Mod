package com.hypeirochus.scmc.client.gui;

import com.hypeirochus.scmc.log.Log;
import com.ocelot.api.client.gui.book.GuiBookBase;
import com.ocelot.api.utils.GuiUtils;
import com.ocelot.api.utils.GuiUtils.GuiType;

//TODO: MOVE TO CORE MOD
public class GuiLog extends GuiBookBase {

	private Log log;

	public GuiLog(Log log) {
		super(147, 180);
		this.log = log;
	}

	@Override
	public void initText() {
		this.pages.get(0).title.setText(log.getTitle());
		for (int i = 0; i < log.getText().size(); i++) {
			this.addLine(log.getText().get(i));
		}
	}

	@Override
	protected void renderGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GuiUtils.drawCustomSizeGui(guiLeft, guiTop, xSize, ySize, GuiType.BOOK);
	}

	@Override
	protected void renderCenterLayer(int mouseX, int mouseY) {
		super.renderCenterLayer(mouseX, mouseY);
	}

	@Override
	protected void renderGuiForegroundLayer(int mouseX, int mouseY) {
		super.renderGuiForegroundLayer(mouseX, mouseY);
	}
}