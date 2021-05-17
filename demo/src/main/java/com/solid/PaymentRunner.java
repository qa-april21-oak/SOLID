package com.solid;

public class PaymentRunner {

	static void Run() {
		PaymentGateway gateway = new PaymentGateway();
        
        VisaCard card = new VisaCard(100);
        Favour matePoints = new Favour(10);
        
        
        boolean cardResult = gateway.tryTransaction(card, 100);
        boolean favourResult = gateway.tryTransaction(matePoints, 100);
	}
	
}
