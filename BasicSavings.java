package Inheritance;

public class BasicSavings extends BankAccount {
	private float interestRate;
	
	public BasicSavings(String accountNumber, boolean balance, float interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	public float getInterestRate() {
		return this.interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public String toString() {
		return super.toString() + " BasicSavings [interestRate=" + interestRate + "]";
	}
	
	public static void main(String[] args) {
		String accountNumber = "01123ABCD";
		boolean balance = false;
		float interestRate = 3.2F;
		BasicSavings newBasicSavings = new BasicSavings(accountNumber, balance, interestRate);
		newBasicSavings.setBalance(true);
		newBasicSavings.setInterestRate(3.3F);
		System.out.println(newBasicSavings.toString());
	}
}