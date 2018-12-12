package com.designpatterns.base;

public class CrossCountryBike extends MountainBike{
	public CrossCountryBike(WheelInterface wheel) {
		this(wheel, BikeInterface.Color.UNPAINTED);
	}
	public CrossCountryBike(WheelInterface wheel, BikeInterface.Color color) {
		super(wheel, color);
	}
	
	@Override
	public float getPrice() {
		return 850.00f;
	}
}
