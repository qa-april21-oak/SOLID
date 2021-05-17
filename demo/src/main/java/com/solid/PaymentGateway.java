package com.solid;

public class PaymentGateway {

	public boolean tryTransaction(PaymentType payment, int cost) {
		if (payment.canAfford(cost)) {
			payment.removeMoney(cost);
			return true;
		}
		
		return false;
	}
	
	
}
