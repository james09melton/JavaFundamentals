package com.fundamentals.data;

public class TRex extends Dinosaur {
	private boolean hasShortArms;
	
	public void setHasShortArms(boolean hasShortArms) {
		this.hasShortArms = hasShortArms;
	}
	
	public boolean getHasShortArms() {
		return hasShortArms;
	}
	
	public static void Action() {
		System.out.println("Smash");
	}
}
