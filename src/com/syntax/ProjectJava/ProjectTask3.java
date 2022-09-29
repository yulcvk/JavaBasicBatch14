package com.syntax.ProjectJava;

public class ProjectTask3 {

	public static void main(String[] args) {
		
		int[][] a= {
				{10,20,30,50},
				{10,20,30,40},
				{5,10,15,20}
				
		};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum+=a[i][j];
			}
			}
		System.out.println(sum+" ");
	
		
}
	}
	



