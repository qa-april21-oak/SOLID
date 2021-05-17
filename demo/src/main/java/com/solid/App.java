package com.solid;


public class App 
{
    public static void main( String[] args ) {
    	
    	Customer bob = new Customer("Bob", 94, "1 abc lane, def, se17 5hg");
		Customer james = new Customer("James", 23, "6 abc lane, def, wd17 5hg");
		
		System.out.println(bob.toString());
		System.out.println(james.toString());
    }
}
