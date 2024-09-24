package fr.alasdiablo.mods.pressure.plates.data.loot.table;

import fr.alasdiablo.mods.lib.api.data.loot.DioBlockLootSubProvider;
import fr.alasdiablo.mods.pressure.plates.registry.PressurePlatesBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.flag.FeatureFlags;

import java.util.Set;

public class BlockLootTables extends DioBlockLootSubProvider {
    public BlockLootTables(HolderLookup.Provider lookup) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookup);
    }

    @Override
    protected void generate() {
        this.dropSelf(PressurePlatesBlocks.OBSIDIAN_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_OBSIDIAN_PRESSURE_PLATE.get());

        this.dropSelf(PressurePlatesBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE.get());

        this.dropSelf(PressurePlatesBlocks.NETHERRACK_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_NETHERRACK_PRESSURE_PLATE.get());

        this.dropSelf(PressurePlatesBlocks.DIRT_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_DIRT_PRESSURE_PLATE.get());

        this.dropSelf(PressurePlatesBlocks.SILENT_OAK_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_SPRUCE_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_BIRCH_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_JUNGLE_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_ACACIA_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_DARK_OAK_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_MANGROVE_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_CHERRY_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_CRIMSON_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_WARPED_PRESSURE_PLATE.get());

        this.dropSelf(PressurePlatesBlocks.SILENT_STONE_PRESSURE_PLATE.get());
        this.dropSelf(PressurePlatesBlocks.SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE.get());
    }
}
