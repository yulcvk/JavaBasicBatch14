package com.syntax.class06;

public class Storing {

	public static void main(String[] args) {
		
		int n1=15;
		int n2=267;
		int n3=45;
		int largest=0;
		
		if(n1>n2 && n1>n3) {
			largest = n1;
		}else if (n2>n3 && n2>n1) {
			largest = n2;
		}else if (n3>n1 && n3>n2) {
			largest = n3;
			
		}
		System.out.println(largest+" is the largest number");
		
		if(largest%2==0) {
			System.out.println(largest+" is even number");
		}else {
			System.out.println(largest+" is odd number");
		}
	}

}
