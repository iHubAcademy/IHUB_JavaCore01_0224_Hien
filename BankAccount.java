package Inheritance;

public class BankAccount {
	private String accountNumber ;
	private boolean balance;
	
	 public BankAccount(String accountNumber, boolean balance) {
		 this.accountNumber = accountNumber; 
		 this.balance = balance; 
	 }
	 
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public boolean getBalance() {
		return this.balance;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(boolean balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
}
