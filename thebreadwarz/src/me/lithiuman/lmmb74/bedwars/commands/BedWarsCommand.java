package me.lithiuman.lmmb74.bedwars.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BedWarsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("bw") && args.length == 1) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("BedWars by Lmmb74 and Lithiuman" + "v0.1");
                return true;
            }
            sender.sendMessage("hi");
            return true;
        }
        return false;
    }
}

