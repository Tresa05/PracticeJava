package User;

import java.util.Scanner;

public class UserClass {
    static String correctUserName = "pivotAdmin";
	static String correctPassword = "Admin123";
	
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	for ( int i=0;i<3; i++) {
        System.out.print("Enter username: ");
        String enteredUsername = scan.nextLine();
        
        System.out.print("Enter password: ");
        String enteredPassword = scan.nextLine();
	
        if(correctUserName.equals(enteredUsername)&& correctPassword.equals(enteredPassword)) {
        	
         System.out.println("You are logged in to the application" );
        }
        else {
         System.out.println("Incorrect User id or password.Try again");
        } 
         
        

	}
			
	System.out.println("Account Locked");
	scan.close();

}}
