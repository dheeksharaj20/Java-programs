package com.xworkz.staticmember.fields;

public class TraineeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee dheeksha = new Trainee(1,"dheeksha" ,"dheeksha@gmail.com", 23 );
		dheeksha.displayDetails();
		
		Trainee.setInstitution("X-workz");
		
		Trainee rakshitha = new Trainee(2,"rakshitha" ,"rakshitha@gmail.com",  22 );
		rakshitha.displayDetails();

		Trainee manasa = new Trainee(3,"manasa" ,"manasa@gmail.com",  23);
		manasa.displayDetails();
		
		Trainee.institution = "somthing";		
		Trainee grantha = new Trainee(4,"grantha" ,"grantha@gmail.com", 22 );
		grantha.displayDetails();

	}

}


//OUTPUT

//In static blocks
//Id:1, Name: dheeksha, EmailID: dheeksha@gmail.com, Institution:GSSS, Age:23
//In static method 
//Id:2, Name: rakshitha, EmailID: rakshitha@gmail.com, Institution:X-workz, Age:22
//Id:3, Name: manasa, EmailID: manasa@gmail.com, Institution:X-workz, Age:23
//Id:4, Name: grantha, EmailID: grantha@gmail.com, Institution:somthing, Age:22
