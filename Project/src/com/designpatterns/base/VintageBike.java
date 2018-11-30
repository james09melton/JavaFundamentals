package com.designpatterns.base;

public class VintageBike extends RoadBike{
	public VintageBike(WheelInterface wheel) {
		this(wheel, BikeInterface.Color.UNPAINTED);
	}
	public VintageBike(WheelInterface wheel, BikeInterface.Color color) {
		super(wheel, color);
	}
}
