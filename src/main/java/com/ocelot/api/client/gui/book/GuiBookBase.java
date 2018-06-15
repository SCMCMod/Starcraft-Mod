package com.ocelot.api.client.gui.book;

import java.util.ArrayList;
import java.util.List;

import com.ocelot.api.client.gui.GuiBase;
import com.ocelot.api.client.gui.component.ComponentBookPage;
import com.ocelot.api.client.gui.component.ComponentButton;
import com.ocelot.api.client.gui.component.listener.MouseListener;

import net.minecraft.util.ChatAllowedCharacters;

/**
 * <em><b>Copyright (c) 2018 Ocelot5836.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Contains the basis for a custom book gui.
 * 
 * @author Ocelot5836
 */
//TODO: MOVE TO CORE MOD
public abstract class GuiBookBase extends GuiBase {

	/** The pages inside of the book. */
	protected List<ComponentBookPage> pages;

	protected ComponentButton buttonNext;
	protected ComponentButton buttonLast;

	private int maxPages;
	private int page;

	/**
	 * Constructs a book gui with the specified width and height.
	 * 
	 * @param xSize
	 *            The width of the book
	 * @param ySize
	 *            The height of the book
	 */
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

	/**
	 * Called on initialization to add all the text and modify the pages.
	 */
	protected abstract void initText();

	/**
	 * Sets the current page to the specified page.
	 * 
	 * @param page
	 *            The page to be set
	 */
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
		this.fontRenderer.drawString(page + 1 + "/" + maxPages, xSize - fontRenderer.getStringWidth(page + 1 + "/" + maxPages) - 10, 8, 0);
	}

	/**
	 * Adds a new line onto the next empty page line.
	 * 
	 * @param text
	 *            The text to add
	 */
	protected void addLine(String text) {
		this.addLine(text, 0);
	}

	int pageCounter = 0;
	String carriedOver = "";

	/**
	 * Adds a new line onto the next empty page line with a custom color.
	 * 
	 * @param text
	 *            The text to add
	 * @param color
	 *            The color of the text
	 */
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

	/**
	 * Adds another page to the lost of pages in the book.
	 */
	protected void addPage() {
		pages.add(new ComponentBookPage(this));
		maxPages = pages.size();
	}

	/**
	 * Removes the last page in the book.
	 */
	protected void removePage() {
		if (maxPages > 1) {
			pages.remove(maxPages - 1);
			maxPages = pages.size();
			if (page >= maxPages) {
				page = maxPages;
			}
		}
	}

	/**
	 * Returns the lines from a string passed in.
	 * 
	 * @param string
	 *            The string to split
	 * @param width
	 *            The maximum width the text can be at
	 * @return The list of text to be added to a page
	 */
	protected String[] getLinesFromString(String string, int width) {
		List<String> list = this.fontRenderer.listFormattedStringToWidth(string, width);
		return list.toArray(new String[list.size()]);
	}

	/**
	 * Removes any illegal characters that can be in the string.
	 * 
	 * @param string
	 *            The string to check for illegal characters
	 * @return The string with the characters filtered out
	 */
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