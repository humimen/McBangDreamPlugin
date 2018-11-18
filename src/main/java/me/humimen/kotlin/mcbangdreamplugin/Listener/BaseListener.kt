package me.humimen.kotlin.mcbangdreamplugin.Listener

import me.humimen.kotlin.mcbangdreamplugin.McBangDreamPlugin
import org.bukkit.event.Listener

/**
 * Created by humimen on 2018/11/18.
 */
interface BaseListener:Listener {
    val plugin: McBangDreamPlugin
}