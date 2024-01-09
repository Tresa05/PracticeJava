package jan5thAssignment;

import java.util.Scanner;

public class User {

	Scanner sc = new Scanner(System.in);

	private String username;
	private String password;
	private String emailId;
	private String name;
	private String phoneNumber;
	private String user;
	private int attemptsGiven;

//Parameterized constructor
	public User(String username, String password, String name, String phoneNumber) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.attemptsGiven = 3;

	}

// Getter Methods
	public String getusername() {
		return username;
	}

	public String getpassword() {
		return password;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

// Setter methods
	public String setname(String name) {
		return name;
	}

// method to set Username
	public void setUsername(String username) {
		this.username = username;
	}

// method to set phonenumber
	public void setPhonenumber(String phoneNumber) {
		while (phoneNumber.length() != 10) {
			System.out.println("Please enter a valid 10 digit phone number.");
			phoneNumber = sc.next();
		}
		this.phoneNumber = phoneNumber;
	}

	// method to set email
	public void setEmailId(String emailId) {
		while (!isValidEmail(emailId)) {
			System.out.println("Please enter an valid emaild Id.");
			emailId = sc.next();
		}

		this.emailId = emailId;
	}

	private boolean isValidEmail(String emailId) {
		return emailId.contains("@");
	}

	// method to set password
	public void setPassWord(String passWord) {
		boolean isValidPassword = false;

		while (!isValidPassword) {
			if (passWord.length() < 8) {
				System.out.println("Password not created. Please enter a password with at least 8 characters.");
			} else {
				isValidPassword = true;
			}

			if (!isValidPassword) {
				System.out.println("Please create a new password:");
				passWord = sc.next();
			}
		}
	}

	// method for user registration
	public void register() {
		System.out.println("Welcome to Marlin Vacations! Please register:");

		System.out.println("Enter Username:");
		setUsername(sc.next());

		System.out.println("Enter Password:");
		setPassWord(sc.next());

		System.out.println("Enter Name:");
		setname(sc.next());

		System.out.println("Enter Phone Number:");
		setPhonenumber(sc.next());

		System.out.println("Enter Email Id:");
		setEmailId(sc.next());

		System.out.println("Thank you for registering!");
	}

	public boolean validate() {
		// Perform validation on user credentials

		if (password == null || password.length() < 8) {
			System.out.println("Password must be at least 8 characters long.");
			return false;
		}

		if (name == null || name.isEmpty()) {
			System.out.println("Name cannot be empty.");
			return false;
		}

		if (phoneNumber == null || !(phoneNumber.length()!= 10)) {
			System.out.println("Invalid phone number format. Please enter 10 digits without spaces or hyphens.");
			return false;
		}

		return true;
	}

}
