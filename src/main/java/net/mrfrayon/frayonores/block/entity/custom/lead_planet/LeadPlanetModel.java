package net.mrfrayon.frayonores.block.entity.custom.lead_planet;

import net.minecraft.resources.ResourceLocation;
import net.mrfrayon.frayonores.FrayonOres;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LeadPlanetModel extends AnimatedGeoModel<LeadPlanetBlockEntity> {


    @Override
    public ResourceLocation getModelResource(LeadPlanetBlockEntity object) {
        return new ResourceLocation(FrayonOres.MODID, "geo/lead_planet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LeadPlanetBlockEntity object) {
        return new ResourceLocation(FrayonOres.MODID, "textures/block/lead_planet.png");

    }

    @Override
    public ResourceLocation getAnimationResource(LeadPlanetBlockEntity animatable) {
        return new ResourceLocation(FrayonOres.MODID, "animations/lead_planet.animation.json");

    }
}
