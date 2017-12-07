package ga.scmc.network.message;

import java.lang.reflect.Field;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class MessageReturnFurnaceData implements IMessage {

    private boolean messageValid;

    private String className, burnTimeFieldName, cookTimeFieldName;

    private float burnTime, cookTime;

    public MessageReturnFurnaceData() {
        this.messageValid = false;
    }

    public MessageReturnFurnaceData(float burnTime, float cookTime, String className, String burnTimeFieldName, String cookTimeFieldName) {
        this.burnTime = burnTime;
        this.cookTime = cookTime;
        this.className = className;
        this.burnTimeFieldName = burnTimeFieldName;
        this.cookTimeFieldName = cookTimeFieldName;
        this.messageValid = true;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        try {
            this.burnTime = buf.readFloat();
            this.cookTime = buf.readFloat();
            this.className = ByteBufUtils.readUTF8String(buf);
            this.burnTimeFieldName = ByteBufUtils.readUTF8String(buf);
            this.cookTimeFieldName = ByteBufUtils.readUTF8String(buf);
        } catch (IndexOutOfBoundsException ioe) {
            ioe.printStackTrace();
            return;
        }
        this.messageValid = true;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        if (!this.messageValid)
            return;
        buf.writeFloat(this.burnTime);
        buf.writeFloat(this.cookTime);
        ByteBufUtils.writeUTF8String(buf, this.className);
        ByteBufUtils.writeUTF8String(buf, this.burnTimeFieldName);
        ByteBufUtils.writeUTF8String(buf, this.cookTimeFieldName);
    }

    public static class Handler implements IMessageHandler<MessageReturnFurnaceData, IMessage> {

        @Override
        public IMessage onMessage(MessageReturnFurnaceData msg, MessageContext ctx) {
            if(!msg.messageValid || ctx.side != Side.CLIENT)
                return null;
            Minecraft.getMinecraft().addScheduledTask(() -> processMessage(msg));
            return null;
        }

        void processMessage(MessageReturnFurnaceData msg) {
            try {
                Class clazz = Class.forName(msg.className);
                Field burnTimeField = clazz.getDeclaredField(msg.burnTimeFieldName);
                Field cookTimeField = clazz.getDeclaredField(msg.cookTimeFieldName);
                burnTimeField.setFloat(clazz, msg.burnTime);
                cookTimeField.setFloat(clazz, msg.cookTime);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
