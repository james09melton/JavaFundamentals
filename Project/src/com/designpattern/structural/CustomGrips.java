package com.designpattern.structural;

import com.designpatterns.base.BikeInterface;

public class CustomGrips extends AbstractBikeOption {

	public CustomGrips(BikeInterface bike) {
		super(bike);
	}
	
	@Override
	public float getPrice() {
		return decoratedBike.getPrice()+ 20.00F;
	}
}
