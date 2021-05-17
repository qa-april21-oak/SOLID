package com.solid;

public class Piano implements Keys, Strings {

	public void useKeys() {
		System.out.println("Press the keys of the piano");
	}
	
	public void useStrings() {
		System.out.println("The hammers hit the strings");
	}
}
