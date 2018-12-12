package com.designpatterns.creational;

import com.designpatterns.base.BikeInterface;

public class MountainBikeDirector extends BikeDirector{
	@Override
	public BikeInterface build(BikeBuilder builder) {
		builder.buildHandleBars();
		builder.buildWideTires();
		return builder.getBike();
	}
}
