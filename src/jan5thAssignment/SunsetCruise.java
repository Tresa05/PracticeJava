package jan5thAssignment;

import java.util.Scanner;

public class SunsetCruise extends Cruise {
	private String cruiseName;
	protected double adultRate;
	public double childRate;
	private boolean preBookDinner;

	public SunsetCruise() {
		super(1, "SunsetCruise", 52.99, 15.99);
		this.preBookDinner = optionForDinner();

		if (preBookDinner) {
			adultRate += 45;
			childRate += 45;
		} else {
			System.out.println("Dinner not included. Enjoy your Sunset Cruise!");
		}
	}

	private boolean optionForDinner() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to pre-book candle light dinner for the Sunset Cruise? (Yes/No)");
		String userResponse = sc.next();

		if (userResponse.equalsIgnoreCase("Yes")) {
			System.out.println(
					"Candle Light Dinner pre-booked. An additional charge of $45 per person has been applied.");
			return true;
		} else {
			return false;
		}
	}

}
