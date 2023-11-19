package WaterTank;

public class Tank {
	public static void main(String[] args) {

	
int tankCapacity = 100;
 int bucketCapacity = 10;
 int currentlevel = 0;
 
 //method to fill the Tank

 //Using for loop to analyze the condition and  iteration till maximum capacity is met
//(initialize counter; checkcondition;increment counter)
	 
	 for (int i=0;i<tankCapacity;i+=10) {
		 
		 currentlevel+=10;
		 System.out.println("The current level is  "+ currentlevel);
		 
	 }
	 
	 
		 
	//to stop or to check if its overflowing	
		 if(currentlevel+bucketCapacity > 100) {
			 System.out.println("The tank is Full");
			 
		 }
				 
		 
	 
	

 }
}
		 


