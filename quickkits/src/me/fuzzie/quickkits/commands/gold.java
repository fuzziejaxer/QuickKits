package me.fuzzie.quickkits.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class gold implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {

        if (Sender instanceof Player) {
            Player player = (Player) Sender;

            ItemStack gold_sword = new ItemStack(Material.GOLDEN_SWORD);

            ItemStack gold_axe = new ItemStack(Material.GOLDEN_AXE);

            ItemStack gold_pickaxe = new ItemStack(Material.GOLDEN_PICKAXE);

            ItemStack gold_shovel = new ItemStack(Material.GOLDEN_SHOVEL);

            ItemStack gold_hoe = new ItemStack(Material.GOLDEN_HOE);

            ItemStack gold_helmet = new ItemStack(Material.GOLDEN_HELMET);

            ItemStack gold_chestplate = new ItemStack(Material.GOLDEN_CHESTPLATE);

            ItemStack gold_leggings = new ItemStack(Material.GOLDEN_LEGGINGS);

            ItemStack gold_boots = new ItemStack(Material.GOLDEN_BOOTS);

            player.getInventory().addItem(gold_sword, gold_axe, gold_pickaxe, gold_shovel, gold_hoe, gold_helmet, gold_chestplate, gold_leggings, gold_boots);

        }
        return true;
    }


}