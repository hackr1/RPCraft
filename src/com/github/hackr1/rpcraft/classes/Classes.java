package com.github.hackr1.rpcraft.classes;

public class Classes {
	public static final Class TRAVELLER = new ClassTraveller();
	public static final Class SWORDSMAN = new ClassSwordsman();
	
	
	public static Class getClass(String name)
	{
		if(name.equals("swordsman")){
			return SWORDSMAN;
		}else if(name.equals("traveller")){
			return TRAVELLER;
		}else
			return null;
	}
	 
}
