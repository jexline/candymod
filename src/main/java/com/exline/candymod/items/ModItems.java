package com.exline.candymod.items;

import com.exline.candymod.CandyMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Foods
    public static final Item CHOCOLATE_BAR = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).snack().build()));
    public static final Item JELLY_BEANS = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).snack().build()));
    public static final Item LOLLIPOP = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).snack().build()));
    public static final Item COTTON_CANDY = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).snack().build()));
    public static final Item CANDY_CANE = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).snack().build()));
    public static final Item TAFFY = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).snack().build()));

    public static void registerItems() {
        registerItem("chocolate_bar", CHOCOLATE_BAR);
        registerItem("jelly_beans", JELLY_BEANS);
        registerItem("lollipop", LOLLIPOP);
        registerItem("cotton_candy", COTTON_CANDY);
        registerItem("candy_cane", CANDY_CANE);
        registerItem("taffy", TAFFY);
    }

    public static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(CandyMod.MOD_ID, name), item);
        ItemGroupEvents.modifyEntriesEvent(CandyMod.ITEM_GROUP).register(content -> {
            content.add(item);});
    }
}
