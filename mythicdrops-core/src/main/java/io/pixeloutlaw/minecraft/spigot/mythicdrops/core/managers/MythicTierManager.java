/**
 * The MIT License
 * Copyright (c) 2013 Pixel Outlaw
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.pixeloutlaw.minecraft.spigot.mythicdrops.core.managers;

import io.pixeloutlaw.minecraft.spigot.mythicdrops.api.managers.TierManager;
import io.pixeloutlaw.minecraft.spigot.mythicdrops.api.tiers.MythicTier;
import org.apache.commons.lang3.NotImplementedException;
import org.bukkit.ChatColor;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Optional;

public class MythicTierManager implements TierManager {

    @Inject
    public MythicTierManager() {
        // do nothing here
    }

    @Override
    public Optional<MythicTier> getTierFromKey(String key) {
        throw new NotImplementedException("Not yet implemented!");
    }

    @Override
    public Optional<MythicTier> getTierFromDisplayAndIdentifier(ChatColor displayColor, ChatColor identifierColor) {
        throw new NotImplementedException("Not yet implemented!");
    }

    @Override
    public Optional<MythicTier> getWeightedTier() {
        throw new NotImplementedException("Not yet implemented!");
    }

    @Override
    public Collection<MythicTier> getTiers() {
        throw new NotImplementedException("Not yet implemented!");
    }

    @Override
    public TierManager addTier(MythicTier tier) {
        throw new NotImplementedException("Not yet implemented!");
    }

    @Override
    public TierManager removeTier(String key) {
        throw new NotImplementedException("Not yet implemented!");
    }

    @Override
    public TierManager removeTier(MythicTier tier) {
        throw new NotImplementedException("Not yet implemented!");
    }

}