package com.fundamentals.data;

import com.fundamentals.java.WelcomeToJava;

public class Quiz2 extends WelcomeToJava {

	static int ab = 10, cd = 5;
	
	public void publicExample() {
		System.out.println("This is my public example");
	}
	
	protected void protectedExample() {
		System.out.println("This is my protected example");
	}
	
	void defaultExample() {
		System.out.println("This is my default example");
	}
		
	private void privateExample() {
		System.out.println("This is my private example");
	}
	

	
	
	public static int mySubtraction(int value1, int value2) {
		return value1 - value2;
		
	}
}
