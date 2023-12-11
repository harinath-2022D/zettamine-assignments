package com.zettamine.java.day2;

public class SavingsAccount extends Account{
	private static String TYPE = "SAVINGS";
	private static final int ALLOWED_TRANSACTIONS = 3;
	public static int currentTrnasactionsCount = 0;
	private static final float ROI = 3.8f;
	
	public SavingsAccount(long accountNo, String name, float balance) {
		super(accountNo, name, balance);
	}

	public SavingsAccount() {
		super();
	}
	@Override
	public String getDetails() {
		
		return super.getDetails() + " | A/C TYPE: " + TYPE;
	}
	
	public float serviceCharge() {
		currentTrnasactionsCount++;
		if(currentTrnasactionsCount > ALLOWED_TRANSACTIONS) {
			float x = 18 * (currentTrnasactionsCount - ALLOWED_TRANSACTIONS);
			super.withdraw(x);
		  return x;
		}
		return 0.0f;
	}
	
	public String type() {
		return TYPE;
	}
	
	public float calculateROI() {
		float balance = super.getBalance();
		return balance * ROI;
	}
	

}
