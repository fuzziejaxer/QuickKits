package me.fuzzie.quickkits.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class qkhelp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {

        if (Sender instanceof Player) {
            Player player = (Player) Sender;

            player.sendMessage(ChatColor.AQUA + "To Get Help On This Plugin Please Go The Plugin Page: \n <comming soon>");

        }
        return true;
    }


}
