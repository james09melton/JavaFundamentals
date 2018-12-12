package com.designpatterns.creational;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.RoadBike;

public class RoadBikeBuilder extends BikeBuilder{
private RoadBike bikeInProgress;
	
	public RoadBikeBuilder(RoadBike bike) {
		this.bikeInProgress = bike;
	}
	
	@Override
	public void buildStreetTires() {
		System.out.println("Building Road Bike Street Tires");
	}
	
	@Override
	public void buildHandleBars() {
		System.out.println("Building Road Bike Handle Bars");
	}

	@Override
	public BikeInterface getBike() {
		return bikeInProgress;
	}

}
