package net.mrfrayon.frayonores.item.client;

import net.mrfrayon.frayonores.item.custom.LeadPlanetItemBlock;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class LeadPlanetItemBlockRenderer extends GeoItemRenderer<LeadPlanetItemBlock> {

    public LeadPlanetItemBlockRenderer() {
        super(new LeadPlanetItemBlockModell());
    }
}
