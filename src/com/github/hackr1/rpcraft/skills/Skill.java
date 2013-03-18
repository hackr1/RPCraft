package com.github.hackr1.rpcraft.skills;

import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

/**
 * 
 * @author Alex Seitz (aka hackr1)
 *
 */
public abstract class Skill {
	public abstract void castOnLivingEntity(Player player, LivingEntity entity);
	public abstract void castOnBlock(Player player, Block block);
	public abstract void castIntoAir(Player player, World world);
	
	public abstract String getName();
	public abstract String getDisplayedName();
	public abstract String getDescription();
	
	public abstract int getManaCost(int Level);
	public abstract int getEnergyCost(int Level);
	public abstract int getCooldown(int milliseconds);
}
