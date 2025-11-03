package net.runelite.client.plugins.microbot.autoprayer;

import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.microbot.Microbot;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

// 🇧🇷 Detector de projéteis de Zulrah
// 🇺🇸 Zulrah projectile detector
public class ZulrahProjectileDetector {

    private final List<Projectile> activeProjectiles = new CopyOnWriteArrayList<>();

    public ZulrahProjectileDetector() {
        Microbot.getEventBus().register(this);
    }

    @Subscribe
    public void onProjectileMoved(ProjectileMoved event) {
        Projectile projectile = event.getProjectile();
        if (isZulrahProjectile(projectile)) {
            activeProjectiles.add(projectile);
        }
    }

    public List<Projectile> getActiveProjectiles() {
        return new ArrayList<>(activeProjectiles);
    }

    public Prayer mapProjectileToPrayer(Projectile p) {
        switch (p.getId()) {
            case 1046:
                return Prayer.PROTECT_FROM_MAGIC;
            case 1044:
                return Prayer.PROTECT_FROM_MISSILES;
            default:
                return null;
        }
    }

    private boolean isZulrahProjectile(Projectile projectile) {
        int id = projectile.getId();
        return id == 1046 || id == 1044;
    }
}
