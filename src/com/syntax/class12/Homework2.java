package com.syntax.class12;

public class Homework2 {

	public static void main(String[] args) {
		
		String name="Hello beautiful people";
		
		for(int i=name.length()-1;i>=0;i--) {
		
		System.out.print(name.charAt(i));

	}
		// OR THIS WAY
		char[] charArr=name.toCharArray();
		for(int i=charArr.length-1;i>=0;i--) {
			System.out.print(charArr[i]);
		}
	}
}
