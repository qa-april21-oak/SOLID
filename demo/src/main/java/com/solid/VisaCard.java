package com.solid;

public class VisaCard extends PaymentType {
	int money;
	int fee = 1;
	public VisaCard(int moneyAmt) {
		money = moneyAmt;
	}
	
	@Override
	public boolean canAfford(int cost) {
		return money >= (cost + fee);
	}

	@Override
	public void removeMoney(int amt) {
		money -= amt;
		money -= fee;
	}

}
