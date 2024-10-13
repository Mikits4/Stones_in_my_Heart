package net.mikitstrees.stonesinmyheart.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.mikitstrees.stonesinmyheart.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.HEARTSTONE_ORE)
                .add(ModBlocks.HEARTSTONE_DEEPSLATE_ORE)
                .add(ModBlocks.HEARTSTONE_BLOCK)
                .add(ModBlocks.RAW_HEARTSTONE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.HEARTSTONE_ORE)
                .add(ModBlocks.HEARTSTONE_DEEPSLATE_ORE);
    }
}
