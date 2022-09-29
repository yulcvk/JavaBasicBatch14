package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
Scanner input=new Scanner(System.in);
		
		double secretNumber=5;
		
		double user;
		
		System.out.println("Please guess the number");
		
		do {
				
		user=input.nextDouble();
			
		
				
		}while(user!=secretNumber) ;
		System.out.println("BINGO");

	}

}
