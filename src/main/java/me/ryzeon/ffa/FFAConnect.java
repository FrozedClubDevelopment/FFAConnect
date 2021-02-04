package me.ryzeon.ffa;

import me.ryzeon.ffa.utils.CC;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Ryzeon
 * Project: FFAConnect
 * Date: 03/02/2021 @ 23:41
 */

public class FFAConnect extends JavaPlugin {

    public static FFAConnect INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
        logger("Enabling FFAConnect");
    }

    public static void logger(String msg, String subMsg) {
        Bukkit.getConsoleSender().sendMessage(CC.translate("&7[&erLoader&7] &f" + subMsg + " &f" + msg));
    }

    public static void logger(String msg) {
        Bukkit.getConsoleSender().sendMessage(CC.translate("&7[&rLoader&7] &f" + msg));
    }
}
