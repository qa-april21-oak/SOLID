package com.solid;

public class Favour extends PaymentType {

	int favour;
	
	public Favour(int favourAmt) {
		favour = favourAmt;
	}
	
	
	@Override
	public boolean canAfford(int cost) {
		return favour > 0;
	}

	@Override
	public void removeMoney(int amt) {
		favour--;
	}

}
