package com.github.hackr1.rpcraft;

import org.bukkit.command.*;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.*;

/**
 * 
 * @author Alex Seitz (aka hackr1)
 *
 */
public class RPCraftPlugin extends JavaPlugin {
	
	java.util.logging.Logger out = LoggerProvider.getLogger();
	PrintWriter errorLog;
	
	public void onEnable()
	{
		
		//setup error log
		 try {
			errorLog = new PrintWriter(new FileOutputStream(new File(getDataFolder().getAbsolutePath() + "/errors.log")));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		//setup Plugin Folder
		if(!this.getDataFolder().exists())
			this.getDataFolder().mkdir();
			
		//load player data
		msg("Loading player data...");
		try{
			PlayerInformation.load(getDataFolder());
		}catch(IOException e)
		{
			err("Error type java.io.IOException occured while loading player data.");
			e.printStackTrace(errorLog);
		}
		
		//register event handlers
		this.getServer().getPluginManager().registerEvents(new RPCraftListener(), this);
		 
		msg("RPCraft enabled.");
		
		//perform security saves
		afterEnable();
	}
	
	public void afterEnable()
	{
		try {
			PlayerInformation.save(getDataFolder());
		} catch (IOException e) {
			err("Error type java.io.IOException occured while saving player data.");
			e.printStackTrace(errorLog);
		}
		
	}
	
	public void onDisable()
	{
		//save player data
		try {
			PlayerInformation.save(getDataFolder());
		} catch (IOException e) {
			err("Error type java.io.IOException occured while saving player data.");
			e.printStackTrace(errorLog);
		}
		
		
	}
	
	public void registerHandlers()
	{
		
	}
	
	public String getVersion()
	{
		return "indev";
	}
	
	private void msg(String message)
	{
		out.info("[RPCraft] " + message);
	}
	
	private void err(String message)
	{
		out.log(java.util.logging.Level.SEVERE, "[RPCraft] " + message);
	}
	
	
	// redirect /rp commands to the Command Handler
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	if(cmd.getName().equalsIgnoreCase("rp")){
    		return new CommandHandler(this).executeCommand(sender, cmd, label, args);
    	}
    	return false; 
    }


	
}
