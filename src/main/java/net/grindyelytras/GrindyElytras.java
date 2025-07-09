package net.grindyelytras;

import net.fabricmc.api.ModInitializer;
import net.grindyelytras.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrindyElytras implements ModInitializer {
    public static final String MOD_ID = "grindy-elytras";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}