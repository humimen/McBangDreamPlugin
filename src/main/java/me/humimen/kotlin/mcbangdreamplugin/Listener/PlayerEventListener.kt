package me.humimen.kotlin.mcbangdreamplugin.Listener

import me.humimen.kotlin.mcbangdreamplugin.McBangDreamPlugin
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerInteractEvent

/**
 * Created by humimen on 2018/11/18.
 */
class PlayerEventListener(override val plugin: McBangDreamPlugin) :BaseListener{
    @EventHandler
    fun viewInformation(event: PlayerInteractEvent){
        if(event.clickedBlock.type == Material.DIAMOND_BLOCK){

        }
    }
}