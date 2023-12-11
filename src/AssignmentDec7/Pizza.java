package AssignmentDec7;

import java.util.Scanner;

public class Pizza {

	int[] price = { 15, 20, 25 }; // initializing
	String size;

	boolean addPepperoni;
	boolean addExtraCheese;

	void calculateprice() {
		int pizzaPrice = 0;
		// Switch statement to determine the base price based on the pizza size

	switch (size) {
		case ("small"):
			pizzaPrice = price[0];
			//break; 
		case ("medium"):
			pizzaPrice = price[1];
			//break;
		case ("large"):
			pizzaPrice = price[2];
			//break;
		}

		if (addPepperoni) {

			if (size.equalsIgnoreCase("small")) {
				pizzaPrice += 2;
			} else {
				pizzaPrice += 3; // for medium & large
			}
		}

		// If the pizza order  has extra cheese, add the additional price to the base price
		if (addExtraCheese) {
			pizzaPrice += 1;
		}

		// Display the the bill to user
		System.out.println("Your total bill is $" + pizzaPrice);
	}

	// Method to get pizza order details from the user
	void userOrder() {
		Scanner scanner = new Scanner(System.in);

		// Loop to get a valid pizza size from the user
		while (true) {
			System.out.println("Enter the pizza size (Small, Medium, Large): ");
			size = scanner.next();
			if (size.equalsIgnoreCase("Small") || size.equalsIgnoreCase("Medium") || size.equalsIgnoreCase("Large")) {
				break;
			} else {
				System.out.println("Invalid Size .");
			}
		}
		// Loop for the option add pepperoni
		while (true) {
			System.out.println("Do you want additional pepperoni topping? (yes/no): ");
			String input = scanner.next();
			if (input.equalsIgnoreCase("yes")) {
				addPepperoni = true;
				break;
			} else if (input.equalsIgnoreCase("no")) {
				addPepperoni = false;
				break;
			} else {
				System.out.println("Invalid input. Please enter 'yes' or 'no'.");
			}
		}

		// Loop for the option add extra cheese
		while (true) {
			System.out.println("Do you want extra cheese? (yes/no): ");
			String input = scanner.next();
			if (input.equalsIgnoreCase("yes")) {
				addExtraCheese = true;
				break;
			} else if (input.equalsIgnoreCase("no")) {
				addExtraCheese = false;
				break;
			} else {
				System.out.println("Invalid input. Please enter 'yes' or 'no'.");
			}
		}

		scanner.close();

	}
}
