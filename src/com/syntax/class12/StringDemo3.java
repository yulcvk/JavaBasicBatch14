package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str="  i love java  ";
		
		System.out.println(str);
		//remove the spaces before and after but NOT the ones in between
		System.out.println(str.trim());
		
		String str2="Java is Very easy";
		
		//checks if String starts with specific letter or word
		System.out.println(str2.startsWith("java"));
		//checks if String ends with specific letter or word
		System.out.println(str2.endsWith("y"));
		//checks if a String ends with a specific letter or word. we can also use chain method on a single line one method after another
		System.out.println(str2.toLowerCase().contains("very"));
	}

}
