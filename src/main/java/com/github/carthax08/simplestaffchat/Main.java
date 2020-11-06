package com.github.carthax08.simplestaffchat;

import com.github.carthax08.simplestaffchat.events.OnChat;
import com.github.carthax08.simplestaffchat.commands.ToggleCommand;
import org.bukkit.ChatColor;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public final class Main extends JavaPlugin {

    String version = "1.0";
    public HashMap<UUID, PermissionAttachment> permissionMap = new HashMap<UUID, PermissionAttachment>();

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[SimpleStaffChat] Plugin version " + version + " is present");
        //Events
        getServer().getPluginManager().registerEvents(new OnChat(), this);
        //Commands
        getCommand("staffchat").setExecutor(new ToggleCommand(this));
        //Executes When Finished
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[SimpleStaffChat] Plugin version " + version + " is now loaded.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
