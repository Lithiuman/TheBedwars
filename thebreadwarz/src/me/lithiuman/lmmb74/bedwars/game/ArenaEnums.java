package me.lithiuman.lmmb74.bedwars.game;

public class ArenaEnums {

	public enum ArenaState {
		WAITING("Waiting"), STARTING("Starting"), IN_GAME("Playing"), ENDING("Finishing"), RESTARTING("Restarting");

		String formattedName;

		ArenaState(String formattedName) {
			this.formattedName = formattedName;
		}

		public String getFormattedName() {
			return formattedName;
		}
	}

	public enum ArenaMode {
		SOLO("Solo"), TEAMS("Teams");
		
		String formattedName;

		ArenaMode(String formattedName) {
			this.formattedName = formattedName;
		}

		public String getFormattedName() {
			return formattedName;
		}
	}
}