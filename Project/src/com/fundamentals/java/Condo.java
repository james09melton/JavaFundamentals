package com.fundamentals.java;

public class Condo extends House {
	private boolean hasBalcony;
	
	public void setHasBalcony(boolean hasBalcony) {
		this.hasBalcony = hasBalcony;
	}
	
	public boolean getHasBalcony() {
		return hasBalcony;
	}
	
	@Override
	public void openDoor() {
		System.out.println("I opened a wooden door");
	}
}
