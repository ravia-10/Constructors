package com.xworkz.oops;

public class PowerBank {
	int price;
	String color;
	String brand;
	double weight;
	double height;
	int mahPower;

	PowerBank() {
		System.out.println("power bank constructor invoked");
	}

	PowerBank(int price, String color, String brand, double weight,double height, int mahPower) {
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.weight = weight;
		this.height = height;
		this.mahPower = mahPower;
	}

	PowerBank(int price, String color, String brand, int mahPower) {
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.mahPower = mahPower;
	}

	public void powerBankOn() {
		System.out.println("it is On");
	}

	public void powerBankOff() {
		System.out.println("it is Off");
	}

	public void chargeMobile() {
		System.out.println("it is charging");
	}
	
	public void displayInfo(){
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.weight+"gm");
		System.out.println(this.height+"cm");
		System.out.println(this.mahPower);
	}
}