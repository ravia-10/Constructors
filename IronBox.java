package com.xworkz.oops;

public class IronBox {
	int price;
	String brand;
	String color;
	String type;
	double lenght;
	String design;

	IronBox(){
		System.out.println("invoked constructor with no parameter");
	}
	
	IronBox(int price,String brand,String color,String type, double lenght,String design){
		this.price =price;
		this.brand=brand;
		this.color=color;
		this.type=type;
		this.lenght=lenght;
		this.design=design;
	}
	
	//constructor overloading
	IronBox(int price,String brand,String color,String type){
		this.price =price;
		this.brand=brand;
		this.color=color;
		this.type=type;
	}
	public void switchOn() {
		System.out.println("it is On");
	}

	public void switchOff() {
		System.out.println("it is Off");
	}

	public void setTemperature() {
		System.out.println("tempeature is set...");
	}
	
	public void displayInfo(){
		System.out.println(this.price);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.type);
	}
}
