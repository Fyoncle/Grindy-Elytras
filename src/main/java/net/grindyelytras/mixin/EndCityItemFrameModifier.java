package net.grindyelytras.mixin;

import net.grindyelytras.item.ModItems;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.structure.EndCityGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EndCityGenerator.Piece.class)
public class EndCityItemFrameModifier {

    @Redirect(
            method = "handleMetadata(Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/ServerWorldAccess;Lnet/minecraft/util/math/random/Random;Lnet/minecraft/util/math/BlockBox;)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/entity/decoration/ItemFrameEntity;setHeldItemStack(Lnet/minecraft/item/ItemStack;Z)V"
            )
    )
    private void redirectSetHeldItemStack(ItemFrameEntity itemFrame, ItemStack stack, boolean update) {
        itemFrame.setHeldItemStack(new ItemStack(ModItems.ELYTRA_FRAGMENT), update);
    }
}
