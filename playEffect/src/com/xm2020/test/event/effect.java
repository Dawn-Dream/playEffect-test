package com.xm2020.test.event;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class effect implements Listener {
    @EventHandler
    public void comehere(AsyncPlayerChatEvent event) {
        String msg = event.getMessage();
        if (msg.contains("test")) {
            Player player = event.getPlayer();
            Location playername = player.getLocation();
            playername.getWorld().playEffect(playername, Effect.STEP_SOUND , Material.REDSTONE_BLOCK);
        }
    }
}
