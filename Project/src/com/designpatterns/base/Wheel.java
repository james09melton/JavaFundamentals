package com.designpatterns.base;

public abstract class Wheel implements WheelInterface {
	private int size;
	private boolean isWide;

	public Wheel(int size, boolean isWide) {
		this.size = size;
		this.isWide = isWide;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isWide() {
		return isWide;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+" ("+size+")";
	}
}
