package ga.scmc.client.gui;

import ga.scmc.api.Utils;
import ga.scmc.items.ItemLog.EnumLogType;
import ocelot.api.client.gui.book.GuiBookBase;
import ocelot.api.utils.GuiUtils;
import ocelot.api.utils.GuiUtils.GuiType;

public class GuiLog extends GuiBookBase {

	private EnumLogType type;

	public GuiLog(EnumLogType type) {
		super(147, 180);
		this.type = type;
	}

	@Override
	public void initText() {
		this.pages.get(0).title.setText(type.getName());
		for (int i = 0; i < type.getText().size(); i++) {
			this.addLine(type.getText().get(i));
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