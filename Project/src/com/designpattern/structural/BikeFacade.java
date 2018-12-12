package com.designpattern.structural;

import com.designpatterns.base.BikeInterface;

public class BikeFacade {
	public void prepareForSale(BikeInterface bike) {
		Registration reg = new Registration(bike);
		reg.allocatingBikeNumber();
		Documentation.printBrochure(bike);
		bike.cleanFrame();
		bike.airTires();
		bike.testRide();
	}
}
