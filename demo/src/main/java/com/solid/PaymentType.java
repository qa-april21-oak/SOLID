package com.solid;

public abstract class PaymentType {
	public abstract boolean canAfford(int cost);
	public abstract void removeMoney(int amt);
}