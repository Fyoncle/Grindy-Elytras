package net.grindyelytras.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.grindyelytras.GrindyElytras;
import net.grindyelytras.item.custom.ElytraFragmentItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ELYTRA_FRAGMENT = register("elytra_fragment",
            new ElytraFragmentItem(new Item.Settings()));

    private static <I extends Item> I register(String name, I item) {
        return Registry.register(Registries.ITEM, Identifier.of(GrindyElytras.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GrindyElytras.LOGGER.info("Grindy Elytras - Torturing people who wants to get Elytra...");
        init();
    }

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(modifier -> {
            modifier.addAfter(Items.ELYTRA, ELYTRA_FRAGMENT);
        });
    }
}