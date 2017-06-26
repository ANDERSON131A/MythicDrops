package io.pixeloutlaw.minecraft.spigot.mythicdrops.core.loaders.tiers;

import com.google.inject.assistedinject.Assisted;
import io.pixeloutlaw.minecraft.spigot.mythicdrops.api.tiers.MythicTierLore;
import io.pixeloutlaw.minecraft.spigot.mythicdrops.common.loaders.AbstractConfigurateMythicLoader;
import io.pixeloutlaw.minecraft.spigot.mythicdrops.core.MythicDropsPlugin;
import ninja.leaping.configurate.ConfigurationNode;
import ninja.leaping.configurate.SimpleConfigurationNode;
import ninja.leaping.configurate.Types;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.io.IOException;

public final class MythicTierLoreLoader extends AbstractConfigurateMythicLoader<MythicTierLore> {

    private static final Logger LOGGER = LoggerFactory.getLogger(MythicTierLoreLoader.class);

    @Inject
    public MythicTierLoreLoader(MythicDropsPlugin plugin, @Assisted String fileName) {
        super(plugin, fileName);
    }

    @Override
    public MythicTierLore load() {
        LOGGER.debug("Loading tier lore from {}", fileName);
        ConfigurationNode configurationNode = SimpleConfigurationNode.root();
        try {
            configurationNode = fileConfigurationLoader.load();
        } catch (IOException e) {
            // do nothing :)
        }
        return MythicTierLore.builder()
                .minimumBonusLore(configurationNode.getNode("lore", "minimumBonusLore").getInt(0))
                .maximumBonusLore(configurationNode.getNode("lore", "maximumBonusLore").getInt(0))
                .baseLore(configurationNode.getNode("lore", "baseLore").getList(Types::asString))
                .bonusLore(configurationNode.getNode("lore", "bonusLore").getList(Types::asString))
                .build();
    }

    @Override
    public void save(MythicTierLore mythicTierLore) {
        ConfigurationNode configurationNode = SimpleConfigurationNode.root();
        try {
            configurationNode = fileConfigurationLoader.load();
        } catch (IOException e) {
            // do nothing :)
        }
        ConfigurationNode enchantmentsNode = configurationNode.getNode("lore");
        enchantmentsNode.getNode("minimumBonusLore").setValue(mythicTierLore.minimumBonusLore());
        enchantmentsNode.getNode("maximumBonusLore").setValue(mythicTierLore.maximumBonusLore());
        enchantmentsNode.getNode("baseLore").setValue(mythicTierLore.baseLore());
        enchantmentsNode.getNode("bonusLore").setValue(mythicTierLore.bonusLore());
        try {
            fileConfigurationLoader.save(configurationNode);
        } catch (IOException e) {
            LOGGER.debug("Unable to save tier lore to {}", fileName);
        }
    }

}