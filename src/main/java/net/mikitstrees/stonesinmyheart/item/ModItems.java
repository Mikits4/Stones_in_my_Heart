package net.mikitstrees.stonesinmyheart.item;

import net.mikitstrees.stonesinmyheart.StonesinmyHeart;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item HEARTSTONE = registerItem("heartstone", new Item(new Item.Settings()));
    public static final Item RAW_HEARTSTONE = registerItem("raw_heartstone", new Item(new Item.Settings()));

    public static final Item HEART = registerItem("heart", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(StonesinmyHeart.MOD_ID, name), item);
    }

    public static void registerModItems() {
        StonesinmyHeart.LOGGER.info("Registering Mod Items for " + StonesinmyHeart.MOD_ID);
    }
}


