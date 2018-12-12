package com.designpatterns.creational;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.MountainBike;

public class MountainBikeBuilder extends BikeBuilder{
private MountainBike mountainBikeInProgress;
	
	public MountainBikeBuilder(MountainBike bike) {
		this.mountainBikeInProgress = bike;
	}
	
	@Override
	public void buildWideTires() { 
		System.out.println("Building Mountain Bike Wide Tires");

	}
	
	@Override
	public void buildHandleBars() { 
		System.out.println("Building Mountain Bike Handle Bars");

	}

	@Override
	public BikeInterface getBike() {
		return mountainBikeInProgress;
	}
}
