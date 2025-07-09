package net.grindyelytras.item.custom;

import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class ElytraFragmentItem extends Item {
    static {
        ItemTooltipCallback.EVENT.register((stack, context, type, lines) -> {
            if (stack.getItem() instanceof ElytraFragmentItem) {
                lines.add(Text.translatable("item.grindy-elytras.elytra_fragment.tooltip")
                        .formatted(Formatting.GRAY));
            }
        });
    }

    public ElytraFragmentItem(Settings settings) {
        super(settings);
    }
}