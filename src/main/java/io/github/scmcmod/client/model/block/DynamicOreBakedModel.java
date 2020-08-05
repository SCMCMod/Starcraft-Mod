package io.github.scmcmod.client.model.block;

import com.google.common.collect.ImmutableList;
import io.github.scmcmod.api.OreHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.client.MinecraftForgeClient;
import org.apache.commons.lang3.tuple.Pair;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.vecmath.Matrix4f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DynamicOreBakedModel implements IBakedModel {

    private final Map<String, List<BakedQuad>> cache = new HashMap<>();

    private static IBakedModel fallback;

    protected IBakedModel getFallback() {
        if (fallback != null)
            return fallback;
        fallback = Minecraft.getMinecraft().getBlockRendererDispatcher().getBlockModelShapes().getModelManager().getMissingModel();
        return fallback;
    }

    private final IBakedModel oreModel;

    public DynamicOreBakedModel(IBakedModel oreModel) {
        this.oreModel = oreModel;
    }

    @Nonnull
    @Override
    public List<BakedQuad> getQuads(@Nullable IBlockState state, @Nullable EnumFacing side, @Nonnull long rand) {
        if (Minecraft.getMinecraft().player != null) {
            BlockRenderLayer layer = MinecraftForgeClient.getRenderLayer();
            IBlockState baseState = OreHelper.getDimensionOreBase(Minecraft.getMinecraft().player.world.provider.getDimensionType());
            String cacheKey = baseState.toString() + "," + (state != null ? state.toString() : "null") + ":" + (side != null ? side.getName2() : "null") + ":" + (layer != null ? layer.toString() : "null");
            if (!cache.containsKey(cacheKey)) {
                ImmutableList.Builder<BakedQuad> builder = ImmutableList.builder();
                if (layer == null || layer == BlockRenderLayer.SOLID)
                    builder.addAll(Minecraft.getMinecraft().getBlockRendererDispatcher().getBlockModelShapes().getModelForState(baseState).getQuads(baseState, side, rand));
                if (layer == null || layer == BlockRenderLayer.CUTOUT)
                    builder.addAll(this.oreModel.getQuads(state, side, rand));
                ImmutableList<BakedQuad> quads = builder.build();
                cache.put(cacheKey, quads);
                return quads;
            } else {
                return cache.get(cacheKey);
            }
        }
        return getFallback().getQuads(state, side, rand);
    }

    @Override
    public boolean isAmbientOcclusion() {
        return this.oreModel.isAmbientOcclusion();
    }

    @Override
    public boolean isGui3d() {
        return this.oreModel.isGui3d();
    }

    @Override
    public boolean isBuiltInRenderer() {
        return this.oreModel.isBuiltInRenderer();
    }

    @Override
    public TextureAtlasSprite getParticleTexture() {
        return this.oreModel.getParticleTexture();
    }

	@Override
	public ItemCameraTransforms getItemCameraTransforms() {
		return this.oreModel.getItemCameraTransforms();
	}

	@Override
	public ItemOverrideList getOverrides() {
		return this.oreModel.getOverrides();
	}

	@Override
	public boolean isAmbientOcclusion(IBlockState state) {
		return this.oreModel.isAmbientOcclusion(state);
	}

	@Override
	public Pair<? extends IBakedModel, Matrix4f> handlePerspective(ItemCameraTransforms.TransformType cameraTransformType) {
		return this.oreModel.handlePerspective(cameraTransformType);
	}
}
