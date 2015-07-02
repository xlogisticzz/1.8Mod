package com.juicebox.LearningModding.init;

import com.juicebox.LearningModding.item.ItemBasicItem;
import com.juicebox.LearningModding.item.ModItem;
import com.juicebox.LearningModding.lib.Strings;
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

    public static void createItems() {
        test = new ItemBasicItem(Strings.TEST);
        ruby = new ItemBasicItem(Strings.RUBY);
        titaniumIngot = new ItemBasicItem(Strings.TITANIUMINGOT);
        GameRegistry.registerItem(test, Strings.TEST);
        GameRegistry.registerItem(ruby, Strings.RUBY);
        GameRegistry.registerItem(titaniumIngot, Strings.TITANIUMINGOT);
    }
}
