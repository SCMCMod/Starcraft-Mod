package ga.scmc.client.gui;

import ga.scmc.container.ContainerStarcraftFurnace;
import ga.scmc.enums.EnumWorldType;
import ga.scmc.lib.Library;
import ga.scmc.network.NetworkHandler;
import ga.scmc.network.message.MessageGetFurnaceData;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.items.IItemHandler;

public class GuiStarcraftFurnace extends GuiContainer {

    private ResourceLocation texturePath;

    public static float burnTime, cookTime;

    private BlockPos pos;

    private int sync;

    public GuiStarcraftFurnace(EntityPlayer player, IItemHandler furnaceInv, EnumWorldType worldType, BlockPos pos) {
        super(new ContainerStarcraftFurnace(player, furnaceInv));
        this.texturePath = new ResourceLocation(Library.MODID, "textures/gui/container/" + worldType.getName() + "_furnace.png");
        setGuiSize(175, 165);
        this.pos = pos;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float v, int i, int i1) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(this.texturePath);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);

        if (this.sync == 0)
            NetworkHandler.sendToServer(new MessageGetFurnaceData(this.pos, "ga.scmc.client.gui.GuiStarcraftFurnace", "burnTime", "cookTime"));
        this.sync++;
        this.sync %= 10;

        if(burnTime != 0)
            this.drawTexturedModalRect(this.guiLeft + 57, this.guiTop + 37 + (int) ((1 - burnTime) * 14.0F), 176, (int) ((1 - burnTime) * 14.0F), 14, (int) (burnTime * 14.0F));
        this.drawTexturedModalRect(this.guiLeft + 80, this.guiTop + 35, 176, 14, (int) (cookTime * 24.0F), 17);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
    }
}
