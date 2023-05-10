package week6Assignment;

import java.util.Scanner;

public class BankOperationsMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PersonAccount acc = new PersonAccount();
		
		System.out.println("choose 1 for ATM");
		System.out.println("choose 2 for onlineBanking");
         
		BankOperations bc = null;

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			bc = new ATM();
			bc.changePinPassword();

			break;
		case 2:
			bc = new OnlineBanking();
			bc.changePinPassword();
			break;
			
		}
		

		BankOperations bankOperation = new ATM();
		
		Scanner sc1 = new Scanner(System.in);
		
		PersonAccount parminderAccount  = new PersonAccount("p1234",5000,1212,"p3663");
		
		PersonAccount akkiAccount = new PersonAccount("M464564", 10000, 001, "a2072");
		
		PersonAccount inayaitAccount = new PersonAccount("M464564", 6000, 1234, "i1234");
		
		PersonAccount kamalAccount = new PersonAccount("M464564", 7000, 2030, "kaur001");
		
		PersonAccount tannuAccount = new PersonAccount("M464564", 8000, 4020, "t0101");
		
		
		
		System.out.println("Enter the amount to be withdrawn");
		double withdrawAmount = sc1.nextDouble();
		
		bankOperation.withdrawMoney(parminderAccount, withdrawAmount);
		
		System.out.println(parminderAccount.getBalance());
		
		
	}
	
	

}
	
	

//		