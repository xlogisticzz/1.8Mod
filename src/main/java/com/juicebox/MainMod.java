package com.juicebox;

import com.juicebox.lib.Strings;
import com.juicebox.proxies.CommonProxy;
import com.juicebox.utils.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Juicebox on 25/06/2015.
 * For 1.8 Mod at https://github.com/xlogisticzz/1.8Mod
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */


@Mod(name = Strings.NAME, modid = Strings.MODID, version = Strings.VERSION)
public class MainMod {

    @Mod.Instance(Strings.MODID)
    public static MainMod instance;

    @SidedProxy(clientSide = Strings.CLIENTPROXY, serverSide = Strings.COMMONPROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {


    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.initRenderers();
        proxy.initSounds();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Learning Modding loaded");

    }
}
