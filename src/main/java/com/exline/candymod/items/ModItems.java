package com.exline.candymod.items;

import com.exline.candymod.CandyMod;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Foods
    public static final Item CHOCOLATE_BAR = new Item(new Item.Settings().group(CandyMod.CANDY_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3F).snack().build()));
    public static final Item JELLY_BEANS = new Item(new Item.Settings().group(CandyMod.CANDY_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).snack().build()));
    public static final Item LOLLIPOP = new Item(new Item.Settings().group(CandyMod.CANDY_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).snack().build()));
    public static final Item COTTON_CANDY = new Item(new Item.Settings().group(CandyMod.CANDY_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).snack().build()));
    public static final Item CANDY_CANE = new Item(new Item.Settings().group(CandyMod.CANDY_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).snack().build()));
    public static final Item TAFFY = new Item(new Item.Settings().group(CandyMod.CANDY_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4F).snack().build()));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(CandyMod.MOD_ID, "chocolate_bar"), CHOCOLATE_BAR);
        Registry.register(Registry.ITEM, new Identifier(CandyMod.MOD_ID, "jelly_beans"), JELLY_BEANS);
        Registry.register(Registry.ITEM, new Identifier(CandyMod.MOD_ID, "lollipop"), LOLLIPOP);
        Registry.register(Registry.ITEM, new Identifier(CandyMod.MOD_ID, "cotton_candy"), COTTON_CANDY);
        Registry.register(Registry.ITEM, new Identifier(CandyMod.MOD_ID, "candy_cane"), CANDY_CANE);
        Registry.register(Registry.ITEM, new Identifier(CandyMod.MOD_ID, "taffy"), TAFFY);
    }
}
