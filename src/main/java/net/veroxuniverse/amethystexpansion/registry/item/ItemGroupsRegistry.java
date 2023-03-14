package net.veroxuniverse.amethystexpansion.registry.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.veroxuniverse.amethystexpansion.AmethystExpansionMod;

public class ItemGroupsRegistry {

    public static Identifier ID(String IDPath) {
        return new Identifier(AmethystExpansionMod.MODID, IDPath);
    }

    public static final ItemGroup AMETHYST_GROUP = FabricItemGroup.builder(ID("amethyst"))
            .displayName(Text.translatable("itemGroup.amethystexpansion.amethyst"))
            .icon( () -> new ItemStack(Items.AMETHYST_SHARD)).build();


    public static void registerItemGroups() {
        AmethystExpansionMod.LOGGER.info("Registering ItemGroups for " + AmethystExpansionMod.MODID);
    }
}
