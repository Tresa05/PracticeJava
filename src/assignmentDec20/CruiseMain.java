package assignmentDec20;

import java.util.Scanner;

public class CruiseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			// Taking user input for cruise selection
			System.out.println(
					"We offfer 4 different packages as displayed below. Please enter the cruise that you want to select:");
			System.out.println("1. Scenic Cruise");
			System.out.println("2. Sunset Cruise");
			System.out.println("3. Discovery Cruise");
			System.out.println("4. Mystery Cruise");
			int cruiseChoice = scanner.nextInt();

			// Creating instances for the selected cruise
			CruiseCompany selectedCruise = null;

			// Selecting the appropriate cruise based on user choice
			switch (cruiseChoice) {
			case 1:
				selectedCruise = new ScenicCruise("ScenicCruise", 43.99, 12.99, 3);

				System.out.println("The Cruise that you have slected is Scenic Cruise which is a 3 day cruise");

				break;
			case 2:
				selectedCruise = new SunsetCruise("SunsetCruise", 52.99, 15.99, 1);
				System.out.println("The Cruise that you have slected is SunsetCruise which is a 1 day cruise");

				break;
			case 3:
				selectedCruise = new DiscoveryCruise("DiscoveryCruise", 39.99, 9.99, 4);
				System.out.println("The Cruise that you have slected is DiscoveryCruise which is a 4 day cruise");

				break;
			case 4:
				selectedCruise = new MysteryCruise("MysterCruise", 45.99, 12.99, 2);
				System.out.println("The Cruise that you have slected is MysteryCruise which is a 2 day cruise");

				break;

			default:
				System.out.println("Invalid choice.");
				System.exit(0);
			}

			// Taking user input for the number of members
			System.out.println("Enter the number of adults (>12):");
			int numOfAdults = scanner.nextInt();
			System.out.println("Enter the number of children (>5):");
			int numOfChildren = scanner.nextInt();
			System.out.println("Do you want meals on the cruise? (1 for Yes, 0 for No):");
			int mealsChoice = scanner.nextInt();
			double totalCost = 0;

			if (mealsChoice == 1) {
				totalCost = selectedCruise.CostWithMeal(numOfAdults, numOfChildren);
			} else {
				totalCost = selectedCruise.cruiseCost(numOfAdults, numOfChildren);
			}

			double tax = selectedCruise.calculateTax(totalCost);
			// Displaying the final bill
			selectedCruise.displayBill(totalCost, tax);
			scanner.close();

		}

	}
}
