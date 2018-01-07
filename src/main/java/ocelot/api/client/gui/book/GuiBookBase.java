package ocelot.api.client.gui.book;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.ChatAllowedCharacters;
import ocelot.api.client.gui.GuiBase;
import ocelot.api.client.gui.component.ComponentBookPage;

public abstract class GuiBookBase extends GuiBase {

	protected List<ComponentBookPage> pages;

	private int maxPages;
	private int page;

	public GuiBookBase(int xSize, int ySize) {
		super(xSize, ySize);
		pages = new ArrayList<ComponentBookPage>();
		pages.add(new ComponentBookPage(this));
	}

	@Override
	public void initGui() {
		this.page = 0;
		this.initText();
		super.initGui();

		for (int i = 0; i < pages.size(); i++) {
			addComponent(pages.get(i));
		}

		this.maxPages = pages.size();
	}

	protected abstract void initText();

	protected void setPage(int page) {
		page -= 1;
		if (page > maxPages)
			page = maxPages;
		if (page < 0)
			page = 0;
		this.page = page;

		for (int i = 0; i < pages.size(); i++) {
			pages.get(i).setVisible(false);
		}
		pages.get(page).setVisible(true);
	}

	@Override
	public void updateScreen() {
		super.updateScreen();
	}

	@Override
	protected void renderGuiForegroundLayer(int mouseX, int mouseY) {
		this.fontRendererObj.drawString(page + 1 + "/" + maxPages, xSize - fontRendererObj.getStringWidth(page + 1 + "/" + maxPages) - 10, 8, 0);
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
		pages.add(new ComponentBookPage(this));
		maxPages = pages.size();
	}

	protected void removePage() {
		if (maxPages > 1) {
			pages.remove(maxPages - 1);
			maxPages = pages.size();
		}
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
			}
		}
		return builder.toString();
	}
}