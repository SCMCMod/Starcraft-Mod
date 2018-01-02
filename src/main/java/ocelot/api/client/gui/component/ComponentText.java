package ocelot.api.client.gui.component;

import net.minecraft.client.Minecraft;

public class ComponentText extends Component {

	private String text;
	private int color;
	private boolean dropShadow;
	private boolean centered;

	public ComponentText(int x, int y, String text, int color) {
		this(x, y, text, color, false);
	}

	public ComponentText(int x, int y, String text, int color, boolean dropShadow) {
		super(x, y, mc.fontRendererObj.getStringWidth(text), 8);
		this.text = text;
		this.color = color;
		this.dropShadow = dropShadow;
	}

	@Override
	public void renderForeground(Minecraft mc, float partialTicks, int mouseX, int mouseY) {
		if (dropShadow) {
			int xx = centered ? width / 2 - mc.fontRendererObj.getStringWidth(text) / 2 : x;
			mc.fontRendererObj.drawString(text, xx, y, color);
		} else {
			int xx = centered ? width / 2 - mc.fontRendererObj.getStringWidth(text) / 2 : x;
			drawString(mc.fontRendererObj, text, xx, y, color);
		}
	}

	public ComponentText center() {
		this.centered = true;
		return this;
	}
}