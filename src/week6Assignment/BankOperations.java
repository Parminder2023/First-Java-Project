package week6Assignment;

import java.util.Scanner;

public class BankOperations extends AccountDetails {
	private double updatedbalance = this.totalBalance;
	private double withdraw;
	private int deposit;
	Scanner sc = new Scanner(System.in);

	protected void withdraw() {
		
		System.out.println("Enter the money to be withdrawn");
		withdraw= sc.nextInt();
		if (updatedbalance >= withdraw) {

			updatedbalance = updatedbalance - withdraw;
			System.out.println("Please collect your money");
			
		} else
			
			System.out.println("Insufficient Balance");
	}

	protected void deposit() {
		
		System.out.println("Enter the amount to be deposited");
		deposit =sc.nextInt();
		
		updatedbalance = updatedbalance + deposit;
		
		System.out.println("Your Money has been successfully depsited");
		
	}

	protected void viewBalance() {
		
		System.out.println("Balance : " + updatedbalance);
	}


		
	}

	
	
		
	


