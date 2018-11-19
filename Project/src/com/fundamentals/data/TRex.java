package com.fundamentals.data;

public class TRex extends Dinosaur {
	public TRex(String teeth) {
		super(teeth);
		// TODO Auto-generated constructor stub
	}

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
