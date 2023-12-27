package assignmentDec20;

public class DiscoveryCruise extends CruiseCompany {

	public DiscoveryCruise(String cruiseName, double adultRate, double childRate, int numOfDays) {
		super("DiscoveryCruise", 39.99, 9.99, 4);

	}

	// Method to calculate the cruise cost
	@Override
	public double cruiseCost(int numOfAdults, int numOfChildren) {
		double Cost = (numOfAdults * adultRate + numOfChildren * getChildRate()) * numOfDays;
		return Cost;
	}

	// Method to calculate meal cost
	@Override
	public double CostWithMeal(int numOfAdults, int numOfChildren) {
		double mealCost = (numOfAdults * 20.99 + numOfKids * 4.99) * numOfDays;
		return cruiseCost(numOfAdults, numOfChildren) + mealCost;
	}

}
