package fr.alasdiablo.mods.pressure.plates.data.model;

import fr.alasdiablo.mods.pressure.plates.PressurePlates;
import fr.alasdiablo.mods.pressure.plates.registry.PressurePlatesBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

public class BlockModelProvider extends ModelProvider {

    public BlockModelProvider(PackOutput output) {
        super(output, PressurePlates.MOD_ID);
    }

    @Override
    protected void registerModels(@NotNull BlockModelGenerators blockModels, @NotNull ItemModelGenerators itemModels) {
        this.pressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.OBSIDIAN_PRESSURE_PLATE.get(),
                Blocks.OBSIDIAN
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_OBSIDIAN_PRESSURE_PLATE.get(),
                Blocks.OBSIDIAN
        );

        this.pressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE.get(),
                Blocks.MOSSY_COBBLESTONE
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE.get(),
                Blocks.MOSSY_COBBLESTONE
        );

        this.pressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.NETHERRACK_PRESSURE_PLATE.get(),
                Blocks.NETHERRACK
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_NETHERRACK_PRESSURE_PLATE.get(),
                Blocks.NETHERRACK
        );

        this.pressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.DIRT_PRESSURE_PLATE.get(),
                Blocks.DIRT
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_DIRT_PRESSURE_PLATE.get(),
                Blocks.DIRT
        );

        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_OAK_PRESSURE_PLATE.get(),
                Blocks.OAK_PLANKS
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_SPRUCE_PRESSURE_PLATE.get(),
                Blocks.SPRUCE_PLANKS
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_BIRCH_PRESSURE_PLATE.get(),
                Blocks.BIRCH_PLANKS
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_JUNGLE_PRESSURE_PLATE.get(),
                Blocks.JUNGLE_PLANKS
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_ACACIA_PRESSURE_PLATE.get(),
                Blocks.ACACIA_PLANKS
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_DARK_OAK_PRESSURE_PLATE.get(),
                Blocks.DARK_OAK_PLANKS
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_MANGROVE_PRESSURE_PLATE.get(),
                Blocks.MANGROVE_PLANKS
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_CHERRY_PRESSURE_PLATE.get(),
                Blocks.CHERRY_PLANKS
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_BAMBOO_PRESSURE_PLATE.get(),
                Blocks.BAMBOO_PLANKS
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_CRIMSON_PRESSURE_PLATE.get(),
                Blocks.CRIMSON_PLANKS
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_WARPED_PRESSURE_PLATE.get(),
                Blocks.WARPED_PLANKS
        );


        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_STONE_PRESSURE_PLATE.get(),
                Blocks.STONE
        );
        this.silentPressurePlateBlock(
                blockModels,
                PressurePlatesBlocks.SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE.get(),
                Blocks.POLISHED_BLACKSTONE
        );
    }

    private void pressurePlateBlock(@NotNull BlockModelGenerators blockModels, Block pressurePlateBlock, Block plateMaterialBlock) {
        TextureMapping textureMapping = TextureMapping.defaultTexture(plateMaterialBlock);

        MultiVariant pressurePlateUpModel = BlockModelGenerators.plainVariant(
                ModelTemplates.PRESSURE_PLATE_UP.create(pressurePlateBlock, textureMapping, blockModels.modelOutput)
        );

        MultiVariant pressurePlateDownModel = BlockModelGenerators.plainVariant(
                ModelTemplates.PRESSURE_PLATE_DOWN.create(pressurePlateBlock, textureMapping, blockModels.modelOutput)
        );


        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createPressurePlate(pressurePlateBlock, pressurePlateUpModel, pressurePlateDownModel)
        );
    }

    private void silentPressurePlateBlock(@NotNull BlockModelGenerators blockModels, Block pressurePlateBlock, Block plateMaterialBlock) {
        TextureMapping textureMapping = TextureMapping.defaultTexture(plateMaterialBlock);

        MultiVariant silentPressurePlateUpModel = BlockModelGenerators.plainVariant(
                ModModelTemplates.SILENT_PRESSURE_PLATE_UP.create(pressurePlateBlock, textureMapping, blockModels.modelOutput)
        );

        MultiVariant silentPressurePlateDownModel = BlockModelGenerators.plainVariant(
                ModModelTemplates.SILENT_PRESSURE_PLATE_DOWN.create(pressurePlateBlock, textureMapping, blockModels.modelOutput)
        );


        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createPressurePlate(pressurePlateBlock, silentPressurePlateUpModel, silentPressurePlateDownModel)
        );
    }
}
