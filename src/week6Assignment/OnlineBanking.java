package week6Assignment;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {

	@Override
	public void changePinPassword() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your password : ");
		String input = sc.next();
		final int NUM_UPPER_LETTERS = 1;
		final int NUM_LOWER_LETTERS = 6;
		final int NUM_DIGITS = 1;

		int inputlen = 0;
		int Uppercount = 1;
		int lowercount = 6;
		int digitcount = 1;
		int specialCharacter = 1;

		for (int i = 0; i < inputlen; i++) {
			char ch = input.charAt(i);

			if (Character.isUpperCase(ch))
				Uppercount++;
			else if (Character.isLowerCase(ch))
				lowercount++;
			else if (Character.isDigit(ch))
				digitcount++;

		}
		if (Uppercount >= NUM_UPPER_LETTERS && lowercount >= NUM_LOWER_LETTERS && digitcount >= NUM_DIGITS)
			System.out.println("Valid password");
		else {
			System.out.println("The password did not have enough of the following: ");
			if (Uppercount < NUM_UPPER_LETTERS)
				System.out.println("uppercase letters ");
			if (lowercount < NUM_LOWER_LETTERS)
				System.out.println("lower letters");
			if (digitcount < NUM_DIGITS)
				System.out.println("digits");

		}

	}

	public double withdraw(double withdraw, double totalBalance) {
		double updatedBalance = 0.0;
		if (withdraw > totalBalance) {
			System.out.println("Insufficient Balance");
		} else {
			updatedBalance = totalBalance - withdraw;
		}
		return updatedBalance;
	}

	public double deposit(double deposit, double totalBalance) {
		double updatedBalance = 0;
		if (deposit > totalBalance) {
			System.out.println("enter the amount to be deposit");
		} else {
			updatedBalance = totalBalance + deposit;

		}
		return updatedBalance;
	}
}
