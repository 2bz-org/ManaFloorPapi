package org.gr1zzly.manafloor;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public final class ManaFloorExpansion extends PlaceholderExpansion {

    @Override public @NotNull String getIdentifier() { return "manafloor"; }
    @Override public @NotNull String getAuthor() { return "gr1zzlymc"; }
    @Override public @NotNull String getVersion() { return "1.0.0"; }
    @Override public boolean persist() { return true; }
    @Override public boolean canRegister() { return true; }

    @Override
    public String onPlaceholderRequest(Player p, @NotNull String params) {
        if (p == null) return "";
        if (params.equalsIgnoreCase("mana")) {
            String raw = PlaceholderAPI.setPlaceholders(p, "%auraskills_mana%");
            try {
                double v = Double.parseDouble(raw);
                long floored = (long) Math.floor(v);
                return Long.toString(floored);
            } catch (Exception e) {
                return "0";
            }
        }
        return null;
    }
}
