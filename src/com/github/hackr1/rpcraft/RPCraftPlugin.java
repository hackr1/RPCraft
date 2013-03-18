package com.github.hackr1.rpcraft;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * 
 * @author Alex Seitz (aka hackr1)
 *
 */
public class RPCraftPlugin extends JavaPlugin {
	
	java.util.logging.Logger out = LoggerProvider.getLogger();
	
	public void onEnable()
	{
		//setup Plugin Folder
		if(!this.getDataFolder().exists())
			this.getDataFolder().mkdir();
		
		//register event handlers
		this.getServer().getPluginManager().registerEvents(new RPCraftListener(), this);
		  
		msg("RPCraft enabled.");
	}
	
	public void onDisable()
	{
		
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
}
