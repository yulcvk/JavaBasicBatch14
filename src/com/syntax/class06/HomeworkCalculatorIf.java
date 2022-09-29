package com.syntax.class06;

import java.util.Scanner;

public class HomeworkCalculatorIf {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter 2 numbers");
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		System.out.println("Please enter operator.Choose from: +,-,*,/");
		char oper=scanner.next().charAt(0);
		
		int sum=x+y;
		int sub=x-y;
		int mult=x*y;
		int div=x/y;
		
	
	       if(oper=='+') {
				System.out.println(sum);
			
			} else if(oper=='-') {
				System.out.println(sub);
			} else if(oper=='*') {
				
				System.out.println(mult);
			} else if(oper=='/') {
				System.out.println(div);
			}else {
				
	        System.out.println("Not valid operator");

			}		}
	}
			
	
	
	
