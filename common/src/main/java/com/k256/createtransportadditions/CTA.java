package com.k256.createtransportadditions;

import com.simibubi.create.Create;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CTA {
    public static final String MOD_ID = "createtransportadditions";
    public static final String NAME = "CTA";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);


    public static void init() {
        LOGGER.info("{} initializing! Create version: {} on platform: {}", NAME, Create.VERSION, ModExpectPlatform.platformName());
        ModBlocks.init();
        ModBlockEntityTypes.init();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
