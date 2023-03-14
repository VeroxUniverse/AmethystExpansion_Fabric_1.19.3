package net.veroxuniverse.amethystexpansion;

import net.fabricmc.api.ModInitializer;

import net.veroxuniverse.amethystexpansion.registry.block.BlocksRegistry;
import net.veroxuniverse.amethystexpansion.registry.item.ItemGroupsRegistry;
import net.veroxuniverse.amethystexpansion.registry.item.ItemsRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmethystExpansionMod implements ModInitializer {

	public static final String MODID = "amethystexpansion";
	public static final Logger LOGGER = LoggerFactory.getLogger("amethystexpansion");


	@Override
	public void onInitialize() {
		ItemsRegistry.registerModItems();
		BlocksRegistry.registerModBlocks();
		ItemGroupsRegistry.registerItemGroups();

		LOGGER.info("AmethystExpansion loading started!");
	}
}