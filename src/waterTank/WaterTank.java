package waterTank;

public class WaterTank {

	// if tank==100 tank will be full
	// if tank >= water will overflow
	//for loop

	int waterTank;
	int bucketCapacity ;
	int counter;

	void waterTankcanBeFilledUsingBuckets() {
		
		for(counter =1;
				counter <9;
				counter ++) {
			if (waterTank==100) {
				System.out.println("tank is  full");

			} else {
				System.out.println("tank is not full");
			}
			
				if (waterTank>=100) {
					System.out.println("tank is overflowing");
					break;
					
				}else {
						System.out.println("tank is not full");
					
				
				

			}
	}
	}
}



