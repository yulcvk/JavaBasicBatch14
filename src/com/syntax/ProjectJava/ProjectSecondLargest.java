package com.syntax.ProjectJava;

public class ProjectSecondLargest {

	public static void main(String[] args) {
		
		
			
			int[] num= {25,46,78,8,3};
			int largest=num [0];
			int second=num[0];
			
			for(int i=0;i<num.length;i++) {
				if(num[i]>largest) {
					second=largest;
					largest=num[i];
					
				}else if(num[i]>second) {
						second=num[i];
					}
			}
			System.out.println(second);
			
			

	}

}
