package cn.chahuyun.plugin.core;

import cn.chahuyun.plguin.core.config.CoreCacheConfig;
import cn.chahuyun.plguin.core.config.CoreDataConfig;
import net.mamoe.mirai.console.extension.PluginComponentStorage;
import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import org.jetbrains.annotations.NotNull;

/**
 * 狐言插件的核心
 *
 * @author Moyuyanli
 * @date 2024/3/28 11:30
 */
public class PluginCore extends JavaPlugin {

    /**
     * 本插件
     */
    public static PluginCore INSTANCE = new PluginCore();

    /**
     * 插件版本
     */
    public static final String VERSION = "1.0.0";

    public PluginCore() {
        super(new JvmPluginDescriptionBuilder("cn.chahuyun.huyan-mirai-plugin-core", VERSION)
                .name("HuYanMiraiPluginCore")
                .info("狐言的mirai插件核心")
                .author("Moyuyanli")
                .build());
    }

    /**
     * 插件加载时的方法
     */
    @Override
    public void onLoad(@NotNull PluginComponentStorage $this$onLoad) {
        super.onLoad($this$onLoad);
    }

    /**
     * 插件启动时的方法
     */
    @Override
    public void onEnable() {

        reloadPluginConfig(CoreDataConfig.INSTANCE);
        reloadPluginConfig(CoreCacheConfig.INSTANCE);

        super.onEnable();
    }

    /**
     * 插件卸载时的方法
     */
    @Override
    public void onDisable() {
        super.onDisable();
    }
}
