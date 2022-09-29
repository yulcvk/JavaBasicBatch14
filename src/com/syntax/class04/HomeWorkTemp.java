package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTemp {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
System.out.println("Please enter your city");
String city=scanner.nextLine();
System.out.println("What is the temperature?");

float temp=scanner.nextFloat();
temp=(temp-32)/1.8f;
System.out.println("The temperature in "+city+ " is " +temp+ " degrees Celsius");
	
	}

}
