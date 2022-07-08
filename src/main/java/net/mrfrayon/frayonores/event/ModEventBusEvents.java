package net.mrfrayon.frayonores.event;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.mrfrayon.frayonores.FrayonOres;
import net.mrfrayon.frayonores.block.entity.ModBlockEntities;
import net.mrfrayon.frayonores.block.entity.custom.lead_planet.LeadPlanetRenderer;
import net.mrfrayon.frayonores.entity.armor.sculky.SculkyArmorRenderer;
import net.mrfrayon.frayonores.item.custom.SculkyArmorItem;
import net.mrfrayon.frayonores.particle.Custom.BolariumParticles;
import net.mrfrayon.frayonores.particle.ModParticles;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = FrayonOres.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.LEAD_PLANET_BLOCK_ENTITY.get(), LeadPlanetRenderer::new);
    }
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(SculkyArmorItem.class, new SculkyArmorRenderer());
    }
    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particleEngine.register(ModParticles.BOLARIUM_PARTICLES.get(),
                BolariumParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(ModParticles.BOLARIUM_POWER_PARTICLES.get(),
                BolariumParticles.Provider::new);
    }


}
