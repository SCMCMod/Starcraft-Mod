package ga.scmc.client.gui;

import ga.scmc.items.ItemLog.EnumLogType;
import ocelot.api.client.gui.book.GuiBookBase;
import ocelot.api.utils.GuiUtils;
import ocelot.api.utils.GuiUtils.EnumGuiType;

public class GuiLog extends GuiBookBase {

	private EnumLogType type;

	public GuiLog(EnumLogType type) {
		super(147, 180);
		this.type = type;
	}

	@Override
	public void initText() {
		this.title.setText("This is a title here");
		this.addLine("blah");
		this.addLine("and BLAH");
		this.addLine("lollllllllllllolololololololololololollololoocelot");
		this.addLine("This is a really long line of text and should be wrapped around the sides of the book so it doesn't go off of the gui...", 0xff00ff);
		this.addLine("This book is only temporary and will need to have a lot of fixes...", 0x7f007f);
		this.addLine("This text should go onto the second page once it is implemented. that should be easy once I added pages and page buttons to increment the pages...", 0x074607);
	addPage();
	}

	@Override
	protected void renderGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GuiUtils.drawCustomSizeGui(guiLeft, guiTop, xSize, ySize, EnumGuiType.BOOK);
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