package com.designpatterns.base;

public class TouringBike extends RoadBike{
	public TouringBike(WheelInterface wheel) {
		this(wheel, BikeInterface.Color.UNPAINTED);
	}
	public TouringBike(WheelInterface wheel, BikeInterface.Color color) {
		super(wheel, color);
	}
}
