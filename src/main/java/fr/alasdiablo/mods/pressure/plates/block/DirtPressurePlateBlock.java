package fr.alasdiablo.mods.pressure.plates.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.Leashable;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;

public class DirtPressurePlateBlock extends MuteablePressurePlateBlock {
    public DirtPressurePlateBlock(boolean muted) {
        super(Properties.of()
                      .mapColor(MapColor.DIRT)
                      .strength(0.5F)
                      .sound(SoundType.GRAVEL)
                      .pushReaction(PushReaction.DESTROY)
                      .noCollission()
                      .forceSolidOn(), muted);
        this.soundType = SoundType.GRAVEL;
    }

    @Override
    protected int getSignalStrength(@NotNull Level level, @NotNull BlockPos pos) {
        return level.getEntitiesOfClass(
                LivingEntity.class,
                TOUCH_AABB.move(pos),
                EntitySelector.NO_SPECTATORS
                        .and(entity -> !entity.isIgnoringBlockTriggers())
                        .and(entity -> entity instanceof Leashable)
        ).isEmpty() ? 0 : 15;
    }
}
