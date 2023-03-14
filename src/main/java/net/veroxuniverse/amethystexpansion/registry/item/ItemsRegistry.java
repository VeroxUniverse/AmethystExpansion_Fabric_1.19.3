package net.veroxuniverse.amethystexpansion.registry.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.veroxuniverse.amethystexpansion.AmethystExpansionMod;

public class ItemsRegistry {

    public static final Item JADE_SHARD = registerItem("jade_shard",
            new Item(new FabricItemSettings().rarity(Rarity.RARE)), ItemGroupsRegistry.AMETHYST_GROUP);

    private static Item registerItem(String name, Item item, ItemGroup group){
        Item items = Registry.register(Registries.ITEM, new Identifier(AmethystExpansionMod.MODID, name), item);
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(items));
        return items;
    }

    public static void registerModItems() {
        AmethystExpansionMod.LOGGER.info("Registering ModItems for " + AmethystExpansionMod.MODID);
    }

}
