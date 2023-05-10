package week6Assignment;

public class AccountDetails {

	public AccountDetails() {}
	
	private int accountNumber;
	private String nameOfAccountholder;
	private double totalBalance;
	private int PIN;
	private String onlineBankingPassword;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getNameOfAccountholder() {
		return nameOfAccountholder;
	}
	public void setNameOfAccountholder(String nameOfAccountholder) {
		this.nameOfAccountholder = nameOfAccountholder;
	}
	public double getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}
	public void setOnlineBankingPassword(String onlineBankingPassword) {
		this.onlineBankingPassword = onlineBankingPassword;
	}
    
}
