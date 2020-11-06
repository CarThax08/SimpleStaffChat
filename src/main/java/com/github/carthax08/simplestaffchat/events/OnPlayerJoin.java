package com.github.carthax08.simplestaffchat.events;

import com.github.carthax08.simplestaffchat.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoin implements Listener {

    Main main;

    public OnPlayerJoin(Main plugin){
        main = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        main.permissionMap.put(event.getPlayer().getUniqueId(), event.getPlayer().addAttachment(main));
    }
}
