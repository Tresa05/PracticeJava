package loops;

public class HalloweenCandyCollectionWhileExample {
	
	int noOfChoclates;
	
	void trickAndtreating() {
		
		while (noOfChoclates <10) {
			
			System.out.println("Trick or Treat");
			noOfChoclates++;
			if(noOfChoclates != 10) {
		    System.out.println("Go to next house");
			}
		}
	do{
		System.out.println("go to next house");
		System.out.println("Trick or Treat");
		noOfChoclates++;
	System.out.println("Total Cholates :" + noOfChoclates);
	}while (noOfChoclates <10);
	
		
	}
}


