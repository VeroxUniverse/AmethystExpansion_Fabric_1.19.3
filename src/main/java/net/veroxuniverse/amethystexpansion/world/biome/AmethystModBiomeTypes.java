package net.veroxuniverse.amethystexpansion.world.biome;


import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.veroxuniverse.amethystexpansion.AmethystExpansionMod;

public class AmethystModBiomeTypes {

    public static final RegistryKey<Biome> AMETHYST_FOREST = register("amethyst_forest");

    public static final RegistryKey<Biome> AMETHYST_PLAINS = register("amethyst_plains");


    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.createCodec(RegistryKeys.BIOME, new Identifier(AmethystExpansionMod.MOD_ID, name));
    }

}
