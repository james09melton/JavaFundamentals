package com.fundamentals.java;

import java.util.*;

import com.fundamentals.data.*;

/*
 public - Access Modifier
 class - File type
 WelcomeToJava - Name of class
 */
public class WelcomeToJava {

	public static final int MY_VALUE = 10;
	public static int MY_OTHER_VALUE;

	static {
		MY_OTHER_VALUE = 25;
		int total = MY_VALUE * MY_OTHER_VALUE;
		System.out.println(total);
	}

	public static void main(String[] args) {
		MY_OTHER_VALUE = 35;

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
		// accessModifierExamples();
		// Quiz();
		// inheritanceExamples();
		// myBicycle();
		// overloadExample();
		// overrideExample();
		// sampleUtility();
		// something(); // Can not run in a static method
		// quiz2();
		// mySubtraction();
		// Dinosaurs();
		// myAbstractExample();
		// myInterfaceExample();
		// arrayListExamples();
		// arrayListObjectExample();
		// hashSetExample();
		hashMapExample();
	}
	
	public static <E> void hashMapExample() {
		HashMap<Integer, String>myMap = new HashMap<Integer, String>();
		myMap.put(0, "Something");
		myMap.put(1, "Something else");
		myMap.put(2, "Something");
		myMap.put(3, "One More");
		myMap.remove(2);
		
		for(String value : myMap.values()) {
			System.out.println(value);
		}
		
		Set<E>set = (Set<E>) myMap.entrySet();
		Iterator iterate = set.iterator();
		while(iterate.hasNext()) {
			Map.Entry me = (Map.Entry)iterate.next();
			System.out.print(me.getKey()+ " : ");
			System.out.println(me.getValue());
		}
	}
	
	/*HashSet ignores duplicates and also order. If the item added is already in the collection,
	 *  it will not add it, or give any indication that it won't.*/
	public static void hashSetExample() {
		HashSet<String>myString = new HashSet<String>();
		myString.add("something");
		myString.add("something else");
		myString.add("something");
		myString.add("something else");
		for(String s : myString) {
			System.out.println(s);
		}
		Dinosaur dino = new Dinosaur("sharp");
		Dinosaur dino2 = new Dinosaur("serrated");
		Dinosaur dino3 = new Dinosaur("dull");
		HashSet<Dinosaur>myDino = new HashSet<Dinosaur>();
		myDino.add(dino);
		myDino.add(dino2);
		myDino.add(dino3);
		for(Dinosaur d : myDino) {
			System.out.println(d.getTeeth()+" "+d.getClaws());
		}
	}

	public static void arrayListObjectExample() {
		Dinosaur dino = new Dinosaur("sharp");
		Dinosaur dino2 = new Dinosaur("serrated");
		Dinosaur dino3 = new Dinosaur("dull");
		ArrayList<Dinosaur> animal = new ArrayList<Dinosaur>();
		animal.add(dino);
		animal.add(dino2);
		animal.add(dino3);
		for (Dinosaur d : animal) {
			System.out.println(d.getTeeth());
		}
		for (int i = 0; i < animal.size(); i++) {
			System.out.println(animal.get(i).getTeeth());
		}
	}

