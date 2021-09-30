package com.xworkz.oops;

public class Cameras {
	String brand;
	String modelNumber;
	String modelname;
	String color;
	String type;
	int price;
	boolean isSupportWifi;

	
	//constructor with parameter....
	public Cameras(String brand, String modelNumber, String modelname,String color, String type, int price, boolean isSupportWifi) {
		System.out.println("it is invoked");
		this.brand =brand;
		this.modelNumber=modelNumber;
		this.modelname = modelname;
		this.color=color;
		this.type=type;
		this.price=price;
		this.isSupportWifi=isSupportWifi;

	}
	
	public Cameras(){
		System.out.println("no parameter constructors");
	}

	public void cameraOn() {
		System.out.println("camera is on ");
	}

	public void cameraCharging() {
		System.out.println("camera is charging ");
	}

	public void clickPhotos() {
		System.out.println("Photo is clicked ");
	}

	public void createVedio() {
		System.out.println("creating a vedio ");
	}

	public void cameraOff() {
		System.out.println("camera is off ");
	}
 
	public void displayInfo(){
		System.out.println("brand = "+this.brand);
		System.out.println("model number = "+this.modelNumber);
		System.out.println("model name = "+this.modelname); 
		System.out.println("model color ="+this.color);
		System.out.println("model type =" +this.type);
		System.out.println("price is = "+this.price);
		System.out.println("is support wifi ="+this.isSupportWifi);
	}
}