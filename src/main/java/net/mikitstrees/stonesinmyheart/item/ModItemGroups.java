package net.mikitstrees.stonesinmyheart.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mikitstrees.stonesinmyheart.StonesinmyHeart;
import net.mikitstrees.stonesinmyheart.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup STONES_IN_MY_HEART_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(StonesinmyHeart.MOD_ID, "stones_in_my_heart_items"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.HEARTSTONE)) //group icon
                    .displayName(Text.translatable("itemGroup.stonesinmyheart.stones_in_my_heart_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.HEARTSTONE));
                        entries.add(new ItemStack(ModItems.RAW_HEARTSTONE));

                        entries.add(new ItemStack(ModBlocks.HEARTSTONE_BLOCK));
                        entries.add(new ItemStack(ModBlocks.RAW_HEARTSTONE_BLOCK));
                        entries.add(new ItemStack(ModBlocks.HEARTSTONE_ORE));
                        entries.add(new ItemStack(ModBlocks.HEARTSTONE_DEEPSLATE_ORE));

                        entries.add(new ItemStack(ModBlocks.HEARTSTONE_LAMP));

                        entries.add(new ItemStack(ModItems.HEART));

                    }).build());


    public static void registerItemGroups() {
        StonesinmyHeart.LOGGER.info("Registering Item Groups for " + StonesinmyHeart.MOD_ID);
    }
}
