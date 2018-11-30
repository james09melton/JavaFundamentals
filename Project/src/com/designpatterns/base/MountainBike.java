package com.designpatterns.base;

public abstract class MountainBike extends AbstractBike{

	public MountainBike(WheelInterface wheel) {
		this(wheel, BikeInterface.Color.UNPAINTED);
	}
	public MountainBike(WheelInterface wheel, BikeInterface.Color color) {
		super(wheel, color);
	}
}
