package com.syntax.class13;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str="sdsdsdjDFGHHGF89475!@#$^";
		System.out.println(str.replaceAll("[0-9]", "@"));//replace all the numbers with symbol @
		System.out.println(str.replaceAll("[0-9]", ""));//remove all numbers from 0=9
		System.out.println(str.replaceAll("[s]", "?"));//remove letter s
		System.out.println(str.replaceAll("[a-z]", "?"));//replace all lowercase letters with ?
		System.out.println(str.replaceAll("[A-Z]", "?"));//replace all uppercase letters with ?
		System.out.println(str.replaceAll("[^A-Z]", ""));//remove everything EXCEPT uppercase letters from A-Z
		System.out.println(str.replaceAll("[^a-z]", ""));
		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));//remove everything EXCEPT letters and numbers ; ^ means except
	}

}
