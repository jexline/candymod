package com.exline.candymod;

import com.exline.candymod.items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CandyMod implements ModInitializer {

    public static final String MOD_ID = "candymod";

    public static final ItemGroup CANDY_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "tab")).icon(() ->
            new ItemStack(ModItems.LOLLIPOP)).build();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}