package io.github.scmcmod.utils;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Helper {
	
	  @SideOnly(Side.CLIENT)
	  public static void renderBlock(World world, IBlockState state, BlockPos pos, Tessellator tessellator, BufferBuilder buffer) {
	    buffer.begin(7, DefaultVertexFormats.BLOCK);
	    BlockRendererDispatcher blockrendererdispatcher = Minecraft.getMinecraft().getBlockRendererDispatcher();
	    blockrendererdispatcher.getBlockModelRenderer().renderModel((IBlockAccess)world, blockrendererdispatcher.getModelForState(state), state, pos, buffer, false, MathHelper.getPositionRandom((Vec3i)pos));
	    tessellator.draw();
	  }

}
