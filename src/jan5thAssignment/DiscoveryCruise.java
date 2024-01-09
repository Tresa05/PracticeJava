package jan5thAssignment;

import java.util.Scanner;

public class DiscoveryCruise extends Cruise {

	private boolean preBookAdventureGames;

	public DiscoveryCruise() {
		super(4, "DiscoveryCruise", 39.99, 9.99);
		this.preBookAdventureGames = optionForAdventureGames();
		if (preBookAdventureGames) {
			// Additional charge for pre-booking adventure games
			adultRate += 50;
			childRate += 50;
		} else {
			System.out.println(" Adventure games not included. Enjoy your Discovery Cruise!");
		}
	}

	private boolean optionForAdventureGames() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to pre-book adventure games for the Discovery Cruise? (Yes/No)");
		String userResponse = sc.next();
	
		if (userResponse.equalsIgnoreCase("Yes")) {
			System.out.println("Adventure games pre-booked. An additional charge of $50 per person has been applied.");
			return true;
		} 
		else {
			return false;
		}
	}

}
