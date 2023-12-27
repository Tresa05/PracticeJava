package assignmentDec20;

public class CruiseCompany {

	private String cruiseName;
	private int numOfDays;
	private double adultRate;
	private double childRate;
	public int numOfAdults;
	public int numOfKids;

	public CruiseCompany(String cruiseName, double adultRate, double childRate, int numOfDays) {

		this.cruiseName = cruiseName;
		this.adultRate = adultRate;
		this.childRate = childRate;
		this.numOfDays = numOfDays;

	}

	// Method to calculate the cruise cost

	public double cruiseCost(int numOfAdults, int numOfChildren) {
		double totalCost = (numOfAdults * adultRate + numOfChildren * childRate) * numOfDays;
		return totalCost;
	}

	// Method to calculate meal cost

	public double CostWithMeal(int numOfAdults, int numOfChildren) {
		double mealCost = (numOfAdults * 20.99 + numOfKids * 4.99) * numOfDays;
		return cruiseCost(numOfAdults, numOfChildren) + mealCost;
	}

}
