package com.xworkz.blocks;

public class Television {

	String brand;
	double price;
	int sizeininches;

	{
		System.out.println("Initialization block 1");
		brand = "Sony";
	}

	Television() {
		System.out.println("No Arg constructor");
	}

	{
		System.out.println("Initialization block 2");
		price = 30000.00;
	}

	Television(String inbrand, double inprice, int insizeininches) {
		brand = inbrand;
		price = inprice;
		sizeininches = insizeininches;
	}

	{
		System.out.println("Initialization block 3");
		sizeininches = 40;
	}

}
