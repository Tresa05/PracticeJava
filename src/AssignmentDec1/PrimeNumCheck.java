package AssignmentDec1;
import java.util.Scanner;


//Write a program to find if the number is prime or not
public class PrimeNumCheck {
	
	Scanner scanner = new Scanner(System.in);
	int number;
    //Method 1
	int userInput() {
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		return number;
	}

	// Method 2
	boolean primeCheck() {

		// Prime no. is always greater than 1
		if (number <= 1) {
			scanner.close();
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
   //Method 3
	void result() {
		if (primeCheck()) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number");
		}

	}

}