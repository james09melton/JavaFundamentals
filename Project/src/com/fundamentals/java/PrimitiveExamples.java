package com.fundamentals.java;

/*
 * This class will demonstrate Primitive data Types
 * */
public class PrimitiveExamples {

	// Value range is true or false
	boolean isPrimitive = true;

	// Value range is 0 to 65535
	char myChar = 'a';

	// Value range is -128 to 127
	byte myByte = 25;

	// Value range is -32,768 to 32,767
	short myShort = -250;

	// Value range is -2,147,483,648 to 2,147,483,647
	int myInt = 34678;

	// Value range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	long myLong = 52789L;

	// Value range varies
	float myFloat = 20.543F;

	// Value range varies
	double myDouble = 36.89;

	int ab = 10, cd = 24;

	// Method changes instance value from 34678 to 3400 after it displays in the
	// printLn
	public void myFirstPrimitiveMethod() {
		System.out.println(myInt);
		myInt = 3400;
		System.out.println(myInt);
	}

	// Method adds two numbers to a total and displays the result.
	public void myAddition() {
		int total = ab + cd;
		System.out.println(total);
	}

	// Method subtracts two numbers to a total and displays the result.
	public void mySubtraction() {
		int total = ab - cd;
		System.out.println(total);
	}

	// Method multiplies two numbers to a total and displays the result.
	public void myMultiplication() {
		int total = ab * cd;
		System.out.println(total);
	}

	// Method divides two numbers to a total and displays the result.
	public void myDivision() {
		double total = (double) cd / (double) ab;
		System.out.println(total);
	}

	// Method displays the remainder of the value.
	public void myModulus() {
		double total = ab % cd;
		System.out.println(total);
	}

	// Method for order of operation
	public void myOrderOp() {
		int total = (ab + cd) * 23;
		System.out.println(total);
	}

	public void conversionExample() {
		short a = 5; // Widening cast | up cast | implicit cast
		int b = a;
		System.out.println(b);
		int c = 6488888; // Narrowing cast | down cast | explicit cast
		short d = (short) c;
		System.out.println(d);
	}

}
