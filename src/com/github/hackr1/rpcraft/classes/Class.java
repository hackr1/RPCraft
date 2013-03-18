package com.github.hackr1.rpcraft.classes;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @author Alex Seitz (aka hackr1)
 *
 */
public abstract class Class {
	
	// basic info
	/**
	 * represents the name of the class, may only contain lowercase letters
	 */
	public String name;
	/**
	 * the number of levels that this class has
	 */
	public int levels;
	/**
	 * the skills that members of this class can learn (Key=Level at which they learn the skill, Value=An array with index 0 showing the skill and index 1 showing the level)
	 */
	public HashMap<Integer, Object[]> skillSequence;
	/**
	 * determines whether this class has mana, energy, or none (none=0, mana=1, energy=2)
	 */
	public int SkillCurrency;
	
	
	//health/mana related stuff
	/**
	 * represents the base health of this class (currently not working) (100 health = 1 heart)
	 */
	public int baseHealth;
	/**
	 * represents the base mana (if it has mana) of this class
	 */
	public int baseMana;
	/**
	 * represents the base health regeneration per regeneration tick of this class (currently not working) (100 health = 1 heart)
	 */
	public int baseHealthRegen;
	/**
	 * represents the base mana regeneration per second (if it has mana) of this class
	 */
	public int baseManaRegen;
	/**
	 * represents the sword damage multiplier of this class
	 */
	
	//damage multipliers
	public int swordDamageMultiplier;
	
	/**
	 * represents the axe damage multiplier of this class
	 */
	public int axeDamageMultiplier;
	
	/**
	 * represents the bow damage multiplier of this class
	 */
	public int bowDamageMultiplier;
	
	/**
	 * represents the fist damage multiplier of this clas
	 */
	public int fistDamageMultiplier;
	
	
	//value increments per level
	public int healthIncreasePerLevel;
	public int manaIncreasePerLevel;
	public int healthRegenIncreasePerLevel;
	public int manaRegenIncreasePerLevel;
	public float swordDamageMultiplierIncreasePerLevel;
	public float axeDamageMultiplierIncreasePerLevel;
	public float bowDamageMultiplierIncreasePerLevel;
	public float fistDamageMultiplierIncreasePerLevel;
	
	
	/**
	 * @return The name of the class that is displayed ingame, may contain spaces and any ASCII sign.
	 */
	public abstract String getDisplayName();
	
	/**
	 * Each element shows a level that the player must have reached in another class before he can choose this class
	 */
	public ArrayList<Object[]> LevelsRequired()
	{
		return new ArrayList<Object[]>();
	}
	
	public Class()
	{
		
	}
	
	
}
