package ga.scmc.client.gui;

import ga.scmc.log.Log;
import ocelot.api.client.gui.book.GuiBookBase;
import ocelot.api.utils.GuiUtils;
import ocelot.api.utils.GuiUtils.GuiType;

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