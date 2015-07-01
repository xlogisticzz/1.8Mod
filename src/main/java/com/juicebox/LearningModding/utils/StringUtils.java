package com.juicebox.LearningModding.utils;

import net.minecraft.util.StatCollector;

/**
 * Created by Juicebox on 25/06/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */

public class StringUtils {

    public static String localize(String string) {
        return StatCollector.translateToLocal(string);
    }

    public static boolean canLocalize(String string) {
        return StatCollector.canTranslate(string);
    }
}
