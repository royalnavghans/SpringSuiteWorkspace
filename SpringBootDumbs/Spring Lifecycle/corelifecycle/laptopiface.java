package com.spring.corelifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class laptopiface implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public laptopiface() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// init
		System.out.println("taking laptopiface: init");

	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// destroy
		System.out.println("release bean resources: destroy");

	}

}