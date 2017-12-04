package ga.scmc.client.gui;

import ga.scmc.container.ContainerStarcraftFurnace;
import ga.scmc.enums.EnumWorldType;
import ga.scmc.lib.Library;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.items.IItemHandler;

public class GuiStarcraftFurnace extends GuiContainer {

    private ResourceLocation texturePath;

    public GuiStarcraftFurnace(EntityPlayer player, IItemHandler furnaceInv, EnumWorldType worldType) {
        super(new ContainerStarcraftFurnace(player, furnaceInv));
        this.texturePath = new ResourceLocation(Library.MODID, "textures/gui/container/" + worldType.getName() + "_furnace.png");
        setGuiSize(175, 165);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float v, int i, int i1) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(this.texturePath);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {

    }
}
