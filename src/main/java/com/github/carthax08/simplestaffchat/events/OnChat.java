package com.github.carthax08.simplestaffchat.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class OnChat implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event){
        if(event.getPlayer().hasPermission("staffchat.on")){
            Bukkit.broadcast(ChatColor.AQUA + "[Staff] " + event.getMessage(), "staffchat.on");

            event.setCancelled(true);
        }
    }

}
