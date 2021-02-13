package me.lithiuman.lmmb74.bedwars.game.handlers;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.scheduler.BukkitRunnable;

public class GeneratorHandler extends BukkitRunnable {

	public class Generator {
		private Random rand = new Random();
		private int level;
		private Material material;
		private Location loc;

		public Generator(int level, Material material, Location loc) throws Exception {
			if (material != Material.IRON_INGOT && material != Material.GOLD_INGOT && material != Material.DIAMOND
					&& material != Material.EMERALD) {
				throw new Exception("Material must be iron, gold, diamond or emerald.");
			} else {
				this.setLevel(level);
				this.material = material;
				this.loc = loc;
			}
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public Material getMaterial() {
			return material;
		}

		public Location getLoc() {
			return loc;
		}

		public Random getRand() {
			return rand;
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
