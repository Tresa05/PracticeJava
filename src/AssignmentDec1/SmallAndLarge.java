package AssignmentDec1;

public class SmallAndLarge {

	
	int[] num = {5,4,17,20,59,24,88};
	int min = num[0];
	int max = num[0];
	
	void find() {

//Loop thru the array
		for (int i = 1; i < num.length; i = i+ 1) {
            // Comparing each element with the  minimum
            if (num[i] < min) {
                min = num[i];
            }

            // Comparing each element with maximum
            if (num[i] > max) {
                max = num[i];
            }
        }

        // Print the results
        System.out.println("Smallest number in the array: " + min);
        System.out.println("Largest number in the array: " + max);
    }
	}

