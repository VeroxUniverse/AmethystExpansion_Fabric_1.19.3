package net.veroxuniverse.amethystexpansion.world.biome;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class AmethystSurfaceRuleData {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule AMETHYST_BLOCK = makeStateRule(Blocks.AMETHYST_BLOCK);
    private static final MaterialRules.MaterialRule ENDSTONE = makeStateRule(Blocks.END_STONE);

    public static MaterialRules.MaterialRule makeRules()
    {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);
        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.biome(AmethystModBiomeTypes.AMETHYST_FOREST), AMETHYST_BLOCK),
                MaterialRules.condition(MaterialRules.biome(AmethystModBiomeTypes.AMETHYST_PLAINS), ENDSTONE),

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.surface(), grassSurface)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block)
    {
        return MaterialRules.block(block.getDefaultState());
    }
}