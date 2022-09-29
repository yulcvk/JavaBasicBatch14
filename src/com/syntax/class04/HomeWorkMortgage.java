package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkMortgage {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
System.out.println("What is the mortgage rate?");

double morRate=scanner.nextDouble();
if(morRate>4.5) {
	System.out.println("I will not buy a house");
}else {
	System.out.println("What is the price of the house?");
	int price=scanner.nextInt();
	if(price>200000) {
		System.out.println("I will take a loan");
	}
else 
{
	System.out.println("I will pay cash");
	
}
	}
	}
}
	



