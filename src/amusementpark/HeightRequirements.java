package amusementpark;

public class HeightRequirements {
	int height;
public static void main(String[] args) {
	    // TODO Auto-generated method stub
	
		HeightRequirements Access=new HeightRequirements();
		Access.height=120;
		//here I am considering people less than the height of 16 Height<90 centimeter and more than 200 centimeter is not allowed.
		//and whoever falls within this height requirement is eligible to enter the park.
		
		if(Access.height>=90&&Access.height<=200) {
			
			System.out.println("You are eligible to enter the park");
			
		}
		else {
			
			System.out.println("You are not eligible to enter the park");
			
		}
	}

}

	
	
	
	

		
	
		
