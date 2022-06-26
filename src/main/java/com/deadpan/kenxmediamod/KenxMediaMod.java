package com.deadpan.kenxmediamod;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = KenxMediaMod.MODID, version = KenxMediaMod.VERSION)
public class KenxMediaMod
{
    public static final String MODID = "kenxmediamod";
    public static final String VERSION = "1.0.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
