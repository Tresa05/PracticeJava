package assignmentDec20;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UserClass userInterface = new UserClass("tresa.1","Password1", "Tresa", "4569228567");
	
		System.out.println("Welcome to Cruise Company ! \n Please signUp to book a cruise.\n Please fill in the details for registering with us \n Enter your Name:  ");
	String nameGiven = sc.next();
	userInterface.setname(nameGiven);
	System.out.println("Enter your EmailId:  ");
	String emailGiven = sc.next();
	userInterface.setEmailId(emailGiven);
	System.out.println("Enter your PhoneNumber:  ");
	String phoneNumberGiven = sc.next();
	userInterface.setPhonenumber(phoneNumberGiven);
	System.out.println("Enter a Username:  ");
	String userNameGiven = sc.next();
	userInterface.setUsername(userNameGiven);
	System.out.println("Enter a Password:  ");
	String passwordGiven = sc.next();
	userInterface.setPassWord(passwordGiven);
	userInterface.login();
	System.out.println(
			"WELCOME !\n We offfer 4 different packages as displayed below. Please enter the cruise number (1-4)that you want to select:");
	System.out.println("Cruise Options:");
	System.out.println("1. Scenic Cruise");
	System.out.println("2. Sunset Cruise");
	System.out.println("3. Discovery Cruise");
	System.out.println("4. Mystery Cruise");
	int cruiseChoice = sc.nextInt();
	
	

// User input for the number of adults and children
    System.out.print("Enter the number of adults (>12): ");
    int numAdults = sc.nextInt();
    System.out.print("Enter the number of children (>5): ");
    int numChildren = sc.nextInt();

    // Create the selected cruise object
    CruiseCompany cruiseSelected = null;
 // Selecting the appropriate cruise based on user choice
 			switch (cruiseChoice) {
 			case 1:
 				cruiseSelected = new ScenicCruise();

 				System.out.println("The Cruise that you have slected is Scenic Cruise which is a 3 day cruise");

 				break;
 			case 2:
 				cruiseSelected = new SunsetCruise();
 				System.out.println("The Cruise that you have slected is SunsetCruise which is a 1 day cruise");

 				break;
 			case 3:
 				cruiseSelected = new DiscoveryCruise();
 				System.out.println("The Cruise that you have slected is DiscoveryCruise which is a 4 day cruise");

 				break;
 			case 4:
 				cruiseSelected = new MysteryCruise();
 				System.out.println("The Cruise that you have slected is MysteryCruise which is a 2 day cruise");

 				break;

 			default:
 				System.out.println("Invalid choice.");
 				System.exit(0);
 			}

    // Display cruise details using the new method
    cruiseSelected.displayCruiseDetails();

    // Get user input for meals
    System.out.print("Do you want meals on the cruise? (1 for Yes, 0 for No): ");
    int mealsChoice = sc.nextInt();
    
    double totalCost;
	if(mealsChoice == 1){
        // Calculate total cost with meals using the new method
        totalCost = cruiseSelected.calculateCostwithMeals(numAdults, numChildren);
    } else {
        // Calculate total cost without meals
        totalCost = cruiseSelected.calculateCost(numAdults, numChildren);
        
       
    }
	

	double tax = cruiseSelected.calculateTax(totalCost);
	cruiseSelected.displayBill(totalCost, tax);
	sc.close();
	
	

	
	
	
		
       
        
       

    }
}
