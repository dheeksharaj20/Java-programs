package com.xworkz.staticmember.fields;

public class MobileTester {

	public static void main(String[] args) {
		Mobile dell = new Mobile("sony", 20.0, 4);
		dell.displayDetails(); // calling object
		Mobile.setcolor("grey"); // calling static method
		Mobile samsung = new Mobile("Samsung", 28.0, 3);
		samsung.displayDetails();
		Mobile apple = new Mobile("Apple", 50.0, 4);
		apple.displayDetails();
		Mobile oneplus = new Mobile("Oneplus", 70.0, 5);
		oneplus.displayDetails();

	}

}


//OUTPUT
//varities of mobile
//brand:sony  cost:20.0  rating:4  color:black
//varities of mobile
//brand:Samsung  cost:28.0  rating:3  color:black
//varities of mobile
//brand:Apple  cost:50.0  rating:4  color:black
//varities of mobile
//brand:Oneplus  cost:70.0  rating:5  color:black
