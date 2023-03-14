package net.veroxuniverse.amethystexp;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmethystExpansionMod implements ModInitializer {

	public static final String MODID = "amethystexp";
	public static final Logger LOGGER = LoggerFactory.getLogger("amethystexpansion");

	@Override
	public void onInitialize() {

		LOGGER.info("AmethystExpansion loading started!");
	}
}