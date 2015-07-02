package com.juicebox.LearningModding.init;

import com.juicebox.LearningModding.item.*;
import com.juicebox.LearningModding.lib.Strings;
import com.juicebox.LearningModding.lib.Values;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Juicebox on 25/06/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */

public class ModItems {

    public static ModItem test;
    public static ModItem ruby;
    public static ModItem titaniumIngot;
    public static ModItem deathstone;
    public static ItemModAxe rubyAxe;
    public static ItemModSword rubySword;
    public static ItemModSpade rubySpade;

    public static Item.ToolMaterial materialRuby = EnumHelper.addToolMaterial("ruby", 3, Values.RUBY_DURABILITY, 4.1F, 3.0F, 40);

    public static void createItems() {
        test = new ItemBasicItem(Strings.TEST);
        ruby = new ItemBasicItem(Strings.RUBY);
        titaniumIngot = new ItemBasicItem(Strings.TITANIUMINGOT);
        deathstone = new ItemDeathstone();
        rubyAxe = new ItemModAxe(materialRuby, Strings.RUBYAXE);
        rubySword = new ItemModSword(materialRuby, Strings.RUBYSWORD);
        rubySpade = new ItemModSpade(materialRuby, Strings.RUBYSPADE);


        GameRegistry.registerItem(test, Strings.TEST);
        GameRegistry.registerItem(ruby, Strings.RUBY);
        GameRegistry.registerItem(titaniumIngot, Strings.TITANIUMINGOT);
        GameRegistry.registerItem(deathstone, Strings.DEATHSTONE);
        GameRegistry.registerItem(rubyAxe, Strings.RUBYAXE);
        GameRegistry.registerItem(rubySword, Strings.RUBYSWORD);
        GameRegistry.registerItem(rubySpade, Strings.RUBYSPADE);
    }
}
