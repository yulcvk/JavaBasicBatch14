package com.syntax.class12;

import java.util.Scanner;

public class StringDemo7 {

	public static void main(String[] args) {
		
		
		
		
		String str="I am always confused";
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		//substring() gives you smaller string from a String. we put index and it returns us the result starting from this point( index)
		System.out.println(str.substring(5));
		
		System.out.println(str.substring(5,11));//part of the string between index 5 and 11
		
		
	}

}
