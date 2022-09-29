package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkDmw {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("How old are you?");
		int age=scanner.nextInt();
		
		if(age>=18) {
			System.out.println("We will issue your driving license");
		}
		else
		{
			System.out.println("Please get your learner's permit");
		}

	}

}
