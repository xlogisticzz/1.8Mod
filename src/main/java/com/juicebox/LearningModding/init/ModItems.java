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

    public static ModItem ruby;
    public static ModItem titaniumIngot;
    public static ModItem deathstone;
    public static ItemModSword rubySword;
    public static ItemModPick rubyPick;
    public static ItemModSpade rubySpade;
    public static ItemModAxe rubyAxe;
    public static ItemModHoe rubyHoe;
    public static ItemModSword titaniumSword;
    public static ItemModPick titaniumPick;
    public static ItemModSpade titaniumSpade;
    public static ItemModAxe titaniumAxe;
    public static ItemModHoe titaniumHoe;

    public static Item.ToolMaterial materialRuby = EnumHelper.addToolMaterial("ruby", 3, Values.RUBY_DURABILITY, 4.1F, 3.0F, 40);
    public static Item.ToolMaterial materialTitanium = EnumHelper.addToolMaterial("titanium", 4, Values.TITANIUM_DURABILITY, 4.6F, 3.6F, 30);

    public static void createItems() {
        ruby = new ItemBasicItem(Strings.RUBY);
        titaniumIngot = new ItemBasicItem(Strings.TITANIUMINGOT);
        deathstone = new ItemDeathstone();
        rubySword = new ItemModSword(materialRuby, Strings.RUBYSWORD);
        rubyPick = new ItemModPick(materialRuby, Strings.RUBYPICKAXE);
        rubySpade = new ItemModSpade(materialRuby, Strings.RUBYSPADE);
        rubyAxe = new ItemModAxe(materialRuby, Strings.RUBYAXE);
        rubyHoe = new ItemModHoe(materialRuby, Strings.RUBYHOE);
        titaniumSword = new ItemModSword(materialTitanium, Strings.TITANIUMSWORD);
        titaniumPick = new ItemModPick(materialTitanium, Strings.TITANIUMPICKAXE);
        titaniumSpade = new ItemModSpade(materialTitanium, Strings.TITANIUMSPADE);
        titaniumAxe = new ItemModAxe(materialTitanium, Strings.TITANIUMAXE);
        titaniumHoe = new ItemModHoe(materialTitanium, Strings.TITANIUMHOE);


        GameRegistry.registerItem(ruby, Strings.RUBY);
        GameRegistry.registerItem(titaniumIngot, Strings.TITANIUMINGOT);
        GameRegistry.registerItem(deathstone, Strings.DEATHSTONE);
        GameRegistry.registerItem(rubySword, Strings.RUBYSWORD);
        GameRegistry.registerItem(rubyPick, Strings.RUBYPICKAXE);
        GameRegistry.registerItem(rubySpade, Strings.RUBYSPADE);
        GameRegistry.registerItem(rubyAxe, Strings.RUBYAXE);
        GameRegistry.registerItem(rubyHoe, Strings.RUBYHOE);
        GameRegistry.registerItem(titaniumSword, Strings.TITANIUMSWORD);
        GameRegistry.registerItem(titaniumPick, Strings.TITANIUMPICKAXE);
        GameRegistry.registerItem(titaniumSpade, Strings.TITANIUMSPADE);
        GameRegistry.registerItem(titaniumAxe, Strings.TITANIUMAXE);
        GameRegistry.registerItem(titaniumHoe, Strings.TITANIUMHOE);
    }
}
