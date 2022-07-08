package net.mrfrayon.frayonores.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
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
import net.mrfrayon.frayonores.block.custom.*;
import net.mrfrayon.frayonores.item.ModItemGroups;
import net.mrfrayon.frayonores.item.ModItems;
import net.mrfrayon.frayonores.world.feature.tree.StonyTreeGrower;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FrayonOres.MODID);

    public static final RegistryObject<Block> NICHOLER_BLOCK = registerBlock("nicholer_block",() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);

    public static final RegistryObject<Block> NICHOLER_ORE = registerBlock("nicholer_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> ENDSTONE_NICHOLER_ORE = registerBlock("nicholer_endstone_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> NETHERRACK_NICHOLER_ORE = registerBlock("nicholer_netherrack_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModItemGroups.FRAYON_ORE_TAB);

    public static final RegistryObject<Block> BOLARIUM_ORE = registerBlock("bolarium_ore", () -> new BolariumOre(BlockBehaviour.Properties.of(Material.STONE).strength(8f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> BOLARIUM_BLOCK = registerBlock("bolarium_block", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(18f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModItemGroups.FRAYON_ORE_TAB);

    // ALLIMINIUM
    public static final RegistryObject<Block> ALIMINIUM_BLOCK = registerBlock("aliminium_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> ALIMINIUM_NETHERRACK_ORE = registerBlock("aliminium_netherrack_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> ALIMINIUM_DEEPSLATE_ORE = registerBlock("aliminium_deepslate_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> ALIMINIUM_ORE = registerBlock("aliminium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);

    //LEAD
    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> LEAD_DEEPSLATE_ORE = registerBlock("lead_deepslate_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    //MUDDY ORE VARIANTATION

    public static final RegistryObject<Block> MUDDY_COAL_ORE = registerBlock("muddy_coal_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> MUDDY_COPPER_ORE = registerBlock("muddy_copper_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> MUDDY_IRON_ORE = registerBlock("muddy_iron_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> MUDDY_LAPIS_ORE = registerBlock("muddy_lapis_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4.5f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> MUDDY_REDSTONE_ORE = registerBlock("muddy_redstone_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> MUDDY_DIAMOND_ORE = registerBlock("muddy_diamond_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> MUDDY_EMERALD_ORE = registerBlock("muddy_emerald_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> MUDDY_GOLD_ORE = registerBlock("muddy_gold_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), ModItemGroups.FRAYON_ORE_TAB);

    //STONY LOG BLCOKS
    public static final RegistryObject<Block> STONY_LOG = registerBlock("stony_log", () -> new ModFlammableRotatablePillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> STONY_WOOD = registerBlock("stony_wood", () -> new ModFlammableRotatablePillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> STRIPPED_STONY_LOG = registerBlock("stripped_stony_log", () -> new ModFlammableRotatablePillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> STRIPPED_STONY_WOOD = registerBlock("stripped_stony_wood", () -> new ModFlammableRotatablePillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroups.FRAYON_ORE_TAB);

    public static final RegistryObject<Block> SCULK_AMBUSH = registerBlock("sculky_ambush", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SCULK)), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> SCULKY_MUSHROOM_GROWER = registerBlock("sculky_plant_grower", () -> new ModFlammableRotatablePillarBlock(BlockBehaviour.Properties.copy(Blocks.SCULK)), ModItemGroups.FRAYON_ORE_TAB);


    public static final RegistryObject<Block> SCULK_MUSHROOM = registerBlock("sculk_mushroom", () -> new ModSculkMushroomBlock(MobEffects.DARKNESS, 3, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion().noCollission(), () -> ModBlocks.SCULK_AMBUSH.get()), ModItemGroups.FRAYON_ORE_TAB);


    public static final RegistryObject<Block> POTTED_SCULK_MUSHROOM = registerBlockWithoutBlockItem("potted_sculk_mushroom", () -> new FlowerPotBlock(null, ModBlocks.SCULK_MUSHROOM, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));


    public static final RegistryObject<Block> STONY_PLANK = registerBlock("stony_plank", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModItemGroups.FRAYON_ORE_TAB);

    public static final RegistryObject<Block> LETACREATE_LEAVES = registerBlock("letacreate_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModItemGroups.FRAYON_ORE_TAB);
    public static final RegistryObject<Block> STONY_SAPLING = registerBlock("stony_sapling",() -> new ModSaplingBlock(new StonyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), () -> Blocks.STONE), ModItemGroups.FRAYON_ORE_TAB);

    public static final RegistryObject<Block> LEAD_PLANET = registerBlockWithoutBlockItem("lead_planet",
            () -> new LeadPlanet(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

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
