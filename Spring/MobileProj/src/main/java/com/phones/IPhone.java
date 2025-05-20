package com.phones;

public class IPhone {
	private String modelName;
	private double cost;
	public IPhone(String modelName, double cost) { // Constructor Injection
		this.modelName = modelName;
		this.cost = cost;
	}
	public IPhone() {}
	public String toString() {
		return "IPhone Model Name : "+modelName+" Cost : "+cost;
	}
}
