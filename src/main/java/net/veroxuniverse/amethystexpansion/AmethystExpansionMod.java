package net.veroxuniverse.amethystexpansion;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.veroxuniverse.amethystexp.registry.item.ItemsRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmethystExpansionMod implements ModInitializer {

	public static final String MODID = "amethystexpansion";
	public static Identifier ID(String IDPath) {
		return new Identifier(MODID, IDPath);
	}
	public static final Logger LOGGER = LoggerFactory.getLogger("amethystexpansion");

	public static final ItemGroup AMETHYST_GROUP = FabricItemGroup.builder(ID("amethyst"))
			.displayName(Text.translatable("itemGroup.amethystexpansion.amethyst"))
			.icon( () -> new ItemStack(Items.AMETHYST_SHARD)).build();

	@Override
	public void onInitialize() {
		ItemsRegistry.registerModItems();

		LOGGER.info("AmethystExpansion loading started!");
	}
}