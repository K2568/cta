package com.k256.createtransportadditions.forge;

import com.k256.createtransportadditions.CTA;
import com.k256.createtransportadditions.ModBlocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CTA.MOD_ID)
public class CTAForge {
    public CTAForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.REGISTRATE.registerEventListeners(eventBus);
        CTA.init();
    }
}

