package com.syntax.ProjectrReview;

import java.util.Arrays;
import java.util.Scanner;

public class TaskScannerSumAll {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int size=scanner.nextInt();//take value from user
		
		int[] arr=new int[size];//create an array of the above size
		
		for(int i=0;i<size;i++) {
			System.out.println("Please enter an int number");
			arr[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int n:arr) {
			sum+=n;
		}
		System.out.println("Sum of all the elements in array "+sum);
	}

}
