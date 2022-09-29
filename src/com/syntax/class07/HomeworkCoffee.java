package com.syntax.class07;

import java.util.Scanner;

public class HomeworkCoffee {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		double coffee=5;
		
		double price;
		
		System.out.println("Please pay for your coffee");
		
		do {
				
		price=input.nextDouble();
		if(price<coffee) {
			
	
				System.out.println("Please pay more");
		}
		else if(price>coffee) {
			System.out.println("Please pay less");
		}
				
		}while(price!=coffee) ;
		System.out.println("Enjoy your coffee");
				
			}
}
	
		



