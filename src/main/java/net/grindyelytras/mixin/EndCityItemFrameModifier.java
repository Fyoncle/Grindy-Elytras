package net.grindyelytras.mixin;

import net.grindyelytras.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.structure.EndCityGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(EndCityGenerator.Piece.class)
public class EndCityItemFrameModifier {

    @ModifyArgs(
            method = "handleMetadata",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/entity/decoration/ItemFrameEntity;setHeldItemStack(Lnet/minecraft/item/ItemStack;Z)V"
            )
    )
    private void modifySetHeldItemStackArgs(Args args) {
        args.set(0, new ItemStack(ModItems.ELYTRA_FRAGMENT));
    }
}
