package week6Assignment;

import java.util.Scanner;

public class BankOperationsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountDetails acc = new AccountDetails();
		
		System.out.println("choose 1 for ATM");
		System.out.println("choose 2 for changePInPassword");
         
		BankOperations bc = null;

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			bc = new ATM();

			break;
		case 2:
			bc = new OnlineBanking();
			break;

		}
		System.out.println("Enter account number");
		int accNumber = sc.nextInt();
		acc.setAccountNumber(accNumber);
		
		System.out.println("Enter name");
		String name = sc.next();
		acc.setNameOfAccountholder(name);
		
		System.out.println("Enter Total balance");
		double totalBalance = sc.nextDouble();
		acc.setTotalBalance(totalBalance);
		
		System.out.println("Enter PIN");
		int pin = sc.nextInt();
		acc.setPIN(pin);
		
		System.out.println("Enter online banking password");
		String password = sc.next();
		acc.setOnlineBankingPassword(password);
		
		System.out.println("Enter withdraw amount");
		double withdrawAmount = sc.nextDouble();
		
		System.out.println("Enter amount to be deposit");
		double depositAmount = sc.nextDouble();
		OnlineBanking onb = new OnlineBanking();
		
		
		double updatedBalance = onb.withdraw(withdrawAmount, totalBalance);
		System.out.println("Your updated Balance is: "+updatedBalance);
        
		double updatedBalance1 = onb.deposit(depositAmount, totalBalance);
		System.out.println("Your updated Balance is: "+updatedBalance1);
        
		



		bc.changePinPassword();
		
	}
}
