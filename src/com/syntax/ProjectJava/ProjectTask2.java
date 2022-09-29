package com.syntax.ProjectJava;

import java.util.Scanner;

public class ProjectTask2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  
		System.out.print("Please enter the number of countries: ");   
		int length=input.nextInt();
		
		String[] countries = new String [length];   
		String[] capitals=new String[length];
		
		for (int i = 0; i < length; i++)   {
			System.out.println("Enter the country "+(i+1));
			countries[i]=input.next();
			System.out.println("Enter the capital "+(i+1));
			capitals[i]=input.next();
		}
		System.out.println("Countries and capitals: ");
		
		for(int i=0;i<length;i++) {
			System.out.println("Capital city of "+(countries[i])+" is "+(capitals[i]));
		
		
		
		}  
		}  
		}  
