package week6Assignment;

import java.util.Scanner;

public abstract class BankOperations {

	
	
	public BankOperations() {
		// TODO Auto-generated constructor stub
	}

	public void withdrawMoney(PersonAccount account, double moneyToBeWithdrawn) {
	
		if (moneyToBeWithdrawn < account.getBalance()) {
			System.out.println("Please collect your money : " + moneyToBeWithdrawn);
			account.setBalance( account.getBalance() - moneyToBeWithdrawn);
		}
		
	}

	public  void changePinPassword(PersonAccount account) {
		Scanner sc = new Scanner(System.in);
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
		
	
		

	
