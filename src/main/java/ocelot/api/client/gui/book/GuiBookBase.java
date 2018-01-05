package ocelot.api.client.gui.book;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.ChatAllowedCharacters;
import ocelot.api.client.gui.GuiBase;
import ocelot.api.client.gui.component.ComponentBookPage;

public abstract class GuiBookBase extends GuiBase {

	protected List<ComponentBookPage> pages;
	protected int page;
	protected int maxPages;

	public GuiBookBase(int xSize, int ySize) {
		super(xSize, ySize);
		pages = new ArrayList<ComponentBookPage>();
		pages.add(new ComponentBookPage(this));
	}

	@Override
	public void initGui() {
		this.initText();
		super.initGui();

		for (int i = 0; i < pages.size(); i++) {
			addComponent(pages.get(i));
		}

		this.page = 0;
		this.maxPages = 1;
	}

	protected abstract void initText();

	@Override
	public void updateScreen() {
		super.updateScreen();
	}

	@Override
	protected void renderGuiForegroundLayer(int mouseX, int mouseY) {
		this.fontRendererObj.drawString(page + 1 + "/" + maxPages, xSize - fontRendererObj.getStringWidth(page + "/" + maxPages) - 10, 8, 0);
	}

	protected void setBody(String... body) {

	}

	protected void addLine(String text) {
		this.addLine(text, 0);
	}

	protected void addLine(String text, int color) {
		if (this.pages.get(page).body.isTextRoom()) {
			this.pages.get(page).body.addText(text, color);
		} else {
			addPage();
		}
	}

	protected void addPage() {
		maxPages += 1;
		pages.add(new ComponentBookPage(this));
	}

	protected String[] getLinesFromString(String string, int width) {
		List<String> list = this.fontRendererObj.listFormattedStringToWidth(string, width);
		return list.toArray(new String[list.size()]);
	}

	protected String makeStringValid(String string) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			if (ChatAllowedCharacters.isAllowedCharacter(string.charAt(i))) {
				builder.append(string.charAt(i));
			} else {
				System.out.println(string.charAt(i) + " is not a valid character");
			}
		}
		return builder.toString();
	}
}