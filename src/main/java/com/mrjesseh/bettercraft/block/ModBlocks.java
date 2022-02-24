package com.mrjesseh.bettercraft.block;

import com.mrjesseh.bettercraft.BetterCraft;
import com.mrjesseh.bettercraft.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    // Diolironerite
    public static final Block DIOLIRONERITE_BLOCK = registerBlock("diolironerite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.BETTERCRAFT);
    public static final Block POOP_BLOCK = registerBlock("poop_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()), ModItemGroup.BETTERCRAFT);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(BetterCraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(BetterCraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        BetterCraft.LOGGER.info("Registering ModBlocks for " + BetterCraft.MOD_ID);
    }
}
