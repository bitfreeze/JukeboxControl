package me.exec64.JukeboxControl;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class JukeboxControl extends JavaPlugin {

	Logger log = Logger.getLogger("Minecraft");
	private final JCBlockListener blockListener = new JCBlockListener(this);
	
	public void onEnable() {
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvent(Event.Type.REDSTONE_CHANGE, blockListener, Event.Priority.Normal, this);
		
		log.info("JukeboxControl has been enabled.");
	}
	
	public void onDisable() {
		log.info("JukeboxControl has been disabled");
	}
}
