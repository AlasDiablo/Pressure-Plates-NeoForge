package fr.alasdiablo.mods.pressure.plates.registry;

import fr.alasdiablo.mods.pressure.plates.PressurePlates;
import fr.alasdiablo.mods.pressure.plates.PressurePlatesRegistries;
import fr.alasdiablo.mods.pressure.plates.block.MossyCobblestonePressurePlateBlock;
import fr.alasdiablo.mods.pressure.plates.block.ObsidianPressurePlateBlock;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class PressurePlatesBlocks {
    static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PressurePlates.MOD_ID);
    static final DeferredRegister.Items  ITEMS  = DeferredRegister.createItems(PressurePlates.MOD_ID);

    private static <T extends Block> @NotNull DeferredBlock<T> register(Supplier<T> block, String name) {
        DeferredBlock<T> blockRegistry = BLOCKS.register(name, block);
        ITEMS.registerSimpleBlockItem(blockRegistry);
        return blockRegistry;
    }

    public static final DeferredBlock<ObsidianPressurePlateBlock> OBSIDIAN_PRESSURE_PLATE = register(
            () -> new ObsidianPressurePlateBlock(false),
            PressurePlatesRegistries.OBSIDIAN_PRESSURE_PLATE
    );

    public static final DeferredBlock<ObsidianPressurePlateBlock> SILENCE_OBSIDIAN_PRESSURE_PLATE = register(
            () -> new ObsidianPressurePlateBlock(true),
            PressurePlatesRegistries.SILENCE_OBSIDIAN_PRESSURE_PLATE
    );

    public static final DeferredBlock<MossyCobblestonePressurePlateBlock> MOSSY_COBBLESTONE_PRESSURE_PLATE = register(
            () -> new MossyCobblestonePressurePlateBlock(false),
            PressurePlatesRegistries.MOSSY_COBBLESTONE_PRESSURE_PLATE
    );

    public static final DeferredBlock<MossyCobblestonePressurePlateBlock> SILENCE_MOSSY_COBBLESTONE_PRESSURE_PLATE = register(
            () -> new MossyCobblestonePressurePlateBlock(true),
            PressurePlatesRegistries.SILENCE_MOSSY_COBBLESTONE_PRESSURE_PLATE
    );

    public static void onCreativeModeTabEvent(@NotNull BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.insertAfter(
                    new ItemStack(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE),
                    new ItemStack(OBSIDIAN_PRESSURE_PLATE),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(OBSIDIAN_PRESSURE_PLATE),
                    new ItemStack(SILENCE_OBSIDIAN_PRESSURE_PLATE),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(SILENCE_OBSIDIAN_PRESSURE_PLATE),
                    new ItemStack(MOSSY_COBBLESTONE_PRESSURE_PLATE),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    new ItemStack(MOSSY_COBBLESTONE_PRESSURE_PLATE),
                    new ItemStack(SILENCE_MOSSY_COBBLESTONE_PRESSURE_PLATE),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
