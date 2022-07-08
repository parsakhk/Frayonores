package net.mrfrayon.frayonores.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrfrayon.frayonores.FrayonOres;
import net.mrfrayon.frayonores.block.ModBlocks;
import net.mrfrayon.frayonores.item.custom.LeadPlanetItemBlock;
import net.mrfrayon.frayonores.item.custom.OreBellItem;
import net.mrfrayon.frayonores.item.custom.SculkyArmorItem;
import net.mrfrayon.frayonores.item.custom.Uranium;
import net.mrfrayon.frayonores.item.custom.barolium.BaroliumSwordItem;

public class ModItems{

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FrayonOres.MODID);

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().fireResistant().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> ANTINOMY = ITEMS.register("antinomy", () -> new Item(new Item.Properties().fireResistant().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> NICHOLER_DUST = ITEMS.register("nicholer_dust", () -> new Item(new Item.Properties().fireResistant().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> ALIMINIUM_INGOT = ITEMS.register("aliminium_ingot", () -> new Item(new Item.Properties().fireResistant().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> TERRACOTA_STICK = ITEMS.register("terracota_stick", () -> new Item(new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> ORE_BELL = ITEMS.register("ore_bell", () -> new OreBellItem(new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));

    public static final RegistryObject<Item> URANIUM = ITEMS.register("uranium", () -> new Uranium(new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> WARDEN_ABOMINATION = ITEMS.register("warden_abomination", () -> new Item(new Item.Properties().fireResistant().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> SCULK_HELMET = ITEMS.register("sculk_helmet", () -> new SculkyArmorItem(ModArmorMaterial.SCULKY,EquipmentSlot.HEAD,new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> SCULK_CHESTPLATE = ITEMS.register("sculk_chestplate", () -> new SculkyArmorItem(ModArmorMaterial.SCULKY,EquipmentSlot.CHEST,new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> SCULK_LEGGINGS = ITEMS.register("sculk_leggings", () -> new SculkyArmorItem(ModArmorMaterial.SCULKY, EquipmentSlot.LEGS,new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> SCULK_BOOTS = ITEMS.register("sculk_boots", () -> new SculkyArmorItem(ModArmorMaterial.SCULKY, EquipmentSlot.FEET,new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));


    // BOLARIUM_ITEMS
    public static final RegistryObject<Item> RAW_BOLARIUM = ITEMS.register("raw_bolarium", () -> new Item(new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> BOLARIUM_INGOT = ITEMS.register("bolarium_ingot", () -> new Item(new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> BOLARIUM_SWORD = ITEMS.register("bolarium_sword", () -> new BaroliumSwordItem(ModTiers.BORALIUM,4, 6.5F, new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> BOLARIUM_PICKAXE = ITEMS.register("bolarium_pickaxe", () -> new PickaxeItem(ModTiers.BORALIUM,2,4.5F ,new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> BOLARIUM_AXE = ITEMS.register("bolarium_axe", () -> new AxeItem(ModTiers.BORALIUM,3,7.5F ,new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> BOLARIUM_SHOVEL = ITEMS.register("bolarium_shovel", () -> new ShovelItem(ModTiers.BORALIUM,1,3.5F ,new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));
    public static final RegistryObject<Item> BOLARIUM_HOE = ITEMS.register("bolarium_hoe", () -> new HoeItem(ModTiers.BORALIUM,2,2.5F ,new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));

    public static final RegistryObject<Item> LEAD_PLANET_BLOCK_ITEM = ITEMS.register("lead_planet",
            () -> new LeadPlanetItemBlock(ModBlocks.LEAD_PLANET.get(),
                    new Item.Properties().tab(ModItemGroups.FRAYON_ORE_TAB)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
