package net.mikitstrees.stonesinmyheart.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mikitstrees.stonesinmyheart.block.ModBlocks;
import net.mikitstrees.stonesinmyheart.block.custom.HeartstoneLampBlock;
import net.mikitstrees.stonesinmyheart.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HEARTSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HEARTSTONE_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HEARTSTONE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_HEARTSTONE_BLOCK);

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.HEARTSTONE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.HEARTSTONE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.HEARTSTONE_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(HeartstoneLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.HEARTSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_HEARTSTONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HEART, Models.GENERATED);
    }
}