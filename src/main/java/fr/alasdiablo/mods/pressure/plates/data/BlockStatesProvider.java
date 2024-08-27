package fr.alasdiablo.mods.pressure.plates.data;

import fr.alasdiablo.mods.pressure.plates.PressurePlates;
import fr.alasdiablo.mods.pressure.plates.registry.PressurePlatesBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class BlockStatesProvider extends BlockStateProvider {

    public BlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PressurePlates.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.pressurePlateBlock(PressurePlatesBlocks.OBSIDIAN_PRESSURE_PLATE.get(), ResourceLocation.withDefaultNamespace("block/obsidian"));
        this.pressurePlateBlock(PressurePlatesBlocks.SILENCE_OBSIDIAN_PRESSURE_PLATE.get(), ResourceLocation.withDefaultNamespace("block/obsidian"));

        this.pressurePlateBlock(PressurePlatesBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE.get(), ResourceLocation.withDefaultNamespace("block/mossy_cobblestone"));
        this.pressurePlateBlock(PressurePlatesBlocks.SILENCE_MOSSY_COBBLESTONE_PRESSURE_PLATE.get(), ResourceLocation.withDefaultNamespace("block/mossy_cobblestone"));
    }
}