	public static void arrayListExamples() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("something");
		names.add("something else");
		names.add("something");
		names.remove(2);
		names.add("Happy");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		for (String string : names) {
			System.out.println(string);
		}
		// recommend doing it wth a generic parameter instead, like above.
		ArrayList place = new ArrayList();
		place.add(10);
		place.add("type");
	}

	public static void myInterfaceExample() {
		House myHouse = new House();
		Condo myCondo = new Condo();

		myHouse.decorate();
		myHouse.installPlumbing();
		myCondo.decorate();
		myHouse.supplementWork();
	}

	public static void myAbstractExample() {
		// Can't create an instance of an abstract class
		// Shape shape = new Shape(); // Not valid
		System.out.println(Shape.area(5, 10));
		Square square = new Square();
		System.out.println(square.draw());
		Rectangle rec = new Rectangle();
		System.out.println(rec.draw());
		rec.setLength(10);
		rec.setWidth(5);
		System.out.println(Shape.area(rec.getLength(), rec.getWidth()));

		MyOctogon mo = new MyOctogon();
	}

	public static void Dinosaurs() {
		Dinosaur myDinosaur = new Dinosaur("sharp");
		TRex myTRex = new TRex("sharp");
		Pterodactyl myPterodactyl = new Pterodactyl("sharp");

		Dinosaur.Action();
		TRex.Action();
		Pterodactyl.Action();
	}

	public static void quiz2() {
		Quiz2 q2 = new Quiz2();
		q2.publicExample();
		// q2.protectedExample();

	}

	public static void mySubtraction() {
		System.out.println(Quiz2.mySubtraction(10, 5));
	}

	public static void sampleUtility() {
		System.out.println(Utility.addSomething(5, 23));
		Utility.somethingElse();
	}

	public void something() {
	} // Will not run in a static method

	public static void overrideExample() {
		House myHouse = new House();
		Condo myCondo = new Condo();
		House myOtherHouse = new Condo(); // implicit cast
		Condo myOtherCondo = (Condo) new House(); // explicit cast
		myHouse.openDoor();
		myCondo.openDoor();
		myOtherHouse.openDoor();
	}

	public static void overloadExample() {
		Apple myApple = new Apple();
		myApple.display("Granny Smiths", 5);
		myApple.display("Sour", 3, "Red");
		// String show = myApple.display("Granny Smiths", "Green");
		System.out.println(myApple.display("Granny Smiths", "Green"));

		System.out.println(Apple.SOUR_SCALE);
		System.out.println(myApple.SOUR_SCALE);
		System.out.println(Apple.SWEET_SCALE);
		Apple.SWEET_SCALE = 25;
	}

	public static void inheritanceExamples() {
		House house = new House();
		Condo condo = new Condo();
		condo.setDoors("Red Door");
		System.out.println(condo.getDoors());
		house.setDoors("Purple Door");
		System.out.println(house.getDoors());
	}

	public static void Quiz() {
		Quiz jq = new Quiz();
		// jq.partOne();
		// jq.grade('0');
		// jq.divByThr();
		// jq.evenNumbers();
		jq.oddNumbers();
	}

	public static void accessModifierExamples() {
		PrimitiveExamples pe = new PrimitiveExamples();
		// Apple myApple = new Apple();
		pe.myProtectedMethod();
	}

	public static void myJaggedArray() {
		int[][] anArray = new int[3][5];

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
		for (int i = 0; i < anArray.length; i++) {
			for (int j = 0; j < anArray[i].length; j++) {
				System.out.println(anArray[i][j]);
			}
		}
	}

	public static void myTwoDimensionArray() {
		int[][] anArray = new int[3][3];

		anArray[0][0] = 6;
		anArray[0][1] = 8;
		anArray[0][2] = 10;
		anArray[1][0] = 12;
		anArray[1][1] = 14;
		anArray[1][2] = 16;
		anArray[2][0] = 18;
		anArray[2][1] = 20;
		anArray[2][2] = 22;
		// System.out.println(anArray.length);
		for (int i = 0; i < anArray.length; i++) {
			for (int j = 0; j < anArray.length; j++) {
				System.out.println(anArray[i][j]);
			}
		}
	}

	public static void sampleArray() {
		String[] myStringArray = { "happy", "monday", "java" };
		int[] myIntArray = new int[3];
		myIntArray[0] = 5;
		myIntArray[1] = 17;
		myIntArray[2] = 10;

		int[] mySecondIntArray = myIntArray.clone();

		for (int i = 0; i < myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}
		for (int i = 0; i < mySecondIntArray.length; i++) {
			System.out.println(mySecondIntArray[i]);
		}

		int j = 0;
		while (j < myStringArray.length) {
			System.out.println(myStringArray[j]);
			j++;
		}
	}

	public static void myBicycle() {
		Bicycle bicycle = new Bicycle();
		MotorizedBicycle motorizedBicycle = new MotorizedBicycle();
		// bicycle.pedalling();
		motorizedBicycle.pedalling();
	}

	public static void myHouse() {
		House myHouse = new House();
		// myHouse.doors = "Red Doors";
		myHouse.setDoors("Red Doors");

		House mySecondHome = new House();
		// mySecondHome.doors = "Purple Doors";
		mySecondHome.setDoors("Purple Doors");

		House myThirdHome = myHouse;
		myHouse = mySecondHome;

		House[] houseArray = new House[] { myHouse, mySecondHome, myThirdHome };

		System.out.println(myHouse.getDoors());
		System.out.println(mySecondHome.getDoors());
		System.out.println(myThirdHome.getDoors());

		int i = 0;
		do {
			System.out.println(houseArray[i].getDoors());
			i++;
		} while (i < houseArray.length);
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
