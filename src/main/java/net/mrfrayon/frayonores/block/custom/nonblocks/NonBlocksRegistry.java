package net.mrfrayon.frayonores.block.custom.nonblocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrfrayon.frayonores.FrayonOres;
import net.mrfrayon.frayonores.block.ModBlocks;
import net.mrfrayon.frayonores.item.ModItemGroups;
import net.mrfrayon.frayonores.item.ModItems;

import java.util.function.Supplier;

public class NonBlocksRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FrayonOres.MODID);
    // STONY

    // Button
    public static final RegistryObject<Block> STONY_STAIRS = registerBlock("stony_stairs",
            () -> new StairBlock(() -> ModBlocks.STONY_PLANK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
            ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> STONY_SLAB = registerBlock("stony_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);

    public static final RegistryObject<Block> STONY_FENCE = registerBlock("stony_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> STONY_FENCE_GATE = registerBlock("stony_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> STONY_WALL = registerBlock("stony_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);

    public static final RegistryObject<Block> STONY_BUTTON = registerBlock("stony_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noCollission()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> STONY_PRESSURE_PLATE = registerBlock("stony_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);

    public static final RegistryObject<Block> STONY_TRAPDOOR = registerBlock("stony_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion()
                    .requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

