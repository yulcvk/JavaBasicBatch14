package com.syntax.class07;

import java.util.Scanner;

public class DoWhileLoop2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String answer;
		do {
		
		System.out.println("Did you get a job");
		answer=scanner.nextLine();
		
		}while(!answer.contentEquals("yes"));
		System.out.println("Congrats");
	}

}
