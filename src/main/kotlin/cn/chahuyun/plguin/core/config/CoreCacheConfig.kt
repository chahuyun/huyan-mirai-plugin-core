package cn.chahuyun.plguin.core.config

import cn.chahuyun.plguin.core.enums.CacheType
import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.ValueDescription
import net.mamoe.mirai.console.data.value

/**
 * 缓存的插件配置
 */
object CoreCacheConfig : AutoSavePluginConfig("cacheConfig") {

    @ValueDescription("缓存类型")
    var cacheType: CacheType by value(CacheType.MEMORY)

    @ValueDescription("redis数据库链接地址")
    val url: String by value("localhost:6379")

    @ValueDescription("redis数据库")
    val dataBase: Int by value(0)

    @ValueDescription("redis数据库用户名")
    val user: String by value("root")

    @ValueDescription("redis数据库密码")
    val password: String by value("123456")

}