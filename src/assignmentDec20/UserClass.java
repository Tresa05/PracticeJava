package assignmentDec20;

import java.util.Scanner;

public class UserClass {

	Scanner sc = new Scanner(System.in);

	private String username;
	private String password;
	private String emailId;
	private String name;
	private String phoneNumber;
	private String user;
	private int attemptsGiven;

//parametrized constructor
	public UserClass(String username, String password, String name, String phoneNumber) {
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

	// method to setpassword
	public void setPassWord(String passWord) {
		boolean isValidPassword = false;

		while (!isValidPassword) {
			if (passWord.length() < 8) {
				System.out.println("Password not created. Please enter a password with at least 8 characters.");
			} 
			else {
				isValidPassword = true;
			}

			if (!isValidPassword) {
				System.out.println("Please create a new password:");
				passWord = sc.next();
			}
		}
	}

	

	// method for login
	public void login() {
		System.out.println("Welcome to the CruiseCompany!");

		for (int attempt = 1; attempt <= 3; attempt++) {
			System.out.println("Enter UserName;      ");
			String enteredUsername = sc.nextLine();
			System.out.println("Enter Password;      ");
			String enteredPassword = sc.nextLine();

			if (isValidCredentials(enteredUsername, enteredPassword)) {
				System.out.println(" Login Successful!");
				return;

			} else {
				System.out.println("Incorrect username or password. Attempts remaining: " + (3 - attempt));

			}
		}
		System.out.println("Exceeded maximum login attempts. Account locked.");

	}

	private boolean isValidCredentials(String enteredUsername, String enteredPassword) {

		return enteredUsername.equals(username) && enteredPassword.equals(password);

	}
}
