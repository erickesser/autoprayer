## Zulrah Auto Prayer Switch - Progress Report

### Overview
The development of the `ZulrahAutoPrayerScript` is progressing steadily. This script is designed to dynamically activate the correct protection prayer during the Zulrah fight, based on detected incoming projectiles. Its scope is deliberately limited to prayer switching only, providing a foundation that can later be extended to support gear switching or handling other bosses.

### Achievements So Far
- Developed and structured the base classes:
  - `ZulrahAutoPrayerScript`: Core logic for detecting projectiles and switching prayers.
  - `ZulrahAutoPrayerPlugin`: Handles plugin startup and shutdown procedures.
  - `ZulrahProjectileDetector`: Detects the type of projectile to determine which prayer to use.
  - `ZulrahAutoPrayerConfig`: Configuration options for user preferences.
- Integrated RuneLite APIs and Microbot abstractions for managing prayer switching via `Rs2Prayer`.
- Established event subscription model to listen to projectile spawning.
- Modularized the logic to allow for possible reuse and future expansion.

### Current Roadblocks
- Testing the plugin is currently problematic due to environment constraints or unknown conflicts.
- Debugging is limited since visual feedback from prayer switches is hard to trace without runtime interactions.
- There is a need for community support to assist in integration and testing within the full Microbot environment.

### Next Steps
To move forward, assistance is needed with:
- Validating event subscriptions and prayer toggles in a live Zulrah instance.
- Ensuring compatibility with Microbot’s script scheduler and overlay renderings.
- Providing feedback or logs when prayers fail to switch as expected.

### Final Considerations
While the current version focuses solely on Zulrah prayer switching, this implementation serves as a proof of concept. Upon stabilization and successful testing, the same architecture can be adapted for other PvM encounters that rely on reactionary prayer switching, such as Jad or the Inferno.

Contributors and testers are welcome. Collaboration at this stage will determine the success and scalability of this tool.
