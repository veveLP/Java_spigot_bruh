package debserver.bruh;

import org.bukkit.plugin.java.JavaPlugin;

import debserver.bruh.commands.bruhcommand;

public class Main extends JavaPlugin {

	
	@Override
	public void onEnable() {
	new bruhcommand(this);
	
	}
	
	
}
