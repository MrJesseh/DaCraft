package com.mrjesseh.bettercraft.item;

import com.mrjesseh.bettercraft.BetterCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item WOODEN_PADDLE = registerItem("wooden_paddle",
            new Item(new FabricItemSettings().group(ModItemGroup.BETTERCRAFT)));
    public static final Item IRON_PADDLE = registerItem("iron_paddle",
            new Item(new FabricItemSettings().group(ModItemGroup.BETTERCRAFT)));
    public static final Item GOLD_PADDLE = registerItem("gold_paddle",
            new Item(new FabricItemSettings().group(ModItemGroup.BETTERCRAFT)));
    public static final Item DIAMOND_PADDLE = registerItem("diamond_paddle",
            new Item(new FabricItemSettings().group(ModItemGroup.BETTERCRAFT)));
    public static final Item POOP = registerItem("poop",
            new Item(new FabricItemSettings().group(ModItemGroup.BETTERCRAFT)));
    public static final Item COOKED_POOP = registerItem("cooked_poop",
            new Item(new FabricItemSettings().group(ModItemGroup.BETTERCRAFT)));
    public static final Item HARDENED_POOP = registerItem("hardened_poop",
            new Item(new FabricItemSettings().group(ModItemGroup.BETTERCRAFT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BetterCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterCraft.LOGGER.info("Registering Mod Items for " + BetterCraft.MOD_ID);
    }
}
