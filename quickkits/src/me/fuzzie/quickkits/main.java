package me.fuzzie.quickkits;

import me.fuzzie.quickkits.commands.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
    @Override
    public void onEnable() {
        Bukkit.getLogger().info(ChatColor.GREEN + "Enabled " + this.getName());
        this.getCommand("netherite").setExecutor(new netherite());
        this.getCommand("diamond").setExecutor(new diamond());
        this.getCommand("gold").setExecutor(new gold());
        this.getCommand("iron").setExecutor(new iron());
        this.getCommand("stone").setExecutor(new stone());
        this.getCommand("wood").setExecutor(new wood());
        this.getCommand("qkhelp").setExecutor(new qkhelp());
    }
    @Override
    public void onDisable() {
        Bukkit.getLogger().info(ChatColor.RED + "Disabled " + this.getName());
    }

}
