package AssignmentDec1;

public class DescendingOrder {
	int[] num = {3,9,20,1,40,22,6,11};
	int number;
	//method
	void order() {
		System.out.println("Elements of original array: ");  
        for (int i = 0; i < num.length; i++) {   
            System.out.print(num[i] + " ");  //given array display
            
        }  
        for (int i = 0;i<num.length;i++) {
        for(int j =i+1;j<num.length;j++) {
        	
        	if (num[i]<num[j]) {
        		
        		number=num[i];
        		num[i]=num[j];
        		num[j]=number;
        		 // Sorting in descending
        		
        	}
        }
        }
        
       System.out.println();
       
       System.out.println("Elements of array sorted in descending order: ");
       for (int i =0; i<num.length;i++) {
    	   System.out.println(num[i]+ " ");
       }
		
		
		}
		
	}
	
	


