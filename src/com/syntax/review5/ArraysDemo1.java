package com.syntax.review5;

import java.util.Arrays;

public class ArraysDemo1 {

	public static void main(String[] args) {
		String [] dresses=new String[] {"Pink Dress","cocktail","Summer dress","Night dress","Pencil dress"};
		System.out.println(dresses.length);
		for(int i=0;i<dresses.length;i++) {
			System.out.println("Let's try "+dresses[i]);
		}
		for(String dress:dresses) {
			System.out.println(dress);
		}
		System.out.println(Arrays.toString(dresses));
	}

}
