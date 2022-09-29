package com.syntax.class05;

import java.util.Scanner;

public class HomeworkMonths {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter your birth's month");
	String month=scanner.nextLine();
	

	
	if(month.equals("January") || month.equals("February") || month.equals("December")){
			System.out.println("Your birth season is Winter");
	}else if(month.equals("March") || month.equals("April") || month.equals("May")){
		System.out.println("Your birth season is Spring");
	}else if(month.equals("June") || month.equals("July") || month.equals("August")){
		System.out.println("Your birth season is Summer");
	}else if(month.equals("September") || month.equals("October") || month.equals("November")){
		System.out.println("Your birth season is Fall");
	}
	}

}
