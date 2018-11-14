package com.fundamentals.java;

/*Since this class is abstract, it does not have to implement the abstract methods
 * of its parent. However, any subclass of this class must implement those abstract
 * methods, unless, this class defines them itself.
 * Any abstract methods of this class, must be defined(implemented) in its subclasses.
 */

public abstract class GeometrySample extends Shape {

	/*
	 * This method originated from the Shape class and has been overridden in order
	 * to demonstrate a polymorphism trait of defining its own behavior.
	 */
	@Override
	public String draw() {
		return "Geometry Draws";
	}

	/*
	 * Abstract method must defined (implemented) in the child class(subclasses). An
	 * abstract method is constructed without a body and ends with a semi-colon
	 * Abstract methods can be defined with parameters and a return type, and can be
	 * overloaded.
	 */
	abstract void geometryMethod();

}
