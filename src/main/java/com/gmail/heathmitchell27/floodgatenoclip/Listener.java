package com.gmail.heathmitchell27.floodgatenoclip;

import org.bukkit.craftbukkit.v1_16_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.geysermc.floodgate.FloodgateAPI;

import java.util.logging.Logger;

public class Listener implements org.bukkit.event.Listener {
    private final Logger logger;

    Listener (Logger logger) {
        this.logger = logger;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();
        // System.out.println(player.getUniqueId());
        // System.out.println(FloodgateAPI.isBedrockPlayer(player.getUniqueId()));
        if (FloodgateAPI.isBedrockPlayer(player.getUniqueId())) {
            ((CraftPlayer) player).getHandle().noclip = true;
            logger.info("floodgate-noclip: disabled collision for player " + player.getName());
        }
    }
}
