package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard5 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
System.out.println("Did you solve any problems on Repl tasks please answer True or False?");
boolean solvedAnyRepls=scanner.nextBoolean();

if(solvedAnyRepls)
{
	System.out.println("How many Repls you solved?");
	int noOfReplsSolved=scanner.nextInt();
	
	if(noOfReplsSolved>=17)
	{
		System.out.println("You are doing great");
	}else if(noOfReplsSolved>10) {
		System.out.println(" You are doing OK. Please complete ASAP");
	}else {
		System.out.println("You should solve more");
	}
}
else
{
	System.out.println("They are very important to learn Java please solve them");
}
	}

}
