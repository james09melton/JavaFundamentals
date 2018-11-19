package com.fundamentals.data;

public class Dinosaur {

	private String teeth;
	private String claws;
	
	public void setTeeth(String value) {
		this.teeth = value;
	}
	
	 public String getTeeth() {
		 return teeth;
	 }

	public void setClaws(String value) {
			this.claws = value;
	}

	 public String getClaws() {
		 return claws;
	 }
	 
	 public static void Action() {
		 System.out.println("Roar");
	 }
	 
	 public Dinosaur(String teeth) {
		 this.teeth = teeth;
		 this.claws = "rough";
	 }
}
