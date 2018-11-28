package com.fundamentals.data;

public class HolidayDinner {

	public void letsEat() {
		Dinner[] d1 = Dinner.values();
		for (Dinner myDinner : d1) {
			System.out.println(myDinner + " at index " + myDinner.ordinal());
		}
	}

	public void letsChoose(Dinner type) {
		switch (type) {
		case Turkey:
			System.out.println("Love me some Turkey");
			break;
		case Ham:
			System.out.println("I'll take a piece of Ham");
			break;
		case MacCheese:
			System.out.println("More Mac n Cheese Please");
			break;
		default:
			System.out.println("I'm Stuffed");
			break;
		}
	}

}
