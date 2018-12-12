package com.designpattern.structural;

import com.designpatterns.base.BikeInterface;

public class LeatherSeatBike extends AbstractBikeOption{

	public LeatherSeatBike(BikeInterface bike) {
		super(bike);
	}
	
	@Override
	public float getPrice() {
		return decoratedBike.getPrice()+ 40.00F;
	}
}
