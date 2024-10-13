package net.mikitstrees.stonesinmyheart.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mikitstrees.stonesinmyheart.HeartsinHarmony;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SIMH_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HeartsinHarmony.MOD_ID, "hih_items"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.HEARTSTONE)) //group icon
                    .displayName(Text.translatable("itemGroup.stonesinmyheart.simh_items"))
                    .entries((displayContext, entries) -> { //group entries into this group, yoinks it from ModBlocks

                    }).build());

    public static void registerItemGroups() {
        HeartsinHarmony.LOGGER.info("Registering Item Groups for " + HeartsinHarmony.MOD_ID);
    }
}
