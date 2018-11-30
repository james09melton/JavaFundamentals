package com.designpatterns.base;

public abstract class RoadBike extends AbstractBike{

	public RoadBike(WheelInterface wheel) {
		this(wheel, BikeInterface.Color.UNPAINTED);
	}
	public RoadBike(WheelInterface wheel, BikeInterface.Color color) {
		super(wheel, color);
	}
}
