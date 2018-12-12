package com.designpatterns.creational;

public class MountainBikeFactory extends AbstractBikeFactory{
	@Override
	public BikeFrameInterface createFrame() {
		return new MountainFrame();
	}

	@Override
	public BikeSeatInterface createBikeSeat() {
		return new MountainSeat();
	}
}
