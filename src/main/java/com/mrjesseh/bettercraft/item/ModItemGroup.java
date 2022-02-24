package com.mrjesseh.bettercraft.item;

import com.mrjesseh.bettercraft.BetterCraft;
import com.mrjesseh.bettercraft.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup BETTERCRAFT = FabricItemGroupBuilder.build(new Identifier(BetterCraft.MOD_ID, "bettercraft"),
            () -> new ItemStack(ModBlocks.DIOLIRONERITE_BLOCK));
}
