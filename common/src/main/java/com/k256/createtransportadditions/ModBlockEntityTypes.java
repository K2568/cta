package com.k256.createtransportadditions;

import com.simibubi.create.content.contraptions.actors.contraptionControls.ContraptionControlsBlockEntity;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class ModBlockEntityTypes {
    public static final BlockEntityEntry<ContraptionControlsBlockEntity> SMALL_CONTRAPTION_CONTROLS =
            ModBlocks.REGISTRATE.blockEntity("small_contraption_controls", ContraptionControlsBlockEntity::new)
                    .validBlocks(ModBlocks.SMALL_CONTRAPTION_CONTROLS)
                    .register();

    public static void init() {
        // load the class and register everything
        CTA.LOGGER.info("Registering block entity types for " + CTA.NAME);
    }
}

