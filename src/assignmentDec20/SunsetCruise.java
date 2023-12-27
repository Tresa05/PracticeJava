package assignmentDec20;

public class SunsetCruise extends CruiseCompany {

	public SunsetCruise(String cruiseName, double adultRate, double childRate, int numOfDays) {
		super("SunsetCruise", 52.99, 15.99, 1);

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
