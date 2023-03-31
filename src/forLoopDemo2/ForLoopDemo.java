package forLoopDemo2;

import java.util.Scanner;

public class ForLoopDemo {
	//Pin should be blocked after entering incorrect Pin 3 times
	
	int enteredPin;
	int actualPin;
	
	Scanner sc = new Scanner(System.in);

	void pinShouldBeBlockedAfter3Attempts () {
		for(
				int counter=1;
				counter<=3;
				counter++) {
			enteredPin = sc.nextInt();
				
			
			}
			if(actualPin!=enteredPin) {
				System.out.println("Pin should be blocked");
				
			}else {
				System.out.println("Pin is Correct");
			}
		}
			
		}
		
