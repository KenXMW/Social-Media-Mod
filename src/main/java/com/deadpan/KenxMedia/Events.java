package com.deadpan.KenxMedia;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class Events {

    public void ClickEvent (ClickEvent event) {
        IChatComponent url = new ChatComponentText("https://www.google.com");
        url.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.google.com"));
    }


    public void getPlayer(EntityJoinWorldEvent event) {
        if (event.entity instanceof EntityPlayer) {
            EntityPlayer player = Minecraft.getMinecraft().thePlayer;
            player.addChatMessage(new ChatComponentText("Welcome"));
        }
    }
}
