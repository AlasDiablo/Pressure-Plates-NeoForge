package fr.alasdiablo.mods.pressure.plates.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class HoverTextBlockItem extends BlockItem {
    private final String hoverTextKey;

    public HoverTextBlockItem(Block block, Properties properties, String hoverTextKey) {
        super(block, properties);
        this.hoverTextKey = hoverTextKey;
    }

    @Override
    public void appendHoverText(
            @NotNull ItemStack stack,
            @NotNull TooltipContext context,
            @NotNull TooltipDisplay tooltipDisplay,
            @NotNull Consumer<Component> tooltipAdder,
            @NotNull TooltipFlag flag
    ) {
        tooltipAdder.accept(
                Component.translatable(this.hoverTextKey).withStyle(ChatFormatting.GRAY)
        );
    }
}
