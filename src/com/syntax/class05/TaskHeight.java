package com.syntax.class05;

import java.util.Scanner;

public class TaskHeight {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your height");
		int aaa=scanner.nextInt();
		
		if(aaa<60) {
			System.out.println("You are short");
		} else if(aaa>=60 && aaa<=72) {
			System.out.println("You are medium");
			}
		
		else if(aaa>72) {
			System.out.println("You are tall");
			}
	
		}
		
	}


