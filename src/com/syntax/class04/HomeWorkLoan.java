package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkLoan {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
				System.out.println("What is the amount of loan do you need?");
				int loan=scanner.nextInt();
				if(loan<=200000) {
					System.out.println("Your loan is approved");

				}
				else
				{
					System.out.println("Unfortunately your loan is rejected");
					
	}
	}

}
