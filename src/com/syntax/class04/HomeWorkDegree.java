package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkDegree {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a diploma? Please answer true or false");
		boolean degreeStatus=scanner.nextBoolean();
		
		if(degreeStatus) {
			
	
			System.out.println("Congratulations!");
			System.out.println("What is your GPA score?");
			
		double gpa=scanner.nextDouble();
		
		if (gpa>=3.5) {
			System.out.println("You are eligiable for scholarship");
		}
		else {System.out.println("You should have studied harder");}
		}
			
		else 
			
		{
		
			System.out.println("Please get a degree");
		}
		
	}

}
