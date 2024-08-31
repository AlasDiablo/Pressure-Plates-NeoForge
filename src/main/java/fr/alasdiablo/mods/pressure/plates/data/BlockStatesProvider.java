package fr.alasdiablo.mods.pressure.plates.data;

import fr.alasdiablo.mods.pressure.plates.PressurePlates;
import fr.alasdiablo.mods.pressure.plates.PressurePlatesRegistries;
import fr.alasdiablo.mods.pressure.plates.registry.PressurePlatesBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class BlockStatesProvider extends BlockStateProvider {

    public BlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PressurePlates.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.pressurePlateBlock(
                PressurePlatesBlocks.OBSIDIAN_PRESSURE_PLATE.get(),
                ResourceLocation.withDefaultNamespace("block/obsidian")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_OBSIDIAN_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_OBSIDIAN_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/obsidian")
        );

        this.pressurePlateBlock(
                PressurePlatesBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE.get(),
                ResourceLocation.withDefaultNamespace("block/mossy_cobblestone")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/mossy_cobblestone")
        );

        this.pressurePlateBlock(
                PressurePlatesBlocks.NETHERRACK_PRESSURE_PLATE.get(),
                ResourceLocation.withDefaultNamespace("block/netherrack")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_NETHERRACK_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_NETHERRACK_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/netherrack")
        );

        this.pressurePlateBlock(
                PressurePlatesBlocks.DIRT_PRESSURE_PLATE.get(),
                ResourceLocation.withDefaultNamespace("block/dirt")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_DIRT_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_DIRT_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/dirt")
        );

        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_OAK_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_OAK_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/oak_planks")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_SPRUCE_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_SPRUCE_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/spruce_planks")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_BIRCH_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_BIRCH_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/birch_planks")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_JUNGLE_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_JUNGLE_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/jungle_planks")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_ACACIA_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_ACACIA_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/acacia_planks")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_OAK_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_OAK_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/oak_planks")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_DARK_OAK_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_DARK_OAK_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/dark_oak_planks")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_MANGROVE_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_MANGROVE_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/mangrove_planks")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_CHERRY_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_CHERRY_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/cherry_planks")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_BAMBOO_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_BAMBOO_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/bamboo_planks")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_CRIMSON_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_CRIMSON_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/crimson_planks")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_WARPED_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_WARPED_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/warped_planks")
        );

        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_STONE_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_STONE_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/stone")
        );
        this.silentPressurePlateBlock(
                PressurePlatesBlocks.SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE.get(),
                PressurePlatesRegistries.SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/polished_blackstone")
        );
    }

    protected void silentPressurePlateBlock(PressurePlateBlock block, String name, ResourceLocation texture) {
        ModelFile pressurePlate = models().singleTexture(
                name,
                modLoc("block/silent_pressure_plate_up"),
                texture
        );
        ModelFile pressurePlateDown = models().singleTexture(
                name + "_down",
                modLoc("block/silent_pressure_plate_down"),
                texture
        );
        pressurePlateBlock(block, pressurePlate, pressurePlateDown);
    }
}
