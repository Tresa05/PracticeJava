package Park;

import java.util.Scanner;

public class ParkRide {

	public static void main(String[] args) {

		int height;
		int ridersAllowed = 0;

		while (ridersAllowed < 10) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Rider height");
			height = scan.nextInt();

			if (height > 90 && height < 200) {

				ridersAllowed++;

				System.out.println("Current number of riders is " + ridersAllowed);

			}

			else {

				System.out.println("Rider Not Eligible");

				scan.close();
			}
		}
		System.out.println("The ride Capacity is full");

	}

}
