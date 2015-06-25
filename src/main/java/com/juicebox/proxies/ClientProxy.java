package com.juicebox.proxies;

import com.juicebox.item.ModItems;
import com.juicebox.utils.LogHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;

/**
 * Created by Juicebox on 25/06/2015.
 * For 1.8 Mod at https://github.com/xlogisticzz/1.8Mod
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */

public class ClientProxy extends CommonProxy {

    @Override
    public void initSounds() {

    }

    @Override
    public void initRenderers() {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        LogHelper.info(ModItems.test.getUnwrappedUnlocalizedName(ModItems.test.getUnlocalizedName()));
        LogHelper.info(ModItems.test.getUnlocalizedName());
        renderItem.getItemModelMesher().register(ModItems.test, 0, new ModelResourceLocation(ModItems.test.getUnwrappedUnlocalizedName(ModItems.test.getUnlocalizedName()), "inventory"));

    }
}
