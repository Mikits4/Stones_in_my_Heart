package net.mikitstrees.stonesinmyheart;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.mikitstrees.stonesinmyheart.block.ModBlocks;
import net.mikitstrees.stonesinmyheart.component.ModDataComponentTypes;

import net.mikitstrees.stonesinmyheart.item.ModItemGroups;
import net.mikitstrees.stonesinmyheart.item.ModItems;
import net.mikitstrees.stonesinmyheart.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class HeartsinHarmony implements ModInitializer {
	public static final String MOD_ID = "stonesinmyheart";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModSounds.registerSounds();

		ModDataComponentTypes.registerDataComponentTypes();
	}
}