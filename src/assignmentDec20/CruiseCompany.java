package assignmentDec20;

public class CruiseCompany {

	private String cruiseName;
	protected int numOfDays;
	protected double adultRate;
	public double childRate;

	public CruiseCompany(String cruiseName, double adultRate, double childRate, int numOfDays) {
		this.cruiseName = cruiseName;
		this.adultRate = adultRate;
		this.childRate = childRate;
		this.numOfDays = numOfDays;
	}

//getter methods

	public String getCruiseName() {
		return cruiseName;
	}

	public int getnumOfdays() {
		return numOfDays;
	}

	public double getadultRate() {
		return adultRate;
	}

	public double getchildrate() {
		return childRate;
	}

// Method calculating total cost without meals

	public double calculateCost(int numOfAdults, int numOfChildren) {
		double totalCost = (numOfAdults * adultRate + numOfChildren * childRate) * numOfDays;
		return totalCost;
	}
// Method calculating total cost with meals

	public double calculateCostwithMeals (int numOfAdults, int numOfChildren) {
		double totalCostWithoutMeals = calculateCost(numOfAdults, numOfChildren);

       double mealCost = (numOfAdults * 20.99 + numOfChildren * 4.99) * numOfDays;
        return totalCostWithoutMeals + mealCost;
	}
//Method Displaying Cruise Details
	
	 public void displayCruiseDetails() {
		 System.out.println("Cruise Details!\n The Cruise you have selected is" + cruiseName);
		 System.out.println("Rates for Adults: $" + adultRate + " per day" );
	     System.out.println("Rate for Children: $" + childRate + " per day");
	     System.out.println("Number of Days: " + numOfDays);
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
			System.out.println("Number of Days: " + numOfDays);
			System.out.println("Total Price: $" + totalCost);
			System.out.println("HST @ (15%): $" + tax);
			System.out.println("Final Bill Amount: $" + finalBill);

		}


		
	}
	

