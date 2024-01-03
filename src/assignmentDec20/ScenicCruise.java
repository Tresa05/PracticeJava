package assignmentDec20;

public class ScenicCruise extends CruiseCompany {
// Constructor for ScenicCruise, calling the constructor of the parent class (CruiseCompany) with parameters.
	public ScenicCruise() {
		super("ScenicCruise", 43.99, 12.99, 3);
	}

	@Override
	public void displayCruiseDetails() {
		System.out.println("Special feature: Includes Whale watching");
		System.out.println(
				"Price For Adults (greater than 12)    : 43.99 per day \n Price For Children (above 5)    : 12.99 per day");
		System.out.println(
				"Buffet Special Price:\n Adults (greater than 12) : 20.99 per day \n Children (above 5) : 4.99");
	}
}
