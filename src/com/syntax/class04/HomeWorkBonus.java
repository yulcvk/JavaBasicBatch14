package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkBonus {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many years did you work?");
		int years=scanner.nextInt();
		
		
		if(years>=5) {
			System.out.println("You are eligiable for a bonus");
			System.out.println("What is your salary?");
			int salary=scanner.nextInt();
			
			if(salary>50000) {
				System.out.println("Your bonus is 5000");
			}
			else 
			{
				System.out.println("Your bonus is 3000");
			}
		}else {
			
			
			System.out.println("You are not eligiable for the bonus");
			
			
			
				
			}
		
		}

	}






