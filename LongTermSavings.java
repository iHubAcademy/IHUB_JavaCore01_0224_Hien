package Inheritance;

public class LongTermSavings extends BankAccount {
	private float interestRate;
	private int period;
	
	public LongTermSavings(String accountNumber, boolean balance, float interestRate, int period) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
		this.period = period;
	}
	public float getInterestRate() {
		return this.interestRate;
	}
	public int getPeriod() {
		return this.period;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	@Override
	public String toString() {
		return super.toString() + " LongTermSavings [interestRate=" + interestRate + ", period=" + period + "]";
	}
	
	public static void main(String[] args) {
		String accountNumber = "01123EFGH";
		boolean balance = false;
		float interestRate = 3.2F;
		int period = 6;
		LongTermSavings newLongTermSavings = new LongTermSavings(accountNumber, balance, interestRate, period);
		newLongTermSavings.setPeriod(12);
		newLongTermSavings.setInterestRate(3.4F);
		System.out.println(newLongTermSavings.toString());
	}
}
