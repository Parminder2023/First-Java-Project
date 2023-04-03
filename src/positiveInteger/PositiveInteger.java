package positiveInteger;

import java.util.Scanner;

public class PositiveInteger {
	
	//input a positive integer then will output will indicate whether its a prime number or not
	//for loop

	int positiveInteger;
	int primeNumber;
	
	
	
	int counter;
	Scanner sc = new Scanner(System.in);
	
     void inputPositiveInteger() {
		for (counter = 1; 
				counter < 3;
				counter++) {
			System.out.println("input a positive integer");
			
			positiveInteger=sc.nextInt();

			if (positiveInteger == primeNumber) {
				System.out.println("number is a prime");

			} else {
				System.out.println("number is not prime");

			}
			if (positiveInteger!=primeNumber) {
				System.out.println("nuber is not a prime");
				
			}else {
				System.out.println("number is a prime");
				
			}
		}
	}
}



