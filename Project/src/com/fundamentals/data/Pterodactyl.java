package com.fundamentals.data;

public class Pterodactyl extends Dinosaur {
	public Pterodactyl(String teeth) {
		super(teeth);
		// TODO Auto-generated constructor stub
	}

	private boolean hasWings;
	
	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}
	
	public boolean getHasWings() {
		return hasWings;
	}
	
	public static void Action() {
		System.out.println("Fly");
	}
}
