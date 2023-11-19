package User;

import java.util.Scanner;

public class UserClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserClass user = new UserClass();
		user.SavedUserName = "pivotAdmin";
		user.SavedPassword = "Admin123";

		Scanner scan = new Scanner(System.in);

		// Using for loop to meet 3 Iteration (attempt limit = 3 ) for checking Username
		// & Password
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter username: ");
			String enteredUsername = scan.nextLine();

			System.out.print("Enter password: ");
			String enteredPassword = scan.nextLine();

		// Using if to analyze Saved username and pwd = entered username and 
			if (user.SavedUserName.equals(enteredUsername) && user.SavedPassword.equals(enteredPassword)) {

				System.out.println("You are logged in to the application");
			} else {
				System.out.println("Incorrect User id or password.Try again");
			}

		}

		System.out.println("Account Locked");
		scan.close();

	}

}
