package net.runelite.client.plugins.microbot.autoprayer;

import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.microbot.MicrobotPlugin;

// 🇧🇷 Define o plugin e suas propriedades
// 🇺🇸 Defines the plugin and its properties
@PluginDescriptor(
        name = "Zulrah Auto Prayer",
        description = "Auto prayer para Zulrah baseado em projéteis",
        tags = {"zulrah", "prayer", "auto"},
        type = PluginType.PVM
)
public class ZulrahAutoPrayerPlugin extends MicrobotPlugin {

    // 🇧🇷 Script principal
    // 🇺🇸 Main logic script
    ZulrahAutoPrayerScript script = new ZulrahAutoPrayerScript();

    @Override
    protected void startPlugin() {
        script.run();
    }

    @Override
    protected void shutDown() {
        script.shutdown();
    }
}
