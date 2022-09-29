package com.syntax.ProjectrReview;

public class Task4 {

	public static void main(String[] args) {
		
		int[][] arr= {
				{10,9,10,20},{23,30,54},{21,30}
		};
		
		
		for(int[] ar:arr) {
			for (int num:ar) {
				if(num%2==0) {
					System.out.println(num);
				}
			}
		}
	}

}
