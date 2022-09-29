package com.syntax.class06;

import java.util.Scanner;

public class HomeworkGrade {

	public static void main(String[] args) {
		
		
			Scanner scanner=new Scanner(System.in);
			System.out.println("Please enter your grade");
			String explanation;
			char grade=scanner.next().charAt(0);
			
			switch (grade) {
			
			case 'A':
				explanation="Excellent";
				break;
			case 'B':
				explanation="Good";
				break;
			case 'C':
				explanation="Average";
				break;
			case 'D':
				explanation="Bad";
				break;
			default:
				explanation="Not Acceptable";
				break;
			}
			System.out.println("Your grade is "+grade+" and it is "+explanation);
		}


	}


