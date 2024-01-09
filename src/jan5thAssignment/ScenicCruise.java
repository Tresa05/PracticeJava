package jan5thAssignment;

import java.util.Scanner;

public class ScenicCruise extends Cruise {
	private String cruiseName;
	protected double adultRate;
	public double childRate;
    private boolean preBookSpa;

	public ScenicCruise() {
		super(3, "ScenicCruise", 43.99, 12.99);
		this.preBookSpa = optionForSpa();

		if (preBookSpa) {
			adultRate += 50;
			childRate += 50;
		} else {
			System.out.println("Spa Not included");
		}
	}

	private boolean optionForSpa() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to pre-book the spa for the Scenic Cruise? (Yes/No)");
		String userResponse = sc.next();

		if (userResponse.equalsIgnoreCase("Yes")) {
			System.out.println("Spa pre-booked. An additional charge of $50 per person has been applied.");
			return true;
		} else {
			return false;

		}
	}
}
