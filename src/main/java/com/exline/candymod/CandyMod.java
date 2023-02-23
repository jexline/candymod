package com.exline.candymod;

import com.exline.candymod.items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CandyMod implements ModInitializer {

    public static final String MOD_ID = "candymod";

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(
                    new Identifier(MOD_ID, "tab"))
            .displayName(Text.literal("Candy"))
            .icon(() -> new ItemStack(ModItems.LOLLIPOP))
            .build();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}