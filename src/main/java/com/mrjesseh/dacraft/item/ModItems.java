package com.mrjesseh.dacraft.item;

import com.mrjesseh.dacraft.DaCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item PADDLE = registerItem("paddle",
            new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DaCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DaCraft.LOGGER.info("Registering Mod Items for " + DaCraft.MOD_ID);
    }
}
