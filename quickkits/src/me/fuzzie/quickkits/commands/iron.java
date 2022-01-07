package me.fuzzie.quickkits.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class iron implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {

        if (Sender instanceof Player) {
            Player player = (Player) Sender;

            ItemStack iron_sword = new ItemStack(Material.IRON_SWORD);

            ItemStack iron_axe = new ItemStack(Material.IRON_AXE);

            ItemStack iron_pickaxe = new ItemStack(Material.IRON_PICKAXE);

            ItemStack iron_shovel = new ItemStack(Material.IRON_SHOVEL);

            ItemStack iron_hoe = new ItemStack(Material.IRON_HOE);

            ItemStack iron_helmet = new ItemStack(Material.IRON_HELMET);

            ItemStack iron_chestplate = new ItemStack(Material.IRON_CHESTPLATE);

            ItemStack iron_leggings = new ItemStack(Material.IRON_LEGGINGS);

            ItemStack iron_boots = new ItemStack(Material.IRON_BOOTS);

            player.getInventory().addItem(iron_sword, iron_axe, iron_pickaxe, iron_shovel, iron_hoe, iron_helmet, iron_chestplate, iron_leggings, iron_boots);

        }
        return true;
    }


}

