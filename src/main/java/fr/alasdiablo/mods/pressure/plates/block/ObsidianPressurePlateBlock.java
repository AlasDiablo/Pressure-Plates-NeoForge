package fr.alasdiablo.mods.pressure.plates.block;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;

public class ObsidianPressurePlateBlock extends MuteablePressurePlateBlock {
    public static final String HOVER_TEXT_KEY = "block.dio_pressure_plates.obsidian_pressure_plate.hover_text";

    public ObsidianPressurePlateBlock(boolean muted, ResourceKey<Block> id) {
        super(Properties.of()
                .setId(id)
                .mapColor(MapColor.COLOR_BLACK)
                .forceSolidOn()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .noCollission()
                .strength(5.0f, 1200.0f)
                .pushReaction(PushReaction.DESTROY), muted);
    }

    @Override
    protected int getSignalStrength(@NotNull Level level, @NotNull BlockPos pos) {
        return getEntityCount(level, TOUCH_AABB.move(pos), Player.class) > 0 ? 15 : 0;
    }
}
