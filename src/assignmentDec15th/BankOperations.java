package assignmentDec15th;

public class BankOperations {

	private double totalBalance;

	public BankOperations(double balance) {
		this.totalBalance = balance;

	}
	// Method to initialize the balance
    public void initialize(double initialDeposit) {
        this.totalBalance = initialDeposit;
    }


	public void withdraw(double withdrawAmount) {
		if (withdrawAmount > 0 && withdrawAmount <= totalBalance) {
			totalBalance -= withdrawAmount;
			System.out.println("Withdrawal successful. Updated balance: " + totalBalance);
		} else {
			System.out.println("Insufficient funds. Transaction failed.");
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			totalBalance += amount;
			System.out.println("Deposit successful. Updated balance: " + totalBalance);
		} else {
			System.out.println("Invalid amount, Transaction failed.");
		}
	
		
	}
	
    public double viewBalance() {
       
        return totalBalance;
        
}
    
}