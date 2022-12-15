package com.spring.corelifecycle;

public class mobile {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "mobile [price=" + price + "]";
	}

	public void hey() {
		System.out.println("Inside init method: hey how are you?");
	}

	public void bye() {
		System.out.println("Inside destroy method: bye bye i am going to destroy");
	}

}