package com.syntax.review4;

public class forLoopDemo3 {

	public static void main(String[] args) {
		
		//1 3 7 9
		for(int i=1;i<=9;i+=2) {
			if (i==5){
				continue;
			}
			System.out.println(i);
		}

	}

}
