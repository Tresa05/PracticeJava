package assignmentDec20;

public class SunsetCruise extends CruiseCompany {

	public SunsetCruise() {
		super("SunsetCruise", 52.99, 15.99, 1);

	}

	@Override
	public void displayCruiseDetails() {
		System.out.println("Special feature: Includes Whale watching & Night carnival ");
		System.out.println(
				"Price For Adults (greater than 12)    : 52.99 per day\nPrice For Children (above 5)    : 15.99 per day");
		System.out.println(
				"Buffet Special Price:/n Adults (greater than 12) : 20.99 per day /nChildren (above 5) : 4.99");
	}

}
