package com.juicebox.item;

import com.juicebox.lib.Strings;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Juicebox on 25/06/2015.
 * For 1.8 Mod at https://github.com/xlogisticzz/1.8Mod
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */

public class ItemTest extends ModItem {

    public ItemTest() {
        setUnlocalizedName(Strings.TEST);
        GameRegistry.registerItem(this, Strings.TEST);
    }
}
