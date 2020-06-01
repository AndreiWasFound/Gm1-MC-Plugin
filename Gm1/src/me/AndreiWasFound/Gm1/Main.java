package me.AndreiWasFound.Gm1;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {

	}

	@Override
	public void onDisable() {

	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("gm")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Console can't use this command");
				return true;
			}
			Player player = (Player) sender;
			if (args.length == 0) {
				// /gm
				player.sendMessage(ChatColor.RED + "Usage: gm [0,1,2,3] [s,c,a,sp]");
				return true;
		}
		if (args.length >= 1) {
			if (args[0].equalsIgnoreCase("0")) {
				player.setGameMode(GameMode.SURVIVAL);
				player.sendMessage(ChatColor.WHITE + "Your gamemode has been changed to survival");
				return true;
		}
		if (args.length >= 1) {
			if (args[0].equalsIgnoreCase("1")) {
				player.setGameMode(GameMode.CREATIVE);
				player.sendMessage(ChatColor.WHITE + "Your gamemode has been changed to creative");
				return true;
				}
			if (args.length >= 1) {
				if (args[0].equalsIgnoreCase("2")) {
					player.setGameMode(GameMode.ADVENTURE);
					player.sendMessage(ChatColor.WHITE + "Your gamemode has been changed to adventure");
					return true;
					}
				if (args.length >= 1) {
					if (args[0].equalsIgnoreCase("3")) {
						player.setGameMode(GameMode.SPECTATOR);
						player.sendMessage(ChatColor.WHITE + "Your gamemode has been changed to spectator");
						return true;
						}
					if (args.length >= 1) {
						if (args[0].equalsIgnoreCase("s")) {
							player.setGameMode(GameMode.SURVIVAL);
							player.sendMessage(ChatColor.WHITE + "Your gamemode has been changed to survival");
							return true;
					}
					if (args.length >= 1) {
						if (args[0].equalsIgnoreCase("c")) {
							player.setGameMode(GameMode.CREATIVE);
							player.sendMessage(ChatColor.WHITE + "Your gamemode has been changed to creative");
							return true;
							}
						if (args.length >= 1) {
							if (args[0].equalsIgnoreCase("a")) {
								player.setGameMode(GameMode.ADVENTURE);
								player.sendMessage(ChatColor.WHITE + "Your gamemode has been changed to adventure");
								return true;
								}
							if (args.length >= 1) {
								if (args[0].equalsIgnoreCase("sp")) {
									player.setGameMode(GameMode.SPECTATOR);
									player.sendMessage(ChatColor.WHITE + "Your gamemode has been changed to spectator");
									return true;
									}
}}}}}	
}}}}

		return false;}}
