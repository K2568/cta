package com.k256.createtransportadditions;

import com.simibubi.create.content.contraptions.actors.contraptionControls.ContraptionControlsMovement;
import com.simibubi.create.content.contraptions.actors.contraptionControls.ContraptionControlsMovingInteraction;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.material.MapColor;

import static com.simibubi.create.api.behaviour.interaction.MovingInteractionBehaviour.interactionBehaviour;
import static com.simibubi.create.api.behaviour.movement.MovementBehaviour.movementBehaviour;
import static com.simibubi.create.foundation.data.AssetLookup.partialBaseModel;
import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static com.simibubi.create.foundation.data.TagGen.axeOrPickaxe;

public class ModBlocks {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CTA.MOD_ID);

    public static final BlockEntry<SmallContraptionControlsBlock> SMALL_CONTRAPTION_CONTROLS =
            REGISTRATE.block("small_contraption_controls", SmallContraptionControlsBlock::new)
                    .initialProperties(SharedProperties::stone)
                    .properties(p -> p.mapColor(MapColor.PODZOL))
                    .addLayer(() -> RenderType::cutoutMipped)
                    .transform(axeOrPickaxe())
                    .blockstate((c, p) -> p.horizontalBlock(c.get(), s -> partialBaseModel(c, p)))
                    .onRegister(movementBehaviour(new ContraptionControlsMovement()))
                    .onRegister(interactionBehaviour(new ContraptionControlsMovingInteraction()))
                    .item()
                    .transform(customItemModel())
                    .register();


    public static void init() {
        // load the class and register everything
        CTA.LOGGER.info("Registering blocks for " + CTA.NAME);
    }
}
