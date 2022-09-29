package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		
String firstName="Mina";
String lastName="Henen";
String fullName=firstName+ " "  +lastName;


System.out.println(fullName);

int houseNo=10;
int aptNo=5;
String streetName="That street";
String city="New York";
String country="USA";
String fullAddress=aptNo+" "+houseNo+" "+streetName+" "+city+" "+country;

String incompleteAddress=houseNo+city;

String step1="if we subtract 10 from 5 we get =" +10;//result in string
//String step2=step1-5;//it is not defined, Java do not understand what to do when we ask her to subtract a string from a number it complains

System.out.println("if we subtract 10 from 5 we get ="  +(10-5));


System.out.println(fullAddress);
		
	}

}
