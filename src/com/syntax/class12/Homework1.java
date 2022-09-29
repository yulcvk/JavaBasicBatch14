package com.syntax.class12;

public class Homework1 {

	public static void main(String[] args) {
		
		String name="Halloween";
		
		if(!name.isEmpty()) {
			if(name.length()%2!=0 && name.length()>=3 ) {
				System.out.println(name.charAt(name.length()/2));
			}else {
				System.out.println("Number of letters is not odd");
			}
		}
	}

}
