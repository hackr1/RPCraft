package com.github.hackr1.rpcraft;

import org.bukkit.event.*;
import org.bukkit.event.player.*;

/**
 * 
 * @author Alex Seitz (aka hackr1)
 *
 */
public class RPCraftListener implements Listener {
	
		java.util.logging.Logger out = LoggerProvider.getLogger();
	
		@EventHandler
	    public void onPlayerLogin(PlayerLoginEvent event) {
	        out.info("[RPCraft] Player " + event.getPlayer().getName() + "logged in!");
	        event.getPlayer().sendMessage("[RPCraft] Welcome to this Server!");
	        //if()
	    }
}
