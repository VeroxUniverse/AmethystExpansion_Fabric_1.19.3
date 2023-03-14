package net.veroxuniverse.amethystexpansion.registry.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.veroxuniverse.amethystexpansion.AmethystExpansionMod;
import net.veroxuniverse.amethystexpansion.item.AmethystArmorItem;

public class ItemsRegistry {

    public static final Item AMETHYST_INGOT = registerItem("amethyst_ingot",
            new Item(new FabricItemSettings().rarity(Rarity.RARE)), ItemGroupsRegistry.AMETHYST_GROUP);

    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.HEAD,
                    new FabricItemSettings()), ItemGroupsRegistry.AMETHYST_GROUP);

    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.CHEST,
                    new FabricItemSettings()), ItemGroupsRegistry.AMETHYST_GROUP);

    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.LEGS,
                    new FabricItemSettings()), ItemGroupsRegistry.AMETHYST_GROUP);

    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, EquipmentSlot.FEET,
                    new FabricItemSettings()), ItemGroupsRegistry.AMETHYST_GROUP);

    private static Item registerItem(String name, Item item, ItemGroup group){
        Item items = Registry.register(Registries.ITEM, new Identifier(AmethystExpansionMod.MOD_ID, name), item);
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(items));
        return items;
    }

    public static void registerModItems() {
        AmethystExpansionMod.LOGGER.info("Registering ModItems for " + AmethystExpansionMod.MOD_ID);
    }

}
