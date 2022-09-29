package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName="Olena";
		String lastName="Dudka";
		
		System.out.println(firstName+" "+lastName);//Mostly this one is used
		System.out.println(firstName.concat(" ").concat(lastName));
		
		String str=" ";
		System.out.println(str.isEmpty());
		//System.out.println(str.isBlank());// can be used without error showing only after Java 11 version
		
	}

}
