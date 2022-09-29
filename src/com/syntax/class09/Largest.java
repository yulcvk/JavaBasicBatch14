package com.syntax.class09;

public class Largest {

	public static void main(String[] args) {
		
		int[] num= {25,46,78,8,77};
		int largest=num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]>largest) largest=num[i];
		
		}
		System.out.println(largest);
		
		System.out.println("--------------------");
		
		largest=num[0];
		for(int n:num) {
			if(n>largest) {
				largest=n;
			}
		}
			System.out.println(largest);
	}

}
