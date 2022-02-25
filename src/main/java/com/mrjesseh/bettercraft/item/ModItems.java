package com.mrjesseh.bettercraft.item;

import com.mrjesseh.bettercraft.BetterCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Weapons
    public static final Item WOODEN_PADDLE = registerItem("wooden_paddle",
            new SwordItem(ModToolMaterial.DIAMOND, 2, 3.0f, new Item.Settings().group(ModItemGroup.BETTERCRAFT)));
    public static final Item IRON_PADDLE = registerItem("iron_paddle",
            new SwordItem(ModToolMaterial.DIAMOND, 5, 3.0f, new Item.Settings().group(ModItemGroup.BETTERCRAFT)));
    public static final Item GOLD_PADDLE = registerItem("gold_paddle",
            new SwordItem(ModToolMaterial.DIAMOND, 7, 3.0f, new Item.Settings().group(ModItemGroup.BETTERCRAFT)));
    public static final Item DIAMOND_PADDLE = registerItem("diamond_paddle",
            new SwordItem(ModToolMaterial.DIAMOND, 10, 3.0f, new Item.Settings().group(ModItemGroup.BETTERCRAFT)));

   // Materials
    public static final Item POOP = registerItem("poop",
            new Item(new FabricItemSettings().group(ModItemGroup.BETTERCRAFT)));
    public static final Item COOKED_POOP = registerItem("cooked_poop",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7)
                    .saturationModifier(10f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,
                            20*60, 3), 100f).build()).group(ModItemGroup.BETTERCRAFT)));
    public static final Item HARDENED_POOP = registerItem("hardened_poop",
            new Item(new FabricItemSettings().group(ModItemGroup.BETTERCRAFT)));

   // Armor
    public static final Item POOP_HELMET = registerItem("poop_helmet",
            new ArmorItem(ModArmorMaterial.POOP, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.BETTERCRAFT)));
    public static final Item POOP_CHESPLATE = registerItem("poop_chestplate",
            new ArmorItem(ModArmorMaterial.POOP, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.BETTERCRAFT)));
    public static final Item POOP_LEGGINGS = registerItem("poop_leggings",
            new ArmorItem(ModArmorMaterial.POOP, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.BETTERCRAFT)));
    public static final Item POOP_BOOTS = registerItem("poop_boots",
            new ArmorItem(ModArmorMaterial.POOP, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.BETTERCRAFT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BetterCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterCraft.LOGGER.info("Registering Mod Items for " + BetterCraft.MOD_ID);
    }
}
