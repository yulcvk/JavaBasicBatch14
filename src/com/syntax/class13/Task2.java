package com.syntax.class13;

public class Task2 {

	public static void main(String[] args) {
		
		String name1="dafsgFFGHG$%%^6788";
		String name2=name1.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(name2.length());

	}

}
