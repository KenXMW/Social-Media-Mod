package com.deadpan.kenxmediamod;

import com.deadpan.kenxmediamod.blocks.*;
import com.deadpan.kenxmediamod.items.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;

import static net.minecraft.item.EnumAction.block;

@Mod(modid = "kenxmediamod",name = "Kenx Social Media Mod", version = "1.0.0")
public class KenxMediaMod {

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

        //Items
        itemLogo = new ItemLogo().setUnlocalizedName("ItemLogo").setTextureName("kenxmediamod:itemLogo");
        itemYoutube = new ItemYoutube().setUnlocalizedName("ItemYoutube").setTextureName("kenxmediamod:itemYoutube").setCreativeTab(tabKenxMediaMod);
        itemDiscord = new ItemDiscord().setUnlocalizedName("ItemDiscord").setTextureName("kenxmediamod:itemDiscord").setCreativeTab(tabKenxMediaMod);
        itemGithub = new ItemGithub().setUnlocalizedName("ItemGithub").setTextureName("kenxmediamod:itemGithub").setCreativeTab(tabKenxMediaMod);
        itemInfo = new ItemInfo().setUnlocalizedName("ItemInfo").setTextureName("kenxmediamod:itemInfo").setCreativeTab(tabKenxMediaMod);
        itemTikTok = new ItemTikTok().setUnlocalizedName("ItemTikTok").setTextureName("kenxmediamod:itemTikTok").setCreativeTab(tabKenxMediaMod);
        itemTwitter = new ItemTwitter().setUnlocalizedName("ItemTwitter").setTextureName("kenxmediamod:itemTwitter").setCreativeTab(tabKenxMediaMod);
        itemWebsite = new ItemWebsite().setUnlocalizedName("ItemWebsite").setTextureName("kenxmediamod:itemWebsite").setCreativeTab(tabKenxMediaMod);
        itemInstagram = new ItemInstagram().setUnlocalizedName("ItemInstagram").setTextureName("kenxmediamod:itemInstagram").setCreativeTab(tabKenxMediaMod);

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


        //Blocks
        blockYoutube = new BlockYoutube(Material.rock).setBlockName("BlockYoutube").setBlockTextureName("kenxmediamod:blockYoutube").setCreativeTab(tabKenxMediaMod);
        blockDiscord = new BlockDiscord(Material.rock).setBlockName("BlockDiscord").setBlockTextureName("kenxmediamod:blockDiscord").setCreativeTab(tabKenxMediaMod);
        blockTwitter = new BlockTwitter(Material.rock).setBlockName("BlockTwitter").setBlockTextureName("kenxmediamod:blockTwitter").setCreativeTab(tabKenxMediaMod);
        blockGithub = new BlockGithub(Material.rock).setBlockName("BlockGithub").setBlockTextureName("kenxmediamod:blockGithub").setCreativeTab(tabKenxMediaMod);
        blockInfo = new BlockInfo(Material.rock).setBlockName("BlockInfo").setBlockTextureName("kenxmediamod:blockInfo").setCreativeTab(tabKenxMediaMod);
        blockTikTok = new BlockTikTok(Material.rock).setBlockName("BlockTikTok").setBlockTextureName("kenxmediamod:blockTikTok").setCreativeTab(tabKenxMediaMod);
        blockWebsite = new BlockWebsite(Material.rock).setBlockName("BlockWebsite").setBlockTextureName("kenxmediamod:blockWebsite").setCreativeTab(tabKenxMediaMod);
        blockInstagram = new BlockInstagram(Material.rock).setBlockName("BlockInstagram").setBlockTextureName("kenxmediamod:blockInstagram").setCreativeTab(tabKenxMediaMod);

        //Blocks Registering
        GameRegistry.registerBlock(blockYoutube, blockYoutube.getUnlocalizedName().substring(5));
        System.out.println(blockYoutube.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockDiscord, blockDiscord.getUnlocalizedName().substring(5));
        System.out.println(blockDiscord.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockTwitter, blockTwitter.getUnlocalizedName().substring(5));
        System.out.println(blockTwitter.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockGithub, blockGithub.getUnlocalizedName().substring(5));
        System.out.println(blockGithub.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockInfo, blockInfo.getUnlocalizedName().substring(5));
        System.out.println(blockInfo.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockTikTok, blockTikTok.getUnlocalizedName().substring(5));
        System.out.println(blockTikTok.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockWebsite, blockWebsite.getUnlocalizedName().substring(5));
        System.out.println(blockWebsite.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockInstagram, blockInstagram.getUnlocalizedName().substring(5));
        System.out.println(blockInstagram.getUnlocalizedName().substring(5));
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
