package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name="Yulia";
		String lastName="Chevik";
		char grade='A';
		String city="New York";
		String state="NY";
		String phone="917 111 22 33";
		
		System.out.println("My name is " + name + " and my last name is " + lastName);
		System.out.println("I am " + grade + " student ");
		System.out.println("I live in city " + city );
System.out.println("My phone number is " + phone );

city="Chicago";
state= "IL";
grade='B';
phone="229 789 89 89";



System.out.println("My name is " + name + " and I moved to " + city);
System.out.println("I am " + grade + " student ");

System.out.println("My new phone number is " + phone );

//rules for identifiers=names (variables, methods, classes)
//1.cannot use keywords as identifiers
//String new="Hello"; = error because we used keyword new
//2.cannot have spaces in identifiers
//String last name="Smith";= error because of space in between last and name
//3.cannot start with numbers
//int 1number=123;=error because starts with number, number can be anywhere after first character
//4.identifiers cannot contain a special character
//except $ or _
double $price=9.99;
float _price1=1.99F;

/*
 * class should start with Upper case and follow camelCasing
 * variables should start with ;lower case letter and then follow a camelCasing;ex.myWeather not Weather with Upper case
 * 
 */








	}

}



