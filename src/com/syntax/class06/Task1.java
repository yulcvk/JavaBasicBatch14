package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your birth's month");
		String month=scanner.nextLine();
		
		String season;
		
		if(month.equals("January") || month.equals("February") || month.equals("December")){
				season="Winter";
				
		}else if(month.equals("March") || month.equals("April") || month.equals("May")){
			season="Spring";
			
		}else if(month.equals("June") || month.equals("July") || month.equals("August")){
			season="Summer";
			
		}else if(month.equals("September") || month.equals("October") || month.equals("November")){
			season="Fall";
		}else {
			System.out.println("Wrong name");
			season="Invalid";
		}
		System.out.println(season);
	}


	}


