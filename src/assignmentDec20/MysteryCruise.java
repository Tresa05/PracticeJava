package assignmentDec20;

public class MysteryCruise extends CruiseCompany {

	public MysteryCruise() {
		super("MysteryCruise", 45.99, 12.99, 2);

	}

	@Override
	public void displayCruiseDetails() {
		System.out.println("Special feature: Includes Mystery Escape Room Events ");
		System.out.println(
				"Price For Adults (greater than 12)    : 45.99 per day\nPrice For Children (above 5)    : 12.99 per day");
		System.out.println(
				"Buffet Special Price:/n Adults (greater than 12) : 20.99 per day /nChildren (above 5) : 4.99");
	}

}
