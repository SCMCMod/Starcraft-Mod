package ocelot.api.client.gui.book;

import ocelot.api.client.gui.GuiBase;

public abstract class GuiBookBase extends GuiBase {

	public GuiBookBase(int xSize, int ySize) {
		super(xSize, ySize);
	}

	public GuiBookBase(int xSize, int ySize, boolean renderDefaultBackground) {
		super(xSize, ySize, renderDefaultBackground);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void renderGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void renderCenterLayer(int mouseX, int mouseY) {

	}

	@Override
	protected void renderGuiForegroundLayer(int mouseX, int mouseY) {

	}
}