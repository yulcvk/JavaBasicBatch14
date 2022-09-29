package com.syntax.class08;

public class HomeworkForClass7 {

	public static void main(String[] args) {
		
		for(int i=20; i>=1; i-=2) {
			System.out.println(i+" ");
			
		}
		System.out.println();
		System.out.println("IF cond inside loop");
		
		for(int i=20;i>=1;i--) {
			if(i%2==0) {
				System.out.println(i+" ");
			}
		}
	}

}
