package com.fundamentals.data;

public enum Dinner {
	Turkey, Stuffing, Cranberry, SweetPotatoes, MacCheese,
	DinnerRolls, Ham, GreenBeanCasorole, GreenRice, MashedPotatoes,
	Cornbread, DeviledEggs, pumpkinPie, AppleCobbler;
	
	// Constructor  // No return type
	private Dinner() {
		System.out.println("Constructor called for" + this.toString());
	}
	
	// Method
	public void readyNow() {
		System.out.println("Let's eat already.");
	}
	
}
