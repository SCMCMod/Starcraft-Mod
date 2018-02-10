package ocelot.api.client.gui.component;

import net.minecraft.client.Minecraft;

public class ComponentText extends Component {

	private String	text;
	private int		color;
	private boolean	dropShadow;
	private boolean	centered;

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
			int xx = centered ? x - mc.fontRendererObj.getStringWidth(text) / 2 : x;
			drawString(mc.fontRendererObj, text, xx, y, color);
		} else {
			int xx = centered ? x - mc.fontRendererObj.getStringWidth(text) / 2 : x;
			mc.fontRendererObj.drawString(text, xx, y, color);
		}
	}

	public ComponentText center() {
		this.centered = true;
		return this;
	}

	public String getText() {
		return text;
	}

	public int getColor() {
		return color;
	}

	public boolean hasDropShadow() {
		return dropShadow;
	}

	public boolean isCentered() {
		return centered;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public void setDropShadow(boolean dropShadow) {
		this.dropShadow = dropShadow;
	}
}