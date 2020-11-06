package com.github.carthax08.simplestaffchat.commands;

import com.github.carthax08.simplestaffchat.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;

public class ToggleCommand implements CommandExecutor {
    Main main;
    public ToggleCommand(Main plugin){
        main = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("staffchat.on") && player.hasPermission("staffchat.toggle")){
                main.permissionMap.get(player.getUniqueId()).setPermission("staffchat.on", false);
                main.permissionMap.get(player.getUniqueId()).setPermission("staffchat.off", true);
                return true;

            }else if (player.hasPermission("staffchat.toggle")){
                main.permissionMap.get(player.getUniqueId()).setPermission("staffchat.on", true);
                main.permissionMap.get(player.getUniqueId()).setPermission("staffchat.off", false);
                return true;
            }else{
                return false;
            }

        }else{
            System.out.println("You must be a player to run this command.");
            return false;
        }
    }
}
