package com.fundamentals.java;

public class DecisionExamples {

	public void basicIfStatement() {
		int value = 10, value2 = 15;
		
		if(value >= 11) {
			System.out.println("The if was true");
		} else {
			System.out.println("The else was false");
		} // End of else
	} // End of method
	
	public void chainIfStatement() {
		int value = 5, value2 = 10;
		
		if(value == 6) {
			System.out.println("The value was 6");
		}
		if(value2 < 10) {
			System.out.println("The value is less than 10");
		}else if(value > 4 && value2 < 15) {
			System.out.println("Both values are true");
		}else {
			System.out.println("Nothing was true");
		} // End of else
	} // End of method
	
	public void switchExample(int value) {
		String day;
		switch(value) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Wednesday";
			break;
		case 3:
			day = "Friday";
			break;
		case 4:;
		case 5:
		case 6:
			day = "Not my class day";
			break;
		default: 
			day = "Not a valid day";
			break;
		} // End of switch
		System.out.println(day);
	} // End of method
	
	
	
} // End of class
