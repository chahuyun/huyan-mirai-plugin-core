package cn.chahuyun.plguin.core.config

import cn.chahuyun.plguin.core.enums.DataType
import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.ValueDescription
import net.mamoe.mirai.console.data.value

/**
 * 数据库的插件配置
 */
object CoreDataConfig : AutoSavePluginConfig("dataConfig") {

    @ValueDescription("数据库链接方式")
    var dataType: DataType by value(DataType.H2)

    @ValueDescription("mysql数据库链接地址")
    val url: String by value("localhost:3306/huyan?autoReconnect=true")

    @ValueDescription("mysql数据库用户名")
    val user: String by value("root")

    @ValueDescription("mysql数据库密码")
    val password: String by value("123456")


}