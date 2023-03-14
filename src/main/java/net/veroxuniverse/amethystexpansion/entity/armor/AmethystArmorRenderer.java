package net.veroxuniverse.amethystexpansion.entity.armor;

import net.minecraft.util.Identifier;
import net.veroxuniverse.amethystexpansion.AmethystExpansionMod;
import net.veroxuniverse.amethystexpansion.item.AmethystArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AmethystArmorRenderer extends GeoArmorRenderer<AmethystArmorItem> {
    public AmethystArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new Identifier(AmethystExpansionMod.MOD_ID, "armor/amethyst_armor")));
    }
}
