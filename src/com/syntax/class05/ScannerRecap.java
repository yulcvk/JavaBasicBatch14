package com.syntax.class05;

import java.util.Scanner;

public class ScannerRecap {
//cmd+shift+o
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name=input.next();
		System.out.println("Nice to meet you "+name);
		System.out.println("How old are you "+name);
		
		int age=input.nextInt();
		System.out.println(name+" is "+age+" years old");
		System.out.println("How much money you have "+name);
		double money=input.nextDouble();
		
		System.out.println(name+" has $"+money);
		System.out.println(name+" what is your grade?");
		char grade=input.next().charAt(0);
		System.out.println(name+" has grade "+grade);
		System.out.println("Please enter another name");
		name=input.next();
		System.out.println("Another name is "+name);
		
		
		
		System.out.println("End");

	}

}
