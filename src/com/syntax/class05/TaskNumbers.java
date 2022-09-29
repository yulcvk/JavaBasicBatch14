package com.syntax.class05;

import java.util.Scanner;

public class TaskNumbers {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scanner.nextInt();
        
        if((num>=0) && (num<=10)) {
        	System.out.println("The number is small");
        }else if((num>10) && (num<=100)) {
        	System.out.println("The number is medium");
        }
        else
        {
        	System.out.println("The number is big");
        }
        	
	}

}
