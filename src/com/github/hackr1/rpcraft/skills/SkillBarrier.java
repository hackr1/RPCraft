package com.github.hackr1.rpcraft.skills;

import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SkillBarrier extends Skill {

	@Override
	public void castOnLivingEntity(Player player, LivingEntity entity) {
		castIntoAir(player, player.getWorld());
	}

	@Override
	public void castOnBlock(Player player, Block block) {
		castIntoAir(player, player.getWorld());
	}

	@Override
	public void castIntoAir(Player player, World world) {
		player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 500, 5));
	}

	@Override
	public String getName() {
		return "barrier";
	}

	@Override
	public String getDisplayedName() {
		return "barrier";
	}

	@Override
	public int getManaCost(int Level) {
		return 0;
	}

	@Override
	public int getEnergyCost(int Level) {
		return 0;
	}

	@Override
	public int getCooldown(int milliseconds) {
		return 120000;
	}

	@Override
	public String getDescription() {
		return "Protects you from physical damage for a short time";
	}

}
