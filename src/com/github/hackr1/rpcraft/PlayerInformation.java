package com.github.hackr1.rpcraft;

import java.io.*;
import java.util.Properties;
import org.bukkit.entity.Player;

public class PlayerInformation {
	private static Properties playerClasses = new Properties();
	private static Properties playerMana = new Properties();
	
	public static void load(File dataFolder) throws IOException
	{
		FileInputStream playerClassesInput = new FileInputStream(dataFolder + "/data_pc");
		playerClasses.load(playerClassesInput);
		playerClassesInput.close();
		
		FileInputStream playerManaInput = new FileInputStream(dataFolder + "/data_pm");
		playerMana.load(playerClassesInput);
		playerManaInput.close();
		
	}
	
	public static void save(File dataFolder) throws IOException
	{
		FileOutputStream playerClassesInput = new FileOutputStream(dataFolder + "/data_pc");
		playerClasses.store(playerClassesInput, "player data - do not modify!");
		playerClassesInput.close();
		
		FileOutputStream playerManaInput = new FileOutputStream(dataFolder + "/data_pm");
		playerMana.store(playerClassesInput, "player data - do not modify!");
		playerManaInput.close();
	}
	
	public static String getPlayerClass(Player player)
	{
		return (String) playerClasses.get(player.getName());
	}
	
	public static void setPlayerClass(Player player, String playerClass)
	{
		playerClasses.put(player.getName(), playerClass);
	}
	
	public static int getPlayerMana(Player player)
	{
		return Integer.parseInt( (String) playerClasses.get(player.getName()) );
	}
	
	public static void setPlayerClass(Player player, int mana)
	{
		playerClasses.put(player.getName(), String.valueOf(mana));
	}

	
}
