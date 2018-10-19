package com.fundamentals.java;

public class LoopingExamples {

	public void myWhileLoop() {
		int value = 0;
		while(value < 10) {
			System.out.println(value);
			value ++;
		} // End of while loop
	} // End of method
	
	public void myDoWhileLoop() {
		int value = 0;
		do {
			System.out.println(value);
			value ++;
		} while( value <10);
		
	} // End of method
	
	public void myForloop() {
		for(int i = 0; i<10; i++) {
			System.out.println(i);
		} // End of for loop
	} // End of method
	
	public void myBranchExample() {
		for(int i = 0; i<10; i++) {
			if(i == 2) {
				continue;
			} // End of if
			if(i == 4) {
				System.out.println("The if statement breaks");
				break;
			} // End of if
			System.out.println(i);
		} // End of for
		System.out.println("Loop Ends");
	} // End of method
	
} // End of class
