package com.syntax.class06;

import java.util.Scanner;

public class TaskScore {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your scores");
 int quiz=scanner.nextInt();
 int mid=scanner.nextInt();
 int fin=scanner.nextInt();
 
 int average=((quiz+mid+fin)/3);
 
 String score;
 
 if(average>=90) {
	 score="grade A";}
	 
	 else if(average>=70 && average<90) {
			 score="grade B";}
			 else if(average>=50 && average<70) {
				 score="grade C";}
				 else if(average<50){
					score="grade D";
				 }else {
					 System.out.println("Please enter valid score");
						score="None";	
				}
			 
			 System.out.println(score); 
			 
 
	}
 
	}
