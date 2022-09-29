package com.syntax.class12;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter mom's name");
		String mom=scanner.next();
		System.out.println("Please enter dad's name");
		String dad=scanner.next();
		System.out.println("Are you expecting boy or girl");
		String gender=scanner.next();
		
		if(gender.equals("girl")) {
			System.out.println(mom.substring(0,mom.length()/2)+dad.substring(dad.length()/2)+" would be a beautiful name");
			
		}else {
			System.out.println(dad.substring(0,dad.length()/2)+mom.substring(mom.length()/2)+" is a great name");
		}
	}

}
