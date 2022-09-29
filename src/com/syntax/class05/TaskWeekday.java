package com.syntax.class05;

import java.util.Scanner;

public class TaskWeekday {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter day");
		int day=scanner.nextInt();
		
		if((day>0) && (day<=5)){
			System.out.println("It is a weekday");
		} else if((day>5) && (day<8)) {
			System.out.println("It is a weekend");
			}else {
				System.out.println("Invalid day");
			}
		
		
			
			

	}

}
