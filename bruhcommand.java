package debserver.bruh.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import debserver.bruh.Main;

public class bruhcommand implements CommandExecutor {

	
	private Main plugin;
	
	public bruhcommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("bruh").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (!(sender instanceof Player)) {sender.sendMessage("Sorry ale jenom hr·Ëi");
		return true; }
		
		Player p = (Player) sender;
		if (p.hasPermission("hello.use")) {
			p.sendMessage("bruh!");
			return true;
		}
		else {
			
			
			p.sendMessage("Sorry ale nem·ö pr·va :/");
			return true;
			 }
		
		
		
		
	}
	
}
