package fr.alasdiablo.mods.pressure.plates.registry;

import fr.alasdiablo.mods.pressure.plates.PressurePlates;
import fr.alasdiablo.mods.pressure.plates.PressurePlatesRegistries;
import fr.alasdiablo.mods.pressure.plates.block.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
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

    public static final DeferredBlock<ObsidianPressurePlateBlock> OBSIDIAN_PRESSURE_PLATE        = register(
            () -> new ObsidianPressurePlateBlock(false),
            PressurePlatesRegistries.OBSIDIAN_PRESSURE_PLATE
    );
    public static final DeferredBlock<ObsidianPressurePlateBlock> SILENT_OBSIDIAN_PRESSURE_PLATE = register(
            () -> new ObsidianPressurePlateBlock(true),
            PressurePlatesRegistries.SILENT_OBSIDIAN_PRESSURE_PLATE
    );

    public static final DeferredBlock<MossyCobblestonePressurePlateBlock> MOSSY_COBBLESTONE_PRESSURE_PLATE        = register(
            () -> new MossyCobblestonePressurePlateBlock(false),
            PressurePlatesRegistries.MOSSY_COBBLESTONE_PRESSURE_PLATE
    );
    public static final DeferredBlock<MossyCobblestonePressurePlateBlock> SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE = register(
            () -> new MossyCobblestonePressurePlateBlock(true),
            PressurePlatesRegistries.SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE
    );

    public static final DeferredBlock<NetherrackPressurePlateBlock> NETHERRACK_PRESSURE_PLATE        = register(
            () -> new NetherrackPressurePlateBlock(false),
            PressurePlatesRegistries.NETHERRACK_PRESSURE_PLATE
    );
    public static final DeferredBlock<NetherrackPressurePlateBlock> SILENT_NETHERRACK_PRESSURE_PLATE = register(
            () -> new NetherrackPressurePlateBlock(true),
            PressurePlatesRegistries.SILENT_NETHERRACK_PRESSURE_PLATE
    );

    public static final DeferredBlock<DirtPressurePlateBlock> DIRT_PRESSURE_PLATE        = register(
            () -> new DirtPressurePlateBlock(false),
            PressurePlatesRegistries.DIRT_PRESSURE_PLATE
    );
    public static final DeferredBlock<DirtPressurePlateBlock> SILENT_DIRT_PRESSURE_PLATE = register(
            () -> new DirtPressurePlateBlock(true),
            PressurePlatesRegistries.SILENT_DIRT_PRESSURE_PLATE
    );


    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_OAK_PRESSURE_PLATE      = register(
            () -> new MuteablePressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)),
            PressurePlatesRegistries.SILENT_OAK_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_SPRUCE_PRESSURE_PLATE   = register(
            () -> new MuteablePressurePlateBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PRESSURE_PLATE)),
            PressurePlatesRegistries.SILENT_SPRUCE_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_BIRCH_PRESSURE_PLATE    = register(
            () -> new MuteablePressurePlateBlock(BlockSetType.BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PRESSURE_PLATE)),
            PressurePlatesRegistries.SILENT_BIRCH_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_JUNGLE_PRESSURE_PLATE   = register(
            () -> new MuteablePressurePlateBlock(BlockSetType.JUNGLE, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PRESSURE_PLATE)),
            PressurePlatesRegistries.SILENT_JUNGLE_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_ACACIA_PRESSURE_PLATE   = register(
            () -> new MuteablePressurePlateBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PRESSURE_PLATE)),
            PressurePlatesRegistries.SILENT_ACACIA_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_DARK_OAK_PRESSURE_PLATE = register(
            () -> new MuteablePressurePlateBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PRESSURE_PLATE)),
            PressurePlatesRegistries.SILENT_DARK_OAK_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_MANGROVE_PRESSURE_PLATE = register(
            () -> new MuteablePressurePlateBlock(BlockSetType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PRESSURE_PLATE)),
            PressurePlatesRegistries.SILENT_MANGROVE_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_CHERRY_PRESSURE_PLATE   = register(
            () -> new MuteablePressurePlateBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PRESSURE_PLATE)),
            PressurePlatesRegistries.SILENT_CHERRY_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_BAMBOO_PRESSURE_PLATE   = register(
            () -> new MuteablePressurePlateBlock(BlockSetType.BAMBOO, BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PRESSURE_PLATE)),
            PressurePlatesRegistries.SILENT_BAMBOO_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_CRIMSON_PRESSURE_PLATE  = register(
            () -> new MuteablePressurePlateBlock(BlockSetType.CRIMSON, BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PRESSURE_PLATE)),
            PressurePlatesRegistries.SILENT_CRIMSON_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_WARPED_PRESSURE_PLATE   = register(
            () -> new MuteablePressurePlateBlock(BlockSetType.WARPED, BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PRESSURE_PLATE)),
            PressurePlatesRegistries.SILENT_WARPED_PRESSURE_PLATE
    );

    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_STONE_PRESSURE_PLATE  = register(
            () -> new MuteablePressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE)),
            PressurePlatesRegistries.SILENT_STONE_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE   = register(
            () -> new MuteablePressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE)),
            PressurePlatesRegistries.SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE
    );


    public static void onCreativeModeTabEvent(@NotNull BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            insertItem(event, SILENT_DIRT_PRESSURE_PLATE);
            insertItem(event, DIRT_PRESSURE_PLATE);
            insertItem(event, SILENT_NETHERRACK_PRESSURE_PLATE);
            insertItem(event, NETHERRACK_PRESSURE_PLATE);
            insertItem(event, SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE);
            insertItem(event, MOSSY_COBBLESTONE_PRESSURE_PLATE);
            insertItem(event, SILENT_OBSIDIAN_PRESSURE_PLATE);
            insertItem(event, OBSIDIAN_PRESSURE_PLATE);

            insertItem(event, Blocks.OAK_PRESSURE_PLATE, SILENT_OAK_PRESSURE_PLATE);
            insertItem(event, Blocks.STONE_PRESSURE_PLATE, SILENT_STONE_PRESSURE_PLATE);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            insertItem(event, Blocks.OAK_PRESSURE_PLATE, SILENT_OAK_PRESSURE_PLATE);
            insertItem(event, Blocks.SPRUCE_PRESSURE_PLATE, SILENT_SPRUCE_PRESSURE_PLATE);
            insertItem(event, Blocks.BIRCH_PRESSURE_PLATE, SILENT_BIRCH_PRESSURE_PLATE);
            insertItem(event, Blocks.JUNGLE_PRESSURE_PLATE, SILENT_JUNGLE_PRESSURE_PLATE);
            insertItem(event, Blocks.ACACIA_PRESSURE_PLATE, SILENT_ACACIA_PRESSURE_PLATE);
            insertItem(event, Blocks.DARK_OAK_PRESSURE_PLATE, SILENT_DARK_OAK_PRESSURE_PLATE);
            insertItem(event, Blocks.MANGROVE_PRESSURE_PLATE, SILENT_MANGROVE_PRESSURE_PLATE);
            insertItem(event, Blocks.CHERRY_PRESSURE_PLATE, SILENT_CHERRY_PRESSURE_PLATE);
            insertItem(event, Blocks.BAMBOO_PRESSURE_PLATE, SILENT_BAMBOO_PRESSURE_PLATE);
            insertItem(event, Blocks.CRIMSON_PRESSURE_PLATE, SILENT_CRIMSON_PRESSURE_PLATE);
            insertItem(event, Blocks.WARPED_PRESSURE_PLATE, SILENT_WARPED_PRESSURE_PLATE);

            insertItem(event, Blocks.STONE_PRESSURE_PLATE, SILENT_STONE_PRESSURE_PLATE);
            insertItem(event, Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE, SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE);
        }
    }

    private static void insertItem(@NotNull BuildCreativeModeTabContentsEvent event, ItemLike itemLike) {
        event.insertAfter(
                new ItemStack(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE),
                new ItemStack(itemLike),
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
        );
    }

    private static void insertItem(@NotNull BuildCreativeModeTabContentsEvent event, ItemLike after, ItemLike itemLike) {
        event.insertAfter(
                new ItemStack(after),
                new ItemStack(itemLike),
                CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
        );
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
