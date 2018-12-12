package com.designpatterns.base;

public class VintageBike extends RoadBike{
	public VintageBike(WheelInterface wheel) {
		this(wheel, BikeInterface.Color.UNPAINTED);
	}
	public VintageBike(WheelInterface wheel, BikeInterface.Color color) {
		super(wheel, color);
	}
	
	@Override
	public float getPrice() {
		return 600.00f;
	}
}
