package week6Assignment;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {

	Scanner sc = new Scanner(System.in);
	
	 double CorrectAccountNumber = this.accountNumber;
	String Correctpassword = this.onlineBankingPassword;
	private double balance= this.totalBalance;

	 void onlineBank() {
		System.out.println("Choose 1 for withdraw");
		
		double AccountNumber = sc.nextDouble();
		
		System.out.println("Please enter your online banking password");
		
		String Accountpassword = sc.nextLine();
		
		if (AccountNumber == CorrectAccountNumber && Correctpassword == Accountpassword) {
			
			System.out.println("Balance" + balance);

		} else {
			System.out.println("Incorrect account number and password");

		}

	}

}
