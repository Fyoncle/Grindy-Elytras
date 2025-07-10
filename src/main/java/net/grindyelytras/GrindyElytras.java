package net.grindyelytras;

import net.fabricmc.api.ModInitializer;
import net.grindyelytras.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GrindyElytras implements ModInitializer {
    public static final String MOD_ID = "grindy-elytras";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}