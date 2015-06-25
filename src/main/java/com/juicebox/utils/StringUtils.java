package com.juicebox.utils;

import net.minecraft.util.StatCollector;

/**
 * Created by Juicebox on 25/06/2015.
 * For 1.8 Mod at https://github.com/xlogisticzz/1.8Mod
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
