package jan5thAssignment;

import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User("tresa.1", "Password1", "Tresa", "4569228567");
		user.register();
		while (true) {
			System.out.println("Please enter the service you want to book (Hotel  / Cruise):");
			String serviceChoice = sc.nextLine();

			if ("Hotel ".equalsIgnoreCase(serviceChoice)) {
				System.out.println("Please enter the number of adults:");
				int numAdults = sc.nextInt();
				System.out.println("Please enter the number of children:");
				int numChildren = sc.nextInt();

				if ((numAdults == 2 && numChildren == 2) || (numAdults == 4 && numChildren == 4)) {
					System.out.println(
							"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child?");
					String addLunch = sc.next();

					System.out.println("Enter the number of days of stay:");
					int noOfDays = sc.nextInt();

					Hotel hotelBooking = new Hotel(noOfDays, numAdults, numChildren);
					hotelBooking.calculateTotalPrice();

				} else if ("Cruise".equalsIgnoreCase(serviceChoice)) {
					System.out.println(
							"WELCOME !\n We offfer 4 different packages as displayed below. Please enter the cruise number (1-4)that you want to select:");
					System.out.println("Cruise Options:");
					System.out.println("1. Scenic Cruise");
					System.out.println("2. Sunset Cruise");
					System.out.println("3. Discovery Cruise");
					System.out.println("4. Mystery Cruise");
					int cruiseChoice = sc.nextInt();

					// User input for the number of adults and children
					System.out.print("Enter the number of adults (>12): ");
					int numAdults1 = sc.nextInt();
					while (numAdults1 == 0) {
						System.out.println(" Sorry , No Bookings can be made with 0 passengers");
						System.out.print("Enter the number of adults (>12): ");
						numAdults1 = sc.nextInt();
					}

					System.out.print("Enter the number of children (>5): ");
					int numChildren1 = sc.nextInt();

					// Create the selected cruise object
					Cruise cruiseSelected = null;
					// Selecting the appropriate cruise based on user choice
					switch (cruiseChoice) {
					case 1:
						cruiseSelected = new ScenicCruise();

						System.out.println("The Cruise that you have slected is Scenic Cruise which is a 3 day cruise");

						break;
					case 2:
						cruiseSelected = new SunsetCruise();
						System.out.println("The Cruise that you have slected is SunsetCruise which is a 1 day cruise");

						break;
					case 3:
						cruiseSelected = new DiscoveryCruise();
						System.out
								.println("The Cruise that you have slected is DiscoveryCruise which is a 4 day cruise");

						break;
					case 4:
						cruiseSelected = new MysteryCruise();
						System.out.println("The Cruise that you have slected is MysteryCruise which is a 2 day cruise");

						break;

					default:
						System.out.println("Invalid choice.");
						System.exit(0);
					}

				cruiseSelected.displayCruiseDetails();

					// Get user input for meals
					System.out.print("Do you want meals on the cruise? (1 for Yes, 0 for No): ");
					int mealsChoice = sc.nextInt();

					

				}
			} else {
				System.out.println("Invalid choice. Please enter Hotel Stay or Cruise.");
			}

			System.out.println("Do you want to book another Hotel Room or Cruise? (Yes/No)");
			String anotherBooking = sc.nextLine();

			if (!"Yes".equalsIgnoreCase(anotherBooking)) {
				break;
			}
		}

		System.out.println("Thank you for using the Cruise and Hotel Booking System!");
	}
}
