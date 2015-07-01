package com.juicebox.LearningModding.init;

import com.juicebox.LearningModding.item.ItemTest;
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

    public static void createItems() {
        test = new ItemTest();
        GameRegistry.registerItem(test, Strings.TEST);

    }
}
