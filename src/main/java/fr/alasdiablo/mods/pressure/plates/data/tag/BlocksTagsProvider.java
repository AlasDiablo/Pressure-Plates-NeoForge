package fr.alasdiablo.mods.pressure.plates.data.tag;

import fr.alasdiablo.mods.pressure.plates.PressurePlates;
import fr.alasdiablo.mods.pressure.plates.registry.PressurePlatesBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlocksTagsProvider extends BlockTagsProvider {

    public BlocksTagsProvider(
            PackOutput output,
            CompletableFuture<HolderLookup.Provider> lookupProvider,
            @Nullable ExistingFileHelper existingFileHelper
    ) {
        super(output, lookupProvider, PressurePlates.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(PressurePlatesBlocks.OBSIDIAN_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_OBSIDIAN_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.NETHERRACK_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_NETHERRACK_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_STONE_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(PressurePlatesBlocks.DIRT_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_DIRT_PRESSURE_PLATE.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(PressurePlatesBlocks.SILENT_OAK_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_SPRUCE_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_BIRCH_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_JUNGLE_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_ACACIA_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_DARK_OAK_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_MANGROVE_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_CHERRY_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_CRIMSON_PRESSURE_PLATE.get())
                .add(PressurePlatesBlocks.SILENT_WARPED_PRESSURE_PLATE.get());
    }
}
