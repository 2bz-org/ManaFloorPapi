# ManaFloor PlaceholderAPI Expansion

**ManaFloor** is a PlaceholderAPI expansion that provides the `%manafloor_mana%` placeholder.  
It retrieves a player’s **current mana value from AuraSkills** and rounds it **down to the nearest whole number** (a floor operation).  
This ensures clean, integer-only values in displays like HUDs, scoreboards, or menus.

---

## 📦 Installation

1. [Download the latest release](https://github.com/your-repo/ManaFloor/releases)  
2. Place the `.jar` file into:  
   `/plugins/PlaceholderAPI/expansions/`
3. Reload PlaceholderAPI with:  
   `/papi reload`

---

## ⚙️ Usage

Use `%manafloor_mana%` in any PlaceholderAPI-compatible plugin, including:
- MythicHUD  
- DeluxeMenus  
- Scoreboards  
- Other PAPI-compatible plugins  

The placeholder returns the player’s **floored mana value** from AuraSkills.

---

## 🧪 Verification

Run:
```
/papi parse <player> %manafloor_mana%
```
If set up correctly, the command will return a whole number like `86` instead of `86.7`.

---

## 🔧 Requirements

- [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/)  
- [AuraSkills](https://www.spigotmc.org/resources/auraskills.104445/) (with PlaceholderAPI hook enabled)

---

## 🏗️ Building from Source

If you want to build it manually instead of downloading:
```bash
mvn -q -DskipTests package
```
The compiled `.jar` will appear inside the `target/` folder.
