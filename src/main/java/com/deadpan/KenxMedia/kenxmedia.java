package com.deadpan.KenxMedia;

import com.deadpan.KenxMedia.blocks.*;
import com.deadpan.KenxMedia.items.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "kenxmedia", name = "Kenx Media", version = "1.0")
public class kenxmedia {

    //Items
    public static Item itemLogo;
    public static Item itemYoutube;
    public static Item itemDiscord;
    public static Item itemGithub;
    public static Item itemInfo;
    public static Item itemTikTok;
    public static Item itemTwitter;
    public static Item itemWebsite;
    public static Item itemInstagram;

    //Blocks
    public static Block blockYoutube;
    public static Block blockDiscord;
    public static Block blockGithub;
    public static Block blockInfo;
    public static Block blockTikTok;
    public static Block blockTwitter;
    public static Block blockWebsite;
    public static Block blockInstagram;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //Item and Block init and registering and config handling

        //Items
        itemLogo = new ItemLogo().setUnlocalizedName("ItemLogo").setTextureName("kenxmedia:itemLogo");
        itemYoutube = new ItemYoutube().setUnlocalizedName("ItemYoutube").setTextureName("kenxmedia:itemYoutube").setCreativeTab(tabKenxMediaMod);
        itemDiscord = new ItemDiscord().setUnlocalizedName("ItemDiscord").setTextureName("kenxmedia:itemDiscord").setCreativeTab(tabKenxMediaMod);
        itemGithub = new ItemGithub().setUnlocalizedName("ItemGithub").setTextureName("kenxmedia:itemGithub").setCreativeTab(tabKenxMediaMod);
        itemInfo = new ItemInfo().setUnlocalizedName("ItemInfo").setTextureName("kenxmedia:itemInfo").setCreativeTab(tabKenxMediaMod);
        itemTikTok = new ItemTikTok().setUnlocalizedName("ItemTikTok").setTextureName("kenxmedia:itemTikTok").setCreativeTab(tabKenxMediaMod);
        itemTwitter = new ItemTwitter().setUnlocalizedName("ItemTwitter").setTextureName("kenxmedia:itemTwitter").setCreativeTab(tabKenxMediaMod);
        itemWebsite = new ItemWebsite().setUnlocalizedName("ItemWebsite").setTextureName("kenxmedia:itemWebsite").setCreativeTab(tabKenxMediaMod);
        itemInstagram = new ItemInstagram().setUnlocalizedName("ItemInstagram").setTextureName("kenxmedia:itemInstagram").setCreativeTab(tabKenxMediaMod);

        //Blocks
        blockDiscord = new BlockDiscord(Material.rock).setBlockName("BlockDiscord").setBlockTextureName("kenxmedia:blockDiscord").setCreativeTab(tabKenxMediaMod);
        blockYoutube = new BlockYoutube(Material.rock).setBlockName("BlockYoutube").setBlockTextureName ("kenxmedia:blockYoutube").setCreativeTab(tabKenxMediaMod);
        blockGithub = new BlockGithub(Material.rock).setBlockName("BlockGithub").setBlockTextureName ("kenxmedia:blockGithub").setCreativeTab(tabKenxMediaMod);
        blockInfo = new BlockInfo(Material.rock).setBlockName("BlockInfo").setBlockTextureName ("kenxmedia:blockInfo").setCreativeTab(tabKenxMediaMod);
        blockTikTok = new BlockTikTok(Material.rock).setBlockName("BlockTikTok").setBlockTextureName ("kenxmedia:blockTikTok").setCreativeTab(tabKenxMediaMod);
        blockTwitter = new BlockTwitter(Material.rock).setBlockName("BlockTwitter").setBlockTextureName ("kenxmedia:blockTwitter").setCreativeTab(tabKenxMediaMod);
        blockWebsite = new BlockWebsite(Material.rock).setBlockName("BlockWebsite").setBlockTextureName ("kenxmedia:blockWebsite").setCreativeTab(tabKenxMediaMod);
        blockInstagram = new BlockInstagram(Material.rock).setBlockName("BlockInstagram").setBlockTextureName ("kenxmedia:blockInstagram").setCreativeTab(tabKenxMediaMod);


        //Items Registering
        GameRegistry.registerItem(itemLogo, itemLogo.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemYoutube, itemYoutube.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemDiscord, itemDiscord.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemGithub, itemGithub.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemInfo, itemInfo.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemTikTok, itemTikTok.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemTwitter, itemTwitter.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemWebsite, itemWebsite.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemInstagram, itemInstagram.getUnlocalizedName().substring(5));

        //Block Registering
        GameRegistry.registerBlock(blockDiscord, blockDiscord.getUnlocalizedName().substring(5));
        System.out.println(blockDiscord.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockYoutube, blockYoutube.getUnlocalizedName().substring(5));
        System.out.println(blockYoutube.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockTikTok, blockTikTok.getUnlocalizedName().substring(5));
        System.out.println(blockTikTok.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockTwitter, blockTwitter.getUnlocalizedName().substring(5));
        System.out.println(blockTwitter.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockWebsite, blockWebsite.getUnlocalizedName().substring(5));
        System.out.println(blockWebsite.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockInstagram, blockInstagram.getUnlocalizedName().substring(5));
        System.out.println(blockInstagram.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockGithub, blockGithub.getUnlocalizedName().substring(5));
        System.out.println(blockGithub.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockInfo, blockInfo.getUnlocalizedName().substring(5));
        System.out.println(blockInfo.getUnlocalizedName().substring(5));


    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // Proxy, TileEntity, entity, GUI and Packet Registering

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new Events());
    }

    public static CreativeTabs tabKenxMediaMod = new CreativeTabs("tabKenxMediaMod"){
        @Override
        public Item getTabIconItem(){
            return new ItemStack(itemLogo).getItem();
        }
    };
}
