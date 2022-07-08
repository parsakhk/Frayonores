package net.mrfrayon.frayonores.entity.armor.sculky;

import net.minecraft.resources.ResourceLocation;
import net.mrfrayon.frayonores.FrayonOres;
import net.mrfrayon.frayonores.item.custom.SculkyArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SculkyArmorModel extends AnimatedGeoModel<SculkyArmorItem> {
    @Override
    public ResourceLocation getModelResource(SculkyArmorItem object) {
        return new ResourceLocation(FrayonOres.MODID, "geo/sculk_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SculkyArmorItem object) {
        return new ResourceLocation(FrayonOres.MODID, "textures/models/armor/sculk_armor_textures.png");

    }

    @Override
    public ResourceLocation getAnimationResource(SculkyArmorItem animatable) {
        return new ResourceLocation(FrayonOres.MODID, "animations/sculk_armor.animation.json");

    }
}
