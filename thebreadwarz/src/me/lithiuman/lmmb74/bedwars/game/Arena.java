package me.lithiuman.lmmb74.bedwars.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.lithiuman.lmmb74.bedwars.game.ArenaEnums.ArenaMode;
import me.lithiuman.lmmb74.bedwars.game.ArenaEnums.ArenaState;

public class Arena extends BukkitRunnable {

	private final String name;
	private final Location lobbyLocation;
	private final HashMap<Integer, Player> players;
	private final List<Location> bedLocations;
	private final ArrayList<Block> placedBlocks = new ArrayList<>();
	private final HashMap<Material, Location> generators;
	private ArenaState arenaState = ArenaState.WAITING;
	private ArenaMode arenaMode = ArenaMode.SOLO;

	public Arena(String name, Location lobbyLocation, List<Location> bedLocations,
			HashMap<Integer, Player> players, HashMap<Material, Location> generators, ArenaMode arenaMode) {
		this.name = name;
		this.lobbyLocation = lobbyLocation;
		this.bedLocations = bedLocations;
		this.players = players;
		this.generators = generators;
		this.arenaMode = arenaMode;
	}

	@Override
	public void run() {
		switch (getArenaState()) {
		case WAITING:
			break;
		case STARTING:
			break;
		case IN_GAME:
			break;
		case ENDING:
			break;
		case RESTARTING:
			break;
		default:
			break;

		}
	}

	public ArenaState getArenaState() {
		return arenaState;
	}

	public ArenaMode getArenaMode() {
		return arenaMode;
	}

	public String getName() {
		return name;
	}

	public Location getLobbyLocation() {
		return lobbyLocation;
	}

	public HashMap<Integer, Player> getPlayers() {
		return players;
	}

	public List<Location> getBedLocations() {
		return bedLocations;
	}

	public ArrayList<Block> getPlacedBlocks() {
		return placedBlocks;
	}

	public HashMap<Material, Location> getGenerators() {
		return generators;
	}

}
