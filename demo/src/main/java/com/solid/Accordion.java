package com.solid;

public class Accordion implements Wind, Keys {

	public void useWind() {
		System.out.println("Squeeze and extend the bellows");
	}
	
	public void useKeys() {
		System.out.println("Press keys to direct the air into particular valves");
	}
	
}
