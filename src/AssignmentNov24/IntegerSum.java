package AssignmentNov24;

public class IntegerSum {
	/*You are given a array of integer. You need to find all numbers whose sum is 15
	array[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
	Pair of elements whose sum is equal to 15 :  7, 8 and -5, 20*/

void totalSum() {
	int[] myNum = {-40,-5,1,3,6,7,8,20,12};
	//int count = 0;
	
for(int i=0;i<myNum.length;i++) {
		
		for(int j=0;j<myNum.length;j++) {
			if(myNum[i]+myNum[j]==15) {
				System.out.println("Pair of numbers whose sum is 15 are"+myNum[i]+" and "+myNum[j]);
                //count++;
				
			}
			/*
			 * if(count==3) { break; }
			 */
}
		}
}
}



