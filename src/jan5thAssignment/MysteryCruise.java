package jan5thAssignment;

import java.util.Scanner;

public class MysteryCruise extends Cruise {
	private String cruiseName;
	protected double adultRate;
	public double childRate;


	private boolean preBookCasino;

	public MysteryCruise() {
		super(2, "MysteryCruise", 45.99, 12.99);
		this.preBookCasino = optionForCasino();

		if (preBookCasino) {
			adultRate += 20;
			childRate += 20;
		} else {
			System.out.println("Casino not selected. Enjoy your Mystery Cruise!");
		}
	}

	private boolean optionForCasino() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to pre-book the casino for the Mystery Cruise? (Yes/No)");
		String userResponse = sc.next();

		if (userResponse.equalsIgnoreCase("Yes")) {
			System.out.println("Casino pre-booked. An additional charge of $20 per person has been applied.");
			return true;
		} else {
			return false;
		}
	}

}
