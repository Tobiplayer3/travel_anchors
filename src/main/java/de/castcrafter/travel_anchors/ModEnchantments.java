package de.castcrafter.travel_anchors;

import de.castcrafter.travel_anchors.enchantments.RangeEnchantment;
import de.castcrafter.travel_anchors.enchantments.TeleportationEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;

public class ModEnchantments {

    public static final EnchantmentType TELEPORTABLE = EnchantmentType.create(TravelAnchors.getInstance().modid + "_teleportable",
            item -> item == ModComponents.travelStaff || EnchantmentType.BREAKABLE.canEnchantItem(item));

    public static final Enchantment teleportation = new TeleportationEnchantment();
    public static final Enchantment range = new RangeEnchantment();

    public static void register() {
        TravelAnchors.getInstance().register("teleportation", teleportation);
        TravelAnchors.getInstance().register("range", range);
    }
}
