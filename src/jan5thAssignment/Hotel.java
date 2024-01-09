package jan5thAssignment;

 public class Hotel extends MyBookings {
	 private int numAdults;
	    private int numChildren;

	    public Hotel(int noOfDays, int numAdults, int numChildren) {
	        super(noOfDays);
	        this.numAdults = numAdults;
	        this.numChildren = numChildren;
	    }

	   

		@Override
	    public double calculateTotalPrice() {
	       
	        double PricePerNight = 0.0;
	        double deluxeSuiteRate = 180.0;
	        double familySuiteRate = 230.0;

	        // Calculate total price based on the type of suite
	        if (numAdults == 2 && numChildren == 2) {
	           PricePerNight = deluxeSuiteRate;
	        } else if (numAdults == 4 && numChildren == 4) {
	            PricePerNight = familySuiteRate;
	        } else {
	            System.out.println("Invalid number of guests. Please select a suitable suite.");
	            return 0.0;
	            
	        }

	        // Calculate total price including additional meals and tax
	        double totalPriceOfStay = PricePerNight * noOfDays;
	        double mealsFee = 25.0 * numAdults + 5.0 * numChildren;
	        double tax = 0.18 * totalPriceOfStay;

	        // Display the calculated total price
	        System.out.println("Total Price for Hotel Stay: $" + totalPriceOfStay);
	        System.out.println("Meals Fee: $" + mealsFee);
	        System.out.println("Tax (18%): $" + tax);
	        System.out.println("Final Price: $" + (totalPriceOfStay + mealsFee + tax));
	        
	        // Return the final price
	        return totalPriceOfStay + mealsFee + tax;
	    }
	}
