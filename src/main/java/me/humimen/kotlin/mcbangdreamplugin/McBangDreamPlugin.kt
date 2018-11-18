package me.humimen.kotlin.mcbangdreamplugin

import org.bukkit.plugin.java.JavaPlugin

/**
 * Created by humimen on 2018/11/18.
 */

class McBangDreamPlugin : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Hello BangDreamer!!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}