package ocelot.api.client.gui.component;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import ocelot.api.client.gui.book.GuiBookBase;

public class ComponentBookPage extends Component {

	public ComponentText title;
	public ComponentTextArea body;
	public List<Component> components;

	public ComponentBookPage(GuiBookBase book) {
		super(book.getX(), book.getY(), book.getWidth(), book.getHeight());
		this.title = new ComponentText(width / 2, 18, "", 0, false).center();
		this.body = new ComponentTextArea(x + 10, 30, width - 16, 15);
		this.components = new ArrayList<Component>();
		this.components.add(title);
		this.components.add(body);
	}

	@Override
	public void renderBackground(Minecraft mc, float partialTicks, int mouseX, int mouseY) {
		for (int i = 0; i < components.size(); i++) {
			components.get(i).renderBackground(mc, partialTicks, mouseX, mouseY);
		}
	}

	@Override
	public void renderForeground(Minecraft mc, float partialTicks, int mouseX, int mouseY) {
		for (int i = 0; i < components.size(); i++) {
			components.get(i).renderForeground(mc, partialTicks, mouseX, mouseY);
		}
	}

	@Override
	public void renderTooltips(int mouseX, int mouseY) {
		for (int i = 0; i < components.size(); i++) {
			components.get(i).renderTooltips(mouseX, mouseY);
		}
	}

	public ComponentBookPage addComponent(Component c) {
		if (!(c instanceof ComponentBookPage)) {
			components.add(c);
		}
		return this;
	}
}