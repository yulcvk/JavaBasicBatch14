package com.syntax.review2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
System.out.println("Please enter your age");
		
		int age=scanner.nextInt();
		
		System.out.println("Please enter your name");
		scanner.nextLine();
		
		String name=scanner.nextLine();
		
		System.out.println(name+" is "+age+" years old");
		

	}

}
