package com.designpatterns.base;

public abstract class AbstractBike implements BikeInterface{
	private WheelInterface wheel;
	private BikeInterface.Color color;
	
	public AbstractBike(WheelInterface wheel) {
		this(wheel, BikeInterface.Color.UNPAINTED);
	}
	
	public AbstractBike(WheelInterface wheel, BikeInterface.Color color) {
	this.wheel = wheel;
	this.color = color;
	}
	
	@Override
	public WheelInterface getWheel() {
		return wheel;
	}
	
	@Override
	public BikeInterface.Color getColor(){
		return color;
	}
	
	@Override
	public void paint(BikeInterface.Color color) {
		this.color = color;
	}
	
	public String toString() {
		return getClass().getSimpleName()+" ("+wheel+", "+color+")";
	}
	
}
