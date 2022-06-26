package com.deadpan.kenxmediamod;

import com.deadpan.kenxmediamod.items.ItemDiscord;
import com.deadpan.kenxmediamod.items.ItemLogo;
import com.deadpan.kenxmediamod.items.ItemYoutube;
import com.deadpan.kenxmediamod.items.ItemGithub;
import com.deadpan.kenxmediamod.items.ItemInfo;
import com.deadpan.kenxmediamod.items.ItemTikTok;
import com.deadpan.kenxmediamod.items.ItemTwitter;
import com.deadpan.kenxmediamod.items.ItemWebsite;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = "kenxmediamod",name = "Kenx Social Media Mod", version = "1.0.0")
public class KenxMediaMod {

    public static Item itemLogo;
    public static Item itemYoutube;
    public static Item itemDiscord;
    public static Item itemGithub;
    public static Item itemInfo;
    public static Item itemTikTok;
    public static Item itemTwitter;
    public static Item itemWebsite;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //Item/Block init and registering
        //Config handling
        itemLogo = new ItemLogo().setUnlocalizedName("ItemLogo").setTextureName("kenxmediamod:itemLogo");
        GameRegistry.registerItem(itemLogo, itemLogo.getUnlocalizedName().substring(5));

        itemYoutube = new ItemYoutube().setUnlocalizedName("ItemYoutube").setTextureName("kenxmediamod:itemYoutube").setCreativeTab(tabKenxMediaMod);
        GameRegistry.registerItem(itemYoutube, itemYoutube.getUnlocalizedName().substring(5));

        itemDiscord = new ItemDiscord().setUnlocalizedName("ItemDiscord").setTextureName("kenxmediamod:itemDiscord").setCreativeTab(tabKenxMediaMod);
        GameRegistry.registerItem(itemDiscord, itemDiscord.getUnlocalizedName().substring(5));

        itemGithub = new ItemGithub().setUnlocalizedName("ItemGithub").setTextureName("kenxmediamod:itemGithub").setCreativeTab(tabKenxMediaMod);
        GameRegistry.registerItem(itemGithub, itemGithub.getUnlocalizedName().substring(5));

        itemInfo = new ItemInfo().setUnlocalizedName("ItemInfo").setTextureName("kenxmediamod:itemInfo").setCreativeTab(tabKenxMediaMod);
        GameRegistry.registerItem(itemInfo, itemInfo.getUnlocalizedName().substring(5));

        itemTikTok = new ItemTikTok().setUnlocalizedName("ItemTikTok").setTextureName("kenxmediamod:itemTikTok").setCreativeTab(tabKenxMediaMod);
        GameRegistry.registerItem(itemTikTok, itemTikTok.getUnlocalizedName().substring(5));

        itemTwitter = new ItemTwitter().setUnlocalizedName("ItemTwitter").setTextureName("kenxmediamod:itemTwitter").setCreativeTab(tabKenxMediaMod);
        GameRegistry.registerItem(itemTwitter, itemTwitter.getUnlocalizedName().substring(5));

        itemWebsite = new ItemWebsite().setUnlocalizedName("ItemWebsite").setTextureName("kenxmediamod:itemWebsite").setCreativeTab(tabKenxMediaMod);
        GameRegistry.registerItem(itemWebsite, itemWebsite.getUnlocalizedName().substring(5));
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        //Proxy, TileEntity, entity, GUI and Packet Registering
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    public static CreativeTabs tabKenxMediaMod = new CreativeTabs("tabKenxMediaMod"){
        @Override
        public Item getTabIconItem(){
            return new ItemStack(itemLogo).getItem();
        }
    };
}
