package com.fundamentals.java;

public class AssignmentExample {
	int value = 20, value2 = 12;
	
	public void plusEqualsExample() {
		int total = 5;
		total += value; // same as total = total + value
		System.out.println(total);
	}
	
	public void minusEqualsExample() {
		int total = 32;
		total -= value2; // same as total = total - value
		System.out.println(total);
	}
	
	public void multiplyEqualsExample() {
		int total = 7;
		total *= value; // same as total = total * value
		System.out.println(total);
	}
	
	public void divisionEqualsExample() {
		int total = 60;
		total /= value; // same as total = total / value
		System.out.println(total);
	}
	
	public void modulusEqualsExample() {
		int total = 50;
		total %= value2; // same as total = total % value
		System.out.println(total);
	}
	
	public void leftShiftEqualsExample() {
		int total = 5;
		total <<= value; // same as total = total <<= value
		System.out.println(total);
	}
	
	public void rightShiftEqualsExample() {
		int total = 5;
		total >>= value; // same as total = total >>= value
		System.out.println(total);
	}
	
	public void bitwiseAndEqualsExample() {
		int total = 10;
		total &= value; // same as total = total &= value
		System.out.println(total);
	}
	
	public void bitwiseOrEqualsExample() {
		int total = 10;
		total ^= value; // same as total = total ^= value
		System.out.println(total);
	}
}
