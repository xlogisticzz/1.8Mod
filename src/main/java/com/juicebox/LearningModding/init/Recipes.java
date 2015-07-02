package com.juicebox.LearningModding.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by JuiceBox on 02/07/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */
public class Recipes {

    public static void initVanilla() {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.deathstone, 1, 0), new ItemStack(ModItems.deathstone, 1, 4));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyAxe, 1, 0), "rr ", "rs ", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyAxe, 1, 0), " rr", " sr", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubySword, 1, 0), " r ", " r ", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubySpade, 1, 0), " r ", " s ", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyPick, 1, 0), "rrr", " s ", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyPick, 1, 0), " rr", " s ", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyPick, 1, 0), "rr ", " s ", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));


        for (int i = 0; i < 4; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.deathstone, 1, i + 1), new ItemStack(ModItems.deathstone, 1, i));
        }
    }
}
