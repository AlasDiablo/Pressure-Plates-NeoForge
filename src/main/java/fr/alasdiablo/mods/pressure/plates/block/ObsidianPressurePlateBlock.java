package fr.alasdiablo.mods.pressure.plates.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ObsidianPressurePlateBlock extends MuteablePressurePlateBlock {
    public ObsidianPressurePlateBlock(boolean muted) {
        super(Properties.of()
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

    @Override
    public void appendHoverText(
            @NotNull ItemStack stack, Item.@NotNull TooltipContext context, @NotNull List<Component> tooltip, @NotNull TooltipFlag tooltipFlag
    ) {
        tooltip.add(
                Component.translatable("block.dio_pressure_plates.obsidian_pressure_plate.hover_text").withStyle(ChatFormatting.GRAY)
        );
    }
}
