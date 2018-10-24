package com.fundamentals.java;

import java.util.Scanner;
import com.fundamentals.data.*;
/*
 public - Access Modifier
 class - File type
 WelcomeToJava - Name of class
 */
public class WelcomeToJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// someMethod();
		// stringExamples();
		// moreStringExamples();
		// dataTypeExamples();
		// scannerExample();
		// myOperatorExample();
		// myAssignmentExample();
		// myDecisionExample();
		// mySongExamples();
		// myHouse();
		// sampleArray();
		// myTwoDimensionArray();
		// myJaggedArray();
		accessModifierExamples();
	}
	
	public static void accessModifierExamples() {
		PrimitiveExamples pe = new PrimitiveExamples();
		Apple myApple = new Apple();
		pe.myProtectedMethod();
	}
	
	public static void myJaggedArray() {
int [][] anArray = new int[3][5];
		
		anArray[0][0] = 6;
		anArray[0][1] = 8;
		anArray[0][2] = 10;
		anArray[0][3] = 11;
		anArray[0][4] = 13;
		anArray[1][0] = 12;
		anArray[1][1] = 14;
		anArray[1][2] = 16;
		anArray[1][3] = 17;
		anArray[1][4] = 19;
		anArray[2][0] = 18;
		anArray[2][1] = 20;
		anArray[2][2] = 22;
		anArray[2][3] = 21;
		anArray[2][4] = 23;
		System.out.println(anArray[0].length);
		for(int i = 0; i< anArray.length; i++) {
			for(int j = 0; j< anArray[i].length; j++) {
				System.out.println(anArray[i][j]);	
			}
		}
	}
	
	public static void myTwoDimensionArray() {
		int [][] anArray = new int[3][3];
		
		anArray[0][0] = 6;
		anArray[0][1] = 8;
		anArray[0][2] = 10;
		anArray[1][0] = 12;
		anArray[1][1] = 14;
		anArray[1][2] = 16;
		anArray[2][0] = 18;
		anArray[2][1] = 20;
		anArray[2][2] = 22;
		//System.out.println(anArray.length);
		for(int i = 0; i< anArray.length; i++) {
			for(int j = 0; j< anArray.length; j++) {
				System.out.println(anArray[i][j]);	
			}
		}
	}
	
	public static void sampleArray() {
		String[] myStringArray = {"happy", "monday", "java"};
		int[] myIntArray = new int[3];
		myIntArray[0] = 5;
		myIntArray[1] = 17;
		myIntArray[2] = 10;
		
		int[] mySecondIntArray = myIntArray.clone();
		
		
		for(int i = 0; i < myIntArray.length; i ++) {
			System.out.println(myIntArray[i]);
		}
		for(int i = 0; i< mySecondIntArray.length; i++) {
			System.out.println(mySecondIntArray[i]);
		}
		
		int j = 0;
		while(j < myStringArray.length) {
			System.out.println(myStringArray[j]);
			j ++;
		}
	}
	
	public static void myBicycle() {
		Bicycle myBicycle = new Bicycle();
	}
	
	public static void myHouse() {
		House myHouse = new House();
		myHouse.doors = "Red Doors";
		
		House mySecondHome = new House();
		mySecondHome.doors = "Purple Doors";
		
		House myThirdHome = myHouse;
		myHouse = mySecondHome;
		
		House[] houseArray = new House[] { myHouse, mySecondHome, myThirdHome};
		
		//System.out.println(myHouse.doors);
		//System.out.println(mySecondHome.doors);
		//System.out.println(myThirdHome.doors);
		
		int i = 0;
		do {
			System.out.println(houseArray[i].doors);
			i++;
		} while(i < houseArray.length);
	}
	
	public static void mySongExamples() {
		SongExamples se = new SongExamples();
		String beer = se.bottlesOfBeer();
		System.out.println(beer);
	}
	
	public static void myDecisionExample() {
		DecisionExamples de = new DecisionExamples();
		de.basicIfStatement();
		de.chainIfStatement();
		de.switchExample(3);
		
		LoopingExamples le = new LoopingExamples();
		le.myWhileLoop();
		le.myDoWhileLoop();
		le.myForloop();
		le.myBranchExample();
	}
	
	public static void myAssignmentExample() {
		AssignmentExample ae = new AssignmentExample();
		ae.plusEqualsExample();
		ae.minusEqualsExample();
		ae.multiplyEqualsExample();
		ae.divisionEqualsExample();
		ae.modulusEqualsExample();
		ae.leftShiftEqualsExample();
		ae.rightShiftEqualsExample();
		ae.bitwiseAndEqualsExample();
		ae.bitwiseOrEqualsExample();
	}
	
	public static void myOperatorExample() {
		OperatorExamples oe = new OperatorExamples();
		oe.incrementExample();
		oe.decrementExample();
		oe.equalsExample();
		oe.equalsExample2();
		oe.logicalExample();
	}

	// My first method
	public static void someMethod() {
		System.out.println("Welcome To Java");
	}

	public static void stringExamples() {
		// String = Type | str1 = variable name | Welcome = string literal
		String str1 = "Welcome";
		String str2 = new String("Java");
		System.out.println(str2);
		// charAt method returns a single character at a certain position
		char j = str1.charAt(2); // index is zero based
		System.out.println(j);
		// concat method joins two strings together, called Concatenation
		String name = str2.concat(" is cool");
		System.out.println(name);
		// equals method will check to see if an object equals the string variable
		boolean isMyString = str1.equals(str2); // is str2 = str1?
		System.out.println(isMyString);
		// toLowerCase method will make the variable with lower case letters
		String myString = str1.toLowerCase();
		System.out.println(myString);
		// toUpperCase method will make the variable with upper case letters
		String mySecondString = str2.toUpperCase();
		System.out.println(mySecondString);
	}

	public static void moreStringExamples() {
		String myString = "My Java String";
		// Are these equal?
		boolean isTheSame = myString.toLowerCase().equals("my java string");
		System.out.println(isTheSame);
		// my string is capitalized then added to " is so capitalized"
		String name = myString.toUpperCase().concat(" is so capitalized");
		System.out.println(name);
		// equalsIgnoreCase does not check if it has capitalization. It is ignored
		boolean testString = myString.equalsIgnoreCase("My java string");
		System.out.println(testString);
		// contains method. checks to see if it matches part of the variable
		boolean isContained = myString.contains("ava");
		System.out.println(isContained);
	}

	public static void dataTypeExamples() {
		PrimitiveExamples pe = new PrimitiveExamples();
		pe.myFirstPrimitiveMethod();
		pe.myAddition();
		pe.mySubtraction();
		pe.myMultiplication();
		pe.myDivision();
		pe.myModulus();
		pe.myOrderOp();
	}

	// Example of the use of Scanner
	public static void scannerExample() {
		int x, y, z;
		System.out.println("Enter two integers to calculate their sum");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		System.out.println("Sum of entered integers = " + z);
		in.close();
	}
}
