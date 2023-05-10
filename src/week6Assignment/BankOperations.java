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

	public abstract void changePinPassword();
		
	}
		

	
