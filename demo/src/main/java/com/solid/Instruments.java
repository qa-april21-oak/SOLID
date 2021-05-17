package com.solid;

public class Instruments extends App {
	
	public static void instrument(String[] args) {
		
		Piano pia = new Piano();
		pia.useKeys();
		pia.useStrings();
		
		Accordion acco = new Accordion();
		acco.useWind();
		acco.useKeys();
		
		Violin vio = new Violin();
		vio.useStrings();
		
	}
	
}