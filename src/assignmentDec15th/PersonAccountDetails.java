package assignmentDec15th;

public class PersonAccountDetails {
	 private String accountNo;
	    private String name;
	    private int pin;
	    private String onlineBankingPassword;

	    public PersonAccountDetails(String accountNo, String name, int pin, String onlineBankingPassword) {
	        this.accountNo = accountNo;
	        this.name = name;
	        this.pin = pin;
	        this.onlineBankingPassword = onlineBankingPassword;
	    }

	    public String getAccountNo() {
	        return accountNo;
	    }

	    public int getPin() {
	        return pin;
	    }

	    public String getOnlineBankingPassword() {
	        return onlineBankingPassword;
	    }
}
