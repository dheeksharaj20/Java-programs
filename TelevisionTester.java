package com.xworkz.blocks;

public class TelevisionTester {

	public static void main(String[] args) {
		Television lg = new Television();
		System.out.println("Brand : " + lg.brand);
		System.out.println("Price : " + lg.price);
		System.out.println("Size in Inches : " + lg.sizeininches);
		System.out.println("========================");
		Television mi = new Television("MI", 35000.00, 50);
		System.out.println("Brand : " + mi.brand);
		System.out.println("Price : " + mi.price);
		System.out.println("Size in Inches : " + mi.sizeininches);

	}

}
