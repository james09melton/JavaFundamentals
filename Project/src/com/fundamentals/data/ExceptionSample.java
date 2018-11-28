package com.fundamentals.data;

public class ExceptionSample {

	String type = null;

	public void myException() {
		try {
			System.out.println(type.trim());
		} catch (NullPointerException ex) {
			System.out.println("NullPointer Exception thrown " + ex.getMessage());
		} catch (Exception e) {
			System.out.println("General Exception Thrown " + e.getMessage());
		}
	}

	public void mySecondException() {
		try {
			type = "Something cool";
			System.out.println(type.toUpperCase());
		} catch (NullPointerException ex) {
			System.out.println("NullPointer Exception thrown " + ex.getMessage());
		} finally {
			System.out.println("Finally block called");
		}
	}

	public void myThirdException() {
		// String[] names = {"Matt", "Dave", "John"}; //String Array
		String[] names = { "11", "22", "33" }; // String Array
		try {
			byte b = Byte.parseByte(names[1]);
			System.out.println(b);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Please provide a value in the range " + e.getMessage());
		} catch (NumberFormatException f) {
			System.out.println("That's not a number " + f.getMessage());
		} catch (OutOfMemoryError ex) {
			System.out.println("You gave me more than a byte " + ex.getMessage());
		} catch (Exception e) {
			System.out.println("i dunno but its wrong " + e.getMessage());
		}
	}

}
