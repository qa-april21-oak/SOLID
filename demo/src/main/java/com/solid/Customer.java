package com.solid;

public class Customer {
	
	private String name;
	private int age;
	private String address;
	private int accountNO;
	
	
	
	
	public Customer(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Customer(String name, int age, String address, int accountNO) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.accountNO = accountNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccountNO() {
		return accountNO;
	}
	public void setAccountNO(int accountNO) {
		this.accountNO = accountNO;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", address=" + address + ", accountNO=" + accountNO + "]";
	}

}
