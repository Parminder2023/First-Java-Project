package week6Assignment;

import java.util.Scanner;

public class ATM extends BankOperations {

	int enteredPIN;
	int correctPIN = 1234;
	int oldPIN=1234;
	int updatedPIN;
	int choice;

	@Override

	public void changePinPassword() {
		Scanner sc = new Scanner(System.in);
		int counter = 3;
		
		while (counter != 0) {
			System.out.println("enter your 4 digit PIN : ");
			int enteredPIN = sc.nextInt();

			if (enteredPIN == correctPIN) {
				System.out.println("update your PIN");
				
				int updatedPIN=sc.nextInt();
				
				if(updatedPIN==oldPIN);
				{
				System.out.println("updated PIN is same as : " + oldPIN);
	              
			}
			}
	               else {
				
				System.out.println("Invalid PIN");

	               }break;
		}
		if(counter==0) {
			System.out.println("your account is locked");
		}
	}
}

