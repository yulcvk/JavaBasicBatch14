package com.syntax.class06;

import java.util.Scanner;

public class HomeworkCalculatorSwitch1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter 2 numbers");
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		System.out.println("Please enter operator.Choose from: +,-,*,/");
		char oper=scanner.next().charAt(0);
		
		int result=0;
		
		
		switch (oper) {
		
		case '+':
			result=x+y;
			break;
		case '-':
			result=x-y;
			break;
		case '*':
			result=x*y;
			break;
		case '/':
			result=x/y;
			break;	
		default:
			System.out.println("Please enter valid operator");
			break;
		}
		
		System.out.print(result);
				
			
	
	}
			}

	


