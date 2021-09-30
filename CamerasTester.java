package com.xworkz.oops;

public class CamerasTester {

	public static void main(String[] args) {
		Cameras nikon = new Cameras("nikon", "n001", "nikon500d", "black","dslr", 30000, true);
		System.out.println();
		nikon.cameraOn();
		System.out.println();
		nikon.displayInfo();
	}

}
