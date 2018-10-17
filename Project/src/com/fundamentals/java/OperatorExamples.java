package com.fundamentals.java;

public class OperatorExamples {

	int numValue1 = 25, numValue2 = 43;
	
	//Method increments the value by 1; same as numValue = numValue + 1;
	public void incrementExample() {
		numValue1++;
		
		System.out.println(numValue1);
		
		int value = ++numValue1;
		System.out.println(value);
	}
	
	//Method decrements the value by 1; same as numValue = numValue - 1;
	public void decrementExample() {
		numValue1--;
		
		System.out.println(numValue1);
		
		int value = --numValue1;
		System.out.println(value);
	}
	
	public void equalsExample() {
		String a = "happy", b = "happy", c = new String("happy");
		
		System.out.println(a.equals(b));
		System.out.println(a == c);
		System.out.println(a.equals(c));
	}
	
	public void equalsExample2() {
		int val1 = 10, val2 = 10;
		double val3 = 10.1;
		System.out.println(val1 == val2);
		System.out.println(val2 == val3);
	}
	
	// logical operator compares two expressions using And / Or
	// And means both expressions must be true
	// Or means the first expression must be true otherwise the second is checked
	// If the second one is also false, the whole statement is false.
	public void logicalExample() {
		int val = 15, val2 = 25, val3 = 16, val4 = 25;
		System.out.println(val == val3 && val2 == val4);
		System.out.println(val == val3 || val2 == val4);
		System.out.println(! (val2 == val4));
		System.out.println(val != val2);
	}
}
