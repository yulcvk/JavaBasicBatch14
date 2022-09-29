package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String str="Shah";
		String str2="Shah";
		String str3=new String("Shah");
		
		if(str.equals("shah")) {
			System.out.println("I found it");
			//equals checks if 2 Strings are exactly the same
				
		}
		//equalsIgnoreCase checks if 2 Strings are exactly the same BUT does not care anout the case of letters
		if(str.equalsIgnoreCase("shah")) {
			System.out.println("I found it with equalsIgnoreCase");
	}

}
}