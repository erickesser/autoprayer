package net.runelite.client.plugins.microbot.autoprayer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

// 🇧🇷 Configuração do plugin
// 🇺🇸 Plugin configuration
@ConfigGroup("zulrahautoprayer")
public interface ZulrahAutoPrayerConfig extends Config {

    @ConfigItem(
            keyName = "enabled",
            name = "Ativar Auto Prayer",
            description = "Ativa ou desativa a troca automática de prayers"
    )
    default boolean enabled() {
        return true;
    }
}
