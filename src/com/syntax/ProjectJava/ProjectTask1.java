package com.syntax.ProjectJava;

import java.util.Scanner;

public class ProjectTask1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		int[] num=new int[4];
		System.out.println("Please enter your 4 numbers");
		
		for(int n:num) {
			int a=scanner.nextInt();
		
			sum+=a;
			
		}
		System.out.println("The sum of the numbers is "+sum);
	}

}
