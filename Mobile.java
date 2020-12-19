package com.xworkz.staticmember.fields;

public class Mobile {
	
		String brand;
		double cost;
		int rating;
		static String color="black";
		{ //initialization block
			System.out.println("varities of mobile");
		}

		Mobile(String inbrand, double incost, int inrating) { //constructor
			brand = inbrand;
			cost = incost;
			rating = inrating;
			//color = incolor;
		}
		static void setcolor(String color) {  //static method
			color="black";
		}
		

		void displayDetails() { 
			
			System.out.println("brand:" + brand + "  " + "cost:" + cost + "  " + "rating:" + rating + "  " + "color:" + color);
		}

	}

