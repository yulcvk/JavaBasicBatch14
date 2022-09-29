package com.syntax.class08;

public class TaskLoops {

	public static void main(String[] args) {
		
		int sumOdd=0;
		int sumEven=0;
	
		for(int i=0;i<=50;i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;			
				
			}
		}
		System.out.println("The sum of odd numbers= "+ sumOdd);
		System.out.println("The sum of even numbers= "+ sumEven);
	}
	
	

}
