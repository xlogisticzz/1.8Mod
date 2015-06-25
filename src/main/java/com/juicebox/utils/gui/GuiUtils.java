package com.juicebox.utils.gui;

import net.minecraft.client.gui.FontRenderer;

/**
 * Created by Juicebox on 25/06/2015.
 * For 1.8 Mod at https://github.com/xlogisticzz/1.8Mod
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */

public class GuiUtils {
    public static void drawCenteredString(FontRenderer fontRenderer, String string, int x, int y, int colour) {
        fontRenderer.drawString(string, x - fontRenderer.getStringWidth(string) / 2, y, colour);
    }
}
