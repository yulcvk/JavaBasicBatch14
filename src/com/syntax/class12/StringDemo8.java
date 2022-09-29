package com.syntax.class12;

public class StringDemo8 {

	public static void main(String[] args) {
		
		String str="Batch 14 is good   1234555^&*$#% AAAAAA dkfjsldkfj";
		System.out.println(str.replace("good", "excellent"));
		System.out.println(str.replaceAll("[a-z]", "#"));
			
	}

}
