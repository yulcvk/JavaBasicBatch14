package com.syntax.class05;

public class LogicalAND {

	public static void main(String[] args) {
		
		boolean understandJava=false;
		boolean enjoyJava=true;
		boolean practice=true;
		
		
		if(understandJava && enjoyJava && practice) {
			System.out.println("This is awesome");
			
		}
		
		System.out.println("    another example    ");
		
		int n1=100;
		int n2=200;
		int n3=300;
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" is the largest number");
			
		} else if(n2>n3 && n2>n1) {
			System.out.println(n2+" is the largest number");
			
		} else if(n3>n1 &&n3>n2) {
			System.out.println(n3+" is the largest number");
			
		}

	}

}
