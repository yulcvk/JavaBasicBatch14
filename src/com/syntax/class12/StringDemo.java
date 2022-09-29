package com.syntax.class12;

public class StringDemo {

	public static void main(String[] args) {
		//proper way of creating an object
		String str= new String("Java");
		//simpler and shorter way provided by Java creators to make our lives a little easier
		String name="Java Java Javajavajava";
		//counts number of characters including spaces
		System.out.println(str.length());
		
		System.out.println(name.length());
		if(name.length()>15) {
			System.out.println("Name can't be more than 15 characters");
		}
	}

}
