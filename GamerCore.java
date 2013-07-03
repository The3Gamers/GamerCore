package com.GamerPlugins.core;

import java.io.InputStream;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class GamerCore extends JavaPlugin
{

public final Logger logger = Logger.getLogger("Minecraft");
  public static GamerCore plugin;
  
  public void onEnable()
  {
    this.logger.info("[GamerCore] enabled");
    getConfig().options().copyDefaults(true);
    saveConfig();
    saveDefaultConfig();
  this.logger.info("[GamerCore] is finding GamerPlugins")
	registerGamerPlugins();
  }

  public void onDisable()
  {
    this.logger.info("[GamerCore] disabled");
	saveConfig();
				}
		}
	}
}
