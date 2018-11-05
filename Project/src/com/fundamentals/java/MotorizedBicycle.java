package com.fundamentals.java;

public class MotorizedBicycle extends Bicycle {
	private String hasEngine;
	
	public void setHasEngine(String hasEngine) {
		this.hasEngine = hasEngine;
	}
	
	public String getHasEngine() {
		return hasEngine;
	}
	
	@Override
	public void pedalling() {
		super.pedalling();
		System.out.println("Pedalling Fast");
	}
	
}
