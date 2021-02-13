package me.lithiuman.lmmb74.bedwars;

import me.lithiuman.lmmb74.bedwars.commands.BedWarsCommand;
import org.bukkit.plugin.java.JavaPlugin;


//SEND HELP OH GOD THE EARRAPE
public class BedWars extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("hi.");
        this.getCommand("bw").setExecutor(new BedWarsCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("bye.");

    }
}
