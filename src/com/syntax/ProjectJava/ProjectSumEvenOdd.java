package com.syntax.ProjectJava;

public class ProjectSumEvenOdd {

	public static void main(String[] args) {
		
		int[][] a= {
				{10,20,30,40},
				{10,20,30,40},
				{5,10,15,20}
				
		};
		
		int evenSum=0;
		int oddSum=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if((a[i][j]%2)==0) 
			
				evenSum+=a[i][j];
				else
					oddSum+=a[i][j];
				}
			}
			System.out.println("The sum of even numbers is "+evenSum);
			System.out.println("The sum of odd numbers is "+oddSum);
			
			
	}
}
		
	


