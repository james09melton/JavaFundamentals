package com.designpatterns.creational;

import com.designpatterns.base.BikeInterface;

public abstract class BikeBuilder {

	public abstract BikeInterface getBike();
	
	public void buildStreetTires() {  }
	
	public void buildWideTires() {  }
	
	public void buildHandleBars() {  }
}
