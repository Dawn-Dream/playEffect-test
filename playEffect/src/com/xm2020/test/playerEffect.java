package com.xm2020.test;

import com.xm2020.test.event.effect;
import org.bukkit.plugin.java.JavaPlugin;

public class playerEffect extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("[play Effect]load in");
        getServer().getPluginManager().registerEvents(new effect(),this);
    }
}
