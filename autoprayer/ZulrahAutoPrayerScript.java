package net.runelite.client.plugins.microbot.autoprayer;

import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.client.plugins.microbot.Microbot;
import net.runelite.client.plugins.microbot.util.prayer.Rs2Prayer;
import net.runelite.client.plugins.microbot.script.LoopScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

// 🇧🇷 Script que executa a lógica de auto prayer
// 🇺🇸 Script that executes the auto prayer logic
public class ZulrahAutoPrayerScript extends LoopScript {

    private final ZulrahProjectileDetector detector = new ZulrahProjectileDetector();

    @Override
    public void run() {
        mainScheduledExecutorService.scheduleAtFixedRate(() -> {
            try {
                if (!isRunning()) return;

                List<Projectile> projectiles = detector.getActiveProjectiles();
                for (Projectile projectile : projectiles) {
                    Prayer prayer = detector.mapProjectileToPrayer(projectile);
                    if (prayer != null) {
                        Rs2Prayer.togglePrayer(prayer, true);
                    }
                }
            } catch (Exception ex) {
                System.err.println("Erro ao detectar projétil: " + ex.getMessage());
            }
        }, 0, 100, TimeUnit.MILLISECONDS);
    }

    public void shutdown() {
        stop();
        Microbot.getEventBus().unregister(detector);
    }
}
