package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) throws Exception {
		// entrypoint of the app
		System.out.println("Welcome to starbucks.");
		
		// we want to ask the user what type of coffee they want
			// input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select a choice:");
		System.out.println("1. Black Coffee");
		System.out.println("2. House Blend");
		System.out.println("3. Mocha with Whip");
		
		int choice = scanner.nextInt();
		
		Drink myDrink = null;
		
		switch (choice) {
		case 1:
			myDrink = new Coffee();
			break;
		case 2:
			myDrink = new HouseBlend();
			break;
		case 3:
			myDrink = new Mocha(new Whip(new Coffee()));
			break;
		case 4:
			myDrink = new Mocha(new Mocha(new Whip(new Whip(new HouseBlend()))));
			break;
		default:
			myDrink = null;
			break;
		}
		
		myDrink = new Whip(myDrink);
		
		System.out.println("You owe: " + myDrink.getCost());
		System.out.println("You ordered a " + myDrink.getDescription());
	}

}
