package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		//String is just 1 example of non primitive data types
		
		String name="Asma";
		String address="123 address street";
		String phone="123 456 7890";
		int age=17;
		//String age="17";//everything inside"" is a String
		String character="A";
	
		
		System.out.println(name);
		//"My name is " + Asma
		System.out.println("My name is " + name );
		
		//Asma is 17
		System.out.println(name + " is "+age);
		
		String fruit = "apple";
		double price=1.99;
		
		//The price of apple is 1.99
		
		System.out.println("The price of the "+fruit + " is " +price);
		
		fruit="mango";
		price=5.99;
		
		System.out.println("The price of the "+fruit + " is " +price);
		
		
		
		
	
		
	}

}
