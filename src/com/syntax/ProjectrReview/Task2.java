package com.syntax.ProjectrReview;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);

		System.out.println("Please enter number of countries");
			int size=scanner.nextInt();
		String[] countries=new String[size];
		String[] capitals=new String[size];
		scanner.nextLine();//consume extra enter from line 13
		for(int i=0;i<size;i++) {
			System.out.println("Please enter the country name");
			countries[i]=scanner.nextLine();
			
			System.out.println("Please enter the capital name for "+countries[i]);
			capitals[i]=scanner.nextLine();
		}
		System.out.println(Arrays.toString(countries));
		System.out.println(Arrays.toString(capitals));
	}

}
