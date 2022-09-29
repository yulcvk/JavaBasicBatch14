package com.syntax.ProjectJava;

public class ProjectEven {

	public static void main(String[] args) {
		
		int [][] a= {
				{8,20,3,50},
				{5,24,10,40}
				
				
		};
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			
				if((a[i][j]%2)==0) {
		
		System.out.print(a[i][j]+" ");
		
}
			}
		}
		}
	}

