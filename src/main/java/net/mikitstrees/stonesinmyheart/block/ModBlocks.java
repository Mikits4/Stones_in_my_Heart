package net.mikitstrees.stonesinmyheart.block;

import net.mikitstrees.stonesinmyheart.StonesinmyHeart;
import net.mikitstrees.stonesinmyheart.block.custom.HeartstoneLampBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block HEARTSTONE_BLOCK = registerBlock("heartstone_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.LARGE_AMETHYST_BUD)));
    public static final Block RAW_HEARTSTONE_BLOCK = registerBlock("raw_heartstone_block",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool()));

    public static final Block HEARTSTONE_ORE = registerBlock("heartstone_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block HEARTSTONE_DEEPSLATE_ORE = registerBlock("heartstone_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 10),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block HEARTSTONE_LAMP = registerBlock("heartstone_lamp",
            new HeartstoneLampBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().
                    luminance(state -> state.get(HeartstoneLampBlock.CLICKED) ? 15 : 0)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(StonesinmyHeart.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(StonesinmyHeart.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        StonesinmyHeart.LOGGER.info("Registering Mod Blocks for " + StonesinmyHeart.MOD_ID);
    }
}