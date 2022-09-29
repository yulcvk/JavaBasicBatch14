package com.syntax.class08;

import java.util.Scanner;

public class HomeworkForClass7name {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		for(int i=1;i<=3;i++) {
			System.out.println("Please enter your name");
			String name=input.nextLine();
			
			System.out.println("Good afternoon" + name);
			System.out.println("--------------------");
		}

	}

}
