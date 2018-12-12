package com.designpatterns.creational;

public abstract class AbstractBikeFactory {
	public abstract BikeFrameInterface createFrame();
	public abstract BikeSeatInterface createBikeSeat();
}
