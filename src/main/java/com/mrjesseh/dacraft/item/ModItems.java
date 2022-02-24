package com.mrjesseh.dacraft.item;

import com.mrjesseh.dacraft.DaCraft;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //public static final Item

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DaCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DaCraft.LOGGER.info("Registering Mod Items for " + DaCraft.MOD_ID);
    }
}
