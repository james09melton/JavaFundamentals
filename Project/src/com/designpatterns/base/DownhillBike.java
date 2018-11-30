package com.designpatterns.base;

public class DownhillBike extends MountainBike{
	public DownhillBike(WheelInterface wheel) {
		this(wheel, BikeInterface.Color.UNPAINTED);
	}
	public DownhillBike(WheelInterface wheel, BikeInterface.Color color) {
		super(wheel, color);
	}
}
