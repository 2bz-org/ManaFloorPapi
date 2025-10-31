# ManaFloor PlaceholderAPI Expansion

External PlaceholderAPI expansion that exposes `%manafloor_mana%`, returning the floored AuraSkills mana value for a player.

## Installation

1. `mvn -q -DskipTests package`
2. Copy the built jar to `/plugins/PlaceholderAPI/expansions/ManaFloor-1.0.1.jar`
3. Restart the server or run `/papi reload`

## Usage

Use `%manafloor_mana%` in MythicHUD, DeluxeMenus, scoreboards, or any PlaceholderAPI-compatible plugin.

## Verification

Run `/papi parse <player> %manafloor_mana%` to ensure the placeholder returns a whole number.

## Requirements

- PlaceholderAPI
- AuraSkills with its PlaceholderAPI hook enabled
