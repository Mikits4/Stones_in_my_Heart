package net.mikitstrees.stonesinmyheart;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.mikitstrees.stonesinmyheart.block.ModBlocks;
import net.mikitstrees.stonesinmyheart.entity.ModEntities;
import net.mikitstrees.stonesinmyheart.entity.client.LovebirdEntityModel;
import net.mikitstrees.stonesinmyheart.entity.client.LovebirdEntityRenderer;
import net.mikitstrees.stonesinmyheart.entity.client.ModEntityModelLayers;
import net.minecraft.client.render.RenderLayer;

public class HeartsinHarmonyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.LOVEBIRD, LovebirdEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModEntityModelLayers.LOVEBIRD, LovebirdEntityModel::getTexturedModelData);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUTTERCUP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BUTTERCUP, RenderLayer.getCutout());
    }
}
