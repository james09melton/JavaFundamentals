package com.fundamentals.data;

public class Quiz {

	public void partOne() {
		int value = 1;
		do {
			System.out.println(value);
			value ++;
			value ++;
		} while( value <100);
	}
	
	public void grade(char value) {
		String gra = "";
		switch(value) {
		case 'E':
			gra = "Excellent";
			break;
		case 'V':
			gra = "Very Good";
			break;
		case 'G':
			gra = "Good";
			break;
		case 'A':
			gra = "Average";
			break;
		case 'F':
			gra = "Fail";
			break;
		default:
			gra = "not a valid grade";
			break;
		}
		System.out.println(gra);
	}
	
	
	public void divByThr() {
		for(int i = 0; i < 30; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
	
	public void evenNumbers () {
		for(int i = 0; i < 100; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public void oddNumbers () {
		for(int i = 0; i < 100; i++) {
			if(i%2==0) {
				if(i==0) {
				continue;
				}
				System.out.println(i-1);
			}
		}
	}
}