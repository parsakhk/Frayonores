package net.mrfrayon.frayonores.entity.armor.sculky;

import net.mrfrayon.frayonores.item.custom.SculkyArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class SculkyArmorRenderer extends GeoArmorRenderer<SculkyArmorItem> {
    public SculkyArmorRenderer() {
        super(new SculkyArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
