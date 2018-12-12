package com.designpatterns.creational;

public class RoadBikeFactory extends AbstractBikeFactory{

	@Override
	public BikeFrameInterface createFrame() {
		return new RoadFrame();
	}

	@Override
	public BikeSeatInterface createBikeSeat() {
		return new RoadSeat();
	}
}
