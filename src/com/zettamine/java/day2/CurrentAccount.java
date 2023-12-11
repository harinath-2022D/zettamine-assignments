package com.zettamine.java.day2;

public class CurrentAccount extends Account {
	private static String TYPE = "CURRENT";

	public CurrentAccount(long accountNo, String name, float balance) {
		super(accountNo, name, balance);
	}

	public CurrentAccount() {
		super();
	}

	@Override
	public String getDetails() {

		return super.getDetails() + " | A/C TYPE: " + TYPE;
	}
}
