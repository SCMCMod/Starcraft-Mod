package ocelot.api.client.gui.component;

import net.minecraft.client.Minecraft;
import ocelot.api.client.gui.book.GuiBookBase;

public class ComponentBookPage extends Component {

	public ComponentText title;
	public ComponentTextArea body;

	public ComponentBookPage(GuiBookBase book) {
		super(book.getX(), book.getY(), book.getWidth(), book.getHeight());
		this.title = new ComponentText(width / 2, 18, "", 0, false).center();
		this.body = new ComponentTextArea(x + 10, 30, width - 16, 15);
	}

	@Override
	public void renderForeground(Minecraft mc, float partialTicks, int mouseX, int mouseY) {
		this.title.renderForeground(mc, partialTicks, mouseX, mouseY);
		this.body.renderForeground(mc, partialTicks, mouseX, mouseY);
	}
}