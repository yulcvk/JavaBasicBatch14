package com.syntax.ProjectrReview;

public class Task8 {

	public static void main(String[] args) {
		
		int previous=0;
		int current=1;
		int next=0;
		System.out.print(previous+" ");
		System.out.print(current+" ");
		for(int i=0;i<8;i++) {
			next=previous+current;
			System.out.print(next+" ");
			previous=current;
			current=next;
		}
		
		

	}

}
