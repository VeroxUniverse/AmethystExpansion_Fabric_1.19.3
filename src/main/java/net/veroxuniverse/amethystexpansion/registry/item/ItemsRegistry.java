package net.veroxuniverse.amethystexpansion.registry.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.veroxuniverse.amethystexpansion.AmethystExpansionMod;

public class ItemsRegistry {

    public static final Item JADE_SHARD = registerItem("jade_shard");

    protected static Item registerItem(String id) {
        return registerItem(id, new Item(new Item.Settings()));
    }

    protected static Item registerItem(String id, Item newItem) {
        return registerItem(id, newItem, AmethystExpansionMod.AMETHYST_GROUP);
    }

    protected static Item registerItem(String id, Item newItem, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, AmethystExpansionMod.ID(id), newItem);
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModItems() {
    }

}
