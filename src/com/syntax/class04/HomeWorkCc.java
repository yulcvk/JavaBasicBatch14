package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkCc {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		boolean creditCard=scanner.nextBoolean();
		
		if(creditCard) {
			System.out.println("What is the balance on your credit card?");
			
			double balance=scanner.nextDouble();
			if(balance>1000) {
				System.out.println("Please pay your balace inmmediately");
			}
			else
			{
				System.out.println("You can spend more");
			}
		}
		else 
		{
			System.out.println("Would you like to apply for one?");
		}

	}

}
