package com.k256.createtransportadditions.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import com.k256.createtransportadditions.CTA;
import com.k256.createtransportadditions.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class CTAFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CTA.init();
        CTA.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), CTA.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        ModBlocks.REGISTRATE.register();
    }
}

