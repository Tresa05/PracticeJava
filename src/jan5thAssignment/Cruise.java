package jan5thAssignment;

public class Cruise extends MyBookings {
	private String cruiseName;
	protected double adultRate;
	public double childRate;



public Cruise(int noOfDays,String cruiseName, double adultRate, double childRate) {
		super(noOfDays);
		this.cruiseName = cruiseName;
		this.adultRate = adultRate;
		this.childRate = childRate;
		
	}

	//getter methods

		public String getCruiseName() {
			return cruiseName;
		}

		public int getnumOfdays() {
			return noOfDays;
		}

		public double getadultRate() {
			return adultRate;
		}

		public double getchildrate() {
			return childRate;
		}


	@Override
	public double calculateTotalPrice() {
		int numOfAdults = 0;
		int numOfChildren = 0;
		double totalCost = (numOfAdults * adultRate + numOfChildren * childRate) * noOfDays;
		return totalCost;
	}
	public double calculateCostwithMeals(int numOfAdults, int numOfChildren) {
		double totalCostWithoutMeals = calculateTotalPrice();

		double mealCost = (numOfAdults * 20.99 + numOfChildren * 4.99) * noOfDays;
		return totalCostWithoutMeals + mealCost;
	}
//Method Displaying Cruise Details

	public void displayCruiseDetails() {
		System.out.println("Cruise Details!\n The Cruise you have selected is" + cruiseName);
		System.out.println("Rates for Adults: $" + adultRate + " per day");
		System.out.println("Rate for Children: $" + childRate + " per day");
		System.out.println("Number of Days: " + noOfDays);
	}

// Method For tax calculations	 
	public double calculateTax(double totalCost) {
		return 0.15 * totalCost;
	}

// method for Final bill Display
	public void displayBill(double totalCost, double tax) {
		double finalBill = totalCost + tax;
		System.out.println("Your Package includes: ");
		System.out.println("Cruise Name: " + cruiseName);
		System.out.println("Number of Days: " + noOfDays);
		System.out.println("Total Price: $" + totalCost);
		System.out.println("HST @ (15%): $" + tax);
		System.out.println("Final Bill Amount: $" + finalBill);

	}
		
		
		
	
}