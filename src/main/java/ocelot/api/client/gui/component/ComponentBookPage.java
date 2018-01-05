package ocelot.api.client.gui.component;

import ocelot.api.client.gui.book.GuiBookBase;

public class ComponentBookPage extends Component {

	public ComponentText title;
	public ComponentTextArea body;

	public ComponentBookPage(GuiBookBase book) {
		super(book.getX(), book.getY(), book.getWidth(), book.getHeight());
		this.title = new ComponentText(width / 2, 18, "", 0, false).center();
		this.body = new ComponentTextArea(x + 10, 30, width - 16, 15);
	}
}