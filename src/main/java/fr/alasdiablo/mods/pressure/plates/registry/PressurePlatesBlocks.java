package fr.alasdiablo.mods.pressure.plates.registry;

import fr.alasdiablo.mods.pressure.plates.PressurePlates;
import fr.alasdiablo.mods.pressure.plates.PressurePlatesRegistries;
import fr.alasdiablo.mods.pressure.plates.block.*;
import fr.alasdiablo.mods.pressure.plates.item.HoverTextBlockItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.function.Function;

public class PressurePlatesBlocks {
    static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PressurePlates.MOD_ID);
    static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PressurePlates.MOD_ID);


    public static final DeferredBlock<ObsidianPressurePlateBlock> OBSIDIAN_PRESSURE_PLATE = register(
            (registryName) -> new ObsidianPressurePlateBlock(false, ResourceKey.create(Registries.BLOCK, registryName)),
            PressurePlatesRegistries.OBSIDIAN_PRESSURE_PLATE,
            ObsidianPressurePlateBlock.HOVER_TEXT_KEY
    );
    public static final DeferredBlock<ObsidianPressurePlateBlock> SILENT_OBSIDIAN_PRESSURE_PLATE = register(
            (registryName) -> new ObsidianPressurePlateBlock(true, ResourceKey.create(Registries.BLOCK, registryName)),
            PressurePlatesRegistries.SILENT_OBSIDIAN_PRESSURE_PLATE,
            ObsidianPressurePlateBlock.HOVER_TEXT_KEY
    );
    public static final DeferredBlock<MossyCobblestonePressurePlateBlock> MOSSY_COBBLESTONE_PRESSURE_PLATE = register(
            (registryName) -> new MossyCobblestonePressurePlateBlock(false, ResourceKey.create(Registries.BLOCK, registryName)),
            PressurePlatesRegistries.MOSSY_COBBLESTONE_PRESSURE_PLATE,
            MossyCobblestonePressurePlateBlock.HOVER_TEXT_KEY
    );
    public static final DeferredBlock<MossyCobblestonePressurePlateBlock> SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE = register(
            (registryName) -> new MossyCobblestonePressurePlateBlock(true, ResourceKey.create(Registries.BLOCK, registryName)),
            PressurePlatesRegistries.SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE,
            MossyCobblestonePressurePlateBlock.HOVER_TEXT_KEY
    );
    public static final DeferredBlock<NetherrackPressurePlateBlock> NETHERRACK_PRESSURE_PLATE = register(
            (registryName) -> new NetherrackPressurePlateBlock(false, ResourceKey.create(Registries.BLOCK, registryName)),
            PressurePlatesRegistries.NETHERRACK_PRESSURE_PLATE,
            NetherrackPressurePlateBlock.HOVER_TEXT_KEY
    );
    public static final DeferredBlock<NetherrackPressurePlateBlock> SILENT_NETHERRACK_PRESSURE_PLATE = register(
            (registryName) -> new NetherrackPressurePlateBlock(true, ResourceKey.create(Registries.BLOCK, registryName)),
            PressurePlatesRegistries.SILENT_NETHERRACK_PRESSURE_PLATE,
            NetherrackPressurePlateBlock.HOVER_TEXT_KEY
    );
    public static final DeferredBlock<DirtPressurePlateBlock> DIRT_PRESSURE_PLATE = register(
            (registryName) -> new DirtPressurePlateBlock(false, ResourceKey.create(Registries.BLOCK, registryName)),
            PressurePlatesRegistries.DIRT_PRESSURE_PLATE,
            DirtPressurePlateBlock.HOVER_TEXT_KEY
    );
    public static final DeferredBlock<DirtPressurePlateBlock> SILENT_DIRT_PRESSURE_PLATE = register(
            (registryName) -> new DirtPressurePlateBlock(true, ResourceKey.create(Registries.BLOCK, registryName)),
            PressurePlatesRegistries.SILENT_DIRT_PRESSURE_PLATE,
            DirtPressurePlateBlock.HOVER_TEXT_KEY
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_OAK_PRESSURE_PLATE = register(
            (registryName) -> new MuteablePressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))),
            PressurePlatesRegistries.SILENT_OAK_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_SPRUCE_PRESSURE_PLATE = register(
            (registryName) -> new MuteablePressurePlateBlock(BlockSetType.SPRUCE, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PRESSURE_PLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))),
            PressurePlatesRegistries.SILENT_SPRUCE_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_BIRCH_PRESSURE_PLATE = register(
            (registryName) -> new MuteablePressurePlateBlock(BlockSetType.BIRCH, BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PRESSURE_PLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))),
            PressurePlatesRegistries.SILENT_BIRCH_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_JUNGLE_PRESSURE_PLATE = register(
            (registryName) -> new MuteablePressurePlateBlock(BlockSetType.JUNGLE, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PRESSURE_PLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))),
            PressurePlatesRegistries.SILENT_JUNGLE_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_ACACIA_PRESSURE_PLATE = register(
            (registryName) -> new MuteablePressurePlateBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PRESSURE_PLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))),
            PressurePlatesRegistries.SILENT_ACACIA_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_DARK_OAK_PRESSURE_PLATE = register(
            (registryName) -> new MuteablePressurePlateBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PRESSURE_PLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))),
            PressurePlatesRegistries.SILENT_DARK_OAK_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_MANGROVE_PRESSURE_PLATE = register(
            (registryName) -> new MuteablePressurePlateBlock(BlockSetType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PRESSURE_PLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))),
            PressurePlatesRegistries.SILENT_MANGROVE_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_CHERRY_PRESSURE_PLATE = register(
            (registryName) -> new MuteablePressurePlateBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PRESSURE_PLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))),
            PressurePlatesRegistries.SILENT_CHERRY_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_BAMBOO_PRESSURE_PLATE = register(
            (registryName) -> new MuteablePressurePlateBlock(BlockSetType.BAMBOO, BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PRESSURE_PLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))),
            PressurePlatesRegistries.SILENT_BAMBOO_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_CRIMSON_PRESSURE_PLATE = register(
            (registryName) -> new MuteablePressurePlateBlock(BlockSetType.CRIMSON, BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PRESSURE_PLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))),
            PressurePlatesRegistries.SILENT_CRIMSON_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_WARPED_PRESSURE_PLATE = register(
            (registryName) -> new MuteablePressurePlateBlock(BlockSetType.WARPED, BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PRESSURE_PLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))),
            PressurePlatesRegistries.SILENT_WARPED_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_STONE_PRESSURE_PLATE = register(
            (registryName) -> new MuteablePressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))),
            PressurePlatesRegistries.SILENT_STONE_PRESSURE_PLATE
    );
    public static final DeferredBlock<MuteablePressurePlateBlock> SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE = register(
            (registryName) -> new MuteablePressurePlateBlock(
                    BlockSetType.POLISHED_BLACKSTONE, BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE)
                    .setId(ResourceKey.create(Registries.BLOCK, registryName))),
            PressurePlatesRegistries.SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE
    );


    private static <T extends Block> @NotNull DeferredBlock<T> register(Function<Identifier, ? extends T> block, String name) {
        DeferredBlock<T> blockRegistry = BLOCKS.register(name, block);
        ITEMS.registerSimpleBlockItem(blockRegistry);
        return blockRegistry;
    }

    private static <T extends Block> @NotNull DeferredBlock<T> register(Function<Identifier, ? extends T> block, String name, String hoverTextKey) {
        DeferredBlock<T> blockRegistry = BLOCKS.register(name, block);

        Item.Properties properties = new Item.Properties();
        String blockNamePath = blockRegistry.unwrapKey().orElseThrow().identifier().getPath();

        ITEMS.register(blockNamePath, key -> new HoverTextBlockItem(
                        blockRegistry.value(),
                        properties.setId(ResourceKey.create(Registries.ITEM, key)).useBlockDescriptionPrefix(),
                        hoverTextKey
                )
        );

        return blockRegistry;
    }


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

    public static Collection<DeferredHolder<Block,? extends Block>> getRegisteredBlocks() {
        return BLOCKS.getEntries();
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
