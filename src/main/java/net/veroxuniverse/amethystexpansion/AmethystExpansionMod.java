package net.veroxuniverse.amethystexpansion;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import net.veroxuniverse.amethystexpansion.registry.block.BlocksRegistry;
import net.veroxuniverse.amethystexpansion.registry.item.ItemGroupsRegistry;
import net.veroxuniverse.amethystexpansion.registry.item.ItemsRegistry;
import net.veroxuniverse.amethystexpansion.world.biome.AmethystForestRegion;
import net.veroxuniverse.amethystexpansion.world.biome.AmethystSurfaceRuleData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class AmethystExpansionMod implements ModInitializer, TerraBlenderApi {

	public static final String MOD_ID = "amethystexpansion";
	public static final Logger LOGGER = LoggerFactory.getLogger("amethystexpansion");


	@Override
	public void onInitialize() {
		GeckoLib.initialize();
		ItemsRegistry.registerModItems();
		BlocksRegistry.registerModBlocks();
		ItemGroupsRegistry.registerItemGroups();

		LOGGER.info("AmethystExpansion loading started!");
	}

	@Override
	public void onTerraBlenderInitialized()
	{
		Regions.register(new AmethystForestRegion(new Identifier(MOD_ID, "overworld_1"), 2));

		SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, AmethystSurfaceRuleData.makeRules());
	}
}