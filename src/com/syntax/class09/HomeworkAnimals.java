package com.syntax.class09;

public class HomeworkAnimals {

	public static void main(String[] args) {
		
		String[] animals= {"wolf","elephant","horse","bear","dog"};
		for(String name:animals)
		System.out.println(name+" ");
		
		System.out.println("---------------------------");
		
		for(int a=0;a<animals.length;a++) {
			System.out.println(animals[a]+" ");
		}
	}

}
