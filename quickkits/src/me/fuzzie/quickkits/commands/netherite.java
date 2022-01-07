package me.fuzzie.quickkits.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class netherite implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {

        if (Sender instanceof Player) {
            Player player = (Player) Sender;

            ItemStack netherite_sword = new ItemStack(Material.NETHERITE_SWORD);

            ItemStack netherite_axe = new ItemStack(Material.NETHERITE_AXE);

            ItemStack netherite_pickaxe = new ItemStack(Material.NETHERITE_PICKAXE);

            ItemStack netherite_shovel = new ItemStack(Material.NETHERITE_SHOVEL);

            ItemStack netherite_hoe = new ItemStack(Material.NETHERITE_HOE);

            ItemStack netherite_helmet = new ItemStack(Material.NETHERITE_HELMET);

            ItemStack netherite_chestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);

            ItemStack netherite_leggings = new ItemStack(Material.NETHERITE_LEGGINGS);

            ItemStack netherite_boots = new ItemStack(Material.NETHERITE_BOOTS);

            player.getInventory().addItem(netherite_sword, netherite_axe, netherite_pickaxe, netherite_shovel, netherite_hoe, netherite_helmet, netherite_chestplate, netherite_leggings, netherite_boots);

        }
        return true;
    }


}
