package de.luca.soulgames.stickit.main;

import com.sun.source.util.Plugin;
import de.luca.soulgames.stickit.listeners.PlayerJoinListener;
import de.luca.soulgames.stickit.listeners.PlayerQuitListener;
import de.luca.soulgames.stickit.mysql.MySQL;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import javax.security.auth.kerberos.KerberosTicket;

public class Main extends JavaPlugin {
public static String PREFIX = "§8•● §6§lStickIT §r§8» §7";
public static String INFORMATION_PREFIX = "§8•● §c§lINFORMATION §r§8» §7";
public static String NOPERMS = Main.PREFIX + "Du hast keine §6Berechtigungen §7um diesen §6Befehl §7auszuführen.";
public static MySQL mysql;


    @Override
    public void onEnable() {


        ConnectMySQL();

        Bukkit.getConsoleSender().sendMessage(Main.INFORMATION_PREFIX + "Das StickIT Plugin wurde erfolgreich aktiviert.");

        registerCommands();
        registerEvents();
    }

    private void ConnectMySQL() {
        mysql = new MySQL(BrickMC.de, itsmeshisuii, itsmeshisuii, ´#+*192jykqp,,-+^+#qbsk2o2mq#+´+9652+6);
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
