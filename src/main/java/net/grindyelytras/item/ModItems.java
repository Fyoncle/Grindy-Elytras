package net.grindyelytras.item;

import net.grindyelytras.GrindyElytras;
import net.grindyelytras.item.custom.ElytraFragmentItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ELYTRA_FRAGMENT = register("elytra_fragment",
            new ElytraFragmentItem(new Item.Settings().group(ItemGroup.TRANSPORTATION)));

    private static <I extends Item> I register(String name, I item) {
        return Registry.register(Registry.ITEM, new Identifier(GrindyElytras.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GrindyElytras.LOGGER.info("Grindy Elytras - Torturing people who wants to get Elytra...");
    }
}