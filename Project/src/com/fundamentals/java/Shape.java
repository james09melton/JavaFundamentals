package com.fundamentals.java;

/*	Abstract class example. An abstract class can have no object instances created
 * of itself, but can provide its sub-classes with data so they can have instances. Any method
 * that is declared abstract must be implemented (created/used) in the sub-class.
 * Static methods can be used, and even normal methods and properties.
 */
public abstract class Shape {
	/*
	 * Encapsulation class variables that have setter/getter properties. They can be
	 * accessed via their subclass instance objects
	 */
	private int length;
	private int width;

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Since a static method doesn't support instances, it can be used in an
	 * abstract class
	 */

	public static int area(int length, int width) {
		return length * width;
	}

	// abstract method with parameters must be overridden by a subclass
	abstract double area(double length, double width, double height);

	// abstract method must be overridden by a subclass.
	abstract double area();

	// abstract method must be overridden by a subclass
	abstract String draw();

}
