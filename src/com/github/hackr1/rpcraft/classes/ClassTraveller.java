package com.github.hackr1.rpcraft.classes;

import java.util.HashMap;

public class ClassTraveller extends Class {

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return "Traveller";
	}
	
	public ClassTraveller()
	{
		//set basic info
				super();
				this.name = "traveller";
				this.levels = 1;
				this.SkillCurrency = 0;
				
				//set skill sequence
				this.skillSequence = new HashMap<Integer, Object[]>();
				
				//set values
				this.baseHealth = 1000; // 10 hearts
				this.baseHealthRegen = 25; // 0.25 hearts
				this.baseMana = 0;
				this.baseManaRegen = 0;
				
				this.swordDamageMultiplier = 0; // swords do standard damage at level 1
				this.bowDamageMultiplier = 0;
				this.axeDamageMultiplier = 0;
				this.fistDamageMultiplier = 1;
				
				//set value increments
				this.healthIncreasePerLevel = 0; // 0.2 hearts
				this.healthRegenIncreasePerLevel = 0;
				this.manaIncreasePerLevel = 0;
				this.manaRegenIncreasePerLevel = 0;
				this.bowDamageMultiplierIncreasePerLevel = 0;
				this.axeDamageMultiplierIncreasePerLevel = 0;
				this.fistDamageMultiplierIncreasePerLevel = 0;
				this.swordDamageMultiplierIncreasePerLevel = 0;
	}

}
