package assignmentDec20;

public class MysteryCruise extends CruiseCompany {

	private String cruiseName;
	private int numOfDays;
	private double adultRate;
	private double childRate;

	public MysteryCruise(String cruiseName, double adultRate, double childRate, int numOfDays) {
		super("MysteryCruise", 45.99, 12.99, 2);

	}

	// Method to calculate the cruise cost
	@Override
	public double cruiseCost(int numOfAdults, int numOfChildren) {
		double totalCost = (numOfAdults * adultRate + numOfChildren * childRate) * numOfDays;
		return totalCost;
	}

	// Method to calculate meal cost
	@Override
	public double CostWithMeal(int numOfAdults, int numOfChildren) {
		double mealCost = (numOfAdults * 20.99 + numOfKids * 4.99) * numOfDays;
		return cruiseCost(numOfAdults, numOfChildren) + mealCost;
	}

}
