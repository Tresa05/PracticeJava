package AssignmentNov24;
import java.util.Scanner;
public class Mobile {
	Scanner scanner = new Scanner(System.in);
	String[] samsungProducts = { "S20", "S21", "Flip3", "Fold3" };
	String[] googleProducts = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
	String[] appleProducts = { "iPhone12", "iPhone SE", "iPhone 15", "iPhone 13" };
	String brand;
	String[]productselected = null;
	boolean selected = false;
	boolean selected2 = false;

	void ShowProducts() {
		System.out.println("Enter the phone brand (Samsung, Google, or Apple):");
		brand = scanner.nextLine();
		
		switch (brand) {
		case ("samsung"):
	 
			System.out.println("The models are: ");
			for (int i = 0; i < samsungProducts.length; i++) {
				productselected = samsungProducts;
				selected = true;
				System.out.println(samsungProducts[i]);
			}
			break;
		case ("google"):
			System.out.println("The models are: ");
		    for (int i = 0; i < googleProducts.length; i++) {
		    	productselected = googleProducts;
				selected = true;
				System.out.println(googleProducts[i]);
			}
		    break;
		case ("apple"):
			System.out.println("The models are: ");
			for (int i = 0; i < appleProducts.length; i++) {
				productselected = appleProducts;
				selected = true;
				System.out.println(appleProducts[i]);

			}
			break;
		default:
			System.out.println("Brand not available");
			break;
}
		if (selected) {
			System.out.println("Enter model name from the list: ");
			String model = scanner.nextLine();

			for (int j = 0; j < 4; j++) {
				if (model.equals(productselected[j])) {
					System.out.println(" Selected product is " + productselected[j]);
					selected2 = true;
					break;
				}

			}
			if (!selected2) {
				System.out.println("Please select a product from the given list");
			}
			scanner.close();
		}
}
}
	