package AssignmentDec1;

public class MaximumNumber {
	
		int[] num = {3,5,16,21,28,39,45,60,75,89 };
	    int max = num[0];

		// Method 
		void find() {
			// Iterate through the array 
			for (int i = 1; i < num.length; i++) {
				// checking the element is > the current max	
				if (num[i] > max)
				
					max = num[i];
			}
			// Printing the maximum number after the loop
			System.out.println("The maximum number is: " + max);
		}
	}

