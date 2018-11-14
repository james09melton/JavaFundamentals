package com.fundamentals.java;

public class Condo extends House implements HomeInterface{
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
	
	@Override
	public void decorate() {
		// TODO Auto-generated method stub
		System.out.println("Decorate Condo");
	}
}
