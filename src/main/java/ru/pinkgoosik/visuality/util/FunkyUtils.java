package ru.pinkgoosik.visuality.util;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.ArrayList;
import java.util.List;

public class FunkyUtils {
    public static final ArrayList<Item> SHINY_ARMOR = new ArrayList<>(List.of(Items.DIAMOND_HELMET, Items.DIAMOND_CHESTPLATE,
            Items.DIAMOND_LEGGINGS, Items.DIAMOND_BOOTS, Items.GOLDEN_HELMET, Items.GOLDEN_CHESTPLATE, Items.GOLDEN_LEGGINGS,
            Items.GOLDEN_BOOTS));

    public static int getShinyArmor(LivingEntity entity){
        int shinyArmor = 0;
        for(ItemStack stack : entity.getArmorSlots()){
            if(FunkyUtils.SHINY_ARMOR.contains(stack.getItem())){
                shinyArmor++;
            }
        }
        return shinyArmor;
    }
}
