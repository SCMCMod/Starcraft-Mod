package com.ocelot.api.client.gui.book;

import java.util.ArrayList;
import java.util.List;

import com.ocelot.api.client.gui.GuiBase;
import com.ocelot.api.client.gui.component.ComponentBookPage;
import com.ocelot.api.client.gui.component.ComponentButton;
import com.ocelot.api.client.gui.component.listener.MouseListener;

import net.minecraft.util.ChatAllowedCharacters;

public abstract class GuiBookBase extends GuiBase {

	protected List<ComponentBookPage>	pages;

	protected ComponentButton			buttonNext;
	protected ComponentButton			buttonLast;

	private int							maxPages;
	private int							page;

	public GuiBookBase(int xSize, int ySize) {
		super(xSize, ySize);
		pages = new ArrayList<ComponentBookPage>();
		pages.add(new ComponentBookPage(this));
	}

	@Override
	public void initGui() {
		this.page = 0;
		this.initText();
		setPage(0);
		super.initGui();

		buttonNext = new ComponentButton(guiLeft + xSize - 40, guiTop + ySize + 4, 40, 20, "Next");
		buttonNext.setMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(int mouseButton, int mouseX, int mouseY) {

			}

			@Override
			public void mousePressed(int mouseButton, int mouseX, int mouseY) {
				setPage(page + 1);
			}
		});
		addComponent(buttonNext);

		buttonLast = new ComponentButton(guiLeft, guiTop + ySize + 4, 40, 20, "Last");
		buttonLast.setMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(int mouseButton, int mouseX, int mouseY) {

			}

			@Override
			public void mousePressed(int mouseButton, int mouseX, int mouseY) {
				setPage(page - 1);
			}
		});
		addComponent(buttonLast);

		for (int i = 0; i < pages.size(); i++) {
			addComponent(pages.get(i));
		}

		this.maxPages = pages.size();
	}

	protected abstract void initText();

	protected void setPage(int page) {
		if (page >= maxPages - 1)
			page = maxPages - 1;
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

	int		pageCounter	= 0;
	String	carriedOver	= "";

	protected void addLine(String text, int color) {
		if (this.pages.get(pageCounter).body.isTextRoom()) {
			carriedOver = this.pages.get(pageCounter).body.addText(text, color);
		} else {
			pageCounter++;
			if (pageCounter >= maxPages)
				addPage();
			carriedOver = this.pages.get(pageCounter).body.addText(text, color);
		}

		if (!carriedOver.isEmpty()) {
			this.addLine(carriedOver, color);
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
			if (page >= maxPages) {
				page = maxPages;
			}
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