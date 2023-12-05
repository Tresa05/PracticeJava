package AssignmentDec1;

public class SecondHighest {

	int[] num = {9,20,35,2,8,33 };
	int highest = 0;
	int secondHighest = 0;
	
	void find() {
		
		for(int i =0;i<num.length; i++){
			
			if (num[i]>highest) {
				
				secondHighest = highest;
				highest=num[i];
				
				
			}
		}
		
		System.out.println("The second highest number in the Array is: " + secondHighest);
		
	}

}
