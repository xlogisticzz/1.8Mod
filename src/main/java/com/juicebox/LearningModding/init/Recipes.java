package com.juicebox.LearningModding.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by JuiceBox on 02/07/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */
public class Recipes {

    public static void initVanilla() {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.deathstone, 1, 0), new ItemStack(ModItems.deathstone, 1, 4));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ruby, 9, 0), new ItemStack(ModBlocks.rubyBlock, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.titaniumIngot, 9, 0), new ItemStack(ModBlocks.titaniumBlock, 1, 0));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyAxe, 1, 0), "rr ", "rs ", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyAxe, 1, 0), " rr", " sr", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubySword, 1, 0), " r ", " r ", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubySpade, 1, 0), " r ", " s ", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyPick, 1, 0), "rrr", " s ", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyHoe, 1, 0), " rr", " s ", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.rubyHoe, 1, 0), "rr ", " s ", " s ", 'r', new ItemStack(ModItems.ruby), 's', new ItemStack(Items.stick));

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.titaniumAxe, 1, 0), "tt ", "ts ", " s ", 't', new ItemStack(ModItems.titaniumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.titaniumAxe, 1, 0), " tt", " st", " s ", 't', new ItemStack(ModItems.titaniumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.titaniumSword, 1, 0), " t ", " t ", " s ", 't', new ItemStack(ModItems.titaniumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.titaniumSpade, 1, 0), " t ", " s ", " s ", 't', new ItemStack(ModItems.titaniumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.titaniumPick, 1, 0), "ttt", " s ", " s ", 't', new ItemStack(ModItems.titaniumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.titaniumHoe, 1, 0), " tt", " s ", " s ", 't', new ItemStack(ModItems.titaniumIngot), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.titaniumHoe, 1, 0), "tt ", " s ", " s ", 't', new ItemStack(ModItems.titaniumIngot), 's', new ItemStack(Items.stick));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rubyBlock, 1, 0), "rrr", "rrr", "rrr", 'r', new ItemStack(ModItems.ruby));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.titaniumBlock, 1, 0), "ttt", "ttt", "ttt", 't', new ItemStack(ModItems.titaniumIngot));


        FurnaceRecipes.instance().addSmeltingRecipeForBlock(ModBlocks.titaniumOre, new ItemStack(ModItems.titaniumIngot, 1, 0), 5F);

        for (int i = 0; i < 4; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.deathstone, 1, i + 1), new ItemStack(ModItems.deathstone, 1, i));
        }
    }
}
