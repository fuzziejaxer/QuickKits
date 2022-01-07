package me.fuzzie.quickkits.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class stone implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {

        if (Sender instanceof Player) {
            Player player = (Player) Sender;

            ItemStack stone_sword = new ItemStack(Material.STONE_SWORD);

            ItemStack stone_axe = new ItemStack(Material.STONE_AXE);

            ItemStack stone_pickaxe = new ItemStack(Material.STONE_PICKAXE);

            ItemStack stone_shovel = new ItemStack(Material.STONE_SHOVEL);

            ItemStack stone_hoe = new ItemStack(Material.STONE_HOE);

            ItemStack stone_helmet = new ItemStack(Material.CHAINMAIL_HELMET);

            ItemStack stone_chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);

            ItemStack stone_leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);

            ItemStack stone_boots = new ItemStack(Material.CHAINMAIL_BOOTS);

            player.getInventory().addItem(stone_sword, stone_axe, stone_pickaxe, stone_shovel, stone_hoe, stone_helmet, stone_chestplate, stone_leggings, stone_boots);

        }
        return true;
    }


}

