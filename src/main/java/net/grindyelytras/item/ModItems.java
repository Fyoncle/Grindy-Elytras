package net.grindyelytras.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.grindyelytras.GrindyElytras;
import net.grindyelytras.item.custom.ElytraFragmentItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item ELYTRA_FRAGMENT;

    public static void registerModItems() {
        GrindyElytras.LOGGER.info("Torturing people who wants to get Elytra...");

        Identifier id = Identifier.of(GrindyElytras.MOD_ID, "elytra_fragment");
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

        Item.Settings settings = new Item.Settings()
                .registryKey(key);

        ELYTRA_FRAGMENT = Registry.register(Registries.ITEM, key, new ElytraFragmentItem(settings));

        init();
    }

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(modifier -> {
            modifier.addAfter(Items.ELYTRA, ELYTRA_FRAGMENT);
        });
    }
}