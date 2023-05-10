package week6Assignment;

import java.util.Scanner;

public abstract class BankOperations {

	public abstract void changePinPassword();

	public abstract double withdraw(double withdraw, double totalBalance);

	public abstract double deposit(double deposit, double totalBalance);
}
