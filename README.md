# Zulrah Auto Prayer Switch Plugin

## What is it?

This is a Microbot-based plugin developed for RuneLite that automates protection prayer switching during the Zulrah boss fight. Its current implementation only handles **prayer switching**, detecting the incoming projectile type and activating the corresponding protection prayer.

## Features

- Real-time projectile detection via game events
- Prayer switching using `Rs2Prayer.toggle`
- Modular code design using Microbot standards
- Configurable plugin behavior (`ZulrahAutoPrayerConfig`)

## Project Structure

- `ZulrahAutoPrayerScript.java` - Main logic for real-time prayer switching
- `ZulrahAutoPrayerPlugin.java` - Initialization and lifecycle management
- `ZulrahProjectileDetector.java` - Detects the type of Zulrah attack
- `ZulrahAutoPrayerConfig.java` - User settings and toggles

## Status

🚧 **Under Development**  
🧪 **Needs Help with Testing**  
🔧 **Works only for Zulrah at this time**

## Next Goals

- Finish in-game testing with help from contributors
- Handle edge cases where prayers may not toggle correctly
- Expand to support other boss encounters like Jad or Vorkath

## Want to Contribute?

If you'd like to test, debug, or expand this project:
- Fork the repo
- Open issues or pull requests
- Share logs and feedback from your runs

---

