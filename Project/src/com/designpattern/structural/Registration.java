package com.designpattern.structural;

import com.designpatterns.base.BikeInterface;

public class Registration {
	private BikeInterface bike;
	
	public Registration(BikeInterface bike) {
		this.bike = bike;
	}
	
	public void allocatingBikeNumber() {
		System.out.println("Allocating Bike number......");
	}
}
