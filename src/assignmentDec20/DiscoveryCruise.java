package assignmentDec20;

public class DiscoveryCruise extends CruiseCompany {

	public DiscoveryCruise() {
		super("DiscoveryCruise", 39.99, 9.99, 4);

	}

	@Override
	public void displayCruiseDetails() {
		System.out.println("Special feature: Discovering the Royal carribean");
		System.out.println(
				"Price For Adults (greater than 12)    : 39.99 per day\nPrice For Children (above 5)    : 9.99 per day");
		System.out.println(
				"Buffet Special Price:/n Adults (greater than 12) : 20.99 per day /nChildren (above 5) : 4.99");
	}

}
