package me.humimen.kotlin.mcbangdreamplugin.ext

import org.bukkit.command.CommandExecutor
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

/**
 * Created by humimen on 2018/11/18.
 */
fun JavaPlugin.registerListener(listener: Listener){
    server.pluginManager.registerEvents(listener, this)
}
fun JavaPlugin.initCommand(command: String, executor: CommandExecutor){
    getCommand(command)?.executor = executor
}