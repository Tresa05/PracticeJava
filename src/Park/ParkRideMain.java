package Park;

import java.util.Scanner;

public class ParkRideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParkRide ride = new ParkRide();
		ride.height = 0;
		ride.ridersAllowed = 0;

		// Using while loop to check if no.of Riders are less than 10
		Scanner scan = new Scanner(System.in);
		while (ride.ridersAllowed < 10) {

			System.out.println("Enter Rider height");
			ride.height = scan.nextInt();

		// Using if to analyze the Riders height is greater than 90cm and less than 200cm 
			if (ride.height > 90 && ride.height < 200) {

				ride.ridersAllowed++; //when if condition met no.of riders boarded increased by 1 

				System.out.println("Current number of riders is " + ride.ridersAllowed);

			}

			else {

				System.out.println("Rider Not Eligible");

			}

		}
		scan.close();
		System.out.println("The ride Capacity is full");

	}

}
