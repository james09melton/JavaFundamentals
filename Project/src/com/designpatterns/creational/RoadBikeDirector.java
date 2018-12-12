package com.designpatterns.creational;

import com.designpatterns.base.BikeInterface;

public class RoadBikeDirector extends BikeDirector{

	@Override
	public BikeInterface build(BikeBuilder builder) {
		builder.buildHandleBars();
		builder.buildStreetTires();
		return builder.getBike();
	}
}
