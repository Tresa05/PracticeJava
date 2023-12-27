package assignmentDec20;

public class CruiseCompany {

	private String cruiseName;
	protected int numOfDays;
	protected double adultRate;
	public double childRate;
	public int numOfAdults;
	public int numOfKids;

	public CruiseCompany(String cruiseName, double adultRate, double childRate, int numOfDays) {
		this.cruiseName = cruiseName;
		this.adultRate = adultRate;
		this.childRate = childRate;
		this.numOfDays = numOfDays;
	}

	// Getter method for cruise name
	public String getCruiseName() {
		return cruiseName;
	}

	// Getter method for adult rate
	public double getAdultRate() {
		return adultRate;
	}

	// Getter method for child rate
	public double getChildRate() {
		return childRate;
	}

	// Getter method for number of days
	public int getNumOfDays() {
		return numOfDays;
	}
	// Method to calculate the cruise cost

	public double cruiseCost(int numOfAdults, int numOfChildren) {
		double Cost = (numOfAdults * adultRate + numOfChildren * childRate) * numOfDays;
		return Cost;
	}

	// Method to calculate meal cost

	public double CostWithMeal(int numOfAdults, int numOfChildren) {
		double mealCost = (numOfAdults * 20.99 + numOfKids * 4.99) * numOfDays;
		return (cruiseCost(numOfAdults, numOfChildren) + mealCost);
	}

	public double calculateTax(double totalCost) {
		// TODO Auto-generated method stub
		return 0.15 * totalCost;
	}

	public void displayBill(double totalCost, double tax) {
		double finalBill = totalCost + tax;
		System.out.println("Your Package includes: ");
		System.out.println("Cruise Name: " + cruiseName);
		System.out.println("Number of Days: " + numOfDays);
		System.out.println("Total Price: $" + totalCost);
		System.out.println("HST @ (15%): $" + tax);
		System.out.println("Final Bill Amount: $" + finalBill);

	}

}
