package jan5thAssignment;

abstract class MyBookings {
	
		
		protected int noOfDays;
		protected double totalPriceOfStay;
		
		
		public MyBookings(int noOfDays) {
	        this.noOfDays = noOfDays;
	        this.totalPriceOfStay = 0;
		}
		
		public abstract double calculateTotalPrice();
		
		// Method For tax calculations
		 public double applyTax() {
		        return totalPriceOfStay * 0.18;
		    }

}

