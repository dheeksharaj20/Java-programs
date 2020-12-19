package com.xworkz.staticmember.fields;

public class Trainee {

	int id;
	String name;
	String emailId;
	static String institution;
	int age;

	//static blocks
	static { //initialization at time of class loading
		System.out.println("In static blocks");
		institution = "GSSS";
	}
	Trainee() {
		System.out.println("no arg const");
	}

	Trainee(int inId, String inName, String inEmailId, int inAge) {
		id = inId;
		name = inName;
		emailId = inEmailId;
		age = inAge;

	}

	static void setInstitution(String institutioname) {
		// initialization of static variables
		// called based on requirement
		//cannot access non static member
		System.out.println("In static method ");
		institution = "X-workz";
	}

	void displayDetails() {
		System.out.println("Id:" + id + ", Name: " + name + ", EmailID: " + emailId + ", Institution:" + institution
				+ ", Age:" + age);
	}
}
