package me.fuzzie.quickkits.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class wood implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {

        if (Sender instanceof Player) {
            Player player = (Player) Sender;

            ItemStack wood_sword = new ItemStack(Material.WOODEN_SWORD);

            ItemStack wood_axe = new ItemStack(Material.WOODEN_AXE);

            ItemStack wood_pickaxe = new ItemStack(Material.WOODEN_PICKAXE);

            ItemStack wood_shovel = new ItemStack(Material.WOODEN_SHOVEL);

            ItemStack wood_hoe = new ItemStack(Material.WOODEN_HOE);

            ItemStack wood_helmet = new ItemStack(Material.LEATHER_HELMET);

            ItemStack wood_chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);

            ItemStack wood_leggings = new ItemStack(Material.LEATHER_LEGGINGS);

            ItemStack wood_boots = new ItemStack(Material.LEATHER_BOOTS);

            player.getInventory().addItem(wood_sword, wood_axe, wood_pickaxe, wood_shovel, wood_hoe, wood_helmet, wood_chestplate, wood_leggings, wood_boots);

        }
        return true;
    }


}
