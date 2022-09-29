package com.syntax.review4;

import java.util.Scanner;

public class forLoopDemo5 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int input=scanner.nextInt();
		
		for(int i=0;i<input*2;i++) {
			System.out.print(i+" ");
		}
	}

}
