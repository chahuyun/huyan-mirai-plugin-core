package cn.chahuyun.plguin.core.command

import cn.chahuyun.plugin.core.PluginCore
import net.mamoe.mirai.console.command.CommandSender
import net.mamoe.mirai.console.command.CompositeCommand

/**
 * 命令
 */
class SessionCommand : CompositeCommand(
    PluginCore.INSTANCE, "hyc",
    description = "huyan-mirai-plugin-core Command"
) {


    @SubCommand("v")
    suspend fun CommandSender.version() {
        sendMessage("当前壶言会话3版本 ${PluginCore.VERSION}")
    }
}