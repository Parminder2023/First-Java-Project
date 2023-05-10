package week6Assignment;

import java.util.Scanner;

public class ATM extends BankOperations {

	Scanner sc = new Scanner(System.in);
	

		
		
		
		public void changePinPassword(PersonAccount account) {
			
			System.out.println("Enter new ATM pin number");
			int newPin = sc.nextInt();

			while (newPin == account.getPIN() || (String.valueOf(newPin).length() < 4)) {

				if (newPin == account.getPIN()) {
					System.out.println("Entered pin is same as old pin. Please use different pin");
				}
				if (String.valueOf(newPin).length() < 4) {
					System.out.println("Entered pin should have atleast 4 characters. Please try again!");
				}
				System.out.println("Enter new ATM pin number");
				newPin = sc.nextInt();

			}
			System.out.println("Updated pin is : " + newPin);

		}

		
		
	
	
	
}