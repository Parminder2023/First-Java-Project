package week6Assignment;

public class PersonAccount{
	private String accountNumber;
	private double balance;
	private int PIN;
	private String password;
	public PersonAccount(String string, int i, int j, String string2) {
		
	}
	public PersonAccount() {
		// TODO Auto-generated constructor stub
	}
	public void PersonAccount(String string, int i, int j, String string2) {
		// TODO Auto-generated constructor stub
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public PersonAccount(String accountNumber, double balance, int pin, String password) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.PIN = pin;
		this.password = password;
}
}
