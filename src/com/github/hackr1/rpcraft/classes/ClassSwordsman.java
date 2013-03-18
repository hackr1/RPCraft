package com.github.hackr1.rpcraft.classes;

import java.util.HashMap;

import com.github.hackr1.rpcraft.skills.*;


/**
 * 
 * @author Alex Seitz (aka hackr1)
 *
 */
public class ClassSwordsman extends Class {

	public ClassSwordsman()
	{
		//set basic info
		super();
		this.name = "swordsman";
		this.levels = 30;
		this.SkillCurrency = 0;
		
		//set skill sequence
		this.skillSequence = new HashMap<Integer, Object[]>();
		skillSequence.put(
				1, //level where the skill is learned
				new Object[]{
						Skills.BARRIER, //which skill is learned
						1 //which level the learned skill has
		});
		
		//set values
		this.baseHealth = 1000; // 10 hearts
		this.baseHealthRegen = 25; // 0.25 hearts
		this.baseMana = 0;
		this.baseManaRegen = 0;
		
		this.swordDamageMultiplier = 1; // swords do standard damage at level 1
		this.bowDamageMultiplier = 0;
		this.axeDamageMultiplier = 0;
		this.fistDamageMultiplier = 1;
		
		//set value increments
		this.healthIncreasePerLevel = 200; // 0.2 hearts
		this.healthRegenIncreasePerLevel = 0;
		this.manaIncreasePerLevel = 0;
		this.manaRegenIncreasePerLevel = 0;
		this.bowDamageMultiplierIncreasePerLevel = 0;
		this.axeDamageMultiplierIncreasePerLevel = 0;
		this.fistDamageMultiplierIncreasePerLevel = 0;
		this.swordDamageMultiplierIncreasePerLevel = 0;
		
		
		
	}
	@Override
	public String getDisplayName() {
		return "Swordsman";
	}

}
