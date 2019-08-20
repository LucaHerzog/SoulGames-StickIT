package de.luca.soulgames.stickit.main;

import de.luca.soulgames.stickit.listeners.PlayerJoinListener;
import de.luca.soulgames.stickit.listeners.PlayerQuitListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
public static String PREFIX = "§8•● §6§lStickIT §r§8» §7";
public static String INFORMATION_PREFIX = "§8•● §c§lINFORMATION §r§8» §7";
public static String NOPERMS = Main.PREFIX + "Du hast keine §6Berechtigungen §7um diesen §6Befehl §7auszuführen.";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(Main.INFORMATION_PREFIX + "Das StickIT Plugin wurde erfolgreich aktiviert.");

        registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(Main.INFORMATION_PREFIX + "Das StickIT Plugin wurde erfolgreich deaktiviert.");
    }

    public void registerCommands() {

    }

    public void registerEvents() {
        PluginManager pluginManager = Bukkit.getPluginManager();

        pluginManager.registerEvents(new PlayerJoinListener(), this);
        pluginManager.registerEvents(new PlayerQuitListener(), this);
    }

}
