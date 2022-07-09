package net.mrfrayon.frayonores;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.mrfrayon.frayonores.block.ModBlocks;
import net.mrfrayon.frayonores.block.custom.nonblocks.NonBlocksRegistry;
import net.mrfrayon.frayonores.block.entity.ModBlockEntities;
import net.mrfrayon.frayonores.item.ModItems;
import net.mrfrayon.frayonores.particle.ModParticles;
import net.mrfrayon.frayonores.world.biomemods.ModBiomeModifier;
import net.mrfrayon.frayonores.world.feature.ModPlacedFeatures;
import net.mrfrayon.frayonores.world.structures.ModStructures;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FrayonOres.MODID)
public class FrayonOres
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "frayonores";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public FrayonOres()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBiomeModifier.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);
        NonBlocksRegistry.register(modEventBus);
        ModParticles.register(modEventBus);
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(this::setup);
        ModBlockEntities.register(modEventBus);
        ModStructures.register(modEventBus);

        GeckoLib.initialize();
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LETACREATE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STONY_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SCULK_MUSHROOM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_SCULK_MUSHROOM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(NonBlocksRegistry.STONY_TRAPDOOR.get(), RenderType.translucent());



    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT ).addPlant(ModBlocks.SCULK_MUSHROOM.getId(), ModBlocks.POTTED_SCULK_MUSHROOM);
        });
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
