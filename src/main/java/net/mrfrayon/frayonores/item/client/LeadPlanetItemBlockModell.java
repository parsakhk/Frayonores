package net.mrfrayon.frayonores.item.client;

import net.minecraft.resources.ResourceLocation;
import net.mrfrayon.frayonores.FrayonOres;
import net.mrfrayon.frayonores.item.custom.LeadPlanetItemBlock;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LeadPlanetItemBlockModell extends AnimatedGeoModel<LeadPlanetItemBlock> {


    @Override
    public ResourceLocation getModelResource(LeadPlanetItemBlock object) {
        return new ResourceLocation(FrayonOres.MODID, "geo/lead_planet.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LeadPlanetItemBlock object) {
        return new ResourceLocation(FrayonOres.MODID, "textures/block/lead_planet.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LeadPlanetItemBlock animatable) {
        return new ResourceLocation(FrayonOres.MODID, "animations/lead_planet.animation.json");
    }
}
