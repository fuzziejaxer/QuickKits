package me.fuzzie.quickkits.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class diamond implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {

        if (Sender instanceof Player) {
            Player player = (Player) Sender;

            ItemStack diamond_sword = new ItemStack(Material.DIAMOND_SWORD);

            ItemStack diamond_axe = new ItemStack(Material.DIAMOND_AXE);

            ItemStack diamond_pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);

            ItemStack diamond_shovel = new ItemStack(Material.DIAMOND_SHOVEL);

            ItemStack diamond_hoe = new ItemStack(Material.DIAMOND_HOE);

            ItemStack diamond_helmet = new ItemStack(Material.DIAMOND_HELMET);

            ItemStack diamond_chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);

            ItemStack diamond_leggings = new ItemStack(Material.DIAMOND_LEGGINGS);

            ItemStack diamond_boots = new ItemStack(Material.DIAMOND_BOOTS);

            player.getInventory().addItem(diamond_sword, diamond_axe, diamond_pickaxe, diamond_shovel, diamond_hoe, diamond_helmet, diamond_chestplate, diamond_leggings, diamond_boots);

        }
        return true;
    }


}
