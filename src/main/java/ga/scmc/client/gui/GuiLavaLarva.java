package ga.scmc.client.gui;

import java.io.IOException;

import ga.scmc.Starcraft;
import ga.scmc.client.gui.element.LavaLarvaOption;
import ga.scmc.entity.living.EntityLarva;
import ga.scmc.lib.GuiUtils;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

/**
 * @since 5.1
 * @author Ocelot5836
 */
public class GuiLavaLarva extends BasicGui {

	public static GuiLavaLarva instance;
	
	/** The player being traded with. */
	private EntityPlayer customer;
	private EntityLarva larva;

	private LavaLarvaOption base;
	private LavaLarvaOption test;

	public GuiLavaLarva(EntityPlayer player) {
		this.customer = player;
	}

	//After this is called in EntityLarva.class, u can manipulate what happens to the larva instance by calling the class scope larva object, and doing something like setMorphKey or w/e
	public void createGui(Object mod, int modGuiId, World world, EntityPlayer player, int x, int y, int z, EntityLarva larva)
    {
        player.openGui(Starcraft.instance, GuiHandler.SHOP_ID, world, (int) player.posX, (int) player.posY, (int) player.posZ);
        this.larva = larva;
    }
	
	@Override
	public void initGui() {
		xSize = 136;
		ySize = 125;
		super.initGui();

		base = new LavaLarvaOption(0, 0, guiLeft + 5, guiTop + 5).unlock().setTooltip(TextFormatting.GOLD + "Base,This is the,base of this,system.", ",");
		test = new LavaLarvaOption(base, 1, 1, guiLeft + 35, guiTop + 5).setTooltip(TextFormatting.GOLD + "Test,Obtain this by,doing jack shit.", ",");

		buttonList.clear();
		buttonList.add(base);
		buttonList.add(test);
		buttonList.add(new LavaLarvaOption(test, 1, 1, guiLeft + 65, guiTop + 5));
	}

	@Override
	public void drawGuiBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		bindGuiTexture();
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

	@Override
	protected void drawGuiForegroundLayer(int mouseX, int mouseY) {

	}

	@Override
	protected void drawTooltips(int mouseX, int mouseY) {
		for (GuiButton b : buttonList) {
			if (b instanceof LavaLarvaOption) {
				LavaLarvaOption button = (LavaLarvaOption) b;
				drawTooltip(button.getTooltip(), button.xPosition, button.yPosition, button.width, button.height, mouseX, mouseY);
			}
		}
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		switch (button.id) {
		case 0:
			break;
		}
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	private void bindGuiTexture() {
		GuiUtils.bindTexture("textures/gui/lava_larva.png");
	}

	private void bindIconTexture() {
		GuiUtils.bindTexture("textures/gui/lava_larva_icons.png");
	}
}