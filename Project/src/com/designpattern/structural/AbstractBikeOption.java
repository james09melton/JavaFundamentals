package com.designpattern.structural;

import com.designpatterns.base.AbstractBike;
import com.designpatterns.base.BikeInterface;

public abstract class AbstractBikeOption extends AbstractBike {

	protected BikeInterface decoratedBike;
	
	public AbstractBikeOption(BikeInterface bike) {
		super(bike.getWheel());
		decoratedBike = bike;
	}
}
