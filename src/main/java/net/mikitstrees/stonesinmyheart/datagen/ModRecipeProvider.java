package net.mikitstrees.stonesinmyheart.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mikitstrees.stonesinmyheart.block.ModBlocks;
import net.mikitstrees.stonesinmyheart.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> HEARTSTONE_SMELTABLES = List.of( //list of pink garnet smeltables
                ModItems.RAW_HEARTSTONE,
                ModBlocks.HEARTSTONE_ORE,
                ModBlocks.HEARTSTONE_DEEPSLATE_ORE
        );

        offerSmelting(exporter, HEARTSTONE_SMELTABLES, RecipeCategory.MISC, ModItems.HEARTSTONE, 0.25f, 200, "heartstone");
        offerBlasting(exporter, HEARTSTONE_SMELTABLES, RecipeCategory.MISC, ModItems.HEARTSTONE, 0.25f, 100, "heartstone");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.HEARTSTONE, RecipeCategory.DECORATIONS, ModBlocks.HEARTSTONE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_HEARTSTONE, RecipeCategory.DECORATIONS, ModBlocks.RAW_HEARTSTONE_BLOCK);


    }



    //double tap shift and explore RecipeProvider
}

//ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.)
//                .pattern("RXR")
//                .pattern("RRR")
//                .pattern("XRX")
//                .input('R', ModItems.)
//                .criterion(hasItem(ModItems.), conditionsFromItem(ModItems.)) //gives recipe to player
//        .offerTo(exporter);