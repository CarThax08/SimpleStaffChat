package com.github.carthax08.simplestaffchat.events;

import com.github.carthax08.simplestaffchat.Main;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnPlayerLeave implements Listener {

    Main main;

    public OnPlayerLeave(Main plugin){
        main = plugin;
    }



    public void onPlayerLeave(PlayerQuitEvent event){
        main.permissionMap.remove(event.getPlayer().getUniqueId());
    }
}
