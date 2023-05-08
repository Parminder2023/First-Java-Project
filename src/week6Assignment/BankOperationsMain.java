package week6Assignment;

import java.util.Scanner;

public class BankOperationsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
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
		bc.changePinPassword();
		
	}
}
